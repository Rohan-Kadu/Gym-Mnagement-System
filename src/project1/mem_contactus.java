package project1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
public class mem_contactus {
	mem_contactus () {
		JFrame f=new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 128));
		f.getContentPane().setFont(new Font("Copperplate Gothic Light", Font.BOLD, 15));
		f.setForeground(Color.BLACK);
		f.setBackground(Color.BLACK);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   //JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\bg11.png"));
		//f.setContentPane(lblNewLabel);
		f.setTitle("CONTACT US");
		f.setBounds(100, 100, 1116, 639);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 2, 237, 590);
		panel.setForeground(Color.WHITE);
		panel.setBackground(Color.BLACK);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\home (6).png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new homeu();
				f.setVisible(false);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setBounds(10, 71, 197, 57);
		panel.add(btnNewButton);
		
		JButton btnBmi = new JButton("BMI");
		btnBmi.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\bmi (2).png"));
		btnBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			new	mem_view_yorself();
			f.setVisible(false);
			}
		});
		btnBmi.setHorizontalAlignment(SwingConstants.LEFT);
		btnBmi.setForeground(Color.BLACK);
		btnBmi.setFont(new Font("Garamond", Font.BOLD, 24));
		btnBmi.setBackground(new Color(255, 218, 185));
		btnBmi.setBounds(10, 177, 197, 57);
		panel.add(btnBmi);
		
		JButton btnContactUs = new JButton("CONTACT");
		btnContactUs.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\telephone.png"));
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mem_contactus();
				f.setVisible(false);
			}
		});
		btnContactUs.setHorizontalAlignment(SwingConstants.LEFT);
		btnContactUs.setForeground(Color.BLACK);
		btnContactUs.setFont(new Font("Garamond", Font.BOLD, 24));
		btnContactUs.setBackground(new Color(255, 218, 185));
		btnContactUs.setBounds(10, 374, 206, 57);
		panel.add(btnContactUs);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\logout (1).png"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gym_loginpage();
				f.setVisible(false);
			}
		});
		btnLogout.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setFont(new Font("Garamond", Font.BOLD, 24));
		btnLogout.setBackground(new Color(255, 218, 185));
		btnLogout.setBounds(10, 473, 197, 57);
		panel.add(btnLogout);
		
		JLabel label = new JLabel("New label");
		label.setBounds(171, 84, 45, 13);
		panel.add(label);
		
		JButton btnAttendance = new JButton("ATTENDANCE");
		btnAttendance.setBounds(10, 276, 217, 57);
		panel.add(btnAttendance);
		btnAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new attendance();
				f.setVisible(false);
			}
		});
		btnAttendance.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\user (1).png"));
		btnAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		btnAttendance.setForeground(Color.BLACK);
		btnAttendance.setFont(new Font("Garamond", Font.BOLD, 19));
		btnAttendance.setBackground(new Color(255, 218, 185));
		
		
		Image img1=new ImageIcon(this.getClass().getResource("/call (1).png")).getImage();
		Image img2=new ImageIcon(this.getClass().getResource("/contact (1).png")).getImage();
		Image img3=new ImageIcon(this.getClass().getResource("/home-address.png")).getImage();
		Image img4=new ImageIcon(this.getClass().getResource("/home (2).png")).getImage();
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(297, 58, 692, 410);
		f.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel1_1 = new JLabel("");
		lblNewLabel1_1.setBounds(67, 156, 73, 59);
		panel_1.add(lblNewLabel1_1);
		lblNewLabel1_1.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel_1_1_1 = new JLabel("7765235665");
		lblNewLabel_1_1_1.setBounds(252, 38, 167, 47);
		panel_1.add(lblNewLabel_1_1_1);
		lblNewLabel_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1.setFont(new Font("Garamond", Font.BOLD, 28));
		lblNewLabel_1_1_1.setBackground(Color.BLACK);
		
		JLabel lblNewLabel_1_1 = new JLabel("7756454545");
		lblNewLabel_1_1.setBounds(252, 83, 167, 47);
		panel_1.add(lblNewLabel_1_1);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Garamond", Font.BOLD, 28));
		lblNewLabel_1_1.setBackground(new Color(0, 0, 0));
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("HYPER_GYM@GMAIL.COM");
		lblNewLabel_1_1_1_1.setBounds(244, 168, 272, 47);
		panel_1.add(lblNewLabel_1_1_1_1);
		lblNewLabel_1_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_1_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1_1_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_1_1_1.setBackground(Color.BLACK);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.BOLD, 15));
		textArea.setEditable(false);
		textArea.setBounds(244, 261, 272, 78);
		panel_1.add(textArea);
		textArea.setText("Dhantak Plaza, 203, 2nd Floor,\nMakwana Rd, Gamdevi,Marol,\nAndheri(E),Mumbai,Maharashtra 400059");
		
		JLabel lblNewLabel1_1_1 = new JLabel("");
		lblNewLabel1_1_1.setBounds(67, 261, 73, 65);
		panel_1.add(lblNewLabel1_1_1);
		lblNewLabel1_1_1.setIcon(new ImageIcon(img3));
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(67, 39, 64, 65);
		panel_1.add(lblNewLabel1);
		lblNewLabel1.setIcon(new ImageIcon(img1));
		
		
		
		f.setVisible(true);
	}
 

	public static void main(String[] args) {
		new mem_contactus ();
	}
}
