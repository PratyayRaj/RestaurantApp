package Resturant;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Resturant extends JFrame {
	protected static final String JOption = null;
	private JPanel contentPane;
	private JTextField textField; 
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_11;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JFrame frame;
	public JButton btnPrint;
	public JButton btnTotal;
	
	String iTax, iSubTotal, iTotal;
	double [] itemcost = new double[50];
    String bill;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resturant frame = new Resturant();
					frame.setVisible(true);
				} catch (Exception e) {
                    System.out.print("Exception caught from main function ");
					e.printStackTrace();
				}
			}
		});
	}
	public Resturant() {
		Super("Restaurant Management");
        bill = "\tRestaurant\n\n\n\n\tOrder Some food for yourself  😄";
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1410, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(176, 196, 222));
		panel.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel.setBounds(10, 10, 1379, 718);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(689, 19, 1, 1);
		panel_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_1.setBackground(new Color(176, 196, 222));
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(175, 238, 238)));
		panel_2.setBackground(new Color(176, 196, 222));
		panel_2.setBounds(35, 36, 416, 449);
		panel.add(panel_2);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_1_1.setBackground(new Color(176, 196, 222));
		panel_1_1.setBounds(689, 19, 1, 1);
		panel_2.add(panel_1_1);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(212, 40, 153, 30);
		panel_2.add(textField);
		textField.setColumns(10);
		
		JLabel lblCustomerRef = new JLabel("C.Reference");
		lblCustomerRef.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblCustomerRef.setBounds(32, 38, 153, 34);
		panel_2.add(lblCustomerRef);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setColumns(10);
		textField_1.setBounds(212, 100, 153, 30);
		panel_2.add(textField_1);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblFirstName.setBounds(32, 98, 153, 34);
		panel_2.add(lblFirstName);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setColumns(10);
		textField_2.setBounds(212, 160, 153, 30);
		panel_2.add(textField_2);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblLastName.setBounds(32, 158, 153, 34);
		panel_2.add(lblLastName);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_3.setColumns(10);
		textField_3.setBounds(212, 220, 153, 34);
		panel_2.add(textField_3);
		
		JLabel lblAddress = new JLabel("Address\r\n");
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAddress.setBounds(32, 218, 153, 34);
		panel_2.add(lblAddress);
		
		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_4.setColumns(10);
		textField_4.setBounds(212, 280, 153, 30);
		panel_2.add(textField_4);
		
		JLabel lblPhone = new JLabel("Phone");
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblPhone.setBounds(32, 278, 153, 34);
		panel_2.add(lblPhone);
		
		textField_5 = new JTextField();
		textField_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_5.setColumns(10);
		textField_5.setBounds(212, 340, 153, 34);
		panel_2.add(textField_5);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblEmail.setBounds(32, 338, 153, 34);
		panel_2.add(lblEmail);
		
		JLabel lblGender = new JLabel("Gender");
		lblGender.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblGender.setBounds(32, 378, 153, 34);
		panel_2.add(lblGender);
		
		String[] gen = {"MALE", "FEMALE"};
		JComboBox comboBox = new JComboBox(gen);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 20));
		//comboBox.setModel(new DefaultComboBoxModel(new String[] {"MALE", "FEMALE"}));
		comboBox.setBounds(212, 380, 153, 32);
		panel_2.add(comboBox);
		
		JPanel panel_3 = new JPanel();
		panel_3.setLayout(null);
		panel_3.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_3.setBackground(new Color(176, 196, 222));
		panel_3.setBounds(471, 36, 416, 648);
		panel.add(panel_3);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_1_2.setBackground(new Color(176, 196, 222));
		panel_1_2.setBounds(689, 19, 1, 1);
		panel_3.add(panel_1_2);
		
		JCheckBox chkveg = new JCheckBox("VEGETERIAN");
		
		chkveg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (chkveg.isSelected())
				{
					textField_6.setEnabled(true);
                    textField_6.setText("");
					textField_6.requestFocus();
				}
				else
				{
					textField_6.setEnabled(false);
					textField_6.setText("0");
				}
			}
		});
		chkveg.setBackground(new Color(176, 224, 230));
		chkveg.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkveg.setBounds(27, 55, 169, 23);
		panel_3.add(chkveg);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setText("0");
		textField_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_6.setColumns(10);
		textField_6.setBounds(307, 55, 89, 23);
		textField_6.setEnabled(false);
		panel_3.add(textField_6);
		
		JCheckBox chknveg = new JCheckBox("NON VEG");
		chknveg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chknveg.isSelected()) {
					textField_7.setEnabled(true);
					textField_7.setText("");
					textField_7.requestFocus();
				}
				else {
					textField_7.setEnabled(false);
					textField_7.setText("0");
				} 
			}
		});
		chknveg.setBackground(new Color(176, 224, 230));
		chknveg.setFont(new Font("Tahoma", Font.BOLD, 16));
		chknveg.setBounds(27, 84, 169, 23);
		panel_3.add(chknveg);
		
		textField_7 = new JTextField();
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setText("0");
		textField_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(307, 84, 89, 23);
		textField_7.setEnabled(false);
		panel_3.add(textField_7);
		
		JCheckBox chkpaneer = new JCheckBox("PANEER");
		chkpaneer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkpaneer.isSelected()) {
					textField_8.setEnabled(true);
					textField_8.setText("");
					textField_8.requestFocus();
				}
				else {
					textField_8.setEnabled(false);
					textField_8.setText("0");
				} 
			}
		});
		chkpaneer.setBackground(new Color(176, 224, 230));
		chkpaneer.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkpaneer.setBounds(27, 116, 169, 23);
		panel_3.add(chkpaneer);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setText("0");
		textField_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(307, 115, 89, 23);
		textField_8.setEnabled(false);
		panel_3.add(textField_8);
		
		JCheckBox chkonion = new JCheckBox("ONION");
		chkonion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkonion.isSelected()) {
					textField_9.setEnabled(true);
					textField_9.setText("");
					textField_9.requestFocus();
				}
				else {
					textField_9.setEnabled(false);
					textField_9.setText("0");
				} 
			}
		});
		chkonion.setBackground(new Color(176, 224, 230));
		chkonion.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkonion.setBounds(27, 145, 169, 23);
		panel_3.add(chkonion);
		
		textField_9 = new JTextField();
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setText("0");
		textField_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(307, 145, 89, 23);
		textField_9.setEnabled(false);
		panel_3.add(textField_9);
		
		JCheckBox chksweet = new JCheckBox("SWEET CORN");
		chksweet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chksweet.isSelected()) {
					textField_11.setEnabled(true);
					textField_11.setText("");
					textField_11.requestFocus();
				}
				else {
					textField_11.setEnabled(false);
					textField_11.setText("0");
				} 
			}
		});
		chksweet.setBackground(new Color(176, 224, 230));
		chksweet.setFont(new Font("Tahoma", Font.BOLD, 16));
		chksweet.setBounds(27, 174, 169, 23);
		panel_3.add(chksweet);
		
		textField_11 = new JTextField();
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setText("0");
		textField_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(307, 174, 89, 23);
		textField_11.setEnabled(false);
		panel_3.add(textField_11);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setText("0");
		textField_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_13.setColumns(10);
		textField_13.setBounds(307, 279, 89, 23);
		textField_13.setEnabled(false);
		panel_3.add(textField_13);
		
		JCheckBox chknv = new JCheckBox("NV PATTY");
		chknv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chknv.isSelected()) {
					textField_13.setEnabled(true);
					textField_13.setText("");
					textField_13.requestFocus();
				}
				else {
					textField_13.setEnabled(false);
					textField_13.setText("0");
				}
			}
		});
		chknv.setBackground(new Color(176, 224, 230));
		chknv.setFont(new Font("Tahoma", Font.BOLD, 16));
		chknv.setBounds(27, 279, 169, 23);
		panel_3.add(chknv);
		
		textField_14 = new JTextField();
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setText("0");
		textField_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_14.setColumns(10);
		textField_14.setBounds(307, 309, 89, 23);
		textField_14.setEnabled(false);
		panel_3.add(textField_14);
		
		JCheckBox chkm = new JCheckBox("MAHA MEAL");
		textField_14.setEnabled(false);
		chkm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkm.isSelected()) {
					textField_14.setEnabled(true);
					textField_14.setText("");
					textField_14.requestFocus();
				}
				else {
					textField_14.setEnabled(false);
					textField_14.setText("0");
				} 
			}
		});
		chkm.setBackground(new Color(176, 224, 230));
		chkm.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkm.setBounds(27, 309, 169, 23);
		panel_3.add(chkm);
		
		JCheckBox chkmeal = new JCheckBox("MEAL BOX");
		
		chkmeal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkmeal.isSelected()) {
					textField_15.setEnabled(true);
					textField_15.setText("");
					textField_15.requestFocus();
				}
				else {
					textField_15.setEnabled(false);
					textField_15.setText("0");
				} 
			}
		});
		chkmeal.setBackground(new Color(176, 224, 230));
		chkmeal.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkmeal.setBounds(27, 337, 169, 23);
		panel_3.add(chkmeal);
		textField_15 = new JTextField();
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setText("0");
		textField_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_15.setColumns(10);
		textField_15.setBounds(307, 337, 89, 23);
		textField_15.setEnabled(false);
		panel_3.add(textField_15);
		
		JCheckBox chkv = new JCheckBox("V PATTY");
		
		chkv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkv.isSelected()) {
					textField_16.setEnabled(true);
					textField_16.setText("");
					textField_16.requestFocus();
				}
				else {
					textField_16.setEnabled(false);
					textField_16.setText("0");
				} 
			}
		});
		chkv.setBackground(new Color(176, 224, 230));
		chkv.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkv.setBounds(27, 250, 169, 23);
		panel_3.add(chkv);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setText("0");
		textField_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_16.setColumns(10);
		textField_16.setBounds(307, 250, 89, 23);
		textField_16.setEnabled(false);
		panel_3.add(textField_16);
		
		JCheckBox chkcoke = new JCheckBox("COKE/DEW/SPRITE");
		
		chkcoke.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkcoke.isSelected()) {
					textField_17.setEnabled(true);
					textField_17.setText("");
					textField_17.requestFocus();
				}
				else {
					textField_17.setEnabled(false);
					textField_17.setText("0");
				} 
			}
		});
		chkcoke.setBackground(new Color(176, 224, 230));
		chkcoke.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkcoke.setBounds(27, 412, 169, 23);
		panel_3.add(chkcoke);
		
		textField_17 = new JTextField();
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setText("0");
		textField_17.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_17.setColumns(10);
		textField_17.setBounds(307, 412, 89, 23);
		textField_17.setEnabled(false);
		panel_3.add(textField_17);
		
		JCheckBox chkwater = new JCheckBox("WATER/SODA");
		
		chkwater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkwater.isSelected()) {
					textField_18.setEnabled(true);
					textField_18.setText("");
					textField_18.requestFocus();
				}
				else {
					textField_18.setEnabled(false);
					textField_18.setText("0");
				} 
			}
		});
		chkwater.setBackground(new Color(176, 224, 230));
		chkwater.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkwater.setBounds(27, 441, 169, 23);
		panel_3.add(chkwater);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setText("0");
		textField_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_18.setColumns(10);
		textField_18.setBounds(307, 441, 89, 23);
		textField_18.setEnabled(false);
		panel_3.add(textField_18);
		
		JLabel lblNewLabel_1 = new JLabel("PIZZA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_1.setBounds(27, 19, 169, 25);
		panel_3.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("BURGER");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_2.setBounds(27, 217, 169, 23);
		panel_3.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SOFT DRINKS");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_3.setBounds(27, 383, 169, 23);
		panel_3.add(lblNewLabel_3);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setText("0");
		textField_20.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField_20.setColumns(10);
		textField_20.setBounds(307, 517, 89, 23);
		panel_3.add(textField_20);
		
		JCheckBox chkice = new JCheckBox("ICE CREAM");
		textField_20.setEnabled(false);
		chkice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (chkice.isSelected()) {
					textField_20.setEnabled(true);
					textField_20.setText("");
					textField_20.requestFocus();
				}
				else {
					textField_20.setEnabled(false);
					textField_20.setText("0");
				} 
			}
		});
		chkice.setBackground(new Color(176, 224, 230));
		chkice.setFont(new Font("Tahoma", Font.BOLD, 16));
		chkice.setBounds(27, 517, 169, 23);
		panel_3.add(chkice);
		
		JLabel lblNewLabel_4 = new JLabel("DESERTS");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_4.setBounds(27, 488, 169, 23);
		panel_3.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("75");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5.setBounds(208, 55, 89, 23);
		panel_3.add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("PRICE");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_1.setBounds(206, 19, 89, 23);
		panel_3.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("QUANTITY");
		lblNewLabel_5_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_5_1_1.setBounds(307, 19, 89, 23);
		panel_3.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_5_2 = new JLabel("95");
		lblNewLabel_5_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2.setBounds(208, 84, 89, 23);
		panel_3.add(lblNewLabel_5_2);
		
		JLabel lblNewLabel_5_2_1 = new JLabel("65");
		lblNewLabel_5_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_1.setBounds(208, 116, 89, 23);
		panel_3.add(lblNewLabel_5_2_1);
		
		JLabel lblNewLabel_5_2_2 = new JLabel("79");
		lblNewLabel_5_2_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_2.setBounds(208, 145, 89, 23);
		panel_3.add(lblNewLabel_5_2_2);
		
		JLabel lblNewLabel_5_2_3 = new JLabel("80");
		lblNewLabel_5_2_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_3.setBounds(208, 174, 89, 23);
		panel_3.add(lblNewLabel_5_2_3);
		
		JLabel lblNewLabel_5_2_4 = new JLabel("68");
		lblNewLabel_5_2_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_4.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_4.setBounds(208, 250, 89, 23);
		panel_3.add(lblNewLabel_5_2_4);
		
		JLabel lblNewLabel_5_2_5 = new JLabel("78");
		lblNewLabel_5_2_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_5.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_5.setBounds(208, 279, 89, 23);
		panel_3.add(lblNewLabel_5_2_5);
		
		JLabel lblNewLabel_5_2_6 = new JLabel("150");
		lblNewLabel_5_2_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_6.setBounds(208, 309, 89, 23);
		panel_3.add(lblNewLabel_5_2_6);
		
		JLabel lblNewLabel_5_2_7 = new JLabel("169");
		lblNewLabel_5_2_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_7.setBounds(208, 337, 89, 23);
		panel_3.add(lblNewLabel_5_2_7);
		
		JLabel lblNewLabel_5_2_8 = new JLabel("60");
		lblNewLabel_5_2_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_8.setBounds(208, 412, 89, 23);
		panel_3.add(lblNewLabel_5_2_8);
		
		JLabel lblNewLabel_5_2_9 = new JLabel("25");
		lblNewLabel_5_2_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_9.setBounds(208, 441, 89, 23);
		panel_3.add(lblNewLabel_5_2_9);
		
		JLabel lblNewLabel_5_2_10 = new JLabel("45");
		lblNewLabel_5_2_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_2_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_5_2_10.setBounds(208, 517, 89, 23);
		panel_3.add(lblNewLabel_5_2_10);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(907, 500, 416, 184);
		panel.add(panel_3_2);
		panel_3_2.setLayout(null);
		panel_3_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_3_2.setBackground(new Color(176, 196, 222));
		
		JPanel panel_1_2_2 = new JPanel();
		panel_1_2_2.setLayout(null);
		panel_1_2_2.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_1_2_2.setBackground(new Color(176, 196, 222));
		panel_1_2_2.setBounds(689, 19, 1, 1);
		panel_3_2.add(panel_1_2_2);
		
		JLabel lblTax = new JLabel("Tax");
		lblTax.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTax.setBounds(37, 33, 153, 34);
		panel_3_2.add(lblTax);
		
		textField_21 = new JTextField(" ");
		textField_21.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_21.setColumns(10);
		textField_21.setBounds(217, 35, 153, 30);
		panel_3_2.add(textField_21);
		
		JLabel lblSubTotal = new JLabel("SubTotal");
		lblSubTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblSubTotal.setBounds(37, 75, 153, 34);
		panel_3_2.add(lblSubTotal);
		
		textField_22 = new JTextField(" ");
		textField_22.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_22.setColumns(10);
		textField_22.setBounds(217, 77, 153, 30);
		panel_3_2.add(textField_22);
		
		JLabel lblTotal = new JLabel("Total");
		lblTotal.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblTotal.setBounds(37, 117, 153, 34);
		panel_3_2.add(lblTotal);
		
		textField_23 = new JTextField(" ");
		textField_23.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_23.setColumns(10);
		textField_23.setBounds(217, 119, 153, 30);
		panel_3_2.add(textField_23);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(907, 36, 416, 449);
		panel.add(panel_3_1);
		panel_3_1.setLayout(null);
		panel_3_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_3_1.setBackground(new Color(176, 196, 222));
		
		JPanel panel_1_2_1 = new JPanel();
		panel_1_2_1.setLayout(null);
		panel_1_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_1_2_1.setBackground(new Color(176, 196, 222));
		panel_1_2_1.setBounds(689, 19, 1, 1);
		panel_3_1.add(panel_1_2_1);
		

		JTextArea textArea = new JTextArea(bill); 
		textArea.setEditable(false);                 
		textArea.setBounds(23, 19, 370, 407);
		panel_3_1.add(textArea);

        
		JPanel panel_3_2_1 = new JPanel();
		panel_3_2_1.setLayout(null);
		panel_3_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_3_2_1.setBackground(new Color(176, 196, 222));
		panel_3_2_1.setBounds(35, 500, 416, 184);
		panel.add(panel_3_2_1);
		
		JPanel panel_1_2_2_1 = new JPanel();
		panel_1_2_2_1.setLayout(null);
		panel_1_2_2_1.setBorder(new MatteBorder(14, 14, 14, 14, (Color) new Color(176, 224, 230)));
		panel_1_2_2_1.setBackground(new Color(176, 196, 222));
		panel_1_2_2_1.setBounds(689, 19, 1, 1);
		panel_3_2_1.add(panel_1_2_2_1);
		
		JButton btnPrint = new JButton("ORDER");
		btnPrint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
                itemcost[0] = Double.parseDouble(textField_6.getText()) * 75.00;
				itemcost[1] = Double.parseDouble(textField_7.getText()) * 95.00;
				itemcost[2] = Double.parseDouble(textField_8.getText()) * 65.00;
				itemcost[3] = Double.parseDouble(textField_9.getText()) * 79.00;
				itemcost[4] = Double.parseDouble(textField_11.getText()) * 80.00;
				itemcost[5] = Double.parseDouble(textField_16.getText()) * 68.00;
				itemcost[6] = Double.parseDouble(textField_13.getText()) * 78.00;
				itemcost[7] = Double.parseDouble(textField_14.getText()) * 150.00;
				itemcost[8] = Double.parseDouble(textField_15.getText()) * 169.00;
				itemcost[9] = Double.parseDouble(textField_17.getText()) * 60.00;
				itemcost[10]= Double.parseDouble(textField_18.getText()) * 25.00;
				itemcost[11]= Double.parseDouble(textField_20.getText()) * 45.00;
                itemcost[12] = itemcost [0] + itemcost [1] + itemcost [2]+ itemcost [3] + itemcost [4] + itemcost [5];
				itemcost[13] = itemcost [6] + itemcost [7] + itemcost [8] + itemcost[9] + itemcost[10] + itemcost[11];
				itemcost [14] = itemcost [12] + itemcost [13];			
				iTax = String.format(" %.2f", itemcost [14]/ 100);
				iSubTotal = String.format(" %.2f", itemcost[14]);
				iTotal = String.format(" %.2f", itemcost[14] + (itemcost [14]/ 100));
                textField_21.setText (iTax);
				textField_22.setText (iSubTotal);
				textField_23.setText(iTotal); 

				int refs= 1325 + (int) (Math.random()*4238);

				Calendar timer = Calendar.getInstance();
				timer.getTime();
				SimpleDateFormat tTime = new SimpleDateFormat("HH:mm"); tTime.format(timer.getTime());
				SimpleDateFormat Tdate = new SimpleDateFormat ("dd-MMM-yyyy");
				Tdate.format(timer.getTime());

               textArea.setText("\tGroup 3D Restaurant\n" +
				   "Reference: \t\t\t" + refs +
				   "\n===============================================\t" +
				
                   "\n===========================================\t" +

                   "\nCustomer Ref: \t\t\t" + textField.getText() +
                   "\nFirstName: \t\t\t" + textField_1.getText() +
                   "\nLastName: \t\t\t" + textField_2.getText() +
                   "\nVEG Loaded: \t\t\t" + textField_6.getText() +
                   "\nNVEG Loaded: \t\t\t" + textField_7.getText() +
                   "\nPANEER :\t\t\t" + textField_8.getText() +

                   "\nONION: \t\t\t" + textField_9.getText() +
                   "\nSWEET CORN: \t\t\t" + textField_11.getText() +
                   "\nV PATTY: \t\t\t" + textField_16.getText() +
                   "\nNV PATTY :\t\t\t" + textField_13.getText() +
                   "\nMAHA MEAL: \t\t\t" + textField_14.getText() +
                   "\nMEAL BOX :\t\t\t" + textField_15.getText() +
                   "\nCOKE/DEW :\t\t\t" + textField_17.getText() +
                   "\nWATER/SODA :\t\t\t" + textField_18.getText() +
                   "\nICE CREAME :\t\t\t" + textField_20.getText() +

                   "\n===============================================\t" +
                   "\nTax:\t\t\t" + iTax +

                   "\nSub Total:\t\t\t" + iSubTotal +
                   "\nTotal:\t\t\t" + iTotal +

                   "\n===========================================\t" +

                   "\nDate:" + Tdate.format(timer.getTime()) +
                   "\t\tTime:" + tTime.format(timer.getTime()) +
                   "\n\n\tThank you for Shopping at Food Mania\n");

			}
		});
		btnPrint.setBackground(new Color(128, 128, 128));
		btnPrint.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPrint.setBounds(125, 36, 167, 50);
		panel_3_2_1.add(btnPrint);
		
		JButton btnExit = new JButton("EXIT");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame =new JFrame();
				if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", 
				"Customer Billing", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnExit.setBackground(Color.GRAY);
		btnExit.setBounds(125, 100, 167, 50);
		panel_3_2_1.add(btnExit);
	}
	private void Super(String nam) {
	}
}
