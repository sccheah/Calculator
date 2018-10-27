package calculator.controller;

import calculator.model.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ClearOperation extends Operation {
    public ClearOperation(Calculator calculator, JTextField output) {
        super(calculator, output);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        calculator.clear();
        output.setText(Integer.toString(calculator.getValue()));
    }
}
