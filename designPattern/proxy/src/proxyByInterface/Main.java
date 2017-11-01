package proxyByInterface;

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
        Movable timeProxy = new TankPolymerizeProxyForTime(new Tank());
        timeProxy.move();
        System.out.println("=========================");

        Movable logProxy = new TankPolymerizeProxyForLog(new Tank());
        logProxy.move();
        System.out.println("=========================");

        Movable logProxy02 = new TankPolymerizeProxyForLog(new TankPolymerizeProxyForTime(new Tank()));
        logProxy02.move();
        System.out.println("=========================");

        Movable timeProxy02 = new TankPolymerizeProxyForTime(new TankPolymerizeProxyForLog(new Tank()));
        timeProxy02.move();
    }
}
