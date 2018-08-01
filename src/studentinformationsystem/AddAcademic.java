package studentinformationsystem;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;


public class AddAcademic extends JFrame {
	
	//variable declaration
	private JPanel contentPane;
	private JTextField textField,textField_3;
	
	private JComboBox comboBox,comboBox_1,comboBox_2;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	
	
	public AddAcademic() {
		
		setVisible(true);
		setResizable(false);
		setTitle("Student Academic Info");
		setBounds(100, 100, 559, 442);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(35, 80, 70, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Program");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(22, 139, 100, 38);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(22, 206, 100, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CGPA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(33, 275, 100, 22);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Result Status");
		lblNewLabel_4.setForeground(Color.RED);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setBounds(35, 322, 112, 30);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(158, 81, 149, 33);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(158, 272, 149, 30);
		contentPane.add(textField_3);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Sylfaen", Font.BOLD, 14));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//getting connection properties
				dbMysqlConnection ob=new dbMysqlConnection();
				
				
				Connection conn = null; 
				conn=ob.getConnection();
				
				PreparedStatement preparedStatement = null;
				
				//sql code for insert
				
				String query = "insert into st_academic(id,prog,sem,cgpa,res_st) values (?,?,?,?,?)";
		        try{
		        	
		        	String prog=(String)comboBox.getSelectedItem();
		        	String sem=(String)comboBox_1.getSelectedItem();
		            Float point=Float.parseFloat(textField_3.getText());
		        	preparedStatement= conn.prepareStatement(query);
		        	if (point<=4.0 && point>0) {
		        		
		        	preparedStatement.setInt(1,Integer.parseInt(textField.getText()));
		        	preparedStatement.setString(2,prog);
		        	preparedStatement.setString(3,sem);
		            preparedStatement.setFloat(4,point);
		            preparedStatement.setString(5,(String)comboBox_2.getSelectedItem());
		            
		            
		            preparedStatement.executeUpdate();
		            
		        JOptionPane.showMessageDialog(null, "Inserted successfully");
		        preparedStatement.close(); 
				conn.close(); 												//close connection
				
		        	}
		        	else{
		        	JOptionPane.showMessageDialog(null, "CGPA is Out of Ranges !");
				}
		       }
				catch(Exception e){
					 JOptionPane.showMessageDialog(null,e.toString()); } 
			}
		});
		btnNewButton.setBounds(385, 110, 100, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Sylfaen", Font.PLAIN, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			selectAddForm ob=new selectAddForm();
			dispose();
			}
		});
		btnNewButton_1.setBounds(385, 236, 100, 49);
		contentPane.add(btnNewButton_1);
		
		String programs[]={"BCSE","BSEEE","BSCE","BSME","BBA"};
		comboBox = new JComboBox(programs);
		comboBox.setBounds(158, 140, 149, 38);
		contentPane.add(comboBox);
		
		String semesters[]={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","More"};
		comboBox_1 = new JComboBox(semesters);
		comboBox_1.setBounds(158, 203, 149, 38);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_5 = new JLabel("Academic Info");
		lblNewLabel_5.setForeground(Color.GREEN);
		lblNewLabel_5.setFont(new Font("Sylfaen", Font.BOLD, 15));
		lblNewLabel_5.setBounds(190, 11, 137, 27);
		contentPane.add(lblNewLabel_5);
		
		String sts[]={"Execellent","Good","Probation","Suspension"};
		comboBox_2 = new JComboBox(sts);
		comboBox_2.setBounds(158, 322, 149, 38);
		contentPane.add(comboBox_2);
	}
}
