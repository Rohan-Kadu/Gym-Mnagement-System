package project1;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;

public class gym_home {

	private JFrame f;

	public  gym_home() {
		f = new JFrame();
		f.setBounds(100, 100, 1350 , 650);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\gymhome.png"));
	    f.setContentPane(lblNewLabel);
		
		JLabel lblNewLabel1 = new JLabel("HYPER GYM");
		lblNewLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel1.setForeground(new Color(0, 0, 0));
		lblNewLabel1.setFont(new Font("Goudy Old Style", Font.BOLD, 44));
		lblNewLabel1.setBounds(107, 55, 275, 50);
		f.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel_1 = new JLabel("Already have account?, click LOGIN ");
		lblNewLabel_1.setBackground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(334, 401, 293, 50);
		f.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("LOGIN");
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gym_loginpage();
				f.setVisible(false);
			}
		});
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 23));
		btnNewButton.setBounds(659, 406, 112, 33);
		f.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1_1 = new JLabel("New User?,Plz Click Register ");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1_1.setBackground(Color.BLACK);
		lblNewLabel_1_1.setBounds(334, 480, 293, 50);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JButton btnRegister = new JButton("REGISTER");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gym_signuppage();
				f.setVisible(false);
			}
		});
		btnRegister.setHorizontalAlignment(SwingConstants.LEFT);
		btnRegister.setForeground(Color.BLACK);
		btnRegister.setFont(new Font("Garamond", Font.BOLD, 23));
		btnRegister.setBackground(new Color(255, 218, 185));
		btnRegister.setBounds(659, 485, 157, 33);
		f.getContentPane().add(btnRegister);
		
		
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new gym_home();
	}
}
