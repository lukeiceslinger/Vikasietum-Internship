package JavaCode;

class DogTestDrive{
    public static void main(String[] args){

        Dog one = new Dog();
        one.size = 70;
        
        Dog two = new Dog();
        two.size = 8;

        Dog three = new Dog();
        three.size = 35;

        one.bark(1);
        two.bark(1);
        three.bark(1);

        
        Dog d = new Dog();
        d.bark(3);
    }
}