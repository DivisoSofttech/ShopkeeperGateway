package com.diviso.graeshoppe.shopkeepergateway.service.mapper;

import com.diviso.graeshoppe.shopkeepergateway.client.product.model.Manufacturer;
import com.diviso.graeshoppe.shopkeepergateway.client.product.model.ManufacturerDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-01-06T17:25:33+0530",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class ManufacturerMapperImpl implements ManufacturerMapper {

    @Override
    public Manufacturer toEntity(ManufacturerDTO dto) {
        if ( dto == null ) {
            return null;
        }

        Manufacturer manufacturer = new Manufacturer();

        manufacturer.setIDPcode( dto.getIDPcode() );
        manufacturer.setId( dto.getId() );
        manufacturer.setName( dto.getName() );

        return manufacturer;
    }

    @Override
    public ManufacturerDTO toDto(Manufacturer entity) {
        if ( entity == null ) {
            return null;
        }

        ManufacturerDTO manufacturerDTO = new ManufacturerDTO();

        manufacturerDTO.setIDPcode( entity.getIDPcode() );
        manufacturerDTO.setId( entity.getId() );
        manufacturerDTO.setName( entity.getName() );

        return manufacturerDTO;
    }

    @Override
    public List<Manufacturer> toEntity(List<ManufacturerDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<Manufacturer> list = new ArrayList<Manufacturer>( dtoList.size() );
        for ( ManufacturerDTO manufacturerDTO : dtoList ) {
            list.add( toEntity( manufacturerDTO ) );
        }

        return list;
    }

    @Override
    public List<ManufacturerDTO> toDto(List<Manufacturer> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<ManufacturerDTO> list = new ArrayList<ManufacturerDTO>( entityList.size() );
        for ( Manufacturer manufacturer : entityList ) {
            list.add( toDto( manufacturer ) );
        }

        return list;
    }
}
