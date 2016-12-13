package com.betaben.collegeapp;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import nebulous.tools.DataHandler;
import nebulous.tools.ImageUtils;

public class Main extends JFrame {

	//Initialize all JFrame items
	
	private JPanel contentPane;
	
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	
	JScrollPane familyScrollPane = new JScrollPane();
	JPanel profilePanel = new JPanel();
	JPanel familyPanel = new JPanel();
	JLabel profileGPALbl = new JLabel("GPA:");
	JLabel familyGPALbl = new JLabel("GPA:");
	JPanel familyScrollPanel = new JPanel();
	JPanel profileImagePanel = new JPanel();
	JPanel familyImagePanel = new JPanel();
	
	JButton profileSubmitBtn = new JButton("Submit");
	JButton familySubmitBtn = new JButton("Submit");
	JButton profileBtnOpenImage = new JButton("Open Image");
	JButton familyBtnOpenImage = new JButton("Open Image");

	private JLabel profileImageLabel;
	private JLabel familyImageLabel;
	
	JLabel profileDisplayLbl = new JLabel("");
	JLabel familyDisplayLbl = new JLabel("");
	JLabel profileFirstNameLbl = new JLabel("First Name:");
	JLabel profileLastNameLbl = new JLabel("Last Name:");
	JLabel familyFirstNameLbl = new JLabel("First Name:");
	JLabel familyLastNameLbl = new JLabel("Last Name:");
	JLabel profileAgeLbl = new JLabel("Age:");
	JLabel familyAgeLbl = new JLabel("Age:");
	
	private JTextField profileFirstNameTxt;
	private JTextField familyFirstNameTxt;
	private JTextField profileLastNameTxt;
	private JTextField familyLastNameTxt;
	private JTextField profileAgeTxt;
	private JTextField familyAgeTxt;
	private JTextField profileGPATxt;
	private JTextField familyGPATxt;

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

	public Main() {

		Main box = this;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		contentPane.setLayout(null);
		familyPanel.setLayout(null);
	
		familyScrollPanel.setLayout(null);
		
		familyScrollPanel.setPreferredSize(new Dimension(188, 1000));
		familyScrollPanel.setLayout(null);
		
		familyScrollPane.setBounds(404, 6, 207, 1004);
		familyScrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		familyScrollPane.setViewportView(familyScrollPanel);
		familyPanel.add(familyScrollPane);
		
		tabbedPane.setBounds(6, 6, 638, 572);
		profilePanel.setLayout(null);
		familyPanel.setLayout(null);
		
		profileFirstNameTxt = new JTextField();
		profileFirstNameTxt.setBounds(74, 21, 130, 26);
		profileFirstNameTxt.setColumns(10);
		profilePanel.add(profileFirstNameTxt);
		
		familyFirstNameTxt = new JTextField();
		familyFirstNameTxt.setBounds(74, 21, 130, 26);
		familyFirstNameTxt.setColumns(10);
		familyPanel.add(familyFirstNameTxt);
		
		profileLastNameTxt = new JTextField();
		profileLastNameTxt.setBounds(74, 59, 130, 26);
		profileLastNameTxt.setColumns(10);
		profilePanel.add(profileLastNameTxt);
		
		familyLastNameTxt = new JTextField();
		familyLastNameTxt.setBounds(74, 59, 130, 26);
		familyLastNameTxt.setColumns(10);
		familyPanel.add(familyLastNameTxt);
		
		profileAgeTxt = new JTextField();
		profileAgeTxt.setBounds(74, 97, 130, 26);
		profileAgeTxt.setColumns(10);
		profilePanel.add(profileAgeTxt);
		
		familyAgeTxt = new JTextField();
		familyAgeTxt.setBounds(74, 97, 130, 26);
		familyAgeTxt.setColumns(10);
		familyPanel.add(familyAgeTxt);
		
		profileGPATxt = new JTextField();
		profileGPATxt.setBounds(74, 135, 130, 26);
		profileGPATxt.setColumns(10);
		profilePanel.add(profileGPATxt);
		
		familyGPATxt = new JTextField();
		familyGPATxt.setBounds(74, 135, 130, 26);
		familyGPATxt.setColumns(10);
		familyPanel.add(familyGPATxt);
		
		profileFirstNameLbl.setBounds(6, 6, 217, 40);
		profilePanel.add(profileFirstNameLbl);
		
		profileLastNameLbl.setBounds(6, 52, 217, 40);
		profilePanel.add(profileLastNameLbl);
		
		familyFirstNameLbl.setBounds(6, 21, 217, 26);
		familyPanel.add(familyFirstNameLbl);
		
		familyLastNameLbl.setBounds(6, 58, 217, 26);
		familyPanel.add(familyLastNameLbl);
		
		profileAgeLbl.setBounds(33, 101, 28, 16);
		profilePanel.add(profileAgeLbl);
		
		familyAgeLbl.setBounds(33, 101, 28, 16);
		familyPanel.add(familyAgeLbl);
		
		profileGPALbl.setBounds(33, 140, 29, 16);
		profilePanel.add(profileGPALbl);
		
		familyGPALbl.setBounds(33, 140, 29, 16);
		familyPanel.add(familyGPALbl);
		
		profileDisplayLbl.setBounds(6, 411, 390, 35);
		profilePanel.add(profileDisplayLbl);
		
		familyDisplayLbl.setBounds(6, 413, 397, 35);
		familyPanel.add(familyDisplayLbl);
		
		profileSubmitBtn.setBounds(6, 448, 396, 72);
		profileSubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				profileSubmit();
				profileDisplayLbl.setText("Your information was saved.");
			}
		});
		profilePanel.add(profileSubmitBtn);
		
		familySubmitBtn.setBounds(6, 448, 397, 72);
		familySubmitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				familySubmit();
				familyDisplayLbl.setText("Your information was saved.");
				FamilyMemberPanel panel = new FamilyMemberPanel(familyFirstNameTxt.getText(), familyLastNameTxt.getText(), familyAgeTxt.getText(), familyGPATxt.getText());
				familyScrollPanel.add(panel);
				FamilyMemberPanel.familyMemberYPos += panel.getHeight()+5;
				familyScrollPanel.repaint();
				familyScrollPanel.revalidate();
				familyScrollPane.repaint();
				familyScrollPane.revalidate();
				contentPane.repaint();
				contentPane.revalidate();
				
			}
		});
		familyPanel.add(familySubmitBtn);
		
		//contentPane.getRootPane().setDefaultButton(profileSubmitBtn);
		
		profileImagePanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		profileImagePanel.setBounds(33, 185, 153, 192);
		profilePanel.add(profileImagePanel);
		
		
		profileBtnOpenImage.setBounds(30, 377, 119, 29);
		profileBtnOpenImage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setVisible(true);
				chooser.showOpenDialog(box);
				java.io.File file = chooser.getSelectedFile();
				try{
					BufferedImage image = ImageIO.read(file);
					image = ImageUtils.resizeImage(image, profileImagePanel.getWidth()-4, profileImagePanel.getHeight()-4);
					ImageIcon icon = new ImageIcon(image);
					profileImageLabel = new JLabel(icon);
					profileImagePanel.add(profileImageLabel);
					profileImagePanel.revalidate();
					profileImagePanel.repaint();
					DataHandler.save("Profile Image", "./res/text.txt", file.getAbsolutePath());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		profilePanel.add(profileBtnOpenImage);
		
		familyImagePanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		familyImagePanel.setBounds(33, 185, 153, 192);
		familyPanel.add(familyImagePanel);
		
		familyBtnOpenImage.setBounds(31, 378, 119, 29);
		familyBtnOpenImage.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setVisible(true);
				chooser.showOpenDialog(box);
				java.io.File file = chooser.getSelectedFile();
				try{
					BufferedImage image = ImageIO.read(file);
					image = ImageUtils.resizeImage(image, familyImagePanel.getWidth()-4, familyImagePanel.getHeight()-4);
					ImageIcon icon = new ImageIcon(image);
					familyImageLabel = new JLabel(icon);
					familyImagePanel.add(familyImageLabel);
					familyImagePanel.revalidate();
					familyImagePanel.repaint();
					DataHandler.save("Family Member Image", "./res/text.txt", file.getAbsolutePath());
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				
			}
		});
		familyPanel.add(familyBtnOpenImage);
		
		tabbedPane.addTab("Profile", profilePanel);
		tabbedPane.addTab("Family", familyPanel);
		contentPane.add(tabbedPane);
		
		load();
		
	}
	
	public void profileSubmit(){
		profileDisplayLbl.setText("Your information was successfully saved!");
		DataHandler.save("Profile First Name", "./res/text.txt", profileFirstNameTxt.getText());
		DataHandler.save("Profile Last Name", "./res/text.txt", profileLastNameTxt.getText());
		DataHandler.save("Profile Age", "./res/text.txt", profileAgeTxt.getText());
		DataHandler.save("Profile GPA", "./res/text.txt", profileGPATxt.getText());
	}
	
	public void familySubmit(){
		familyDisplayLbl.setText("Your information was successfully saved!");
		DataHandler.save("Family Member First Name", "./res/text.txt", familyFirstNameTxt.getText());
		DataHandler.save("Family Member Last Name", "./res/text.txt", familyLastNameTxt.getText());
		DataHandler.save("Family Member Age", "./res/text.txt", familyAgeTxt.getText());
		DataHandler.save("Family Member GPA", "./res/text.txt", familyGPATxt.getText());
	}
	
	public void load(){
		profileFirstNameTxt.setText((String)DataHandler.read("Profile First Name", "./res/text.txt"));
		profileLastNameTxt.setText((String)DataHandler.read("Profile Last Name", "./res/text.txt"));
		profileAgeTxt.setText((String)DataHandler.read("Profile Age", "./res/text.txt"));
		profileGPATxt.setText((String)DataHandler.read("Profile GPA", "./res/text.txt"));
		familyFirstNameTxt.setText((String)DataHandler.read("Family Member First Name", "./res/text.txt"));
		familyLastNameTxt.setText((String)DataHandler.read("Family Member Last Name", "./res/text.txt"));
		familyAgeTxt.setText((String)DataHandler.read("Family Member Age", "./res/text.txt"));
		familyGPATxt.setText((String)DataHandler.read("Family Member GPA", "./res/text.txt"));
		try{
	        BufferedImage image = ImageIO.read(new java.io.File((String)DataHandler.read("Profile Image", "./res/text.txt")));
	        image = ImageUtils.resizeImage(image, profileImagePanel.getWidth() - 4, profileImagePanel.getHeight() - 10);
	        ImageIcon icon = new ImageIcon(image);
	        profileImageLabel = new JLabel(icon);
	        profileImagePanel.add(profileImageLabel);
	        profileImagePanel.revalidate();
	        profileImagePanel.repaint();
	        
	        BufferedImage familyImage = ImageIO.read(new java.io.File((String)DataHandler.read("Family Member Image", "./res/text.txt")));
	        familyImage = ImageUtils.resizeImage(familyImage, familyImagePanel.getWidth() - 4, familyImagePanel.getHeight() - 10);
	        ImageIcon familyIcon = new ImageIcon(familyImage);
	        familyImageLabel = new JLabel(familyIcon);
	        familyImagePanel.add(familyImageLabel);
	        familyImagePanel.revalidate();
	        familyImagePanel.repaint();
	        
	    } catch (Exception e) {
	    	profileImageLabel = new JLabel("None");
	        familyImageLabel = new JLabel("None");
	    }
	}
	
}
