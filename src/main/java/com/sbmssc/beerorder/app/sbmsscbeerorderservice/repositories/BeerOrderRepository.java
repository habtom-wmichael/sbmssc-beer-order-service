package com.sbmssc.beerorder.app.sbmsscbeerorderservice.repositories;

import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.BeerOrder;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.Customer;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.OrderStatusEnum;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;

import javax.persistence.LockModeType;
import java.util.List;
import java.util.UUID;

public interface BeerOrderRepository extends JpaRepository<BeerOrder, UUID> {
    Page<BeerOrder> findAllByCustomer(Customer customer, Pageable pageable);

    List<BeerOrder> findAllByOrderStatus(OrderStatusEnum orderStatusEnum);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    BeerOrder findOneById(UUID id);
}
