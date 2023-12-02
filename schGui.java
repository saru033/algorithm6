package schedule;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class schGui extends JFrame {
		int cal = 0; // 몇번째 강의인기 저장하는 변수
		EventPrint ep;
	public schGui(sch[] a) {
		
		JButton btnsch , btntable;
		
		setTitle("Schedule Algorithm");
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(300, 300, 300, 270);
        Container contentPane = this.getContentPane();
        contentPane.setLayout(null);
		
        btnsch = new JButton("Input New Schedule");
        btnsch.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	
            
            	
            	if (cal > 9) {
            		ep = new EventPrint("Input Over!"); // 10개 이상의 강의를 입력하려고 하면 메세지 출력
            	}
            	else
            	{
            		InputSch is = new InputSch(a,cal); // 강의를 입력하는 창을 띄우고 cal값을 증가
            			cal++;
            	}
            }
        });
        btnsch.setBounds(50, 50, 200, 40);
        contentPane.add(btnsch);
        
        
        btntable = new JButton("See Table");
        btntable.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0) {
            	inputCredit ic = new inputCredit(a, cal);
            }
        });
        btntable.setBounds(50, 130, 200, 40);
        contentPane.add(btntable);
        
       setVisible(true);
	}

}

