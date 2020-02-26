package com.hand.system.systemmaintenance.controller;

import com.hand.system.systemmaintenance.dto.FilePath;
import com.hand.system.systemmaintenance.dto.Maintenance;
import com.hand.system.systemmaintenance.service.MaintenanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Controller
public class MaintenanceController {
    @Autowired
    MaintenanceService maintenanceService;

    @Autowired
    FilePath filePath;

    @RequestMapping(value = "/queryById",method = RequestMethod.GET)
    public String select(ModelMap map,Integer id){
        Maintenance maintenance = maintenanceService.queryById(id);
        map.addAttribute("maintenance",maintenance);
        return "creat_sys";
    }

    @RequestMapping("/queryAll")
    public String queryAll(ModelMap map){
        List<Maintenance> maintenances = maintenanceService.queryAll();
        map.addAttribute("maintenance",maintenances);
        return "sys_list";
    }



    @RequestMapping(value = "/save",method = RequestMethod.POST)
    public String save(@ModelAttribute Maintenance maintenance, @RequestParam("pic")MultipartFile file){
        maintenanceService.save(maintenance);
        if(file!=null){

        String fileName = file.getOriginalFilename();
        int size = (int) file.getSize();
        System.out.println(fileName + "-->" + size);
        String path = System.getProperty("user.dir")+filePath.getPath();
        File dest = new File(path + "/" + fileName);
        if(!dest.getParentFile().exists()){ //判断文件父目录是否存在
            dest.getParentFile().mkdir();
        }
        try {
            file.transferTo(dest); //保存文件
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        }
        return "forward:/queryAll";
    }

    @RequestMapping(value = "/query",method = RequestMethod.POST)
    public String query(@ModelAttribute Maintenance maintenance,ModelMap map){
        List<Maintenance> maintenances = maintenanceService.query(maintenance);
        map.addAttribute("maintenance",maintenances);
        return "sys_list";
    }

    @RequestMapping(value = "/deleteById",method = RequestMethod.GET)
    public String delete(Integer id){
        maintenanceService.deleteById(id);
        return "forward:/queryAll";
    }

    @RequestMapping(value = "/changeStatus",method = RequestMethod.GET)
    public String delete(Integer id,String status){

        maintenanceService.changStatus(id,status);
        return "forward:/queryAll";
    }
}
