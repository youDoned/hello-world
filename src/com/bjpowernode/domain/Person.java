package com.bjpowernode.domain;

public class Person {
    private String name;
    private int id;
    private String emaill;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", emaill='" + emaill + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public Person(String name, int id, String emaill) {
        this.name = name;
        this.id = id;
        this.emaill = emaill;
    }
}
