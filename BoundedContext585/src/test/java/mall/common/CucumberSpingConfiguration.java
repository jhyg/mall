package mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import mall.BoundedContext585Application;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { BoundedContext585Application.class })
public class CucumberSpingConfiguration {}
