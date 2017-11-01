package proxyByExtendOrPolymerize;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:37 2017/10/22 0022
 * Q    Q: 1784286916
 * </pre>
 */
public class TankPolymerizeProxy {

    private Tank tank;

    public TankPolymerizeProxy() {

    }

    public TankPolymerizeProxy(Tank tank) {
        this.tank = tank;
    }

    public void move(){
        long startTime = System.currentTimeMillis();
        tank.move();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
