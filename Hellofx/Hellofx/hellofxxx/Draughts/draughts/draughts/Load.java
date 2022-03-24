package draughts;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Load {
    private Draughts g;
    private Square[][] board;
    Object obj;

    public Load(String f) throws Exception {
        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);
        obj = ois.readObject();

        this.g = (Draughts) obj;
        ois.close();
    }

    public Draughts getLoad() {
        return g;
    }

    public Square[][] getBoard() {
        return board;
    }
}
