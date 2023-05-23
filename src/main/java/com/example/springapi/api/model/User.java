package com.example.springapi.api.model;

public class User {

    private int id;
    private String name;
    private int age;
    private String email;

    public User(int id, String name, int age, String email){
        this.id = id;
        this.name = name;
        this.age = age;
        this.email = email;
    }

    //id getter&setter
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    //name getter&setter
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    //age getter&setter
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }
    //email getter&setter
    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

}
