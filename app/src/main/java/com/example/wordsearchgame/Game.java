package com.example.wordsearchgame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.*;

public class Game extends AppCompatActivity {

    private int main_counter = 0;

    private int letter1_counter = 0;
    private int letter2_counter = 0;
    private int letter3_counter = 0;
    private int letter4_counter = 0;
    private int letter5_counter = 0;
    private int letter6_counter = 0;
    private int letter7_counter = 0;
    private int letter8_counter = 0;
    private int letter9_counter = 0;
    private int letter10_counter = 0;


    private int letter11_counter = 0;
    private int letter12_counter = 0;
    private int letter13_counter = 0;
    private int letter14_counter = 0;
    private int letter15_counter = 0;
    private int letter16_counter = 0;
    private int letter17_counter = 0;
    private int letter18_counter = 0;
    private int letter19_counter = 0;
    private int letter20_counter = 0;


    private int letter21_counter = 0;
    private int letter22_counter = 0;
    private int letter23_counter = 0;
    private int letter24_counter = 0;
    private int letter25_counter = 0;
    private int letter26_counter = 0;
    private int letter27_counter = 0;
    private int letter28_counter = 0;
    private int letter29_counter = 0;
    private int letter30_counter = 0;


    private int letter31_counter = 0;
    private int letter32_counter = 0;
    private int letter33_counter = 0;
    private int letter34_counter = 0;
    private int letter35_counter = 0;
    private int letter36_counter = 0;
    private int letter37_counter = 0;
    private int letter38_counter = 0;
    private int letter39_counter = 0;
    private int letter40_counter = 0;


    private int letter41_counter = 0;
    private int letter42_counter = 0;
    private int letter43_counter = 0;
    private int letter44_counter = 0;
    private int letter45_counter = 0;
    private int letter46_counter = 0;
    private int letter47_counter = 0;
    private int letter48_counter = 0;
    private int letter49_counter = 0;
    private int letter50_counter = 0;


    private int letter51_counter = 0;
    private int letter52_counter = 0;
    private int letter53_counter = 0;
    private int letter54_counter = 0;
    private int letter55_counter = 0;
    private int letter56_counter = 0;
    private int letter57_counter = 0;
    private int letter58_counter = 0;
    private int letter59_counter = 0;
    private int letter60_counter = 0;


    private int letter61_counter = 0;
    private int letter62_counter = 0;
    private int letter63_counter = 0;
    private int letter64_counter = 0;
    private int letter65_counter = 0;
    private int letter66_counter = 0;
    private int letter67_counter = 0;
    private int letter68_counter = 0;
    private int letter69_counter = 0;
    private int letter70_counter = 0;


    private int letter71_counter = 0;
    private int letter72_counter = 0;
    private int letter73_counter = 0;
    private int letter74_counter = 0;
    private int letter75_counter = 0;
    private int letter76_counter = 0;
    private int letter77_counter = 0;
    private int letter78_counter = 0;
    private int letter79_counter = 0;
    private int letter80_counter = 0;


    private int letter81_counter = 0;
    private int letter82_counter = 0;
    private int letter83_counter = 0;
    private int letter84_counter = 0;
    private int letter85_counter = 0;
    private int letter86_counter = 0;
    private int letter87_counter = 0;
    private int letter88_counter = 0;
    private int letter89_counter = 0;
    private int letter90_counter = 0;


    private int letter91_counter = 0;
    private int letter92_counter = 0;
    private int letter93_counter = 0;
    private int letter94_counter = 0;
    private int letter95_counter = 0;
    private int letter96_counter = 0;
    private int letter97_counter = 0;
    private int letter98_counter = 0;
    private int letter99_counter = 0;
    private int letter100_counter = 0;

    public boolean overlap(Words w, Board gameBoard){
        int size = w.getSize();
        int row = w.getLocationRow();
        int col = w.getLocationCol();
        String letters = w.getWord();
        int dir = w.getDirection();

        if (dir == 0){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row-i, col, letters.charAt(i))){
                    return true;
                }
            }
        }

        else if (dir == 1){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row-i, col+i, letters.charAt(i))){
                    return true;
                }
            }
        }

        else if (dir == 2){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row, col+i, letters.charAt(i))){
                    return true;
                }
            }
        }

        else if (dir == 3){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row+i, col+i, letters.charAt(i))){
                    return true;
                }
            }
        }

        else if (dir == 4){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row+i, col, letters.charAt(i))){
                    return true;
                }
            }
        }

        else if (dir == 5){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row+i, col-i, letters.charAt(i))){
                    return true;
                }
            }
        }

        else if (dir == 6){
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row, col-i, letters.charAt(i))){
                    return true;
                }
            }
        }

        else {
            for (int i=0; i < size; i++){
                if (!gameBoard.checkEmptyOrSame(row-i, col-i, letters.charAt(i))){
                    return true;
                }
            }
        }

        return false;
    }

    public Board createGameBoard() {
        Board gameBoard = new Board();

        ArrayList<Integer> directions = new ArrayList<Integer>();

        Random r = new Random();
        int dir;
        int row;
        int col;
        int counter;

        Words objectivec = new Words("OBJECTIVEC", 10);
        gameBoard.addWord(objectivec);

        Words variable = new Words("VARIABLE", 8);

        if (overlap(variable, gameBoard)){
            directions = variable.getDirections();

            while(overlap(variable, gameBoard)){

                dir = variable.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    variable = null;
                    variable = new Words("VARIABLE", 8);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = variable.getLocationRow();
                    col = variable.getLocationCol();
                    variable = null;
                    variable = new Words("VARIABLE", 8, col, row, dir, directions);
                }
            }
            gameBoard.addWord(variable);
        }

        else{
            gameBoard.addWord(variable);
        }

        Words mobile = new Words("MOBILE", 6);

        if (overlap(mobile, gameBoard)){
            directions = mobile.getDirections();

            while(overlap(mobile, gameBoard)){
                dir = mobile.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    mobile = null;
                    mobile = new Words("MOBILE", 6);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = mobile.getLocationRow();
                    col = mobile.getLocationCol();
                    mobile = null;
                    mobile = new Words("MOBILE", 6, col, row, dir, directions);
                }
            }
            gameBoard.addWord(mobile);
        }

        else{
            gameBoard.addWord(mobile);
        }

        Words kotlin = new Words("KOTLIN", 6);

        if (overlap(kotlin, gameBoard)){
            directions = kotlin.getDirections();

            while(overlap(kotlin, gameBoard)){
                dir = kotlin.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    kotlin = null;
                    kotlin = new Words("KOTLIN", 6);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = kotlin.getLocationRow();
                    col = kotlin.getLocationCol();
                    kotlin = null;
                    kotlin = new Words("KOTLIN", 6, col, row, dir, directions);
                }
            }
            gameBoard.addWord(kotlin);
        }

        else{
            gameBoard.addWord(kotlin);
        }

        Words swift = new Words("SWIFT", 5);

        if (overlap(swift, gameBoard)){
            directions = swift.getDirections();

            while(overlap(swift, gameBoard)){
                dir = swift.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    swift = null;
                    swift = new Words("SWIFT", 5);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = swift.getLocationRow();
                    col = swift.getLocationCol();
                    swift = null;
                    swift = new Words("SWIFT", 5, col, row, dir, directions);
                }
            }
            gameBoard.addWord(swift);
        }

        else{
            gameBoard.addWord(swift);
        }

        Words java = new Words("JAVA", 4);

        if (overlap(java, gameBoard)){
            directions = java.getDirections();

            while(overlap(java, gameBoard)){
                dir = java.getDirection();

                counter = 0;
                for (int i : directions) {
                    if (i == dir){
                        break;
                    }
                    counter++;
                }

                if (directions.size() == 1) {
                    java = null;
                    java = new Words("JAVA", 4);
                }

                else {
                    directions.remove(counter);
                    dir = directions.get(r.nextInt(directions.size()));
                    row = java.getLocationRow();
                    col = java.getLocationCol();
                    java = null;
                    java = new Words("JAVA", 4, col, row, dir, directions);
                }
            }
            gameBoard.addWord(java);
        }

        else{
            gameBoard.addWord(java);
        }

        gameBoard.fillUp();

        return(gameBoard);
    }

    public boolean wordClicked(ArrayList<TextView> clickedLetters, Board gameBoard, ArrayList<String> clickedLocations){

        TextView MOBILE = findViewById(R.id.MOBILE);
        TextView OBJECTIVEC = findViewById(R.id.OBJECTIVEC);
        TextView JAVA = findViewById(R.id.JAVA);
        TextView VARIABLE = findViewById(R.id.VARIABLE);
        TextView KOTLIN = findViewById(R.id.KOTLIN);
        TextView SWIFT = findViewById(R.id.SWIFT);

        Collections.sort(clickedLocations);

        String str = "";
        int a;
        int b;
        char c;

        for (String i : clickedLocations) {
            a = Character.getNumericValue(i.charAt(0));
            b = Character.getNumericValue(i.charAt(1));
            c = gameBoard.getValue(a,b);
            str = str + String.valueOf(c);
        }

        if (str.equals("OBJECTIVEC") || str.equals("MOBILE") ||str.equals("JAVA") ||str.equals("SWIFT") ||str.equals("KOTLIN") ||str.equals("VARIABLE") || str.equals("CEVITCEJBO") || str.equals("ELIBOM") ||str.equals("AVAJ") ||str.equals("TFIWS") ||str.equals("NILTOK") ||str.equals("ELBAIRAV")) {

            for (TextView i : clickedLetters) {
                i.setTextColor(Color.parseColor("#FFFFFF"));
                i.setBackgroundColor(Color.parseColor("#FF0000"));
            }

            if (str.equals("OBJECTIVEC") || str.equals("CEVITCEJBO")){
                OBJECTIVEC.setTextColor(Color.parseColor("#FF0000"));
            }

            else if (str.equals("MOBILE") || str.equals("ELIBOM")){
                MOBILE.setTextColor(Color.parseColor("#FF0000"));
            }

            else if (str.equals("VARIABLE") || str.equals("ELBAIRAV")){
                VARIABLE.setTextColor(Color.parseColor("#FF0000"));
            }

            else if (str.equals("JAVA") || str.equals("AVAJ")){
                JAVA.setTextColor(Color.parseColor("#FF0000"));
            }

            else if (str.equals("SWIFT") || str.equals("TFIWS")){
                SWIFT.setTextColor(Color.parseColor("#FF0000"));
            }

            else {
                KOTLIN.setTextColor(Color.parseColor("#FF0000"));
            }

            return true;
        }
        else{
            return false;
        }

    }

    public void wordComplete(TextView wordcounter){
        main_counter ++;

        wordcounter.setText(String.valueOf(main_counter));

        if (main_counter == 6) {
            Intent end = new Intent(Game.this, EndingScreen.class);
            startActivity(end);
        }
    }

    public void play(final Board gameBoard) {

        final TextView wordcounter = findViewById(R.id.wordcounter);
        wordcounter.setText(String.valueOf(main_counter));

        final ArrayList<String> clickedLocations = new ArrayList<String>();
        final ArrayList<TextView> clickedLetters = new ArrayList<TextView>();

        final TextView letter1 = findViewById(R.id.letter1);
        final TextView letter2 = findViewById(R.id.letter2);
        final TextView letter3 = findViewById(R.id.letter3);
        final TextView letter4 = findViewById(R.id.letter4);
        final TextView letter5 = findViewById(R.id.letter5);
        final TextView letter6 = findViewById(R.id.letter6);
        final TextView letter7 = findViewById(R.id.letter7);
        final TextView letter8 = findViewById(R.id.letter8);
        final TextView letter9 = findViewById(R.id.letter9);
        final TextView letter10 = findViewById(R.id.letter10);
        final TextView letter11 = findViewById(R.id.letter11);
        final TextView letter12 = findViewById(R.id.letter12);
        final TextView letter13 = findViewById(R.id.letter13);
        final TextView letter14 = findViewById(R.id.letter14);
        final TextView letter15 = findViewById(R.id.letter15);
        final TextView letter16 = findViewById(R.id.letter16);
        final TextView letter17 = findViewById(R.id.letter17);
        final TextView letter18 = findViewById(R.id.letter18);
        final TextView letter19 = findViewById(R.id.letter19);
        final TextView letter20 = findViewById(R.id.letter20);
        final TextView letter21 = findViewById(R.id.letter21);
        final TextView letter22 = findViewById(R.id.letter22);
        final TextView letter23 = findViewById(R.id.letter23);
        final TextView letter24 = findViewById(R.id.letter24);
        final TextView letter25 = findViewById(R.id.letter25);
        final TextView letter26 = findViewById(R.id.letter26);
        final TextView letter27 = findViewById(R.id.letter27);
        final TextView letter28 = findViewById(R.id.letter28);
        final TextView letter29 = findViewById(R.id.letter29);
        final TextView letter30 = findViewById(R.id.letter30);
        final TextView letter31 = findViewById(R.id.letter31);
        final TextView letter32 = findViewById(R.id.letter32);
        final TextView letter33 = findViewById(R.id.letter33);
        final TextView letter34 = findViewById(R.id.letter34);
        final TextView letter35 = findViewById(R.id.letter35);
        final TextView letter36 = findViewById(R.id.letter36);
        final TextView letter37 = findViewById(R.id.letter37);
        final TextView letter38 = findViewById(R.id.letter38);
        final TextView letter39 = findViewById(R.id.letter39);
        final TextView letter40 = findViewById(R.id.letter40);
        final TextView letter41 = findViewById(R.id.letter41);
        final TextView letter42 = findViewById(R.id.letter42);
        final TextView letter43 = findViewById(R.id.letter43);
        final TextView letter44 = findViewById(R.id.letter44);
        final TextView letter45 = findViewById(R.id.letter45);
        final TextView letter46 = findViewById(R.id.letter46);
        final TextView letter47 = findViewById(R.id.letter47);
        final TextView letter48 = findViewById(R.id.letter48);
        final TextView letter49 = findViewById(R.id.letter49);
        final TextView letter50 = findViewById(R.id.letter50);
        final TextView letter51 = findViewById(R.id.letter51);
        final TextView letter52 = findViewById(R.id.letter52);
        final TextView letter53 = findViewById(R.id.letter53);
        final TextView letter54 = findViewById(R.id.letter54);
        final TextView letter55 = findViewById(R.id.letter55);
        final TextView letter56 = findViewById(R.id.letter56);
        final TextView letter57 = findViewById(R.id.letter57);
        final TextView letter58 = findViewById(R.id.letter58);
        final TextView letter59 = findViewById(R.id.letter59);
        final TextView letter60 = findViewById(R.id.letter60);
        final TextView letter61 = findViewById(R.id.letter61);
        final TextView letter62 = findViewById(R.id.letter62);
        final TextView letter63 = findViewById(R.id.letter63);
        final TextView letter64 = findViewById(R.id.letter64);
        final TextView letter65 = findViewById(R.id.letter65);
        final TextView letter66 = findViewById(R.id.letter66);
        final TextView letter67 = findViewById(R.id.letter67);
        final TextView letter68 = findViewById(R.id.letter68);
        final TextView letter69 = findViewById(R.id.letter69);
        final TextView letter70 = findViewById(R.id.letter70);
        final TextView letter71 = findViewById(R.id.letter71);
        final TextView letter72 = findViewById(R.id.letter72);
        final TextView letter73 = findViewById(R.id.letter73);
        final TextView letter74 = findViewById(R.id.letter74);
        final TextView letter75 = findViewById(R.id.letter75);
        final TextView letter76 = findViewById(R.id.letter76);
        final TextView letter77 = findViewById(R.id.letter77);
        final TextView letter78 = findViewById(R.id.letter78);
        final TextView letter79 = findViewById(R.id.letter79);
        final TextView letter80 = findViewById(R.id.letter80);
        final TextView letter81 = findViewById(R.id.letter81);
        final TextView letter82 = findViewById(R.id.letter82);
        final TextView letter83 = findViewById(R.id.letter83);
        final TextView letter84 = findViewById(R.id.letter84);
        final TextView letter85 = findViewById(R.id.letter85);
        final TextView letter86 = findViewById(R.id.letter86);
        final TextView letter87 = findViewById(R.id.letter87);
        final TextView letter88 = findViewById(R.id.letter88);
        final TextView letter89 = findViewById(R.id.letter89);
        final TextView letter90 = findViewById(R.id.letter90);
        final TextView letter91 = findViewById(R.id.letter91);
        final TextView letter92 = findViewById(R.id.letter92);
        final TextView letter93 = findViewById(R.id.letter93);
        final TextView letter94 = findViewById(R.id.letter94);
        final TextView letter95 = findViewById(R.id.letter95);
        final TextView letter96 = findViewById(R.id.letter96);
        final TextView letter97 = findViewById(R.id.letter97);
        final TextView letter98 = findViewById(R.id.letter98);
        final TextView letter99 = findViewById(R.id.letter99);
        final TextView letter100 = findViewById(R.id.letter100);

        //Row 1
        letter1.setText(Character.toString(gameBoard.getValue(0,0)));
        letter2.setText(Character.toString(gameBoard.getValue(0,1)));
        letter3.setText(Character.toString(gameBoard.getValue(0,2)));
        letter4.setText(Character.toString(gameBoard.getValue(0,3)));
        letter5.setText(Character.toString(gameBoard.getValue(0,4)));
        letter6.setText(Character.toString(gameBoard.getValue(0,5)));
        letter7.setText(Character.toString(gameBoard.getValue(0,6)));
        letter8.setText(Character.toString(gameBoard.getValue(0,7)));
        letter9.setText(Character.toString(gameBoard.getValue(0,8)));
        letter10.setText(Character.toString(gameBoard.getValue(0,9)));

        letter1.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter1.setTextColor(Color.parseColor("#000000"));
        letter1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter1_counter++;
                if (letter1_counter % 2 != 0){
                    letter1.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter1.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("00");
                    clickedLetters.add(letter1);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter1.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter1.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("00");
                    clickedLetters.remove(letter1);
                }
            }
        });
        letter2.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter2.setTextColor(Color.parseColor("#000000"));
        letter2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter2_counter++;
                if (letter2_counter % 2 != 0){
                    letter2.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter2.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("01");
                    clickedLetters.add(letter2);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter2.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter2.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("01");
                    clickedLetters.remove(letter2);
                }
            }
        });
        letter3.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter3.setTextColor(Color.parseColor("#000000"));
        letter3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter3_counter++;
                if (letter3_counter % 2 != 0){
                    letter3.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter3.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("02");
                    clickedLetters.add(letter3);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter3.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter3.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("02");
                    clickedLetters.remove(letter3);
                }
            }
        });
        letter4.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter4.setTextColor(Color.parseColor("#000000"));
        letter4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter4_counter++;
                if (letter4_counter % 2 != 0){
                    letter4.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter4.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("03");
                    clickedLetters.add(letter4);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter4.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter4.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("03");
                    clickedLetters.remove(letter4);
                }
            }
        });
        letter5.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter5.setTextColor(Color.parseColor("#000000"));
        letter5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter5_counter++;
                if (letter5_counter % 2 != 0){
                    letter5.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter5.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("04");
                    clickedLetters.add(letter5);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter5.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter5.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("04");
                    clickedLetters.remove(letter5);
                }
            }
        });
        letter6.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter6.setTextColor(Color.parseColor("#000000"));
        letter6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter6_counter++;
                if (letter6_counter % 2 != 0){
                    letter6.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter6.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("05");
                    clickedLetters.add(letter6);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter6.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter6.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("05");
                    clickedLetters.remove(letter6);
                }
            }
        });
        letter7.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter7.setTextColor(Color.parseColor("#000000"));
        letter7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter7_counter++;
                if (letter7_counter % 2 != 0){
                    letter7.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter7.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("06");
                    clickedLetters.add(letter7);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter7.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter7.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("06");
                    clickedLetters.remove(letter7);
                }
            }
        });
        letter8.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter8.setTextColor(Color.parseColor("#000000"));
        letter8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter8_counter++;
                if (letter8_counter % 2 != 0){
                    letter8.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter8.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("07");
                    clickedLetters.add(letter8);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter8.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter8.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("07");
                    clickedLetters.remove(letter8);
                }
            }
        });
        letter9.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter9.setTextColor(Color.parseColor("#000000"));
        letter9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter9_counter++;
                if (letter9_counter % 2 != 0){
                    letter9.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter9.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("08");
                    clickedLetters.add(letter9);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter9.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter9.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("08");
                    clickedLetters.remove(letter9);
                }
            }
        });
        letter10.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter10.setTextColor(Color.parseColor("#000000"));
        letter10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter10_counter++;
                if (letter10_counter % 2 != 0){
                    letter10.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter10.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("09");
                    clickedLetters.add(letter10);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter10.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter10.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("09");
                    clickedLetters.remove(letter10);
                }
            }
        });

        //Row2

        letter11.setText(Character.toString(gameBoard.getValue(1,0)));
        letter12.setText(Character.toString(gameBoard.getValue(1,1)));
        letter13.setText(Character.toString(gameBoard.getValue(1,2)));
        letter14.setText(Character.toString(gameBoard.getValue(1,3)));
        letter15.setText(Character.toString(gameBoard.getValue(1,4)));
        letter16.setText(Character.toString(gameBoard.getValue(1,5)));
        letter17.setText(Character.toString(gameBoard.getValue(1,6)));
        letter18.setText(Character.toString(gameBoard.getValue(1,7)));
        letter19.setText(Character.toString(gameBoard.getValue(1,8)));
        letter20.setText(Character.toString(gameBoard.getValue(1,9)));

        letter11.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter11.setTextColor(Color.parseColor("#000000"));
        letter11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter11_counter++;
                if (letter11_counter % 2 != 0){
                    letter11.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter11.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("10");
                    clickedLetters.add(letter11);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter11.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter11.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("10");
                    clickedLetters.remove(letter11);
                }
            }
        });
        letter12.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter12.setTextColor(Color.parseColor("#000000"));
        letter12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter12_counter++;
                if (letter12_counter % 2 != 0){
                    letter12.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter12.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("11");
                    clickedLetters.add(letter12);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter12.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter12.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("11");
                    clickedLetters.remove(letter12);
                }
            }
        });
        letter13.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter13.setTextColor(Color.parseColor("#000000"));
        letter13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter13_counter++;
                if (letter13_counter % 2 != 0){
                    letter13.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter13.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("12");
                    clickedLetters.add(letter13);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter13.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter13.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("12");
                    clickedLetters.remove(letter13);
                }
            }
        });
        letter14.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter14.setTextColor(Color.parseColor("#000000"));
        letter14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter14_counter++;
                if (letter14_counter % 2 != 0){
                    letter14.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter14.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("13");
                    clickedLetters.add(letter14);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter14.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter14.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("13");
                    clickedLetters.remove(letter14);
                }
            }
        });
        letter15.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter15.setTextColor(Color.parseColor("#000000"));
        letter15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter15_counter++;
                if (letter15_counter % 2 != 0){
                    letter15.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter15.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("14");
                    clickedLetters.add(letter15);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter15.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter15.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("14");
                    clickedLetters.remove(letter15);
                }
            }
        });
        letter16.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter16.setTextColor(Color.parseColor("#000000"));
        letter16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter16_counter++;
                if (letter16_counter % 2 != 0){
                    letter16.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter16.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("15");
                    clickedLetters.add(letter16);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter16.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter16.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("15");
                    clickedLetters.remove(letter16);
                }
            }
        });
        letter17.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter17.setTextColor(Color.parseColor("#000000"));
        letter17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter17_counter++;
                if (letter17_counter % 2 != 0){
                    letter17.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter17.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("16");
                    clickedLetters.add(letter17);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter17.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter17.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("16");
                    clickedLetters.remove(letter17);
                }
            }
        });
        letter18.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter18.setTextColor(Color.parseColor("#000000"));
        letter18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter18_counter++;
                if (letter18_counter % 2 != 0){
                    letter18.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter18.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("17");
                    clickedLetters.add(letter18);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter18.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter18.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("17");
                    clickedLetters.remove(letter18);
                }
            }
        });
        letter19.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter19.setTextColor(Color.parseColor("#000000"));
        letter19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter19_counter++;
                if (letter19_counter % 2 != 0){
                    letter19.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter19.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("18");
                    clickedLetters.add(letter19);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter19.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter19.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("18");
                    clickedLetters.remove(letter19);
                }
            }
        });
        letter20.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter20.setTextColor(Color.parseColor("#000000"));
        letter20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter20_counter++;
                if (letter20_counter % 2 != 0){
                    letter20.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter20.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("19");
                    clickedLetters.add(letter20);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter20.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter20.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("19");
                    clickedLetters.remove(letter20);
                }
            }
        });

        //Row 3
        letter21.setText(Character.toString(gameBoard.getValue(2,0)));
        letter22.setText(Character.toString(gameBoard.getValue(2,1)));
        letter23.setText(Character.toString(gameBoard.getValue(2,2)));
        letter24.setText(Character.toString(gameBoard.getValue(2,3)));
        letter25.setText(Character.toString(gameBoard.getValue(2,4)));
        letter26.setText(Character.toString(gameBoard.getValue(2,5)));
        letter27.setText(Character.toString(gameBoard.getValue(2,6)));
        letter28.setText(Character.toString(gameBoard.getValue(2,7)));
        letter29.setText(Character.toString(gameBoard.getValue(2,8)));
        letter30.setText(Character.toString(gameBoard.getValue(2,9)));

        letter21.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter21.setTextColor(Color.parseColor("#000000"));
        letter21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter21_counter++;
                if (letter21_counter % 2 != 0){
                    letter21.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter21.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("20");
                    clickedLetters.add(letter21);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter21.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter21.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("20");
                    clickedLetters.remove(letter21);
                }
            }
        });
        letter22.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter22.setTextColor(Color.parseColor("#000000"));
        letter22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter22_counter++;
                if (letter22_counter % 2 != 0){
                    letter22.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter22.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("21");
                    clickedLetters.add(letter22);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter22.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter22.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("21");
                    clickedLetters.remove(letter22);
                }
            }
        });
        letter23.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter23.setTextColor(Color.parseColor("#000000"));
        letter23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter23_counter++;
                if (letter23_counter % 2 != 0){
                    letter23.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter23.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("22");
                    clickedLetters.add(letter23);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter23.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter23.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("22");
                    clickedLetters.remove(letter23);
                }
            }
        });
        letter24.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter24.setTextColor(Color.parseColor("#000000"));
        letter24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter24_counter++;
                if (letter24_counter % 2 != 0){
                    letter24.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter24.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("23");
                    clickedLetters.add(letter24);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter24.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter24.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("23");
                    clickedLetters.remove(letter24);
                }
            }
        });
        letter25.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter25.setTextColor(Color.parseColor("#000000"));
        letter25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter25_counter++;
                if (letter25_counter % 2 != 0){
                    letter25.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter25.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("24");
                    clickedLetters.add(letter25);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter25.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter25.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("24");
                    clickedLetters.remove(letter25);
                }
            }
        });
        letter26.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter26.setTextColor(Color.parseColor("#000000"));
        letter26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter26_counter++;
                if (letter26_counter % 2 != 0){
                    letter26.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter26.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("25");
                    clickedLetters.add(letter26);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter26.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter26.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("25");
                    clickedLetters.remove(letter26);
                }
            }
        });
        letter27.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter27.setTextColor(Color.parseColor("#000000"));
        letter27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter27_counter++;
                if (letter27_counter % 2 != 0){
                    letter27.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter27.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("26");
                    clickedLetters.add(letter27);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter27.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter27.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("26");
                    clickedLetters.remove(letter27);
                }
            }
        });
        letter28.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter28.setTextColor(Color.parseColor("#000000"));
        letter28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter28_counter++;
                if (letter28_counter % 2 != 0){
                    letter28.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter28.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("27");
                    clickedLetters.add(letter28);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter28.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter28.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("27");
                    clickedLetters.remove(letter28);
                }
            }
        });
        letter29.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter29.setTextColor(Color.parseColor("#000000"));
        letter29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter29_counter++;
                if (letter29_counter % 2 != 0){
                    letter29.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter29.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("28");
                    clickedLetters.add(letter29);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter29.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter29.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("28");
                    clickedLetters.remove(letter29);
                }
            }
        });
        letter30.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter30.setTextColor(Color.parseColor("#000000"));
        letter30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter30_counter++;
                if (letter30_counter % 2 != 0){
                    letter30.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter30.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("29");
                    clickedLetters.add(letter30);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter30.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter30.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("29");
                    clickedLetters.remove(letter30);
                }
            }
        });

        //Row 4
        letter31.setText(Character.toString(gameBoard.getValue(3,0)));
        letter32.setText(Character.toString(gameBoard.getValue(3,1)));
        letter33.setText(Character.toString(gameBoard.getValue(3,2)));
        letter34.setText(Character.toString(gameBoard.getValue(3,3)));
        letter35.setText(Character.toString(gameBoard.getValue(3,4)));
        letter36.setText(Character.toString(gameBoard.getValue(3,5)));
        letter37.setText(Character.toString(gameBoard.getValue(3,6)));
        letter38.setText(Character.toString(gameBoard.getValue(3,7)));
        letter39.setText(Character.toString(gameBoard.getValue(3,8)));
        letter40.setText(Character.toString(gameBoard.getValue(3,9)));

        letter31.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter31.setTextColor(Color.parseColor("#000000"));
        letter31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter31_counter++;
                if (letter31_counter % 2 != 0){
                    letter31.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter31.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("30");
                    clickedLetters.add(letter31);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter31.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter31.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("30");
                    clickedLetters.remove(letter31);
                }
            }
        });
        letter32.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter32.setTextColor(Color.parseColor("#000000"));
        letter32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter32_counter++;
                if (letter32_counter % 2 != 0){
                    letter32.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter32.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("31");
                    clickedLetters.add(letter32);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter32.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter32.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("31");
                    clickedLetters.remove(letter32);
                }
            }
        });
        letter33.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter33.setTextColor(Color.parseColor("#000000"));
        letter33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter33_counter++;
                if (letter33_counter % 2 != 0){
                    letter33.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter33.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("32");
                    clickedLetters.add(letter33);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter33.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter33.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("32");
                    clickedLetters.remove(letter33);
                }
            }
        });
        letter34.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter34.setTextColor(Color.parseColor("#000000"));
        letter34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter34_counter++;
                if (letter34_counter % 2 != 0){
                    letter34.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter34.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("33");
                    clickedLetters.add(letter34);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter34.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter34.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("33");
                    clickedLetters.remove(letter34);
                }
            }
        });
        letter35.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter35.setTextColor(Color.parseColor("#000000"));
        letter35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter35_counter++;
                if (letter35_counter % 2 != 0){
                    letter35.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter35.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("34");
                    clickedLetters.add(letter35);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter35.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter35.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("34");
                    clickedLetters.remove(letter35);
                }
            }
        });
        letter36.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter36.setTextColor(Color.parseColor("#000000"));
        letter36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter36_counter++;
                if (letter36_counter % 2 != 0){
                    letter36.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter36.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("35");
                    clickedLetters.add(letter36);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter36.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter36.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("35");
                    clickedLetters.remove(letter36);
                }
            }
        });
        letter37.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter37.setTextColor(Color.parseColor("#000000"));
        letter37.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter37_counter++;
                if (letter37_counter % 2 != 0){
                    letter37.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter37.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("36");
                    clickedLetters.add(letter37);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter37.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter37.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("36");
                    clickedLetters.remove(letter37);
                }
            }
        });
        letter38.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter38.setTextColor(Color.parseColor("#000000"));
        letter38.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter38_counter++;
                if (letter38_counter % 2 != 0){
                    letter38.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter38.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("37");
                    clickedLetters.add(letter38);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter38.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter38.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("37");
                    clickedLetters.remove(letter38);
                }
            }
        });
        letter39.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter39.setTextColor(Color.parseColor("#000000"));
        letter39.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter39_counter++;
                if (letter39_counter % 2 != 0){
                    letter39.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter39.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("38");
                    clickedLetters.add(letter39);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter39.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter39.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("38");
                    clickedLetters.remove(letter39);
                }
            }
        });
        letter40.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter40.setTextColor(Color.parseColor("#000000"));
        letter40.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter40_counter++;
                if (letter40_counter % 2 != 0){
                    letter40.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter40.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("39");
                    clickedLetters.add(letter40);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter40.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter40.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("39");
                    clickedLetters.remove(letter40);
                }
            }
        });

        //Row 5
        letter41.setText(Character.toString(gameBoard.getValue(4,0)));
        letter42.setText(Character.toString(gameBoard.getValue(4,1)));
        letter43.setText(Character.toString(gameBoard.getValue(4,2)));
        letter44.setText(Character.toString(gameBoard.getValue(4,3)));
        letter45.setText(Character.toString(gameBoard.getValue(4,4)));
        letter46.setText(Character.toString(gameBoard.getValue(4,5)));
        letter47.setText(Character.toString(gameBoard.getValue(4,6)));
        letter48.setText(Character.toString(gameBoard.getValue(4,7)));
        letter49.setText(Character.toString(gameBoard.getValue(4,8)));
        letter50.setText(Character.toString(gameBoard.getValue(4,9)));

        letter41.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter41.setTextColor(Color.parseColor("#000000"));
        letter41.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter41_counter++;
                if (letter41_counter % 2 != 0){
                    letter41.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter41.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("40");
                    clickedLetters.add(letter41);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter41.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter41.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("40");
                    clickedLetters.remove(letter41);
                }
            }
        });
        letter42.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter42.setTextColor(Color.parseColor("#000000"));
        letter42.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter42_counter++;
                if (letter42_counter % 2 != 0){
                    letter42.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter42.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("41");
                    clickedLetters.add(letter42);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter42.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter42.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("41");
                    clickedLetters.remove(letter42);
                }
            }
        });
        letter43.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter43.setTextColor(Color.parseColor("#000000"));
        letter43.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter43_counter++;
                if (letter43_counter % 2 != 0){
                    letter43.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter43.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("42");
                    clickedLetters.add(letter43);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter43.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter43.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("42");
                    clickedLetters.remove(letter43);
                }
            }
        });
        letter44.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter44.setTextColor(Color.parseColor("#000000"));
        letter44.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter44_counter++;
                if (letter44_counter % 2 != 0){
                    letter44.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter44.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("43");
                    clickedLetters.add(letter44);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter44.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter44.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("43");
                    clickedLetters.remove(letter44);
                }
            }
        });
        letter45.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter45.setTextColor(Color.parseColor("#000000"));
        letter45.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter45_counter++;
                if (letter45_counter % 2 != 0){
                    letter45.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter45.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("44");
                    clickedLetters.add(letter45);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter45.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter45.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("44");
                    clickedLetters.remove(letter45);
                }
            }
        });
        letter46.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter46.setTextColor(Color.parseColor("#000000"));
        letter46.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter46_counter++;
                if (letter46_counter % 2 != 0){
                    letter46.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter46.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("45");
                    clickedLetters.add(letter46);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter46.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter46.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("45");
                    clickedLetters.remove(letter46);
                }
            }
        });
        letter47.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter47.setTextColor(Color.parseColor("#000000"));
        letter47.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter47_counter++;
                if (letter47_counter % 2 != 0){
                    letter47.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter47.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("46");
                    clickedLetters.add(letter47);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter47.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter47.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("46");
                    clickedLetters.remove(letter47);
                }
            }
        });
        letter48.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter48.setTextColor(Color.parseColor("#000000"));
        letter48.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter48_counter++;
                if (letter48_counter % 2 != 0){
                    letter48.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter48.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("47");
                    clickedLetters.add(letter48);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter48.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter48.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("47");
                    clickedLetters.remove(letter48);
                }
            }
        });
        letter49.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter49.setTextColor(Color.parseColor("#000000"));
        letter49.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter49_counter++;
                if (letter49_counter % 2 != 0){
                    letter49.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter49.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("48");
                    clickedLetters.add(letter49);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter49.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter49.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("48");
                    clickedLetters.remove(letter49);
                }
            }
        });
        letter50.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter50.setTextColor(Color.parseColor("#000000"));
        letter50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter50_counter++;
                if (letter50_counter % 2 != 0){
                    letter50.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter50.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("49");
                    clickedLetters.add(letter50);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter50.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter50.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("49");
                    clickedLetters.remove(letter50);
                }
            }
        });

        //Row 6
        letter51.setText(Character.toString(gameBoard.getValue(5,0)));
        letter52.setText(Character.toString(gameBoard.getValue(5,1)));
        letter53.setText(Character.toString(gameBoard.getValue(5,2)));
        letter54.setText(Character.toString(gameBoard.getValue(5,3)));
        letter55.setText(Character.toString(gameBoard.getValue(5,4)));
        letter56.setText(Character.toString(gameBoard.getValue(5,5)));
        letter57.setText(Character.toString(gameBoard.getValue(5,6)));
        letter58.setText(Character.toString(gameBoard.getValue(5,7)));
        letter59.setText(Character.toString(gameBoard.getValue(5,8)));
        letter60.setText(Character.toString(gameBoard.getValue(5,9)));

        letter51.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter51.setTextColor(Color.parseColor("#000000"));
        letter51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter51_counter++;
                if (letter51_counter % 2 != 0){
                    letter51.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter51.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("50");
                    clickedLetters.add(letter51);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter51.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter51.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("50");
                    clickedLetters.remove(letter51);
                }
            }
        });
        letter52.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter52.setTextColor(Color.parseColor("#000000"));
        letter52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter52_counter++;
                if (letter52_counter % 2 != 0){
                    letter52.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter52.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("51");
                    clickedLetters.add(letter52);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter52.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter52.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("51");
                    clickedLetters.remove(letter52);
                }
            }
        });
        letter53.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter53.setTextColor(Color.parseColor("#000000"));
        letter53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter53_counter++;
                if (letter53_counter % 2 != 0){
                    letter53.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter53.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("52");
                    clickedLetters.add(letter53);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter53.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter53.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("52");
                    clickedLetters.remove(letter53);
                }
            }
        });
        letter54.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter54.setTextColor(Color.parseColor("#000000"));
        letter54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter54_counter++;
                if (letter54_counter % 2 != 0){
                    letter54.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter54.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("53");
                    clickedLetters.add(letter54);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter54.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter54.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("53");
                    clickedLetters.remove(letter54);
                }
            }
        });
        letter55.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter55.setTextColor(Color.parseColor("#000000"));
        letter55.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter55_counter++;
                if (letter55_counter % 2 != 0){
                    letter55.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter55.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("54");
                    clickedLetters.add(letter55);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter55.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter55.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("54");
                    clickedLetters.remove(letter55);
                }
            }
        });
        letter56.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter56.setTextColor(Color.parseColor("#000000"));
        letter56.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter56_counter++;
                if (letter56_counter % 2 != 0){
                    letter56.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter56.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("55");
                    clickedLetters.add(letter56);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter56.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter56.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("55");
                    clickedLetters.remove(letter56);
                }
            }
        });
        letter57.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter57.setTextColor(Color.parseColor("#000000"));
        letter57.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter57_counter++;
                if (letter57_counter % 2 != 0){
                    letter57.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter57.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("56");
                    clickedLetters.add(letter57);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter57.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter57.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("56");
                    clickedLetters.remove(letter57);
                }
            }
        });
        letter58.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter58.setTextColor(Color.parseColor("#000000"));
        letter58.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter58_counter++;
                if (letter58_counter % 2 != 0){
                    letter58.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter58.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("57");
                    clickedLetters.add(letter58);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter58.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter58.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("57");
                    clickedLetters.remove(letter58);
                }
            }
        });
        letter59.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter59.setTextColor(Color.parseColor("#000000"));
        letter59.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter59_counter++;
                if (letter59_counter % 2 != 0){
                    letter59.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter59.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("58");
                    clickedLetters.add(letter59);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter59.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter59.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("58");
                    clickedLetters.remove(letter59);
                }
            }
        });
        letter60.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter60.setTextColor(Color.parseColor("#000000"));
        letter60.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter60_counter++;
                if (letter60_counter % 2 != 0){
                    letter60.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter60.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("59");
                    clickedLetters.add(letter60);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter60.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter60.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("59");
                    clickedLetters.remove(letter60);
                }
            }
        });

        //Row 7
        letter61.setText(Character.toString(gameBoard.getValue(6,0)));
        letter62.setText(Character.toString(gameBoard.getValue(6,1)));
        letter63.setText(Character.toString(gameBoard.getValue(6,2)));
        letter64.setText(Character.toString(gameBoard.getValue(6,3)));
        letter65.setText(Character.toString(gameBoard.getValue(6,4)));
        letter66.setText(Character.toString(gameBoard.getValue(6,5)));
        letter67.setText(Character.toString(gameBoard.getValue(6,6)));
        letter68.setText(Character.toString(gameBoard.getValue(6,7)));
        letter69.setText(Character.toString(gameBoard.getValue(6,8)));
        letter70.setText(Character.toString(gameBoard.getValue(6,9)));

        letter61.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter61.setTextColor(Color.parseColor("#000000"));
        letter61.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter61_counter++;
                if (letter61_counter % 2 != 0){
                    letter61.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter61.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("60");
                    clickedLetters.add(letter61);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter61.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter61.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("60");
                    clickedLetters.remove(letter61);
                }
            }
        });
        letter62.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter62.setTextColor(Color.parseColor("#000000"));
        letter62.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter62_counter++;
                if (letter62_counter % 2 != 0){
                    letter62.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter62.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("61");
                    clickedLetters.add(letter62);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter62.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter62.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("61");
                    clickedLetters.remove(letter62);
                }
            }
        });
        letter63.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter63.setTextColor(Color.parseColor("#000000"));
        letter63.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter63_counter++;
                if (letter63_counter % 2 != 0){
                    letter63.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter63.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("62");
                    clickedLetters.add(letter63);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter63.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter63.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("62");
                    clickedLetters.remove(letter63);
                }
            }
        });
        letter64.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter64.setTextColor(Color.parseColor("#000000"));
        letter64.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter64_counter++;
                if (letter64_counter % 2 != 0){
                    letter64.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter64.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("63");
                    clickedLetters.add(letter64);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter64.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter64.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("63");
                    clickedLetters.remove(letter64);
                }
            }
        });
        letter65.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter65.setTextColor(Color.parseColor("#000000"));
        letter65.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter65_counter++;
                if (letter65_counter % 2 != 0){
                    letter65.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter65.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("64");
                    clickedLetters.add(letter65);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter65.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter65.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("64");
                    clickedLetters.remove(letter65);
                }
            }
        });
        letter66.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter66.setTextColor(Color.parseColor("#000000"));
        letter66.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter66_counter++;
                if (letter66_counter % 2 != 0){
                    letter66.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter66.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("65");
                    clickedLetters.add(letter66);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter66.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter66.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("65");
                    clickedLetters.remove(letter66);
                }
            }
        });
        letter67.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter67.setTextColor(Color.parseColor("#000000"));
        letter67.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter67_counter++;
                if (letter67_counter % 2 != 0){
                    letter67.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter67.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("66");
                    clickedLetters.add(letter67);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter67.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter67.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("66");
                    clickedLetters.remove(letter67);
                }
            }
        });
        letter68.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter68.setTextColor(Color.parseColor("#000000"));
        letter68.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter68_counter++;
                if (letter68_counter % 2 != 0){
                    letter68.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter68.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("67");
                    clickedLetters.add(letter68);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter68.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter68.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("67");
                    clickedLetters.remove(letter68);
                }
            }
        });
        letter69.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter69.setTextColor(Color.parseColor("#000000"));
        letter69.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter69_counter++;
                if (letter69_counter % 2 != 0){
                    letter69.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter69.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("68");
                    clickedLetters.add(letter69);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter69.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter69.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("68");
                    clickedLetters.remove(letter69);
                }
            }
        });
        letter70.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter70.setTextColor(Color.parseColor("#000000"));
        letter70.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter70_counter++;
                if (letter70_counter % 2 != 0){
                    letter70.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter70.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("69");
                    clickedLetters.add(letter70);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter70.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter70.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("69");
                    clickedLetters.remove(letter70);
                }
            }
        });

        //Row 8
        letter71.setText(Character.toString(gameBoard.getValue(7,0)));
        letter72.setText(Character.toString(gameBoard.getValue(7,1)));
        letter73.setText(Character.toString(gameBoard.getValue(7,2)));
        letter74.setText(Character.toString(gameBoard.getValue(7,3)));
        letter75.setText(Character.toString(gameBoard.getValue(7,4)));
        letter76.setText(Character.toString(gameBoard.getValue(7,5)));
        letter77.setText(Character.toString(gameBoard.getValue(7,6)));
        letter78.setText(Character.toString(gameBoard.getValue(7,7)));
        letter79.setText(Character.toString(gameBoard.getValue(7,8)));
        letter80.setText(Character.toString(gameBoard.getValue(7,9)));

        letter71.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter71.setTextColor(Color.parseColor("#000000"));
        letter71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter71_counter++;
                if (letter71_counter % 2 != 0){
                    letter71.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter71.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("70");
                    clickedLetters.add(letter71);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter71.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter71.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("70");
                    clickedLetters.remove(letter71);
                }
            }
        });
        letter72.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter72.setTextColor(Color.parseColor("#000000"));
        letter72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter72_counter++;
                if (letter72_counter % 2 != 0){
                    letter72.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter72.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("71");
                    clickedLetters.add(letter72);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter72.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter72.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("71");
                    clickedLetters.remove(letter72);
                }
            }
        });
        letter73.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter73.setTextColor(Color.parseColor("#000000"));
        letter73.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter73_counter++;
                if (letter73_counter % 2 != 0){
                    letter73.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter73.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("72");
                    clickedLetters.add(letter73);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter73.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter73.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("72");
                    clickedLetters.remove(letter73);
                }
            }
        });
        letter74.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter74.setTextColor(Color.parseColor("#000000"));
        letter74.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter74_counter++;
                if (letter74_counter % 2 != 0){
                    letter74.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter74.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("73");
                    clickedLetters.add(letter74);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter74.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter74.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("73");
                    clickedLetters.remove(letter74);
                }
            }
        });
        letter75.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter75.setTextColor(Color.parseColor("#000000"));
        letter75.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter75_counter++;
                if (letter75_counter % 2 != 0){
                    letter75.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter75.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("74");
                    clickedLetters.add(letter75);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter75.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter75.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("74");
                    clickedLetters.remove(letter75);
                }
            }
        });
        letter76.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter76.setTextColor(Color.parseColor("#000000"));
        letter76.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter76_counter++;
                if (letter76_counter % 2 != 0){
                    letter76.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter76.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("75");
                    clickedLetters.add(letter76);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter76.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter76.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("75");
                    clickedLetters.remove(letter76);
                }
            }
        });
        letter77.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter77.setTextColor(Color.parseColor("#000000"));
        letter77.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter77_counter++;
                if (letter77_counter % 2 != 0){
                    letter77.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter77.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("76");
                    clickedLetters.add(letter77);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter77.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter77.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("76");
                    clickedLetters.remove(letter77);
                }
            }
        });
        letter78.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter78.setTextColor(Color.parseColor("#000000"));
        letter78.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter78_counter++;
                if (letter78_counter % 2 != 0){
                    letter78.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter78.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("77");
                    clickedLetters.add(letter78);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter78.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter78.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("77");
                    clickedLetters.remove(letter78);
                }
            }
        });
        letter79.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter79.setTextColor(Color.parseColor("#000000"));
        letter79.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter79_counter++;
                if (letter79_counter % 2 != 0){
                    letter79.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter79.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("78");
                    clickedLetters.add(letter79);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter79.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter79.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("78");
                    clickedLetters.remove(letter79);
                }
            }
        });
        letter80.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter80.setTextColor(Color.parseColor("#000000"));
        letter80.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter80_counter++;
                if (letter80_counter % 2 != 0){
                    letter80.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter80.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("79");
                    clickedLetters.add(letter80);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter80.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter80.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("79");
                    clickedLetters.remove(letter80);
                }
            }
        });

        //Row 9
        letter81.setText(Character.toString(gameBoard.getValue(8,0)));
        letter82.setText(Character.toString(gameBoard.getValue(8,1)));
        letter83.setText(Character.toString(gameBoard.getValue(8,2)));
        letter84.setText(Character.toString(gameBoard.getValue(8,3)));
        letter85.setText(Character.toString(gameBoard.getValue(8,4)));
        letter86.setText(Character.toString(gameBoard.getValue(8,5)));
        letter87.setText(Character.toString(gameBoard.getValue(8,6)));
        letter88.setText(Character.toString(gameBoard.getValue(8,7)));
        letter89.setText(Character.toString(gameBoard.getValue(8,8)));
        letter90.setText(Character.toString(gameBoard.getValue(8,9)));

        letter81.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter81.setTextColor(Color.parseColor("#000000"));
        letter81.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter81_counter++;
                if (letter81_counter % 2 != 0){
                    letter81.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter81.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("80");
                    clickedLetters.add(letter81);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter81.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter81.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("80");
                    clickedLetters.remove(letter81);
                }
            }
        });
        letter82.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter82.setTextColor(Color.parseColor("#000000"));
        letter82.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter82_counter++;
                if (letter82_counter % 2 != 0){
                    letter82.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter82.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("81");
                    clickedLetters.add(letter82);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter82.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter82.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("81");
                    clickedLetters.remove(letter82);
                }
            }
        });
        letter83.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter83.setTextColor(Color.parseColor("#000000"));
        letter83.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter83_counter++;
                if (letter83_counter % 2 != 0){
                    letter83.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter83.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("82");
                    clickedLetters.add(letter83);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter83.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter83.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("82");
                    clickedLetters.remove(letter83);
                }
            }
        });
        letter84.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter84.setTextColor(Color.parseColor("#000000"));
        letter84.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter84_counter++;
                if (letter84_counter % 2 != 0){
                    letter84.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter84.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("83");
                    clickedLetters.add(letter84);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter84.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter84.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("83");
                    clickedLetters.remove(letter84);
                }
            }
        });
        letter85.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter85.setTextColor(Color.parseColor("#000000"));
        letter85.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter85_counter++;
                if (letter85_counter % 2 != 0){
                    letter85.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter85.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("84");
                    clickedLetters.add(letter85);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter85.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter85.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("84");
                    clickedLetters.remove(letter85);
                }
            }
        });
        letter86.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter86.setTextColor(Color.parseColor("#000000"));
        letter86.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter86_counter++;
                if (letter86_counter % 2 != 0){
                    letter86.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter86.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("85");
                    clickedLetters.add(letter86);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter86.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter86.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("85");
                    clickedLetters.remove(letter86);
                }
            }
        });
        letter87.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter87.setTextColor(Color.parseColor("#000000"));
        letter87.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter87_counter++;
                if (letter87_counter % 2 != 0){
                    letter87.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter87.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("86");
                    clickedLetters.add(letter87);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter87.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter87.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("86");
                    clickedLetters.remove(letter87);
                }
            }
        });
        letter88.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter88.setTextColor(Color.parseColor("#000000"));
        letter88.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter88_counter++;
                if (letter88_counter % 2 != 0){
                    letter88.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter88.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("87");
                    clickedLetters.add(letter88);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter88.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter88.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("87");
                    clickedLetters.remove(letter88);
                }
            }
        });
        letter89.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter89.setTextColor(Color.parseColor("#000000"));
        letter89.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter89_counter++;
                if (letter89_counter % 2 != 0){
                    letter89.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter89.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("88");
                    clickedLetters.add(letter89);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter89.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter89.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("88");
                    clickedLetters.remove(letter89);
                }
            }
        });
        letter90.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter90.setTextColor(Color.parseColor("#000000"));
        letter90.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter90_counter++;
                if (letter90_counter % 2 != 0){
                    letter90.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter90.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("89");
                    clickedLetters.add(letter90);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter90.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter90.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("89");
                    clickedLetters.remove(letter90);
                }
            }
        });

        //Row 10
        letter91.setText(Character.toString(gameBoard.getValue(9,0)));
        letter92.setText(Character.toString(gameBoard.getValue(9,1)));
        letter93.setText(Character.toString(gameBoard.getValue(9,2)));
        letter94.setText(Character.toString(gameBoard.getValue(9,3)));
        letter95.setText(Character.toString(gameBoard.getValue(9,4)));
        letter96.setText(Character.toString(gameBoard.getValue(9,5)));
        letter97.setText(Character.toString(gameBoard.getValue(9,6)));
        letter98.setText(Character.toString(gameBoard.getValue(9,7)));
        letter99.setText(Character.toString(gameBoard.getValue(9,8)));
        letter100.setText(Character.toString(gameBoard.getValue(9,9)));

        letter91.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter91.setTextColor(Color.parseColor("#000000"));
        letter91.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter91_counter++;
                if (letter91_counter % 2 != 0){
                    letter91.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter91.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("90");
                    clickedLetters.add(letter91);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter91.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter91.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("90");
                    clickedLetters.remove(letter91);
                }
            }
        });
        letter92.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter92.setTextColor(Color.parseColor("#000000"));
        letter92.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter92_counter++;
                if (letter92_counter % 2 != 0){
                    letter92.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter92.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("91");
                    clickedLetters.add(letter92);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter92.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter92.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("91");
                    clickedLetters.remove(letter92);
                }
            }
        });
        letter93.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter93.setTextColor(Color.parseColor("#000000"));
        letter93.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter93_counter++;
                if (letter93_counter % 2 != 0){
                    letter93.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter93.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("92");
                    clickedLetters.add(letter93);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter93.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter93.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("92");
                    clickedLetters.remove(letter93);
                }
            }
        });
        letter94.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter94.setTextColor(Color.parseColor("#000000"));
        letter94.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter94_counter++;
                if (letter94_counter % 2 != 0){
                    letter94.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter94.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("93");
                    clickedLetters.add(letter94);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter94.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter94.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("93");
                    clickedLetters.remove(letter94);
                }
            }
        });
        letter95.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter95.setTextColor(Color.parseColor("#000000"));
        letter95.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter95_counter++;
                if (letter95_counter % 2 != 0){
                    letter95.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter95.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("94");
                    clickedLetters.add(letter95);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter95.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter95.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("94");
                    clickedLetters.remove(letter95);
                }
            }
        });
        letter96.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter96.setTextColor(Color.parseColor("#000000"));
        letter96.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter96_counter++;
                if (letter96_counter % 2 != 0){
                    letter96.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter96.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("95");
                    clickedLetters.add(letter96);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter96.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter96.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("95");
                    clickedLetters.remove(letter96);
                }
            }
        });
        letter97.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter97.setTextColor(Color.parseColor("#000000"));
        letter97.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter97_counter++;
                if (letter97_counter % 2 != 0){
                    letter97.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter97.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("96");
                    clickedLetters.add(letter97);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter97.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter97.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("96");
                    clickedLetters.remove(letter97);
                }
            }
        });
        letter98.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter98.setTextColor(Color.parseColor("#000000"));
        letter98.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter98_counter++;
                if (letter98_counter % 2 != 0){
                    letter98.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter98.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("97");
                    clickedLetters.add(letter98);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter98.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter98.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("97");
                    clickedLetters.remove(letter98);
                }
            }
        });
        letter99.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter99.setTextColor(Color.parseColor("#000000"));
        letter99.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter99_counter++;
                if (letter99_counter % 2 != 0){
                    letter99.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter99.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("98");
                    clickedLetters.add(letter99);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter99.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter99.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("98");
                    clickedLetters.remove(letter99);
                }
            }
        });
        letter100.setBackgroundColor(Color.parseColor("#FFFFFF"));
        letter100.setTextColor(Color.parseColor("#000000"));
        letter100.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick (View v) {
                letter100_counter++;
                if (letter100_counter % 2 != 0){
                    letter100.setBackgroundColor(Color.parseColor("#3DDC84"));
                    letter100.setTextColor(Color.parseColor("#FFFFFF"));
                    clickedLocations.add("99");
                    clickedLetters.add(letter100);
                    if (wordClicked(clickedLetters, gameBoard, clickedLocations)){
                        clickedLetters.clear();
                        clickedLocations.clear();
                        wordComplete(wordcounter);
                    }
                }
                else{
                    letter100.setBackgroundColor(Color.parseColor("#FFFFFF"));
                    letter100.setTextColor(Color.parseColor("#000000"));
                    clickedLocations.remove("99");
                    clickedLetters.remove(letter100);
                }
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Board gameBoard = createGameBoard();

        play(gameBoard);
    }

}
