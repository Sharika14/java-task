import java.util.Random;
import java.util.Scanner;
public class Main
{

private static int w;
public static void main(String[] args)
{
System.out.println("Let's Play Number Game\n");
System.out.println("Enter Your Beautiful Name: \n");

Scanner sc = new Scanner(System.in);

String s = sc.nextLine();

System.out.println("Hello " + s);

String sp;
boolean flag = true;
w = 0;

do
{
System.out.println("\n Select your option: \n\n1. Start\n2. Exit\n");
sp = sc.next();

switch(sp)
{
case "1":

game(sc, flag);

System.out.println("\n\nDo you want to play again?: \n\n1. Yes\n2. No\n");
String choice = sc.next();

while(choice.equals("1"))
{
game(sc, flag);
System.out.println("\n\nDo you want to play again?: \n\n1. Yes\n2. No\n");

choice = sc.next();
}

System.out.println("Congradulations!! - You have Won " + w + " Round(s)*");

flag = false;

break;

case "2":

System.out.println("Didn't make it, Try again");
flag = false;
break;

default:

System.err.println("Invalid Input, Please Enter Again!");
break;
}

}while(flag);

}

public static void game(Scanner sc, boolean flag)
{
Random r = new Random();
int val = r.nextInt(101);
System.out.println("Let's get started!");

int c = 10;
int guess;

while(c > 0)
{
System.out.println("\nChances Left: " + c);
System.out.println(" Enter Your Guess: ");

guess = sc.nextInt();

if(guess > val)
{
System.out.println("Enter a Lower Value!!!\n");

}else if(guess < val)
{
System.out.println("Enter a Higher Value!!!\n");

}else
{
System.out.println("Congratulations You Won*");
w++;
flag = false;
break;
}

c -= 1;
}

if(flag)
{
System.out.println("\nRandom Value = " + val);
System.out.println("\n**Game Over, You didn't win this time*");
flag = false;
}

}

}
