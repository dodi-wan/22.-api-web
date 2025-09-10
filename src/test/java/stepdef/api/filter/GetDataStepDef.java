package stepdef.api.filter;

import helper.api.ApiUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import pages.api.create.CreatePages;
import pages.api.get.GetPages;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GetDataStepDef {


    private final GetPages getPages;

    private Response response;
    private static String getId;


    public GetDataStepDef() throws IOException {
        RequestSpecification requestSpecification = ApiUtils.getRequestSpec();
        ApiUtils apiUtils = new ApiUtils(requestSpecification);
        getPages = new GetPages(apiUtils);
    }


    @And("get data id {string}")
    public void getDataId(String id) throws IOException {
        response = getPages.getUserById(id);
    }


    @Then("response status code is {int}")
    public void responseStatusCodeIs(int statuscode) {
        assertEquals(statuscode, response.getStatusCode());
    }

    @When("get bulk {string}")
    public void getBulk(String id) throws IOException {
        List<String> addList = Arrays.asList(id.split(","));
        response = getPages.getBulkById(addList);
        List<String> ids = response.jsonPath().getList("data.id");

        System.out.println("result " + ids);
    }

    @Then("status ok response is {int}")
    public void statusOkResponseIs(int statuscode) {
        assertEquals(statuscode, response.statusCode());
    }
}


