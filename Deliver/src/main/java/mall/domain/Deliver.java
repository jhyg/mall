package mall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import mall.DeliverApplication;
import mall.domain.DeliveryStarted;

@Entity
@Table(name = "Deliver_table")
@Data
public class Deliver {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        DeliveryStarted deliveryStarted = new DeliveryStarted(this);
        deliveryStarted.publishAfterCommit();
    }

    public static DeliverRepository repository() {
        DeliverRepository deliverRepository = DeliverApplication.applicationContext.getBean(
            DeliverRepository.class
        );
        return deliverRepository;
    }

    public static void startDelivery(OrderPlaced orderPlaced) {
        /** Example 1:  new item 
        Deliver deliver = new Deliver();
        repository().save(deliver);

        */

        /** Example 2:  finding and process
        
        repository().findById(orderPlaced.get???()).ifPresent(deliver->{
            
            deliver // do something
            repository().save(deliver);


         });
        */

    }
}
