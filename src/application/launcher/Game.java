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
        return temp;
    }

    public void launchGame() throws Exception {
//        String processString = parsePath();
//        System.out.println("processed String: " + processString);
//        try {
//            //Process p = Runtime.getRuntime().exec("\"/ProgramData/Microsoft/Windows/Start Menu/Programs/Riot Games\"");
////            Process p = Runtime.getRuntime().exec("\"" + processString + "\"");
//            System.out.println("path: " + path);
//            Process p = Runtime.getRuntime().exec(path);
//            p.waitFor();
//            System.out.println(name + " launched!");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        String processString = parsePath();
        Runtime.getRuntime().exec("\"C:/Program%20Files%20(x86)/Steam/steamapps/common/Tom%20Clancy's%20Rainbow%20Six%20Siege/RainbowSix.exe\"");
    }
}
