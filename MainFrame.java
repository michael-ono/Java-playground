
import javax.swing.JFrame;

public class MainFrame extends JFrame {
    public void init() {
        setTitle("Welcome");
        setSize(450, 300);
    }

    public static void main(String[] args) {

        MainFrame myframe = new MainFrame();
        myframe.init();
    }
}
