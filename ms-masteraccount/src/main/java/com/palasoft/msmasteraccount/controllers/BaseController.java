package com.palasoft.msmasteraccount.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Represents the controller for entryPoint
 */
@RestController
@RequestMapping("/master-account")
public class BaseController {

    @GetMapping(value = "/")
    String entry() {
        return "Welcome to MasterAccount MS";
    }



}
