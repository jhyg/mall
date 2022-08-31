package mall.infra;

import mall.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class DeliverHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Deliver>> {

    @Override
    public EntityModel<Deliver> process(EntityModel<Deliver> model) {
        return model;
    }
}
