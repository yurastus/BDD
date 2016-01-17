package steps;

import model.Bucket;
import org.jbehave.core.annotations.*;
import org.testng.Assert;

public class GridSteps {

    private Bucket bucket;

    @Given("bucket with $apples apples")
    @Alias("bucket contains $apples apples")
    public void theSquareIsBuild(@Named("givenApples")int apples){
        bucket = new Bucket(apples);
    }

    @When("I add $apples apples to bucket")
    public void iGetAppleFromBucket(@Named("whenApples")int apples){
        bucket.setApples(bucket.getApples() + apples);
    }

    //@Pending
    @Then("the total number of apples in bucket should be $apple")
    public void restShouldBe(@Named("thenApples")int rest){
        Assert.assertEquals(bucket.getApples(), rest, "\nIncorrect count");
    }


}
