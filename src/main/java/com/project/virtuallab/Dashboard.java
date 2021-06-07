package com.project.virtuallab;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSplitPane;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.JList;
import java.awt.GridBagLayout;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class Dashboard {

	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashboard window = new Dashboard();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Dashboard() {
		initialize();
	}


	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setDividerSize(0);
		splitPane.setDividerLocation(150);
		frame.getContentPane().add(splitPane, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(150, 150, 150));
		splitPane.setLeftComponent(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(150, 150, 150));
		panel.add(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 0, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton createRoomBtn = new JButton("Create Room");
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 0);
		gbc_btnNewButton.gridx = 0;
		gbc_btnNewButton.gridy = 0;
		panel_1.add(createRoomBtn, gbc_btnNewButton);
		
		JButton joinRoomBtn = new JButton("   Join Room   ");
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.gridx = 0;
		gbc_btnNewButton_1.gridy = 1;
		panel_1.add(joinRoomBtn, gbc_btnNewButton_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBackground(new Color(150, 150, 150));
		splitPane.setRightComponent(tabbedPane);
		
		RoomDetail room = new RoomDetail();
		DefaultListModel<JPanel> roomModel = new DefaultListModel<JPanel>();
		roomModel.addElement(room.initialize());
		roomModel.addElement(room.initialize());

		
		JList<JPanel> roomList = new JList<JPanel>(roomModel);
		roomList.setCellRenderer(new DasboardPanelListRenderer());
		roomList.setFixedCellHeight(50);
		roomList.setBackground(new Color(105, 105, 105));
		tabbedPane.addTab("Room History", null, roomList, null);
		
		
		CodeSubmissionDetail code = new CodeSubmissionDetail();
		DefaultListModel<JPanel> codeModel = new DefaultListModel<JPanel>();
		codeModel.addElement(code.initialize());
		codeModel.addElement(code.initialize());
		
		JList<JPanel> codeList = new JList<JPanel>(codeModel);
		codeList.setCellRenderer(new DasboardPanelListRenderer());
		codeList.setFixedCellHeight(50);
		codeList.setBackground(new Color(105, 105, 105));
		tabbedPane.addTab("Code Submission", null, codeList, null);
		
	}
	
}
