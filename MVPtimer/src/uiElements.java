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
		
		
        String[] columns = {"MVP Name", "MVP Location", "Spawn Time", "Death Time", "Time Until Spawn", "Element"};

        Object[][] data = {
                {"Amon Ra", "moc_pryd06", "60~70 min", "21:00", 2, "Fire 200%"},
                {"Atroce 1", "ra_fild02", "240~250 min", "21:00", 2, "Holy 175%"},
                {"Atroce 2", "ra_fild03", "180~190 min", "21:00", 2, "Holy 175%"},
                {"Atroce 3", "ra_fild04", "300~310 min", "21:00", 2, "Holy 175%"},
                {"Atroce 4", "ve_fild01", "180~190 min", "21:00", 2, "Holy 175%"},
                {"Atroce 5", "ve_fild02", "360~370 min", "21:00", 2, "Holy 175%"},
                {"Atroce 6", "gld_dun03_2", "480~490 min", "21:00", 2, "Holy 175%"},
                {"Bascojin", "lou_dun03", "117~127 min", "21:00", 2, "Earth 200%"},
                {"Baphomet", "prt_maze03", "120~130 min", "21:00", 2, "Holy 175%"},
                {"Beelzebub", "abbey03", "60 min", "21:00", 2, "Ghost 200%"}
        };

        JTable table = new JTable(data, columns);
        table.setBounds(750, 200, 650, 700);

        JScrollPane pane = new JScrollPane(table);
        mainframe.add(pane);
 
        
        mainframe.setVisible(true);
		
	}
	
	public void sayhi() {
		System.out.println("hi");
	}
}
