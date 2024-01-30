package com.palasoft.msorquestadorartifact.integration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(value = "ms-masteraccount",url = "${MASTER_ACCOUNTS_MS}")
public interface PruebaClient {

@GetMapping(path = "master-account/prueba/saludar/")
String getSaludo();
}
