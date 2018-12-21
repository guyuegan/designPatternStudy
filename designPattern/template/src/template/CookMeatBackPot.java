package template;

public class CookMeatBackPot extends CookTemplate {
    @Override
    public void prepare() {
        System.out.println("将吃剩的肉挑出");
    }

    @Override
    public void cooking() {
        System.out.println("剩肉加上葱姜蒜，爆炒至发黑");
    }

    @Override
    public void serve() {
        System.out.println("黑暗料理完成，打包送外卖");
    }
}
