package skullCutter;

import java.util.ArrayList;

public class SkullSegment
{
    public class Builder
    {
        public Builder()
        {
        }

        public Builder setCoordinates(ArrayList<Integer> coordinates)
        {
            this.coordinates = coordinates;
            return this;
        }

        public SkullSegment build()
        {
            return new SkullSegment(this);
        }

        private ArrayList<Integer> coordinates;
    }

    public SkullSegment(Builder builder)
    {
        fCoordinates = builder.coordinates;
    }

    public ArrayList<Integer> getCoordinates()
    {
        return fCoordinates;
    }

    private final ArrayList<Integer> fCoordinates;
}
