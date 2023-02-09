package com.example.Sql_Rocks;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity  // so that hibernate can identify whose attribute to pick for table creation
@Table(name="user_info") //this is just for giving table name , by default table name is same as class name
public class User {

    @Id  //it is written on the attribute which has to become private key
    @Column(unique = true)
    private int id;

    @Column(unique = true)
    private String email;

    private String name;
    private String age;

    private String mobileNumber;


    @Column(name="country_name")
    private String country;

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


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

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
