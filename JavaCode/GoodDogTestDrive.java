package JavaCode;

import java.util.Random;
import java.util.Scanner;

public class GoodDogTestDrive {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        GoodDog oreo = new GoodDog();
        System.out.print("Enter Size of Oreo : ");
        int oreoSize = sc.nextInt();
        oreo.setSize(oreoSize);

        GoodDog trippy = new GoodDog();
        System.out.print("Enter size of trippy : ");
        int trippySize = sc.nextInt();
        trippy.setSize(trippySize);

        GoodDog[] pets = new GoodDog[7];

        Random random = new Random();

        for(int i = 0; i < pets.length; i++){
            pets[i] = new GoodDog();

            int randomSize = random.nextInt(100) +1;

            pets[i].setSize(randomSize);
        }

        for(int i = 0; i < pets.length; i++){
            System.out.println("Array Pet " + i + " size is : " + pets[i].getSize());
        }



        System.out.println("Good Dog Oreo : " + oreo.getSize());
        System.out.println("Good Dog trippy:" + trippy.getSize());

        System.out.println("Oreo says : " + oreo.bark());
        System.out.println("Oreo says : " + trippy.bark());

        sc.close();
    }
}
