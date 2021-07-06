package com.qtech.it.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "phone_register", schema = "qtech")
public class UserSeven implements Serializable {

    @Id
    @GeneratedValue
    @Excel(name = "编号")
    private long id;

    @Excel(name = "登记日期")
    private String register_date;

    @Excel(name = "使用人员")
    private String user_name;

    @Excel(name = "分机号码")
    private String phone_number;

    @Excel(name = "职位")
    private String user_job;

    @Excel(name = "制作人员")
    private String producters;


    // 无参 构造方法
    public UserSeven() {
    }

    // 有参 构造方法
    public UserSeven(long id, String register_date, String user_name, String phone_number, String user_job, String producters) {
        this.id = id;
        this.register_date = register_date;
        this.user_name = user_name;
        this.phone_number = phone_number;
        this.user_job = user_job;
        this.producters = producters;
    }

    // getter 和 setter 的方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getUser_job() {
        return user_job;
    }

    public void setUser_job(String user_job) {
        this.user_job = user_job;
    }

    public String getProducters() {
        return producters;
    }

    public void setProducters(String producters) {
        this.producters = producters;
    }

    // 重写方法
    @Override
    public String toString() {
        return "UserSeven{" +
                "id=" + id +
                ", register_date='" + register_date + '\'' +
                ", user_name='" + user_name + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", user_job='" + user_job + '\'' +
                ", producters='" + producters + '\'' +
                '}';
    }
}
