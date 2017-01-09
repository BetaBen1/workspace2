package com.betaben.server;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	JLabel display = new JLabel("");
	JTextArea textArea = new JTextArea();
	JScrollPane scrollPane = new JScrollPane();
	JButton btnSend = new JButton("Send");
	
	private String username = "BetaBen";

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
	 * @throws Exception 
	 */
	public Main() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		String ip = "10.1.15.254";
		short port = 31415;
		
		UserClient client = new UserClient(new Socket(ip, port), this);
		client.start();
		
		textField = new JTextField();
		textField.setBounds(6, 293, 309, 29);
		textField.setBorder(new LineBorder(Color.black));
		contentPane.add(textField);
		textField.setColumns(10);
		
		display.setBounds(6, 258, 438, 23);
		contentPane.add(display);
		
		btnSend.setBounds(327, 294, 117, 29);
		btnSend.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				if(textField.getText().isEmpty()){
					//display.setText("Your message must have content to be sent.");
				}
				else{
					//display.setText("Your message was successfully sent.");
					try {
						client.send("[" + username + "] " +  textField.getText());
						textField.setText("");
					} catch (IOException e1) {
						e1.printStackTrace();
					}
				}

			}
		});
		contentPane.add(btnSend);
		
		contentPane.getRootPane().setDefaultButton(btnSend);
		
		scrollPane.setBounds(6, 6, 438, 240);
		contentPane.add(scrollPane);
		
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);

		Thread thread = new Thread(){
			@Override
			public void run() {
				while(true){
					if(textField.getText().isEmpty()){
						btnSend.setEnabled(false);
					}
					else {
						btnSend.setEnabled(true);
					}
				}
			}
		};
		thread.start();
		
	}
	
	public void write(String data) {
	    textArea.append(data);
	}
	
}
