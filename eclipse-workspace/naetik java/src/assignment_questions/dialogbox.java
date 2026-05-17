package assignment_questions;

import java.awt.*;
import java.awt.event.*;

public class dialogbox {

	dialogbox() {

		Frame f = new Frame();

		Dialog d = new Dialog(f, "Dialog Box", true);

		d.setSize(300, 200);

		Button b = new Button("Close");

		b.setBounds(100, 100, 80, 30);

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				d.setVisible(false);
			}
		});

		d.add(b);

		f.setSize(400, 400);

		f.setLayout(null);

		f.setVisible(true);

		d.setLayout(null);

		d.setVisible(true);
	}

	public static void main(String args[]) {

		new dialogbox();
	}

}
