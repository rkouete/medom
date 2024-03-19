package org.example;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        File partie1 = new File("/Users/gabriel/IdeaProjects/Sudoku/src/main/resources/partie1.txt");
        Sudoku sudoku = new Sudoku();
        sudoku.chargerGrille(partie1);
        sudoku.afficherGrille();
    }
}