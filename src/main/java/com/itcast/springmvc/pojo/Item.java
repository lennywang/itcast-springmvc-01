package com.itcast.springmvc.pojo;

import java.util.Date;

/**
 *
 **/
public class Item {

    private Integer id;

    private String name;

    private Float price;

    private String pic;

    private Date datetime;

    private String detail;

    public Item(Integer id, String name, Float price,Date datetime, String detail) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.datetime = datetime;
        this.detail = detail;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getDatetime() {
        return datetime;
    }

    public void setDatetime(Date datetime) {
        this.datetime = datetime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
