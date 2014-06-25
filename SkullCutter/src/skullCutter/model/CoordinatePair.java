package skullCutter.model;

public class CoordinatePair
{
    public CoordinatePair(Double x, Double y)
    {
        fX = x;
        fY = y;
    }

    public void setX(final Double x)
    {
        fX = x;
    }

    public void setY(final Double y)
    {
        fY = y;
    }

    public Double getX()
    {
        return fX;
    }

    public Double getY()
    {
        return fY;
    }

    private Double fX;
    private Double fY;
}
