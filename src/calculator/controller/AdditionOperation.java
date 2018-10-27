package calculator.controller;

import calculator.model.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class AdditionOperation extends Operation {
    public AdditionOperation(Calculator calculator, JTextField input, JTextField output) {
        super(calculator, input, output);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int inputNumber = Integer.parseInt(input.getText());
        calculator.add(inputNumber);
        output.setText(Integer.toString(calculator.getValue()));
    }
}
