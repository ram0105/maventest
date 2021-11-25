package com.vapasi;
import com.tngtech.java.junit.dataprovider.DataProvider;
import com.tngtech.java.junit.dataprovider.DataProviderRunner;
import com.tngtech.java.junit.dataprovider.UseDataProvider;
import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import org.junit.Test;
import org.junit.runner.RunWith;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

@RunWith(DataProviderRunner.class)
public class GetDepartureInformation {
    
    @DataProvider
    public static Object[][] origAndName(){
        return new Object[][]{
                {"RICH", "Richmond"},
                {"LAKE", "Lake Merritt"},
                {"NCON", "North Concord/Martinez"},
                {"Cols", "Coliseum"},
        };
    }

    @Test
    @UseDataProvider("origAndName")
    public void testDeparture(String orig, String expectedName){
        RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());
        String cmdValue = "etd";
        String keyValue = "MW9S-E7SL-26DU-VV8V";

        given().header("Content-type","application/json").
                queryParam("orig", orig)
                .queryParam("cmd", cmdValue)
                .queryParam("key", keyValue).
                queryParam("json","y").
                when().
                get("https://api.bart.gov/api/etd.aspx").
                then().
                assertThat().
                body("root.station[0].name", equalTo(expectedName));;
    }
}