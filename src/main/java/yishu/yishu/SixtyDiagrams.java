package yishu.yishu;

import static yishu.yishu.EightDiagrams.*;

/**
 * Created by victor on 2017/5/20.
 */
public enum SixtyDiagrams
{
    /* 乾、兌、离、震、巽、坎、艮、坤 */

    /* 乾 */

    /* 天风姤 */
    TIAN_FENG_GOU(QIAN, XUN ),

    /* 兌 */
    /* 泽火革 */
    ZE_HUO_GE(DUI, LI),
    /* 泽山咸 */
    ZE_SHAN_XIAN(DUI, GEN),

    /* 离 */

    /* 震 */

    /* 巽 */

    /* 坎 */

    /* 坤 */
    KUN_WEI_DI(KUN, KUN);

    private EightDiagrams up;
    private EightDiagrams down;

    private SixtyDiagrams(EightDiagrams upDiagrams, EightDiagrams downDiagrams)
    {
        up = upDiagrams;
        down = downDiagrams;
    }
}
