package com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.mappers;

import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.BeerOrderLine;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.model.BeerOrderLineDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})

public interface BeerOrderLineMapper {
    BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line);

   BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto);
}
