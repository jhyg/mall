package mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Entity
@Table(name = "주문_table")
public class 주문 {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
