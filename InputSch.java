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

public class InputSch extends JFrame{
	
    private JTextField txtname, txtday, txtst ,txtet, txtcre, txtimp;
    private JButton btnok, btnbk;
    private JLabel lblErrorMessage;
    protected boolean loginSuccess = false;
    public static String Gname, Gpwd;
    public static String name;

    
  
    
	public InputSch(sch[] a, int i) {
	setTitle("Input New Schedule");
    setResizable(false);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 400, 400);
    Container contentPane = this.getContentPane();
    contentPane.setLayout(null);

    JLabel lblname = new JLabel("Subject :");
    lblname.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblname.setHorizontalAlignment(SwingConstants.RIGHT);
    lblname.setBounds(10, 11, 120, 25);
    contentPane.add(lblname);

    txtname = new JTextField();
    txtname.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtname.setBounds(140, 11, 200, 25);
    contentPane.add(txtname);

    JLabel lblday = new JLabel("Day :");
    lblday.setHorizontalAlignment(SwingConstants.RIGHT);
    lblday.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblday.setBounds(10, 52, 120, 25);
    contentPane.add(lblday);

    txtday = new JTextField();
    txtday.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtday.setBounds(140, 52, 200, 25);
    contentPane.add(txtday);

    
    JLabel lblst = new JLabel("Start Time :");
    lblst.setHorizontalAlignment(SwingConstants.RIGHT);
    lblst.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblst.setBounds(10, 93, 120, 25);
    contentPane.add(lblst);

    txtst = new JTextField();
    txtst.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtst.setBounds(140, 93, 200, 25);
    contentPane.add(txtst);

    
    JLabel lblet = new JLabel("End Time :");
    lblet.setHorizontalAlignment(SwingConstants.RIGHT);
    lblet.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblet.setBounds(10, 134, 120, 25);
    contentPane.add(lblet);

    txtet = new JTextField();
    txtet.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtet.setBounds(140, 134, 200, 25);
    contentPane.add(txtet);
    
    JLabel lblcre = new JLabel("Credits :");
    lblcre.setHorizontalAlignment(SwingConstants.RIGHT);
    lblcre.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblcre.setBounds(10, 175, 120, 25);
    contentPane.add(lblcre);

    txtcre = new JTextField();
    txtcre.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtcre.setBounds(140, 175, 200, 25);
    contentPane.add(txtcre);

    JLabel lblimp = new JLabel("Importance :");
    lblimp.setHorizontalAlignment(SwingConstants.RIGHT);
    lblimp.setFont(new Font("Tahoma", Font.BOLD, 14));
    lblimp.setBounds(10, 216, 120, 25);
    contentPane.add(lblimp);

    txtimp = new JTextField();
    txtimp.setFont(new Font("Tahoma", Font.PLAIN, 14));
    txtimp.setBounds(140, 216, 200, 25);
    contentPane.add(txtimp);
    
    //back을 입력시 창을 끔
    btnbk = new JButton("Back");
    btnbk.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {

        	dispose();
        }
    });
    btnbk.setFont(new Font("Tahoma", Font.PLAIN, 14));
    btnbk.setBounds(140, 270, 89, 25);
    contentPane.add(btnbk);
    
    
    
    int j = i+1;
    // ok 버튼을 누르면 텍스트 필드에 있는 값들로 sch 클래스 배열에 저장하고, 메세지 창을 끔
    btnok = new JButton("OK");
    btnok.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {
        	Inputdata id = new Inputdata();
        	a[i] = id.input(a[i], txtname.getText(), txtday.getText(), Integer.parseInt(txtst.getText()) , Integer.parseInt(txtet.getText()), Integer.parseInt(txtcre.getText()), Integer.parseInt(txtimp.getText()));
        	EventPrint ep = new EventPrint("Schedule " + j +" is saved!");

        	dispose();
        }
    });
    
 
    btnok.setFont(new Font("Tahoma", Font.PLAIN, 14));
    btnok.setBounds(251, 270, 89, 25);
    contentPane.add(btnok);
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
}
}
