package skullCutter.model;

import java.util.ArrayList;

public class SkullSegment
{
    public SkullSegment(ArrayList<CoordinatePair> coordinates)
    {
        fCoordinates = coordinates;
    }

    public ArrayList<CoordinatePair> getCoordinates()
    {
        return fCoordinates;
    }

    private final ArrayList<CoordinatePair> fCoordinates;
}
