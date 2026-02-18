package com.bmw.maintenance.domaininteraction;

import com.bmw.maintenance.domain.MaintenanceTask;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;

import java.util.Map;

@ApplicationScoped
@Named("BRAKE_INSPECTION")
public class BrakeInspectionFactory implements TaskFactory{
    @Override
    public MaintenanceTask createTask(String vin, String notes, Map<String, Object> data) {
        return MaintenanceTask.createBrakeInspection(vin, notes);
    }
}
