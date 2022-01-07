/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Dell
 */
public class Line extends Shape{

    @Override
    public void draw() {
        System.out.println("Ve duong thang");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("Duong thang quay mot goc "+ angle+" do");
    }

    @Override
    public void moveLeft(int poin) {
        System.out.println("Di chuyen duong thang sang diem "+ poin);
    }

    @Override
    public void setColor(int color) {
        System.out.println("To mau duong thang "+ color);
    }
    public int getLength(){
        return 100;
    }
}