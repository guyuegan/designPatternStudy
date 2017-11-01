package webFilter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:54 2017/10/13 0013
 * Q    Q: 1784286916
 * </pre>
 */
public class WebRequest {

    private String reqStr = "request == ";

    public String getReqStr() {
        return reqStr;
    }

    public void setReqStr(String reqStr) {
        if(reqStr.indexOf("request == ") == -1) {
            this.reqStr += reqStr;
        }else {
            this.reqStr = reqStr;
        }
    }
}
