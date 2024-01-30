package com.palasoft.msorquestadorartifact.services.impl;

import com.palasoft.msorquestadorartifact.integration.client.PruebaClient;
import com.palasoft.msorquestadorartifact.services.MasterAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MasterAccountServiceImpl implements MasterAccountService {
    PruebaClient pruebaClient;
    //generalmente existe un cliente por ms a consultar
    @Autowired
    MasterAccountServiceImpl(PruebaClient pruebaClient) {
        this.pruebaClient = pruebaClient;
    }

    @Override
    public String getSaludo()
    {
        // En caso de necesitar manipularse se guarda en una variable
        //en caso de no necesitar manipulacion es posible realizar return this.pruebaClient.getSaludo();
        return this.pruebaClient.getSaludo();
    }
}
