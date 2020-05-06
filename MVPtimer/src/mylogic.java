
public class mylogic {

	public String calcAmonRa (int arg) {
		arg += 100;
		if(arg > 2400) {
			arg -= 2400;
			return "0" + Integer.toString(arg);
		}			
		return Integer.toString(arg);
		
	}

	public int calcAtroce1(int arg) {
		
		return arg + 10;
	}
	
}
