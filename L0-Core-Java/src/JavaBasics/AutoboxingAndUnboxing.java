package JavaBasics;

public class AutoboxingAndUnboxing {
    public static void main(String[] args){
        int x1 =10;
        Integer x2 = x1;     //Autoboxing
        int x3 = x2;         //Unboxing
        System.out.println(x1);
        System.out.println(x2);
        System.out.println(x3);
        AutoboxingAndUnboxing test = new AutoboxingAndUnboxing();
        test.checkInCache();
        test.checkNotInCache();
    }

    public void checkInCache(){
        Integer x1 = 4;
        Integer x2 = 4;
        if(x1==x2){
            System.out.println("Same"); // Returns same as both values lie between -128 and 127 (Integer Wrapper Class Cache)
        }
        else {
            System.out.println("Not Same");
        }
    }

    public void checkNotInCache(){
        Integer x1 = 200;
        Integer x2 = 200;
        if(x1==x2){
            System.out.println("Same");
        }
        else {
            System.out.println("Not Same"); // Returns not same as not between Integer Cache values
        }
    }
}


