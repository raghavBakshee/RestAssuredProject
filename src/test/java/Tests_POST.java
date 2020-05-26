
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;


public class Tests_POST {

	@Test
	void test_1_post(){ 
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request);
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			post("https://reqres.in/api/users").
		then().
			statusCode(201);
		
		
		
	}
	@Test
	void test_2_put(){ 
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request);
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			put("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	@Test
	void test_3_patch(){ 
		JSONObject request = new JSONObject();
		request.put("name", "Raghav");
		request.put("job", "Teacher");
		System.out.println(request);
		
		given().
			header("Content-Type", "application/json").
			contentType(ContentType.JSON).
			accept(ContentType.JSON).
			body(request.toJSONString()).
		when().
			patch("https://reqres.in/api/users/2").
		then().
			statusCode(200).
			log().all();
		
	}
	@Test
	void test_4_delete(){ 
		
		when().
			delete("https://reqres.in/api/users/2").
		then().
			statusCode(204).//204 - No content
			log().all();
		
	}
}
