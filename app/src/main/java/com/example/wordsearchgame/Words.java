package com.example.wordsearchgame;
import java.util.Random;
import java.util.ArrayList;

public class Words {
    private String word;
    private int size;
    private int location_row;
    private int location_col;
    private int direction;
    private ArrayList<Integer> directions = new ArrayList<Integer>();

    public Words(String word, int size, int location_col, int location_row, int direction, ArrayList directions){
        this.word = word;
        this.size = size;
        this.location_row = location_row;
        this.location_col = location_col;
        this.direction = direction;
    }

    public Words(String word, int size) {
        this.word = word;
        this.size = size;

        Random r = new Random();
        location_row = r.nextInt(10);
        location_col = r.nextInt(10);

        if (size == 10) {

            location_row = r.nextInt(2);

            if (location_row == 1){
                location_row = 9;
            }

            location_col = r.nextInt(2);

            if (location_col == 1){
                location_col = 9;
            }

            int n;
            int e;
            int s;
            int w;

            n = location_row - size;
            s = location_row + size;
            w = location_col - size;
            e = location_col + size;

            if (n > -2) {
                directions.add(0);
            }

            if (e < 11) {
                directions.add(2);
            }

            if (s < 11) {
                directions.add(4);
            }

            if (w > -2) {
                directions.add(6);
            }

            direction = directions.get(r.nextInt(directions.size()));

        }

        else if (size == 8) {

            location_row = r.nextInt(4);

            if (location_row == 2){
                location_row = 8;
            }

            else if (location_row == 3){
                location_row = 9;
            }

            location_col = r.nextInt(4);

            if (location_col == 2){
                location_col = 8;
            }

            else if (location_col == 3){
                location_col = 9;
            }

            int n;
            int e;
            int s;
            int w;

            n = location_row - size;
            s = location_row + size;
            w = location_col - size;
            e = location_col + size;

            if (n > -2) {
                directions.add(0);
            }

            if (e < 11) {
                directions.add(2);
            }

            if (s < 11) {
                directions.add(4);
            }

            if (w > -2) {
                directions.add(6);
            }

            direction = directions.get(r.nextInt(directions.size()));
        }

        else{
            int n;
            int ne;
            int e;
            int es;
            int s;
            int sw;
            int w;
            int wn;

            n = location_row - size;
            s = location_row + size;
            w = location_col - size;
            e = location_col + size;

            if ((n > -2) && (e < 11)) {
                ne = 0;
            }

            else {
                ne = 1;
            }

            if ((e < 11) && (s < 11)) {
                es = 0;
            }

            else {
                es = 1;
            }

            if ((s < 11) && (w > -2)) {
                sw = 0;
            }

            else {
                sw = 1;
            }

            if ((w > -2) && (n > -2)) {
                wn = 0;
            }

            else {
                wn = 1;
            }

            if (n > -2) {
                directions.add(0);
            }

            if (ne == 0) {
                directions.add(1);
            }

            if (e < 11) {
                directions.add(2);
            }

            if (es == 0) {
                directions.add(3);
            }

            if (s < 11) {
                directions.add(4);
            }

            if (sw == 0) {
                directions.add(5);
            }

            if (w > -2) {
                directions.add(6);
            }

            if (wn == 0) {
                directions.add(7);
            }

            direction = directions.get(r.nextInt(directions.size()));
        }
    }

    public int getSize() {
        return size;
    }

    public int getLocationRow() {
        return location_row;
    }

    public int getLocationCol() {
        return location_col;
    }

    public String getWord() {
        return word;
    }

    public ArrayList getDirections(){
        return directions;
    }

    public int getDirection(){
        return direction;
    }

}
