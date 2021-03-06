package betaben.realserverhawkanddove;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {

	private JPanel contentPane;

	JLabel lblLabel;
	JToggleButton tglbtnHawk;
	JToggleButton tglbtnDove;
	JButton btnSend;
	
	public static String choice = null;
	
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
		setBounds(100, 100, 750, 750);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblLabel = new JLabel("Choose your poison:");
		lblLabel.setFont(new Font("Lucida Blackletter", Font.PLAIN, 48));
		lblLabel.setBounds(6, 6, 738, 74);
		lblLabel.setHorizontalAlignment(JLabel.CENTER);
		contentPane.add(lblLabel);
		
		tglbtnHawk = new JToggleButton("Hawk");
		tglbtnHawk.setFont(new Font("Desdemona", Font.PLAIN, 36));
		tglbtnHawk.setBounds(6, 92, 366, 500);
		tglbtnHawk.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				tglbtnDove.setSelected(false);
			}
		});
		contentPane.add(tglbtnHawk);
		
		tglbtnDove = new JToggleButton("Dove");
		tglbtnDove.setFont(new Font("Desdemona", Font.PLAIN, 36));
		tglbtnDove.setBounds(378, 92, 366, 500);
		tglbtnDove.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				tglbtnHawk.setSelected(false);
			}
		});
		contentPane.add(tglbtnDove);
		
		btnSend = new JButton("Send");
		btnSend.setFont(new Font("Stencil", Font.PLAIN, 36));
		btnSend.setBounds(175, 604, 400, 118);
		btnSend.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				if(tglbtnHawk.isSelected()){
					choice = "hawk";
					lblLabel.setText("You have chosen hawk.");
				}
				else if(tglbtnDove.isSelected()){
					choice = "dove";
					lblLabel.setText("You have chosen dove.");
				}
				else{
					lblLabel.setText("You must select one.");
				}
			}
		});
		contentPane.add(btnSend);
		
		//runThread();
	}
	
	public void runThread(){
		Thread thread = new Thread(){
			@Override
			public void run(){
				while(true){
					if(tglbtnHawk.isSelected()){
						tglbtnDove.setSelected(false);
					}
					if(tglbtnDove.isSelected()){
						tglbtnHawk.setSelected(false);
					}
					try {
						sleep(50);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		thread.start();
	}
}
