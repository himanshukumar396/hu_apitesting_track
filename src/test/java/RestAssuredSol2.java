import org.testng.annotations.Test;
import java.io.File;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class RestAssuredSol2 {
    @Test
    public void put_call(){
        File JsonData=new File("src\\test\\resources\\putdata.json");
        given().
                baseUri("https://reqres.in/api/users").
                body(JsonData).
                header("Content-Type","application/json").
                when().
                put("/users").
                then().
                statusCode(200)
                .statusCode(200)
                .body("name",equalTo("Arun"))
                .body("job",equalTo("Manager"));
    }
}
