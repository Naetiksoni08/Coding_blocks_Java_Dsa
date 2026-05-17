package assignment_questions;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login_window_program extends Frame implements ActionListener {

	Label l1, l2;
	TextField t1, t2;
	Button b1;

	// Constructor
	login_window_program() {

		// Create labels
		l1 = new Label("Username:");
		l2 = new Label("Password:");

		// Create text fields
		t1 = new TextField();
		t2 = new TextField();

		// Hide password characters
		t2.setEchoChar('*');

		// Create button
		b1 = new Button("Login");

		// Set positions
		l1.setBounds(50, 50, 80, 30);
		t1.setBounds(150, 50, 100, 30);

		l2.setBounds(50, 100, 80, 30);
		t2.setBounds(150, 100, 100, 30);

		b1.setBounds(100, 160, 80, 30);

		// Add components
		add(l1);
		add(t1);

		add(l2);
		add(t2);

		add(b1);

		b1.addActionListener(this);
		// Frame settings
		setSize(300, 250);
		setTitle("Login Window");
		setLayout(null);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		System.out.println("Login Clicked");
	}

	public static void main(String[] args) {

		new login_window_program();
	}
}
