/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;
import java.util.*;
public class Game {
      final static int ROCK = 1, SCISSOR = 2, PAPER = 3;
    
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Player 1: Choose \n(1) - Rock,\n(2) - Scissors, \n(3) - Paper \n");
        int player1 = scan.nextInt();
        System.out.println("Player 2: Choose \n(1) - Rock,\n (2) - Scissors \n (3) - Paper \n");
        int player2 = scan.nextInt();
     
        if (player1 == player2)
        {
            System.out.print("It is a tie");
        } 
        else {
            switch (player1){
            case ROCK:
                if (player2 == SCISSOR)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case SCISSOR:
                if (player2 == PAPER)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            case PAPER:
                if (player2 == ROCK)
                    System.out.print("Player 1 wins!");
                else
                    System.out.print("Player 2 wins!");
                break;
            }
        }
    }
}
      
    