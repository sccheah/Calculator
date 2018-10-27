package calculator.view;

import calculator.controller.*;
import calculator.model.Calculator;

import javax.swing.*;
import java.awt.*;

class OperationPanel extends JPanel {
    private Calculator calculator;
    private JTextField output;
    private JTextField input;

    OperationPanel(JTextField input, JTextField output) {
        super(new GridLayout(1, 3));
        this.calculator = new Calculator();
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
