package ru.netology.PostmanEcho;


import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class PostmanEchoPostTest {
    @Test
    void shouldPostmanReturnData() {

        given()
                .baseUri("https://postman-echo.com")
                .body("incredibly")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("ncredibly"));
    }
}
