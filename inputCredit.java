package schedule;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class inputCredit extends JFrame{
    int inpCre = 0;
private JButton btnok;
    
	public inputCredit(sch[] a,int cal) {
		
	    setResizable(false);
	    
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(300, 300, 250, 150);
	    Container contentPane = this.getContentPane();
	    contentPane.setLayout(null);
	    
	    
	    JLabel lb = new JLabel("Input Credits You want");
	    lb.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lb.setHorizontalAlignment(SwingConstants.CENTER);
	    lb.setBounds(10, 11, 200, 25);
	    contentPane.add(lb);
	   
	    
	    
	    JTextField lbltxt = new JTextField();
	    lbltxt.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lbltxt.setHorizontalAlignment(SwingConstants.CENTER);
	    lbltxt.setBounds(10, 31, 200, 25);
	    contentPane.add(lbltxt);
	   
	    //ok버튼을 누르면 메세지 창을 끄고 입력한 학점으로 알고리즘을 돌린 후 table창을 띄움
	    btnok = new JButton("Ok");
	    btnok.addActionListener(new ActionListener(){
	        public void actionPerformed(ActionEvent arg0) {
	        	inpCre = Integer.parseInt(lbltxt.getText());	
	        	
            	sch new_sch[] = new sch[10];
            	for(int i=0;i<new_sch.length;i++)
            		new_sch[i] = new sch();
            	
	        	algo al = new algo();
	        	new_sch = al.create_schedule_within_credits(a, cal, inpCre);
	        	sch_table st = new sch_table(new_sch,inpCre);
	        	
	        	
	        	
	        	dispose();
	        }
	    });
	    
	    
	    contentPane.add(btnok);
	    btnok.setBounds(90, 70, 50, 25);
	    setVisible(true);
	    
	}
}
