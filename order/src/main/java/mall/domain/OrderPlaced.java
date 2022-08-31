package mall.domain;

import java.util.Date;
import mall.domain.*;
import mall.infra.AbstractEvent;

public class OrderPlaced extends AbstractEvent {

    private Long id;

    public OrderPlaced() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
