import java.awt.BorderLayout;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.WindowConstants;

public class uiElements {

	private JFrame mainframe;
	
	
	
	public void initialize() {
		mainframe = new JFrame();
		mainframe.setBounds(650, 200, 650, 700);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
        String[] columns = {"MVP Name", "MVP Location", "MVP Death Time", "Time Until Spawn", "Comments"};

        Object[][] data = {
                {"Katty", "Smith", "SnowBoard", 5, false},
                {"Jhon", "Doe", "Rowing", 3, true},
                {"Sue", "Black", "Knitting", 2, false},
                {"Jane", "White", "Speed ride", 20, true}
        };

        JTable table = new JTable(data, columns);
        table.setBounds(750, 200, 650, 700);

        JScrollPane pane = new JScrollPane(table);
        mainframe.add(pane);
        //table.setVisible(true);
        
        mainframe.setVisible(true);
		
	}
	
	public void sayhi() {
		System.out.println("hi");
	}
}
