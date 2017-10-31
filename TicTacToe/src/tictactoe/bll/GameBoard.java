/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.bll;



/**
 *
 * @author Stegger
 */
public class GameBoard implements IGameModel
{
    int nextPlayer = 2;
    private Integer[][] board = new Integer[3][3];
        
    /**
     * Returns 0 for player 0, 1 for player 1.
     *
     * @return int Id of the next player.
     */
    
    public int getNextPlayer()
    {
        
        if(nextPlayer == 1)
        {
           nextPlayer = 2;
        }
        else
        {
            nextPlayer = 1;
        }
        return nextPlayer;
        
    }
    public int returnNextPlayer()
    {
        return nextPlayer;
    }
    /**
     * Attempts to let the current player play at the given coordinates. It the
     * attempt is succesfull the current player has ended his turn and it is the
     * next players turn.
     *
     * @param col column to place a marker in.
     * @param row row to place a marker in.
     * @return true if the move is accepted, otherwise false. If gameOver == true
     * this method will always return false.
     */
    int gameOver = 0;
    public boolean play(int col, int row)
    {
        if(board[row][col] != null || gameOver == 1)
        {
        return false;
        }    
        else
            if(nextPlayer == 2)
            {
                board[row][col] = 1;
            }
            else
            {
                board[row][col] = 2;
            }
        {
        return true;
        }
    }
    int winner = -1;
    @Override
    public boolean isGameOver()
    {
            return false;
    }
    
    

    /**
     * Gets the id of the winner, -1 if its a draw.
     *
     * @return int id of winner, or -1 if draw.
     */
    public int getWinner()
    {
        
        for(int i = 0; i < 3; i++)  {
            if(board[i][0] != null && board[i][1] == board[i][0] && board[i][2] == board[i][0])
            {
                winner = board[i][0];
                gameOver = 1;
            }
            if(board[0][i] != null && board[1][i] == board[0][i] && board[2][i] == board[0][i])
            {
                winner = board[0][i];
                gameOver = 1;
            }
            if(board[1][1] != null && board[0][0] == board[1][1] && board[2][2] == board[1][1])
            {
                winner = board[1][1];
                gameOver = 1;
            }
            if(board[1][1] != null && board[0][2] == board[1][1] && board[2][0] == board[1][1])
            {
                winner = board[1][1];
                gameOver = 1;
            }
 
        }
        return winner;
    }

    /**
     * Resets the player to player 1
     */
    public void newGame()
    {
        nextPlayer = 1;
        //TODO Implement this method
    }

}
