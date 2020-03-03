import java.util.*;
class Prime {
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number to check if it is Prime or not : ");
        int n = in.nextInt();
        int x=0;
        for(int i=2;i<n/2;i++){
            if(n%i == 0) {
                System.out.print("Number is not prime");
                x = 1;
                break;
            }
            x = 0;
        }
        if(x == 0 && n != 1)
            System.out.print("Number is Prime");
		else  System.out.print("Number is not prime");
    }
}
