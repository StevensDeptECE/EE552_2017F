/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.stevens.ee552.cad.components;

/**
 *
 * @author dkruger
 */
public class CircleMode implements Mode {
    public Shape create(int x1, int y1, int x2, int y2) {
        return new Circle(x1,y1, x2-x1,y2-y1);
    }
}
