package studentinformationsystem;


import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;



/**
 * @bappy
 */
public class Admin extends JFrame {
	
	//variable declaration
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Admin() {
		setResizable(false);
		setVisible(true);
		setTitle("Admin Page");
		setBounds(100, 100, 550, 396);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("ADD NEW");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			selectAddForm ob=new selectAddForm();
			dispose();
			}
		});
		btnNewButton.setBounds(61, 94, 123, 44);
		contentPane.add(btnNewButton);
		
		JButton btnModify = new JButton("MODIFY");
		btnModify.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnModify.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			selectModifyModule ob=new selectModifyModule();
			dispose();
			}
		});
		btnModify.setBounds(293, 94, 123, 44);
		contentPane.add(btnModify);
		
		JButton btnBack = new JButton("Back");
		btnBack.setForeground(Color.RED);
		btnBack.setFont(new Font("Sylfaen", Font.BOLD, 15));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Home ob=new Home();
			dispose();
			JOptionPane.showMessageDialog(null,"Successfully Logout !!");
			}
		});
		btnBack.setBounds(170, 229, 137, 50);
		contentPane.add(btnBack);
	}
}
