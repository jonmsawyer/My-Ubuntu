package Package_01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Event;
import java.awt.event.KeyListener;
import java.util.Random;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JTextField;

@SuppressWarnings("unused")
public class window extends JFrame implements KeyListener {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField textFieldLeft;
	private JTextField textFieldRight;
	private JTextField textFieldHit;
	private JTextField textFieldPaddle;
	private JPanel panel_left;
	private JPanel panel_right;
	private JPanel panel_ball;
	
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
					frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
				int x = ballStart();
				ballGo(x);
				
			}
		});
	}
	
    public void keyReleased(KeyEvent event) {}    
    public void keyTyped(KeyEvent event) {}
    public void keyPressed(KeyEvent event)
    {
        int keyPress = event.getKeyCode();
        int dy = 10;
        System.out.println("Key was pressed! " + String.valueOf(keyPress));
        
        switch(keyPress)
        {
            case KeyEvent.VK_UP:
                // minus delta y because Y coordinates are top to bottom
            		//System.out.println(panel_left.getLocation().y);
            	if(panel_left.getLocation().y > 45)
            	{
                    panel_left.setLocation(panel_left.getLocation().x, panel_left.getLocation().y - dy);
                    break;
            	}
            	break;
            case KeyEvent.VK_DOWN:
                // plus delta y because Y coordinates are top to bottom
            	
            	if(panel_left.getLocation().y < 135)
            	{
            		panel_left.setLocation(panel_left.getLocation().x, panel_left.getLocation().y + dy);
                	break;
            	}
            	break;
        }
        
        textFieldPaddle.setText("");
    }
    
    public static int ballStart()
    {
    	Random rand = new Random();
    	int r = rand.nextInt(4) + 1;
    	
    	int ballDir = r;
    	return ballDir;
    }
    
    public void ballGo(int ballDir)
    {
    	int ballAmount;
    	boolean ballExist = true;
    	
    	while(ballExist)
    	{
    		if(ballDir == 1)
        	{
        		panel_ball.setLocation(panel_ball.getLocation().x + 1, panel_ball.getLocation().y + 1);
        	}
        	if(ballDir == 2)
        	{
        		panel_ball.setLocation(panel_ball.getLocation().x + 1, panel_ball.getLocation().y - 1);
        	}
        	if(ballDir == 3)
        	{
        		panel_ball.setLocation(panel_ball.getLocation().x - 1, panel_ball.getLocation().y - 1);
        	}
        	if(ballDir == 4)
        	{
        		panel_ball.setLocation(panel_ball.getLocation().x - 1, panel_ball.getLocation().y + 1);
        	}
    	}
    }
    
	/**
	 * Create the frame.
	 */
	public window() {
		getContentPane().setLayout(null);
		
		panel_left = new JPanel();
		panel_left.setBackground(Color.DARK_GRAY);
		panel_left.setBounds(40, 85, 10, 95);
		getContentPane().add(panel_left);
		
		panel_right = new JPanel();
		panel_right.setBackground(Color.DARK_GRAY);
		panel_right.setBounds(390, 85, 10, 95);
		getContentPane().add(panel_right);
		
		panel_ball = new JPanel();
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
		
		textFieldPaddle = new JTextField();
		textFieldPaddle.setBounds(0, 0, 10, 10);
		textFieldPaddle.addKeyListener(this);
		getContentPane().add(textFieldPaddle);
		textFieldPaddle.setColumns(1);
	}
}