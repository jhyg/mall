package mall.common;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import static org.assertj.core.api.Assertions.assertThat;

public class WheneverRentalisOrderPlaced,DeliveryStartedStepDefinition {
    
    OrderPlaced orderPlaced = new OrderPlaced();
    DeliveryStarted deliveryStarted = new DeliveryStarted();
    Deliver deliver = new Deliver();

    @Given("OrderPlaced \\( ) is published and Deliver \\( )is present")
    public void OrderPlaced_is_published_and_Deliver_is_present(){
      // orderPlaced.setId();
      // deliver.setId();
    }
    @When("StartDelivery")
    public void StartDelivery(){
        deliver.StartDelivery();
    }
    @Then("DeliveryStarted \\( ) should publish")
    public void DeliveryStarted_should_publish(){
      // deliveryStarted.setId();
    }

}
