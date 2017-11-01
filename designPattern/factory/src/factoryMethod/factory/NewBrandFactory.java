package factoryMethod.factory;

import factoryMethod.product.AbstractPhone;
import factoryMethod.product.Meizu;
import factoryMethod.product.NewBrand;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 下午 1:43 2017/10/16 0016
 * Q    Q: 1784286916
 * </pre>
 */
public class NewBrandFactory implements AbstractPhoneFactory{

    @Override
    public AbstractPhone createPhone() {
        return new NewBrand();
    }
}
