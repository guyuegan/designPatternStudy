package proxyByExtendOrPolymerize;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:28 2017/10/22 0022
 * Q    Q: 1784286916
 * </pre>
 */
public class TankExtendProxy extends Tank {

    @Override
    public void move(){
        long startTime = System.currentTimeMillis();
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime-startTime);
    }
}
