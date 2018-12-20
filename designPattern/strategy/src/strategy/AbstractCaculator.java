package strategy;

public abstract class AbstractCaculator {
    public int[] split(String exp, String opt) {
        String[] strArr = exp.split(opt);
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
}
