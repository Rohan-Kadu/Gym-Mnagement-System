package project1;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;

public class homeu{

	
	private JFrame frame;
	public String luser;
	public JLabel image;

	public homeu() {
		frame = new JFrame();
		frame.setBackground(Color.BLACK);
		frame.setBounds(100, 100, 1105, 765);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\hyper gym.png"));
		frame.setContentPane(label);
		frame.setTitle("HOME");
		frame.setBounds(100, 100, 1116, 765);
		frame.setLocationRelativeTo(null);
		frame.getContentPane().setLayout(null);
		
		
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 2, 237, 726);
		panel.setBackground(Color.BLACK);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel image = new JLabel();
		image.setFont(new Font("Tahoma", Font.PLAIN, 25));
		image.setBounds(367, 88, 175, 78);
		frame.getContentPane().add(image);
        frame.setVisible(true);
	
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\home (6).png"));
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				
				
				/*try {
					//String str = textField_3.getText(); 
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
					//java.sql.Statement stmt = con.createStatement();
					
					//String sql1="select * from login where id";
					PreparedStatement stmt1= conn.prepareStatement("Select * from login Where username='"+super.user+"'");
					
					//stmt1.setInt(1,Integer.parseInt(textField_3.getText()));
					ResultSet rs=stmt1.executeQuery();
					if(rs.next())
					{
						
						byte[] img=rs.getBytes(12);
				 		ImageIcon imag=new ImageIcon(img);
				 		Image im= imag.getImage();
				 		Image myimg=im.getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH);
				 		ImageIcon newImage=new ImageIcon(myimg);
				 		image.setIcon(newImage);
						
					}
					else {
						JOptionPane.showMessageDialog(null,"Record Not Found");
					}
				}catch(Exception e1) {
					System.err.println("Got an Exeception...!!");
					System.err.println(e1.getMessage());
				}*/
				
				
				
				
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton.setBounds(10, 75, 195, 57);
		panel.add(btnNewButton);
		
		
		JButton btnBmi = new JButton("BMI");
		btnBmi.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\bmi (2).png"));
		btnBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mem_view_yorself();
				
				frame.setVisible(false);
			}
		});
		btnBmi.setHorizontalAlignment(SwingConstants.LEFT);
		btnBmi.setForeground(Color.BLACK);
		btnBmi.setFont(new Font("Garamond", Font.BOLD, 24));
		btnBmi.setBackground(new Color(255, 218, 185));
		btnBmi.setBounds(10, 171, 195, 57);
		panel.add(btnBmi);
		
		JButton btnLogout = new JButton("LOGOUT");
		btnLogout.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\logout (1).png"));
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gym_loginpage();
				frame.setVisible(false);
			}
		});
		btnLogout.setHorizontalAlignment(SwingConstants.LEFT);
		btnLogout.setForeground(Color.BLACK);
		btnLogout.setFont(new Font("Garamond", Font.BOLD, 24));
		btnLogout.setBackground(new Color(255, 218, 185));
		btnLogout.setBounds(10, 465, 195, 57);
		panel.add(btnLogout);
		
		JButton btnContactUs = new JButton("CONTACT");
		btnContactUs.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\telephone.png"));
		btnContactUs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mem_contactus();
				frame.setVisible(false);
			}
		});
		btnContactUs.setHorizontalAlignment(SwingConstants.LEFT);
		btnContactUs.setForeground(Color.BLACK);
		btnContactUs.setFont(new Font("Garamond", Font.BOLD, 24));
		btnContactUs.setBackground(new Color(255, 218, 185));
		btnContactUs.setBounds(10, 367, 205, 57);
		panel.add(btnContactUs);
		
		JButton btnAttendance = new JButton("ATTENDANCE");
		btnAttendance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new attendance();
				frame.setVisible(false);
			}
		});
		btnAttendance.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\user (1).png"));
		btnAttendance.setHorizontalAlignment(SwingConstants.LEFT);
		btnAttendance.setForeground(Color.BLACK);
		btnAttendance.setFont(new Font("Garamond", Font.BOLD, 19));
		btnAttendance.setBackground(new Color(255, 218, 185));
		btnAttendance.setBounds(10, 271, 217, 57);
		panel.add(btnAttendance);
		}
	
		
		
	 public static void main(String[] args) {
		// Gym_loginpage gy= new Gym_loginpage();
		new homeu();
	}
}
