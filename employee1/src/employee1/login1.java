package employee1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.Label;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login1 {

	private JFrame frame;
	private JTextField Tb1;
	private JPasswordField P1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login1 window = new login1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(173, 255, 47));
		frame.setBounds(400, 200, 400, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("Name");
		label.setFont(new Font("Dialog", Font.ITALIC, 16));
		label.setAlignment(Label.CENTER);
		label.setBounds(55, 83, 62, 36);
		frame.getContentPane().add(label);
		
		Label label_1 = new Label("Password");
		label_1.setAlignment(Label.CENTER);
		label_1.setFont(new Font("Dialog", Font.ITALIC, 16));
		label_1.setBounds(36, 144, 107, 36);
		frame.getContentPane().add(label_1);
		
		Tb1 = new JTextField();
		Tb1.setBounds(149, 89, 116, 30);
		frame.getContentPane().add(Tb1);
		Tb1.setColumns(10);
		
		Label label_2 = new Label("Login Page ");
		label_2.setAlignment(Label.CENTER);
		label_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		label_2.setBounds(114, 21, 151, 36);
		frame.getContentPane().add(label_2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setBackground(new Color(135, 206, 250));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = Tb1.getText();
				String password = P1.getText();
//				JOptionPane.showMessageDialog(btnNewButton, "Name : " + name + "\n Password : " + password);
				if(name.equals("Hari Kumar ") && password.equals("123456789")){
					JOptionPane.showMessageDialog(btnNewButton, "Valid User");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton, "Invalid User");
				}
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.BOLD, 12));
		btnNewButton.setBounds(152, 211, 86, 25);
		frame.getContentPane().add(btnNewButton);
		P1 = new JPasswordField();
		P1.setBounds(149, 150, 116, 30);
		frame.getContentPane().add(P1);
	}
}
