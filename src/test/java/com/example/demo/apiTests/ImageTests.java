package com.example.demo.apiTests;

import com.example.demo.BaseTest;
import com.example.demo.steps.PostImageSteps;
import io.restassured.response.Response;
import org.apache.commons.codec.binary.Base64;
import org.assertj.core.api.SoftAssertions;
import org.junit.Test;

/**
 * Created by @Bojan Jovic on Oct, 2019
 */
public class ImageTests extends BaseTest {

    @Test
    public void checkIfValueInResponseIsBase64Encoded() {
        SoftAssertions softAssertions = new SoftAssertions();
        PostImageSteps imageSteps = new PostImageSteps();

//        Enter value which you want to check
        String imageBodyValue = "test";

        Response rowResponse = imageSteps.imageRequestAndResponse(imageBodyValue);
        String encodedValue = imageSteps.imageResponseGSONDeserialized().getImage();

//        true if value in response is base64 encoded
        boolean isBase64 = Base64.isBase64(encodedValue);

//        Decode base46 encoded value
        byte[] encodedResponseValueByte = Base64.decodeBase64(encodedValue);

//        Converting byte to String
        String encodedResponseValue = new String(encodedResponseValueByte);

//        Assertions starting point
//        Assertion that Status code is 200
        softAssertions.assertThat(rowResponse.getStatusCode()).as("Status code should be 200.")
                .isEqualTo(200);
//        Assertion that value which we received in response is base64 encoded
        softAssertions.assertThat(isBase64).as("Value in response should be base64 encoded.")
                .isTrue();
//        Assertion that decoded response value is same as value which we sent in response
        softAssertions.assertThat(encodedResponseValue).as("Set request value: " + imageBodyValue + " should be equal to value received in response: " + encodedResponseValue)
                .isEqualTo(imageBodyValue);

        softAssertions.assertAll();
    }

}
