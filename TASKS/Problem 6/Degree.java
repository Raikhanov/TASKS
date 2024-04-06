import java.util.Scanner;
public class Degree{
    public static int degreeCalculate(int a, int n) {
        if (n == 0){
            return 1;
        }
        int k = 1;
        for (int i = 0; i < n; i++){
            k = k * a;
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt();
        int k = degreeCalculate(a,n);
        System.out.println(k);
    }
}

