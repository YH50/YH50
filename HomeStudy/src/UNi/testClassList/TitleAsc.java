package UNi.testClassList;

import java.util.Comparator;

public class TitleAsc implements Comparator<MsDTO> {
    @Override
    public int compare(MsDTO o1, MsDTO o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
