class Arrays{
    public static void main(String[] args){
        int[] nums;
        nums = new int[7];

        nums[0] = 6;
        nums[1] = 19;
        nums[2] = 44;
        nums[3] = 42;
        nums[4] = 10;
        nums[5] = 20;
        nums[6] = 1;


        Dog[] pets = new Dog[7];

        pets[0] = new Dog();
        pets[1] = new Dog();

        Dog fido = new Dog();
        fido.name = "Fido";

        fido.bark();
        fido.chaseCat();




        Dog[] myDog = new Dog[3];

        myDog[0] = new Dog();
        myDog[0].name = "fido";
        myDog[0].bark();




    }
}