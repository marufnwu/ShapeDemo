/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shapedemo;

/**
 *
 * @author maruf
 */
public class ShapeDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        System.out.println("Circle area=> "+circle.getArea());
        
        Rectangle rectangle = new Rectangle(20, 30);
        System.out.println("Rectangle area=> "+rectangle.getArea());

        Square square = new Square(50);
        System.out.println("Square area=> "+square.getArea());
    }
    
}
