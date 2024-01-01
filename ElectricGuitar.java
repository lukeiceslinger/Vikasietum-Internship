class ElectricGuitar{
    String brand;
    int numOfPickups;
    boolean rockStarUsesIt;

    String getBrand(){
        return brand;
    }

    void setBrand(String aBrand){
        brand = aBrand;
    }

    int getNumOfPickups(){
        return numOfPickups;
    }

    void setNumOfPickups(int num){
        numOfPickups = num;
    }

    boolean getrockStarUsesIt(){
        return rockStarUsesIt;
    }

    void setRockStarUsesIt(boolean yesOrNo){
        rockStarUsesIt = yesOrNo;
    }



    public static void main(String[] args){

        ElectricGuitar EG = new ElectricGuitar();
        EG.setBrand("Rock'n'Roll");
        EG.setNumOfPickups(5);
        EG.setRockStarUsesIt(true);

        ElectricGuitar EG1 = new ElectricGuitar();
        EG1.setBrand("Granada");
        EG1.setNumOfPickups(2);
        EG1.setRockStarUsesIt(false);

        ElectricGuitar EG2 = new ElectricGuitar();
        EG2.setBrand("Kaps");
        EG2.setNumOfPickups(1);
        EG2.setRockStarUsesIt(true);

        ElectricGuitar EG3 = new ElectricGuitar();
        EG3.setBrand("Yamaha");
        EG3.setNumOfPickups(20);
        EG3.setRockStarUsesIt(true);

        ElectricGuitar[] allGuitars = new ElectricGuitar[4];

        allGuitars[0] = EG;
        allGuitars[1] = EG1;
        allGuitars[2] = EG2;
        allGuitars[3] = EG3;

        int x =0;

        while(x < allGuitars.length){
            System.out.println("Brand : " + allGuitars[x].getBrand());
            System.out.println("Number of Pickups used : " + allGuitars[x].getNumOfPickups());
            System.out.println("Rock star uses it : " + allGuitars[x].getrockStarUsesIt() + "\n");

            x += 1;
        }
        
    }
}