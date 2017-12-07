import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.layout.FormSpecs;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.SpringLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class newEmployee extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField textField_0;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private dbQueries db;
	private JLabel lblNewLabel_6;
	private JLabel lblNewLabel_7;

	public String[] empInfo;
	/**
	 * Launch the application.
	 */

	/**
	 * Create the dialog.
	 */
	public newEmployee(dbQueries db) {
		this.db = db;
		setBounds(100, 100, 450, 430);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		SpringLayout sl_contentPanel = new SpringLayout();
		contentPanel.setLayout(sl_contentPanel);
		{
			JLabel lblNewLabel = new JLabel("First Name");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel, 42, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel, 96, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel);
		}
		{
			textField_0 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_0, 37, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_0, 168, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_0);
			textField_0.setColumns(10);
		}
		{
			JLabel lblNewLabel_1 = new JLabel("Minit");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_1, 73, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_1, 132, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_1);
		}
		{
			textField_1 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_1, 68, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_1, 168, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_1);
			textField_1.setColumns(10);
		}
		{
			JLabel lblNewLabel_2 = new JLabel("Last Name");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 104, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_2, 98, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_2);
		}
		{
			textField_2 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_2, 99, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_2, 168, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_2);
			textField_2.setColumns(10);
		}
		{
			JLabel lblNewLabel_3 = new JLabel("SSn");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 135, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_3, 142, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_3);
		}
		{
			textField_3 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_3, 130, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_3, 168, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_3);
			textField_3.setColumns(10);
		}
		{
			JLabel lblNewLabel_4 = new JLabel("Bdate ex:'01-NOV-2017'");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 166, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_4, 9, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_4);
		}
		{
			textField_4 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_4, 161, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_4, 168, SpringLayout.WEST, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.EAST, textField_4, 445, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_4);
			textField_4.setColumns(10);
		}
		{
			JLabel lblNewLabel_5 = new JLabel("Address");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 197, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_5, 113, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_5);
		}
		{
			textField_5 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_5, 192, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_5, 168, SpringLayout.WEST, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.EAST, textField_5, 445, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_5);
			textField_5.setColumns(10);
		}
		{
			lblNewLabel_6 = new JLabel("Sex");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 228, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_6, 142, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_6);
		}
		{
			textField_6 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_6, 223, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_6, 168, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_6);
			textField_6.setColumns(10);
		}
		{
			lblNewLabel_7 = new JLabel("Salary");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 259, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_7, 127, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_7);
		}
		{
			textField_9 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.EAST, textField_9, 0, SpringLayout.EAST, textField_0);
			contentPanel.add(textField_9);
			textField_9.setColumns(10);
		}
		{
			JLabel lblNewLabel_8 = new JLabel("Manager Ssn");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_8, 290, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_8, 85, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_8);
		}
		{
			textField_8 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_8, 285, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_8, 168, SpringLayout.WEST, contentPanel);
			contentPanel.add(textField_8);
			textField_8.setColumns(10);
		}
		{
			JLabel lblNewLabel_9 = new JLabel("Department No.");
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_9, -5, SpringLayout.NORTH, lblNewLabel_9);
			sl_contentPanel.putConstraint(SpringLayout.NORTH, lblNewLabel_9, 321, SpringLayout.NORTH, contentPanel);
			sl_contentPanel.putConstraint(SpringLayout.WEST, lblNewLabel_9, 64, SpringLayout.WEST, contentPanel);
			contentPanel.add(lblNewLabel_9);
		}
		{
			textField_7 = new JTextField();
			sl_contentPanel.putConstraint(SpringLayout.NORTH, textField_7, -5, SpringLayout.NORTH, lblNewLabel_7);
			sl_contentPanel.putConstraint(SpringLayout.WEST, textField_7, 0, SpringLayout.WEST, textField_0);
			contentPanel.add(textField_7);
			textField_7.setColumns(10);
		}

		JLabel lblLoggedInAs = new JLabel("Add New Employee");
		sl_contentPanel.putConstraint(SpringLayout.WEST, lblLoggedInAs, -52, SpringLayout.WEST, textField_0);
		sl_contentPanel.putConstraint(SpringLayout.EAST, lblLoggedInAs, 137, SpringLayout.WEST, textField_0);
		lblLoggedInAs.setFont(new Font("Lucida Grande", Font.PLAIN, 18));
		sl_contentPanel.putConstraint(SpringLayout.NORTH, lblLoggedInAs, 10, SpringLayout.NORTH, contentPanel);
		contentPanel.add(lblLoggedInAs);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton btnAdditionalInfo = new JButton("Additional Info");
				btnAdditionalInfo.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						additionalInfo(textField_3.getText(),db);
						
					}
				});
				btnAdditionalInfo.setEnabled(false);
		
				buttonPane.add(btnAdditionalInfo);
				JButton okButton = new JButton("Add");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						JTextField[] textFields = new JTextField[] { textField_0, textField_1, textField_2, textField_3,
								textField_4, textField_5, textField_6, textField_7, textField_8, textField_9 };
						String[] values = new String[10];
						for (int i = 0; i < 10; i++) {
							values[i] = textFields[i].getText();
						}
						try {
							String[] ret = db.addEmployee(values);
							   okButton.setEnabled(false);
								btnAdditionalInfo.setEnabled(true);
								empInfo  = values;
								
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
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
			
	
			}
		}
	}
	public void additionalInfo(String ssn, dbQueries db) {
		try {
			additionalInfo dialog = new additionalInfo(ssn,db);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.emp= empInfo;
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
