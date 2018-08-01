package studentinformationsystem;



import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;

/**
 * @bappy
 */
public class selectAddForm extends JFrame {

	//variable declaration
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public selectAddForm() {
		setResizable(false);
		setVisible(true);
		setTitle("Select Form");
		setBounds(100, 100, 562, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("General ");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			AddGeneral ob=new AddGeneral();
			dispose();
			}
		});
		btnNewButton.setBounds(56, 109, 160, 75);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Academic");
		btnNewButton_1.setFont(new Font("Times New Roman", Font.BOLD, 14));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			AddAcademic ob=new AddAcademic();
			dispose();
			}
		});
		btnNewButton_1.setBounds(293, 110, 166, 75);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("HOME");
		btnNewButton_2.setForeground(Color.RED);
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Admin ob=new Admin();
			dispose();
			}
		});
		btnNewButton_2.setBounds(172, 258, 206, 48);
		contentPane.add(btnNewButton_2);
		
		JLabel lblNewLabel = new JLabel("Select Form");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setBounds(202, 25, 127, 20);
		contentPane.add(lblNewLabel);
	}
}
