public class Variables {
    private int a;
    private int b = 3;

    public int total() {
        int total = a + b;
        return  total;
    }

    public static void main(String[] args){
        Variables v = new Variables();
        System.out.println(v.total());

    }
}