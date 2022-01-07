/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab5_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hoang 
 */
public class Class {
    private String name ;
    private Student students ;
    private List<Student> studentList ;
    private int numOfStudent ;
    private Teacher advisor ;

    public Class() {
        studentList = new ArrayList<>();
        advisor = new Teacher(); 
    }

    public Class(String name, List<Student> studentList, int numOfStudent, Teacher advisor) {
        this.name = name;
        this.studentList = studentList;
        this.numOfStudent = numOfStudent;
        this.advisor = advisor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public int getNumOfStudent() {
        return numOfStudent;
    }

    public void setNumOfStudent(int numOfStudent) {
        this.numOfStudent = numOfStudent;
    }

    public Teacher getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Teacher advisor) {
        this.advisor = advisor;
    }
    
    public void inputAdvisor(){
        advisor.input();
    }
    
    public void inputClassName(){
        Scanner input = new Scanner(System.in);
        System.out.println("enter class name :");
        name = input.nextLine(); 
    }
    
    public void inputStudent(int n){
        for(int i = 0; i < n; i++){
            System.out.println("nhap hoc sinh thu " + (i + 1));
            students = new Student(); 
            students.input();
            studentList.add(students);
        }
        
    }
    
    
    
    public void printList() {
        System.out.println("***************************");
        System.out.println("class name : " + this.name);
        System.out.println("***************************");
        System.out.println("danh sach hoc sinh của lớp " + this.name + " là : ");
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("");
            System.out.println("/thoc sinhh thu " + (i + 1));
            studentList.get(i).print();
        }
        System.out.println("****************************");
        System.out.println("so hoc sinh la : " + studentList.size());
        System.out.println("giao vien chu nhiem: \n");
        advisor.print();
        System.out.println("****************************");
    }
}
