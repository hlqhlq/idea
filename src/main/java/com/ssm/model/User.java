package com.ssm.model;

public class User {

    private int id;

    private String username;

    private String age;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getAge() {
        return age;
    }
    public void setAge(String age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", age=" + age + ", getId()=" + getId()
                + ", getUsername()=" + getUsername() + ", getAge()=" + getAge() + "]";
    }


}
