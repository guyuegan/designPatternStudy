package abstractFactory.product.impl;

import abstractFactory.product.AbstractBattery;
import abstractFactory.product.AbstractCpu;
import abstractFactory.product.AbstractScreen;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:48 2017/10/17 0017
 * Q    Q: 1784286916
 * </pre>
 */
public class SharpScreen extends AbstractScreen {

    public SharpScreen() {

    }

   public SharpScreen(String size){
        this.setSize(size);
   }

    @Override
    public String toString() {
        return "SharpScreen{} " + super.toString();
    }
}
