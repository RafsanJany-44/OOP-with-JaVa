package myProjectNotepad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.filechooser.*;

public class Project_Notepad extends JFrame implements ActionListener {

	JTextArea area;
	JScrollPane pane;
	String text;

	Project_Notepad() {
		setBounds(0, 0, 1950, 1050);
		JMenuBar menubar = new JMenuBar();

		JMenu file = new JMenu("File");

		JMenuItem newdoc = new JMenuItem("New");
		newdoc.addActionListener(this);

		JMenuItem open = new JMenuItem("Open");
		open.addActionListener(this);

		JMenuItem save = new JMenuItem("Save");
		save.addActionListener(this);

		JMenuItem print = new JMenuItem("Print");
		print.addActionListener(this);

		JMenuItem exit = new JMenuItem("Exit");
		exit.addActionListener(this);

		file.add(newdoc);
		file.add(open);
		file.add(save);
		file.add(print);
		file.add(exit);

		JMenu edit = new JMenu("Edit");

		JMenuItem copy = new JMenuItem("Copy");
		copy.addActionListener(this);

		JMenuItem paste = new JMenuItem("Paste");
		paste.addActionListener(this);

		JMenuItem cut = new JMenuItem("Cut");
		cut.addActionListener(this);

		JMenuItem selectall = new JMenuItem("Select All");
		selectall.addActionListener(this);

		edit.add(copy);
		edit.add(paste);
		edit.add(cut);
		edit.add(selectall);

		JMenu help = new JMenu("Help");
		JMenuItem about = new JMenuItem("About the Notepad");
		about.addActionListener(this);
		help.add(about);

		menubar.add(file);
		menubar.add(edit);
		menubar.add(help);

		setJMenuBar(menubar);

		area = new JTextArea();
		area.setFont(new Font("SAN_SERIF", Font.PLAIN, 20));
		area.setLineWrap(true);
		area.setWrapStyleWord(true);

		pane = new JScrollPane(area);
		pane.setBorder(BorderFactory.createEmptyBorder());
		add(pane, BorderLayout.CENTER);

	}

	public void actionPerformed(ActionEvent ae) {
		if (ae.getActionCommand().equals("New")) {
			area.setText("");
		} else if (ae.getActionCommand().equals("Open")) {
			JFileChooser chooser = new JFileChooser();
			chooser.setAcceptAllFileFilterUsed(false);
			FileNameExtensionFilter restrict = new FileNameExtensionFilter("Only .txt files", "txt");
			chooser.addChoosableFileFilter(restrict);

			int action = chooser.showOpenDialog(this);
			if (action != JFileChooser.APPROVE_OPTION) {
				return;
			}

			File file = chooser.getSelectedFile();
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				area.read(reader, null);
			} catch (Exception e) {

			}
		} else if (ae.getActionCommand().equals("Save")) {
			JFileChooser saveas = new JFileChooser();
			saveas.setApproveButtonText("Save");
			int action = saveas.showOpenDialog(this);
			if (action != JFileChooser.APPROVE_OPTION) {
				return;
			}
			File filename = new File(saveas.getSelectedFile() + ".txt");
			BufferedWriter outFile = null;

			try {
				outFile = new BufferedWriter(new FileWriter(filename));
				area.write(outFile);
			} catch (Exception e) {

			}
		} else if (ae.getActionCommand().equals("Print")) {
			try {
				area.print();
			} catch (Exception e) {

			}
		} else if (ae.getActionCommand().equals("Exit")) {
			System.exit(0);
		} else if (ae.getActionCommand().equals("Copy")) {
			text = area.getSelectedText();
		} else if (ae.getActionCommand().equals("Paste")) {
			area.insert(text, area.getCaretPosition());
		} else if (ae.getActionCommand().equals("Cut")) {
			text = area.getSelectedText();
			area.replaceRange("", area.getSelectionStart(), area.getSelectionEnd());
		} else if (ae.getActionCommand().equals("Select All")) {
			area.selectAll();
		} else if (ae.getActionCommand().equals("About the Notepad")) {
			new About().setVisible(true);
		}
	}

	public static void main(String[] args) {
		new Project_Notepad().setVisible(true);

	}

}
