            class Student {
	        String name;
	        String race;
	        void displayName() {
	            System.out.println("Student Name: " + name);
	            System.out.println("Student Race: " + race);
	        }
	    }
	    
	   public class main {
	public static void main(String[] args) {
	    
	         Student s1 = null;
	         Student s2 = new Student();
	         s2.name = "Joe";
	         s2.race = "Blasian";
	         // simple error handling is "try{" and "}catch"
	         try {
	              s2.displayName();
	         } catch (Exception e) {
	              System.out.println("Error: Student object is not created");
	         }
	}
	   }
	              	              
