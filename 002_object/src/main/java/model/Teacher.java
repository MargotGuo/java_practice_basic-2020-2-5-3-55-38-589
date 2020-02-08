package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher {
  public String name;
  public Student[] myStudent;

  public Teacher(String name, Student[] myStudent) {
    this.name = name;
    this.myStudent = myStudent;
  }

  public void getAllStudent() {
    for(Student student : myStudent) {
      System.out.printf("%s, %s, %d years old.\n", student.name, student.gender, student.age);
    }
  }

  public void addNewStudent(Student newStudent) {
    List<Student> studentList = new ArrayList<Student>(Arrays.asList(myStudent));
    studentList.add(newStudent);
    myStudent = studentList.toArray(new Student[0]);
  }
}
