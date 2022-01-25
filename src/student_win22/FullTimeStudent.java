/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package student_win22;

/**
 *
 * @author camiloplaza
 * why are you not pushing? 
 */
public class FullTimeStudent {
    private int numberCourses;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FullTimeStudent(String name,int numberCourses) {
        this.numberCourses = numberCourses;
        this.name=name;
    }

    public int getNumberCourses() {
        return numberCourses;
    }

    public void setNumberCourses(int numberCourses) {
        this.numberCourses = numberCourses;
    }
    
}
