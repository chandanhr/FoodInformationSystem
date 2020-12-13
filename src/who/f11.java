package who;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;

public class f11 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					f11 frame = new f11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public f11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 737);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.BOLD, 18));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Khakhra","Dum Biryani","Moong dal dosa","Masala Chai","Bisibele Bath","Vada Pav","Momos","Mysuru Pak"}));

		comboBox.setBounds(323, 324, 236, 81);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel = new JLabel("Browse");
		lblNewLabel.setForeground(new Color(0, 0, 139));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel.setBounds(200, 324, 111, 81);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Swaad!");
		lblNewLabel_1.setForeground(new Color(255, 105, 180));
		lblNewLabel_1.setBackground(new Color(0, 255, 0));
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 50));
		lblNewLabel_1.setBounds(415, 133, 189, 89);
		contentPane.add(lblNewLabel_1);
		
		JButton btnSelect = new JButton("Select");
		btnSelect.setFont(new Font("Tahoma", Font.BOLD, 17));
		btnSelect.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String fname = comboBox.getSelectedItem().toString();
				
				 if (fname == "Khakhra"){
			        	khakra ob1=new khakra();
			        	ob1.setVisible(true);
			        	ob1.setResizable(false);
			        	
			 
			        }
			    

			        if (fname =="Dum Biryani"){
			        	dumbiriyani ob2=new dumbiriyani();
			        	ob2.setVisible(true);
			        	ob2.setResizable(false);
			        	
						}
			        if (fname == "Moong dal dosa"){	
			        	moongdaldosa ob3=new moongdaldosa();
			        	ob3.setVisible(true);
			        	ob3.setResizable(false);
			        	
			        }
			        if (fname == "Masala Chai"){
			        	masalachai ob4=new masalachai();
			        	ob4.setVisible(true);
			        	ob4.setResizable(false);
			        	
						}

			        if (fname == "Vada Pav"){
			        	vadapav ob5=new vadapav();
			        	ob5.setVisible(true);
			        	ob5.setResizable(false);
			        	
						}


			        if (fname == "Bisibele Bath"){
			        	bisibelebath ob6=new bisibelebath();
			        	ob6.setVisible(true);
			        	ob6.setResizable(false);
						}

			        if (fname == "Momos"){
			        	momos ob7=new momos();
			        	ob7.setVisible(true);
			        	ob7.setResizable(false);
			        
						}
			        
			        if (fname == "Mysuru Pak"){
			        	mysurupak ob8=new mysurupak();
			        	ob8.setVisible(true);
			        	ob8.setResizable(false);
			        	
						}
			}
		});
		btnSelect.setBounds(599, 329, 97, 70);
		contentPane.add(btnSelect);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setIcon(new ImageIcon(f11.class.getResource("/who/1153fa2bf47479abe9d9609483375fe3.jpg")));
		lblNewLabel_2.setBounds(-17, 0, 1206, 677);
		contentPane.add(lblNewLabel_2);
	}
}
