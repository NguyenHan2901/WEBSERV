/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpt.service;

import com.fpt.entity.Employee;
import com.fpt.session.EmployeeFacadeLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.jws.Oneway;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author badan
 */
@WebService(serviceName = "EmployeeWebService")
public class EmployeeWebService {

    @EJB
    private EmployeeFacadeLocal ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Web Service Operation")

    @WebMethod(operationName = "create")
    @Oneway
    public void create(@WebParam(name = "employee") Employee employee) {
        ejbRef.create(employee);
    }

    @WebMethod(operationName = "edit")
    @Oneway
    public void edit(@WebParam(name = "employee") Employee employee) {
        ejbRef.edit(employee);
    }

    @WebMethod(operationName = "remove")
    @Oneway
    public void remove(@WebParam(name = "employee") Employee employee) {
        ejbRef.remove(employee);
    }

    @WebMethod(operationName = "find")
    public Employee find(@WebParam(name = "id") int id) {
        return ejbRef.find(id);
    }

    @WebMethod(operationName = "findAll")
    public List<Employee> findAll() {
        return ejbRef.findAll();
    }

    @WebMethod(operationName = "findRange")
    public List<Employee> findRange(@WebParam(name = "range") int[] range) {
        return ejbRef.findRange(range);
    }

    @WebMethod(operationName = "count")
    public int count() {
        return ejbRef.count();
    }
    
}
