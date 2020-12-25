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
public class Square extends Shape{
    private final float length;
    
    public Square(float length){
        this.length = length;
    }
    @Override
    public double getArea() {
        return Math.pow(length, 2);
    }
    
}
