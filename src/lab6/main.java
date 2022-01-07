/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class main {
    public static void main(String[] args) {
        ArrayList<Shape> figure = new ArrayList<>();
        
        Shape child1 = new Line();
        Shape child2 = new Circular();
        Shape child3 = new Circular();
        Composite child4 = new Composite();
        Shape l1 = new Line();
        Shape l2 = new Line();
        Shape l3 = new Line();
        Shape c1 = new Circular();
        child4.Add(l1);
        child4.Add(l2);
        child4.Add(l3);
        child4.Add(c1);
        for (Shape a : child4.shapelList ) {
            a.setColor(11);
        }
        
        figure.add(child1);
        figure.add(child2);
        figure.add(child3);
        figure.add(child4);
        System.out.println("Doi mau dong bo: ");
        for (Shape sh : figure) {
            sh.setColor(100);
        }
        System.out.println("Quay mot goc 90 do: ");
        for (Shape shape : figure) {
            shape.rotate(90);
        }
    }
}
