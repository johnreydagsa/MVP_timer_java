import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class uiElements extends mylogic {

	private JFrame mainframe;
	mylogic logeec = new mylogic();
	
	
	
	public void initialize() {
		mainframe = new JFrame("XIVRO MVP Spawn Time Tracker by beep boop");
		mainframe.setBounds(650, 200, 1000, 700);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
        String[] columns = {"MVP Name", "MVP Location", "Spawn Time", "Death Time", "Server Spawn Time", "Race", "Property", "Elemental Weakness"};

        Object[][] data = {
                {"Amon Ra", "moc_pryd06", "60~70 min", 0000, 0, "Demi-Human", "Earth 3", "Fire 200%"},
                {"Atroce 1", "ra_fild02", "240~250 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 2", "ra_fild03", "180~190 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 3", "ra_fild04", "300~310 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 4", "ve_fild01", "180~190 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 5", "ve_fild02", "360~370 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 6", "gld_dun03_2", "480~490 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Bascojin", "lou_dun03", "117~127 min", 0000, 0, "Demi-Human", "Wind 3","Earth 200%"},
                {"Baphomet", "prt_maze03", "120~130 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Beelzebub", "abbey03", "60 min", 0000, 0, "Demon", "Ghost 4", "Ghost 200%"},
                {"Dark Lord 1", "gl_churchyard", "60-70 min", 0000, 0, "Demon", "Undead 4", "Holy / Fire 200%"},
                {"Dark Lord 2", "gld_dun04", "480-490 min", 0000, 0, "Demon", "Undead 4", "Holy / Fire 200%"},
                {"Dark Lord 3", "gl_dun04_2", "480-490 min", 0000, 0, "Demon", "Undead 4", "Holy / Fire 200%"},
                {"Detardeurus", "abyss_03", "40 min", 0000, 0, "Dragon", "Shadow 3", "Holy 175%"},
                {"Doppelganger 1", "gef_dun02", "120~130 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Doppelganger 2", "gld_dun02", "480-490 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Dracula", "gef_dun01", "60-70 min", 0000, 0, "Demon", "Shadow 4", "Holy 200%"},
                {"Drake", "treasure02", "120~130 min", 0000, 0, "Undead", "Undead 1", "Holy 150%"},
                {"Eddga", "prt_maze03", "120~130 min", 0000, 0, "Brute", "Fire 1", "Water 150%"},
                {"Baphomet", "prt_maze03", "120~130 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                
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
        table.setBounds(750, 200, 1000, 700);
        

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
