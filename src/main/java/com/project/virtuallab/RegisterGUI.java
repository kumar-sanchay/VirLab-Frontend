package com.project.virtuallab;


import java.awt.*;
import javax.swing.*;

public class RegisterGUI {

	private JFrame frame;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegisterGUI window = new RegisterGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public RegisterGUI() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		RegistrationGUI lg=new RegistrationGUI();	
		lg.setBackground(new Color(150, 150, 150));
		frame.setMinimumSize(new Dimension(500, 400));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		frame.setTitle("register");
		frame.add(lg);
		frame.setVisible(true);
	}

}

class RoundField extends JTextField {
    public RoundField(int cols) {
        super(cols);
        setOpaque(false);
        setBorder(BorderFactory.createEmptyBorder(3, 5, 3, 5));
    }
    protected void paintComponent(Graphics g) {
        int width = getWidth();
        int height = getHeight();
        // Paint a rounded rectangle in the background.
        g.setColor(getBackground());
        g.fillRoundRect(0, 0, width, height, 20, 20);
        // calling the superclass behavior to paint the foreground.
        super.paintComponent(g);
    }
}
class RegistrationGUI extends JPanel{
	
	JLabel user_label,pass_label,first_name,last_name;
	RoundField user_txt,pass_txt,fname_txt,lname_txt;;
	JButton register,cancel;
	
	void gap(int x,int y,JPanel parent) {
		GridBagConstraints gbc = new GridBagConstraints();
		gbc.gridx=x;
		gbc.gridy=y;
		gbc.fill=GridBagConstraints.BOTH;
		gbc.gridwidth=2;
		JLabel jl=new JLabel(" ");
		parent.add(jl,gbc);	
	}
	
	RoundField TextField(RoundField name) {
		Color myColor = new Color (202, 240, 185);
		name=new RoundField(15);
		name.setBackground(myColor);
		name.setFont(this.getFont().deriveFont(Font.PLAIN, 23f));
		return name;
	}
	
	JButton customButton(String lbl) {
		JButton btn=new JButton(lbl);
		btn.setFont(this.getFont().deriveFont(Font.PLAIN, 23f));
		btn.setOpaque(true);
		btn.setContentAreaFilled(true);
	return btn;	
	}
	
	RegistrationGUI(){  
		GridBagLayout grid = new GridBagLayout();  
        GridBagConstraints gbc = new GridBagConstraints(); 
        
        Color mback = new Color(150,150,150);
        setBackground(Color.white);
        
		user_label=new JLabel("Email         : ");
		pass_label=new JLabel("Password   : ");
		first_name=new JLabel("First name : ");
		last_name=new JLabel("Last name : ");
		
		user_label.setFont(this.getFont().deriveFont(Font.PLAIN, 23f));
		pass_label.setFont(this.getFont().deriveFont(Font.PLAIN, 23f));
		first_name.setFont(this.getFont().deriveFont(Font.PLAIN, 23f));
		last_name.setFont(this.getFont().deriveFont(Font.PLAIN, 23f));
		
		user_txt=TextField(user_txt);		
		pass_txt=TextField(pass_txt);
		fname_txt=TextField(fname_txt);
		lname_txt=TextField(lname_txt);
		
		register=customButton("Register");
		cancel=customButton("Login");
		
		cancel.setBackground(Color.white);
		cancel.setBorder(BorderFactory.createLineBorder(Color.black));
		
		register.setBackground(mback);
		register.setForeground(Color.white);
		register.setBorder(BorderFactory.createLineBorder(Color.white));
		
		setLayout(grid);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridx = 0;  
	    gbc.gridy = 0;
		add(first_name,gbc);//Firstname Label
		
		gbc.fill = GridBagConstraints.HORIZONTAL; 
		gbc.gridx = 1;  
    	gbc.gridy = 0;
		add(fname_txt,gbc);//Firstname field
//		
		gap(0,1,this);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridx = 0;  
	    gbc.gridy = 2;
		add(last_name,gbc);//Lastname Label
		
		gbc.fill = GridBagConstraints.HORIZONTAL; 
		gbc.gridx = 1;  
    	gbc.gridy = 2;
		add(lname_txt,gbc);//Lastname Field
		
		gap(0,3,this);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridx = 0;  
	    gbc.gridy = 4;
		add(user_label,gbc);//Firstname label
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridx = 1;  
	    gbc.gridy = 4;
		add(user_txt,gbc);//Firstname field
		
		gap(0,5,this);
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridx = 0;  
	    gbc.gridy = 6;
		add(pass_label,gbc);//Lastname label
		
		gbc.fill = GridBagConstraints.HORIZONTAL;  
	    gbc.gridx = 1;  
	    gbc.gridy = 6;
		add(pass_txt,gbc);//Lastname Field
		
		gap(0,7,this);
		
		gbc.insets = new Insets(15, 20, 0, 20);
		gbc.gridx = 0;  
	    gbc.gridy = 8;  
	    gbc.gridwidth = 1; 
	    gbc.gridheight = 2;
		add(cancel,gbc);
		
		gbc.insets = new Insets(15, 160, 0, 30);
		gbc.gridx = 1;  
    	gbc.gridy = 8; 
    	gbc.gridwidth = 1;
    	gbc.gridheight = 2;
		add(register,gbc);
		
	}
}
