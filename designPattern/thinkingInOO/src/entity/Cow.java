package entity;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:29 2017/10/18 0018
 * Q    Q: 1784286916
 * </pre>
 */
public class Cow {

    private int age = 1;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void generate(Farm farm){
        farm.add(new Cow());
    }

    public void grow(){
        this.setAge(this.getAge() + 1);
    }
}
