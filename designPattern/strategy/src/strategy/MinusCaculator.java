package strategy;

public class MinusCaculator extends AbstractCaculator implements ICaculator {
    @Override
    public int caculate(String exp) {
        int[] intArr = split(exp, "-");
        int differ = intArr[0];
        for (int i = 1; i < intArr.length; i++) {
            differ -= intArr[i];
        }
        return differ;
    }
}
