package model;

public class Student {
  private String name;
  private int age;
  private String gender;

  public Student(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  public void study() {
    System.out.println("study!!!");
  }

  public void rest() {
    System.out.println("rest...");
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  public String getGender() {
    return gender;
  }
}
