package ru.yandex.lesson9;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ru.yandex.BaseTest;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.Is.is;

class YandexPredictorTest extends BaseTest {

    private static final String KEY_PARAM = "key";
    private static final String LANG = "lang";
    private static final String QUERY = "q";
    private static final String LIMIT = "limit";
    private static final String API_KEY = "pdct.1f";

    @BeforeAll
    static void beforeAll() {
        RestAssured.baseURI = "https://predictor.yandex.net/api/v1/predict.json/";
    }

    @BeforeEach
    void setUp() {
        System.out.println("Begin");
    }

    @AfterEach
    void tearDown() {
        System.out.println("End");
    }

    @AfterAll
    static void after() {

    }

    @Test
    void testGetLangs() {
        // { "names":["Ivan"], "age":15}
        // names.[0]
        // age
        List<String> langs = given()
                .param(KEY_PARAM, API_KEY)
                .log()
                .uri()
                .expect()
                .statusCode(200)
                //.body("", Matchers.arrayContaining("ru"))
                .log()
                .body()
                .when()
                .get("getLangs")
                .as(new TypeRef<>() {
                });

        boolean exist = langs.stream().filter(s -> s.equals("ru"))
                .findAny()
                .isPresent();

        Assertions.assertTrue(exist);
    }

    @Test
    void testComplete() {
        PredictResponse response = given()
                .log()
                .all()
                .queryParam(KEY_PARAM, API_KEY)
                .queryParam(LANG, "ru")
                .queryParam(QUERY, "Привет")
                .queryParam(LIMIT, 10)
                .expect()
                .contentType(ContentType.JSON)
                .log()
                .all()
                .when()
                .get("complete")
                .as(PredictResponse.class);
        System.out.println();
    }

    @Test
    void test401Complete() {
        given()
                .log()
                .all()
                .queryParam(KEY_PARAM, "API_KEY")
                .queryParam(LANG, "ru")
                .queryParam(QUERY, "Привет")
                .queryParam(LIMIT, 10)
                .expect()
                .contentType(ContentType.JSON)
                .statusCode(403)
                .body("code", is(401))
                .body("message", is("API key is invalid"))
                .log()
                .all()
                .when()
                .get("complete");

    }

}
