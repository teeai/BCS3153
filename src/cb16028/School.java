/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cb16028;

/**
 *
 * @author Ai Ai
 */
public class School {
    String studentName;
    public int numberOfStudents;
    Student std[];
    
    public School(){
        std=new Student[14];
        numberOfStudents=0;
    }
    //overloaded constructor
    public School(int num){
        std=new Student[num];
        numberOfStudents++;
    }
    public void registerNewStudent(Student stu, int index){
        std[index]=stu;
    }
    public Student getStudent(int index){
        return std[index];
    }
    
    
}
