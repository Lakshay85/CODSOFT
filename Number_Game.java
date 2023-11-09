import java.util.*;
public class Number_Game{
    public static void main(String[] args)
    {   
    int i,round,result=0;
    Scanner scn=new Scanner(System.in);
    
    System.out.println("------Welcome to the Number Game------");
    // Loop for the player to play the game multiple times
    do{
    System.out.println("Enter 1 to Star the Game");
    System.out.println("Enter 0 to End the Game");
    round=scn.nextInt();

    switch(round) {
           case 1:

                    Random random = new Random();
                    int number = random.nextInt(100);
                   
                    for(i=3;i>0;i--){ 
                    System.out.println("Guess the Number... ");
                    Scanner sc=new Scanner(System.in);
                    int guessNumber=sc.nextInt();
                    if(number==guessNumber)
                    {
                        System.out.println("Your Guess is Correct...!");
                        result++;
                        break;
                    }else if(number>guessNumber)
                    {
                        if(i>1){
                        System.out.println("Your Guess Number is Low");
                        System.out.println(i-1+" Guess Remaining ");   
                        }
                    }
                    else if(number<guessNumber)
                    {
                        if(i>1){
                            System.out.println("Your Guess Number is High");
                            System.out.println(i-1+" Guess Remaining ");   
                        }
                        
                    }
                    else{
                        System.out.println(i+" Guess Remaining ");   
                    }
                    }

                    if(i==0){
                     System.out.println("All Attempts are Exempted ");
                    System.out.println("The Number is : "+number);
                    }
                    break;

            case 0:
                    System.out.println("Game Ended");
                    System.out.println("Your Score is : "+result);
                    break;
            
            default:
                   System.out.println("Invalid Input");
                   System.out.println("Game Ended");
                   break;
                    
        }
    }
    while(round==1);
                
    }
}
