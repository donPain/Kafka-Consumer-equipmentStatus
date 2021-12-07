package com.dagobah.solinftec.controller;

import com.dagobah.solinftec.model.EquipmentStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/kafka")
public class EquipmentStatusController {

    ArrayList<EquipmentStatus> equipmentStatusJsonArr = new ArrayList<EquipmentStatus>();

    public void saveEquipmentStatus(EquipmentStatus equipmentStatus){
        equipmentStatusJsonArr.add(equipmentStatus);
    }

    public ArrayList<EquipmentStatus> getEquipmentStatusJson(){
        return equipmentStatusJsonArr;
    }

}
