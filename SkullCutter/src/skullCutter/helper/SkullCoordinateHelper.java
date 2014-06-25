package skullCutter.helper;

import java.util.ArrayList;

import skullCutter.model.CoordinatePair;
import skullCutter.model.SkullSegment;

public class SkullCoordinateHelper
{
    public static void rotateSkullSegment(SkullSegment skull, double theta)
    {
        ArrayList<CoordinatePair> skullCoordinates = skull.getCoordinates();
        for (CoordinatePair coordinate : skullCoordinates)
        {
            Double rotatedX = coordinate.getX() * Math.cos(-theta) - coordinate.getY() * Math.sin(-theta);
            Double rotatedY = coordinate.getX() * Math.sin(-theta) + coordinate.getY() * Math.cos(-theta);
            coordinate.setX(rotatedX);
            coordinate.setY(rotatedY);
        }
    }

    public static void translateSkullSegment(SkullSegment skull, CoordinatePair translation)
    {
        ArrayList<CoordinatePair> skullCoordinates = skull.getCoordinates();
        for (CoordinatePair coordinate : skullCoordinates)
        {
            coordinate.setX(coordinate.getX() - translation.getX());
            coordinate.setY(coordinate.getY() - translation.getY());
        }
    }

    public static void main(String[] args)
    {
        ArrayList<CoordinatePair> coords = new ArrayList<CoordinatePair>();
        coords.add(new CoordinatePair(Double.valueOf(0), Double.valueOf(1)));
        coords.add(new CoordinatePair(Double.valueOf(2), Double.valueOf(3)));
        SkullSegment seg = new SkullSegment(coords);

        rotateSkullSegment(seg, Math.PI);
        for (CoordinatePair coord : coords)
        {
            System.out.println(coord.getX() + " " + coord.getY());
        }
    }
}
