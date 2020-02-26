package com.hand.system.systemmaintenance.service.impl;

import com.hand.system.systemmaintenance.dto.Maintenance;
import com.hand.system.systemmaintenance.mapper.MaintenanceMapper;
import com.hand.system.systemmaintenance.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MaintenanceServiceImpl implements MaintenanceService {

    @Autowired
    MaintenanceMapper maintenanceMapper;

    @Override
    public Maintenance queryById(Integer id){
        return maintenanceMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Maintenance> queryAll() {
        return maintenanceMapper.queryAll();
    }

    @Override
    public void save(Maintenance maintenance) {
        maintenanceMapper.insert(maintenance);
    }

    @Override
    public void deleteById(Integer id) {
        maintenanceMapper.deleteByPrimaryKey(id);
    }

    @Override
    public void changStatus(Integer id,String status) {
        maintenanceMapper.changeStatus(id,status);
    }

    @Override
    public List<Maintenance> query(Maintenance maintenance) {
        return maintenanceMapper.query(maintenance);
    }
}
