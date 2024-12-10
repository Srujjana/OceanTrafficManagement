import java.util.ArrayList;
import java.util.List;

public class trackVessels{
    public List<Vessel> trackVessels() {
    // Example function to track vessels
        List<Vessel> vesselData = new ArrayList<>();
        vesselData.add(new Vessel("V1", 25.0, -80.0));
        vesselData.add(new Vessel("V2", 26.5, -81.5));
        return vesselData;
    }
}
