package draughts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Save {
    private Object g;
    private Object board;

    public Save(Draughts g) throws Exception {
        this.g = g;
        // this.board = b;
        // Runner run = new Runner();
        File save = new File("SavedGame.txt");
        FileOutputStream fos = new FileOutputStream(save);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.g);
        // oos.writeObject(this.board);
        oos.close();
        System.out.println("Save Successful");

    }

}
