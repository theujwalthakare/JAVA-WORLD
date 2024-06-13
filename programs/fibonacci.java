import java.util.*;
public class fibonacci {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        int n1=0,n2=1,n3,i;
        System.out.println("Enter limit of number :- ");
        int ch = s1.nextInt();
        System.out.print(n1+" "+n2);
        for(i=2;i<ch;++i){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
    
}
