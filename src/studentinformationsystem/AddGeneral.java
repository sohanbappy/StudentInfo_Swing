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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JComboBox;
import com.toedter.calendar.JDateChooser;

public class AddGeneral extends JFrame {

	//variable declaration
	private JPanel contentPane;
	private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_7,textField_9,txtSrc;
	private JComboBox comboBox;
	private JDateChooser dateChooser;
	

	private JLabel lblNewLabel_2;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */

	
	public AddGeneral() {
		setBackground(Color.GRAY);
		setVisible(true);
		setResizable(false);
		setTitle("Student General Info");
		
		setBounds(100,50, 781, 610);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setForeground(Color.BLACK);
		lblId.setBounds(28, 66, 59, 24);
		contentPane.add(lblId);
		
		JLabel lblFaName = new JLabel("Father's Name");
		lblFaName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFaName.setBounds(28, 161, 96, 33);
		contentPane.add(lblFaName);
		
		JLabel lblMoName = new JLabel("Mother's Name");
		lblMoName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMoName.setBounds(28, 210, 96, 33);
		contentPane.add(lblMoName);
		
		JLabel lblMobile = new JLabel("Mobile");
		lblMobile.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMobile.setBounds(28, 254, 59, 40);
		contentPane.add(lblMobile);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEmail.setBounds(28, 307, 59, 33);
		contentPane.add(lblEmail);
		
		JLabel lblBlGr = new JLabel("Blood gr.");
		lblBlGr.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblBlGr.setBounds(28, 355, 59, 33);
		contentPane.add(lblBlGr);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(28, 403, 69, 33);
		contentPane.add(lblAddress);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(28, 111, 59, 33);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(158, 62, 165, 34);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(158, 111, 165, 34);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(158, 156, 165, 39);
		contentPane.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(158, 210, 165, 34);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(158, 261, 165, 34);
		contentPane.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(158, 306, 165, 35);
		contentPane.add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(158, 402, 165, 34);
		contentPane.add(textField_7);
		
		JButton btnNewButton = new JButton("ADD");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {     
				//for getting connection
				 dbMysqlConnection ob=new dbMysqlConnection();
					
					
					Connection conn = null; 
					conn=ob.getConnection();                                    
					
					PreparedStatement preparedStatement = null;
					
					                                             //query  for inserting to database
					
					String query = "insert into st_general(id,name,fa_name,mo_name,mobile,mail,bl_gr,address,dof,pass) values (?,?,?,?,?,?,?,?,?,?)";
			        try{
			        	java.util.Date	date1=new java.util.Date();
			        	java.util.Date date2=dateChooser.getDate();
			        	SimpleDateFormat frmt=new SimpleDateFormat("dd-MM-yyyy");
			        	 frmt.format(date1);
			        	
			            String mail_reg=textField_5.getText();
			            String mob_no=textField_4.getText();
			            String name=textField_1.getText();
			            String fa_name=textField_2.getText();
			            String mo_name=textField_3.getText();
			            		
			            
			            String date=frmt.format(dateChooser.getDate());
			           
			            
			            
			            if (mail_reg.matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$")){   //Regex for validation
			            	if (mob_no.matches("^[+]?([0-9][\\s-]?){11}$")){
			            		if(date1.compareTo(date2)>0){
			            			if (name.matches("^([A-Z]([a-z]+)[ ]?)*$")) {
			            				if (fa_name.matches("^([A-Z]([a-z]+)[ ]?)*$")) {
			            					if (mo_name.matches("^([A-Z]([a-z]+)[ ]?)*$")) {
										
									
			            			
			        	preparedStatement= conn.prepareStatement(query);
			        	
			        	preparedStatement.setInt(1,Integer.parseInt(textField.getText()));
			        	preparedStatement.setString(2,name);
			        	preparedStatement.setString(3,fa_name);
			            preparedStatement.setString(4,mo_name);
			            preparedStatement.setInt(5,Integer.parseInt(mob_no));
			            preparedStatement.setString(6,mail_reg);
			            preparedStatement.setString(7,(String)comboBox.getSelectedItem());
			            preparedStatement.setString(8,textField_7.getText());
			            preparedStatement.setString(9,date);
			            preparedStatement.setString(10,textField_9.getText());
			            preparedStatement.executeUpdate();
			            
			        JOptionPane.showMessageDialog(null, "Inserted successfully");
			        preparedStatement.close(); 
					conn.close();                        //close connection
			            		
			            					}
					            			else {
					            				JOptionPane.showMessageDialog(null,"Invalid Mother's Name !!");
										}
			            					}
				            			else {
				            				JOptionPane.showMessageDialog(null,"Invalid Father's Name !!");
									}
			            				}
			            			else {
			            				JOptionPane.showMessageDialog(null,"Invalid Name !!");
									}
			            			}
			            		else {
			            			JOptionPane.showMessageDialog(null,"DOF  Should be less than Current Date !!");
								}
			            	}
			            	else{
				            	JOptionPane.showMessageDialog(null,"Invalid Mobile Number !!");
				            }
			            }
			            else{
			            	JOptionPane.showMessageDialog(null,"Invalid E-mail !!");
			            }
				 }
					catch(Exception e){
						JOptionPane.showMessageDialog(null,e.toString()); } 
			}

			
		});
		btnNewButton.setBounds(459, 154, 126, 73);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			selectAddForm ob=new selectAddForm();
			dispose();
			}
		});
		btnNewButton_1.setBounds(459, 289, 126, 73);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Date of Birth");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(28, 447, 96, 33);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setForeground(Color.RED);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(28, 491, 86, 33);
		contentPane.add(lblNewLabel_1);
		
		textField_9 = new JTextField();
		textField_9.setBounds(158, 491, 165, 33);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(359, 66, 203, 225);
		contentPane.add(lblNewLabel_2);
		
		
		JLabel lblNewLabel_3 = new JLabel("         General Info");
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_3.setBounds(331, 11, 231, 24);
		contentPane.add(lblNewLabel_3);
		
		String blgroup[]={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
		comboBox = new JComboBox(blgroup);
		comboBox.setBounds(158, 359, 165, 27);
		contentPane.add(comboBox);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(158, 447, 165, 33);
		contentPane.add(dateChooser);
	}
}
