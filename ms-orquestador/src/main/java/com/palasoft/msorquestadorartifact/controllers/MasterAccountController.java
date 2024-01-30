package com.palasoft.msorquestadorartifact.controllers;

import com.palasoft.msorquestadorartifact.services.MasterAccountService;
import com.palasoft.msorquestadorartifact.services.impl.MasterAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prueba")
public class MasterAccountController {
    MasterAccountService masterAccountService;

    @Autowired
    MasterAccountController(MasterAccountService masterAccountService){
        this.masterAccountService = masterAccountService;
    }

    // controller -> service(entre la logica de negocio del servicio estara la llamada a otro ms)
    @GetMapping(value = "/saludar", produces = MediaType.APPLICATION_JSON_VALUE)
    String saludar(){
        return this.masterAccountService.getSaludo();
    }

}
