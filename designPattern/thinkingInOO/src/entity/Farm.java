package entity;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:45 2017/10/18 0018
 * Q    Q: 1784286916
 * </pre>
 */
public class Farm {

    private List<Cow> cowList;

    public Farm() {
        this.cowList = new ArrayList<Cow>();
    }

    public Farm(List<Cow> cowList) {
        this.cowList = cowList;
    }

    public List<Cow> getCowList() {
        return cowList;
    }

    public void setCowList(List<Cow> cowList) {
        this.cowList = cowList;
    }

    public int countTotalCow(){
        return this.cowList.size();
    }

    public void add(Cow cow){
        this.cowList.add(cow);
    }

    public Cow getCow(int index){
        return this.cowList.get(index);
    }
}
