package com.qtech.it.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "printer_scrap", schema = "qtech")
public class UserFive implements Serializable {

    @Id
    @GeneratedValue
    @Excel(name = "编号")
    private long id;

    @Excel(name = "打印机型号")
    private String printer_model;

    @Excel(name = "打印机编码")
    private String printer_number;

    @Excel(name = "登记日期")
    private String register_date;

    @Excel(name = "送修人员")
    private String register_user;

    @Excel(name = "报废原因")
    private String reasen;

    @Excel(name = "备注")
    private String remark;


    // 无参 构造方法
    public UserFive() {
    }

    // 有参 构造方法
    public UserFive(long id, String printer_model, String printer_number, String register_date, String register_user, String reasen, String remark) {
        this.id = id;
        this.printer_model = printer_model;
        this.printer_number = printer_number;
        this.register_date = register_date;
        this.register_user = register_user;
        this.reasen = reasen;
        this.remark = remark;
    }

    // getter 和 setter 的方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPrinter_model() {
        return printer_model;
    }

    public void setPrinter_model(String printer_model) {
        this.printer_model = printer_model;
    }

    public String getPrinter_number() {
        return printer_number;
    }

    public void setPrinter_number(String printer_number) {
        this.printer_number = printer_number;
    }

    public String getRegister_date() {
        return register_date;
    }

    public void setRegister_date(String register_date) {
        this.register_date = register_date;
    }

    public String getRegister_user() {
        return register_user;
    }

    public void setRegister_user(String register_user) {
        this.register_user = register_user;
    }

    public String getReasen() {
        return reasen;
    }

    public void setReasen(String reasen) {
        this.reasen = reasen;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    // 重写方法
    @Override
    public String toString() {
        return "UserFive{" +
                "id=" + id +
                ", printer_model='" + printer_model + '\'' +
                ", printer_number='" + printer_number + '\'' +
                ", register_date='" + register_date + '\'' +
                ", register_user='" + register_user + '\'' +
                ", reasen='" + reasen + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
