package model;

public class student{
    public String name;
    public int age;
    public String gender;
    public int ID_NO;

    public student (String name, int age, String gender, int ID_NO){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.ID_NO = ID_NO;
    }

    public void student_Info(){
        System.out.println("Student Info: \n" +
                "Name: " + name + "\n"+
                "Age: " + age + "\n"+
                "Gender: " + gender + "\n"+
                "Student ID: " + ID_NO);
    }

    }
