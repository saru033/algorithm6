package schedule;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class EventPrint extends JFrame{
	
    private JButton btnLogin;
    
    //받아온 text 값을 출력하는 gui 함수
	public EventPrint(String text) {
		
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(300, 300, 250, 150);
	    Container contentPane = this.getContentPane();
	    contentPane.setLayout(null);

	    JLabel lblUsername = new JLabel(text);
	    lblUsername.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblUsername.setHorizontalAlignment(SwingConstants.CENTER);
	    lblUsername.setBounds(10, 11, 200, 25);
	    contentPane.add(lblUsername);
	    
	    //ok를 누르면 창을 끔
	    btnLogin = new JButton("Ok");
	    btnLogin.addActionListener(new ActionListener(){

	        public void actionPerformed(ActionEvent arg0) {
	        	dispose();
	        }
	    });
	    
	    
	    contentPane.add(btnLogin);
	    btnLogin.setBounds(90, 70, 50, 25);
	    setVisible(true);
	    
	}
}