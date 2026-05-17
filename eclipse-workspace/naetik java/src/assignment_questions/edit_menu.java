package assignment_questions;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class edit_menu extends Frame implements ActionListener {

    JTextArea ta;

    MenuBar mb;
    Menu edit;

    MenuItem cut, copy, paste, selectAll;

    edit_menu() {

        // Text Area
        ta = new JTextArea();

        // Menu Bar
        mb = new MenuBar();

        // Edit Menu
        edit = new Menu("Edit");

        // Menu Items
        cut = new MenuItem("Cut");
        copy = new MenuItem("Copy");
        paste = new MenuItem("Paste");
        selectAll = new MenuItem("Select All");

        // Add menu items
        edit.add(cut);
        edit.add(copy);
        edit.add(paste);
        edit.add(selectAll);

        // Add menu to menu bar
        mb.add(edit);

        // Set menu bar
        setMenuBar(mb);

        // Layout
        setLayout(new BorderLayout());

        // Add text area
        add(ta, BorderLayout.CENTER);

        // Action listeners
        cut.addActionListener(this);
        copy.addActionListener(this);
        paste.addActionListener(this);
        selectAll.addActionListener(this);

        // Frame settings
        setSize(400, 300);
        setTitle("Simple Notepad");
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == cut) {
            ta.cut();
        }

        if(e.getSource() == copy) {
            ta.copy();
        }

        if(e.getSource() == paste) {
            ta.paste();
        }

        if(e.getSource() == selectAll) {
            ta.selectAll();
        }
    }

    public static void main(String[] args) {

        new edit_menu();
    }
}
