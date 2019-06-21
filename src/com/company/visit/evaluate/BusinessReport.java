package com.company.visit.evaluate;

import java.util.LinkedList;
import java.util.List;


//员工业务报表类
public class BusinessReport {

    List<Staff> staffs = new LinkedList<Staff>();

    public BusinessReport() {
        staffs.add(new Manager("王经理"));
        staffs.add(new Engineer("工程师-Shawn.Xiong"));
        staffs.add(new Engineer("工程师-Kael"));
        staffs.add(new Engineer("工程师-Chaossss"));
        staffs.add(new Engineer("工程师-Tiiime"));
    }

    public void showReport(Visitor visitor) {
        for (Staff staff : staffs) {
            staff.accept(visitor);
        }
    }
}
