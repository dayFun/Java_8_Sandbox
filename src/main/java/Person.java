package main.java;

public class Person {

    private String name;
    private String city;
    private String state;
    private Sex sex;
    private int age;
    private boolean isEmployed;
    private boolean isSingle;

    public Person(String name, String city, String state, Sex sex, int age, boolean isEmployed, boolean isSingle) {
        this.name = name;
        this.city = city;
        this.state = state;
        this.sex = sex;
        this.age = age;
        this.isEmployed = isEmployed;
        this.isSingle = isSingle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    public boolean isSingle() {
        return isSingle;
    }

    public void setIsSingle(boolean isSingle) {
        this.isSingle = isSingle;
    }
}
