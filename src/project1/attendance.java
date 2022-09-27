package project1;

import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.InputStream;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.SwingConstants;

public class attendance {

	private JFrame frame;
	 JTable table;
	 private JTextField idtext;
	 private JTextField nametext;
	

	
	public attendance() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1116, 706);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 0, 1137, 673);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JScrollPane scrollPane1 = new JScrollPane();
			scrollPane1.setBounds(618, 168, 352, 367);
			panel.add(scrollPane1);
			scrollPane1.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
			
			
			 table = new JTable();
			 
			 				  scrollPane1.setViewportView(table);
			 				  
			 				  				
				  try
				  {
				  Class.forName("com.mysql.cj.jdbc.Driver");
				  Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
				  Statement stmt=con.createStatement();
				String sql="select e.id,name,d.status\r\n"
						+ "from mydemodb.login e,mydemodb.attendance d\r\n"
						+ "where e.id=d.id;";
				ResultSet rs=stmt.executeQuery(sql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
//		        frame.setVisible(true);
		        
//				  try
//				  {
//				  Class.forName("com.mysql.cj.jdbc.Driver");
//				  Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
//				  Statement stmt=con.createStatement();
//				String sql="select e.id,name,d.status\r\n"
//						+ "from mydemodb.login e,mydemodb.attendance d\r\n"
//						+ "where e.id=d.id;";
//				ResultSet rs=stmt.executeQuery(sql);
//		        //frame.setVisible(true);
//		        }catch(Exception e)
//				  {
//		        	e.printStackTrace();
//				  }
		
		
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(32, 178, 170));
		panel_1.setBounds(302, 307, 256, 222);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblName = new JLabel("NAME");
		lblName.setFont(new Font("Garamond", Font.BOLD, 20));
		lblName.setBounds(10, 35, 107, 24);
		panel_1.add(lblName);
		
		nametext = new JTextField();
		nametext.setFont(new Font("Garamond", Font.BOLD, 23));
		nametext.setColumns(10);
		nametext.setBounds(108, 35, 129, 24);
		panel_1.add(nametext);
		
		JLabel lblStatus = new JLabel("STATUS");
		lblStatus.setFont(new Font("Garamond", Font.BOLD, 20));
		lblStatus.setBounds(10, 101, 95, 24);
		panel_1.add(lblStatus);
		
		String program[]= {"PRSENT","ABSENT"};
		JComboBox statustext = new JComboBox(program);
		statustext.setFont(new Font("Garamond", Font.BOLD, 20));
		statustext.setBounds(108, 104, 129, 23);
		panel_1.add(statustext);
		
		JButton btnNewButton = new JButton("SAVE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try
				{ 
					int flag=1;
					
				    int id1=Integer.parseInt(idtext.getText());
					String status1 = statustext.getSelectedItem().toString();
				Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
				
				java.sql.Statement stmt = con.createStatement();
				String sql = "SELECT * FROM attendance";
				ResultSet rs =stmt.executeQuery(sql);
				while(rs.next())
				{
					int Id = rs.getInt("id");
					if((Id==id1))
					{	
						flag = 1 ;
						break;
					}
//					else
//					{
//						JOptionPane.showMessageDialog(null,"Entered Id Does Not Exist In Dataase ");
//						flag=0;
//						break;
//					}
				}
				if(flag==1)
				{


					Class.forName("com.mysql.cj.jdbc.Driver");
					String query = "update attendance set status = ?  where id = ?";
					PreparedStatement  st = con.prepareStatement(query);
					
					st.setString(1,status1);
					st.setInt(2,id1);
					

					st.executeUpdate();
				
					JOptionPane.showMessageDialog(null,"Data Updated Succesfully");
					con.close();
					st.close();
				}
//				DefaultTableModel model= (DefaultTableModel)table.getModel();
//				model.setRowCount(0);
				
			}
			
			catch(Exception e1)
			{
				System.err.println("Got an Exeception...!!");
				System.err.println(e1.getMessage());
			}
			}
		});
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 20));
		btnNewButton.setBounds(77, 171, 95, 24);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(32, 178, 170));
		panel_2.setBounds(302, 168, 256, 42);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ENTER ID");
		lblNewLabel.setFont(new Font("Garamond", Font.BOLD, 20));
		lblNewLabel.setBounds(10, 8, 107, 24);
		panel_2.add(lblNewLabel);
		
		idtext = new JTextField();
		idtext.setFont(new Font("Garamond", Font.BOLD, 20));
		idtext.setBounds(138, 10, 96, 19);
		panel_2.add(idtext);
		idtext.setColumns(10);
		
		JButton btnSearch = new JButton("SEARCH");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(idtext.getText());
				try {
					//String str = textField_3.getText(); 
					
					
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mydemodb","root","Rkadu2003@");
					
					PreparedStatement stmt1= conn.prepareStatement("Select * from login where id=?");
					stmt1.setInt(1,id);
					
					ResultSet rs=stmt1.executeQuery();
					if(rs.next())
					{
						nametext.setText(rs.getString(2));
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
		btnSearch.setBounds(355, 245, 125, 24);
		panel.add(btnSearch);
		 				  
		 				  			//	table.setModel(DbUtils.resultSetToTableModel(rs));
		 				  				
		 				  				JLabel lblNewLabel_1 = new JLabel("MARK ATTENDANCE");
		 				  				lblNewLabel_1.setFont(new Font("Garamond", Font.BOLD, 30));
		 				  				lblNewLabel_1.setBounds(375, 10, 342, 34);
		 				  				panel.add(lblNewLabel_1);
		 				  				
		 				  				 				  				
		 				  				 				  				JPanel panel_3 = new JPanel();
		 				  				 				  				panel_3.setBackground(Color.BLACK);
		 				  				 				  				panel_3.setBounds(0, 2, 237, 671);
		 				  				 				  				panel.add(panel_3);
		 				  				 				  				panel_3.setLayout(null);
		 				  				 				  				
		 				  				 				  				JButton btnNewButton_1 = new JButton("HOME");
		 				  				 				  				btnNewButton_1.addActionListener(new ActionListener() {
		 				  				 				  					public void actionPerformed(ActionEvent e) {
		 				  				 				  						new homeu();
		 				  				 				  						frame.setVisible(false);
		 				  				 				  					}
		 				  				 				  				});
		 				  				 				  				btnNewButton_1.setBackground(new Color(255, 218, 185));
		 				  				 				  				btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		 				  				 				  				btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\home (6).png"));
		 				  				 				  				btnNewButton_1.setFont(new Font("Garamond", Font.BOLD, 24));
		 				  				 				  				btnNewButton_1.setBounds(10, 68, 197, 57);
		 				  				 				  				panel_3.add(btnNewButton_1);
		 				  				 				  				
		 				  				 				  				JButton btnNewButton_1_1 = new JButton("BMI");
		 				  				 				  				btnNewButton_1_1.addActionListener(new ActionListener() {
		 				  				 				  					public void actionPerformed(ActionEvent e) {
		 				  				 				  						new mem_view_yorself();
		 				  				 				  						frame.setVisible(false);
		 				  				 				  					}
		 				  				 				  				});
		 				  				 				  				btnNewButton_1_1.setBackground(new Color(255, 218, 185));
		 				  				 				  				btnNewButton_1_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\bmi (2).png"));
		 				  				 				  				btnNewButton_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		 				  				 				  				btnNewButton_1_1.setFont(new Font("Garamond", Font.BOLD, 24));
		 				  				 				  				btnNewButton_1_1.setBounds(10, 158, 197, 57);
		 				  				 				  				panel_3.add(btnNewButton_1_1);
		 				  				 				  				
		 				  				 				  				JButton btnNewButton_1_1_1 = new JButton("ATTENDANCE");
		 				  				 				  				btnNewButton_1_1_1.addActionListener(new ActionListener() {
		 				  				 				  					public void actionPerformed(ActionEvent e) {
		 				  				 				  						new attendance();
		 				  				 				  						frame.setVisible(false);
		 				  				 				  					}
		 				  				 				  				});
		 				  				 				  				btnNewButton_1_1_1.setBackground(new Color(255, 218, 185));
		 				  				 				  				btnNewButton_1_1_1.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\user (1).png"));
		 				  				 				  				btnNewButton_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
		 				  				 				  				btnNewButton_1_1_1.setFont(new Font("Garamond", Font.BOLD, 18));
		 				  				 				  				btnNewButton_1_1_1.setBounds(10, 251, 204, 57);
		 				  				 				  				panel_3.add(btnNewButton_1_1_1);
		 				  				 				  				
		 				  				 				  				JButton btnNewButton_1_1_2 = new JButton("CONTACT");
		 				  				 				  				btnNewButton_1_1_2.addActionListener(new ActionListener() {
		 				  				 				  					public void actionPerformed(ActionEvent e) {
		 				  				 				  						new mem_contactus();
		 				  				 				  						frame.setVisible(false);
		 				  				 				  					}
		 				  				 				  				});
		 				  				 				  				btnNewButton_1_1_2.setBackground(new Color(255, 218, 185));
		 				  				 				  				btnNewButton_1_1_2.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\telephone.png"));
		 				  				 				  				btnNewButton_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
		 				  				 				  				btnNewButton_1_1_2.setFont(new Font("Garamond", Font.BOLD, 24));
		 				  				 				  				btnNewButton_1_1_2.setBounds(10, 342, 197, 57);
		 				  				 				  				panel_3.add(btnNewButton_1_1_2);
		 				  				 				  				
		 				  				 				  				JButton btnNewButton_1_1_3 = new JButton("LOGOUT");
		 				  				 				  				btnNewButton_1_1_3.addActionListener(new ActionListener() {
		 				  				 				  					public void actionPerformed(ActionEvent e) {
		 				  				 				  						new Gym_loginpage();
		 				  				 				  						frame.setVisible(false);
		 				  				 				  					}
		 				  				 				  				});
		 				  				 				  				btnNewButton_1_1_3.setBackground(new Color(255, 218, 185));
		 				  				 				  				btnNewButton_1_1_3.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\logout (1).png"));
		 				  				 				  				btnNewButton_1_1_3.setHorizontalAlignment(SwingConstants.LEFT);
		 				  				 				  				btnNewButton_1_1_3.setFont(new Font("Garamond", Font.BOLD, 24));
		 				  				 				  				btnNewButton_1_1_3.setBounds(10, 429, 197, 57);
		 				  				 				  				panel_3.add(btnNewButton_1_1_3);
		 				  				
		 				  				
				  
		
		frame.setVisible(true);
		}
				  catch(Exception e)
				  {
					  e.printStackTrace();
				  }    	
		  }
				  
	public static void main(String[] args) {
		new attendance();
	}
}
