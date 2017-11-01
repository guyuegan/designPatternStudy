package abstractFactory.product.impl;

import abstractFactory.product.AbstractBattery;
import abstractFactory.product.AbstractCpu;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:47 2017/10/25 0025
 * Q    Q: 1784286916
 * </pre>
 */
public class XiaoMiBattery extends AbstractBattery {

    public XiaoMiBattery() {
    }

    public XiaoMiBattery(String volume) {
        this.setVolume(volume);
    }

    @Override
    public String toString() {
        return "XiaoMiBattery{} " + super.toString();
    }
}
