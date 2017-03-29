package yishu.yishu;

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by Git008 on 2017/3/29.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty"}, features={"src/test/resources"})
public class YiShuTest
{
}
