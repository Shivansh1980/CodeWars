import java.util.*;
class Pallindrome {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x,sum=0 , temp;
        temp = n;
        while(n>0){
            x = n%10;
            sum = (sum*10)+x;
            n = n/10;
        }
        if(temp == sum)
            System.out.println("Pallindrome Number");
        else
            System.out.println("Not a Pallindrome Number");
    }
}
