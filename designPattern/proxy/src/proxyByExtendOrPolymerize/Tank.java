package proxyByExtendOrPolymerize;

import java.util.Random;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 11:30 2017/10/21 0021
 * Q    Q: 1784286916
 * </pre>
 */
public class Tank implements Movable {

    @Override
    public void move() {
        System.out.println("tank is moving...");
        try {
            Thread.sleep(new Random().nextInt(10000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
