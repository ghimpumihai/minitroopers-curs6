package com.bmw.maintenance.domaininteraction;

import com.arjuna.ats.internal.jdbc.drivers.modifiers.list;
import com.bmw.maintenance.domain.MaintenanceTask;
import com.bmw.maintenance.domain.ScannerType;
import com.bmw.maintenance.domain.TaskType;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@ApplicationScoped
@Named("DIAGNOSTIC_SCAN")
public class DiagnosticScanFactory implements TaskFactory{
    @Override
    public MaintenanceTask createTask(String vin, String notes, Map<String, Object> data) {
        return MaintenanceTask.createDiagnosticScan(
                vin,
                notes,
                (List<String>) data.getOrDefault("errorCodes", new ArrayList<String>()),
                ScannerType.valueOf((String)data.getOrDefault("scannerType", "BASIC")));
    }
}
