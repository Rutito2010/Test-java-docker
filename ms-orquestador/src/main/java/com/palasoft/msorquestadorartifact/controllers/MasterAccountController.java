package com.palasoft.msorquestadorartifact.controllers;

import com.palasoft.msorquestadorartifact.services.MasterAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Represents the controller for master account ms
 */
@RestController
@RequestMapping("/api/master-account-ms")
public class MasterAccountController {
    final private MasterAccountService masterAccountService;
    /**
     * Constructor
     * @param masterAccountService {@Link MasterAccountService}
     */
    @Autowired
    MasterAccountController(final MasterAccountService masterAccountService) {
        this.masterAccountService = masterAccountService;
    }
    /**
     * EntryPoint to ms master account ms
     * @return String {@link String}
     */
    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    String saludar() {
        return this.masterAccountService.entryPointMasterAccountMS();
    }

}
