/*
    Do not change anything in this class
*/

import java.util.HashMap;
import java.util.Map;

public final class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationID, String description, Map<String, Integer> exits) {
        this.locationID = locationID;
        this.description = description;
        if(exits != null)
        {
            this.exits = new HashMap<String, Integer>(exits);

        } else {
            this.exits = new HashMap<String, Integer>();
        }
        this.exits.put("Q", 0);
    }


    public int getLocationID() {
        return locationID;
    }

    public String getDescription() {
        return description;
    }

    public Map<String, Integer> getExits() {
        try {
            Map<String, Integer> exitsClone = new HashMap<String, Integer>(exits);

            return (Map<String, Integer>) exitsClone;
        } catch (Exception e) {
            return null;
        }
    }

}