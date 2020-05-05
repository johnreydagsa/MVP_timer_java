import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class uiElements extends mylogic {

	private JFrame mainframe;
	mylogic logeec = new mylogic();
	
	
	
	public void initialize() {
		mainframe = new JFrame("MVP Spawn Time Tracker by beep boop");
		mainframe.setBounds(650, 200, 650, 700);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
        String[] columns = {"MVP Name", "MVP Location", "Spawn Time", "Death Time", "Time Until Spawn", "Element"};

        Object[][] data = {
                {"Amon Ra", "moc_pryd06", "60~70 min", 0000, 2, "Fire 200%"},
                {"Atroce 1", "ra_fild02", "240~250 min", 0000, 2, "Holy 175%"},
                {"Atroce 2", "ra_fild03", "180~190 min", 0000, 2, "Holy 175%"},
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
        	
        	// Display Amon Ra Spawn time based on user input Death Time
            int amonraDeathTime = Integer.parseInt(table.getValueAt(0, 3).toString());  
            String amonraSpawnTime = logeec.calcAmonRa(amonraDeathTime);
            table.setValueAt(amonraSpawnTime, 0, 4);
            
        	// Display Atroce1 Spawn time based on user input Death Time
            int atroce1DeathTime = Integer.parseInt(table.getValueAt(1, 3).toString());
            int atroce1SpawnTime = logeec.calcAtroce1(atroce1DeathTime);
            table.setValueAt(atroce1SpawnTime, 1, 4);
            
            
        }	
	}
}
