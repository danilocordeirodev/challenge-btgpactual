package maned.wolf.challenge.btgpactual.orderms.repository;

import maned.wolf.challenge.btgpactual.orderms.entity.OrderEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderEntity, Long> {
}
