package com.bmw.maintenance.domaininteraction;

import com.bmw.maintenance.domain.MaintenanceTask;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.Map;

@ApplicationScoped
@Named("OIL_CHANGE")
public class OilChangeFactory implements TaskFactory{

    @Override
    public MaintenanceTask createTask(String vin, String notes, Map<String, Object> data) {
        return MaintenanceTask.createOilChange(vin,notes);
    }
}
