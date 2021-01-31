package com.excalibur.stock.stockservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.DateTimeException;
import java.util.Date;

@Entity
public class Stock {

    @Id
    @GeneratedValue(strategy= GenerationType.TABLE)

    private Integer id;
    private String ticker;
    private String company_name;
    private String this_status;
    private String this_type;
    private Date buy_date;
    private double buy_price;
    private double net_change;
    private double net_percent_change;
    private double this_price;
    private double this_change;
    private double this_percent_change;
    private double trailing_stop_long;
    private double stop_loss_long;private int three_percent_alert;
    private Integer five_percent_alert;
    private Integer seven_percent_alert;
    private Integer ten_percent_alert;
    private double sell_price;
    private Date sell_date;
    private String sector;
    private Integer shares;
    private Integer days_held;
    private Date ModifiedTime;

    public Stock() {
    }

    public Stock(String ticker, String company_name) {
        this.ticker = ticker;
        this.company_name = company_name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getThis_status() {
        return this_status;
    }

    public void setThis_status(String this_status) {
        this.this_status = this_status;
    }

    public String getThis_type() {
        return this_type;
    }

    public void setThis_type(String this_type) {
        this.this_type = this_type;
    }

    public Date getBuy_date() {
        return buy_date;
    }

    public void setBuy_date(Date buy_date) {
        this.buy_date = buy_date;
    }

    public double getBuy_price() {
        return buy_price;
    }

    public void setBuy_price(double buy_price) {
        this.buy_price = buy_price;
    }

    public double getNet_change() {
        return net_change;
    }

    public void setNet_change(double net_change) {
        this.net_change = net_change;
    }

    public double getNet_percent_change() {
        return net_percent_change;
    }

    public void setNet_percent_change(double net_percent_change) {
        this.net_percent_change = net_percent_change;
    }

    public double getThis_price() {
        return this_price;
    }

    public void setThis_price(double this_price) {
        this.this_price = this_price;
    }

    public double getThis_change() {
        return this_change;
    }

    public void setThis_change(double this_change) {
        this.this_change = this_change;
    }

    public double getThis_percent_change() {
        return this_percent_change;
    }

    public void setThis_percent_change(double this_percent_change) {
        this.this_percent_change = this_percent_change;
    }

    public double getTrailing_stop_long() {
        return trailing_stop_long;
    }

    public void setTrailing_stop_long(double trailing_stop_long) {
        this.trailing_stop_long = trailing_stop_long;
    }

    public double getStop_loss_long() {
        return stop_loss_long;
    }

    public void setStop_loss_long(double stop_loss_long) {
        this.stop_loss_long = stop_loss_long;
    }

    public int getThree_percent_alert() {
        return three_percent_alert;
    }

    public void setThree_percent_alert(int three_percent_alert) {
        this.three_percent_alert = three_percent_alert;
    }

    public Integer getFive_percent_alert() {
        return five_percent_alert;
    }

    public void setFive_percent_alert(Integer five_percent_alert) {
        this.five_percent_alert = five_percent_alert;
    }

    public Integer getSeven_percent_alert() {
        return seven_percent_alert;
    }

    public void setSeven_percent_alert(Integer seven_percent_alert) {
        this.seven_percent_alert = seven_percent_alert;
    }

    public Integer getTen_percent_alert() {
        return ten_percent_alert;
    }

    public void setTen_percent_alert(Integer ten_percent_alert) {
        this.ten_percent_alert = ten_percent_alert;
    }

    public double getSell_price() {
        return sell_price;
    }

    public void setSell_price(double sell_price) {
        this.sell_price = sell_price;
    }

    public Date getSell_date() {
        return sell_date;
    }

    public void setSell_date(Date sell_date) {
        this.sell_date = sell_date;
    }

    public String getSector() {
        return sector;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public Integer getShares() {
        return shares;
    }

    public void setShares(Integer shares) {
        this.shares = shares;
    }

    public Integer getDays_held() {
        return days_held;
    }

    public void setDays_held(Integer days_held) {
        this.days_held = days_held;
    }

    public Date getModifiedTime() {
        return ModifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        ModifiedTime = modifiedTime;
    }
}
