package employee1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class Student_details {

	private JFrame frame;
	private JTextField tb1;
	private JTextField tb2;
	private JTextField tb3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student_details window = new Student_details();
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
	public Student_details() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 647, 340);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("STUDENT DETAILS");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel_1.setBounds(250, 11, 200, 26);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ID");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2.setBounds(106, 67, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("NAME");
		lblNewLabel_2_1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2_1.setBounds(84, 108, 68, 14);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("BRANCH");
		lblNewLabel_2_2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2_2.setBounds(72, 138, 106, 14);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JLabel lblNewLabel_2_3 = new JLabel("MARKS");
		lblNewLabel_2_3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 17));
		lblNewLabel_2_3.setBounds(84, 180, 68, 14);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		tb1 = new JTextField();
		tb1.setBounds(187, 67, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		tb2 = new JTextField();
		tb2.setColumns(10);
		tb2.setBounds(187, 98, 86, 20);
		frame.getContentPane().add(tb2);
		
		tb3 = new JTextField();
		tb3.setColumns(10);
		tb3.setBounds(187, 180, 86, 20);
		frame.getContentPane().add(tb3);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "CSE", "DS", "IT"}));
		cb1.setBounds(187, 137, 86, 22);
		frame.getContentPane().add(cb1);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = tb1.getText();
				String name = tb2.getText();
				String branch = (String) cb1.getSelectedItem();			
				String marks = tb3.getText();
				int m = Integer.parseInt(marks);
				try {
					java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/xyz","root","mrec");
					String q = "insert into students values" + "('"+id+"','"+name+"','"+branch+"','"+m+"')";
					Statement stn = con.createStatement();
					stn.executeUpdate(q);
					con.close();
					JOptionPane.showMessageDialog(btnNewButton,"inserted sucessfully");
				}
				catch(SQLException el)
				{
					el.printStackTrace();				}
				}
		});
		btnNewButton.setBounds(150, 237, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\online lab\\Downloads\\wallhaven-eyw3k8_1366x728 (2).png"));
		lblNewLabel.setBounds(0, 0, 631, 298);
		frame.getContentPane().add(lblNewLabel);
	}
}
