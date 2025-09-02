package stepdef.api.get;

import helper.api.ApiUtils;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.api.create.CreatePages;
import pages.api.get.GetPages;

import javax.accessibility.AccessibleRelation;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetStepDef {

    private Response response;
    private GetPages getPages;

    public GetStepDef() throws IOException {
        RequestSpecification requestSpecification = ApiUtils.getRequestSpec();
        ApiUtils apiUtils = new ApiUtils(requestSpecification);
        getPages = new GetPages(apiUtils);
    }


    @Given("setup link dummyapi")
    public void setupLinkDummyapi() throws IOException {
       response = getPages.getListUser();
        System.out.println(response.prettyPrint());
    }


    @Then("the response status code is {int}")
    public void theResponseStatusCodeIs(int statuscode) {
        assertEquals(statuscode, response.getStatusCode());
        System.out.println("status response " + response.statusCode());
    }
}
