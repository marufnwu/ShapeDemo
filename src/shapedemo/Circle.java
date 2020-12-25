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
public class Circle extends Shape {
    private final double radius;
    private final double pi = 3.1416;
    public Circle(float radius){
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return pi*Math.pow(radius, 2);
    }
    
    
    
}
