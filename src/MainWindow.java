import javax.swing.*;


public class MainWindow extends JFrame {

    public MainWindow(){
        setTitle("Apokalipso");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800,800);

        add(new GameField());
        setVisible(true);
        add(new CommonWall());
    }

    public static void main(String[] args) {

        MainWindow mw = new MainWindow();
    }
}
