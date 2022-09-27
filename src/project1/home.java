package project1;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class home {

	private JFrame frame;

	
	public home() {
		JFrame f = new JFrame();
		f.setBackground(Color.BLACK);
		f.setBounds(100, 100, 1105, 765);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\bg7.png"));
		f.setContentPane(label);
		f.setTitle("HOME");
		f.setBounds(100, 100, 1116, 765);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 2, 237, 726);
		f.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\home (6).png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new home();
				f.setVisible(false);
			}
		});
		
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setBounds(10, 74, 189, 57);
		panel_1.add(btnNewButton);
		
		JButton btnAdd = new JButton("ADD");
		btnAdd.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\add-user (1).png"));
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_member();
				f.setVisible(false);
				
			}
		});
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd.setForeground(Color.BLACK);
		btnAdd.setFont(new Font("Garamond", Font.BOLD, 24));
		btnAdd.setBackground(new Color(255, 218, 185));
		btnAdd.setBounds(10, 179, 189, 57);
		panel_1.add(btnAdd);
		
		JButton btnAdd_1 = new JButton("VIEW");
		btnAdd_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\view (1).png"));
		btnAdd_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new view_member();
				
			}
		});
		btnAdd_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd_1.setForeground(Color.BLACK);
		btnAdd_1.setFont(new Font("Garamond", Font.BOLD, 24));
		btnAdd_1.setBackground(new Color(255, 218, 185));
		btnAdd_1.setBounds(10, 297, 189, 57);
		panel_1.add(btnAdd_1);
		
		JButton btnAdd_2 = new JButton("LOGOUT");
		btnAdd_2.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\logout (1).png"));
		btnAdd_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gym_loginpage();
				f.setVisible(false);
			}
		});
		btnAdd_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd_2.setForeground(Color.BLACK);
		btnAdd_2.setFont(new Font("Garamond", Font.BOLD, 24));
		btnAdd_2.setBackground(new Color(255, 218, 185));
		btnAdd_2.setBounds(10, 422, 201, 57);
		panel_1.add(btnAdd_2);
		
		
		
		f.setVisible(true);
		
		
		
	}
	public static void main(String[] args) {
		new home();
	}
}
