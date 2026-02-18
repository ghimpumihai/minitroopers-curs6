package com.bmw.maintenance.domaininteraction;

import com.bmw.maintenance.domain.MaintenanceTask;

import java.util.Map;

public interface TaskFactory {
    MaintenanceTask createTask(String vin, String notes, Map<String,Object> data);
}
