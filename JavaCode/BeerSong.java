package JavaCode;

public class BeerSong{
    public static void main(String[] args){
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0){
            if(beerNum == 1){
                word = "bottle";
            }
            System.out.print(beerNum + " " + word + " of beer on the wall, ");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.print("Take one down and ");
            System.out.print("Pass it around, ");


            beerNum = beerNum - 1;
            if(beerNum > 0) {
                System.out.print(beerNum + " " + word + " of beer on the wall.\n\n");
            }else{
                System.out.println("No more bottles of beer on the wall\n");
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
            }

            
        }
    }
}