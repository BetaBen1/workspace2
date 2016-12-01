package com.betaben.collegeapp;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import nebulous.tools.DataHandler;

public class Main extends JFrame {

	private JPanel contentPane;
	JLabel displayLbl = new JLabel("");
	JLabel firstNameLbl = new JLabel("First Name:");
	JLabel lastNameLbl = new JLabel("Last Name:");
	JLabel ageLbl = new JLabel("Age:");
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
		firstNameTxt.setBounds(124, 6, 320, 30);
		contentPane.add(firstNameTxt);
		firstNameTxt.setColumns(10);
		
		lastNameTxt = new JTextField();
		lastNameTxt.setBounds(124, 42, 320, 30);
		contentPane.add(lastNameTxt);
		lastNameTxt.setColumns(10);
		
		ageTxt = new JTextField();
		ageTxt.setBounds(124, 78, 320, 30);
		contentPane.add(ageTxt);
		ageTxt.setColumns(10);
		
		GPATxt = new JTextField();
		GPATxt.setBounds(124, 114, 320, 30);
		contentPane.add(GPATxt);
		GPATxt.setColumns(10);
		
		firstNameLbl.setBounds(6, 6, 215, 30);
		contentPane.add(firstNameLbl);
		
		lastNameLbl.setBounds(6, 42, 203, 30);
		contentPane.add(lastNameLbl);
		
		ageLbl.setBounds(6, 78, 203, 30);
		contentPane.add(ageLbl);
		
		JLabel GPALbl = new JLabel("GPA:");
		GPALbl.setBounds(6, 114, 203, 30);
		contentPane.add(GPALbl);
		
		displayLbl.setBounds(6, 156, 438, 40);
		contentPane.add(displayLbl);
		
		JButton submitBtn = new JButton("Submit");
		submitBtn.setBounds(6, 202, 438, 70);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				submit();
			}
		});
		contentPane.add(submitBtn);
		
		contentPane.addKeyListener(new KeyListener() {
			@Override
			public void keyPressed(KeyEvent e){
				if(e.getKeyCode()==(KeyEvent.VK_ENTER)){
						submit();
				}
			}
			@Override
			public void keyReleased(KeyEvent e){
				
			}
			@Override
			public void keyTyped(KeyEvent e) {
				if(e.getKeyCode()==KeyEvent.VK_ENTER){
					submit();
				}
			}
		});
		
		contentPane.getRootPane().setDefaultButton(submitBtn);
		
	}
	
	public void submit(){
		firstName = firstNameTxt.getText();
		lastName = lastNameTxt.getText();
		age = ageTxt.getText();
		GPA = GPATxt.getText();
		displayLbl.setText("Your information was successfully saved!");
		DataHandler.save("First Name", "./res/text.txt", firstName);
		DataHandler.save("Last Name", "./res/text.txt", lastName);
		DataHandler.save("Age", "./res/text.txt", age);
		DataHandler.save("GPA", "./res/text.txt", GPA);
	}
}
