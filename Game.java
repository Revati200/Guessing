import java.util.Scanner;
import java.util.Random;
class Game{
    public static void main(String args[]){
        Scanner reader = new Scanner (System.in);
        String play="yes";

        while(play.equals("yes")){
         Random rand=new Random();
         int randNum =rand.nextInt(100);
         int guess=-1;
         int tries=0;

         while(guess !=randNum){
            System.out.println("Guess a number between 1 to 100");
            guess=reader.nextInt();
            tries++;
            if(guess==randNum){
                System.out.println("Great !You guessed the number!!!");
                System.out.println("It only took you"+tries+ "guesses!!");
                System.out.println("Would you like to play again Yes or No");
                play=reader.next().toLowerCase();
            }else if(guess> randNum){
                System.out.println("You guess is too high, Try again.");
            }else {
                System.out.println("You guess is too low.Try again.");
            }

            }
         }
         reader.close();
        }
        
    }
