package sring_in_random;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

public class Print_string {

	private JFrame frame;
	private JTextField number_1;
	private JTextField number_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Print_string window = new Print_string();
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
	public Print_string() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Graphics g = panel.getGraphics();
				Random r = new Random();
				for (int i=0; i<Integer.parseInt(number_2.getText()); i++) {
					int x = r.nextInt(panel.getWidth());
					int y =r.nextInt(panel.getHeight());
					g.drawString(number_1.getText(), x, y);
				}
				
			}
		});
		panel.setBackground(Color.PINK);
		panel.setBounds(81, 83, 241, 167);
		frame.getContentPane().add(panel);
		
		number_1 = new JTextField();
		number_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		number_1.setBounds(35, 32, 86, 20);
		frame.getContentPane().add(number_1);
		number_1.setColumns(10);
		
		number_2 = new JTextField();
		number_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		number_2.setBounds(220, 34, 86, 20);
		frame.getContentPane().add(number_2);
		number_2.setColumns(10);
		
		JLabel string_label = new JLabel("Type String");
		string_label.setBounds(35, 7, 67, 14);
		frame.getContentPane().add(string_label);
		
		JLabel iteration_label = new JLabel("Iteration ");
		iteration_label.setBounds(220, 11, 67, 14);
		frame.getContentPane().add(iteration_label);
	}
}
