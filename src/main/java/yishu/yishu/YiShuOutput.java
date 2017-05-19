package yishu.yishu;

/**
 * Created by victor on 2017/5/6.
 */
public class YiShuOutput
{
    private EightDiagrams up;
    private EightDiagrams down;
    private Integer dong;

    public YiShuOutput()
    {

    }

    public EightDiagrams getUp()
    {
        return up;
    }

    public void setUp(EightDiagrams up)
    {
        this.up = up;
    }

    public EightDiagrams getDown()
    {
        return down;

    }

    public void setDown(EightDiagrams down)
    {
        this.down = down;
    }

    public Integer getDong()
    {
        return dong;
    }

    public void setDong(Integer dong)
    {
        this.dong = dong;
    }

    @Override
    public String toString()
    {
        return "YiShuOutput{" +
                "up=" + up +
                ", down=" + down +
                ", dong=" + dong +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        YiShuOutput that = (YiShuOutput) o;

        if (up != that.up) return false;
        if (down != that.down) return false;
        return dong != null ? dong.equals(that.dong) : that.dong == null;
    }

    @Override
    public int hashCode()
    {
        int result = up != null ? up.hashCode() : 0;
        result = 31 * result + (down != null ? down.hashCode() : 0);
        result = 31 * result + (dong != null ? dong.hashCode() : 0);
        return result;
    }
}
