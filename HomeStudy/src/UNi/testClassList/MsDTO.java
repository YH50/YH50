package UNi.testClassList;

public class MsDTO {

    private static int nextId = 1;      //리스트 쌓아주기 위한 베이스 세팅

    private int id;
    String artist;
    String title;

    public MsDTO(String artist, String title) {
        this.id = MsDTO.nextId++;   //리스트 쌓기
        this.artist = artist;
        this.title = title;
    }

    public MsDTO(int id, String artist, String title) {
        this.id = id;
        this.artist = artist;
        this.title = title;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "MsDTO{" +
                "id = " + id +
                ", artist = '" + artist + '\'' +
                ", title = '" + title + '\'' +
                '}';
    }


}
