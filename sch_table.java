package schedule;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;

public class sch_table extends JFrame {
	int i=0;
	private JButton btnok;
	Color c = new Color(255,255,205);
	// table 의 기본 형태
	String header[] = {"","월","화","수","목","금"};
	String contents[][] = {
			{"9"," "," "," "," "," "},
			{"10"," "," "," "," "," "},
			{"11"," "," "," "," "," "},
			{"12"," "," "," "," "," "},
			{"13"," "," "," "," "," "},
			{"14"," "," "," "," "," "},
			{"15"," "," "," "," "," "},
			{"16"," "," "," "," "," "},
			{"17"," "," "," "," "," "}
	};
	
	
	
	
	public sch_table(sch[] a, int inpCre) {
		
	Dimension dim = new Dimension(800, 300);
		
	JFrame frame = new JFrame("Schedule Table");
    frame.setLocation(100, 100);				  
    frame.setPreferredSize(dim);              
    frame.setLayout(null);  
   
    JTable t = new JTable(contents,header);
    JScrollPane scrollpane = new JScrollPane(t);
    
    scrollpane.setLocation(10,50);
    scrollpane.setSize(765,167);
    frame.add(scrollpane);
    
    frame.setResizable(false);
    frame.pack();
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
    
    int cc = 0;
    for(i = 0; i<10 ;i++)
    {
    	cc = cc + a[i].credits;
    }
    
    
    // ok버튼을 누르면 창을 끔
    btnok = new JButton("Ok");
    btnok.addActionListener(new ActionListener(){
        public void actionPerformed(ActionEvent arg0) {
        	frame.dispose();
        }
    });
    frame.add(btnok);
    btnok.setBounds(700, 230, 50, 25);
    
    JLabel lb = new JLabel("Target Credits : " + inpCre);
    lb.setFont(new Font("Tahoma", Font.BOLD, 14));
    lb.setHorizontalAlignment(SwingConstants.LEFT);
    lb.setBounds(10, 11, 200, 25);
    frame.add(lb);
    
    JLabel lb2 = new JLabel("Corrent Credits : " + cc);
    lb2.setFont(new Font("Tahoma", Font.BOLD, 14));
    lb2.setHorizontalAlignment(SwingConstants.RIGHT);
    lb2.setBounds(100, 11, 200, 25);
    frame.add(lb2);
    
    
    // 알고리즘을 돌린 후 선택된 강의들을 day와 시간에 따라 table에 출력
    for(i = 0; i<10 ;i++)
    {
    	if(a[i].day == null)
    		break;
    	
    	switch (a[i].day) {
    	
    	case "Mon":
    			switch(a[i].start_time) {
    			case 9:
    				for(int j = 0;j<a[i].end_time - a[i].start_time;j++)
    					t.setValueAt(a[i].name, 0+j, 1);
    				break;
    			case 10:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 1+j, 1);
    				break;
    			case 11:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 2+j, 1);
    				break;
    			case 12:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 3+j, 1);
    				break;
    			case 13:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 4+j, 1);
    				break;
    			case 14:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 5+j, 1);
    				break;
    			case 15:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 6+j, 1);
    				break;
    			case 16:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 7+j, 1);
    				break;
    			case 17:
    				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
    					t.setValueAt(a[i].name, 8+j, 1);
    				break;
    			default:
    				break;
    			}
    		break;
    	case "Tue":
			switch(a[i].start_time) {
			case 9:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 0+j, 2);
				break;
			case 10:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 1+j, 2);
				break;
			case 11:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 2+j, 2);
				break;
			case 12:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 3+j, 2);
				break;
			case 13:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 4+j, 2);
				break;
			case 14:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 5+j, 2);
				break;
			case 15:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 6+j, 2);
				break;
			case 16:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 7+j, 2);
				break;
			case 17:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 8+j, 2);
				break;
			default:
				break;
			}
    		break;
    	case "Wed":
			switch(a[i].start_time) {
			case 9:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 0+j, 3);
				break;
			case 10:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 1+j, 3);
				break;
			case 11:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 2+j, 3);
				break;
			case 12:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 3+j, 3);
				break;
			case 13:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 4+j, 3);
				break;
			case 14:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 5+j, 3);
				break;
			case 15:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 6+j, 3);
				break;
			case 16:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 7+j, 3);
				break;
			case 17:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 8+j, 3);
				break;
			default:
				break;
			}
    		break;
    	case "Thu":
			switch(a[i].start_time) {
			case 9:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 0+j, 4);
				break;
			case 10:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 1+j, 4);
				break;
			case 11:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 2+j, 4);
				break;
			case 12:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 3+j, 4);
				break;
			case 13:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 4+j, 4);
				break;
			case 14:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 5+j, 4);
				break;
			case 15:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 6+j, 4);
				break;
			case 16:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 7+j, 4);
				break;
			case 17:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 8+j, 4);
				break;
			default:
				break;
			}
    		break;
    	case "Fri":
			switch(a[i].start_time) {
			case 9:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 0+j, 5);
				break;
			case 10:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 1+j, 5);
				break;
			case 11:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 2+j, 5);
				break;
			case 12:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 3+j, 5);
				break;
			case 13:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 4+j, 5);
				break;
			case 14:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 5+j, 5);
				break;
			case 15:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 6+j, 5);
				break;
			case 16:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 7+j, 5);
				break;
			case 17:
				for(int j = 0;j<a[i].end_time- a[i].start_time;j++)
					t.setValueAt(a[i].name, 8+j, 5);
				break;
			default:
				break;
			}
    		break;
    	default:
    		break;
    	}
    	
    	
    }
    
    
    t.setFillsViewportHeight(true);
    tableCellCenter(t);
    setCoulmnSize(t);
    
    
    //셀을 우클릭 두번하면 그 과목의 정보를 메세지 창으로 출력
    t.addMouseListener(new MouseAdapter() {
   public void mouseClicked(MouseEvent e) {
        JTable t = (JTable)e.getSource();
        if(e.getClickCount()==2) {
            TableModel m = t.getModel();
            Point pt = e.getPoint();
            int i = t.rowAtPoint(pt);
            int j = t.columnAtPoint(pt);
            if(i>=0) {
            	int row = t.convertRowIndexToModel(i);
            	int col = t.convertColumnIndexToModel(j);
                String s = String.format("%s", m.getValueAt(row,j));
                Printsub ps = new Printsub(s,a);
            }
        }
    }
    });

        }
   
	
	public void tableCellCenter(JTable t){
	    // 테이블 내용 가운데 정렬하기
	      DefaultTableCellRenderer dtcr = new DefaultTableCellRenderer(); // 디폴트테이블셀렌더러를 생성
	      dtcr.setHorizontalAlignment(SwingConstants.CENTER); // 렌더러의 가로정렬을 CENTER로
	     
	      TableColumnModel tcm = t.getColumnModel() ; // 정렬할 테이블의 컬럼모델을 가져옴
	     

	      tcm.getColumn(0).setCellRenderer(dtcr);  
	      tcm.getColumn(1).setCellRenderer(dtcr);  
	      tcm.getColumn(2).setCellRenderer(dtcr);  
	      tcm.getColumn(3).setCellRenderer(dtcr);  
	      tcm.getColumn(4).setCellRenderer(dtcr);  
	      tcm.getColumn(5).setCellRenderer(dtcr);
	    }

    public void setCoulmnSize(JTable t){
        
        t.getTableHeader().setReorderingAllowed(false);      
 
        t.getColumnModel().getColumn(0).setPreferredWidth(20);
        t.getColumnModel().getColumn(0).setResizable(false);

       
    }
}
