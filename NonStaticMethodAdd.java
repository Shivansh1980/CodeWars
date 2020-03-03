import java.util.*;
class NonStaticMethodAdd{
	public int add(int a,int b){
		return(a+b);		
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Two Numbers : ");
		int a = in.nextInt();
		int b = in.nextInt();
		NonStaticMethodAdd obj = new NonStaticMethodAdd();
		System.out.print("Sum is : "+obj.add(a,b));
	}
}