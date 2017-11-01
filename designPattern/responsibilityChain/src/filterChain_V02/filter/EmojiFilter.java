package filterChain_V02.filter;

/**
 * <pre>
 * 功    能: $comment$
 * 涉及版本:
 * 创 建 者: 古粤赣
 * 日    期: 上午 11:22 2017/10/12 0012
 * Q    Q: 1784286916
 * </pre>
 */
public class EmojiFilter
        implements IMsgFilter {

    @Override
    public String doFilter(String msg) {
        String r = msg.replace(":)", "（=^_^=）");
        return r;
    }
}
