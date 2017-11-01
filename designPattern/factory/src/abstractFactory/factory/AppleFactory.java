package abstractFactory.factory;

import abstractFactory.product.AbstractBattery;
import abstractFactory.product.AbstractCpu;
import abstractFactory.product.AbstractScreen;
import abstractFactory.product.impl.SharpScreen;
import abstractFactory.product.impl.IntelCpu;
import abstractFactory.product.impl.SamSungBattery;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:04 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public class AppleFactory implements AbstractPhoneFactory {

    @Override
    public AbstractScreen createScreen() {
        AbstractScreen apple = new SharpScreen();
        apple.setBrand("apple");
        apple.setCpu(this.createCpu());
        apple.setBattery(this.createBattery());
        return apple;
    }

    @Override
    public AbstractCpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public AbstractBattery createBattery() {
        return new SamSungBattery();
    }
}
