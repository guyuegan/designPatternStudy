package abstractFactory.product.impl;

import abstractFactory.product.AbstractCpu;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:54 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public class IntelCpu extends AbstractCpu {

    public IntelCpu() {
    }

    public IntelCpu(String speed) {
        this.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "IntelCpu{} " + super.toString();
    }
}
