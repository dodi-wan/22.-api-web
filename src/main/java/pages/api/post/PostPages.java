package pages.api.post;

import helper.api.ApiUtils;
import io.restassured.response.Response;

import java.io.IOException;
import java.util.Map;

public class PostPages {

    private ApiUtils apiUtils;

    public PostPages(ApiUtils apiUtils){
        this.apiUtils = apiUtils;
    }

    public Response postData(Map<String, Object> payload) throws IOException {
        return ApiUtils.getRequestSpec()
                .body(payload)
                .when()
                .post("/user/create");
    }
}
