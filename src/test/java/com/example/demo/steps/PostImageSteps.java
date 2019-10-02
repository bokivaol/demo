package com.example.demo.steps;

import com.example.demo.models.ImageRequestBodyModel;
import com.example.demo.models.ImageResponseBodyModel;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base64;

/**
 * Created by @Bojan Jovic on Oct, 2019
 */
public class PostImageSteps {
    private Response response;
    private ImageResponseBodyModel imageResponse;

    ImageRequestBodyModel imageRequestBody = new ImageRequestBodyModel();

    /**
     * In this step I create request body payload, send request to specified endpoint and store received response
     * @param bodyParam
     * @return Response response
     */
    public Response imageRequestAndResponse(String bodyParam) {

        System.out.println("*****Calling filter API with body param: " + bodyParam);

        imageRequestBody.setImage(bodyParam);

        response = RestAssured
                .given()
                .contentType(ContentType.JSON)
                .body(imageRequestBody)
                .when()
                .post("/api/image")
                .then()
                .log()
                .ifValidationFails()
                .extract()
                .response();

        return response;
    }

    /**
     * Response GSON serialization
     */
    public ImageResponseBodyModel imageResponseGSONDeserialized() {
        imageResponse = response
                .then()
                .extract()
                .as(ImageResponseBodyModel.class);

        return imageResponse;
    }
}
