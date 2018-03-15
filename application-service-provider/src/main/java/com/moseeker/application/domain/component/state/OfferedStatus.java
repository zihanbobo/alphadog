package com.moseeker.application.domain.component.state;

import com.moseeker.application.domain.ApplicationEntity;

/**
 * Created by jack on 16/01/2018.
 */
public class OfferedStatus extends ApplicationState {

    public OfferedStatus(ApplicationEntity applicationEntity) {
        super(applicationEntity, ApplicationStateRoute.Offered);
    }

    @Override
    public void refuse() {

    }

    @Override
    public ApplicationState pass() {
        return null;
    }

    @Override
    public ApplicationState backTo() {
        return null;
    }

    @Override
    void recover() {

    }
}
