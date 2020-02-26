package com.hand.system.systemmaintenance.service;

import com.hand.system.systemmaintenance.dto.Maintenance;

import java.util.List;

public interface MaintenanceService {
    public Maintenance queryById(Integer id);
    public List<Maintenance> queryAll();
    public void save(Maintenance maintenance);
    public void deleteById(Integer id);
    public void changStatus(Integer id,String status);
    public List<Maintenance> query(Maintenance maintenance);
}
