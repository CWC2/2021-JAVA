package Student.Car;

import javax.swing.*;

public class CarGUI {
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new CarGUI().mainPanel);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

}
