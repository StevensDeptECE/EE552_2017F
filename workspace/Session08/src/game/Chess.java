/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *       + -->
 *       |
 *       |
 *       Knight
 * 
 * 
 *       |
 *       P
 *     
 * 
 * 
 * @author dkruger
 */
public class ChessPiece {
    Delta[][] legalMoves = {
        new Delta[] { new Delta(0,+1)},
        new Delta[] { new Delta(+1,+2), new Delta(-1,+2), 
            new Delta(+2,+1), new Delta(+2,-1)
    };
  
}

class Delta {
    public int dx,dy;
}
