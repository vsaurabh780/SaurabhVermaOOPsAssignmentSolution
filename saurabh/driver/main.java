package com.saurabh.driver;

import com.saurabh.service.AdminDepartment;
import com.saurabh.service.HrDepartment;
import com.saurabh.service.TechDepartment;

public class main {
	 public static void main(String args [])
	    {
	        
	        HrDepartment hr = new HrDepartment();
	        TechDepartment td = new TechDepartment();
	        AdminDepartment ad = new AdminDepartment();
	        ad.departmentName();
	        ad.getTodaysWork();
	        ad.getWorkDeadline();
	        ad.isTodayAHoliday();
	        System.out.println("\n");
	        hr.departmentName();
	        hr.doActivity();
	        hr.getTodaysWork();
	        hr.getWorkDeadline();
	        hr.isTodayAHoliday();
	        System.out.println("\n");
	        td.departmentName();
	        td.getTodaysWork();
	        td.getWorkDeadline();
	        td.getTechStackinformation();
	        td.isTodayAHoliday();
	    }
}
