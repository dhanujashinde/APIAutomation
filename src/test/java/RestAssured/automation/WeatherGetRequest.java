package RestAssured.automation;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import APITesting.com.org.api.classes.ComplexCreate;
import APITesting.com.org.api.classes.Create;
import APITesting.com.org.api.classes.Info;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.*;

public class WeatherGetRequest {
	
	@Test
	public void Test01 () {
		             when().get("http://localhost:3000/posts").
				       then().statusCode(200);
			
	} 
	

/*
	//Simple get reuest to get weather request by city name
	@Test
	public void Test01 () {
		             when().get("http://localhost:3000/posts").
				       then().statusCode(200).
				       body("title[0]", equalTo("twelve")).
				       log().all();
		
		//System.out.println(res.asString());
		//Assert.assertEquals(res.getStatusCode(), 200);

		//Long time = res.then().extract().time();
		//System.out.println("Total time taken:"+time);
	}

	//Status code 401
		@Test
		public void Test02 () {
			Response res = when().get("http://localhost:3000/post");
			System.out.println(res.asString());
			System.out.println(res.getStatusCode());	
			Assert.assertEquals(res.getStatusCode(), 404);

			Long time = res.then().extract().time();
			System.out.println("Total time taken:"+time);
		}

   //Parameters and assert in rest assured
		@Test
		public void Test03 () {
		Response res = given().
		            param("id", "1").
		            param("author", "typicode").
					when().
					get("http://localhost:3000/posts");

		            res.then().
					assertThat().statusCode(200);

		            Long time = res.then().extract().time();
		    		System.out.println("Total time taken:"+time);

		}

		//JSON path
		@Test
		public void Test04 () {
			  Response res =given().
							when().
							get("http://localhost:3000/posts");

			  String actual=res.then().contentType(ContentType.JSON).extract().path("[0].author");

			  System.out.println(actual);

			  if(actual.equalsIgnoreCase("typicode"))
				  System.out.println("Test pass");
			  else
				  System.out.println("Test failed");

			  Long time = res.then().extract().time();
	    		System.out.println("Total time taken:"+time);


				}

		//Create record
		@Test
		public void Test05 () {
		Response res = given().
			    body("{\"id\": \"20\", \"title\": \"RESTAssured\",\"author\": \"DS\"}").
			    when().
			    contentType(ContentType.JSON).
			    post("http://localhost:3000/posts");

			    res.then().
				assertThat().statusCode(201);	

			    Long time = res.then().extract().time();
	    		System.out.println("Total time taken:"+time);
				}

		//Create record by passing object
				@Test
				public void Test06 () {

					Create cr = new Create();
					cr.setId("21");
					cr.setTitle("Object");
					cr.setAuthor("SD");

		 Response res = given().
					    when().
					    contentType(ContentType.JSON).
					    body(cr).
					    post("http://localhost:3000/posts");

					    res.then().
						assertThat().statusCode(201);

					    Long time = res.then().extract().time();
			    		System.out.println("Total time taken:"+time);

						}
				//Update record by passing object
				@Test
				public void Test07 () {

					Create cr = new Create();
					cr.setId("21");
					cr.setTitle("PUT");
					cr.setAuthor("SD");

				Response res = given().
					    when().
					    contentType(ContentType.JSON).
					    body(cr).
					    put("http://localhost:3000/posts/21");

					    res.then().
						assertThat().statusCode(200);

					    Long time = res.then().extract().time();
			    		System.out.println("Total time taken:"+time);

						}
				//Partially Update record 
					@Test
					public void Test08 () {

					Response res = given().
						    body("{\"title\": \"Update by Patch\"}").
						    when().
						    contentType(ContentType.JSON).
						    patch("http://localhost:3000/posts/21");

						    res.then().
							assertThat().statusCode(200);

						    Long time = res.then().extract().time();
				    		System.out.println("Total time taken:"+time);

							}
					//delete record 
						@Test
						public void Test09 () {

						Response res = given().
							    when().
							    delete("http://localhost:3000/posts/20");

							    res.then().
								assertThat().statusCode(200);

								}
	//Complex create						
	@Test
	public void Test09 () {

		Info info = new Info();
		info.setEmail("dhanuja@gmail.com");
		info.setPhone("90876");
		info.setAddress("Vashi");
		
		ComplexCreate cc = new ComplexCreate();
		cc.setId("30");
		cc.setInfo(info);
		cc.setTitle("Complex");
		cc.setAuthor("Era");
		
		Response res = given().
				when().
				contentType(ContentType.JSON).
				body(cc).
				post("http://localhost:3000/posts");

		res.then().
		assertThat().statusCode(201);

		Long time = res.then().extract().time();
		System.out.println("Total time taken:"+time);

	}
	
	//Post request with arrays
	@Test
	public void Test10 () {

		Info info1 = new Info();
		info1.setEmail("A@gmail.com");
		info1.setPhone("123");
		info1.setAddress("info1");
		
		Info info2 = new Info();
		info2.setEmail("B@gmail.com");
		info2.setPhone("456");
		info2.setAddress("info2");
		
		ComplexCreate cc = new ComplexCreate();
		cc.setId("200");
		cc.setInfo(new Info[] {info1, info2});
		cc.setTitle("Complex");
		cc.setAuthor("Era");
		
		Response res = given().
				when().
				contentType(ContentType.JSON).
				body(cc).
				post("http://localhost:3000/posts");

		res.then().
		assertThat().statusCode(201);

		Long time = res.then().extract().time();
		System.out.println("Total time taken:"+time);

	}
	
	@Parameters("userId")
	@Test
	public void Test11 (int userId) {

		System.out.println("userId"+userId);
	       given().
		    when().
		    delete("http://localhost:3000/posts/"+userId).
		    then().
		    statusCode(200).
		    log().all();

		   

			}
	*/
}
