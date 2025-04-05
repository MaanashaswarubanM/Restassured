package controller;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import model.Product;

public class Controller {
    public void mobileDevice() {
        RestAssured.baseURI = "https://api.restful-api.dev";
        Response response = RestAssured
                .given()
                .queryParam("id", "ff808181932badb60195d30ae01e4302")
                .get("/objects")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(response.getBody().asString());
    }

    public void mobileDevice(int param) {
        RestAssured.baseURI = "https://api.restful-api.dev";
        Response response = RestAssured
                .given()
                .get("/objects/" + param)
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(response.getBody().asString());
    }

    public void createMobileDevice(Product request) {
        RestAssured.baseURI = "https://api.restful-api.dev";
        Response response = RestAssured
                .given()
                .contentType("application/json")
                .body(request)
                .put("/objects/ff808181932badb60195d30ae01e4302")
                .then()
                .statusCode(200)
                .extract().response();
        System.out.println(response.getBody().asString());
    }


    public void Products (int param) {
        RestAssured.baseURI = "https://api.restful-api.dev";
        Response response = RestAssured
                .given()
                .get("/objects/7")
                .then()
                .statusCode(200)
            .extract().response();
        System.out.println(response.getBody().asString());
    }
}