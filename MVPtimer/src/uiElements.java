import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.RowSorter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

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
                {"Kiel D-01", "kh_dun02", "60 min", 0000, 0, "Formless", "Shadow 2", "Holy 150%"},                
                {"Lady Tanee", "ayo_dun02", "60 min", 0000, 0, "Plant", "Wind 3", "Earth 200%"},
                {"Lord of Death", "niflheim", "60 min", 0000, 0, "Demon", "Shadow 3", "Holy 175%"},
                {"Maya 1", "anthell02", "60 min", 0000, 0, "Insect", "Earth 4", "Fire 200%"},
                {"Maya 2", "gld_dun02_2 (Luina)", "60 min", 0000, 0, "Insect", "Earth 4", "Fire 200%"},
                {"Maya 3", "gld_dun03 (Valk)", "60 min", 0000, 0, "Insect", "Earth 4", "Fire 200%"},
                {"Mistress", "mjolnir_04", "120~130 min", 0000, 0, "Insect", "Wind 4", "Earth 200%"},
                {"Moonlight Flower", "pay_dun04", "60~70 min", 0000, 0, "Demon", "Fire 3", "Water 200%"},
                {"Orc Hero 1", "gef_fild14", "60~70 min", 0000, 0, "Demi-Human", "Earth 2", "Fire 175%"},
                {"Orc Hero 2", "gef_fild02", "60 min", 0000, 0, "Demi-Human", "Earth 2", "Fire 175%"},
                {"Orc Lord", "gef_fild10", "120~130 min", 0000, 0, "Demi-Human", "Earth 4", "Fire 200%"},
                {"Osiris", "moc_pryd04", "60~70 min", 0000, 0, "Undead", "Undead 4", "Holy / Fire 200%"},
                {"Pharaoh", "in_sphinx5", "60~70 min", 0000, 0, "Demi-Human", "Shadow 3", "Holy 175%"},
                {"Phreeoni", "moc_fild17", "120~130 min", 0000, 0, "Brute", "Neutral 3", "Any 100% (but ghost)"},
                {"RSX 0806", "ein_dun02", "125~135 min", 0000, 0, "Formless", "Neutral 3", "Any 100% (but ghost)"},
                {"Stormy Knight", "xmas_dun02", "60~70 min", 0000, 0, "Formless", "Wind 4", "Earth 200%"},
                {"Tao Gunka", "beach_dun", "60 min", 0000, 0, "Demon", "Neutral 3", "Any 100% (but ghost)"},
                {"Turtle General", "tur_dun04", "60~70 min", 0000, 0, "Brute", "Earth 2", "Fire 175%"},
                {"Valkyrie Randgris", "odin_tem03", "60 min", 0000, 0, "Angel", "Holy 4", "Shadow 200%"},
                {"Vesper", "jupe_core", "120~130 min", 0000, 0, "Brute", "Holy 2", "Shadow 150%"},
                {"Wounded Morroc", "moc_fild22", "60 min", 0000, 0, "Demon", "Shadow 4", "Holy 200%"},
                {"Egnigem Cenia", "lhz_dun02", "120 min", 0000, 0, "Demi-Human", "Fire 2", "Water 200%"}
                
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
        
        // for sorting the table
        RowSorter<TableModel> sorter = new TableRowSorter<TableModel>(model);
        
        table.setRowSorter(sorter);
        
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
            
            // atroce 2
            int atroce2DeathTime = Integer.parseInt(table.getValueAt(2, 3).toString());
            String atroce2SpawnTime = "";
            if(atroce2DeathTime > 2400 || (atroce2DeathTime % 100) > 59 || atroce2DeathTime < 0) {
            	atroce2SpawnTime = "Invalid Input";
            }else {
            	atroce2SpawnTime = logeec.calcOneHourMVP(atroce2DeathTime);
            }         
            table.setValueAt(atroce2SpawnTime, 2, 4);
            
            // atroce 3
            int atroce3DeathTime = Integer.parseInt(table.getValueAt(3, 3).toString());
            String atroce3SpawnTime = "";
            if(atroce3DeathTime > 2400 || (atroce3DeathTime % 100) > 59 || atroce3DeathTime < 0) {
            	atroce3SpawnTime = "Invalid Input";
            }else {
            	atroce3SpawnTime = logeec.calcOneHourMVP(atroce3DeathTime);
            }         
            table.setValueAt(atroce3SpawnTime, 3, 4);
            
            // atroce 4
            int atroce4DeathTime = Integer.parseInt(table.getValueAt(4, 3).toString());
            String atroce4SpawnTime = "";
            if(atroce4DeathTime > 2400 || (atroce4DeathTime % 100) > 59 || atroce4DeathTime < 0) {
            	atroce4SpawnTime = "Invalid Input";
            }else {
            	atroce4SpawnTime = logeec.calcOneHourMVP(atroce4DeathTime);
            }         
            table.setValueAt(atroce4SpawnTime, 4, 4);
            
            // atroce 5
            int atroce5DeathTime = Integer.parseInt(table.getValueAt(5, 3).toString());
            String atroce5SpawnTime = "";
            if(atroce5DeathTime > 2400 || (atroce5DeathTime % 100) > 59 || atroce5DeathTime < 0) {
            	atroce5SpawnTime = "Invalid Input";
            }else {
            	atroce5SpawnTime = logeec.calcOneHourMVP(atroce5DeathTime);
            }         
            table.setValueAt(atroce5SpawnTime, 5, 4);
            
            // atroce 6
            int atroce6DeathTime = Integer.parseInt(table.getValueAt(6, 3).toString());
            String atroce6SpawnTime = "";
            if(atroce6DeathTime > 2400 || (atroce6DeathTime % 100) > 59 || atroce6DeathTime < 0) {
            	atroce6SpawnTime = "Invalid Input";
            }else {
            	atroce6SpawnTime = logeec.calcOneHourMVP(atroce6DeathTime);
            }         
            table.setValueAt(atroce6SpawnTime, 6, 4);
            
            //bascojin
            int bascojinDeathTime = Integer.parseInt(table.getValueAt(7, 3).toString());
            String bascojinSpawnTime = "";
            if(bascojinDeathTime > 2400 || (bascojinDeathTime % 100) > 59 || bascojinDeathTime < 0) {
            	bascojinSpawnTime = "Invalid Input";
            }else {
            	bascojinSpawnTime = logeec.calcOneHourMVP(bascojinDeathTime);
            }         
            table.setValueAt(bascojinSpawnTime, 7, 4);
            
            // baphomet
            int baphometDeathTime = Integer.parseInt(table.getValueAt(8, 3).toString());
            String baphometSpawnTime = "";
            if(baphometDeathTime > 2400 || (baphometDeathTime % 100) > 59 || atroce1DeathTime < 0) {
            	baphometSpawnTime = "Invalid Input";
            }else {
            	baphometSpawnTime = logeec.calcTwoHourMVP(baphometDeathTime);
            }         
            table.setValueAt(baphometSpawnTime, 8, 4);

            
            // beelzebub
            int beelzebubDeathTime = Integer.parseInt(table.getValueAt(9, 3).toString());
            String beelzebubSpawnTime = "";
            if(beelzebubDeathTime > 2400 || (beelzebubDeathTime % 100) > 59 || beelzebubDeathTime < 0) {
            	beelzebubSpawnTime = "Invalid Input";
            }else {
            	beelzebubSpawnTime = logeec.calcOneHourMVP(beelzebubDeathTime);
            }         
            table.setValueAt(beelzebubSpawnTime, 9, 4);
            
            // dark lord
            int darklordDeathTime = Integer.parseInt(table.getValueAt(10, 3).toString());
            String darklordSpawnTime = "";
            if(darklordDeathTime > 2400 || (darklordDeathTime % 100) > 59 || darklordDeathTime < 0) {
            	darklordSpawnTime = "Invalid Input";
            }else {
            	darklordSpawnTime = logeec.calcOneHourMVP(darklordDeathTime);
            }         
            table.setValueAt(darklordSpawnTime, 10, 4);
            
            // dark lord 2
            int darklord2DeathTime = Integer.parseInt(table.getValueAt(11, 3).toString());
            String darklord2SpawnTime = "";
            if(darklord2DeathTime > 2400 || (darklord2DeathTime % 100) > 59 || darklord2DeathTime < 0) {
            	darklord2SpawnTime = "Invalid Input";
            }else {
            	darklord2SpawnTime = logeec.calcOneHourMVP(darklord2DeathTime);
            }         
            table.setValueAt(darklord2SpawnTime, 11, 4);

            // dark lord 3
            int darklord3DeathTime = Integer.parseInt(table.getValueAt(12, 3).toString());
            String darklord3SpawnTime = "";
            if(darklord3DeathTime > 2400 || (darklord3DeathTime % 100) > 59 || darklord3DeathTime < 0) {
            	darklord3SpawnTime = "Invalid Input";
            }else {
            	darklord3SpawnTime = logeec.calcOneHourMVP(darklord3DeathTime);
            }         
            table.setValueAt(darklord3SpawnTime, 12, 4);
            
            //detardeurus 13
            
            
            // doppel1
            int doppel1DeathTime = Integer.parseInt(table.getValueAt(14, 3).toString());
            String doppel1SpawnTime = "";
            if(doppel1DeathTime > 2400 || (doppel1DeathTime % 100) > 59 || doppel1DeathTime < 0) {
            	doppel1SpawnTime = "Invalid Input";
            }else {
            	doppel1SpawnTime = logeec.calcTwoHourMVP(doppel1DeathTime);
            }         
            table.setValueAt(doppel1SpawnTime, 14, 4);
            
            // doppel2
            int doppel2DeathTime = Integer.parseInt(table.getValueAt(15, 3).toString());
            String doppel2SpawnTime = "";
            if(doppel2DeathTime > 2400 || (doppel2DeathTime % 100) > 59 || doppel2DeathTime < 0) {
            	doppel2SpawnTime = "Invalid Input";
            }else {
            	doppel2SpawnTime = logeec.calcOneHourMVP(doppel2DeathTime);
            }         
            table.setValueAt(doppel2SpawnTime, 15, 4);
            
            // dracula
            int draculaDeathTime = Integer.parseInt(table.getValueAt(16, 3).toString());
            String draculaSpawnTime = "";
            if(draculaDeathTime > 2400 || (draculaDeathTime % 100) > 59 || draculaDeathTime < 0) {
            	draculaSpawnTime = "Invalid Input";
            }else {
            	draculaSpawnTime = logeec.calcOneHourMVP(draculaDeathTime);
            }         
            table.setValueAt(draculaSpawnTime, 16, 4);
            
            // drake
            int drakeDeathTime = Integer.parseInt(table.getValueAt(17, 3).toString());
            String drakeSpawnTime = "";
            if(drakeDeathTime > 2400 || (drakeDeathTime % 100) > 59 || drakeDeathTime < 0) {
            	drakeSpawnTime = "Invalid Input";
            }else {
            	drakeSpawnTime = logeec.calcTwoHourMVP(drakeDeathTime);
            }         
            table.setValueAt(drakeSpawnTime, 17, 4);
            
            // eddga 1
            int eddga1DeathTime = Integer.parseInt(table.getValueAt(18, 3).toString());
            String eddga1SpawnTime = "";
            if(eddga1DeathTime > 2400 || (eddga1DeathTime % 100) > 59 || eddga1DeathTime < 0) {
            	eddga1SpawnTime = "Invalid Input";
            }else {
            	eddga1SpawnTime = logeec.calcTwoHourMVP(eddga1DeathTime);
            }         
            table.setValueAt(eddga1SpawnTime, 18, 4);
            
            // eddga 2 (row 19)
            int eddga2DeathTime = Integer.parseInt(table.getValueAt(19, 3).toString());
            String eddga2SpawnTime = "";
            if(eddga2DeathTime > 2400 || (eddga2DeathTime % 100) > 59 || eddga2DeathTime < 0) {
            	eddga2SpawnTime = "Invalid Input";
            }else {
            	eddga2SpawnTime = logeec.calcOneHourMVP(eddga2DeathTime);
            }         
            table.setValueAt(eddga2SpawnTime, 19, 4);
            
            // eddga 3 (row 20)
            int eddga3DeathTime = Integer.parseInt(table.getValueAt(20, 3).toString());
            String eddga3SpawnTime = "";
            if(eddga3DeathTime > 2400 || (eddga3DeathTime % 100) > 59 || eddga3DeathTime < 0) {
            	eddga3SpawnTime = "Invalid Input";
            }else {
            	eddga3SpawnTime = logeec.calcOneHourMVP(eddga3DeathTime);
            }         
            table.setValueAt(eddga3SpawnTime, 20, 4);
            
            // evil snake lord
            
            // fallen bishop (row 22)
            int fallenDeathTime = Integer.parseInt(table.getValueAt(22, 3).toString());
            String fallenSpawnTime = "";
            if(fallenDeathTime > 2400 || (fallenDeathTime % 100) > 59 || fallenDeathTime < 0) {
            	fallenSpawnTime = "Invalid Input";
            }else {
            	fallenSpawnTime = logeec.calcTwoHourMVP(fallenDeathTime);
            }         
            table.setValueAt(fallenSpawnTime, 22, 4);
            
            // garm (row 23)
            int garmDeathTime = Integer.parseInt(table.getValueAt(23, 3).toString());
            String garmSpawnTime = "";
            if(garmDeathTime > 2400 || (garmDeathTime % 100) > 59 || garmDeathTime < 0) {
            	garmSpawnTime = "Invalid Input";
            }else {
            	garmSpawnTime = logeec.calcTwoHourMVP(garmDeathTime);
            }         
            table.setValueAt(garmSpawnTime, 23, 4);
            
            // gloom (row 24)
            int gloomDeathTime = Integer.parseInt(table.getValueAt(24, 3).toString());
            String gloomSpawnTime = "";
            if(gloomDeathTime > 2400 || (gloomDeathTime % 100) > 59 || gloomDeathTime < 0) {
            	gloomSpawnTime = "Invalid Input";
            }else {
            	gloomSpawnTime = logeec.calcOneHourMVP(gloomDeathTime);
            }         
            table.setValueAt(gloomSpawnTime, 24, 4);
            
            // golden thief bug (row 25)
            int gtbDeathTime = Integer.parseInt(table.getValueAt(25, 3).toString());
            String gtbSpawnTime = "";
            if(gtbDeathTime > 2400 || (gtbDeathTime % 100) > 59 || gtbDeathTime < 0) {
            	gtbSpawnTime = "Invalid Input";
            }else {
            	gtbSpawnTime = logeec.calcOneHourMVP(gtbDeathTime);
            }         
            table.setValueAt(gtbSpawnTime, 25, 4);
            
            // gopinich (row 26)
            int gopinichDeathTime = Integer.parseInt(table.getValueAt(26, 3).toString());
            String gopinichSpawnTime = "";
            if(gopinichDeathTime > 2400 || (gopinichDeathTime % 100) > 59 || gopinichDeathTime < 0) {
            	gopinichSpawnTime = "Invalid Input";
            }else {
            	gopinichSpawnTime = logeec.calcTwoHourMVP(gopinichDeathTime);
            }         
            table.setValueAt(gopinichSpawnTime, 26, 4);
            
            // ifrit (row 27)
            int ifritDeathTime = Integer.parseInt(table.getValueAt(27, 3).toString());
            String ifritSpawnTime = "";
            if(ifritDeathTime > 2400 || (ifritDeathTime % 100) > 59 || ifritDeathTime < 0) {
            	ifritSpawnTime = "Invalid Input";
            }else {
            	ifritSpawnTime = logeec.calcOneHourMVP(ifritDeathTime);
            }         
            table.setValueAt(ifritSpawnTime, 27, 4);
            
            // incantation samurai
            
            // kiel D-01 (row 29)
            int kielDeathTime = Integer.parseInt(table.getValueAt(29, 3).toString());
            String kielSpawnTime = "";
            if(kielDeathTime > 2400 || (kielDeathTime % 100) > 59 || kielDeathTime < 0) {
            	kielSpawnTime = "Invalid Input";
            }else {
            	kielSpawnTime = logeec.calcOneHourMVP(kielDeathTime);
            }         
            table.setValueAt(kielSpawnTime, 29, 4);
            
            //  lady tanee (row 30)
            int taneeDeathTime = Integer.parseInt(table.getValueAt(30, 3).toString());
            String taneeSpawnTime = "";
            if(taneeDeathTime > 2400 || (taneeDeathTime % 100) > 59 || taneeDeathTime < 0) {
            	taneeSpawnTime = "Invalid Input";
            }else {
            	taneeSpawnTime = logeec.calcOneHourMVP(taneeDeathTime);
            }         
            table.setValueAt(taneeSpawnTime, 30, 4);
            
            // lady tanee (row 31)
            int lodDeathTime = Integer.parseInt(table.getValueAt(31, 3).toString());
            String lodSpawnTime = "";
            if(lodDeathTime > 2400 || (lodDeathTime % 100) > 59 || lodDeathTime < 0) {
            	lodSpawnTime = "Invalid Input";
            }else {
            	lodSpawnTime = logeec.calcOneHourMVP(lodDeathTime);
            }         
            table.setValueAt(lodSpawnTime, 31, 4);
            
            // maya 1 (row 32)
            int maya1DeathTime = Integer.parseInt(table.getValueAt(32, 3).toString());
            String maya1SpawnTime = "";
            if(maya1DeathTime > 2400 || (maya1DeathTime % 100) > 59 || maya1DeathTime < 0) {
            	maya1SpawnTime = "Invalid Input";
            }else {
            	maya1SpawnTime = logeec.calcOneHourMVP(maya1DeathTime);
            }         
            table.setValueAt(maya1SpawnTime, 32, 4);
            
            // maya 2 (row 33)
            int maya2DeathTime = Integer.parseInt(table.getValueAt(33, 3).toString());
            String maya2SpawnTime = "";
            if(maya2DeathTime > 2400 || (maya2DeathTime % 100) > 59 || maya2DeathTime < 0) {
            	maya2SpawnTime = "Invalid Input";
            }else {
            	maya2SpawnTime = logeec.calcOneHourMVP(maya2DeathTime);
            }         
            table.setValueAt(maya2SpawnTime, 33, 4);
            
            // maya 3 (row 34)
            int maya3DeathTime = Integer.parseInt(table.getValueAt(34, 3).toString());
            String maya3SpawnTime = "";
            if(maya3DeathTime > 2400 || (maya3DeathTime % 100) > 59 || maya3DeathTime < 0) {
            	maya3SpawnTime = "Invalid Input";
            }else {
            	maya3SpawnTime = logeec.calcOneHourMVP(maya3DeathTime);
            }         
            table.setValueAt(maya3SpawnTime, 34, 4);
            
            // mistress (row 35)
            int mistressDeathTime = Integer.parseInt(table.getValueAt(35, 3).toString());
            String mistressSpawnTime = "";
            if(mistressDeathTime > 2400 || (mistressDeathTime % 100) > 59 || mistressDeathTime < 0) {
            	mistressSpawnTime = "Invalid Input";
            }else {
            	mistressSpawnTime = logeec.calcTwoHourMVP(mistressDeathTime);
            }         
            table.setValueAt(mistressSpawnTime, 35, 4);
            
            // moonlight flower (row 36)
            int moonDeathTime = Integer.parseInt(table.getValueAt(36, 3).toString());
            String moonSpawnTime = "";
            if(moonDeathTime > 2400 || (moonDeathTime % 100) > 59 || moonDeathTime < 0) {
            	moonSpawnTime = "Invalid Input";
            }else {
            	moonSpawnTime = logeec.calcOneHourMVP(moonDeathTime);
            }         
            table.setValueAt(moonSpawnTime, 36, 4);
            
            // orc hero 1 (row 37)
            int hero1DeathTime = Integer.parseInt(table.getValueAt(37, 3).toString());
            String hero1SpawnTime = "";
            if(hero1DeathTime > 2400 || (hero1DeathTime % 100) > 59 || hero1DeathTime < 0) {
            	hero1SpawnTime = "Invalid Input";
            }else {
            	hero1SpawnTime = logeec.calcOneHourMVP(hero1DeathTime);
            }         
            table.setValueAt(hero1SpawnTime, 37, 4);
            
            // orc hero 2 (row 38)
            int hero2DeathTime = Integer.parseInt(table.getValueAt(38, 3).toString());
            String hero2SpawnTime = "";
            if(hero2DeathTime > 2400 || (hero2DeathTime % 100) > 59 || hero2DeathTime < 0) {
            	hero2SpawnTime = "Invalid Input";
            }else {
            	hero2SpawnTime = logeec.calcOneHourMVP(hero2DeathTime);
            }         
            table.setValueAt(hero2SpawnTime, 38, 4);
            
            // orc lord (row 39)
            int lordDeathTime = Integer.parseInt(table.getValueAt(39, 3).toString());
            String lordSpawnTime = "";
            if(lordDeathTime > 2400 || (lordDeathTime % 100) > 59 || lordDeathTime < 0) {
            	lordSpawnTime = "Invalid Input";
            }else {
            	lordSpawnTime = logeec.calcTwoHourMVP(lordDeathTime);
            }         
            table.setValueAt(lordSpawnTime, 39, 4);
            
            // osiris (row 40)
            int osirisDeathTime = Integer.parseInt(table.getValueAt(40, 3).toString());
            String osirisSpawnTime = "";
            if(osirisDeathTime > 2400 || (osirisDeathTime % 100) > 59 || osirisDeathTime < 0) {
            	osirisSpawnTime = "Invalid Input";
            }else {
            	osirisSpawnTime = logeec.calcOneHourMVP(osirisDeathTime);
            }         
            table.setValueAt(osirisSpawnTime, 40, 4);
            
            // pharaoh (row 41)
            int pharaohDeathTime = Integer.parseInt(table.getValueAt(41, 3).toString());
            String pharaohSpawnTime = "";
            if(pharaohDeathTime > 2400 || (pharaohDeathTime % 100) > 59 || pharaohDeathTime < 0) {
            	pharaohSpawnTime = "Invalid Input";
            }else {
            	pharaohSpawnTime = logeec.calcOneHourMVP(pharaohDeathTime);
            }         
            table.setValueAt(pharaohSpawnTime, 41, 4);
            
            // phreeoni (row 42)
            int phreeoniDeathTime = Integer.parseInt(table.getValueAt(42, 3).toString());
            String phreeoniSpawnTime = "";
            if(phreeoniDeathTime > 2400 || (phreeoniDeathTime % 100) > 59 || phreeoniDeathTime < 0) {
            	phreeoniSpawnTime = "Invalid Input";
            }else {
            	phreeoniSpawnTime = logeec.calcTwoHourMVP(phreeoniDeathTime);
            }         
            table.setValueAt(phreeoniSpawnTime, 42, 4);
            
            // RSX 0806 (row 43)
            
            // stormy knight (row 44)
            int skDeathTime = Integer.parseInt(table.getValueAt(44, 3).toString());
            String skSpawnTime = "";
            if(skDeathTime > 2400 || (skDeathTime % 100) > 59 || skDeathTime < 0) {
            	skSpawnTime = "Invalid Input";
            }else {
            	skSpawnTime = logeec.calcOneHourMVP(skDeathTime);
            }         
            table.setValueAt(skSpawnTime, 44, 4);
            
            // tao gunka (row 45)
            int taoDeathTime = Integer.parseInt(table.getValueAt(45, 3).toString());
            String taoSpawnTime = "";
            if(taoDeathTime > 2400 || (taoDeathTime % 100) > 59 || taoDeathTime < 0) {
            	taoSpawnTime = "Invalid Input";
            }else {
            	taoSpawnTime = logeec.calcOneHourMVP(taoDeathTime);
            }         
            table.setValueAt(taoSpawnTime, 45, 4);
            
            // turtle general (row 46)
            int tgDeathTime = Integer.parseInt(table.getValueAt(46, 3).toString());
            String tgSpawnTime = "";
            if(tgDeathTime > 2400 || (tgDeathTime % 100) > 59 || tgDeathTime < 0) {
            	tgSpawnTime = "Invalid Input";
            }else {
            	tgSpawnTime = logeec.calcOneHourMVP(tgDeathTime);
            }         
            table.setValueAt(tgSpawnTime, 46, 4);
            
            // valkyrie randgris (row 47)
            int valkDeathTime = Integer.parseInt(table.getValueAt(47, 3).toString());
            String valkSpawnTime = "";
            if(valkDeathTime > 2400 || (valkDeathTime % 100) > 59 || valkDeathTime < 0) {
            	valkSpawnTime = "Invalid Input";
            }else {
            	valkSpawnTime = logeec.calcOneHourMVP(valkDeathTime);
            }         
            table.setValueAt(valkSpawnTime, 47, 4);
            
            // vesper (row 48)
            int vesperDeathTime = Integer.parseInt(table.getValueAt(48, 3).toString());
            String vesperSpawnTime = "";
            if(vesperDeathTime > 2400 || (vesperDeathTime % 100) > 59 || vesperDeathTime < 0) {
            	vesperSpawnTime = "Invalid Input";
            }else {
            	vesperSpawnTime = logeec.calcTwoHourMVP(vesperDeathTime);
            }         
            table.setValueAt(vesperSpawnTime, 48, 4);
            
            // wounded morroc (row 49)
            int morrocDeathTime = Integer.parseInt(table.getValueAt(49, 3).toString());
            String morrocSpawnTime = "";
            if(morrocDeathTime > 2400 || (morrocDeathTime % 100) > 59 || morrocDeathTime < 0) {
            	morrocSpawnTime = "Invalid Input";
            }else {
            	morrocSpawnTime = logeec.calcOneHourMVP(morrocDeathTime);
            }         
            table.setValueAt(morrocSpawnTime, 49, 4);
            
            // egnigem cenia (row 50)
            int egnigemDeathTime = Integer.parseInt(table.getValueAt(50, 3).toString());
            String egnigemSpawnTime = "";
            if(egnigemDeathTime > 2400 || (egnigemDeathTime % 100) > 59 || egnigemDeathTime < 0) {
            	egnigemSpawnTime = "Invalid Input";
            }else {
            	egnigemSpawnTime = logeec.calcTwoHourMVP(egnigemDeathTime);
            }         
            table.setValueAt(egnigemSpawnTime, 50, 4);
        }	
	}
}
