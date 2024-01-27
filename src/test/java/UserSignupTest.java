import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.UUID;

import java.util.UUID;

public class UserSignupTest extends BaseAPITest{
@Test
public void successfulRegistration(){
        //Resource end ponit -> /api/auth/signup
        String signupEndpointResource = "/api/auth/signup";
        //String email ="test_6726227dee17277@gmail.com";
        String email = "test" + UUID.randomUUID().toString() + "@gmail.com";
        String password = "123456711";
        //Request body
        String signupRequestBody = String.format("{\"email\": \"%s\", \"password\": \"%s\"}", email, password);

        //Response
        Response response = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(signupRequestBody)
                .post(signupEndpointResource);

        int statusCode = response.getStatusCode();
        String authenticatedEmail = response.jsonPath().get("data.user.email");
        String role = response.jsonPath().get("data.user.role");
        String accessToken = response.jsonPath().get("data.session.access_token");

        Assert.assertEquals(statusCode, 201, "status code shpul be 201");
        Assert.assertEquals(authenticatedEmail, email, "email is not matching entered email");
        Assert.assertEquals(role, "authenticated", "role is not authenticated");
        Assert.assertNotNull(accessToken, "access token is not null");


    }

}