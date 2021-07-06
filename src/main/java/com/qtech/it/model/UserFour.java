package com.qtech.it.model;

import cn.afterturn.easypoi.excel.annotation.Excel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "printer_repair", schema = "qtech")
public class UserFour implements Serializable {

    @Id
    @GeneratedValue
    @Excel(name = "编号")
    private long id;

    @Excel(name = "登记日期")
    private String repair_date;

    @Excel(name = "打印机编号")
    private String printer_number;

    @Excel(name = "打印机型号")
    private String printer_model;

    @Excel(name = "异常现象")
    private String problem;

    @Excel(name = "更换配件")
    private String change_parts;

    @Excel(name = "维修人员")
    private String repair_user;


    // 无参 构造方法
    public UserFour() {
    }

    // 有参 构造方法
    public UserFour(long id, String repair_date, String printer_number, String printer_model, String problem, String change_parts, String repair_user) {
        this.id = id;
        this.repair_date = repair_date;
        this.printer_number = printer_number;
        this.printer_model = printer_model;
        this.problem = problem;
        this.change_parts = change_parts;
        this.repair_user = repair_user;
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

    public String getPrinter_number() {
        return printer_number;
    }

    public void setPrinter_number(String printer_number) {
        this.printer_number = printer_number;
    }

    public String getPrinter_model() {
        return printer_model;
    }

    public void setPrinter_model(String printer_model) {
        this.printer_model = printer_model;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getChange_parts() {
        return change_parts;
    }

    public void setChange_parts(String change_parts) {
        this.change_parts = change_parts;
    }

    public String getRepair_user() {
        return repair_user;
    }

    public void setRepair_user(String repair_user) {
        this.repair_user = repair_user;
    }

    // 重写方法
    @Override
    public String toString() {
        return "UserFour{" +
                "id=" + id +
                ", repair_date='" + repair_date + '\'' +
                ", printer_number='" + printer_number + '\'' +
                ", printer_model='" + printer_model + '\'' +
                ", problem='" + problem + '\'' +
                ", change_parts='" + change_parts + '\'' +
                ", repair_user='" + repair_user + '\'' +
                '}';
    }
}
