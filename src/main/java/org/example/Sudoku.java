package org.example;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Sudoku {

    public static final int GRILLE_LENGTH = 9;

    private int[][] grille =  new int[GRILLE_LENGTH][GRILLE_LENGTH];

    public int[][] chargerGrille(File fichier) throws IOException {
        try (Scanner scanner = new Scanner(fichier)) {
            int row;
            int column;
            int value;
            while (scanner.hasNextLine()) {
                String ligne = scanner.nextLine();
                for (String group : ligne.split(" ")) {
                    row = Character.getNumericValue(group.charAt(0));
                    column = Character.getNumericValue(group.charAt(1));
                    value = Character.getNumericValue(group.charAt(2));
                    grille[row][column] = value;
                }
            }
        }
        return grille;
    }

    public void afficherGrille(){
        for(int i = 0; i< GRILLE_LENGTH; i++){
            for(int j = 0; j< GRILLE_LENGTH; j++){
                System.out.print(grille[i][j]+ "  ");
            }
            System.out.println();
        }
    }

}
