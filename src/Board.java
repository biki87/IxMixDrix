/**
 * Created by Dima on 3/23/2015.
 *
 * This class represents a TicTacToe playing board
 */
public class Board {

    private int[][] board;

    public Board(){
        //new board with all elements set to zero
        board = new int[3][3];
    }

    //checks if a slot is free
    public boolean isFree(int row, int col){
        return board[row][col] == 0;
    }

    //sets the slot to be X (1) or O(-1)
    //does nothing if slot is not free or value is not valid
    public void setSlot(int row, int col, int val){
        if (!isFree(row, col)){
            return;
        }
        if (val!=1 ||val!=-1){
            return;
        }
        else {
            board[row][col] = val;
        }
    }

    public void printBoard(){
        for (int row = 0; row < 3; row++){
            printLine(row);
            if (row != 2) {
                System.out.println();
                System.out.println("-----------");
            }
        }
    }

    private void printLine(int row){
        for (int col=0; col < 3 ; col++){
            printSlot(row, col);
            if (col != 2){
                System.out.print("|");
            }
        }
    }

    private void printSlot(int row, int col){
        if (board[row][col] == 1){
            System.out.print(" X ");
        }
        else if (board[row][col] == -1){
            System.out.print(" O ");
        }
        else {
            System.out.print("   ");
        }
    }
}
