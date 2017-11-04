/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 * For this assignment, write one statement for each class explaining what it does
 * use English command tense (as though you are telling a person what to do).
 * 
 * Represent a checkers board state
 * @author dkruger
 */
public class Checkers {
    private int size; // the number of grid locations, usually 8
    private enum PositionState { EMPTY, BLACK, WHITE };
    int[][] board;
    PositionState[][] board2;
    
 
    public PositionState getState(int i, int j) { }
    
    
    
    
    void f() { 
       int c; // try to pick meaningful variable names
       
       //good:
       int boardPosition;
       int countWhitePieces;
       
       //bad:
       int xj76;
       
       
       c++; // add 1 to c (DO NOT write comments explaining the language
   }
}
