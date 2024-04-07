package UNi.testClassList;

import java.util.Comparator;

public class TitleDesc implements Comparator<MsDTO> {
    @Override
    public int compare(MsDTO o1, MsDTO o2) {
        return o2.getTitle().compareTo(o1.getTitle());
    }
}
