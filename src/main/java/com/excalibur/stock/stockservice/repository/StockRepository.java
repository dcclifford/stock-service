package com.excalibur.stock.stockservice.repository;

import com.excalibur.stock.stockservice.model.Stock;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

@Repository
public interface StockRepository {
    /**
     *
     */
    JdbcTemplate jdbcTemplate;

    StockRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    class EmployeeRowMapper implements RowMapper < Stock > {
        @Override
        public Stock mapRow(ResultSet rs, int rowNum) throws SQLException {
            Stock stock = new Stock();
            //stock.setId(rs.getLong("id"));
            stock.setTicker(rs.getString("ticker"));
            stock.setCompany_name(rs.getString("company_name"));
            //stock.setEmailId(rs.getString("email_address"));
            return stock;
        }
    }


    public List < Stock > findAll() {
        return jdbcTemplate.query("select * from stocks", new EmployeeRowMapper());
    }

    public Optional < Stock > findById(long id) {
        return Optional.of(jdbcTemplate.queryForObject("select * from stocks where id=?", new Object[] {
                        id
                },
                new BeanPropertyRowMapper < Stock > (Stock.class)));
    }

    public int deleteById(long id) {
        return jdbcTemplate.update("delete from employees where id=?", new Object[] {
                id
        });
    }

    public int insert(Stock stock) {
        return jdbcTemplate.update("insert into employees (id, ticker, company_name) " + "values(?, ?, ?)",
                new Object[] {
                        stock.getId(), stock.getTicker(), stock.getCompany_name()
                });
    }

    public int update(Stock stock) {
        return jdbcTemplate.update("update stocks " + " set ticker = ?, company_name = ?" + " where id = ?",
                new Object[] {
                        stock.getTicker(), stock.getCompany_name()
                });
    }
}