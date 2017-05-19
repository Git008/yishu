package yishu.yishu;

/**
 * Created by victor on 2017/5/6.
 */
public class YiShu
{
    private YiShu()
    {
    }

    public static YiShuOutput process(YiShuDate yiShuDate)
    {
        YiShuOutput output = new YiShuOutput();

        /* 上卦为：（年+月+日）÷8，取余数。 */
        int upSum = yiShuDate.year.getIndex() + yiShuDate.month + yiShuDate.day;
        EightDiagrams up = EightDiagrams.valueOf(upSum % 8);

        /* 下卦为：（年+月+日+时）÷8，取余数。 */
        int allSum = upSum + yiShuDate.hour.getIndex();
        EightDiagrams down = EightDiagrams.valueOf(allSum % 8);

        /* 动爻数为：（年+月+日+时）÷6，取余数。 */
        int dong = allSum % 6;

        output.setUp(up);
        output.setDown(down);
        output.setDong(dong);
        return output;
    }
}
