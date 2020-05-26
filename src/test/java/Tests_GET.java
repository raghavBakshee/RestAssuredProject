import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
class Tests_GET {

	@Test()
	void test_1(){
		given().
		get("https://reqres.in/api/users?page=2").
		then().
		statusCode(200).body("data.id", hasItems(7)).
		body("data.first_name", hasItems("Michael","Lindsay"));
	}
}











































