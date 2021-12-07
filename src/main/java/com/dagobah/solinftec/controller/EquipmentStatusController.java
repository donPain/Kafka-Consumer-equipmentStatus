package com.dagobah.solinftec.controller;

import com.dagobah.solinftec.model.EquipmentStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<EquipmentStatus> getEquipmentStatusJsonArrByClientId(String clientId){

        List<EquipmentStatus> equipmentStatusJsonArrByClientIdArr = new ArrayList<EquipmentStatus>();
        equipmentStatusJsonArrByClientIdArr = equipmentStatusJsonArr.stream().filter(equipmentStatus -> equipmentStatus.getClientId().contains(clientId)).collect(Collectors.toList());
        return equipmentStatusJsonArrByClientIdArr;

    }

}
