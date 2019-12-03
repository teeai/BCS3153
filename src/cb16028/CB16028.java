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
public class CB16028 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        School sc1= new School(9);
        School sc2= new School(3);
        School sc3= new School(4);
        Student s1=new PostgraduateStudent();
        Student s2=new UndergraduateStudent();
        Student s3=new Student();
        s1.setStudentName("AiAi");
        s1.setStudentID(16028);
        s2.setStudentName("Edna");
        s2.setStudentID(16031);
        s3.setStudentName("Kong");
        s3.setStudentID(16110);
        sc1.registerNewStudent(s1, 0);
        sc2.registerNewStudent(s2, 0);            
        sc3.registerNewStudent(s3, 0);
        
        for (int i=0; i<sc1.numberOfStudents;i++){
            System.out.println("\n++ Information of PostGraduateStudent ++");
            System.out.println("StudentID   =  " + sc1.getStudent(i).getStudentID());
            System.out.println("StudentName =  " + sc1.getStudent(i).getStudentName());
                        
        }
        for (int i=0; i<sc2.numberOfStudents;i++){
            System.out.println("\n++ Information of UnderGraduateStudent ++");
            System.out.println("StudentID   =  " + sc2.getStudent(i).getStudentID());
            System.out.println("StudentName =  " + sc2.getStudent(i).getStudentName());
                        
        }
        for (int i=0; i<sc3.numberOfStudents;i++){
            System.out.println("\n++ Information of Student ++");
            System.out.println("StudentID   =  " + sc3.getStudent(i).getStudentID());
            System.out.println("StudentName =  " + sc3.getStudent(i).getStudentName());
                        
        }
        
    }
    
}
