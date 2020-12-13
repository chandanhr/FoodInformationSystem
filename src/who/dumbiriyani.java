package who;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.ImageIcon;

public class dumbiriyani extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dumbiriyani frame = new dumbiriyani();
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
	public dumbiriyani() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 994, 621);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Swaad!");
		lblNewLabel.setForeground(new Color(218, 112, 214));
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(407, 13, 109, 16);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(new Color(0, 128, 0));
		lblNewLabel_1.setFont(new Font("Courier New", Font.BOLD, 17));
		lblNewLabel_1.setBounds(12, 356, 56, 16);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("origin");
		lblNewLabel_2.setForeground(Color.MAGENTA);
		lblNewLabel_2.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel_2.setBounds(12, 412, 56, 38);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Description");
		lblNewLabel_3.setForeground(Color.BLUE);
		lblNewLabel_3.setFont(new Font("Constantia", Font.BOLD, 17));
		lblNewLabel_3.setBounds(12, 483, 99, 29);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setIcon(new ImageIcon(dumbiriyani.class.getResource("/who/istockphoto-519486575-612x612.jpg")));
		lblNewLabel_4.setBounds(283, 49, 610, 287);
		contentPane.add(lblNewLabel_4);
		
		JTextArea txtrHyderbadiDumBiryani = new JTextArea();
		txtrHyderbadiDumBiryani.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrHyderbadiDumBiryani.setText("Hyderbadi Dum Biryani");
		txtrHyderbadiDumBiryani.setBounds(133, 353, 693, 29);
		contentPane.add(txtrHyderbadiDumBiryani);
		
		JTextArea txtrHyderabadandrapradesh = new JTextArea();
		txtrHyderabadandrapradesh.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrHyderabadandrapradesh.setText("Hyderabad,AndraPradesh");
		txtrHyderabadandrapradesh.setBounds(133, 406, 693, 29);
		contentPane.add(txtrHyderabadandrapradesh);
		
		JTextArea txtrItIsMade = new JTextArea();
		txtrItIsMade.setFont(new Font("Mongolian Baiti", Font.PLAIN, 15));
		txtrItIsMade.setText("AP is called rice bowl of india and famous for variety of biryanis.\r\nMain ingredients are Basmati rice,Goat meat,chicken,vegetables,Spices.");
		txtrItIsMade.setBounds(133, 450, 693, 73);
		contentPane.add(txtrItIsMade);
		
		JLabel lblNewLabel_5 = new JLabel("Dum Biriyani");
		lblNewLabel_5.setForeground(Color.RED);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel_5.setBounds(45, 100, 192, 81);
		contentPane.add(lblNewLabel_5);
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnNewButton.setBounds(308, 536, 99, 38);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("exit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(471, 536, 97, 38);
		contentPane.add(btnNewButton_1);
	}
}