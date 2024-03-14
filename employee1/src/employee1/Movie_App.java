package employee1;
//kfjghfjkd
//gjfhgjhf
//gjfgh
//jkfgjukfb
import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Label;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Movie_App {

	private JFrame frame;
	private JTextField n1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Movie_App window = new Movie_App();
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
	public Movie_App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 675, 326);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Book Your Show");
		lblNewLabel_1.setFont(new Font("Dialog", Font.ITALIC, 20));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(255, 11, 169, 42);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name : ");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(105, 83, 64, 26);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Movie Name : ");
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2_1.setBounds(71, 125, 118, 26);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("No Of Tickets :");
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_2_1_1.setBounds(71, 169, 118, 26);
		frame.getContentPane().add(lblNewLabel_2_1_1);
		
		n1 = new JTextField();
		n1.setBounds(226, 84, 118, 26);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		
		
		JComboBox m1 = new JComboBox();
		m1.setFont(new Font("Dialog", Font.ITALIC, 12));
		m1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Your Name", "Demon Slayer", "Rezero", "Chainsaw Man"}));
		m1.setBounds(226, 130, 118, 26);
		frame.getContentPane().add(m1);
		
		JComboBox t1 = new JComboBox();
		t1.setFont(new Font("Dialog", Font.ITALIC, 12));
		t1.setModel(new DefaultComboBoxModel(new String[] {"No Of Tickets", "1", "2", "3", "4", "5"}));
		t1.setBounds(226, 174, 118, 26);
		frame.getContentPane().add(t1);
		
		
		
		JLabel b1 = new JLabel("");
		b1.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\7.jpg"));
		b1.setBounds(0, 0, 649, 287);
		frame.getContentPane().add(b1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int amount = 0;
				String name = n1.getText();
				String moviename = (String) m1.getSelectedItem();
				String tickets = (String) t1.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				
				if(moviename.equals("Your Name")) {
					amount = amount + (150*nt);
				}
				if(moviename.equals("Demon Slayer")) {
					amount = amount + (200*nt);
				}
				if(moviename.equals("Rezero")) {
					amount = amount + (100*nt);
				}
				if(moviename.equals("Chainsaw Man")) {
					amount = amount + (100*nt);
				}
				int res = 0;
				res = JOptionPane.showConfirmDialog(btnNewButton,"Name : " + name + "\n Movie Name : " + moviename+ "\n No Of Tickets : " + tickets+ "\n Amount : "+amount);
				
				int YES_OPTION = 0;
				
				if(res==YES_OPTION) {
					JOptionPane.showMessageDialog(btnNewButton,"Booking Confirmed");
				}
				else {
					JOptionPane.showMessageDialog(btnNewButton,"Booking Canceled");
				}
			}
		});
		btnNewButton.setFont(new Font("Dialog", Font.ITALIC, 18));
		btnNewButton.setBounds(284, 228, 118, 26);
		frame.getContentPane().add(btnNewButton);
	}
}
