package com.orderdealwith.pojo;

import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.metadata.BaseRowModel;

public class OrderInformation extends BaseRowModel{
    private Integer id;
    @ExcelProperty(index=0, value="orderId")
    private Integer orderId;
    @ExcelProperty(index=1, value="userName")
    private String userName;
    @ExcelProperty(index=2, value="userAddress")
    private String userAddress;
    @ExcelProperty(index=3, value="userId")
    private Integer userId;
    @ExcelProperty(index=4, value="orderDetailId")
    private Integer orderDetailId;
    @ExcelProperty(index=5, value="goodName")
    private String goodName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(Integer orderDetailId) {
        this.orderDetailId = orderDetailId;
    }

    public String getGoodName() {
        return goodName;
    }

    public void setGoodName(String goodName) {
        this.goodName = goodName;
    }

    @Override
    public String toString() {
        return "OrderInformation{" +
                "id=" + id +
                ", orderId=" + orderId +
                ", userName='" + userName + '\'' +
                ", userAddress='" + userAddress + '\'' +
                ", userId=" + userId +
                ", orderDetailId=" + orderDetailId +
                ", goodName='" + goodName + '\'' +
                '}';
    }
}
