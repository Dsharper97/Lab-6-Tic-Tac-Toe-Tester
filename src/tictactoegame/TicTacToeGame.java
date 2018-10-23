/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoegame;

/**
 *
 * @author pflds
 */
public class TicTacToeGame {

    /**
     * @param args the command line arguments
     */
    public static String player1 = "x" ;
    public static String player2 = "o"; 
    public static String currentPlayer = player1;
    public String [][] Board = null;

     
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    public TicTacToeGame(){
        createBoard();
    }
    
    public void createBoard(){
    Board = new String[3][3];
      
}
    public  String currentPlayer(){
        return currentPlayer;
    }
    public  String changePlayer(){
        if (currentPlayer == player1){
            currentPlayer = player2;
        }else{
            currentPlayer = player1;
    }
        return currentPlayer;
    }
    
    public  void makeMove(int i, int j){
        if(!(spaceInUse(i,j))){
         Board [i][j] = currentPlayer; 
    }
        
    }
    
    public boolean spaceInUse(int i, int j){
        if ((Board[i][j]) == null){
       return true;
    }else{
        return false;
         }
       
    }

}



