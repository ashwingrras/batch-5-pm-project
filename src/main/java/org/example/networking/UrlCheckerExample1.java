package org.example.networking;


import java.net.URL;
public class UrlCheckerExample1{
    public static void main(String[] args){
        try{
            //https://www.flipkart.com/mens-jeans/pr?sid=clo,vua,k58,i51&fm=neo%2Fmerchandising&iid=M_966567b5-4be9-495f-b1a2-b72e990665d7_1_372UD5BXDFYS_MC.AWKDIFDJVHWO&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BBottom%2BWear~Men%2527s%2BJeans_AWKDIFDJVHWO&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=AWKDIFDJVHWO
            URL url=new URL("http://www.google.com:1234/api/fetchdata");

            System.out.println("Protocol: "+url.getProtocol());
            System.out.println("Host Name: "+url.getHost());
            System.out.println("Port Number: "+url.getPort());
            System.out.println("Default Port Number: "+url.getDefaultPort());
            System.out.println("Query String: "+url.getQuery());
            System.out.println("Path: "+url.getPath());
            System.out.println("File: "+url.getFile());

        }catch(Exception e){System.out.println(e);}
    }
}