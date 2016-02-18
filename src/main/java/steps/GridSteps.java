package steps;

import model.Bucket;
import org.jbehave.core.annotations.*;
import org.testng.Assert;

public class GridSteps {

    private Bucket bucket;

    @BeforeStories
    public void BeforeStories(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++ @BeforeStories ++++++++++++++++++++++++++++++++");
    }


    @BeforeStory
    public void BeforeStory(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++  @BeforeStory +++++++++++++++++++++++++++++++++");
    }



    @BeforeScenario
    public void BeforeScenario(){
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++  @BeforeScenario ++++++++++++++++++++++++++++++");
    }

    @Given("bucket with $apples apples")
    @Alias("bucket with $bananas bananas")
    public void theSquareIsBuild(@Named("givenApples")int apples){
        bucket = new Bucket(apples);
    }

    @When("I add $apples apples to bucket")
    @Alias("I add $bananas to bucket")
    public void iGetAppleFromBucket(@Named("whenApples")int apples){
        bucket.setApples(bucket.getApples() + apples);
    }

    //@Pending
    @Then("the total number of apples in bucket should be $apple")
    @Alias("the total number of bananas in bucket should be $bananas")
    public void restShouldBe(@Named("thenApples")int rest){
        Assert.assertEquals(bucket.getApples(), rest);
    }


}
