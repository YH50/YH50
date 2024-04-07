package UNi.testClassList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MsMenu {

    private MsMnger manager = new MsMnger();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu(){

        mainMenu:
        while (true){
            System.out.println("========== menu ==========");
            System.out.println("1. 곡 추가");
            System.out.println("2. 곡 전체 조회");
            System.out.println("3. 정렬하여 조회");
            System.out.println("4. 가수명 검색");
            System.out.println("5. 곡명 검색");
            System.out.println("6. 곡 정보 수정");
            System.out.println("7. 곡 삭제");
            System.out.println("0. 프로그램 종료");

            System.out.print("메뉴 선택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            switch (menu){
                case 1:
                    addList();
                    break;
                case 2:
                    searchList();
                    break;
                case 3:
                    sortMenu();
                    break;
                case 4:
                    searchArtist();
                    break;
                case 5:
                    searchTitle();
                    break;
                case 6:
                    updateMusic();
                    break;
                case 7:
                    deleteMusic();
                    break;
                case 0:
                    System.out.println("프로그램 종료");
                    break mainMenu;
                default:
                    System.out.println("다시 번호를 입력하세요.");
                    break;
            }


        }
    }

    public void addList(){
        System.out.println("======= 곡 추가 =======");
        System.out.print("가수 입력 : ");
        String artist = sc.nextLine();
        System.out.print("제목 입력 : ");
        String title = sc.nextLine();

        MsMnger.addList(new MsDTO(artist, title));

    }

    public void searchList(){
        System.out.println("===== 곡 전체 조회 =====");
        List<MsDTO> msList = manager.selectList();

        if(!msList.isEmpty()){
            for(MsDTO music : msList){
                System.out.println(music);
            }
        }else{
            System.out.println("목록 없음");
        }
    }

    public void sortMenu(){
        System.out.println("===== 정렬 메뉴 =====");
        System.out.println("1. 가수명 오름차순 정렬");
        System.out.println("2. 곡명 오름차순 정렬");
        System.out.println("3. 가수명 내림차순 정렬");
        System.out.println("4. 곡명 내림차순 정렬");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();

        ascDesc(menu);
    }

    public void ascDesc(int menu){
        System.out.println("===== 정렬하여 조회 =====");
        List<MsDTO> msList = manager.selectList();

        if(msList.isEmpty()){
            System.out.println("목록이 존재하지 않습니다.");
            return;
        }
        List<MsDTO> sortList = new ArrayList<>();
        sortList.addAll(msList);

        //익명 클래스 이용//
        if (menu == 1){
            sortList.sort(new Comparator<MsDTO>() {
                @Override
                public int compare(MsDTO o1, MsDTO o2) {
                    return o1.getArtist().compareTo(o2.getArtist());
                }
            });
        } else if (menu == 2){
            sortList.sort(new TitleAsc());
        } else if (menu == 3) {
            sortList.sort(new AtstDesc());
        } else{
            sortList.sort(new TitleDesc());
        }

        for (int i = 0; i < sortList.size();++i){
            System.out.println(sortList.get(i));
        }
    }

    public void searchArtist(){
        System.out.println("===== 가수명으로 검색 =====");
        System.out.print("가수명 입력 : ");
        List<MsDTO> searchList = manager.searchList/*searchArtist 아님?*/(sc.nextLine());

        if(!searchList.isEmpty()){
            for(int i = 0; i < searchList.size(); ++i){
                System.out.println(searchList.get(i));
            }
        }else{
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void searchTitle(){
        System.out.println("===== 곡명으로 검색 =====");
        System.out.print("곡명 입력 : ");
        List<MsDTO> searchList = manager.searchList(sc.nextLine());

        if (!searchList.isEmpty()) {
            for (int i = 0; i < searchList.size(); i++) {
                System.out.println(searchList.get(i));
            }
        } else {
            System.out.println("검색 결과가 없습니다.");
        }
    }

    public void updateMusic(){
        System.out.println("===== 곡 정보 수정 =====");
        System.out.print("수정할 곡의 id : ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("수정할 가수명 : ");
        String updateArtist = sc.nextLine();
        System.out.print("수정할 제목명 : ");
        String updateTitle = sc.nextLine();

        MsDTO updateMusic = new MsDTO(id, updateArtist, updateTitle);

        if (manager.updateMusic(updateMusic)) {
            System.out.println("수정 완료");
        }else{
            System.out.println("수정할 곡 검색 실패");
        }
    }

    public void deleteMusic(){
        System.out.println("===== 곡 삭제 =====");
        System.out.print("삭제할 곡의 id : ");

        if (manager.deleteMusic(sc.nextInt())){
            System.out.println("삭제 성공");
        }else {
            System.out.println("삭제할 곡 검색 실패");
        }
        sc.nextLine();


    }

}
