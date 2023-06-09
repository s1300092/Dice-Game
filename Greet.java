import java.util.Scanner;
import java.util.Random;

class Greet{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	Random rand = new Random();
	int a = (rand.nextInt(6) + 1);
	int b = (rand.nextInt(6) + 1);
	System.out.println("What is your name?");
	System.out.print("> ");
	String name = sc.next();
	System.out.println("Hello, " + name + "!");
	System.out.println("Rolling the dice...");
	System.out.println("Die 1: " + a);
	System.out.println("Die 2: " + b);
	System.out.println("Total value: " + (a+b));
    }
}
