class ConstructorExecutionOrder{
	public static void main(String args[]){
		childclass s = new childclass();
	}
}
class parentclass{
	parentclass(){
		System.out.println("I am Parrent class Constructor");
	}
}
class childclass extends parentclass{
	childclass(){
		System.out.println("I am Child Class Constructor");
	}
}