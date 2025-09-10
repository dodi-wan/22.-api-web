package stepdef.api.negative;

import helper.api.ApiUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import pages.api.post.PostPages;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class NegativeDataStepDef {

    private Response response;
    private final PostPages postPages;


    public NegativeDataStepDef() throws IOException {
        RequestSpecification requestSpecification = ApiUtils.getRequestSpec();
        ApiUtils apiUtils = new ApiUtils(requestSpecification);
        postPages = new PostPages(apiUtils);
    }


    @Given("create input data {string} {string} {string} {string} {string}")
    public void createInputData(String title, String firstname, String lastname, String email, String gender) throws IOException {
        Map<String, Object> updateData = new HashMap<>();
        updateData.put("title", title);
        updateData.put("firstName", firstname);
        updateData.put("lastName", lastname);
        updateData.put("email", email);
        updateData.put("gender", gender);

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("title", title);
        jsonObject.put("firstName", firstname);
        jsonObject.put("lastName", lastname);
        jsonObject.put("email", email);
        jsonObject.put("gender", gender);

        response = postPages.postData(updateData);
        System.out.println("result " + response.prettyPrint());
    }


    @Then("status code {int}")
    public void statusCode(int statuscode) {
        assertEquals(statuscode, response.getStatusCode());
        System.out.println("status code " + response.statusCode());
    }
}
