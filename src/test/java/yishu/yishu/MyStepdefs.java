package yishu.yishu;

import cucumber.api.DataTable;
import cucumber.api.java.zh_cn.假设;
import cucumber.api.java.zh_cn.当;
import cucumber.api.java.zh_cn.那么;

/**
 * Created by Git008 on 2017/3/29.
 */
public class MyStepdefs
{
    @假设("^年月日时$")
    public void 年月日时(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
        System.out.println(arg1);
    }

    @当("^算卦$")
    public void 算卦() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    }

    @那么("^上挂下挂动爻$")
    public void 上挂下挂动爻(DataTable arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc)
    }
}
