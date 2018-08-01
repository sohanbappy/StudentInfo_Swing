package studentinformationsystem;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.TableModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;




/**
 * @bappy
 */
public class ModifyAcademic extends JFrame {

	//variable declaration
	
	private JPanel contentPane;
	private JTable table;
	private JTextField textField,textField_3;
	private JTextField textField_srch;
	private JComboBox comboBox,comboBox_1,comboBox_2;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */

	
	public ModifyAcademic() {
		setVisible(true);
		setResizable(false);
		setTitle("Display Student Academic Info");
		setBounds(100, 100, 987, 531);
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
					//sql for Select info from Table(academic)
					String query = "select * from st_academic";
					//getting Connection Properties
						 dbMysqlConnection ob=new dbMysqlConnection();
							
						 ResultSet rs;
							
							con=ob.getConnection();
							statement=con.createStatement();
							rs=statement.executeQuery(query); //execute query
					 
					  table.setModel(DbUtils.resultSetToTableModel(rs));  //Table Model from API
					  
					  
					statement.close();
					con.close(); //close connection

					}
				
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,e);
						
					}
			
			}
		});
		btnNewButton.setBounds(437, 23, 108, 32);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(364, 66, 574, 202);
		contentPane.add(scrollPane);
		
		Font fnt=new Font("ARIAL",Font.BOLD,12);
		
		table = new JTable();
		table.setBackground(Color.cyan);
		table.setFont(fnt);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
			
			int i=table.getSelectedRow();
			TableModel model=table.getModel();
			
			textField.setText(model.getValueAt(i,0).toString());
			comboBox.setSelectedItem(model.getValueAt(i,1).toString());
			comboBox_1.setSelectedItem(model.getValueAt(i,2).toString());
			textField_3.setText(model.getValueAt(i,3).toString());
			comboBox_2.setSelectedItem(model.getValueAt(i,4).toString());
			
			}
		});
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				selectModifyModule ob=new selectModifyModule();
			dispose();
			}
		});
		btnNewButton_1.setBounds(727, 23, 111, 32);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(22, 42, 77, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Program");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setBounds(22, 95, 77, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Semester");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.GREEN);
		lblNewLabel_2.setBounds(22, 140, 77, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("CGPA");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setForeground(Color.GREEN);
		lblNewLabel_3.setBounds(22, 193, 77, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Result Status");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_4.setForeground(Color.GREEN);
		lblNewLabel_4.setBounds(22, 254, 87, 14);
		contentPane.add(lblNewLabel_4);
		
		textField = new JTextField();
		textField.setBounds(182, 24, 122, 32);
		textField.setEditable(false);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(182, 178, 122, 37);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewButton_2 = new JButton("UPDATE");
		btnNewButton_2.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//getting Connection Properties
				dbMysqlConnection ob=new dbMysqlConnection();
				Connection conn = null; 
				conn=ob.getConnection();
				
				PreparedStatement preparedStatement = null;
				
				Float point=Float.parseFloat(textField_3.getText());
				
				String query = "update st_academic set prog=?,sem=?,cgpa=?,res_st=?  where id=?";
		        try{
		            
		        	preparedStatement= conn.prepareStatement(query);
		        	
		        	if (point<=4.0 && point>0) {
		        	preparedStatement.setString(1,(String)comboBox.getSelectedItem());
		        	preparedStatement.setString(2,(String)comboBox_1.getSelectedItem());
		        	preparedStatement.setFloat(3,point);
		        	preparedStatement.setString(4,(String)comboBox_2.getSelectedItem());
		        	preparedStatement.setInt(5,Integer.parseInt(textField.getText()));
		            
		            
		            preparedStatement.executeUpdate();
		            
		            JOptionPane.showMessageDialog(null, "Updated successfully");
		            
		            preparedStatement.close(); 
				    conn.close(); //close connection
		        	}
		        	else{
		        	JOptionPane.showMessageDialog(null, "CGPA is Out of Ranges !");
				}
			 }
				catch(Exception e){
					 JOptionPane.showMessageDialog(null,e.toString()); } 
			}
		});
		btnNewButton_2.setBounds(437, 357, 138, 57);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("DELETE");
		btnNewButton_3.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//getting Connection Properties
				dbMysqlConnection ob=new dbMysqlConnection();
				Connection conn = null; 
				conn=ob.getConnection();
				
				PreparedStatement ps= null;
				
				
				//sql for deleting data from Table(academic)
				String query = "delete from st_academic  where id=?";
				
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
		btnNewButton_3.setBounds(730, 358, 122, 57);
		contentPane.add(btnNewButton_3);
		
		textField_srch = new JTextField();
		textField_srch.setBounds(22, 377, 138, 37);
		textField_srch.setText("enter ID");
		contentPane.add(textField_srch);
		textField_srch.setColumns(10);
		
		JButton btnNewButton_srch = new JButton("Search");
		btnNewButton_srch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
					Connection con= null; 
					Statement statement = null;
					//sql for Select info from Table(academic)
					String query = "select * from st_academic where id='"+textField_srch.getText()+"'";
					//getting Connection Properties
						 dbMysqlConnection ob=new dbMysqlConnection();
							
						 ResultSet rs;
							
							con=ob.getConnection();
							statement=con.createStatement();
							rs=statement.executeQuery(query); //execute query
					 
					  table.setModel(DbUtils.resultSetToTableModel(rs));  //Table Model from API
					  
					  
					statement.close();
					con.close(); //close connection

					}
				
					catch(Exception e)
					{
						JOptionPane.showMessageDialog(null,e);
					}
			}
		});
		btnNewButton_srch.setForeground(Color.RED);
		btnNewButton_srch.setFont(new Font("Sylfaen", Font.BOLD, 12));
		btnNewButton_srch.setBounds(197, 374, 107, 40);
		contentPane.add(btnNewButton_srch);
		
		String programs[]={"BCSE","BSEEE","BSCE","BSME","BBA"};
		comboBox = new JComboBox(programs);
		comboBox.setBounds(182, 72, 122, 37);
		contentPane.add(comboBox);
		
		String semesters[]={"1st","2nd","3rd","4th","5th","6th","7th","8th","9th","10th","11th","More"};
		comboBox_1 = new JComboBox(semesters);
		comboBox_1.setBounds(182, 129, 122, 39);
		contentPane.add(comboBox_1);
		
		String sts[]={"Execellent","Good","Probation","Suspension"};
		comboBox_2 = new JComboBox(sts);
		comboBox_2.setBounds(182, 229, 122, 39);
		contentPane.add(comboBox_2);
	}
}
