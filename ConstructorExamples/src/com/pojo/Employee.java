package com.pojo;

/**
 * Classes can only be public, abstract and final. Can be tested by adding any
 * other modifier and you will get compile error.
 *
 */
public class Employee extends Person{
    
    private String name;

    // constructors cannot be final,static or abstract
    // below code would give compile error
//    public abstract Employee() {
//        
//    }
    
    public Employee() {
        
    }
        
    // constructors cannot be inherited and overriden
    // so in below code you cannot inherit Person constructor even though the class extends Person class
//    public Person() {
//        
//    }
    
    public Employee(String name) {
        //call constructor of the same class using this
        this();
        // you can have either this or super no both, below code gives error
        //super();
        this.name = name;
        // this should be the first statement in the constructor
        //this();
    }

    public void displayName() {
        // protected constructor so instance cannot be created
        // only in subclasses
        Person person = new Person();
        person.setName("Roy");
        System.out.println(person.getName());
        
    }
}
