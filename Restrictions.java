package schedule;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

//프로그램 시작시 나오는 메세지 창으로 알고리즘의 제한사항을 설명
public class Restrictions extends JFrame{
	private JButton btnok;
	public Restrictions() {
	setTitle("Restrictions");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(300, 300, 480, 500);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);
	
    
    JLabel lbl = new JLabel("Welcome! This is Schedule Algorithms!");
    lbl.setFont(new Font("Tahoma", Font.BOLD, 19));
    lbl.setHorizontalAlignment(SwingConstants.CENTER);
    lbl.setBounds(30, 11, 400, 25);
    contentPane.add(lbl);
    
    JLabel lbl2 = new JLabel("There are some limitations");
    lbl2.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl2.setHorizontalAlignment(SwingConstants.CENTER);
    lbl2.setBounds(30, 60, 400,25);
    contentPane.add(lbl2);
    
    JLabel lbl3 = new JLabel("1. Enter only the first 3 letters of the day ex)Mon, Tue ...");
    lbl3.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl3.setHorizontalAlignment(SwingConstants.CENTER);
    lbl3.setBounds(30, 100, 400, 25);
    contentPane.add(lbl3);
    
    JLabel lbl4 = new JLabel("2. Time table available until Friday");
    lbl4.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl4.setHorizontalAlignment(SwingConstants.CENTER);
    lbl4.setBounds(30, 130, 400, 25);
    contentPane.add(lbl4);
    
    JLabel lbl5 = new JLabel("3. The time is from 9:00 to 17:00");
    lbl5.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl5.setHorizontalAlignment(SwingConstants.CENTER);
    lbl5.setBounds(30, 160, 400, 25);
    contentPane.add(lbl5);
    
    JLabel lbl6 = new JLabel("<html><body>4. When entering the time, enter only the Hour and enter <br><center>it in 24 degrees. ex) 13, 14 ...</center></html></body>");
    lbl6.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl6.setHorizontalAlignment(SwingConstants.CENTER);
    lbl6.setBounds(30, 190, 400, 50);
    contentPane.add(lbl6);
    
    JLabel lbl7 = new JLabel("5. Up to 10 lectures can be entered");
    lbl7.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl7.setHorizontalAlignment(SwingConstants.CENTER);
    lbl7.setBounds(30, 245, 400, 25);
    contentPane.add(lbl7);
    
    JLabel lbl8 = new JLabel("<html><body>6. When entering End Time, be careful that End time <br><center> is later than Start_time.</center></html></body>");
    lbl8.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl8.setHorizontalAlignment(SwingConstants.CENTER);
    lbl8.setBounds(30, 275, 400, 50);
    contentPane.add(lbl8);
    
    JLabel lbl9 = new JLabel("Recall these limitations and enjoy the algorithm!");
    lbl9.setFont(new Font("Tahoma", Font.BOLD, 14));
    lbl9.setHorizontalAlignment(SwingConstants.CENTER);
    lbl9.setBounds(30, 330, 400, 50);
    contentPane.add(lbl9);
    
    btnok = new JButton("OK");
    btnok.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {
        	sch list[] = new sch[10];
        	for(int i=0;i<list.length;i++)
        		list[i] = new sch();
        	
        	
            schGui s = new schGui(list);
        	dispose();
        }
    });
    btnok.setBounds(175, 380, 100, 50);
    contentPane.add(btnok);
    
   setVisible(true);
	}
	
}