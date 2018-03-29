package teamcitycli;

import teamcitycli.gui.MainWindow;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        MainWindow w;
        try {
             w = new MainWindow();
        } catch (IOException e) {
            System.out.println("smth went wrong");
            System.out.println(e);
            return;
        }

        w.show();
    }
}
