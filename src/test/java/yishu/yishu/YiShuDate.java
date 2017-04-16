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
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("Year: ").append(year).append(";");
        stringBuffer.append("Month: ").append(month).append(";");
        stringBuffer.append("Day: ").append(day).append(";");
        stringBuffer.append("Hour: ").append(hour).append(";");

        return stringBuffer.toString();
    }
}
