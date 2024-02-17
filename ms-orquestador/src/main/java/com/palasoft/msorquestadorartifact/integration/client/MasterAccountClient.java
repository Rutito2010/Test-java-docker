package com.palasoft.msorquestadorartifact.integration.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * Represents the client integration for master account ms
 */
@FeignClient(value = "ms-masteraccount", url = "${MASTER_ACCOUNTS_MS}")
public interface MasterAccountClient {
    /**
     * Entry Point of masterAccount ms
     * @return String {@link String}
     */
    @GetMapping(path = "master-account/")
        String entryPoint();
}
