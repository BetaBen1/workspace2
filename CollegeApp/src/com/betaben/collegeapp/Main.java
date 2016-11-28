package com.betaben.collegeapp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField firstNameTxt;
	private JTextField lastNameTxt;
	private JTextField ageTxt;
	private JTextField GPATxt;
	
	public String firstName;
	public String lastName;
	public String age;
	public String GPA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		firstNameTxt = new JTextField();
		firstNameTxt.setBounds(263, 16, 130, 26);
		contentPane.add(firstNameTxt);
		firstNameTxt.setColumns(10);
		
		lastNameTxt = new JTextField();
		lastNameTxt.setBounds(244, 54, 130, 26);
		contentPane.add(lastNameTxt);
		lastNameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setBounds(202, 103, 130, 26);
		contentPane.add(ageTxt);
		ageTxt.setColumns(10);
		
		GPATxt = new JTextField();
		GPATxt.setBounds(212, 132, 130, 26);
		contentPane.add(GPATxt);
		GPATxt.setColumns(10);
		
		JLabel firstNameLbl = new JLabel("First Name:");
		firstNameLbl.setBounds(150, 21, 82, 16);
		contentPane.add(firstNameLbl);
		
		JLabel lastNameLbl = new JLabel("Last Name:");
		lastNameLbl.setBounds(150, 54, 82, 16);
		contentPane.add(lastNameLbl);
		
		JLabel ageLbl = new JLabel("Age:");
		ageLbl.setBounds(150, 108, 72, 16);
		contentPane.add(ageLbl);
		
		JLabel GPALbl = new JLabel("GPA:");
		GPALbl.setBounds(148, 137, 61, 16);
		contentPane.add(GPALbl);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(16, 176, 117, 29);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				firstName = firstNameTxt.getText();
				lastName = lastNameTxt.getText();
				age = ageTxt.getText();
				GPA = GPATxt.getText();
				System.out.println(firstName);
				System.out.println(lastName);
				System.out.println(age);
				System.out.println(GPA);
			}
		});
		contentPane.add(submitBtn);
		
	}
}
