package com.shoppingwebapp.DTO;

import java.sql.Date;

public class OrderInfoDTO {
    private Integer id;
    private String username;
    private Date order_date;
    private String payment_method;
    private Integer total_amount;
    private Integer order_item_id;
    private Integer price;
    private Integer product_detail_id;
    private String name;
    private String name2;

    public OrderInfoDTO(Integer id, String username, Date order_date, String payment_method, Integer total_amount, Integer order_item_id, Integer price,Integer product_detail_id, String name, String name2) {
        this.id = id;
        this.username = username;
        this.order_date = order_date;
        this.payment_method = payment_method;
        this.total_amount = total_amount;
        this.order_item_id = order_item_id;
        this.price = price;
        this.product_detail_id = product_detail_id;
        this.name = name;
        this.name2 = name2;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public String getPayment_method() {
        return payment_method;
    }

    public void setPayment_method(String payment_method) {
        this.payment_method = payment_method;
    }

    public Integer getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(Integer total_amount) {
        this.total_amount = total_amount;
    }

    public Integer getOrder_item_id() {
        return order_item_id;
    }

    public void setOrder_item_id(Integer order_item_id) {
        this.order_item_id = order_item_id;
    }

    public Integer getProduct_detail_id() {
        return product_detail_id;
    }

    public void setProduct_detail_id(Integer product_detail_id) {
        this.product_detail_id = product_detail_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
