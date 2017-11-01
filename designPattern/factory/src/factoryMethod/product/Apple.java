package factoryMethod.product;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:15 2017/10/16 0016
 * Q    Q: 1784286916
 * </pre>
 */
public class Apple extends AbstractPhone{

    public Apple(){
        this.setBrand("apple");
    }

    public Apple(String brand) {
        this.setBrand(brand);
    }

    @Override
    public String toString() {
        return "SharpScreen{" +
                "brand='" + this.getBrand() + '\'' +
                '}';
    }
}
