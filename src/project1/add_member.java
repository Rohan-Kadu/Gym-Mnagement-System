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


public class add_member {
	private JTextField nametextsield;
	private JTextField phonetextsield;
	private JTextField idtextfield;
	private JTextField usernametextfield;
	private JTextField passwordtextfield;
	private JTextField age;
	private JTextField File;
	add_member()
	{
		JFrame f = new JFrame();
		f.getContentPane().setBackground(new Color(0, 128, 128));
		f.setBackground(Color.BLACK);
		f.setBounds(100, 100, 1105, 765);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    //JLabel label = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\img2.png"));
		//f.setContentPane(label);
		f.setTitle("Gym Management System Add Member");
		f.setBounds(100, 100, 1116, 765);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1.setBounds(291, 102, 69, 38);
		f.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PHONE NO");
		lblNewLabel_1_1.setBackground(Color.WHITE);
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(271, 157, 117, 30);
		f.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_3 = new JLabel("ID");
		lblNewLabel_1_3.setForeground(Color.BLACK);
		lblNewLabel_1_3.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_3.setBounds(297, 219, 63, 30);
		f.getContentPane().add(lblNewLabel_1_3);
		
		nametextsield = new JTextField();
		nametextsield.setBackground(Color.WHITE);
		nametextsield.setForeground(Color.BLACK);
		nametextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		nametextsield.setBounds(395, 104, 238, 35);
		f.getContentPane().add(nametextsield);
		nametextsield.setColumns(10);
		
		phonetextsield = new JTextField();
		phonetextsield.setForeground(Color.BLACK);
		phonetextsield.setBackground(Color.WHITE);
		phonetextsield.setFont(new Font("Garamond", Font.BOLD, 20));
		phonetextsield.setColumns(10);
		phonetextsield.setBounds(398, 155, 238, 34);
		f.getContentPane().add(phonetextsield);
		
		idtextfield = new JTextField();
		idtextfield.setForeground(Color.BLACK);
		idtextfield.setBackground(Color.WHITE);
		idtextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		idtextfield.setColumns(10);
		idtextfield.setBounds(398, 223, 235, 30);
		f.getContentPane().add(idtextfield);
		
		JLabel lblNewLabel = new JLabel("Register!");
		lblNewLabel.setBounds(480, 10, 152, 39);
		f.getContentPane().add(lblNewLabel);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 34));
		
		String gender[]= {"Select Gender","male","female"};
		JComboBox genderc = new JComboBox(gender);
		genderc.setForeground(Color.BLACK);
		genderc.setBackground(Color.WHITE);
		genderc.setFont(new Font("Garamond", Font.BOLD, 20));
		
		genderc.setBounds(837, 87, 152, 35);
		f.getContentPane().add(genderc);
		
		
		JLabel lblNewLabel_1_4_1 = new JLabel("GENDER");
		lblNewLabel_1_4_1.setForeground(Color.BLACK);
		lblNewLabel_1_4_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_4_1.setBounds(727, 89, 90, 30);
		f.getContentPane().add(lblNewLabel_1_4_1);
		
		JLabel lblNewLabel_1_5_1 = new JLabel("PROGRAM");
		lblNewLabel_1_5_1.setToolTipText("");
		lblNewLabel_1_5_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_5_1.setBounds(720, 157, 107, 30);
		f.getContentPane().add(lblNewLabel_1_5_1);
		
		String program[]= {"Select Program","WEIGTH LOSS","WEIGTH GAIN","WORKOUT"};
		JComboBox programc = new JComboBox(program);
		programc.setForeground(Color.BLACK);
		programc.setBackground(Color.WHITE);
		programc.setFont(new Font("Garamond", Font.BOLD, 20));
		programc.setBounds(837, 155, 173, 35);
		f.getContentPane().add(programc);
		
		JLabel lblNewLabel_1_5_2 = new JLabel("USERNAME");
		lblNewLabel_1_5_2.setForeground(Color.BLACK);
		lblNewLabel_1_5_2.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_5_2.setBounds(271, 286, 117, 30);
		f.getContentPane().add(lblNewLabel_1_5_2);
		
		usernametextfield = new JTextField();
		usernametextfield.setForeground(Color.BLACK);
		usernametextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		usernametextfield.setColumns(10);
		usernametextfield.setBackground(Color.WHITE);
		usernametextfield.setBounds(398, 286, 235, 30);
		f.getContentPane().add(usernametextfield);
		
		JLabel lblNewLabel_1_5_2_1 = new JLabel("PASSWORD");
		lblNewLabel_1_5_2_1.setForeground(Color.BLACK);
		lblNewLabel_1_5_2_1.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_5_2_1.setBounds(271, 349, 117, 30);
		f.getContentPane().add(lblNewLabel_1_5_2_1);
		
		passwordtextfield = new JPasswordField();
		passwordtextfield.setForeground(Color.BLACK);
		passwordtextfield.setFont(new Font("Garamond", Font.BOLD, 20));
		passwordtextfield.setColumns(10);
		passwordtextfield.setBackground(Color.WHITE);
		passwordtextfield.setBounds(398, 349, 235, 30);
		f.getContentPane().add(passwordtextfield);
		
		JLabel lblNewLabel_1_4 = new JLabel("AGE");
		lblNewLabel_1_4.setForeground(Color.BLACK);
		lblNewLabel_1_4.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel_1_4.setBounds(770, 215, 69, 38);
		f.getContentPane().add(lblNewLabel_1_4);
		
		age = new JTextField();
		age.setForeground(Color.BLACK);
		age.setFont(new Font("Garamond", Font.BOLD, 20));
		age.setColumns(10);
		age.setBackground(Color.WHITE);
		age.setBounds(837, 219, 98, 30);
		f.getContentPane().add(age);
		
		JPanel panel_1 = new JPanel();
		panel_1.setLayout(null);
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(0, 2, 237, 716);
		f.getContentPane().add(panel_1);
		
		JButton btnNewButton_1_2_1_1 = new JButton("ADD");
		btnNewButton_1_2_1_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\add-user (1).png"));
		btnNewButton_1_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new add_member();
				f.setVisible(false);
			}
		});
		btnNewButton_1_2_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1_1.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton_1_2_1_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1_2_1_1.setBounds(10, 179, 199, 57);
		panel_1.add(btnNewButton_1_2_1_1);
		
		JButton btnNewButton_1_2_1_1_1 = new JButton("HOME");
		btnNewButton_1_2_1_1_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\home (6).png"));
		btnNewButton_1_2_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new home();
				f.setVisible(false);
			}
		});
		btnNewButton_1_2_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1_1_1.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton_1_2_1_1_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1_2_1_1_1.setBounds(10, 60, 199, 57);
		panel_1.add(btnNewButton_1_2_1_1_1);
		
		JButton btnNewButton_1_2_1_1_2 = new JButton("VIEW ");
		btnNewButton_1_2_1_1_2.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\view (1).png"));
		btnNewButton_1_2_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new view_member();
				f.setVisible(false);
			}
		});
		btnNewButton_1_2_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_1_2.setForeground(Color.BLACK);
		btnNewButton_1_2_1_1_2.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton_1_2_1_1_2.setBackground(new Color(255, 218, 185));
		btnNewButton_1_2_1_1_2.setBounds(10, 302, 199, 57);
		panel_1.add(btnNewButton_1_2_1_1_2);
		
		JButton btnNewButton_1_2_1_1_2_1 = new JButton("LOGOUT");
		btnNewButton_1_2_1_1_2_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\logout (1).png"));
		btnNewButton_1_2_1_1_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Gym_loginpage();
				f.setVisible(false);
			}
		});
		btnNewButton_1_2_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
		btnNewButton_1_2_1_1_2_1.setForeground(Color.BLACK);
		btnNewButton_1_2_1_1_2_1.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton_1_2_1_1_2_1.setBackground(new Color(255, 218, 185));
		btnNewButton_1_2_1_1_2_1.setBounds(10, 423, 206, 57);
		panel_1.add(btnNewButton_1_2_1_1_2_1);
		
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
					
				Class.forName("com.mysql.cj.jdbc.Driver");
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
				JOptionPane.showMessageDialog(null,"Plz Enter Valid Data");
				System.err.println(e1.getMessage());
			}
			}
		});
		btnNewButton_1_2_3_1_1.setForeground(Color.BLACK);
		btnNewButton_1_2_3_1_1.setFont(new Font("Garamond", Font.BOLD, 25));
		btnNewButton_1_2_3_1_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1_2_3_1_1.setBounds(588, 560, 142, 57);
		f.getContentPane().add(btnNewButton_1_2_3_1_1);
		
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
		btnNewButton.setBounds(707, 320, 90, 21);
		f.getContentPane().add(btnNewButton);
		
		JLabel imglabel = new JLabel("");
		imglabel.setBounds(837, 377, 142, 116);
		f.getContentPane().add(imglabel);
		
		File = new JTextField();
		File.setBounds(837, 320, 213, 21);
		f.getContentPane().add(File);
		File.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(727, 397, 163, 110);
		f.getContentPane().add(lblNewLabel_2);
		f.setVisible(true);
		f.setVisible(true);
	}
	public static void main(String [] args)
	{
		new add_member();
	}
}
