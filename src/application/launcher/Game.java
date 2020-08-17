package application.launcher;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Game {
    private String name;
    private String path;

    public Game(String name, String path) {
        this.name = name;
        this.path = path;
    }

    private String parsePath() {
        String temp = "";

        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == '\\') {
                temp = temp + '/';
            }
            else {
                temp = temp + path.charAt(i);
            }
        }
        return (String)temp;
    }

    public void launchGame() throws Exception {
        String processString = parsePath();
        System.out.println("processed String: " + processString);
        try {
            //Process p = Runtime.getRuntime().exec("\"/ProgramData/Microsoft/Windows/Start Menu/Programs/Riot Games\"");
//            Process p = Runtime.getRuntime().exec("\"" + processString + "\"");
            System.out.println("path: " + path);
            Process p = Runtime.getRuntime().exec(path);
            p.waitFor();
            System.out.println(name + " launched!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
