package filterChain_V01;

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
}
