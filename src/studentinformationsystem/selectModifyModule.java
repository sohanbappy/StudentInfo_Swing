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
public class selectModifyModule extends JFrame {

	//variable declaration
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public selectModifyModule() {
		
		setVisible(true);
		setResizable(false);
		setTitle("Select Module");
		setBounds(100, 100, 588, 436);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("General");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ModifyGeneral ob=new ModifyGeneral();
			dispose();
			}
		});
		btnNewButton.setBounds(65, 125, 164, 58);
		contentPane.add(btnNewButton);
		
		JButton btnAcademic = new JButton("Academic");
		btnAcademic.setFont(new Font("Times New Roman", Font.BOLD, 15));
		btnAcademic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			ModifyAcademic ob=new ModifyAcademic();
			dispose();
			}
		});
		btnAcademic.setBounds(314, 125, 164, 58);
		contentPane.add(btnAcademic);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setForeground(Color.RED);
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Admin ob=new Admin();
			dispose();
			}
		});
		btnNewButton_1.setBounds(191, 245, 152, 58);
		contentPane.add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Select Module");
		lblNewLabel.setForeground(Color.GREEN);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(191, 29, 152, 20);
		contentPane.add(lblNewLabel);
	}

}
