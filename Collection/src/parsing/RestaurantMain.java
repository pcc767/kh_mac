package parsing;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestaurantMain {

    private List<LineInfo> restaurantList = new ArrayList<>();
    private List<LineInfo> menuList = new ArrayList<>();

    private final Map<String, List<LineInfo>> restaurantIDToMenuListMap
            = new HashMap<>();

    private final Map<String, LineInfo> restaurantIDToLineInfoMap
            =new HashMap<>();

    public static void main(String[] args) {
        RestaurantMain main = new RestaurantMain();
        main.fileReadForRestaurant("/Users/kooki/IdeaProjects/khEx/Collection/src/전라남도_식당정보_20201229.csv");
        main.fileReadForMenu("/Users/kooki/IdeaProjects/khEx/Collection/src/전라남도_메뉴정보_20210120.csv");
        main.makeMap();
        main.printRestaurantListAndMenu();
//        main.printRestaurantListAndMenu("진품우리집오리");
//        main.searchMenu("찜닭");
    }

    private void searchMenu(String menuKeyword) {
        for(LineInfo info : menuList) {
            String menuName = info.getData("메뉴명");
            if(!menuKeyword.contains(menuKeyword))
                continue;
            System.out.println(info.toString());
            String restId = info.getData("식당ID");
            LineInfo info2 = restaurantIDToLineInfoMap.get(restId);
            System.out.println(info2);
            System.out.println();
        }

    }

    private void printRestaurantListAndMenu() {
        for(LineInfo info : restaurantList){
            String restId = info.getData("식당ID");
            List<LineInfo> menuList = restaurantIDToMenuListMap.get(restId);
            System.out.println(info);
            for(LineInfo info2 : menuList)
                System.out.println(info2);
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    private void printRestaurantListAndMenu(String nameKeyword) {
        for(LineInfo info : restaurantList){
            String restName = info.getData("식당명");
            if(!restName.equals(nameKeyword))
                continue;
            String restId = info.getData("식당ID");
            List<LineInfo> menuList = restaurantIDToMenuListMap.get(restId);
            System.out.println(info);
            for(LineInfo info2 : menuList)
                System.out.println(info2);
            System.out.println("-------------------------------------------------------------------------------------");
        }
    }

    private void makeMap() {
        for(LineInfo info : restaurantList){
            String restId = info.getData("식당ID");
            restaurantIDToLineInfoMap.put(restId, info);
        }

        for(LineInfo info : menuList){
            String restId = info.getData("식당ID");
            List<LineInfo> list = restaurantIDToMenuListMap.get(restId);
            if(list == null){
                list = new ArrayList<LineInfo>();
                restaurantIDToMenuListMap.put(restId, list);
            }
            list.add(info);
        }
    }

    private void fileReadForMenu(String path) {
        menuList = makeCSVList(path, "UTF-8");
    }


    private void fileReadForRestaurant(String path) {
        restaurantList = makeCSVList(path, "EUC-KR");
    }

    private List<LineInfo> makeCSVList(String path, String charset) {
        List<LineInfo> list = new ArrayList<LineInfo>();

        try(
                FileReader fr = new FileReader(path, Charset.forName(charset));
                BufferedReader br = new BufferedReader(fr);
            ){
            String headerStr = br.readLine();
            List<String> headerList = csvLineToList(headerStr);

            String str = null;
            while ((str = br.readLine()) != null) {
                List<String> lineList = csvLineToList(str);
                if(lineList == null)
                    continue;
                LineInfo info = new LineInfo(headerList, lineList);
                list.add(info);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    private List<String> csvLineToList(String csvLine) {
        try{
            String delimiter = ",";
            if(csvLine.contains(",\""))
                csvLine = filter(csvLine);
            List<String> list = new ArrayList<>();
            String[] array = csvLine.split(delimiter);
            for(String str : array){
                str = str.replace("\"", "").strip().replace("_", ",");
                if(str.contains("메뉴ID"))
                    str = str.substring(1,str.length());
                list.add(str);
            }
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private String filter(String str) {
        StringBuffer sb = new StringBuffer(str);
        StringBuffer new_sb = new StringBuffer();

        boolean in = false;
        for(int i=0; i<sb.length(); i++) {
            char value = sb.charAt(i);
            if(value == '\"')
                in = !in;
            if(in){
                if(value == ',')
                    value = '_';
            }
            new_sb.append(value);
        }
        return new_sb.toString();
    }

}
