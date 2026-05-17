package assignment_questions;

import java.awt.*;

public class panel_example {

	panel_example() {

		Frame f = new Frame();

		Panel p = new Panel();

		Button b = new Button("Click");

		p.add(b);

		f.add(p);

		f.setSize(300, 300);

		f.setVisible(true);
	}

	public static void main(String args[]) {

		new panel_example();
	}
}
