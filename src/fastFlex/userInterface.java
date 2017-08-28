package fastFlex;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Hashtable;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
//hashTable Keys
//"bankName","accountNumber", "beginningBalance","closingBalance","totalDeposits"
//

public class userInterface {
	
	
	
	public void window(Hashtable<String,String> outputTable){
		JFrame f=new JFrame();//creating instance of JFrame  		           
		 JLabel l1,l2,l3,l4,l5;  
		 JTextField t1,t2,t3,t4,t5,t6;
		    l1=new JLabel("Bank Name");  
		    l1.setBounds(50,50, 100,30); //x axis, y axis, width, height 
			    t1=new JTextField(outputTable.get("bankName"));  
			    t1.setBounds(175,50, 150,25);
		    l2=new JLabel("Account number");  
		    l2.setBounds(50,80, 100,30);  
			    t2=new JTextField(outputTable.get("accountNumber"));  
			    t2.setBounds(175,80, 150,25);
		    l3=new JLabel("openingBalance");  
		    l3.setBounds(50,110, 100,30); 
			    t3=new JTextField(outputTable.get("beginningBalance"));  
			    t3.setBounds(175,110, 150,25);
		    l4=new JLabel("Total Deposits");  
		    l4.setBounds(50,140, 100,30); 
			    t4=new JTextField(outputTable.get("totalDeposits"));  
			    t4.setBounds(175,140, 150,25);
		    l5=new JLabel("closingBalance");  
		    l5.setBounds(50,170, 100,30); 
			    t5=new JTextField(outputTable.get("closingBalance"));  
			    t5.setBounds(175,170, 150,25);
			    t6=new JTextField("Select File");  
			    t6.setBounds(175,300,250, 20);//file path text field
		    f.add(l1); f.add(l2);f.add(l3);f.add(l4);f.add(l5);  
		    f.add(t1); f.add(t2);f.add(t3); f.add(t4);f.add(t5); f.add(t6);
		  //select file button
		    JButton fileChooserButton=new JButton("Select File");  
		    fileChooserButton.setBounds(50,300,100, 20);
		    f.add(fileChooserButton);

		    fileChooserButton.addActionListener(new ActionListener(){  
		        public void actionPerformed(ActionEvent e){  
		        	JFileChooser fileChooser = new JFileChooser();
		    		fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
		    		int result = fileChooser.showOpenDialog(f);
		    		if (result == JFileChooser.APPROVE_OPTION) {
		    		    File selectedFile = fileChooser.getSelectedFile();
		    		    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
		    		    t6.setText(selectedFile.getAbsolutePath());
		    			ReadingData newData = new ReadingData();
		    			try {
							Hashtable<String,String> outputTable = newData.getLines(selectedFile.getAbsolutePath());
						} catch (IOException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
		    		    
		    		}
		        }  
		    });  
		    //Execute Button
//		    JButton executeButton=new JButton("Execute");  
//		    executeButton.setBounds(200,330,100, 30);
//		    f.add(executeButton);
//		    executeButton.addActionListener(new ActionListener(){  
//		        public void actionPerformed(ActionEvent e){  
//		        	//ReadingData newData = new ReadingData();
//		    		//Hashtable<String,String> outputTable = newData.getLines();
//		        	String x = t6.getText();
//		        	System.out.println(x);
//		        	x.replaceAll("\\", "\\"+ "\\");
//		        	System.out.println(x);
//		        }  
//		    }); 
		          
		f.setSize(600,500);//400 width and 500 height  
		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		

	}

}
