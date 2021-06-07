package com.project.virtuallab;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CodeSubmissionDetail {


	public JPanel initialize() {
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(400, 20));
		panel.setLayout(null);
		
		ImageIcon roomIcon = new ImageIcon(new ImageIcon(getClass().getResource("/code.png")).getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		JLabel lblNewLabel = new JLabel("ABC Submitted his submission for room \"Meeting Room\"");
		lblNewLabel.setIcon(roomIcon);
		lblNewLabel.setBounds(0, 0, 600, 30);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("6 June 2021");
		lblNewLabel_1.setBounds(40, 29, 300, 15);
		lblNewLabel_1.setFont(new Font("Verdana", Font.PLAIN, 10));
		panel.add(lblNewLabel_1);
		
		return panel;
		
	}
}
