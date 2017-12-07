import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class login {

	private JFrame frame;
	private JTextField textField;
	private dbQueries db;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		db = new dbQueries();
		try {
			db.connect();
			System.out.println("connected");
		} catch (Exception exp) {
			JOptionPane.showMessageDialog(null, "Error: " + exp, "Error", JOptionPane.ERROR_MESSAGE);
		}
		JLabel lblManagerLogin = new JLabel("Manager Login");
		lblManagerLogin.setFont(new Font("Lucida Grande", Font.PLAIN, 22));
		lblManagerLogin.setBounds(124, 6, 162, 26);
		frame.getContentPane().add(lblManagerLogin);

		JLabel lblEnterSsn = new JLabel("Enter Your Ssn");
		lblEnterSsn.setBounds(6, 51, 101, 47);
		frame.getContentPane().add(lblEnterSsn);

		textField = new JTextField();
		textField.setBounds(6, 91, 162, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				boolean findMgr = false;
				try {
					findMgr = db.mgrLogin(textField.getText());
				} catch (Exception exp) {
					JOptionPane.showMessageDialog(null, "Error: " + exp, "Error", JOptionPane.ERROR_MESSAGE);
				}
				if (findMgr == true) {
					addEmployee(db);
				} else {
					JOptionPane.showMessageDialog(frame, "Manager Not Found");

				}

			}
		});
		btnValidate.setBounds(0, 130, 162, 29);
		frame.getContentPane().add(btnValidate);
	}

	public void addEmployee(dbQueries db) {
		try {
			newEmployee dialog = new newEmployee(db);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// public void additionalInformation

}
