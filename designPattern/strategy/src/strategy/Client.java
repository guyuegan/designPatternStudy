package strategy;

public class Client {
    public static void main(String[] args) {
        String exp = "1*2*3*4";
        ICaculator caculator = new MultipleCaculator();
        System.out.println(caculator.caculate(exp));
    }
}
