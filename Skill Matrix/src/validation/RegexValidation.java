package validation;

public class RegexValidation {
	
	public Boolean isValidName(String name) {
		if(name.matches("[a-zA-Z]{5,}")) {
			return true;
		}
		return false;
		
	}
	
	public boolean isValidNumber(String number) {
		if(number.matches("[0-9]{12}")) {
			return true;
		}
		return false;
		
	}
	
	public boolean isvalidIfsc(String ifsc) {
		if(ifsc.matches("[A-Z]{4}[0]{1}[0-9]{6}")) {
			return true;
		}
		return false;
		
	}
	
	public boolean validateChoice(String choice) {
		if(choice.matches("[0-9]")) {
			return true;
		}
		return false;
		
	}

}
