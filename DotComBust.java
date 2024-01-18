import java.util.ArrayList;
import java.util.stream.StreamSupport;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComList =  new ArrayList<DotCom>();
    private int numOfGuesses = 0;


    private void setUpGame(){

        DotCom one = new DotCom();
        one.setName("Pets.com");

        DotCom two = new DotCom();
        two.setName("eToys.com");

        DotCom three = new DotCom();
        three.setName("Go2.com");

        dotComList.add(one);
        dotComList.add(two);
        dotComList.add(three);

        System.out.println("Your goal is to sink three dot coms.");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Try to sink them all in the fewest number of guesses");

        for(DotCom dotComTpoSet : dotComList){
            ArrayList<String> newLocations = helper.placeDotCom(3);
            dotComTpoSet.setLocationCells( newLocations);
        }
    }

    private void startPlaying(){
        while(!dotComList.isEmpty()){
            String userGuess = helper.getUserInput("\n Enter a guess");
            checkUserGuess(userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){
        numOfGuesses++;
        String result = "miss";

        for(DotCom dotComToTest : dotComList){

            result = dotComToTest.checkYourself(userGuess);
            System.out.print(result);

            if(result.equals("hit")){
                break;
            }

            if(result.equals("kill")){
                dotComList.remove(dotComToTest);
                break;
            }

            System.out.print("\n");
        }
    }


    private void finishGame(){

        System.out.println("All Dot Coms are dead! Your stock is now worthless.");

        if(numOfGuesses <= 18) {
            System.out.println("It only took you " + numOfGuesses + " guesses.");
            System.out.println("You got out before your options sank.");
        }else{
            System.out.println("Took you long enough. " + numOfGuesses + " guesses");
            System.out.println("Fish are dancing with your options.");
        }
    }

    public static void main(String[] args){
        DotComBust game = new DotComBust();
        game.setUpGame();
        game.startPlaying();
    }
}
