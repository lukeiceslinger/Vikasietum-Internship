class TestStuff{
    
    void go(){
        TestStuff t = new TestStuff();
        t.takeTwo(12, 34);
    }

    void takeTwo(int x, int y){
        int z = x + y;
        System.out.println("Total is " + z);
    }
}