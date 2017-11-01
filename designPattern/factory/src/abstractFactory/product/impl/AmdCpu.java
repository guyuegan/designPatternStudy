package abstractFactory.product.impl;

import abstractFactory.product.AbstractCpu;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:44 2017/10/25 0025
 * Q    Q: 1784286916
 * </pre>
 */
public class AmdCpu extends AbstractCpu {

    public AmdCpu() {
    }

    public AmdCpu(String speed) {
        this.setSpeed(speed);
    }

    @Override
    public String toString() {
        return "AmdCpu{} " + super.toString();
    }
}
