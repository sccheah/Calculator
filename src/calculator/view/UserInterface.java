package calculator.view;

import calculator.model.Calculator;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable {
    private JFrame frame;

    public UserInterface() { }

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3, 1));

        JTextField outputField = new JTextField("0");
        outputField.setEnabled(false);

        JTextField inputField = new JTextField();

        container.add(outputField);
        container.add(inputField);
        container.add(new OperationPanel(inputField, outputField));
    }
}
