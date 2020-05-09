import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class uiElements extends mylogic {

	private JFrame mainframe;
	mylogic logeec = new mylogic();
	
	
	
	public void initialize() {
		
		// Set title of JFrame and some properties
		mainframe = new JFrame("XIVRO MVP Spawn Time Tracker by beep boop");
		mainframe.setBounds(650, 200, 1020, 700);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// These are the headers for each colum
        String[] columns = {"MVP Name", "MVP Location", "Spawn Time", "Death Time", "Server Spawn Time", "Race", "Property", "Elemental Weakness"};
        
        // Entries for each row representing all the various MVPs
        Object[][] data = {
                {"Amon Ra", "moc_pryd06", "60~70 min", 0000, 0, "Demi-Human", "Earth 3", "Fire 200%"},
                {"Atroce 1", "ra_fild02", "60 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 2", "ra_fild03", "60 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 3", "ra_fild04", "60 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 4", "ve_fild01", "60 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 5", "ve_fild02", "60 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Atroce 6", "gld_dun03_2 (Valk)", "60 min", 0000, 0, "Brute", "Shadow 3", "Holy 175%"},
                {"Bascojin", "lou_dun03", "117~127 min", 0000, 0, "Demi-Human", "Wind 3","Earth 200%"},
                {"Baphomet", "prt_maze03", "120~130 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Beelzebub", "abbey03", "60 min", 0000, 0, "Demon", "Ghost 4", "Ghost 200%"},
                {"Dark Lord 1", "gl_churchyard", "60~70 min", 0000, 0, "Demon", "Undead 4", "Holy / Fire 200%"},
                {"Dark Lord 2", "gld_dun04 (Britonia)", "60 min", 0000, 0, "Demon", "Undead 4", "Holy / Fire 200%"},
                {"Dark Lord 3", "gl_dun04_2 (Britonia)", "60 min", 0000, 0, "Demon", "Undead 4", "Holy / Fire 200%"},
                {"Detardeurus", "abyss_03", "40 min", 0000, 0, "Dragon", "Shadow 3", "Holy 175%"},
                {"Doppelganger 1", "gef_dun02", "120~130 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Doppelganger 2", "gld_dun02 (Luina)", "60 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Dracula", "gef_dun01", "60-70 min", 0000, 0, "Demon", "Shadow 4", "Holy 200%"},
                {"Drake", "treasure02", "120~130 min", 0000, 0, "Undead", "Undead 1", "Holy 150%"},
                {"Eddga", "pay_fild11", "120~130 min", 0000, 0, "Brute", "Fire 1", "Water 150%"},
                {"Eddga 2", "gld_dun01 (Green)", "60 min", 0000, 0, "Brute", "Fire 1", "Water 150%"},
                {"Eddga 3", "gld_dun01_2 (same)", "60 min", 0000, 0, "Brute", "Fire 1", "Water 150%"},
                {"Evil Snake Lord", "gon_dun03", "94~104 min", 0000, 0, "Brute", "Ghost 3", "Ghost 175%"},
                {"Fallen Bishop", "abbey02", "120~130 min", 0000, 0, "Demon", "Shadow 2", "Holy 150%"},
                {"Garm", "xmas_fild01", "120~130 min", 0000, 0, "Brute", "Water 4", "Wind 200%"},
                {"Gloom Under Night", "ra_san05", "60 min", 0000, 0, "Formless", "Ghost 3", "Ghost 175%"},
                {"Golden Thief Bug", "prt_sewb4", "60~70 min", 0000, 0, "Insect", "Fire 2", "Water 175%"},
                {"Gopinich", "mosk_dun03", "120~130 min", 0000, 0, "Brute", "Earth 3", "Fire 200%"},
                {"Ifrit", "thor_v03", "60 min", 0000, 0, "Formless", "Fire 4", "Water 200%"},
                {"Incantation Samurai", "ama_dun03", "91~101 min", 0000, 0, "Demi-Human", "Shadow 3", "Holy 175%"},
                {"Kiel D-01", "kh_dun02", "120~180 min", 0000, 0, "Formless", "Shadow 2", "Holy 150%"},
                {"Stormy Knight", "xmas_dun02", "60~70 min", 0000, 0, "Formless", "Wind 4", "Earth 200%"},                
                {"Lady Tanee", "ayo_dun02", "60 min", 0000, 0, "Plant", "Wind 3", "Earth 200%"},
                {"Lord of Death", "niflheim", "60 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Maya 1", "anthell02", "60 min", 0000, 0, "Insect", "Earth 4", "Fire 200%"},
                {"Maya 2", "gld_dun02_2 (Luina)", "60 min", 0000, 0, "Insect", "Earth 4", "Fire 200%"},
                {"Maya 3", "gld_dun03 (Valk)", "60 min", 0000, 0, "Insect", "Earth 4", "Fire 200%"},
                {"Mistress", "mjolnir_04", "120~130 min", 0000, 0, "Insect", "Wind 4", "Earth 200%"},
                {"Moonlight Flower", "pay_dun04", "60~70 min", 0000, 0, "Demon", "Fire 3", "Water 200%"},
                {"Nidhoggr's Shadow", "2@nyd", "Once Daily", 0000, 0, "Dragon", "Shadow 4", "Holy 200%"},
                {"Orc Hero 1", "gef_fild14", "60~70 min", 0000, 0, "Demi-Human", "Earth 2", "Fire 175%"},
                {"Orc Hero 2", "gef_fild02", "60 min", 0000, 0, "Demi-Human", "Earth 2", "Fire 175%"},
                {"Orc Lord", "gef_fild10", "120~130 min", 0000, 0, "Demi-Human", "Earth 4", "Fire 200%"},
                {"Osiris", "moc_pryd04", "60~70 min", 0000, 0, "Undead", "Undead 4", "Holy / Fire 200%"},
                {"Pharaoh", "in_sphinx5", "60~70 min", 0000, 0, "Demi-Human", "Shadow 3", "Holy 175%"},
                {"Phreeoni", "moc_fild17", "120~130 min", 0000, 0, "Brute", "Neutral 3", "Any 100% (but ghost)"},
                {"RSX 0806", "ein_dun02", "125~135 min", 0000, 0, "Formless", "Neutral 3", "Any 100% (but ghost)"},
                {"Tao Gunka", "beach_dun", "60 min", 0000, 0, "Demon", "Neutral 3", "Any 100% (but ghost)"},
                {"Turtle General", "tur_dun04", "60~70 min", 0000, 0, "Brute", "Earth 2", "Fire 175%"},
                {"Valkyrie Randgris", "odin_tem03", "60 min", 0000, 0, "Angel", "Holy 4", "Shadow 200%"},
                {"Vesper", "jupe_core", "120~130 min", 0000, 0, "Brute", "Holy 2", "Shadow 150%"},
                {"Wounded Morroc", "moc_fild22", "60 min", 0000, 0, "Demon", "Shadow 4", "Holy 200%"}
                
        };
        
        // Create a default table model and add the items above. Make some columns uneditable too
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
        
        // Create a table and add the default model to it
        JTable table = new JTable(model);
        table.setSize(1000, 442);
        table.setRowHeight(35);
        
        // Create JScrollPane, add table to it and add them to a JPanel
        JScrollPane ragnaScrollPane = new JScrollPane(table);
        JPanel ragnaPanel = new JPanel();  
        
        ragnaScrollPane.setPreferredSize(new Dimension(1000, 442));
        ragnaPanel.add(ragnaScrollPane);
        ragnaPanel.setPreferredSize(new Dimension(1000, 442));      
        
        // add JPanel to JFrame and make JFrame visible
        mainframe.add(ragnaPanel);                
        mainframe.setVisible(true);
        
        // This is a while loop that takes input from user and will calculate spawn timer of MVP and display it
        while(true) {
        	
        	// Display Amon Ra Spawn time based on user input Death Time
            int amonraDeathTime = Integer.parseInt(table.getValueAt(0, 3).toString());
            String amonraSpawnTime = "";
            if(amonraDeathTime > 2400 || (amonraDeathTime % 100) > 59 || amonraDeathTime < 0){
            	amonraSpawnTime = "Invalid Input";
            }else {
            	amonraSpawnTime = logeec.calcOneHourMVP(amonraDeathTime);
            }         
            table.setValueAt(amonraSpawnTime, 0, 4);
            
            // atroce 1
            int atroce1DeathTime = Integer.parseInt(table.getValueAt(1, 3).toString());
            String atroce1SpawnTime = "";
            if(atroce1DeathTime > 2400 || (atroce1DeathTime % 100) > 59 || atroce1DeathTime < 0) {
            	atroce1SpawnTime = "Invalid Input";
            }else {
            	atroce1SpawnTime = logeec.calcOneHourMVP(atroce1DeathTime);
            }         
            table.setValueAt(atroce1SpawnTime, 1, 4);
            
            // baphomet
            int baphometDeathTime = Integer.parseInt(table.getValueAt(8, 3).toString());
            String baphometSpawnTime = "";
            if(baphometDeathTime > 2400 || (baphometDeathTime % 100) > 59 || atroce1DeathTime < 0) {
            	baphometSpawnTime = "Invalid Input";
            }else {
            	baphometSpawnTime = logeec.calcTwoHourMVP(baphometDeathTime);
            }         
            table.setValueAt(baphometSpawnTime, 8, 4);

            
            
            
            
        }	
	}
}
