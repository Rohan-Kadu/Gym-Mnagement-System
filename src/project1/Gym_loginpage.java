package project1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.awt.SystemColor;


public class Gym_loginpage {
	
	
	private JTextField username;
	private JTextField password;
	private JButton btnLoginHere;
	private JTextField textField;
	private JTextField textField_1;
	//public String luser;
	Gym_loginpage()
	{
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.BLACK);
		f.setTitle("Gym Management System Login Page");
		
		//f.setBounds(100, 100, 787, 688);
		
		f.setBounds(100, 100, 828, 469);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\img1.png"));
	    f.setContentPane(lblNewLabel);
		
		btnLoginHere = new JButton("LOGIN");
		btnLoginHere.setBounds(411, 314, 147, 47);
		btnLoginHere.setForeground(Color.BLACK);
		btnLoginHere.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{			
				try {
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
					java.sql.Statement stmt = con.createStatement();
					String sql = "Select * from login where username='"+username.getText()+"'and password='"+password.getText()+"'";
					ResultSet rs =stmt.executeQuery(sql);
					if(rs.next())
					{   
						f.setVisible(false);
						
						if(rs.getBoolean(5))
						{
							new home();
						}
						else 
						{
							new homeu();
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,"Please Enter Correct Username And Password");
					}
				  }
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		});
		btnLoginHere.setBackground(SystemColor.activeCaption);
		btnLoginHere.setFont(new Font("Garamond", Font.BOLD, 25));
		f.getContentPane().add(btnLoginHere);
		Image img1=new ImageIcon(this.getClass().getResource("/lock.png")).getImage();
		Image img2=new ImageIcon(this.getClass().getResource("/id-card.png")).getImage();
		
		JLabel lblNewLabel11 = new JLabel("");
		lblNewLabel11.setBounds(35, 121, 128, 128);
		Image img3=new ImageIcon(this.getClass().getResource("/exercise.png")).getImage();
		lblNewLabel11.setIcon(new ImageIcon(img3));
		f.getContentPane().add(lblNewLabel11);
		
		JPanel panel = new JPanel();
		panel.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		panel.setBackground(SystemColor.activeCaption);
		panel.setBounds(275, 74, 428, 165);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel111 = new JLabel("USERNAME");
		lblNewLabel111.setForeground(Color.BLACK);
		lblNewLabel111.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel111.setBounds(54, 10, 131, 36);
		panel.add(lblNewLabel111);
		
		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setForeground(Color.BLACK);
		lblPassword.setFont(new Font("Garamond", Font.BOLD, 20));
		lblPassword.setBounds(54, 95, 131, 36);
		panel.add(lblPassword);
		
		username = new JTextField();
		username.setForeground(Color.BLACK);
		username.setFont(new Font("Garamond", Font.BOLD, 20));
		username.setBounds(215, 10, 183, 36);
		panel.add(username);
		username.setColumns(10);
		
		String user=username.getText();
		
		password = new JPasswordField();
		password.setForeground(Color.BLACK);
		password.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		password.setColumns(10);
		password.setBounds(215, 95, 183, 36);
		panel.add(password);
		
		
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setBounds(10, 10, 45, 47);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setBackground(new Color(255, 255, 255));
		lblNewLabel_1.setIcon(new ImageIcon(img2));
		
		JLabel lblNewLabel1 = new JLabel("");
		lblNewLabel1.setBounds(10, 95, 37, 47);
		panel.add(lblNewLabel1);
		lblNewLabel1.setIcon(new ImageIcon(img1));
		
		JButton btnReturn = new JButton("RETURN");
		btnReturn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new gym_home();
				f.setVisible(false);
			}
		});
		btnReturn.setForeground(Color.BLACK);
		btnReturn.setFont(new Font("Garamond", Font.BOLD, 20));
		btnReturn.setBackground(SystemColor.activeCaption);
		btnReturn.setBounds(657, 10, 128, 27);
		f.getContentPane().add(btnReturn);
		
		
		f.setVisible(true);
		f.setLocationRelativeTo(null);
	}
	
		
	
	public static void main(String [] args)
	{
		
		new Gym_loginpage();
		
	}
	public JTextField getUsername() {
		return username;
	}
	public JTextField getPassword() {
		return password;
	}
	public JButton getBtnLoginHere() {
		return btnLoginHere;
	}
}

