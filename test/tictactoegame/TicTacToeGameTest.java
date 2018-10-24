/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pflds
 */
public class TicTacToeGameTest {
    
    public TicTacToeGameTest() {
    }
    
    /**
     * Test of main method, of class TicTacToeGame.
     */
    @Test
    public void testMain() {
        //System.out.println("main");
        String[] args = null;
        TicTacToeGame.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of createBoard method, of class TicTacToeGame.
     */
    @Test
    public void testCreateBoard() {
        //System.out.println("createBoard");
        TicTacToeGame instance = new TicTacToeGame();
        instance.createBoard();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //fail("TEST DAILS");
        assertEquals(9, instance.Board[0].length + instance.Board[1].length + instance.Board[2].length);
    }

    /**
     * Test of currentPlayer method, of class TicTacToeGame.
     */
    @Test
    public void testCurrentPlayer() {
        //System.out.println("currentPlayer");
        TicTacToeGame instance = new TicTacToeGame();
        String expResult = "x";
        String result = instance.currentPlayer();
        assertEquals(expResult, result);
        instance.changePlayer();
        assertEquals("o", instance.currentPlayer());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        //assertEquals("x", )
    }

    /**
     * Test of changePlayer method, of class TicTacToeGame.
     */
    @Test
    public void testChangePlayer() {
        //System.out.println("changePlayer");
        TicTacToeGame instance = new TicTacToeGame();
        String expResult = "";
        String result = instance.changePlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of makeMove method, of class TicTacToeGame.
     */
    @Test
    public void testMakeMove() {
        //System.out.println("makeMove");
        int i = 0;
        int j = 0;
        TicTacToeGame instance = new TicTacToeGame();
        instance.createBoard();
        System.out.println(instance.currentPlayer());
        instance.makeMove(i, j);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        assertEquals("x", instance.Board[0][0]);
        instance.changePlayer();
        i = 0;
        j = 1;
        instance.makeMove(i, j);
        assertEquals("o", instance.Board[0][1]);
    }

    /**
     * Test of spaceInUse method, of class TicTacToeGame.
     */
    @Test
    public void testSpaceInUse() {
        //System.out.println("spaceInUse");
        int i = 0;
        int j = 2;
        TicTacToeGame instance = new TicTacToeGame();
        boolean expResult = true;
        boolean result = instance.spaceInUse(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
    
}
