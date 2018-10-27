package calculator.controller;

import calculator.model.Calculator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class Operation implements ActionListener {
    Calculator calculator;
    JTextField input;
    JTextField output;

    public Operation(Calculator calculator, JTextField input, JTextField output) {
        this.calculator = calculator;
        this.input = input;
        this.output = output;
    }

    public Operation(Calculator calculator, JTextField output) {
        this.calculator = calculator;
        this.output = output;
        this.input = null;
    }

    @Override
    public abstract void actionPerformed(ActionEvent ae);
}
