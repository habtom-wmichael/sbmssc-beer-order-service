package com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.mappers;

import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.Customer;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.model.CustomerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface CustomerMapper {
    CustomerDto customerToDto(Customer customer);

    Customer dtoToCustomer(Customer dto);
}
