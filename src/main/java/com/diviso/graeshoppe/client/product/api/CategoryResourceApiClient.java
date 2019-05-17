package com.diviso.graeshoppe.client.product.api;

import org.springframework.cloud.openfeign.FeignClient;

import com.diviso.graeshoppe.client.customer.ClientConfiguration;

@FeignClient(name="${product.name:product}", url="${product.url:34.73.191.107:8084/}", configuration = ClientConfiguration.class)
public interface CategoryResourceApiClient extends CategoryResourceApi {
}