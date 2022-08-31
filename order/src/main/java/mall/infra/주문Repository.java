package mall.infra;

import java.util.List;
import mall.domain.*;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface 주문Repository extends CrudRepository<주문, Long> {}
