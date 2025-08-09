/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_demo;

/**
 *
 * @author Le Minh Triet
 */
public class Student {
  private int id;
  private String name;
  private int yob;

  public Student(){}
  
    public Student(int id, String name, int yob) {
        this.id = id;
        this.name = name;
        this.yob = yob;
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

    public int getYob() {
        return yob;
    }

    public void setYob(int yob) {
        this.yob = yob;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", yob=" + yob + '}';
    }
  
    
  
}
