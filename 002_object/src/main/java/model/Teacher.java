package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher {
  private String name;
  private Student[] myStudents;

  public Teacher(String name, Student[] myStudents) {
    this.name = name;
    this.myStudents = myStudents;
  }

  public void getAllStudents() {
    for(Student student : myStudents) {
      System.out.printf("%s, %s, %d years old.\n", student.getName(), student.getGender(), student.getAge());
    }
  }

  public void addNewStudent(Student newStudent) {
    List<Student> studentList = new ArrayList<>(Arrays.asList(myStudents));
    studentList.add(newStudent);
    myStudents = studentList.toArray(new Student[0]);
  }

  public String getName() {
    return name;
  }
}
