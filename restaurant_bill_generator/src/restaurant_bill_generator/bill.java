package restaurant_bill_generator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bill {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bill window = new bill();
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
	public bill() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(0, 255, 255));
		frame.setBackground(new Color(255, 255, 0));
		frame.setBounds(100, 100, 724, 503);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Restro bill");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 32));
		lblNewLabel.setBounds(243, 31, 252, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Menu");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel_1.setBounds(84, 167, 154, 52);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Qnty");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		lblNewLabel_1_1.setBounds(73, 257, 154, 52);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JComboBox c1 = new JComboBox();
		c1.setModel(new DefaultComboBoxModel(new String[] {"select", "Tea-30", "coffee-40"}));
		c1.setBounds(286, 167, 186, 44);
		frame.getContentPane().add(c1);
		
		t1 = new JTextField();
		t1.setBounds(286, 272, 181, 37);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String item=(String) c1.getSelectedItem();
				String qnty=t1.getText();
				int q=Integer.parseInt(qnty);
				int bill=0;
			    if(item.equals("Tea-rs 30"))
			    {
			    	bill=q*30;
			    	JOptionPane.showMessageDialog(btnNewButton, "hello  \n selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
			    }
			    else if(item.equals("coffee-rs40"));
			    {
			    	bill=q*40;
			    	JOptionPane.showMessageDialog(btnNewButton, "hello  \n selected item:"+item+"\n qnty:"+q+"\n your bill:"+bill);
			    }
					
			}
		});
		btnNewButton.setBounds(267, 388, 89, 23);
		frame.getContentPane().add(btnNewButton);
	}
}
