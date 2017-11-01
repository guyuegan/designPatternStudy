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
public class Main {

    public static void main(String[] args){
        String msg = "<script> 大家好:)， 我是敏感字符串，我喜欢看《java从入门到失业》</script>";
        MsgProcessor msgProcessor = new MsgProcessor(msg);
        String result = msgProcessor.processByHand();
        System.out.println(result);
    }

}
