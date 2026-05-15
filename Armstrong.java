import java.util.Scanner;

class Armstrong {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, temp, rem, sum=0;

        System.out.println("Enter number:");
        n = sc.nextInt();

        temp = n;

        while(n>0) {
            rem = n % 10;
            sum = sum + (rem*rem*rem);
            n = n / 10;
        }

        if(temp == sum)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not Armstrong");
    }
}
