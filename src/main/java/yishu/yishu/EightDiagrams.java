package yishu.yishu;

/**
 * Created by victor on 2017/5/6.
 */
public enum EightDiagrams
{
    QIAN(1),     /* 乾 */
    DUI(2),      /* 兑 */
    LI(3),       /* 离 */
    ZHEN(4),     /* 震 */
    XUN(5),      /* 巽 */
    KAN(6),      /* 坎 */
    GEN(7),      /* 艮 */
    KUN(8);     /* 坤 */

    private int index;

    private EightDiagrams(int i)
    {
        index = i;
    }

    public static EightDiagrams valueOf(int i)
    {
        for (EightDiagrams dia : values())
        {
            if (dia.getIndex() == i)
            {
                return dia;
            }
        }

        throw new IllegalArgumentException("No Such Enum " + i);
    }

    public int getIndex()
    {
        return index;
    }
}
