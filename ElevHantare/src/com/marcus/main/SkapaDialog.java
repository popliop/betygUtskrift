package com.marcus.main;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SkapaDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JTextField txtNamn;
	private JTextField txtElevnr;

	/**
	 * Create the dialog.
	 */
	public SkapaDialog() {

		setModalityType(ModalityType.APPLICATION_MODAL);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		
		setModalExclusionType(ModalExclusionType.APPLICATION_EXCLUDE);
		setType(Type.POPUP);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 291, 209);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		setLocationRelativeTo(null);
		setTitle("Skapa Elev");
		{
			txtNamn = new JTextField();
			txtNamn.setBounds(58, 38, 186, 20);
			contentPanel.add(txtNamn);
			txtNamn.setColumns(10);
		}

		JLabel lblNamn = new JLabel("Namn:");
		lblNamn.setBounds(10, 41, 38, 14);
		contentPanel.add(lblNamn);

		txtElevnr = new JTextField();
		txtElevnr.setBounds(58, 83, 186, 20);
		contentPanel.add(txtElevnr);
		txtElevnr.setColumns(10);

		JLabel lblElevnr = new JLabel("Elevnr:");
		lblElevnr.setBounds(10, 86, 46, 14);
		contentPanel.add(lblElevnr);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
