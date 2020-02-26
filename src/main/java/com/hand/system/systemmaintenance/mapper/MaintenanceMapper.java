package com.hand.system.systemmaintenance.mapper;

import com.hand.system.systemmaintenance.dto.Maintenance;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MaintenanceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Maintenance record);

    int insertSelective(Maintenance record);

    Maintenance selectByPrimaryKey(Integer id);

    List<Maintenance> queryAll();

    int updateByPrimaryKeySelective(Maintenance record);

    int updateByPrimaryKey(Maintenance record);

    void changeStatus(@Param("id")Integer id, @Param("status")String status );

    List<Maintenance> query(Maintenance maintenance);
}
