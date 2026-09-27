package tests;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

    public class GetUserTest {

        @Test
        public void getUser() {

            given()
                    .baseUri("https://reqres.in")

                    .when()
                    .get("/api/users/2")

                    .then()
                    .statusCode(200)
                    .body("data.id", equalTo(2));
        }
}
