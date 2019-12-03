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
public class UndergraduateStudent extends Student{
   //override method of the super class
    public void setStudentID(int num){
        studentID="CB"+num;
    }
    public String getStudentID(){
        return studentID;
    }
    
}
