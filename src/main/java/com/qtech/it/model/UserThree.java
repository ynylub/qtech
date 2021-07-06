package com.qtech.it.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "newpeople_install", schema = "qtech")
public class UserThree implements Serializable {

    @Id
    @GeneratedValue
    @Excel(name = "编号")
    private long id;

    @Excel(name = "登记日期")
    private String install_date;

    @Excel(name = "用户名")
    private String user_name;

    @Excel(name = "电脑型号")
    private String computer_model;

    @Excel(name = "SN#码")
    private String sn_code;

    @Excel(name = "安装人员")
    private String installers;

    @Excel(name = "打印机权限是否开通")
    private String printer_power;


    // 无参 构造方法
    public UserThree() {
    }

    // 有参 构造方法
    public UserThree(long id, String install_date, String user_name, String computer_model, String sn_code, String installers, String printer_power) {
        this.id = id;
        this.install_date = install_date;
        this.user_name = user_name;
        this.computer_model = computer_model;
        this.sn_code = sn_code;
        this.installers = installers;
        this.printer_power = printer_power;
    }


    // getter 和 setter 的方法
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstall_date() {
        return install_date;
    }

    public void setInstall_date(String install_date) {
        this.install_date = install_date;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getComputer_model() {
        return computer_model;
    }

    public void setComputer_model(String computer_model) {
        this.computer_model = computer_model;
    }

    public String getSn_code() {
        return sn_code;
    }

    public void setSn_code(String sn_code) {
        this.sn_code = sn_code;
    }

    public String getInstallers() {
        return installers;
    }

    public void setInstallers(String installers) {
        this.installers = installers;
    }

    public String getPrinter_power() {
        return printer_power;
    }

    public void setPrinter_power(String printer_power) {
        this.printer_power = printer_power;
    }

    // 重写方法
    @Override
    public String toString() {
        return "UserThree{" +
                "id=" + id +
                ", install_date='" + install_date + '\'' +
                ", user_name='" + user_name + '\'' +
                ", computer_model='" + computer_model + '\'' +
                ", sn_code='" + sn_code + '\'' +
                ", installers='" + installers + '\'' +
                ", printer_power='" + printer_power + '\'' +
                '}';
    }
}
