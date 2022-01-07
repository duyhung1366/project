/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class Composite extends Shape{
    @Override
    public void draw() {
        System.out.println("Ve mau hon hop");
    }

    @Override
    public void rotate(int angle) {
        System.out.println("mau hon hop quay mot goc "+ angle+" do");
    }

    @Override
    public void moveLeft(int poin) {
        System.out.println("Di chuyen mau hon hop sang diem "+ poin);
    }

    @Override
    public void setColor(int color) {
        System.out.println("To mau mau hon hop "+ color);
    }
    List<Shape> shapelList = new ArrayList<>();
    public void Add(Shape shape){
        shapelList.add(shape);
    }
    public void remove(Shape shape){
        shapelList.remove(shape);
    }
    public Shape getChild(int id){
        return shapelList.get(id);
    }
}
