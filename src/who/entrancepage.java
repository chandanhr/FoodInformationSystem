package who;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class entrancepage extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					entrancepage frame = new entrancepage();
					frame.setVisible(true);
					frame.setResizable(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public entrancepage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1327, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMalnadCollegeOf = new JLabel("MALNAD COLLEGE OF ENGINEERING,HASSAN");
		lblMalnadCollegeOf.setForeground(new Color(0, 139, 139));
		lblMalnadCollegeOf.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblMalnadCollegeOf.setBounds(334, 0, 701, 53);
		contentPane.add(lblMalnadCollegeOf);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(entrancepage.class.getResource("/who/icon.jpg")));
		lblNewLabel.setBounds(590, 46, 152, 161);
		contentPane.add(lblNewLabel);
		
		JLabel lblProjectOn = new JLabel("PROJECT  ON :");
		lblProjectOn.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblProjectOn.setBounds(357, 233, 134, 30);
		contentPane.add(lblProjectOn);
		
		JLabel lblFoodInformationSystem = new JLabel("FOOD INFORMATION SYSTEM");
		lblFoodInformationSystem.setForeground(new Color(255, 0, 255));
		lblFoodInformationSystem.setFont(new Font("Gabriola", Font.BOLD, 25));
		lblFoodInformationSystem.setBounds(542, 224, 331, 53);
		contentPane.add(lblFoodInformationSystem);
		
		JButton button = new JButton("");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Start ob1=new Start();
				ob1.setVisible(true);
				ob1.setResizable(false);
				dispose();
		
			}
		});
		button.setIcon(new ImageIcon(entrancepage.class.getResource("/who/go.png")));
		button.setBounds(1070, 470, 62, 57);
		contentPane.add(button);
		
		JLabel lblSubmittedBy = new JLabel("Submitted By :");
		lblSubmittedBy.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSubmittedBy.setBounds(357, 307, 134, 30);
		contentPane.add(lblSubmittedBy);
		
		JLabel lblNewLabel_1 = new JLabel("CHANDAN H R                        4MC17IS008");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(521, 364, 388, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("DEEPAK H M                            4MC17IS010");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(521, 393, 310, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("DEEPU K B                               4MC17IS011");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_3.setBounds(521, 429, 331, 43);
		contentPane.add(lblNewLabel_3);
	}
}
