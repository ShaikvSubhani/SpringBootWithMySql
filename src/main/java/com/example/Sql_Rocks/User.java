package com.example.Sql_Rocks;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // so that hibernate can identify whose attribute to pick for table creation
@Table(name="user_info") //this is just for giving table name , by default table name is same as class name
public class User {

    @Id  //it is written on the attribute which has to become private key
    private int id;

    private String name;
    private String age;

    private String mobileNumber;

    //always create the constructor
    public User()
    {

    }

    //all args constructor
    public User(int id, String name, String age,String mobileNumber) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobileNumber=mobileNumber;
    }

    //creating getters and setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
