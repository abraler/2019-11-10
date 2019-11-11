import java.util.Scanner;
public class Main{
    public static void main(String []args){
        Scanner in=new Scanner(System.in);
        int i=0;
        int []a=new int[4];
        while(i<4){
            a[i]=in.nextInt();
            i++;
        }
        int A=(a[0]+a[2])/2;//A
        int B=(a[1]+a[3])/2;//B
        int C=B-a[1];
        System.out.print(A);
        System.out.print(" ");
        System.out.print(B);
        System.out.print(" ");
        System.out.print(C);
    }
}