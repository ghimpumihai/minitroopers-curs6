package com.bmw.maintenance.domaininteraction;

import com.bmw.maintenance.domain.MaintenanceTask;
import com.bmw.maintenance.domain.TirePosition;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.Map;

@ApplicationScoped
@Named("TIRE_SERVICE")
public class TireServiceFactory implements TaskFactory{
    @Override
    public MaintenanceTask createTask(String vin, String notes, Map<String, Object> data) {
        return MaintenanceTask.createTireChange(
                vin,
                notes,
                TirePosition.valueOf((String)data.getOrDefault("tirePosition","ALL")));
    }
}
