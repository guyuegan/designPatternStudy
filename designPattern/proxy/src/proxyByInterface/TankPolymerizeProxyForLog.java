package proxyByInterface;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:37 2017/10/22 0022
 * Q    Q: 1784286916
 * </pre>
 */
public class TankPolymerizeProxyForLog implements Movable{

    private Movable m;

    public TankPolymerizeProxyForLog() {

    }

    public TankPolymerizeProxyForLog(Movable m) {
        this.m = m;
    }

    /**
     *  根据接口生成代理
     */
    public void move(){
        System.out.println("log begin...");
        m.move();
        System.out.println("log end...");
    }
}
