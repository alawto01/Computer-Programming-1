
public class PropertiesAndBehaviors {

	static String name; 
	static String age; 
	static String breed; 
	static String size; 
	
	static void barking() {
		System.out.print(name + " is Barking!\n");
	}
	static void eating() {
		System.out.print(name + " is Eating!\n");
	}
	static void sleeping() {
		System.out.print(name + " is Sleeping!\n");
	}
	static void walking() {
		System.out.print(name + " is Walking!\n");
	}
	static void getDog() {
		System.out.print(name + " is a " + age + " year old, "+ size + " " + breed + "\n");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name = "Tiny"; 
		age = "4"; 
		breed = "pitbull"; 
		size = "large";
		
		getDog(); 
		barking(); 
		eating(); 
		sleeping(); 
		walking(); 
	}

}
