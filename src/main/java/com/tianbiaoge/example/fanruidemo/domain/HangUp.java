package com.tianbiaoge.example.fanruidemo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @Describe
 * 挂账的实体类，用于第三方公司和本公司挂账时添加的对象
 * 对象添加上限不超过 5次
 * 主要包含设计编号（主键，用于和项目对应）、挂账次数也就是对象添加的个数、每次挂账的实际金额，以及发票的三段信息
 * 等相关信息
 * @Author lc
 * @CreateTime 2017/11/23
 */
@Entity
public class HangUp {
    @Id
    @GeneratedValue
    private Integer id; //Id序号 自增的注解
    private String idProject;  //设计编号,因为设计编号是唯一的，所以作为联系其他表的外键
    private Integer hangUpTimes = 0;  //挂账次数，默认为0
    private double actualHangUpAmount = 0;   //实际挂账金额，默认值0
    private String invoiceNumber;    //发票号码
    private double invoiceAmount; //发票金额
    private Date invoiceTime; //发票时间（datetime		DEFAULT '2001-01-01',）

    private Date hangUpCreateTime;   //挂账创建时间（datetime 	DEFAULT CURRENT_TIMESTAMP,）
    private String userName;   //创建挂账的用户

    /**
     * @Describe 必须要有一个无参的构造方法
     */
    public HangUp(){
    }

    /**
     * @Describe 这个类里面各个变量的setter和getter方法
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    public Integer getHangUpTimes() {
        return hangUpTimes;
    }

    public void setHangUpTimes(Integer hangUpTimes) {
        this.hangUpTimes = hangUpTimes;
    }

    public double getActualHangUpAmount() {
        return actualHangUpAmount;
    }

    public void setActualHangUpAmount(double actualHangUpAmount) {
        this.actualHangUpAmount = actualHangUpAmount;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getInvoiceAmount() {
        return invoiceAmount;
    }

    public void setInvoiceAmount(double invoiceAmount) {
        this.invoiceAmount = invoiceAmount;
    }

    public Date getInvoiceTime() {
        return invoiceTime;
    }

    public void setInvoiceTime(Date invoiceTime) {
        this.invoiceTime = invoiceTime;
    }

    public Date getHangUpCreateTime() {
        return hangUpCreateTime;
    }

    public void setHangUpCreateTime(Date hangUpCreateTime) {
        this.hangUpCreateTime = hangUpCreateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}