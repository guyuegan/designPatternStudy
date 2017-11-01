package filterChain_V02;

import filterChain_V02.filter.EmojiFilter;
import filterChain_V02.filter.HtmlTagFilter;
import filterChain_V02.filter.IMsgFilter;
import filterChain_V02.filter.SensitiveWordFilter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:06 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class MsgProcessor {

    private String msg;

    /**
     * filterChain的好处：可以调整过滤器的过滤顺序，可以灵活添加、删除过滤器
     */
    private IMsgFilter[] filterChain = new IMsgFilter[]{
                            new HtmlTagFilter(),
                            new SensitiveWordFilter(),
                            new EmojiFilter()
                        };

    public MsgProcessor(){

    }

    public MsgProcessor(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    /**
     * 这种处理方法的缺点：每添加一个过滤需求，就要在方法中添加实现
     * @return
     */
    public String processByHand(){
        //process the html tag <>
        String r = msg.replaceAll("<", "[")
                      .replace(">", "]");

        //process the sensitive words
        r = r.replace("敏感", "不敏感")
             .replace("失业", "就业");

        return r;
    }

    /**
     * 过滤链处理的优点：添加、删除、修改过滤需求灵活
     * @return
     */
    public String processByFilter(){
        String r = msg;
        //根据数组元素顺序，先调用HtmlTagFilter，再调用SensitiveWordFilter
        for(IMsgFilter f : filterChain){
            r = f.doFilter(r); //将每个过滤其过滤后的结果保存，作为下一个过滤器的参数
        }
        return r;
    }
}
