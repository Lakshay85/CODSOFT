import java.util.*;
class Student_Grade_Calculator{
  
    public static void main(String[] args)
    {
        System.out.println("---------Welcome to the Student Grade Calculator----------");
        int count=0;
        // Run a loop in case Wrong Marks entered
        do{
        // Take Marks of Students
        Scanner scn=new Scanner(System.in);
        System.out.println("Enter Marks you obtain(out of 100) of each Subject");
        System.out.println("English");
        count=0;
        int english=scn.nextInt();
        if(english>100 || english< 0)
        {
        System.out.println("Invalid Marks");
        count++;
        continue;
        }

        System.out.println("Hindi");
        int hindi=scn.nextInt();
        if(hindi>100 || hindi< 0)
        {
        System.out.println("Invalid Marks");
        count++;
        continue;
        }

        System.out.println("Maths");
        int maths=scn.nextInt();
        if(maths>100 || maths< 0)
        {
        System.out.println("Invalid Marks");
        count++;
        continue;
        }

        System.out.println("Science");
        int science=scn.nextInt();
        if(science>100 || science< 0)
        {
        System.out.println("Invalid Marks");
        count++;
        continue;
        }

        System.out.println("Social Science");
        int socialScience=scn.nextInt();
        if(socialScience>100 || socialScience< 0)
        {
        System.out.println("Invalid Marks");
        count++;
        continue;
        }

        int totalMarks=english+hindi+maths+science+socialScience;
       
        System.out.println("Your Total Marks is : "+totalMarks);
        // Calculate Average Percentage
        int averagePercentage=totalMarks/5;

        if(averagePercentage>90)
        System.out.println("Your Average Grade is "+"S");
        else if(averagePercentage>80)
        System.out.println("Your Average Grade is "+"A");
        else if(averagePercentage>70)
        System.out.println("Your Average Grade is "+"B");
        else if(averagePercentage>60)
        System.out.println("Your Average Grade is "+"C");
        else if(averagePercentage>50)
        System.out.println("Your Average Grade is "+"D");
        else if(averagePercentage>40)
        System.out.println("Your Average Grade is "+"E");
        else
        System.out.println("Your Average Grade is "+"F");
         }
        while(count>0);
    }
}