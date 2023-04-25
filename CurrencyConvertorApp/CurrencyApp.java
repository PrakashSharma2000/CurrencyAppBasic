import java.util.Scanner;

public class CurrencyApp{
public static void main(String[] args) {
    System.out.println("Welcome to Java Currecy App");

    System.out.println("Currently Supports Dollars to Ruppes");

    Scanner sc = new Scanner(System.in);
    
    Float dollar;
    System.out.println("Enter the amount to convert int to Ruppees=");
    dollar = Float.parseFloat(sc.nextLine());

    System.out.println("Your amount in Ruppes is = "+dollar*82.30);
}
}