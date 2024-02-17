package com.palasoft.msorquestadorartifact.services.impl;

import com.palasoft.msorquestadorartifact.integration.client.MasterAccountClient;
import com.palasoft.msorquestadorartifact.services.MasterAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for master account ms
 */
@Service
public class MasterAccountServiceImpl implements MasterAccountService {
    private final MasterAccountClient masterAccountClient;
    /**
     * Constructor
     * @param masterAccountClient {@link MasterAccountClient}
     */
    @Autowired
    public MasterAccountServiceImpl(final MasterAccountClient masterAccountClient) {
        this.masterAccountClient = masterAccountClient;
    }

    @Override
    public String entryPointMasterAccountMS() {
        return this.masterAccountClient.entryPoint();
    }
}
