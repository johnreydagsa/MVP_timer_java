
public class mylogic {
	
	public boolean singleDigit(int number) {
		
		if(number >= 0 && number <10) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean doubleDigit(int number) {
		
		if(number >= 10 && number <100) {
			return true;
		}else {
			return false;
		}		
	}
	
	public boolean tripleDigit(int number) {
		
		if(number >= 100 && number <1000) {
			return true;
		}else {
			return false;
		}		
	}

	public String calcOneHourMVP (int arg) {
		
		if(arg >= 2301) {
			arg += 100;
			arg -= 2400;
			
			if(singleDigit(arg)) {
				return "00:0" + Integer.toString(arg);
			}else if(doubleDigit(arg)){
				return "00:" + Integer.toString(arg);
			}else{
				String newArg0 = Integer.toString(arg);
				
				return "0" + newArg0.substring(0, 1)+ ":" + newArg0.substring(1);
			}
			
		}else {
			arg += 100;
			if(arg < 1000) {
				String newArg1 = Integer.toString(arg);
				
				return "0" + newArg1.substring(0, 1) + ":" + newArg1.substring(1);
			}
			String newArg = Integer.toString(arg);
			newArg = newArg.substring(0, 2) + ":" + newArg.substring(2);
			
			return newArg;
		}		
	}

	public String calcTwoHourMVP(int arg) {
		
		if(arg >= 2201) {
			arg += 200;
			arg -= 2400;
			
			if(singleDigit(arg)) {
				return "00:0" + Integer.toString(arg);
			}else if(doubleDigit(arg)){
				return "00:" + Integer.toString(arg);
			}else{
				String newArg0 = Integer.toString(arg);
				
				return "0" + newArg0.substring(0, 1)+ ":" + newArg0.substring(1);
			}
			
		}else {
			arg += 200;
			if(arg < 1000) {
				String newArg1 = Integer.toString(arg);
				
				return "0" + newArg1.substring(0, 1) + ":" + newArg1.substring(1);
			}
			String newArg = Integer.toString(arg);
			newArg = newArg.substring(0, 2) + ":" + newArg.substring(2);
			
			return newArg;
		}	
	}
	
}

