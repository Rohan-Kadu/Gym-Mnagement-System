package project1;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JTextField;



import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class payment {

	private JFrame frame;
	private JTextField textField;
	private JTextField nametext;
	private JTextField idtext;

	
	public payment() {
		frame = new JFrame();
		frame.setBounds(100, 100, 935, 491);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("MAKE A PAYEMENT");
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 30));
		lblNewLabel.setBounds(271, 10, 319, 35);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(47, 55, 549, 363);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblEnterId = new JLabel("ENTER ID");
		lblEnterId.setFont(new Font("Garamond", Font.BOLD, 20));
		lblEnterId.setBounds(31, 35, 128, 23);
		panel.add(lblEnterId);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Garamond", Font.BOLD, 20));
		lblName.setBounds(31, 70, 114, 23);
		panel.add(lblName);
		
		JLabel lblDate = new JLabel("DATE");
		lblDate.setFont(new Font("Garamond", Font.BOLD, 20));
		lblDate.setBounds(31, 103, 114, 23);
		panel.add(lblDate);
		
		textField = new JTextField();
		textField.setFont(new Font("Garamond", Font.BOLD, 20));
		textField.setColumns(10);
		textField.setBounds(136, 102, 128, 23);
		panel.add(textField);
		
		nametext = new JTextField();
		nametext.setFont(new Font("Garamond", Font.BOLD, 20));
		nametext.setColumns(10);
		nametext.setBounds(136, 68, 128, 23);
		panel.add(nametext);
		
		idtext = new JTextField();
		idtext.setFont(new Font("Garamond", Font.BOLD, 20));
		idtext.setColumns(10);
		idtext.setBounds(149, 35, 128, 23);
		panel.add(idtext);
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		new payment();
		
	}

}
