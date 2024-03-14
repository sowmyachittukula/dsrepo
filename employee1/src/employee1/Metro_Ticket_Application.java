package employee1;
//12345
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Metro_Ticket_Application {

	private JFrame frame;
	private JTextField n1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Metro_Ticket_Application window = new Metro_Ticket_Application();
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
	public Metro_Ticket_Application() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 430, 256);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		JLabel lblNewLabel_4 = new JLabel("Nums");
		lblNewLabel_4.setBackground(new Color(255, 255, 255));
		lblNewLabel_4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_4.setBounds(235, 165, 63, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_3 = new JLabel("Destination");
		lblNewLabel_3.setForeground(new Color(0, 0, 0));
		lblNewLabel_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_3.setBounds(208, 129, 90, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_2 = new JLabel("Source");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_2.setBounds(220, 90, 63, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setBounds(220, 56, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("Metro Ticket Booking");
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(192, 11, 203, 33);
		frame.getContentPane().add(lblNewLabel);
		
		n1 = new JTextField();
		n1.setBounds(299, 55, 96, 15);
		frame.getContentPane().add(n1);
		n1.setColumns(10);
		
		JComboBox s1 = new JComboBox();
		s1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "AMEERPET", "PUNJAGUTTA", "METTUGUDA", "MAISAMMAGUDA"}));
		s1.setBounds(299, 92, 96, 18);
		frame.getContentPane().add(s1);
		
		JComboBox d1 = new JComboBox();
		d1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "JNTU", "AMEERPET", "PUNJAGUTTA", "METTUGUDA", "MAISAMMAGUDA"}));
		d1.setBounds(299, 131, 96, 18);
		frame.getContentPane().add(d1);
		
		JComboBox n2 = new JComboBox();
		n2.setModel(new DefaultComboBoxModel(new String[] {"No Of Tickets", "1", "2", "3", "4", "5", ""}));
		n2.setBounds(299, 167, 96, 18);
		frame.getContentPane().add(n2);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\online lab\\Desktop\\train2.png"));
		lblNewLabel_5.setBounds(0, -29, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = n1.getText(); 
				String source =(String) s1.getSelectedItem();
				String destination =(String) d1.getSelectedItem();
				String tickets =(String) n2.getSelectedItem();
				int nt = Integer.parseInt(tickets);
				if(source.equals(destination)) {
					JOptionPane.showMessageDialog(btnNewButton,"Please Check Stations");
				}
				else {
					int bills = nt * 45;
					JOptionPane.showMessageDialog(btnNewButton,"NAME : "+ name + "\n SOURCE : "+ source + "\n DESTINATION : "+ destination + "\n NUMBER OF TICKETS : "+ tickets + "\n AMOUNT : "+ bills);
				}
				
			}
		});
		btnNewButton.setBounds(245, 190, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}

}
