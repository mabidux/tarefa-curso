package borderlayout;

import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {
        BorderLayoutFrame frame = new BorderLayoutFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
    
}
