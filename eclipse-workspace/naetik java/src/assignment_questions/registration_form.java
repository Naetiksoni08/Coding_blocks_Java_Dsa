package assignment_questions;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class registration_form extends Frame implements ActionListener {

	Label l1, l2, l3, l4;

	TextField t1, t2, t3;

	Checkbox male, female;

	CheckboxGroup genderGroup;

	Button b1;

	registration_form() {

		// Labels
		l1 = new Label("Name:");
		l2 = new Label("Email:");
		l3 = new Label("Password:");
		l4 = new Label("Gender:");

		// TextFields
		t1 = new TextField();
		t2 = new TextField();
		t3 = new TextField();

		// Hide password
		t3.setEchoChar('*');

		// Radio buttons using CheckboxGroup
		genderGroup = new CheckboxGroup();

		male = new Checkbox("Male", genderGroup, false);
		female = new Checkbox("Female", genderGroup, false);

		// Button
		b1 = new Button("Register");

		// Set positions
		l1.setBounds(50, 50, 80, 30);
		t1.setBounds(150, 50, 150, 30);

		l2.setBounds(50, 100, 80, 30);
		t2.setBounds(150, 100, 150, 30);

		l3.setBounds(50, 150, 80, 30);
		t3.setBounds(150, 150, 150, 30);

		l4.setBounds(50, 200, 80, 30);

		male.setBounds(150, 200, 80, 30);
		female.setBounds(220, 200, 80, 30);

		b1.setBounds(120, 260, 100, 30);

		// Add components
		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(l3);
		add(t3);

		add(l4);

		add(male);
		add(female);

		add(b1);
		b1.addActionListener(this);

		// Frame settings
		setSize(400, 350);
		setTitle("Registration Form");
		setLayout(null);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Successfully Registered!!");
	}

	public static void main(String[] args) {

		new registration_form();
	}


}
