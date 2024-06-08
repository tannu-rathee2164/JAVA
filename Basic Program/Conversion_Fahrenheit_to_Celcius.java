import java.util.*;
public class Conversion_Fahrenheit_to_Celcius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Minimum Fahrenheit value : ");
        int f_Min = sc.nextInt();
        System.out.print("Maximum Fahrenheit value : ");
        int f_Max = sc.nextInt();
        System.out.print("Minimum Fahrenheit value : ");
        int step = sc.nextInt();
        for( int i=f_Min; i <= f_Max ; i = i+step) {
            int c = (int) ((5.0 / 9) * (i - 32));
            System.out.println(i + "\t" + c);
        }
    }
}