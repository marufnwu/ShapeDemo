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
public class Rectangle extends Shape{
    private final float height;
    private final float width;
    
    public Rectangle(float height, float width){
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height*width;
    }
    
}
