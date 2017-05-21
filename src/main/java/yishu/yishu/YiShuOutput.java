package yishu.yishu;

/**
 * Created by victor on 2017/5/6.
 */
public class YiShuOutput
{
    private SixtyDiagrams ben;
    private SixtyDiagrams hu;
    private SixtyDiagrams bian;

    public YiShuOutput()
    {

    }

    public void setBen(SixtyDiagrams ben)
    {
        this.ben = ben;
    }

    public SixtyDiagrams getBen()
    {

        return ben;
    }

    public void setHu(SixtyDiagrams hu)
    {
        this.hu = hu;
    }

    public SixtyDiagrams getHu()
    {
        return hu;
    }

    public SixtyDiagrams getBian()
    {
        return bian;
    }

    public void setBian(SixtyDiagrams bian)
    {
        this.bian = bian;
    }

    @Override
    public String toString()
    {
        return "YiShuOutput{" +
                "ben=" + ben +
                ", hu=" + hu +
                ", bian=" + bian +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YiShuOutput that = (YiShuOutput) o;

        if (ben != that.ben) return false;
        if (hu != that.hu) return false;
        return bian == that.bian;
    }

    @Override
    public int hashCode()
    {
        int result = ben != null ? ben.hashCode() : 0;
        result = 31 * result + (hu != null ? hu.hashCode() : 0);
        result = 31 * result + (bian != null ? bian.hashCode() : 0);
        return result;
    }
}
