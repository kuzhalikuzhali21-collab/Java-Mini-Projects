import java.util.Scanner;

class Largest {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a>b && a>c)
            System.out.println("A is largest");
        else if(b>c)
            System.out.println("B is largest");
        else
            System.out.println("C is largest");
    }
}
