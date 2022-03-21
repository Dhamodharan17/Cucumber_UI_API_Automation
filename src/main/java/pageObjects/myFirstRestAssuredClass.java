package pageObjects;

import static io.restassured.RestAssured.*;


public class myFirstRestAssuredClass {

   final static String ep="http://demo.guru99.com/V4/sinkministatement.php?CUSTOMER_ID=68195&PASSWORD=1234!&Account_No=1";
   final static String ep1 = "https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22";

   public static void main(String args[]) {

	   
	   int statuscode = get(ep1).statusCode();
	   System.out.println(statuscode);
	   
	
	   }


}
