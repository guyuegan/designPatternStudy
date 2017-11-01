package proxyByExtendOrPolymerize;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:33 2017/10/22 0022
 * Q    Q: 1784286916
 * </pre>
 */
public class Main {

    public static void main(String[] args){
        Movable proxy = new TankExtendProxy();
        proxy.move();
        System.out.println("=========================");

        TankPolymerizeProxy proxy02 = new TankPolymerizeProxy(new Tank());
        proxy02.move();
    }
}
