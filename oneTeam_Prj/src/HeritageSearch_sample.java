import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.HttpURLConnection;
import java.net.URL;

public class HeritageSearch_sample {

    public static String HERITAGE_SIMPLE_SEARCH = "http://www.cha.go.kr/cha/SearchKindOpenapiList.do";
    public static String HERITAGE_DETAIL_SEARCH = "http://www.cha.go.kr/cha/SearchKindOpenapiDt.do";

    public static void main(String[] args) {
        callHeritageListByXML();
        System.out.println("========================================================");
//        callHeritageDetailListByXML();
    }



    private static void callHeritageListByXML() {
        int pageNum = 1;
        try{
            while (true) {
                StringBuilder urlBuilder = new StringBuilder(HERITAGE_SIMPLE_SEARCH);

                urlBuilder.append("?" + "totalCnt=" + "16501"); // 첫 번째만 물음표로 설정
                urlBuilder.append("&" + "pageUnit=" + "1000");
                urlBuilder.append("&" + "pageIndex=" + pageNum);

                System.out.println(urlBuilder);

                URL url = new URL(urlBuilder.toString());
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("GET");

                conn.setRequestProperty("Accept", "application/xml");

                int code = conn.getResponseCode();
                System.out.println("ResponseCode : " + code);
                if (code < 200 || code >= 300) {
                    System.out.println("페이지가 잘 못 되었습니다.");
                    return;
                }

                DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
                DocumentBuilder db = dbf.newDocumentBuilder();
                Document doc = db.parse(conn.getInputStream());
                doc.normalizeDocument();

                System.out.println("Root Element : " + doc.getDocumentElement().getNodeName());
                System.out.println("========================================================");

//            System.out.println("item : " + doc.getElementsByTagName("item").item(0).getTextContent());

                NodeList heritageList = doc.getElementsByTagName("item");
                for (int i = 0; i < heritageList.getLength(); i++) {
                    Node node = heritageList.item(i);
                    System.out.println("\nCurrent Element : " + node.getNodeName());
                    if (node.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) node;
                        System.out.println("regency_sn : " + eElement.getElementsByTagName("sn").item(0).getTextContent());
                        System.out.println("regency_no : " + eElement.getElementsByTagName("ccbaKdcd").item(0).getTextContent());
                        System.out.println("regency_design_no : " + eElement.getElementsByTagName("ccbaAsno").item(0).getTextContent());
                        System.out.println("regency_trans_no : " + eElement.getElementsByTagName("ccbaCpno").item(0).getTextContent());
                        System.out.println("regency_name_kor : " + eElement.getElementsByTagName("ccbaMnm1").item(0).getTextContent());
                        System.out.println("regency_name_chi : " + eElement.getElementsByTagName("ccbaMnm2").item(0).getTextContent());
                        System.out.println("regency_category_name : " + eElement.getElementsByTagName("ccmaName").item(0).getTextContent());
                        System.out.println("regency_area : " + eElement.getElementsByTagName("ccsiName").item(0).getTextContent());
                        System.out.println("regency_area_no : " + eElement.getElementsByTagName("ccbaCtcd").item(0).getTextContent());      //추가
                        System.out.println("regency_admin : " + eElement.getElementsByTagName("ccbaAdmin").item(0).getTextContent());

//                    System.out.println("regency_address : " + eElement.getElementsByTagName("ccbaLcad").item(0).getTextContent());
//                    System.out.println("regency_type : " + eElement.getElementsByTagName("gcodeName").item(0).getTextContent());
//                    System.out.println("regency_type2 : " + eElement.getElementsByTagName("bcodeName").item(0).getTextContent());
//                    System.out.println("regency_type3 : " + eElement.getElementsByTagName("mcodeName").item(0).getTextContent());
//                    System.out.println("regency_type4 : " + eElement.getElementsByTagName("scodeName").item(0).getTextContent());
//                    System.out.println("regency_quantity : " + eElement.getElementsByTagName("ccbaQuan").item(0).getTextContent());
//                    System.out.println("regency_era : " + eElement.getElementsByTagName("ccceName").item(0).getTextContent());
//                    System.out.println("regency_owner : " + eElement.getElementsByTagName("ccbaPoss").item(0).getTextContent());
//                    System.out.println("regency_content : " + eElement.getElementsByTagName("content").item(0).getTextContent());
//                    System.out.println("regency_enrolldate : " + eElement.getElementsByTagName("ccmaName").item(0).getTextContent());
//                    System.out.println("regency_longitude : " + eElement.getElementsByTagName("longitude").item(0).getTextContent());
//                    System.out.println("regency_latitude : " + eElement.getElementsByTagName("latitude").item(0).getTextContent());
                    }
                }

                pageNum += 1;
                if(pageNum >= 18){
                    break;
                }

                conn.disconnect();
            }           // while end
        } catch (Exception e) {
            e.printStackTrace();
        }
    }





}



