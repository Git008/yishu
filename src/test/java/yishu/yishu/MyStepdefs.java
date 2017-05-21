package yishu.yishu;

import cucumber.api.DataTable;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;
import gherkin.formatter.model.DataTableRow;
import org.junit.Assert;
import sun.security.util.PendingException;

import java.util.List;

/**
 * Created by victor on 2017/3/29.
 */
public class MyStepdefs
{
    YiShuDate input;
    YiShuOutput ouput;

    @假设("^年月日时$")
    public void 年月日时(List<YiShuDate> YiShuDates) throws Throwable
    {
        for (YiShuDate yishuDate : YiShuDates)
        {
            input = yishuDate;
        }
    }

    @当("^算卦$")
    public void 算卦() throws Throwable
    {
        ouput = YiShu.process(input);
    }

    @那么("^本卦互卦变卦$")
    public void 本卦互卦变卦(List<YiShuOutput> YiShuOutputs) throws Throwable {
        for (YiShuOutput yishuOutput : YiShuOutputs)
        {
            Assert.assertEquals(ouput, yishuOutput);
        }
    }
}
