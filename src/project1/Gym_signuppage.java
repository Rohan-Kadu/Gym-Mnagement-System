package project1;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.Toolkit;

import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class Gym_signuppage {
	private JTextField nametextsield;
	private JTextField phonetextsield;
	private JTextField idtextfield;
	private JTextField usernametextfield;
	private JTextField passwordtextfield;
	private JTextField age;
	private JTextField File;
	Gym_signuppage()
	{
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(255, 218, 185));
		f.setBackground(new Color(220, 220, 220));
		f.setBounds(100, 100, 1105, 765);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JLabel label = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\img6.png"));
	    f.setContentPane(label);
		f.setTitle("Gym Management System Add Member");
		f.setBounds(100, 100, 1116, 765);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1.setBounds(280, 85, 69, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PHONE NO");
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(280, 156, 117, 30);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(280, 219, 63, 30);
		f.getContentPane().add(lblNewLabel_1_3);
		
		nametextsield = new JTextField();
		nametextsield.setBackground(new Color(255, 218, 185));
		nametextsield.setForeground(Color.BLACK);
		nametextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		nametextsield.setBounds(412, 87, 238, 35);
		f.getContentPane().add(nametextsield);
		nametextsield.setColumns(10);
		
		phonetextsield = new JTextField();
		phonetextsield.setForeground(Color.BLACK);
		phonetextsield.setBackground(new Color(255, 218, 185));
		phonetextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		phonetextsield.setColumns(10);
		phonetextsield.setBounds(412, 154, 238, 34);
		f.getContentPane().add(phonetextsield);
		
		idtextfield = new JTextField();
		idtextfield.setForeground(Color.BLACK);
		idtextfield.setBackground(new Color(255, 218, 185));
		idtextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		idtextfield.setColumns(10);
		idtextfield.setBounds(415, 219, 235, 30);
		f.getContentPane().add(idtextfield);
		
		JLabel lblNewLabel = new JLabel("Register!");
		lblNewLabel.setBounds(470, 0, 180, 49);
		f.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 42));
		
		String gender[]= {"Select Gender","male","female"};
		JComboBox genderc = new JComboBox(gender);
		genderc.setForeground(Color.BLACK);
		genderc.setBackground(new Color(255, 218, 185));
		genderc.setFont(new Font("Garamond", Font.BOLD, 20));
		
		genderc.setBounds(859, 87, 152, 35);
		f.getContentPane().add(genderc);
		
		
		JLabel lblNewLabel_1_4_1 = new JLabel("GENDER");
		lblNewLabel_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(718, 89, 91, 30);
		f.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("PROGRAM");
		lblNewLabel_1_5_1.setToolTipText("");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(718, 156, 107, 30);
		f.getContentPane().add(lblNewLabel_1_5_1);
		
		String program[]= {"Select Program","WEIGTH LOSS","WEIGTH GAIN"};
		JComboBox programc = new JComboBox(program);
		programc.setForeground(Color.BLACK);
		programc.setBackground(new Color(255, 218, 185));
		programc.setFont(new Font("Garamond", Font.BOLD, 20));
		programc.setBounds(859, 154, 173, 35);
		f.getContentPane().add(programc);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("USERNAME");
		lblNewLabel_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_1_5_2.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_5_2.setBounds(280, 310, 124, 30);
		f.getContentPane().add(lblNewLabel_1_5_2);
		
		usernametextfield = new JTextField();
		usernametextfield.setForeground(Color.BLACK);
		usernametextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		usernametextfield.setColumns(10);
		usernametextfield.setBackground(new Color(255, 218, 185));
		usernametextfield.setBounds(415, 310, 235, 30);
		f.getContentPane().add(usernametextfield);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("PASSWORD");
		lblNewLabel_1_5_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_2_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_5_2_1.setBounds(280, 388, 117, 30);
		f.getContentPane().add(lblNewLabel_1_5_2_1);
		
		passwordtextfield = new JPasswordField();
		passwordtextfield.setForeground(Color.BLACK);
		passwordtextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		passwordtextfield.setColumns(10);
		passwordtextfield.setBackground(new Color(255, 218, 185));
		passwordtextfield.setBounds(415, 388, 235, 30);
		f.getContentPane().add(passwordtextfield);
		
		JLabel lblNewLabel_1_4 = new JLabel("AGE");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(718, 215, 69, 38);
		f.getContentPane().add(lblNewLabel_1_4);
		
		age = new JTextField();
		age.setForeground(Color.BLACK);
		age.setFont(new Font("Garamond", Font.BOLD, 20));
		age.setColumns(10);
		age.setBackground(new Color(255, 218, 185));
		age.setBounds(859, 219, 98, 30);
		f.getContentPane().add(age);
		
		JButton btnNewButton_1_2_3_1_1 = new JButton("SUBMIT!");
		btnNewButton_1_2_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try { 
					int flag=1;
				
					int id = Integer.parseInt(idtextfield.getText());
					String phone = phonetextsield.getText();
					String name = nametextsield.getText();
					//String email = emailtextsield.getText();
					String username = usernametextfield.getText();
					String password = passwordtextfield.getText();
					//int Tid=Integer.parseInt(TidtextField.getText());
				    String gender= genderc.getSelectedItem().toString();
					String program=programc.getSelectedItem().toString();
					int agec=Integer.parseInt(age.getText());
				
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
				java.sql.Statement stmt = con.createStatement();
				String sql = "SELECT * FROM login";
//			    where username= +usernametextfield.getText()+"'and password='"+passwordtextfield.getText()+"'"
				ResultSet rs =stmt.executeQuery(sql);
				while(rs.next())
				{
					String Username = rs.getString("username");
					String Password = rs.getString("password");
					 int Id = rs.getInt("id");
					if(Username.equals(username) && Password.equals(password)&& (Id==id))
					{	
						JOptionPane.showMessageDialog(null,"Same USERNAME,ID, and PASSWORD is already Exist in database");
						flag = 0 ;
						break;
					}
					else if(Password.equals(password))
					{	flag = 0 ;
						JOptionPane.showMessageDialog(null,"Same PASSWORD  Is already Exist in database");
						break;
					}
					else if(Username.equals(username))
					{	flag = 0 ;
						JOptionPane.showMessageDialog(null,"Same USERNAME Is already Exist in database");
						break;
					}
					else if(Id==id)
					{	flag = 0 ;
						JOptionPane.showMessageDialog(null,"Same ID Is already Exist in database");
						break;
					}
					else {
						flag=1;
					}
				}
				if(flag==1)
				{

					String query = "INSERT INTO login (id,name,username , password ,isadmin, phone ,gender,program,age,profile )"+"VALUES (?,?,?,?,?,?,?,?,?,?)";
					Class.forName("com.mysql.cj.jdbc.Driver");

					PreparedStatement  st = con.prepareStatement(query);
					InputStream in = new FileInputStream(""+File.getText()+"");
					st.setInt(1, id);
					st.setString(3,username);
					st.setString(4,password);
					//st.setString(7,email);
					st.setString(6, phone);
					st.setString(2, name);
					st.setString(5, "0");
					//st.setInt(8,Tid);
					st.setString(7,gender);
					st.setString(8,program);
					st.setInt(9,agec);
					st.setBlob(10, in);
					st.executeUpdate();
				
					JOptionPane.showMessageDialog(null,"Data Entred Succesfully");
					con.close();
					st.close();
				}
			}
			
			catch(Exception e1)
			{
				System.err.println("Got an Exeception...!!");
				JOptionPane.showMessageDialog(null,"Plz Entered Valid Data");
				System.err.println(e1.getMessage());
			}
				
				
			}
		});
		btnNewButton_1_2_3_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_3_1_1.setFont(new Font("Garamond", Font.BOLD, 25));
		btnNewButton_1_2_3_1_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1_2_3_1_1.setBounds(739, 564, 152, 57);
		f.getContentPane().add(btnNewButton_1_2_3_1_1);
		
		JButton btnNewButton_1_2_3_1_1_1 = new JButton("LOGIN");
		btnNewButton_1_2_3_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
				new Gym_loginpage();
			}
		});
		btnNewButton_1_2_3_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_3_1_1_1.setFont(new Font("Garamond", Font.BOLD, 25));
		btnNewButton_1_2_3_1_1_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1_2_3_1_1_1.setBounds(406, 564, 152, 57);
		f.getContentPane().add(btnNewButton_1_2_3_1_1_1);
		
		JButton btnNewButton = new JButton("get img");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
			    chooser.showOpenDialog(null);
			    File f = chooser.getSelectedFile();
			    String filename = f.getAbsolutePath();
			    File.setText(filename);
			    try {
			        File image = new File(filename);
			        FileInputStream fis = new FileInputStream(image);
			        ByteArrayOutputStream bos = new ByteArrayOutputStream();
			        byte buf[] = new byte[1024];

			        for (int readNum; (readNum = fis.read(buf)) != -1;) {
			            bos.write(buf, 0, readNum);
			        }
			        byte[] menu_image_new = bos.toByteArray();
			    } catch (Exception e1) {
			        JOptionPane.showMessageDialog(null, e1);
			    }
			}
		});
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 17));
		btnNewButton.setBounds(718, 310, 91, 30);
		f.getContentPane().add(btnNewButton);
		
		File = new JTextField();
		File.setBounds(861, 310, 171, 21);
		f.getContentPane().add(File);
		File.setColumns(10);
		f.setVisible(true);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
		new Gym_signuppage();
	}
}
