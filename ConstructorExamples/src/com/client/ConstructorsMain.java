package com.client;

import com.pojo.Employee;

public class ConstructorsMain {

    public static void main(String[] args) {

        //cannot access Employee since it is default and this is different package
        // make it public to access
        //Employee emp = new Employee();
        
        Employee emp = new Employee();
    }

}
