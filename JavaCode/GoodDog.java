package JavaCode;

public class GoodDog {
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    String bark(){
        if(size > 60){
            return "Woof! Woof!";
        }else if(size > 14){
           return "Ruff! Ruff!";
        }else{
            return "Yipp! Yipp!";
        }
    }




}
