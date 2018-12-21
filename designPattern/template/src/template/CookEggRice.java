package template;

import template.CookTemplate;

public class CookEggRice extends CookTemplate {
    @Override
    public void prepare() {
        System.out.println("西红柿裹上鸡蛋，炸制金黄");
    }

    @Override
    public void cooking() {
        System.out.println("鸡蛋、西红柿、隔夜饭，一通乱炒");
    }

    @Override
    public void serve() {
        System.out.println("黑暗料理完成，打包送外卖");
    }
}
