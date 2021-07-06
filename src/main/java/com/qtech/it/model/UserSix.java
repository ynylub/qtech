package com.qtech.it.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "printer_first", schema = "qtech")
public class UserSix implements Serializable {

    @Id
    @GeneratedValue
    @Excel(name = "编号")
    private long id;

    @Excel(name = "打印机编号")
    private String printer_number;

    @Excel(name = "打印机品牌")
    private String printer_brand;

    @Excel(name = "打印机型号")
    private String printer_model;

    @Excel(name = "使用部门")
    private String department;

    @Excel(name = "使用区域")
    private String user_area;

    @Excel(name = "领取数量")
    private String user_number;

    @Excel(name = "负责人")
    private String user_name;

    @Excel(name = "负责人电话")
    private String user_phone;

    @Excel(name = "备注")
    private String remark;

    @Excel(name = "生产日期")
    private String production_date;

    @Excel(name = "领取日期")
    private String receive_date;


    // 无参 构造方法
    public UserSix() {
    }

    // 有参 构造方法
    public UserSix(long id, String printer_number, String printer_brand, String printer_model, String department, String user_area, String user_number, String user_name, String user_phone, String remark, String production_date, String receive_date) {
        this.id = id;
        this.printer_number = printer_number;
        this.printer_brand = printer_brand;
        this.printer_model = printer_model;
        this.department = department;
        this.user_area = user_area;
        this.user_number = user_number;
        this.user_name = user_name;
        this.user_phone = user_phone;
        this.remark = remark;
        this.production_date = production_date;
        this.receive_date = receive_date;
    }


    // getter 和 setter 的方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrinter_number() {
        return printer_number;
    }

    public void setPrinter_number(String printer_number) {
        this.printer_number = printer_number;
    }

    public String getPrinter_brand() {
        return printer_brand;
    }

    public void setPrinter_brand(String printer_brand) {
        this.printer_brand = printer_brand;
    }

    public String getPrinter_model() {
        return printer_model;
    }

    public void setPrinter_model(String printer_model) {
        this.printer_model = printer_model;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getUser_area() {
        return user_area;
    }

    public void setUser_area(String user_area) {
        this.user_area = user_area;
    }

    public String getUser_number() {
        return user_number;
    }

    public void setUser_number(String user_number) {
        this.user_number = user_number;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_phone() {
        return user_phone;
    }

    public void setUser_phone(String user_phone) {
        this.user_phone = user_phone;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getProduction_date() {
        return production_date;
    }

    public void setProduction_date(String production_date) {
        this.production_date = production_date;
    }

    public String getReceive_date() {
        return receive_date;
    }

    public void setReceive_date(String receive_date) {
        this.receive_date = receive_date;
    }

    // 重写方法
    @Override
    public String toString() {
        return "UserSix{" +
                "id=" + id +
                ", printer_number='" + printer_number + '\'' +
                ", printer_brand='" + printer_brand + '\'' +
                ", printer_model='" + printer_model + '\'' +
                ", department='" + department + '\'' +
                ", user_area='" + user_area + '\'' +
                ", user_number='" + user_number + '\'' +
                ", user_name='" + user_name + '\'' +
                ", user_phone='" + user_phone + '\'' +
                ", remark='" + remark + '\'' +
                ", production_date='" + production_date + '\'' +
                ", receive_date='" + receive_date + '\'' +
                '}';
    }
}
