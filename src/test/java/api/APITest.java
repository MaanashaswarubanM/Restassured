package api;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.annotations.Test;
public class APITest {
   @Test
    public void mobileDevice(){
        RestAssured.baseURI="https://api.restful-api.dev";
        Response response=RestAssured
                .given()
                .queryParam("id","objects/"+9)
                .get("/objects")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(response.getBody().asString());
    }
}
