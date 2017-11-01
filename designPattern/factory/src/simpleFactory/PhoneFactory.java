package simpleFactory;

import simpleFactory.product.Apple;
import simpleFactory.product.Meizu;
import simpleFactory.product.NewBrand;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 10:59 2099/1/1 0001
 * Q    Q: 1784286916
 * </pre>
 */
public class PhoneFactory {

    public Object createPhone(String brand){
        switch(brand){

            case "apple":
                return new Apple();

            case "meizu":
                return new Meizu();

            case "newbrand":
                return new NewBrand();

            default:
                return null;
        }
    }

}
