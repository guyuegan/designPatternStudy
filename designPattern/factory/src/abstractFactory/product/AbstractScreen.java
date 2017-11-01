package abstractFactory.product;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:30 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public abstract class AbstractScreen {

    private String size;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "AbstractScreen{" +
                "size='" + size + '\'' +
                '}';
    }
}
