package com.ohgiraffers.section01.user;

public class Mem {

    private int no;
    private String id;
    private String pw;

    private String name;
    private int age;
    private char gender;

    public Mem() {
    }

    public Mem(int no, String id, String pw, String name, int age, char gender) {
        this.no = no;
        this.id = id;
        this.pw = pw;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getInformation() {

        return "Mem Num[" + no + ", id = " + id + "pwd =" + pw + ",name = " + name + ", age = " + age + ",gender = " + gender + "]";
    }
}
