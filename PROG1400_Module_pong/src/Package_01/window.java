package Package_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

public class window extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldLeft;
	private JTextField textFieldRight;
	private JTextField textFieldHit;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					window frame = new window();
					frame.setMinimumSize(new Dimension(440, 300));
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
	public window() {
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();

		panel.setBounds(0, 0, 440, 10);
		getContentPane().add(panel);
		
		JPanel panel_left = new JPanel();
		panel_left.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent event)
			{
				int keyPress = event.getKeyCode();
				
				switch(keyPress)
				{
					case KeyEvent.VK_UP:
						panel_left.setLocation(panel_left.getLocation().x, panel_left.getLocation().y + 1);
						break;
						
					case KeyEvent.VK_DOWN:
						panel_left.setLocation(panel_left.getLocation().x, panel_left.getLocation().y - 1);
						break;
				}
			}
		});
		panel_left.setBackground(Color.DARK_GRAY);
		panel_left.setBounds(40, 85, 10, 95);
		getContentPane().add(panel_left);
		
		JPanel panel_right = new JPanel();
		panel_right.setBackground(Color.DARK_GRAY);
		panel_right.setBounds(390, 85, 10, 95);
		getContentPane().add(panel_right);
		
		JPanel panel_ball = new JPanel();
		panel_ball.setBackground(Color.RED);
		panel_ball.setBounds(206, 114, 24, 24);
		getContentPane().add(panel_ball);
		
		textFieldLeft = new JTextField();
		textFieldLeft.setEditable(false);
		textFieldLeft.setBounds(12, 239, 114, 19);
		getContentPane().add(textFieldLeft);
		textFieldLeft.setColumns(10);
		
		textFieldRight = new JTextField();
		textFieldRight.setEditable(false);
		textFieldRight.setBounds(314, 239, 114, 19);
		getContentPane().add(textFieldRight);
		textFieldRight.setColumns(10);
		
		textFieldHit = new JTextField();
		textFieldHit.setBounds(165, 12, 114, 19);
		textFieldHit.setEditable(false);
		getContentPane().add(textFieldHit);
		textFieldHit.setColumns(10);

	}
}
