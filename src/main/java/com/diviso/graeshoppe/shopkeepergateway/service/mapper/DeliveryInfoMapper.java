package com.diviso.graeshoppe.shopkeepergateway.service.mapper;

import org.mapstruct.*;

import com.diviso.graeshoppe.shopkeepergateway.client.store.model.DeliveryInfo;
import com.diviso.graeshoppe.shopkeepergateway.client.store.model.DeliveryInfoDTO;



/**
 * Mapper for the entity DeliveryInfo and its DTO DeliveryInfoDTO.
 */
@Mapper(componentModel = "spring", uses = {StoreMapper.class, TypeMapper.class})
public interface DeliveryInfoMapper extends EntityMapper<DeliveryInfoDTO, DeliveryInfo> {

    @Override
	@Mapping(source = "store.id", target = "storeId")
    @Mapping(source = "type.id", target = "typeId")
    DeliveryInfoDTO toDto(DeliveryInfo deliveryInfo);

    @Override
	@Mapping(source = "storeId", target = "store")
    @Mapping(source = "typeId", target = "type")
    DeliveryInfo toEntity(DeliveryInfoDTO deliveryInfoDTO);

    default DeliveryInfo fromId(Long id) {
        if (id == null) {
            return null;
        }
        DeliveryInfo deliveryInfo = new DeliveryInfo();
        deliveryInfo.setId(id);
        return deliveryInfo;
    }
}