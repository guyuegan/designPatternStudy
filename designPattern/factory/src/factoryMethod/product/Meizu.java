package factoryMethod.product;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:16 2017/10/16 0016
 * Q    Q: 1784286916
 * </pre>
 */
public class Meizu extends AbstractPhone{

    public Meizu(){
        this.setBrand("meizu");
    }

    public Meizu(String brand) {
        this.setBrand(brand);
    }

    @Override
    public String toString() {
        return "Meizu{" +
                "brand='" + this.getBrand() + '\'' +
                '}';
    }
}
