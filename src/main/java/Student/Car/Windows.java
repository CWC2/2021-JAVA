package Student.Car;

import javax.swing.*;

public class Windows {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    private static int AnyTester =400;
    //int AnyTester = 500;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(WIDTH,AnyTester);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
}
