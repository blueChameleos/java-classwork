package intro;

public class CodingConventions 
{
	//FIELDS ARE AT THE TOP
	
	private String name; //n.b: DECLARE FIELDS ONLY, INSTANTIATE IN THE CONSTRUCTOR
	private String description;
	
	public CodingConventions(String name, int descriptionIndex) //a constructor which returns a class. Must always be named after the class
	{
		//instantiate variables now:
		//there are two variables called "name": the local variable and the field
		//distinguish between the two using the reserved word "this" (field)
		this.name = name;
		description = IntroMain.DESCRIPTIONS[descriptionIndex]; //static call to a constant

	}
	
	
	public void doStuff() //normal method "void", where void is the return type
	{
		//static method call
		String output = name + description; 
		System.out.println(output);
	}	
}
