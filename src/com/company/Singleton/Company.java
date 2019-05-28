package com.company.Singleton;

import java.util.ArrayList;
import java.util.List;

/**
 * 公司
 */
public class Company {
    private List<Staff> allStaffs = new ArrayList<>();

    public void addStaff(Staff staff) {
        allStaffs.add(staff);
    }

    public void showAllStaffs() {
        for (Staff staff : allStaffs) {
            System.out.println("Obj: " + staff.toString());
        }
    }

}
