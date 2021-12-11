
package com.csa.samplefullstack.entity;

import javax.persistence.*;


@Entity
@Table(name="tbl_employee")
public class Employee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_ID;
    private String name;
    private String department;
    private String location;
    
    public Employee(Long employee_ID, String name, String department, String location) {
        this.employee_ID = employee_ID;
        this.name = name;
        this.department = department;
        this.location = location;
    }

    public Employee(){                  // empty constructors just in case we want to initialize employee wher ewe dont enter any params.
        
    }
    
    public Long getEmployee_ID() {
        return employee_ID;
    }

    public void setEmployee_ID(Long employee_ID) {
        this.employee_ID = employee_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    
}
