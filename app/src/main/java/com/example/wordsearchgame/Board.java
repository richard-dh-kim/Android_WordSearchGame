package com.example.wordsearchgame;

import java.util.Random;

public class Board {
    private char [][] gameBoard;

    public Board() {
        gameBoard = new char[10][10];
    }

    public boolean checkEmptyOrSame(int a, int b, char c){
        if ((gameBoard[a][b] == 0) || (gameBoard[a][b] == c)){
            return true;
        }
        else{
            return false;
        }
    }

    public char getValue(int a, int b){
        return gameBoard[a][b];
    }

    public void addWord(Words w) {
        int row = w.getLocationRow();
        int col = w.getLocationCol();
        int dir = w.getDirection();
        int size = w.getSize();
        String letters = w.getWord();

        if (dir == 0){
            for (int i=0; i < size; i++){
                gameBoard[row-i][col] = letters.charAt(i);
            }
        }

        else if (dir == 1){
            for (int i=0; i < size; i++){
                gameBoard[row-i][col+i] = letters.charAt(i);
            }
        }

        else if (dir == 2){
            for (int i=0; i < size; i++){
                gameBoard[row][col+i] = letters.charAt(i);
            }
        }

        else if (dir == 3){
            for (int i=0; i < size; i++){
                gameBoard[row+i][col+i] = letters.charAt(i);
            }
        }

        else if (dir == 4){
            for (int i=0; i < size; i++){
                gameBoard[row+i][col] = letters.charAt(i);
            }
        }

        else if (dir == 5){
            for (int i=0; i < size; i++){
                gameBoard[row+i][col-i] = letters.charAt(i);
            }
        }

        else if (dir == 6){
            for (int i=0; i < size; i++){
                gameBoard[row][col-i] = letters.charAt(i);
            }
        }

        else{
            for (int i=0; i < size; i++){
                gameBoard[row-i][col-i] = letters.charAt(i);
            }
        }
    }

    public void fillUp() {
        for (int i=0; i< 10; i++){
            for (int j=0; j<10; j++){
                if (gameBoard[i][j] == 0){
                    Random r = new Random();
                    char c = (char) (r.nextInt(26) + 'A');
                    gameBoard[i][j] = c;
                }
            }
        }
    }
}
