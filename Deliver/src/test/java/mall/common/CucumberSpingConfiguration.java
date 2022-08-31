package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.DeliverApplication;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { DeliverApplication.class })
public class CucumberSpingConfiguration {}
