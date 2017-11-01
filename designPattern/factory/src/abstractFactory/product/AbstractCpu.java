package abstractFactory.product;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:37 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public abstract class AbstractCpu {

    private String speed;

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "AbstractCpu{" +
                "speed='" + speed + '\'' +
                '}';
    }
}
