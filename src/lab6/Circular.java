/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

/**
 *
 * @author Dell
 */
public class Circular extends Shape{

    @Override
    public void draw() {
        System.out.println("Ve hinh tron");
    }

    @Override
    public void rotate(int angle) {
        System.out.println( "Quay hinh tron mot goc "+ angle+" do");
    }

    @Override
    public void moveLeft(int poin) {
        System.out.println("Di chuyen hinh tron sang diem "+ poin);
    }

    @Override
    public void setColor(int color) {
        System.out.println("To mau hinh tron "+ color);
    }
    public int getArea(){
        return 200;
    }
}
