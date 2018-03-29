package teamcitycli.gui;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class MainWindow {
    Panel panel;
    MultiWindowTextGUI gui;
    BasicWindow window;

    public MainWindow() throws IOException {
        initGui();

        BasicWindow window = new BasicWindow();
        panel = new Panel();

        initPanel();
    }

    private void initPanel() {
        panel.setLayoutManager(new LinearLayout());

        panel.addComponent(new Label("Hi there"));
        panel.addComponent(new TextBox());
    }

    private void initGui() throws IOException {
        Terminal terminal = new DefaultTerminalFactory().createTerminal();
        Screen screen = new TerminalScreen(terminal);
        screen.startScreen();

        gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLACK));
    }

    public void show() {
        gui.addWindowAndWait(window);
    }
}
