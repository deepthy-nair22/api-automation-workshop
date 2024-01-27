import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

public class UserSignupTest extends BaseAPITest{

    public void successfulRegistration(){
        //Resource end ponit -> /api/auth/signup
        String signupEndpointResource = "/api/auth/signup";
        String email =" test @gmail.com";
        String password = "12345678990";
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

        Assert.assertEquals(statusCode, 201, "Failed due to wrong status code");
        Assert.assertEquals(authenticatedEmail, email, "Failed due to incorrect email");
        Assert.assertEquals(role, "authenticated", "Failed dto validate role to be authenticated");
        Assert.assertNotNull(accessToken, "Failed as access token is null");





    }

}
