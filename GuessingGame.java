public class GuessingGame {
        Player p1;
        Player p2;
        Player p3;

    public void startGame(){
            p1 = new Player();
            p2 = new Player();
            p3 = new Player();

            int p1Guess = 0;
            int p2Guess = 0;
            int p3Guess = 0;

            boolean p1IsRight = false;
            boolean p2IsRight = false;
            boolean p3IsRight = false;

            int targetNumber = (int) (Math.random() * 10);
            System.out.println("I have a number in my mind from 0 - 9, Can you tell?");

            while(true){

                p1.guess();
                p2.guess();
                p3.guess();

                p1Guess = p1.number;
                System.out.println("Number guessed by Player 1 is : " + p1Guess);

                p2Guess = p2.number;
                System.out.println("Number guessed by Player 2 is : " + p2Guess);

                p3Guess = p3.number;
                System.out.println("Number guesses by Player 3 is : " + p3Guess);



                if(p1Guess == targetNumber){
                    p1IsRight = true;
                }

                if(p2Guess == targetNumber){
                    p2IsRight = true;
                }

                if(p3Guess == targetNumber){
                    p3IsRight = true;
                }

                if(p1IsRight|| p2IsRight || p3IsRight){
                    System.out.println("We have a winner!!!");

                    System.out.println("Did Player 1 get it right ? " + p1IsRight);
                    System.out.println("Did Player 2 get it right ? " + p2IsRight);
                    System.out.println("Did Player 3 get it right ? " + p3IsRight);
                    break;
                }else{
        
                    System.out.println("NOOOO, WRONG GUESS!!\n Players will have to guess again!");
                }
            }
        }
}