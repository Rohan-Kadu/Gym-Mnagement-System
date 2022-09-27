package project1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



public class dem1 {

	private JFrame frame;
  
    
	
	

	

	/**
	 * Initialize the contents of the frame.
	 */
	public dem1(){
		frame = new JFrame();
		
		frame.getContentPane().setBackground(Color.WHITE);
		frame.getContentPane().setLayout(null);
		
		
	
		
		
		frame.setBounds(100, 100, 450, 337);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\bg5.jpg"));
		frame.setContentPane(label);
		
		JLabel memberlogo = new JLabel("");
		Image img1=new ImageIcon(this.getClass().getResource("/member.png")).getImage();
		memberlogo.setIcon(new ImageIcon(img1));
		memberlogo.setBounds(40, 189, 65, 65);
		frame.getContentPane().add(memberlogo);
		
		JButton btnNewButton = new JButton("View Members");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnNewButton.setBounds(148, 189, 215, 65);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnAddMembers = new JButton("Add Members");
		btnAddMembers.setForeground(Color.BLACK);
		btnAddMembers.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnAddMembers.setBackground(Color.GRAY);
		btnAddMembers.setBounds(148, 74, 215, 65);
		frame.getContentPane().add(btnAddMembers);
		
		JLabel memberlogo_1 = new JLabel("");
		Image img2=new ImageIcon(this.getClass().getResource("/addmemb.png")).getImage();
		memberlogo_1.setIcon(new ImageIcon(img2));
		memberlogo_1.setBounds(40, 74, 65, 65);
		frame.getContentPane().add(memberlogo_1);
		
		JButton btnLogOut = new JButton("Log Out");
		btnLogOut.setForeground(Color.BLACK);
		btnLogOut.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		btnLogOut.setBackground(Color.GRAY);
		btnLogOut.setBounds(636, 74, 215, 65);
		frame.getContentPane().add(btnLogOut);
		
		JLabel logout = new JLabel("");
		Image img3=new ImageIcon(this.getClass().getResource("/switch.png")).getImage();
		logout.setIcon(new ImageIcon(img3));
		logout.setBounds(538, 74, 65, 65);
		frame.getContentPane().add(logout);
		//Image img3=new ImageIcon(this.getClass().getResource("/group.png")).getImage();
		//frame.setBounds(100, 100, 450, 337);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\Rohan\\Downloads\\1087587.jpg")));*/
		
	    
		frame.setTitle("Home Page");
		frame.setSize(890,535);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
		public static void main(String[] args) {
			
					 new dem1();
						}
	}

