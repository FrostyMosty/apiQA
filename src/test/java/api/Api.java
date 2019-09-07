package api;


import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;



public class Api {

    @Test
    public void test1() {

        RestAssured
                .given()

                .header("X-Requested-With", "XMLHttpRequest")
                .formParam("district_form-district_id","1")

                .when()

                .post("https://gorzdrav.spb.ru/api/clinic_list/")

                .then()

                .statusCode(200)
                .body("response.Address", Matchers.hasItem("190103, Санкт-Петербург, Рижский пр., д. 21, литер \" Е\""));



    }


}
