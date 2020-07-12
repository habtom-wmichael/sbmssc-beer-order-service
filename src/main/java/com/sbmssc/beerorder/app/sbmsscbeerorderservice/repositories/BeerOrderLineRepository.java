package com.sbmssc.beerorder.app.sbmsscbeerorderservice.repositories;


import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.BeerOrderLine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface BeerOrderLineRepository extends PagingAndSortingRepository<BeerOrderLine, UUID> {
}
