package webFilter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 9:55 2017/10/13 0013
 * Q    Q: 1784286916
 * </pre>
 */
public class WebResponse {

    private String respStr = "response == ";

    public String getRespStr() {
        return respStr;
    }

    public void setRespStr(String respStr) {
        if (respStr.indexOf("response == ") == -1) {
            this.respStr += respStr;
        }else {
            this.respStr = respStr;
        }
    }
}
