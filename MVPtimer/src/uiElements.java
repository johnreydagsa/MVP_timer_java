import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;
import javax.swing.table.DefaultTableModel;

import java.util.Scanner;

public class uiElements {

	private JFrame mainframe;
	Scanner scan = new Scanner(System.in);
	
	
	
	public void initialize() {
		mainframe = new JFrame("MVP Timer by beep boop");
		mainframe.setBounds(650, 200, 650, 700);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
        String[] columns = {"MVP Name", "MVP Location", "Spawn Time", "Death Time", "Time Until Spawn", "Element"};

        Object[][] data = {
                {"Amon Ra", "moc_pryd06", "60~70 min", 0, 2, "Fire 200%"},
                {"Atroce 1", "ra_fild02", "240~250 min", null, 2, "Holy 175%"},
                {"Atroce 2", "ra_fild03", "180~190 min", null, 2, "Holy 175%"},
                {"Atroce 3", "ra_fild04", "300~310 min", null, 2, "Holy 175%"},
                {"Atroce 4", "ve_fild01", "180~190 min", null, 2, "Holy 175%"},
                {"Atroce 5", "ve_fild02", "360~370 min", null, 2, "Holy 175%"},
                {"Atroce 6", "gld_dun03_2", "480~490 min", null, 2, "Holy 175%"},
                {"Bascojin", "lou_dun03", "117~127 min", null, 2, "Earth 200%"},
                {"Baphomet", "prt_maze03", "120~130 min", null, 2, "Holy 175%"},
                {"Beelzebub", "abbey03", "60 min", null, 2, "Ghost 200%"}
        };
        
        
        DefaultTableModel model = new DefaultTableModel(data, columns) 
        {
        	@Override
        	public boolean isCellEditable(int row, int column)
        	{
        		if(column == 3) {
        			return true;

        		}else {
        			return false;
        		}
        	}
        };
        
               

        JTable table = new JTable(model);
        table.setBounds(750, 200, 650, 700);
        

        JScrollPane pane = new JScrollPane(table);
        mainframe.add(pane);
 
        
        mainframe.setVisible(true);
             
        while(true) {
        	//calculate amon ra
            int mynum = Integer.parseInt(table.getValueAt(0, 3).toString());  
            //int inteeg = (Integer) mynum;
            int num2 = mynum - 1;
            table.setValueAt(num2, 0, 4);
            
        }	
	}
	
	
	
	
	
	public void sayhi() {
		System.out.println("hi");
	}
}
