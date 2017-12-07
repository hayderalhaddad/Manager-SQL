import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SpringLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class additionalInfo extends JDialog {

	private final JPanel contentPanel = new JPanel();
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
	private JTextField textField_10;
	
	public ArrayList<String> hours= new ArrayList<String>();
	public String[] proj;

	public String[] depn;
	public String[] emp;


//	public void setProj(String[] val){
//		proj= val;
//	}
//	public String[] dep(){
//		return proj;
//	}
//	public void setProj(String[] val){
//		proj= val;
//	}
	
	
	

	public additionalInfo(String ssn,dbQueries db) {
		setBounds(100, 100, 450, 480);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);

		JCheckBox chckbxProductx = new JCheckBox("ProductX");
		chckbxProductx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxProductx.isSelected()) {
					textField.setEditable(true);
					textField.setBackground(Color.WHITE);

				} else {
					textField.setEditable(true);
					textField.setBackground(Color.LIGHT_GRAY);

				}
			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxProductx, 20, SpringLayout.NORTH, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.WEST, chckbxProductx, 10, SpringLayout.WEST, contentPanel);
		contentPanel.add(chckbxProductx);

		JCheckBox chckbxProducty = new JCheckBox("ProductY");
		chckbxProducty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxProducty.isSelected()) {
					textField_1.setEditable(true);
					textField_1.setBackground(Color.WHITE);

				} else {
					textField_1.setEditable(false);
					textField_1.setBackground(Color.LIGHT_GRAY);

				}

			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxProducty, 6, SpringLayout.SOUTH, chckbxProductx);
		sl_contentPanel.putConstraint(SpringLayout.WEST, chckbxProducty, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(chckbxProducty);

		JCheckBox chckbxProductz = new JCheckBox("ProductZ");
		chckbxProductz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxProductz.isSelected()) {
					textField_2.setEditable(true);
					textField_2.setBackground(Color.WHITE);

				} else {
					textField_2.setEditable(false);
					textField_2.setBackground(Color.LIGHT_GRAY);

				}
			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxProductz, 5, SpringLayout.SOUTH, chckbxProducty);
		sl_contentPanel.putConstraint(SpringLayout.EAST, chckbxProductz, 0, SpringLayout.EAST, chckbxProductx);
		contentPanel.add(chckbxProductz);

		JLabel lblSelectProjects = new JLabel("Select Projects:");
		contentPanel.add(lblSelectProjects);

		JCheckBox chckbxNewCheckBox = new JCheckBox("Computerization");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox.isSelected()) {
					textField_3.setEditable(true);
					textField_3.setBackground(Color.WHITE);

				} else {
					textField_3.setEditable(false);
					textField_3.setBackground(Color.LIGHT_GRAY);

				}
			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox, 6, SpringLayout.SOUTH, chckbxProductz);
		sl_contentPanel.putConstraint(SpringLayout.WEST, chckbxNewCheckBox, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(chckbxNewCheckBox);

		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("ReOrganization");
		chckbxNewCheckBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_1.isSelected()) {
					textField_4.setEditable(true);
					textField_4.setBackground(Color.WHITE);

				} else {
					textField_4.setEditable(false);
					textField_4.setBackground(Color.LIGHT_GRAY);

				}
			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_1, 6, SpringLayout.SOUTH,
				chckbxNewCheckBox);
		sl_contentPanel.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_1, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(chckbxNewCheckBox_1);

		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("NewBenefits");
		chckbxNewCheckBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (chckbxNewCheckBox_2.isSelected()) {
					textField_5.setEditable(true);
					textField_5.setBackground(Color.WHITE);

				} else {
					textField_5.setEditable(false);
					textField_5.setBackground(Color.LIGHT_GRAY);

				}
			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_2, 37, SpringLayout.SOUTH,
				chckbxNewCheckBox);
		sl_contentPanel.putConstraint(SpringLayout.WEST, chckbxNewCheckBox_2, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(chckbxNewCheckBox_2);

		textField = new JTextField();
		textField.setBackground(Color.LIGHT_GRAY);
		textField.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField, 0, SpringLayout.NORTH, chckbxProductx);
		sl_contentPanel.putConstraint(SpringLayout.EAST, textField, -92, SpringLayout.EAST, contentPanel);
		contentPanel.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, chckbxProducty);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_1, 0, SpringLayout.WEST, textField);
		contentPanel.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, chckbxProductz);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_2, 0, SpringLayout.WEST, textField);
		contentPanel.add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_3, 0, SpringLayout.NORTH, chckbxNewCheckBox);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_3, 0, SpringLayout.WEST, textField);
		contentPanel.add(textField_3);
		textField_3.setColumns(10);

		textField_4 = new JTextField();
		textField_4.setBackground(Color.LIGHT_GRAY);
		textField_4.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_4, 0, SpringLayout.NORTH, chckbxNewCheckBox_1);
		sl_contentPanel.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, textField);
		contentPanel.add(textField_4);
		textField_4.setColumns(10);

		textField_5 = new JTextField();
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_5, 0, SpringLayout.WEST, textField);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, textField_5, 0, SpringLayout.SOUTH, chckbxNewCheckBox_2);
		contentPanel.add(textField_5);
		textField_5.setColumns(10);

		JLabel lblHours = new JLabel("  Hours:");
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblHours, 142, SpringLayout.EAST, lblSelectProjects);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, lblHours, 0, SpringLayout.SOUTH, lblSelectProjects);
		contentPanel.add(lblHours);

		JLabel lblDependants = new JLabel("Dependants?");
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblDependants, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(lblDependants);

		JCheckBox chckbxYes = new JCheckBox("Yes");
	
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxYes, 248, SpringLayout.NORTH, contentPanel);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, lblDependants, -6, SpringLayout.NORTH, chckbxYes);
		sl_contentPanel.putConstraint(SpringLayout.WEST, chckbxYes, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(chckbxYes);

		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("No");
		chckbxNewCheckBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxYes.setEnabled(!chckbxNewCheckBox_3.isSelected());

			}
		});
		chckbxNewCheckBox_3.setSelected(true);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, chckbxNewCheckBox_3, 0, SpringLayout.NORTH, chckbxYes);
		sl_contentPanel.putConstraint(SpringLayout.EAST, chckbxNewCheckBox_3, 0, SpringLayout.EAST,
				chckbxNewCheckBox_2);
		contentPanel.add(chckbxNewCheckBox_3);
		
		JButton btnNewButton = new JButton("Add projects");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JCheckBox[] boxes = new JCheckBox[] { chckbxProductx, chckbxProducty, chckbxProductz, chckbxNewCheckBox,
						chckbxNewCheckBox_1, chckbxNewCheckBox_2 };

				JTextField[] textFields = new JTextField[] { textField, textField_1, textField_2, textField_3,
						textField_4, textField_5 };
				ArrayList<Integer> hrs = new ArrayList<Integer>();
				 hours= new ArrayList<String>();

				int sum = 0;
				for (int i = 0; i < textFields.length; i++) {
					if (textFields[i].isEditable()) {
						hours.add(textFields[i].getText());
						int temp = Integer.parseInt(textFields[i].getText());
						hrs.add(temp);
						sum += temp;
					}

				}
				if (sum > 40) {
					JOptionPane.showMessageDialog(contentPanel,
							"Employer is working more than 40 hours, adjust values");

				} else {
					
					ArrayList<String> projects = new ArrayList<String>();
					proj = new String[boxes.length];

					for (int i = 0; i < boxes.length; i++) {
						if (boxes[i].isSelected()) {
							String temp = boxes[i].getText();
							proj[i] = temp;
							switch (temp) {
							case "ProductX":
			
								projects.add("1");
								break;
							case "ProductY":
								projects.add("2");
								break;
							case "ProductZ":
								projects.add("3");
								break;
							case "Computerization":
								projects.add("10");
								break;
							case "ReOrganization":
								projects.add("20");
								break;
							case "NewBenefits":
								projects.add("30");
								break;
							}
						}
					}
					try {
						String[] ret = db.addProject(hrs,projects,ssn);
						
					} catch (Exception exp) {
						JOptionPane.showMessageDialog(null, "Error: " + exp, "Error", JOptionPane.ERROR_MESSAGE);
					}
				}

			}
		});
		sl_contentPanel.putConstraint(SpringLayout.NORTH, btnNewButton, 6, SpringLayout.SOUTH, chckbxNewCheckBox_2);
		sl_contentPanel.putConstraint(SpringLayout.EAST, btnNewButton, 0, SpringLayout.EAST, chckbxNewCheckBox_2);
		contentPanel.add(btnNewButton);
		
		JLabel lblEssn = new JLabel("essn");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, lblEssn, 16, SpringLayout.SOUTH, chckbxYes);
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblEssn, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(lblEssn);
		
		textField_6 = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_6, -5, SpringLayout.NORTH, lblEssn);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_6, 6, SpringLayout.EAST, lblEssn);
		textField_6.setBackground(Color.LIGHT_GRAY);
		textField_6.setEditable(false);
		contentPanel.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDepname = new JLabel("dependent_name");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, lblDepname, 0, SpringLayout.NORTH, lblEssn);
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblDepname, 19, SpringLayout.EAST, textField_6);
		contentPanel.add(lblDepname);
		
		textField_7 = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_7, -5, SpringLayout.NORTH, lblEssn);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_7, 6, SpringLayout.EAST, lblDepname);
		textField_7.setEditable(false);
		textField_7.setBackground(Color.LIGHT_GRAY);
		contentPanel.add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblSex = new JLabel("Sex");
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblSex, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(lblSex);
		
		textField_8 = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_8, 6, SpringLayout.SOUTH, textField_6);
		textField_8.setEditable(false);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, lblSex, 5, SpringLayout.NORTH, textField_8);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_8, 0, SpringLayout.WEST, textField_6);
		textField_8.setBackground(Color.LIGHT_GRAY);
		contentPanel.add(textField_8);
		textField_8.setColumns(3);
		
		JLabel lblBdate = new JLabel("Bdate");
		sl_contentPanel.putConstraint(SpringLayout.NORTH, lblBdate, 0, SpringLayout.NORTH, lblSex);
		sl_contentPanel.putConstraint(SpringLayout.EAST, lblBdate, -205, SpringLayout.EAST, contentPanel);
		contentPanel.add(lblBdate);
		
		textField_9 = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_9, -5, SpringLayout.NORTH, lblSex);
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_9, 6, SpringLayout.EAST, lblBdate);
		textField_9.setEditable(false);
		textField_9.setBackground(Color.LIGHT_GRAY);
		contentPanel.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblRelationship = new JLabel("Relationship");
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblRelationship, 0, SpringLayout.WEST, chckbxProductx);
		contentPanel.add(lblRelationship);
		
		textField_10 = new JTextField();
		sl_contentPanel.putConstraint(SpringLayout.WEST, textField_10, 6, SpringLayout.EAST, lblRelationship);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, lblRelationship, 5, SpringLayout.NORTH, textField_10);
		textField_10.setEditable(false);
		textField_10.setBackground(Color.LIGHT_GRAY);
		sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_10, 6, SpringLayout.SOUTH, textField_8);
		contentPanel.add(textField_10);
		textField_10.setColumns(10);
		
		JButton btnAddDependant = new JButton("Add Dependant");
		btnAddDependant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField[] textFields = new JTextField[] { textField_6, textField_7, textField_8, textField_9,textField_10 };
				String[] values = new String[5];
				for (int i = 0; i < 5; i++) {
					values[i] = textFields[i].getText();
				}
				try {
					String[] ret = db.addDependent(values);
					depn= values;
				} catch (Exception exp) {
					JOptionPane.showMessageDialog(null, "Error: " + exp, "Error", JOptionPane.ERROR_MESSAGE);
					  try{
						   db.connect();
						   }
					  catch (Exception exp1) {
							JOptionPane.showMessageDialog(null, "Error: " + exp1, "Error", JOptionPane.ERROR_MESSAGE);
					  }
				}
			}
		});
		btnAddDependant.setEnabled(false);
		sl_contentPanel.putConstraint(SpringLayout.WEST, btnAddDependant, 0, SpringLayout.WEST, lblSelectProjects);
		sl_contentPanel.putConstraint(SpringLayout.SOUTH, btnAddDependant, 0, SpringLayout.SOUTH, contentPanel);
		contentPanel.add(btnAddDependant);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						StringBuilder text = new StringBuilder();
						StringBuilder text1 = new StringBuilder();
						StringBuilder text3 = new StringBuilder();
						emp[0] = "Name: "+ emp[0] ;
						emp[1] = " "+ emp[1]+  " " ;

						emp[3] = "\nSsn: "+ emp[3] +"\n" ;
						emp[4] = "Bdate: "+ emp[4] + "\n" ;
						emp[5] = "Address: "+ emp[5]+ "\n" ;
						emp[6] = "Sex: "+ emp[6]+ "\n" ;
						emp[7] = "Salary: "+ emp[7]+ "\n" ;
						emp[8] = "Manager Ssn: "+ emp[8]+ "\n" ;
						emp[9] = "Department: "+ emp[9]+ "\n" ;


						for (int i=0; i<emp.length;i++){
						    
						    text.append(emp[i]);
						}
						for (int i=0; i<hours.size();i++){
						    
						    text1.append(proj[i]+"	|	"+ hours.get(i) + "\n");
						    
						}
						if(depn!= null) {
							depn[0] = "Essn: "+ depn[0] + "\n" ;
							depn[1] = "Name: "+ depn[1] + "\n" ;
							depn[2] = "Sex: "+ depn[2] + "\n" ;
							depn[3] = "Bdate: "+ depn[3] + "\n" ;
							depn[4] = "Relationship: "+ depn[4] + "\n" ;




							for (int i=0; i<depn.length;i++){
						    
						    text3.append(depn[i]);
						}
						}
						JOptionPane.showMessageDialog(null,"Employee Info:\n" + text+ "\n"  + "Projects	|	hours\n" + text1+"\n Dependants:\n"+ text3 );
						
					}
				});
				
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			
			
		}
		chckbxYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				chckbxNewCheckBox_3.setEnabled(!chckbxYes.isSelected());
				textField_6.setBackground(Color.WHITE);
				textField_6.setEditable(true);
				textField_7.setBackground(Color.WHITE);
				textField_7.setEditable(true);
				textField_8.setBackground(Color.WHITE);
				textField_8.setEditable(true);
				textField_9.setBackground(Color.WHITE);
				textField_9.setEditable(true);
				textField_10.setBackground(Color.WHITE);
				textField_10.setEditable(true);
				btnAddDependant.setEnabled(true);

				
			}
		});
	}
}
