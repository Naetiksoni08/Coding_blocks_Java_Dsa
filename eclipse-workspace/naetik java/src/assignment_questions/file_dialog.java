package assignment_questions;

import java.awt.*;
import java.awt.event.*;

public class file_dialog {

	file_dialog() {

		Frame f = new Frame();

		Button b = new Button("Open File");

		b.setBounds(100, 100, 100, 30);

		b.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				FileDialog fd = new FileDialog(f, "Select File", FileDialog.LOAD);

				fd.setVisible(true);
			}
		});

		f.add(b);

		f.setSize(400, 400);

		f.setLayout(null);

		f.setVisible(true);
	}

	public static void main(String args[]) {

		new file_dialog();
	}

}
