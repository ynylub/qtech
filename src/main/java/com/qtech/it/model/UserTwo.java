package com.qtech.it.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "user_two", schema = "qtech")
public class UserTwo implements Serializable {

    @Id
    @GeneratedValue
    @Excel(name = "编号")
    private long id;

    @Excel(name = "送修日期")
    private String repair_date;

    @Excel(name = "当前时间")
    private String local_time;

    @Excel(name = "所在部门")
    private String department;

    @Excel(name = "送修人员")
    private String repair_user;

    @Excel(name = "送修人电话")
    private String repair_phone;

    @Excel(name = "送修物品")
    private String repair_goods;

    @Excel(name = "送修数量")
    private String repair_number;

    @Excel(name = "故障问题")
    private String problem;

    @Excel(name = "送修备注")
    private String remarks;

    @Excel(name = "领取人员")
    private String receive_user;

    @Excel(name = "领取人电话")
    private String receive_phone;

    @Excel(name = "领取日期")
    private String receive_date;

    @Excel(name = "领取备注")
    private String remarks2;

    // 无参 构造方法
    public UserTwo() {
    }

    // 有参 构造方法
    public UserTwo(long id, String repair_date, String local_time, String department, String repair_user, String repair_phone, String repair_goods, String repair_number, String problem, String remarks, String receive_user, String receive_phone, String receive_date, String remarks2) {
        this.id = id;
        this.repair_date = repair_date;
        this.local_time = local_time;
        this.department = department;
        this.repair_user = repair_user;
        this.repair_phone = repair_phone;
        this.repair_goods = repair_goods;
        this.repair_number = repair_number;
        this.problem = problem;
        this.remarks = remarks;
        this.receive_user = receive_user;
        this.receive_phone = receive_phone;
        this.receive_date = receive_date;
        this.remarks2 = remarks2;
    }

    // getter 和 setter 的方法

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getRepair_date() {
        return repair_date;
    }

    public void setRepair_date(String repair_date) {
        this.repair_date = repair_date;
    }

    public String getLocal_time() {
        return local_time;
    }

    public void setLocal_time(String local_time) {
        this.local_time = local_time;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getRepair_user() {
        return repair_user;
    }

    public void setRepair_user(String repair_user) {
        this.repair_user = repair_user;
    }

    public String getRepair_phone() {
        return repair_phone;
    }

    public void setRepair_phone(String repair_phone) {
        this.repair_phone = repair_phone;
    }

    public String getRepair_goods() {
        return repair_goods;
    }

    public void setRepair_goods(String repair_goods) {
        this.repair_goods = repair_goods;
    }

    public String getRepair_number() {
        return repair_number;
    }

    public void setRepair_number(String repair_number) {
        this.repair_number = repair_number;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getReceive_user() {
        return receive_user;
    }

    public void setReceive_user(String receive_user) {
        this.receive_user = receive_user;
    }

    public String getReceive_phone() {
        return receive_phone;
    }

    public void setReceive_phone(String receive_phone) {
        this.receive_phone = receive_phone;
    }

    public String getReceive_date() {
        return receive_date;
    }

    public void setReceive_date(String receive_date) {
        this.receive_date = receive_date;
    }

    public String getRemarks2() {
        return remarks2;
    }

    public void setRemarks2(String remarks2) {
        this.remarks2 = remarks2;
    }

    // 重写方法
    @Override
    public String toString() {
        return "UseOne{" +
                "id=" + id +
                ", repair_date='" + repair_date + '\'' +
                ", local_time='" + local_time + '\'' +
                ", department='" + department + '\'' +
                ", repair_user='" + repair_user + '\'' +
                ", repair_phone='" + repair_phone + '\'' +
                ", repair_goods='" + repair_goods + '\'' +
                ", repair_number='" + repair_number + '\'' +
                ", problem='" + problem + '\'' +
                ", remarks='" + remarks + '\'' +
                ", receive_user='" + receive_user + '\'' +
                ", receive_phone='" + receive_phone + '\'' +
                ", receive_date='" + receive_date + '\'' +
                ", remarks2='" + remarks2 + '\'' +
                '}';
    }
}
