package calculator.view;

import calculator.controller.*;
import calculator.model.Calculator;

import javax.swing.*;
import java.awt.*;

public class OperationPanel extends JPanel {
    private Calculator calculator;
    private JTextField output;
    private JTextField input;

    public OperationPanel(Calculator calculator, JTextField input, JTextField output) {
        super(new GridLayout(1, 3));
        this.calculator = calculator;
        this.input = input;
        this.output = output;
        createComponents();
    }

    private void createComponents() {
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton clearButton = new JButton("Z");

        Operation additionOperation = new AdditionOperation(calculator, input, output);
        Operation subtractionOperation = new SubtractionOperation(calculator, input, output);
        Operation clearOperation = new ClearOperation(calculator, output);

        plusButton.addActionListener(additionOperation);
        minusButton.addActionListener(subtractionOperation);
        clearButton.addActionListener(clearOperation);

        add(plusButton);
        add(minusButton);
        add(clearButton);
    }

}
