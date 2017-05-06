package yishu.yishu;

/**
 * Created by victor on 2017/4/9.
 */
public class YiShuDate
{
    public DIZHI year;
    public Integer month;
    public Integer day;
    public DIZHI hour;

    @Override
    public String toString()
    {
        return "YiShuDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                ", hour=" + hour +
                '}';
    }
}
