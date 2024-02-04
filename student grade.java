import java.util.Scanner;
public class Studentgradegenerator {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.println("\nSTUDENT GRADE GENERATOR");

System.out.println("Enter your name:");

String s = sc.nextLine();

int n= 0;

System.out.println("Enter total no of Subjects:");

n= sc.nextInt();

int[] mark= new int[n];

for(int i = 0; i< mark.length; i++)

{

System.out.println("\nEnter your mark for Subject " + (i+ 1) + ":");

mark[i] = sc.nextInt();


while(mark[i] < 0 || mark[i] > 100)

{

System.out.println("\nEnter your mark for Subject " + (i + 1) + ":");

mark[i] = sc.nextInt();

}

}


int total = 0;

double avg = 0.0;

String grade = "";


for(int i= 0; i < mark.length; i++)

{

total += mark[i];

}


avg= total/n;


if(avg >= 80)

{

grade = "A";

}else if(avg>= 70 && avg < 80)

{

grade = "B";

}else if(avg >= 60 && avg < 70)

{

grade = "C";

}else if(avg >= 50 && avg < 60)

{

grade = "D";

}else if(avg >= 40 && avg < 50)

{

grade = "E";

}else if(avg >= 30 && avg < 40)

{

grade = "F";

}else

{

grade = "FF";

}



System.out.printf("\n\nStudent Name: %s\nTotal Subjects: %d\nTotal Mark: %d\nAverage Mark: %.2f\nGrade: %s",

s,n,total,avg,grade);


}


}
