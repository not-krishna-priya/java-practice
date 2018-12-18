  class Animal{
	String name;


	public String getName(){
		return name;
	}

	public void setName(String newName){
		name = newName;
	}

	public static void main(String[] args) {
		System.out.println(args[0]);
		System.out.println(args[1]);
		
	}

/*	This compiles. Does not execute.
*   Error: Main method not found in class Animal, please define the main method as:
*   public static void main(String[] args)
*
*	public static void main(String args) {
*		System.out.println(args);
*	}
*/

/*	This compiles. Does not execute.
*	Error: Main method is not static in class Animal, please define the main method as:
*   public static void main(String[] args)
*
*	public void main(String[] args) {
*		System.out.println(args[0]);
*	}
*/


}
