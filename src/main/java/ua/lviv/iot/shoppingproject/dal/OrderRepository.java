package ua.lviv.iot.shoppingproject.dal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.shoppingproject.models.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {
}
