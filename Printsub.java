package schedule;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Printsub extends JFrame{
	private JButton btnbk;
	
	public Printsub(String name, sch[] a) {
		setTitle("Details");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 250, 300);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);
        
        sch p = new sch();
        
        if (!name.equals(" ")) {
        	
        for(int i=0;i<a.length;i++) {
        	if(name.equals(a[i].name))
        		p = a[i];
        }
        	       
        JLabel lbl = new JLabel("Subject : " + p.name);
        lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl.setHorizontalAlignment(SwingConstants.CENTER);
        lbl.setBounds(10, 10, 200, 25);
        contentPane.add(lbl);

        JLabel lbl2 = new JLabel("Day : " + p.day);
        lbl2.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl2.setHorizontalAlignment(SwingConstants.CENTER);
        lbl2.setBounds(10, 40, 200, 25);
        contentPane.add(lbl2);
        
        JLabel lbl3 = new JLabel("Start Time : " + p.start_time);
        lbl3.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl3.setHorizontalAlignment(SwingConstants.CENTER);
        lbl3.setBounds(10, 70, 200, 25);
        contentPane.add(lbl3);
        
        JLabel lbl4 = new JLabel("Hours : " + p.end_time);
        lbl4.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl4.setHorizontalAlignment(SwingConstants.CENTER);
        lbl4.setBounds(10, 100, 200, 25);
        contentPane.add(lbl4);

        JLabel lbl5 = new JLabel("Credits : " + p.credits);
        lbl5.setFont(new Font("Tahoma", Font.BOLD, 14));
        lbl5.setHorizontalAlignment(SwingConstants.CENTER);
        lbl5.setBounds(10, 130, 200, 25);
        contentPane.add(lbl5);
        
        }
        else {
            JLabel lbl = new JLabel("Empty!");
            lbl.setFont(new Font("Tahoma", Font.BOLD, 14));
            lbl.setHorizontalAlignment(SwingConstants.CENTER);
            lbl.setBounds(10, 20, 200, 25);
            contentPane.add(lbl);
        }
        
        
        //back을 입력시 창을 끔
        btnbk = new JButton("Back");
        btnbk.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	dispose();
            }
        });
        btnbk.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnbk.setBounds(70, 200, 89, 25);
        contentPane.add(btnbk);
        
        setVisible(true);
	}
}
