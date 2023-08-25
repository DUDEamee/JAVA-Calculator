package calculatorproject;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;


public class Calculator implements ActionListener{
	
	boolean isOperatorClicked=false;
	JFrame jf;
	JLabel displayLabl ;
	String oldValue;
	String newValue;
	
	String operation;
	String answer;
	JButton sevenButton;
	JButton EightButton;
	JButton NineButton;
	JButton FourButton;
	JButton FiveButton;
	JButton SixButton;
	JButton OneButton;
	JButton TwoButton;
	JButton ThreeButton;
	JButton DotButton;
	JButton ZeroButton;
	JButton EqualButton;
	JButton DivitionButton;
	JButton MultiplicationButton;
	JButton MinuesButton;
	JButton PlusButton;
	JButton ClearButton;
	
	public Calculator() {
	    jf=new JFrame("calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(400 ,40);
		
		displayLabl=new JLabel("");
		displayLabl.setBounds(30, 50, 540, 40);
		displayLabl.setBackground(Color.gray);
		displayLabl.setFont(new Font("Arial", Font.PLAIN,30));
		displayLabl.setHorizontalAlignment(SwingConstants.RIGHT);
		displayLabl.setForeground(Color.black);
		jf.setVisible(true);
		jf.add(displayLabl);
		
		
		sevenButton=new JButton("7");
		sevenButton.setBounds(30,130,80,80); 
		sevenButton.addActionListener(this);
		sevenButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(sevenButton);
		
		
		EightButton=new JButton("8");
		EightButton.setBounds(140,130,80,80);
		EightButton.addActionListener(this);
		EightButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(EightButton);
		
		NineButton=new JButton("9");
		NineButton.setBounds(250,130,80,80);
		NineButton.addActionListener(this);
		NineButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(NineButton);
		
		FourButton=new JButton("4");
		FourButton.setBounds(30,240,80,80);
		FourButton.addActionListener(this);
		FourButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(FourButton);
		
		FiveButton=new JButton("5");
		FiveButton.setBounds(140,240,80,80);
		FiveButton.addActionListener(this);
		FiveButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(FiveButton);
		
		SixButton=new JButton("6");
		SixButton.setBounds(250,240,80,80);
		SixButton.addActionListener(this);
		SixButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(SixButton);
		
		OneButton=new JButton("1");
		OneButton.setBounds(30,350,80,80);
		OneButton.addActionListener(this);
		OneButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(OneButton);
		
		TwoButton=new JButton("2");
		TwoButton.setBounds(140,350,80,80);
		TwoButton.addActionListener(this);
		TwoButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(TwoButton);
		
		ThreeButton=new JButton("3");
		ThreeButton.setBounds(250,350,80,80);
		ThreeButton.addActionListener(this);
		ThreeButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(ThreeButton);
		
		DotButton=new JButton(".");
		DotButton.setBounds(30,460,80,80);
		DotButton.addActionListener(this);
		DotButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(DotButton);
		
		ZeroButton=new JButton("0");
		ZeroButton.setBounds(140,460,80,80);
		ZeroButton.addActionListener(this);
		ZeroButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(ZeroButton);
		
		EqualButton=new JButton("=");
		EqualButton.setBounds(250,460,80,80);
		EqualButton.addActionListener(this);
		EqualButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(EqualButton);
		
		DivitionButton=new JButton("%");
		DivitionButton.setBounds(360,140,70,70);
		DivitionButton.addActionListener(this);
		DivitionButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(DivitionButton);
		
		MultiplicationButton=new JButton("*");
		MultiplicationButton.setBounds(360,250,70,70);
		MultiplicationButton.addActionListener(this);
		MultiplicationButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(MultiplicationButton);
		
		MinuesButton=new JButton("-");
		MinuesButton.setBounds(360,360,70,70);
		MinuesButton.addActionListener(this);
		MinuesButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(MinuesButton);
		
		PlusButton=new JButton("+");
		PlusButton.setBounds(360,470,70,70);
		PlusButton.addActionListener(this);
		PlusButton.setFont(new Font("Arial", Font.PLAIN,40));
		jf.add(PlusButton);
		
		ClearButton=new JButton("Clear");
		ClearButton.setBounds(470,130,80,80);
		ClearButton.addActionListener(this);
		PlusButton.setFont(new Font("Arial", Font.PLAIN,50));
		jf.add(ClearButton);
		
		
		
		
		
		
		
		
		
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args) {
		new Calculator();
	 
	}
	
	
	
	
	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== sevenButton) {	
			if(isOperatorClicked) {
				displayLabl.setText("7");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"7");
			}
			
			
		}else if(e.getSource()==EightButton) {
			if(isOperatorClicked) {
				displayLabl.setText("8");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"8");
			}
			
			
		}else if(e.getSource()==NineButton) {
			if(isOperatorClicked) {
				displayLabl.setText("9");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"9");
			}
			
			
		}else if(e.getSource()==FourButton) {
			if(isOperatorClicked) {
				displayLabl.setText("4");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"4");
			}
			
			
		}else if(e.getSource()==FiveButton) {
			if(isOperatorClicked) {
				displayLabl.setText("5");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"5");
			}  
			
			
		}else if(e.getSource()==SixButton) {
			if(isOperatorClicked) {
				displayLabl.setText("6");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"6");
			}
			
			
		}else if(e.getSource()==OneButton) {
			if(isOperatorClicked) {
				displayLabl.setText("1");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"1");
			}
			
			
		}else if(e.getSource()==TwoButton) {
			if(isOperatorClicked) {
				displayLabl.setText("2");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"2");
			}
			
			
		}else if(e.getSource()==ThreeButton) {
			if(isOperatorClicked) {
				displayLabl.setText("3");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"3");
			}
			
			
		}else if(e.getSource()==DotButton) {
			if(isOperatorClicked) {
				displayLabl.setText(".");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+".");
			}
			
			
		}else if(e.getSource()==ZeroButton) {
			if(isOperatorClicked) {
				displayLabl.setText("0");
				isOperatorClicked=false;
			}else {
				displayLabl.setText(displayLabl.getText()+"0");
			}
			
			
			
			
		}else if(e.getSource()==EqualButton) {
			
			String newValue=displayLabl.getText();
			float oldValueF=Float.parseFloat(oldValue);
			float newValueF=Float.parseFloat(newValue);
			
			float result3=oldValueF*newValueF;
			displayLabl.setText(result3+"");
			
			float result2=oldValueF-newValueF;
			displayLabl.setText(result2+"");
			
			float result1=oldValueF+newValueF;
			displayLabl.setText(result1+"");
		
			
		}else if(e.getSource()==DivitionButton){
			isOperatorClicked=true;
			oldValue=displayLabl.getText();
			
			
		}else if(e.getSource()==MultiplicationButton) {
			isOperatorClicked=true;
			oldValue=displayLabl.getText();
			
			
		}else if(e.getSource()==MinuesButton) {
			isOperatorClicked=true;
			oldValue=displayLabl.getText();
			
			
		}else if(e.getSource()==PlusButton) {
			isOperatorClicked=true;
			oldValue=displayLabl.getText();
			
			
		}else if(e.getSource()==ClearButton) {
			displayLabl.setText("");
		}
		
	}

}
