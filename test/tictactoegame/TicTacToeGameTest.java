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
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of main method, of class TicTacToeGame.
     */
    @Test
    public void testMain() {
        System.out.println("main");
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
        System.out.println("createBoard");
        TicTacToeGame instance = new TicTacToeGame();
        instance.createBoard();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of currentPlayer method, of class TicTacToeGame.
     */
    @Test
    public void testCurrentPlayer() {
        System.out.println("currentPlayer");
        TicTacToeGame instance = new TicTacToeGame();
        String expResult = "";
        String result = instance.currentPlayer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of changePlayer method, of class TicTacToeGame.
     */
    @Test
    public void testChangePlayer() {
        System.out.println("changePlayer");
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
        System.out.println("makeMove");
        int i = 0;
        int j = 0;
        TicTacToeGame instance = new TicTacToeGame();
        instance.makeMove(i, j);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of spaceInUse method, of class TicTacToeGame.
     */
    @Test
    public void testSpaceInUse() {
        System.out.println("spaceInUse");
        int i = 0;
        int j = 0;
        TicTacToeGame instance = new TicTacToeGame();
        boolean expResult = false;
        boolean result = instance.spaceInUse(i, j);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
