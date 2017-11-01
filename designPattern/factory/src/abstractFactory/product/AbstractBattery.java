package abstractFactory.product;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:45 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public abstract class AbstractBattery {

    private String volume;

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "AbstractBattery{" +
                "volume='" + volume + '\'' +
                '}';
    }
}
