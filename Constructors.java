class DefConst {
	DefConst(){
		System.out.print("This is a default constructor\n");
	}
}
class ParamConst {
	ParamConst(int num, String text){
		System.out.print("This parameterize constructor has " + num + " "  + text);
	}
}
class Constructors {

	public static void main(String args[]) {
		DefConst const1 = new DefConst(); 
		ParamConst const2 = new ParamConst(2, "parameters."); 
	}
}
