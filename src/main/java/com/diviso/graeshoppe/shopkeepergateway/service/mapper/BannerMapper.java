package com.diviso.graeshoppe.shopkeepergateway.service.mapper;

import org.mapstruct.*;


import com.diviso.graeshoppe.shopkeepergateway.client.store.model.Banner;
import com.diviso.graeshoppe.shopkeepergateway.client.store.model.BannerDTO;

/**
 * Mapper for the entity Banner and its DTO BannerDTO.
 */
@Mapper(componentModel = "spring", uses = {StoreMapper.class})
public interface BannerMapper extends EntityMapper<BannerDTO, Banner> {

    @Override
	@Mapping(source = "store.id", target = "storeId")
    BannerDTO toDto(Banner banner);

    @Override
	@Mapping(source = "storeId", target = "store")
    Banner toEntity(BannerDTO bannerDTO);

    default Banner fromId(Long id) {
        if (id == null) {
            return null;
        }
        Banner banner = new Banner();
        banner.setId(id);
        return banner;
    }
}