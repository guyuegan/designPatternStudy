package abstractFactory.product.impl;

import abstractFactory.product.AbstractBattery;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:02 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public class SamSungBattery extends AbstractBattery {

    public SamSungBattery() {
    }

    public SamSungBattery(String volume) {
        this.setVolume(volume);
    }

    @Override
    public String toString() {
        return "SamSungBattery{} " + super.toString();
    }
}
