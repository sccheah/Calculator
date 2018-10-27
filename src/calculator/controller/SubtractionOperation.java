package calculator.controller;

import calculator.model.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class SubtractionOperation extends Operation {
    public SubtractionOperation(Calculator calculator, JTextField input, JTextField output) {
        super(calculator, input, output);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int inputNumber = Integer.parseInt(input.getText());
        calculator.subtract(inputNumber);
        output.setText(Integer.toString(calculator.getValue()));
    }
}
