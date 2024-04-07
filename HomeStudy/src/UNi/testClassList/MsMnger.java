package UNi.testClassList;

import java.util.ArrayList;
import java.util.List;

public class MsMnger {

    private static List<MsDTO> musicList = new ArrayList<>();

    public static void addList(MsDTO music){
        musicList.add(music);
    }

    public List<MsDTO> selectList(){
        return musicList;
    }

    public List<MsDTO> searchList(String artist){

        List<MsDTO> searchList = new ArrayList<>();
        //제목 검색 & 키워드 포함된 곡 리턴 목적의 리스트

        for(MsDTO music : musicList){
            if(music.getArtist().contains(artist)){
                searchList.add(music);
            }
        }
        return searchList;
    }                                    //제목 조회 메소드

    public boolean updateMusic (MsDTO updateMusic){

        MsDTO old = null;

        for (int i = 0; i < musicList.size(); ++i){
            if(musicList.get(i).getId() == updateMusic.getId()){
                old = musicList.set(i,updateMusic);
            }
        }
        return old != null;
    }                           //곡 수정 메소드

    public boolean deleteMusic(int id){

        MsDTO old = null;

        for(int i = 0; i < musicList.size(); ++i){
            if(musicList.get(i).getId() == id){
                old = musicList.remove(i);
            }
        }

        return old != null;

    }                           //곡 삭제 메소드


}
