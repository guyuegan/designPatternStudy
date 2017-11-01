package filterChain_V03.filter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 10:50 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class SensitiveWordFilter
        implements IMsgFilter {

    @Override
    public String doFilter(String msg) {
        //process the sensitive words
        String r = msg.replace("敏感", "不敏感")
                .replace("失业", "就业");
        return r;
    }
}
