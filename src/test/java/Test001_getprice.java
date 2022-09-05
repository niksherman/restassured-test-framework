import constants.EndPoints;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.testng.*;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.lang.module.Configuration;

public class Test001_getprice {

    @Test
    public void getPriceTest() {
    Response resp = RestAssured.
                    given().
                    get(EndPoints.GET_PRICE+"/1000")
                    .andReturn();

    Assert.assertEquals(resp.getBody().asString(), "30.0", "Price is not 30.0");
    Assert.assertEquals(resp.getStatusCode(), HttpStatus.SC_OK);

    }

}
