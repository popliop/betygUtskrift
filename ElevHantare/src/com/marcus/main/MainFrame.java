package com.marcus.main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class MainFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public MainFrame() {
		
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 535, 401);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("File");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmSpara = new JMenuItem("Spara");
		mntmSpara.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("spara");
			}
		});
		mnNewMenu.add(mntmSpara);
		
		JMenuItem mntmLadda = new JMenuItem("Ladda");
		mnNewMenu.add(mntmLadda);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(1);
			}
		});
		mnNewMenu.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnSkapaElev = new JButton("Skapa Elev");
		btnSkapaElev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SkapaDialog dialog = new SkapaDialog();
				dialog.setEnabled(true);
				dialog.setVisible(true);
				
			}
		});
		btnSkapaElev.setBounds(420, 320, 89, 23);
		contentPane.add(btnSkapaElev);
		
		JButton btnVljElev = new JButton("V\u00E4lj Elev");
		btnVljElev.setBounds(420, 286, 89, 23);
		contentPane.add(btnVljElev);
		
		JTextArea textArea = new JTextArea();
		textArea.setEnabled(false);
		textArea.setBounds(10, 11, 400, 298);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(10, 321, 301, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(321, 320, 89, 23);
		contentPane.add(btnOk);
	}
}
