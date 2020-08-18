package application.launcher;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private String path;

    public Game(String name, String path) {
        this.name = name;
        this.path = path;
    }

    public void launchGame() throws Exception {
        try {
            Process p = Runtime.getRuntime().exec(path);
            p.waitFor();
            System.out.println(name + " has launched!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
