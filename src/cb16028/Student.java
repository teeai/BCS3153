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
public class Student {
    public String studentName;
    public String studentID;
    public Student(){
        studentName="";
        studentID="";
    }
    public void setStudentName(String str){
        studentName=str;
    }
    public void setStudentID(int num){
        studentID="ST"+num;
    }
    public String getStudentName(){
        return studentName;
    }
    public String getStudentID(){
        return studentID;
    }
}
