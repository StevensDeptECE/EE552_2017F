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
public interface Mode {
    public Shape create(int x1, int y1, int x2, int y2);
}
