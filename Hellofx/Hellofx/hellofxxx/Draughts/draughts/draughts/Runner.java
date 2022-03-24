package draughts;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Runner implements Serializable {
    private static Draughts g;
    // private static GUI gui;

    public static void main(String args[]) throws Exception {
        // gui = new GUI(args);
        // GUI.launch(args);
        BufferedReader originDebug = new BufferedReader(new InputStreamReader(System.in));
        String originDebu = originDebug.readLine();

        if (originDebu.equals("New")) {
            g = new Draughts();
            g.play("x", "y");
            // launch(args);
        }

        else if (originDebu.equals("Load")) {
            // BufferedReader originDebug1 = new BufferedReader(new
            // InputStreamReader(System.in));
            // String originDebu1 = originDebug1.readLine();
            try {
                Load l = new Load("SavedGame.txt");
                g = l.getLoad();
                System.out.println("Load Successful");
                g.play("x", "y");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

        }
    }

    public Draughts getGame() {
        return g;
    }

    public void setGame(Draughts g) {
        this.g = g;
    }

    public CheckerBoard getGameBoard() {
        return g.b;
    }

}
