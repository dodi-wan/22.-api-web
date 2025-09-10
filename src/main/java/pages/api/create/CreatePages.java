package pages.api.create;

import helper.api.ApiUtils;
import io.restassured.response.Response;

import java.io.IOException;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreatePages {
    private ApiUtils apiUtils;

    public CreatePages(ApiUtils apiUtils){
        this.apiUtils = apiUtils;

    }



    public Response getListUser() throws IOException {
        return ApiUtils.getRequestSpec()
                .when()
                .get("/user/");
    }








}









