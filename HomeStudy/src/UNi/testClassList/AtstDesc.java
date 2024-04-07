package UNi.testClassList;

import java.util.Comparator;

public class AtstDesc implements Comparator<MsDTO> {
    @Override
    public int compare(MsDTO o1, MsDTO o2) {
        return o2.getArtist().compareTo(o1.getArtist());
    }
}
