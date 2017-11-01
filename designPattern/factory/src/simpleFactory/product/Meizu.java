package simpleFactory.product;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:16 2017/10/16 0016
 * Q    Q: 1784286916
 * </pre>
 */
public class Meizu {

    private String brand = "meizu";

    public Meizu(){

    }

    public Meizu(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Meizu{" +
                "brand='" + brand + '\'' +
                '}';
    }
}
