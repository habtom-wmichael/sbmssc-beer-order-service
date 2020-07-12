package com.sbmssc.beerorder.app.sbmsscbeerorderservice.web.model;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.UUID;
@EqualsAndHashCode
@Data
@NoArgsConstructor
public class CustomerDto extends BaseItem {
    private String name;
    @Builder
    public CustomerDto(UUID id, Integer version, OffsetDateTime createdDate, OffsetDateTime lastModifiedDate, String name) {
        super(id, version, createdDate, lastModifiedDate);
        this.name = name;
    }


}
