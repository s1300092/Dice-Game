import java.util.Random;

class DiceGame{
    public static void main(String[] args){
	Random rand = new Random();
	int a = (rand.nextInt(6) + 1);
	int b = (rand.nextInt(6) + 1);
	System.out.println("Rolling dice...");
	System.out.println("Die 1: " + a);
	System.out.println("Die 2: " + b);
	System.out.println("Total value: " + (a+b));
	if((a+b) > 7){
	    System.out.println("You won.");
	}else{
	    System.out.println("You lost.");
	}
    }
}
