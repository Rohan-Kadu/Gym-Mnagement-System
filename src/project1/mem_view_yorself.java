package project1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JPanel;
import javax.swing.JScrollPane;

import java.awt.Color;
import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Label;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;

public class mem_view_yorself {
	private JTextField WeighttextField;
	private JTextField Height_Text_Field;
	private Label BMI_Label;
	private JButton Bmi_Button;
	private Label Status_label;
	private TextArea textArea;
	float minW(float h){
		float x;
		x=(float)18.5*h*h;
		return x;
	}
	float maxW(float h){
		float x;
		x=(float)24.9*h*h;
		return x;
	}
	mem_view_yorself () {
		JFrame f=new JFrame();
        JLabel lblNewLabel = new JLabel(new ImageIcon("C:\\Users\\Rohan\\OneDrive\\Pictures\\Saved Pictures\\img4.jpg"));
	    f.setContentPane(lblNewLabel);
		f.setLocationRelativeTo(null);
		f.setBackground(Color.BLACK);
		
		f.setTitle("BMI");
		f.setBounds(100, 100, 1116, 765);
		f.setLocationRelativeTo(null);
		f.getContentPane().setLayout(null);
		f.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 2, 237, 726);
		panel.setBackground(Color.BLACK);
		f.getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("HOME");
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\home (6).png"));
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setBackground(new Color(255, 218, 185));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new homeu();
				f.setVisible(false);
			}
		});
		btnNewButton.setHorizontalAlignment(SwingConstants.LEADING);
		btnNewButton.setFont(new Font("Garamond", Font.BOLD, 24));
		btnNewButton.setBounds(10, 68, 197, 57);
		panel.add(btnNewButton);
		
		JButton btnBmi = new JButton("BMI");
		btnBmi.setIcon(new ImageIcon("C:\\Users\\Rohan\\Downloads\\bmi (2).png"));
		btnBmi.setForeground(Color.BLACK);
		btnBmi.setBackground(new Color(255, 218, 185));
		btnBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new mem_view_yorself();
				f.setVisible(false);
			}
		});
		btnBmi.setHorizontalAlignment(SwingConstants.LEFT);
		btnBmi.setFont(new Font("Garamond", Font.BOLD, 24));
		btnBmi.setBounds(10, 171, 197, 57);
		panel.add(btnBmi);
		
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
		btnLogout.setBounds(10, 475, 197, 57);
		panel.add(btnLogout);
		
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
		btnContactUs.setBounds(10, 374, 197, 57);
		panel.add(btnContactUs);
		
		JButton btnAttendance = new JButton("ATTENDANCE");
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
		btnAttendance.setBounds(10, 270, 217, 57);
		panel.add(btnAttendance);
		
		
		
		
		
		JLabel lblNewLabel1 = new JLabel("CALCULATE BMI");
		lblNewLabel1.setBounds(443, 10, 321, 39);
		lblNewLabel1.setBackground(Color.BLACK);
		lblNewLabel1.setForeground(Color.WHITE);
		lblNewLabel1.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 32));
		f.getContentPane().add(lblNewLabel1);
		
		JLabel lblNewLabel_1_7 = new JLabel("ENTER WEIGTH IN KG");
		lblNewLabel_1_7.setBounds(333, 146, 321, 39);
		lblNewLabel_1_7.setBackground(new Color(255, 255, 255));
		lblNewLabel_1_7.setForeground(Color.BLACK);
		lblNewLabel_1_7.setFont(new Font("Garamond", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel_1_7);
		
		
		
		WeighttextField = new JTextField();
		WeighttextField.setBounds(712, 146, 106, 39);
		WeighttextField.setForeground(Color.BLACK);
		WeighttextField.setBackground(Color.WHITE);
		WeighttextField.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		f.getContentPane().add(WeighttextField);
		
		WeighttextField.setColumns(10);
		
		
		Bmi_Button = new JButton("Calculate BMI");
		Bmi_Button.setBounds(443, 307, 211, 39);
		Bmi_Button.setForeground(Color.BLACK);
		Bmi_Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float weight = Float.parseFloat(WeighttextField.getText());
				float height = Float.parseFloat(Height_Text_Field.getText());
				float h=height;
				if((height <= 0) && (weight<=0)) {
					JOptionPane.showMessageDialog(null, "Please Enter Valid Weight And Height");
				}
				else  {
					float bmi = (weight/(height*height));
					BMI_Label.setText(String.valueOf(bmi));
					if(bmi<18.5) 
					{	Status_label.setText("UNDERWEIGHT");
					    
					textArea.setText("UNDERWEIGHT"
							+ "\n        This BMI is considered underweight.Being underweigth may pose \ncertain health risks,including nutrients deficiencies and hormonal \nchanges."
							+ "A person should consult with their healthcare provider and\nconsider making lifestyle changes through HEALTHY EATING and\nFITNESS to improve their health indicators.."
							+ "\n\n"
							+ "For this height, a weight range of "+minW(h)+"-"+maxW(h)+" kg is a normal BMI");
	                }
					else if(bmi>=18.5 && bmi<=24.9) 
					{	Status_label.setText("NORMAL");
					    textArea.setText("NORMAL"
					    		+ "\n        This BMI is considered normal. Maintaining a healthy weight \nmay lower the risk of developing certain health conditions,including"
					    		+ "\ncardiovascular disease and type 2 diabetes."
					    		+ "\nFor this height,a weight range of "+minW(h)+"-"+maxW(h)+" kg is a normal BMI");
					}
					else if(bmi>=25.0 && bmi<=29.9) 
					{	Status_label.setText("OVERWEIGHT");
					textArea.setText("OVERWEIGHT"
							+ "\n        This BMI is considered overweight.Being overweight may increase\nthe risk of certain health conditions,including cardiovascular disease,\nhigh blood pressure, and type 2 diabetes."
							+ " A person should consult\nwith their healthcare provider and consider making lifestyle changes\nthrough healthy eating and fitness to improve their health indicators."
							+ "\n\nFor this height, a weight range of "+minW(h)+"-"+maxW(h)+" kg is a normal BMI");
					}
					
					else {
						Status_label.setText("OBESE");
						textArea.setText("OBESE"
								+ "\n        This BMI is considered obese. People with obesity have increased\nrisk of cardiovascular disease, type 2 diabetes, high blood pressure"
								+ "\nand other health conditions.A person should consult with their\nhealthcare provider and consider making lifestyle changes through\nhealthy eating and fitness to improve their health indicators.\r\n"
								+ "\r\n"
								+ "For this height,a weight range of "+minW(h)+"-"+maxW(h)+" kg is a normal BMI");
					}
				}
			}
		});
		Bmi_Button.setBackground(Color.WHITE);
		Bmi_Button.setFont(new Font("Garamond", Font.BOLD, 25));
		f.getContentPane().add(Bmi_Button);
		
		JLabel lblNewLabel_1_7_1 = new JLabel("ENTER HEIGTH IN METERS ");
		lblNewLabel_1_7_1.setBounds(333, 220, 369, 44);
		lblNewLabel_1_7_1.setBackground(Color.BLACK);
		lblNewLabel_1_7_1.setForeground(Color.BLACK);
		lblNewLabel_1_7_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel_1_7_1.setFont(new Font("Garamond", Font.BOLD, 25));
		f.getContentPane().add(lblNewLabel_1_7_1);
		
		Height_Text_Field = new JTextField();
		Height_Text_Field.setBounds(712, 231, 106, 33);
		Height_Text_Field.setForeground(Color.BLACK);
		Height_Text_Field.setBackground(Color.WHITE);
		Height_Text_Field.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		Height_Text_Field.setColumns(10);
		f.getContentPane().add(Height_Text_Field);
		
		Status_label = new Label("");
		Status_label.setBounds(566, 380, 237, 56);
		Status_label.setAlignment(Label.CENTER);
		Status_label.setBackground(Color.WHITE);
		Status_label.setForeground(Color.BLACK);
		Status_label.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 21));
		f.getContentPane().add(Status_label);
		
		
		BMI_Label = new Label("");
		BMI_Label.setBounds(712, 307, 106, 39);
		BMI_Label.setBackground(Color.WHITE);
		BMI_Label.setForeground(Color.BLACK);
		BMI_Label.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		BMI_Label.setAlignment(Label.CENTER);
		f.getContentPane().add(BMI_Label);
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 2, 237, 726);
		panel1.setForeground(Color.WHITE);
		panel1.setBackground(Color.BLACK);
		f.getContentPane().add(panel1);
		panel1.setLayout(null);
		
		JButton btnNewButton1 = new JButton("HOME");
		btnNewButton1.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 15));
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new homeu();
			}
		});
		btnNewButton1.setBounds(72, 69, 165, 57);
		panel1.add(btnNewButton1);
		
		textArea = new TextArea();
		textArea.setBackground(new Color(255, 218, 185));
		textArea.setEditable(false);
		textArea.setForeground(Color.BLACK);
		textArea.setFont(new Font("Copperplate Gothic Light", Font.BOLD, 20));
		textArea.setBounds(319, 465, 699, 223);
		f.getContentPane().add(textArea);
		
		
		
		
	
		
		
	   
		
		f.setVisible(true);
		
	}
	
 

	public static void main(String[] args) {
		new mem_view_yorself ();
	}
	public Label getBMI_Label() {
		return BMI_Label;
	}
	public JButton getBmi_Button() {
		return Bmi_Button;
	}
	public Label getStatus_label() {
		return Status_label;
	}
	public TextArea getTextArea() {
		return textArea;
	}
}

