package com.kooki.empolyee.controller;

import com.kooki.empolyee.model.vo.Employee;

public class EmployeeController {

    Employee ey = new Employee();

    public EmployeeController(){}

    public void add(int empNo, String name, char gender, String phone){
        ey = new Employee(empNo,name,gender,phone);
    }

    public void add(int empNo, String name, char gender, String phone,String dept, int salary, double bonus){
        ey = new Employee(empNo,name,gender,phone,dept,salary,bonus);
    }

    public void modify(String phone){
        ey.setPhone(phone);
    }

    public void modify(int salary){
        ey.setSalary(salary);
    }

    public void modify(double bonus){
        ey.setBonus(bonus);
    }

    public Employee remove(){
        Employee temp = ey;
        ey=new Employee();
        return temp;


//        return ey = null;
    }

    public String inform(){
        if(ey == null)
            return null;
        else
            return ey.printEmployee();
    }


}
