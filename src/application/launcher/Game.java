package application.launcher;

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
