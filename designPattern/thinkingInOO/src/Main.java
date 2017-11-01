import entity.Cow;
import entity.Farm;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:33 2017/10/18 0018
 * Q    Q: 1784286916
 * </pre>
 */
public class Main {
    public static void main(String[] args){

        Cow cow = new Cow();
        cow.setAge(5);
        Farm myFarm = new Farm();
        myFarm.add(cow);

        for(int year=1; year<20; year++){

            //每年所有牛都长一岁
            for (int n=0; n<myFarm.countTotalCow(); n++) {
                myFarm.getCow(n).grow();
            }

            for(int n=0; n<myFarm.countTotalCow(); n++){
                /**
                 * 这里的c是指向对象的引用，有权利修改对象的值
                 */
                Cow c = myFarm.getCow(n);
                if(c.getAge() >= 5){
                    c.generate(myFarm);
                }
            }
        }
        System.out.println(myFarm.countTotalCow());
    }
}

