/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22;

/**
 *
 * @author camiloplaza
 */
public class studentList {
    public static void main (String[]args){
        Student [] studentList= new Student[3];
        studentList [0]= new Student("s1", "Matt");
        studentList [0]= new Student("s2", "Uzi");
        studentList [0]= new Student("s3", "Han");
        
        for(int i=0; i<studentList.length;i++){
            System.out.println(studentList[i].getStudentName());
            System.out.println(" ");
            System.out.println(studentList[i].getStudentId());
        }
    }
}
