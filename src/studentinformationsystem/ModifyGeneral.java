package studentinformationsystem;


import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;

import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import javax.swing.JComboBox;




/**
 * @bappy
 */
public class ModifyGeneral extends JFrame {

	//variable declaration
	
	private JPanel contentPane;
	private JTable table;
	private JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_7,textField_9;
	private JTextField textField_srch;
	private JDateChooser dateChooser;
	private JComboBox comboBox;
	
	
	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the frame.
	 */
	

	public ModifyGeneral() {
		
		setVisible(true);
		setResizable(false);
		setTitle("Display Student General Info");
		setBounds(30,30, 1256, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Refresh");
		btnNewButton.setForeground(Color.MAGENTA);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				try{
					Connection con= null; 
					Statement statement = null;

					//sql for select all
					String query = "select * from st_general";
					dbMysqlConnection ob=new dbMysqlConnection();
					 ResultSet rs;
							con=ob.getConnection();
							statement=con.createStatement();
						rs=statement.executeQuery(query); //execute query
						table.setModel(DbUtils.resultSetToTableModel(rs));       //using API  for Table Model
					  statement.close();
					  con.close(); //close connection
	
					}
				
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,e); 
					}
			
			}
		});
		btnNewButton.setBounds(660, 23, 108, 32);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(389, 66, 841, 202);
		contentPane.add(scrollPane);
		
		Font fnt=new Font("ARIAL",Font.BOLD,12);
		
		table = new JTable();
		table.setBackground(Color.cyan);
		table.setFont(fnt);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			try {
				
	        	 
				int i=table.getSelectedRow();
				TableModel model=(DefaultTableModel)table.getModel();
		     	java.util.Date	date =new SimpleDateFormat("dd-MM-yyyy").parse((String)model.getValueAt(i,8));
			 
			
			textField.setText(model.getValueAt(i,0).toString());
			textField_1.setText(model.getValueAt(i,1).toString());
			textField_2.setText(model.getValueAt(i,2).toString());
			textField_3.setText(model.getValueAt(i,3).toString());
			textField_4.setText(model.getValueAt(i,4).toString());
			textField_5.setText(model.getValueAt(i,5).toString());
			comboBox.setSelectedItem(model.getValueAt(i,6).toString());
			textField_7.setText(model.getValueAt(i,7).toString());
			dateChooser.setDate(date);
			textField_9.setText(model.getValueAt(i,9).toString());
			}
			catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			selectModifyModule ob=new selectModifyModule();
			dispose();
			}
		});
		btnNewButton_1.setBounds(921, 22, 111, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(22, 35, 77, 21);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(22, 66, 77, 29);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Father's Name");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBounds(22, 106, 108, 30);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Mother's Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(22, 147, 108, 30);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Mobile ");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setBounds(22, 196, 87, 27);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("E-mail");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_5.setForeground(Color.GREEN);
		lblNewLabel_5.setBounds(22, 242, 77, 29);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Blood gr.");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_6.setForeground(Color.GREEN);
		lblNewLabel_6.setBounds(22, 289, 77, 27);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Address");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_7.setForeground(Color.GREEN);
		lblNewLabel_7.setBounds(22, 342, 77, 29);
		contentPane.add(lblNewLabel_7);
		
		textField = new JTextField();
		textField.setBounds(182, 23, 157, 32);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(182, 66, 157, 32);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(182, 109, 157, 33);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 153, 157, 32);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(182, 196, 157, 30);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(182, 242, 157, 32);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(182, 342, 157, 32);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dbMysqlConnection ob=new dbMysqlConnection();
				Connection conn = null; 
				conn=ob.getConnection();
				
				PreparedStatement preparedStatement = null;
				//sql for upadte Table (general)
				
				
				String query = "update st_general set name=?,fa_name=?,mo_name=?,mobile=?,mail=?,bl_gr=?,address=?,dof=?,pass=? where id=?";
		        try{
		        	
		        	java.util.Date	date1=new java.util.Date();
		        	java.util.Date date2=dateChooser.getDate();
		        	SimpleDateFormat frmt=new SimpleDateFormat("dd-MM-yyyy");
		        	 frmt.format(date1);
					
		        	 String mail_reg=textField_5.getText();
			            String name=textField_1.getText();
			            String fa_name=textField_2.getText();
			            String mo_name=textField_3.getText();
			            String date=frmt.format(dateChooser.getDate());    
		        	
			            if (mail_reg.matches("^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$")){   //Regex for validation
			            		if(date1.compareTo(date2)>0){
			            			if (name.matches("^([A-Z]([a-z]+)[ ]?)*$")) {
			            				if (fa_name.matches("^([A-Z]([a-z]+)[ ]?)*$")) {
			            					if (mo_name.matches("^([A-Z]([a-z]+)[ ]?)*$")) {
		            
		        	preparedStatement= conn.prepareStatement(query);
		        	
		        	preparedStatement.setString(1,textField_1.getText());
		        	preparedStatement.setString(2,textField_2.getText());
		        	preparedStatement.setString(3,textField_3.getText());
		        	preparedStatement.setInt(4,Integer.parseInt(textField_4.getText()));
		        	preparedStatement.setString(5,textField_5.getText());
		        	preparedStatement.setString(6,(String)comboBox.getSelectedItem());
		            preparedStatement.setString(7,textField_7.getText());
		            preparedStatement.setString(8,date);
		            preparedStatement.setString(9,textField_9.getText());
		            preparedStatement.setInt(10,Integer.parseInt(textField.getText()));
		          
		            
		            preparedStatement.executeUpdate();
		            
		            JOptionPane.showMessageDialog(null, "Updated successfully");
		            preparedStatement.close(); 
				    conn.close(); //close connection
				    
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
			            			JOptionPane.showMessageDialog(null,"DOF Should be less than Current Date !!");
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
		btnNewButton_2.setBounds(1051, 314, 122, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				dbMysqlConnection ob=new dbMysqlConnection();
				Connection conn = null; 
				conn=ob.getConnection();
				
				PreparedStatement ps= null;
				
				//sql for delete info from Table(general)
				
				String query = "delete from st_general  where id=?";
				
		        try{
		            
		        	ps= conn.prepareStatement(query);
		        	ps.setInt(1,Integer.parseInt(textField.getText()));
		        	ps.executeUpdate();
		            
		            JOptionPane.showMessageDialog(null, "Deleted successfully");
		            ps.close(); 
				    conn.close(); //close connection
			 }
				catch(Exception e){
					JOptionPane.showMessageDialog(null,e.toString()); } 
			}
		});
		btnNewButton_3.setBounds(807, 314, 122, 57);
		contentPane.add(btnNewButton_3);
		
		JLabel lblNewLabel_8 = new JLabel("Date of Birth");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_8.setForeground(Color.GREEN);
		lblNewLabel_8.setBounds(22, 385, 108, 30);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPassword.setForeground(Color.GREEN);
		lblPassword.setBounds(22, 435, 77, 27);
		contentPane.add(lblPassword);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(182, 435, 157, 30);
		contentPane.add(textField_9);
		
		textField_srch = new JTextField("enter ID");
		textField_srch.setBounds(389, 328, 148, 32);
		contentPane.add(textField_srch);
		textField_srch.setColumns(10);
		
		JButton btnNewButton_srch = new JButton("Search");
		btnNewButton_srch.setForeground(Color.RED);
		btnNewButton_srch.setFont(new Font("Sylfaen", Font.BOLD, 12));
		btnNewButton_srch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection con= null; 
					Statement statement = null;

					//sql for select all
					String query = "select * from st_general where id='"+textField_srch.getText()+"'";
					dbMysqlConnection ob=new dbMysqlConnection();
					 ResultSet rs;
							con=ob.getConnection();
							statement=con.createStatement();
						rs=statement.executeQuery(query); //execute query
						table.setModel(DbUtils.resultSetToTableModel(rs));       //using API  for Table Model
					  statement.close();
					  con.close(); //close connection
	
					}
				
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,e); 
					}
			}
		});
		btnNewButton_srch.setBounds(565, 328, 89, 32);
		contentPane.add(btnNewButton_srch);
		
		dateChooser = new JDateChooser();
		dateChooser.setBounds(182, 385, 157, 30);
		contentPane.add(dateChooser);
		
		String blgroup[]={"A+","A-","B+","B-","O+","O-","AB+","AB-"};
		comboBox = new JComboBox(blgroup);
		comboBox.setBounds(182, 289, 157, 32);
		contentPane.add(comboBox);
	}
}
