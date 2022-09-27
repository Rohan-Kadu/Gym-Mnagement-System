package project1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



import java.sql.Statement;




import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;



import net.proteanit.sql.DbUtils;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;




  public class view_member {

	   
	  
       private JPanel contentPane;
       JTable table;
       JScrollPane scrollPane;
       private JTextField name;
       private JTextField phno;
       private JLabel lblGender;
       private JTextField age;
       private JTextField textField_3;
       private JTextField File;
       byte[] menu_image_new;
       private JTextField username;
       private JTextField password;
       
       






  public view_member() {
	 JFrame f = new JFrame();
 f. setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 f.setBounds(100, 100, 1296, 673);
  contentPane = new JPanel();
  contentPane.setBackground(new Color(0, 128, 128));
 contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
 f.setContentPane(contentPane);
 contentPane.setLayout(null);


 scrollPane=new JScrollPane();
 scrollPane.setBounds(457, 172, 765, 354);
 scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
 scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
 
 JPanel panel = new JPanel();
 panel.setBackground(new Color(95, 158, 160));
 panel.setBounds(29, 134, 399, 492);
 contentPane.add(panel);
 panel.setLayout(null);
 
 File = new JTextField();
 File.setBounds(211, 417, 164, 23);
 panel.add(File);
 File.setColumns(10);
 
 JLabel image = new JLabel("");
 image.setBounds(636, 30, 175, 118);
 contentPane.add(image);

  //String id3=textField_3.getText();
 /*try {
 	//String str = textField_3.getText(); 
 	
 	
 	Class.forName("com.mysql.cj.jdbc.Driver");
 	Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
 	//java.sql.Statement stmt = con.createStatement();
 	
 	//String sql1="select * from login where id";
 	PreparedStatement stmt1= conn.prepareStatement("Select * from login where id=?");
 	stmt1.setString(1,id3);
 	//stmt1.setInt(1,Integer.parseInt(textField_3.getText()));
 	ResultSet rs1=stmt1.executeQuery();
 	if(rs1.next())
 	{
 		byte[] img=rs1.getBytes(12);
 		ImageIcon imag=new ImageIcon(img);
 		Image im= imag.getImage();
 		Image myimg=im.getScaledInstance(image.getWidth(),image.getHeight(),Image.SCALE_SMOOTH);
 		ImageIcon newImage=new ImageIcon(myimg);
 		image.setIcon(newImage);
 		
 		
 	}
 	
 	else {
 		JOptionPane.showMessageDialog(null,"Record Not Found");
 	}
 	conn.close();
 	stmt1.close();
 }catch(Exception e1) {
 	System.err.println("Got an Exeception...!!");
 	System.err.println(e1.getMessage());
 }*/
 contentPane.add(scrollPane);
 table = new JTable();



  scrollPane.setViewportView(table);
  try
  {
  Class.forName("com.mysql.cj.jdbc.Driver");
  Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
  Statement stmt=con.createStatement();
String sql="Select * from login";
ResultSet rs=stmt.executeQuery(sql);

table.setModel(DbUtils.resultSetToTableModel(rs));

JLabel lblNewLabel = new JLabel("NAME");
lblNewLabel.setBackground(Color.BLACK);
lblNewLabel.setBounds(54, 38, 73, 23);
lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 18));
panel.add(lblNewLabel);
name = new JTextField();
name.setBounds(211, 38, 132, 23);
name.setFont(new Font("Garamond", Font.BOLD, 18));

JPanel panel_1 = new JPanel();
panel_1.setForeground(new Color(0, 128, 128));
panel_1.setBackground(new Color(95, 158, 160));
panel_1.setBounds(29, 30, 414, 45);
contentPane.add(panel_1);
panel_1.setLayout(null);

textField_3 = new JTextField();
textField_3.setFont(new Font("Garamond", Font.BOLD, 18));
textField_3.setColumns(10);
textField_3.setBounds(297, 5, 80, 27);
panel_1.add(textField_3);


String gen[]= {"Select Age","MALE","FEMALE"};
JComboBox genderc = new JComboBox(gen);
genderc.setModel(new DefaultComboBoxModel(new String[] {"Select Gender", "MALE", "FEMALE"}));

genderc.setToolTipText("");
genderc.setFont(new Font("Garamond", Font.BOLD, 18));
genderc.setBounds(211, 136, 143, 23);
panel.add(genderc);

panel.add(name);
name.setColumns(10);
JLabel lblPhoneNo = new JLabel("PHONE NO");
lblPhoneNo.setBounds(54, 88, 108, 23);
lblPhoneNo.setFont(new Font("Garamond", Font.BOLD, 18));
panel.add(lblPhoneNo);
phno = new JTextField();
phno.setBounds(211, 88, 132, 23);
phno.setFont(new Font("Garamond", Font.BOLD, 18));
phno.setColumns(10);
panel.add(phno);
lblGender = new JLabel("GENDER");
lblGender.setBounds(54, 136, 89, 23);
lblGender.setFont(new Font("Garamond", Font.BOLD, 18));
panel.add(lblGender);
JLabel lblProgram = new JLabel("PROGRAM");
lblProgram.setBounds(54, 182, 108, 23);
lblProgram.setFont(new Font("Garamond", Font.BOLD, 18));
panel.add(lblProgram);
String program[]= {"Select Program","WEIGTH LOSS","WEIGTH GAIN","WORKOUT"};
JComboBox pro = new JComboBox(program);
pro.setBounds(211, 182, 164, 23);
pro.setFont(new Font("Garamond", Font.BOLD, 18));
pro.setToolTipText("");
panel.add(pro);
JLabel lblAge = new JLabel("AGE");
lblAge.setBounds(54, 231, 73, 23);
lblAge.setFont(new Font("Garamond", Font.BOLD, 18));
panel.add(lblAge);
age = new JTextField();
age.setBounds(211, 231, 108, 23);
age.setFont(new Font("Garamond", Font.BOLD, 18));
age.setColumns(10);
panel.add(age);

JButton btnGetImg = new JButton("get img");
btnGetImg.addActionListener(new ActionListener() {
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
btnGetImg.setHorizontalAlignment(SwingConstants.LEFT);
btnGetImg.setFont(new Font("Garamond", Font.BOLD, 20));
btnGetImg.setBounds(215, 377, 104, 30);
panel.add(btnGetImg);

JButton btnNewButton = new JButton("UPDATE");
btnNewButton.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		try
		{ 
			boolean flag=true;
		

			String name1,phno1;
			name1=name.getText();
			phno1=phno.getText();
			int age1=Integer.parseInt(age.getText());
			String gender= genderc.getSelectedItem().toString();
			String proo=pro.getSelectedItem().toString();
			String user=username.getText();
		    String pass=password.getText();
		    int id1=Integer.parseInt(textField_3.getText());
			
		Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
		
		java.sql.Statement stmt = con.createStatement();
		String sql = "SELECT * FROM login";
		ResultSet rs =stmt.executeQuery(sql);
		
		while(rs.next())
		{
			int Id = rs.getInt("id");
			if((id1==Id))
			{	
				flag=true ;
				break;
			}
//			else
//			{
//				JOptionPane.showMessageDialog(null,"Entered Id Does Not Exist In Dataase ");
//				break;
//			}
		}
		if(flag==true)
		{


			Class.forName("com.mysql.cj.jdbc.Driver");
			String query = "update login set name = ?,username = ?,password = ?,isadmin = ?,phone = ?,gender = ?,program = ?,age = ?,profile = ?  where id = ?";
			PreparedStatement  st = con.prepareStatement(query);
			InputStream in = new FileInputStream(File.getText());
			//""+File.getText()+""
			//st.setInt(1,id1);
			st.setString(1,name1);
			st.setString(2,user);
			st.setString(3,pass);
			st.setString(4,"0");
			st.setString(5,phno1);
			st.setString(6,gender);
			st.setString(7,proo);
		
			st.setInt(8,age1);
			st.setBlob(9, in);
			st.setInt(10,id1);
			

			st.executeUpdate();
		
			JOptionPane.showMessageDialog(null,"Data Updated Succesfully");
			con.close();
			st.close();
		}
	}
	
	catch(Exception e1)
	{
		System.err.println("Got an Exeception...!!");
		System.err.println(e1.getMessage());
	}
		
		/*JFileChooser chooser = new JFileChooser();
	    chooser.showOpenDialog(null);
	    File f = chooser.getSelectedFile();
	    filename = f.getAbsolutePath();
	    jTextField1.setText(filename);
	    try {
	        File image = new File(filename);
	        FileInputStream fis = new FileInputStream(image);
	        ByteArrayOutputStream bos = new ByteArrayOutputStream();
	        byte buf[] = new byte[1024];

	        for (int readNum; (readNum = fis.read(buf)) != -1;) {
	            bos.write(buf, 0, readNum);
	        }
	        menu_image_new = bos.toByteArray();
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, e);
	    }*/
	}
});
btnNewButton.setFont(new Font("Garamond", Font.BOLD, 20));
btnNewButton.setBounds(130, 450, 132, 32);
panel.add(btnNewButton);
JLabel lblAttachImg = new JLabel("Attach IMG");
lblAttachImg.setBounds(54, 381, 108, 23);
lblAttachImg.setFont(new Font("Garamond", Font.BOLD, 18));
panel.add(lblAttachImg);
JLabel lblUsername = new JLabel("USERNAME");
lblUsername.setFont(new Font("Garamond", Font.BOLD, 18));
lblUsername.setBounds(54, 280, 108, 23);
panel.add(lblUsername);
JLabel lblPassword = new JLabel("PASSWORD");
lblPassword.setFont(new Font("Garamond", Font.BOLD, 18));
lblPassword.setBounds(54, 331, 108, 23);
panel.add(lblPassword);
username = new JTextField();
username.setFont(new Font("Garamond", Font.BOLD, 18));
username.setColumns(10);
username.setBounds(211, 284, 143, 23);
panel.add(username);
password = new JTextField();
password.setFont(new Font("Garamond", Font.BOLD, 18));
password.setColumns(10);
password.setBounds(211, 335, 143, 23);
panel.add(password);




JLabel lblEnetrIdTo = new JLabel("ENETR ID TO BE UPDATED");
lblEnetrIdTo.setFont(new Font("Garamond", Font.BOLD, 18));
lblEnetrIdTo.setBounds(17, 8, 249, 21);
panel_1.add(lblEnetrIdTo);

JLabel image1 = new JLabel("");
image1.setBounds(636, 10, 175, 152);
contentPane.add(image1);

JButton btnSearch = new JButton("SEARCH");
btnSearch.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		String id,name1,phno1,age1;
        

		id=textField_3.getText();
		name1=name.getText();
		phno1=phno.getText();
		age1=age.getText();
	    
		

		  String id3=textField_3.getText();
		
		
		try {
			//String str = textField_3.getText(); 
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
			//java.sql.Statement stmt = con.createStatement();
			
			//String sql1="select * from login where id";
			PreparedStatement stmt1= conn.prepareStatement("Select * from login where id=?");
			stmt1.setString(1,id);
			//stmt1.setInt(1,Integer.parseInt(textField_3.getText()));
			ResultSet rs=stmt1.executeQuery();
			if(rs.next())
			{
				name.setText(rs.getString(2));
				phno.setText(rs.getString(6));
				genderc.setToolTipText(rs.getString(9));
				pro.setToolTipText(rs.getString(10));
				age.setText(rs.getString(9));
				username.setText(rs.getString(3));
				password.setText(rs.getString(4));
				byte[] img=rs.getBytes(10);
		 		ImageIcon imag=new ImageIcon(img);
		 		Image im= imag.getImage();
		 		Image myimg=im.getScaledInstance(image1.getWidth(),image1.getHeight(),Image.SCALE_SMOOTH);
		 		ImageIcon newImage=new ImageIcon(myimg);
		 		image1.setIcon(newImage);
				
			}
			else {
				JOptionPane.showMessageDialog(null,"Record Not Found");
			}
		}catch(Exception e1) {
			System.err.println("Got an Exeception...!!");
			System.err.println(e1.getMessage());
		}
	}
});
btnSearch.setFont(new Font("Garamond", Font.BOLD, 20));
btnSearch.setBounds(154, 92, 117, 32);
contentPane.add(btnSearch);
JButton btnBack = new JButton("BACK");
btnBack.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e) {
		new home();
		f.setVisible(false);
	}
});
btnBack.setFont(new Font("Garamond", Font.BOLD, 20));
btnBack.setBounds(1124, 30, 117, 32);
contentPane.add(btnBack);


}
catch (Exception e){
// TODO Auto-generated catch block
e.printStackTrace();
}

  f.setVisible(true);
}
 
	public static void main(String[] args) {
		new view_member();
		
	}
}