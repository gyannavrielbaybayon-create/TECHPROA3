//Part 2
class PasswordException extends Exception {
    public PasswordException(String message) {
        super(message);
    }
}

public class Q3Sw7partB {
	 static void checkPassword(String password) throws PasswordException{
		if (password.length() < 8){
		    throw new PasswordException("Password must be 8 characters long");
		}else{
		    System.out.println("Password accepted");
		}
	}
	public static void main(String[]args) {
		try{
		    checkPassword("Gigatron"); 
		}catch(PasswordException e) {
		    System.out.println("Error: " + e.getMessage());
		}
	}
}
