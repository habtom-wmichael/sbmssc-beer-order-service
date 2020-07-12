package com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.mappers;

import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.BeerOrderLine;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.domains.BeerOrderLine.BeerOrderLineBuilder;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.model.BeerOrderLineDto;
import com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.model.BeerOrderLineDto.BeerOrderLineDtoBuilder;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-07-12T02:37:28-0500",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 13.0.2 (Oracle Corporation)"
)
public class BeerOrderLineMapperImpl implements BeerOrderLineMapper {

    private final DateMapper dateMapper = new DateMapper();

    @Override
    public BeerOrderLineDto beerOrderLineToDto(BeerOrderLine line) {
        if ( line == null ) {
            return null;
        }

        BeerOrderLineDtoBuilder beerOrderLineDto = BeerOrderLineDto.builder();

        beerOrderLineDto.id( line.getId() );
        if ( line.getVersion() != null ) {
            beerOrderLineDto.version( line.getVersion().intValue() );
        }
        beerOrderLineDto.createdDate( dateMapper.asOffsetDateTime( line.getCreatedDate() ) );
        beerOrderLineDto.lastModifiedDate( dateMapper.asOffsetDateTime( line.getLastModifiedDate() ) );
        beerOrderLineDto.beerId( line.getBeerId() );
        beerOrderLineDto.orderQuantity( line.getOrderQuantity() );

        return beerOrderLineDto.build();
    }

    @Override
    public BeerOrderLine dtoToBeerOrderLine(BeerOrderLineDto dto) {
        if ( dto == null ) {
            return null;
        }

        BeerOrderLineBuilder beerOrderLine = BeerOrderLine.builder();

        beerOrderLine.id( dto.getId() );
        if ( dto.getVersion() != null ) {
            beerOrderLine.version( dto.getVersion().longValue() );
        }
        beerOrderLine.createdDate( dateMapper.asTimestamp( dto.getCreatedDate() ) );
        beerOrderLine.lastModifiedDate( dateMapper.asTimestamp( dto.getLastModifiedDate() ) );
        beerOrderLine.beerId( dto.getBeerId() );
        beerOrderLine.orderQuantity( dto.getOrderQuantity() );

        return beerOrderLine.build();
    }
}
