class Dog{
    String name;
    int size;

    public static void main(String[] args){
        Dog dog1 = new Dog();
        dog1.bark(1);
        dog1.name = "Bart";

        Dog[] myDogs = new Dog[3];

        myDogs[0] = new Dog();
        myDogs[1] = new Dog();
        myDogs[2] = dog1;


        myDogs[0].name = "Fred";
        myDogs[1].name = "Marge";

        System.out.print("Last dog's name is ");
        System.out.println(myDogs[2].name);

        int x = 0;

        while(x < myDogs.length){
            myDogs[x].bark(1);
            x += 1;
        }
    }

    void bark(int numOfBarks){
        while(numOfBarks > 0){

        if(size > 60){
            System.out.println("Woof! Woof!");
        }else if(size > 14) {
            System.out.println("Ruff! Ruff!");
        }else{
            System.out.println("Yip! Yip!");
        }
        numOfBarks -= 1;
    }

    }

    void chaseCat(){
        System.out.println(name + " is chasing cats!");
    }

    void eat(){
        System.out.println(name + " is eating.");
    }
}