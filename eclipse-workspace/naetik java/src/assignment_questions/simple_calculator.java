package assignment_questions;


import java.awt.*;
import java.awt.event.*;

public class simple_calculator extends Frame implements ActionListener {

	Label l1, l2;

	TextField t1, t2;

	Button add, sub, mul, div;

	simple_calculator() {

		// Labels
		l1 = new Label("First Number:");
		l2 = new Label("Second Number:");

		// TextFields
		t1 = new TextField();
		t2 = new TextField();

		// Buttons
		add = new Button("Add");
		sub = new Button("Subtract");
		mul = new Button("Multiply");
		div = new Button("Divide");

		// Set positions
		l1.setBounds(50, 50, 100, 30);
		t1.setBounds(170, 50, 100, 30);

		l2.setBounds(50, 100, 100, 30);
		t2.setBounds(170, 100, 100, 30);

		add.setBounds(50, 170, 80, 30);
		sub.setBounds(130, 170, 80, 30);
		mul.setBounds(210, 170, 80, 30);
		div.setBounds(290, 170, 80, 30);

		// Add components
		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(add);
		add(sub);
		add(mul);
		add(div);

		// Add ActionListeners
		add.addActionListener(this);
		sub.addActionListener(this);
		mul.addActionListener(this);
		div.addActionListener(this);

		// Frame settings
		setSize(420, 250);
		setTitle("Simple Calculator");
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {

		int num1 = Integer.parseInt(t1.getText());
		int num2 = Integer.parseInt(t2.getText());

		if (e.getSource() == add) {

			System.out.println("Addition = " + (num1 + num2));
		}

		if (e.getSource() == sub) {

			System.out.println("Subtraction = " + (num1 - num2));
		}

		if (e.getSource() == mul) {

			System.out.println("Multiplication = " + (num1 * num2));
		}

		if (e.getSource() == div) {

			System.out.println("Division = " + (num1 / num2));
		}
	}

	public static void main(String[] args) {

		new simple_calculator();
	}

}
