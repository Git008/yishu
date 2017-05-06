package yishu.yishu;

/**
 * Created by victor on 2017/4/9.
 */
public enum DIZHI
{
    ZI(1),     /* 子 */
    CHOU(2),   /* 丑 */
    YIN(3),    /* 寅 */
    MAO(4),    /* 卯 */
    CHEN(5),   /* 辰 */
    SI(6),     /* 巳 */
    WU(7),     /* 午 */
    WEI(8),    /* 未 */
    SHEN(9),   /* 申 */
    YOU(10),    /* 酉 */
    XU(11),     /* 戌 */
    HAI(12);     /* 亥 */

    private int index;

    private DIZHI(int i)
    {
        index = i;
    }

    public int getIndex()
    {
        return index;
    }
}
