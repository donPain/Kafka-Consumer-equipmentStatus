package com.dagobah.solinftec.service;
import com.dagobah.solinftec.controller.EquipmentStatusController;
import com.dagobah.solinftec.model.EquipmentStatus;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.handler.annotation.Headers;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;

import static com.fasterxml.jackson.databind.type.LogicalType.DateTime;

@Service
@RestController
public class KafkaConsumerService {

    EquipmentStatusController equipmentStatusController = new EquipmentStatusController();

    @KafkaListener(topics = "EQUIPMENT_STATUS_2", groupId = "sample-group",containerFactory = "kafkaListener")
    public void consume(@Payload EquipmentStatus equipmentStatus, @Headers MessageHeaders messageHeaders){
        equipmentStatusController.saveEquipmentStatus(equipmentStatus);
    }
    @GetMapping("/getEquipmentStatus")
    public ArrayList<EquipmentStatus> getEquipmentStatusJson(){
        return equipmentStatusController.getEquipmentStatusJson();
    }

    @GetMapping("getEquipmentStatusByClientId")
    public List<EquipmentStatus> getEquipmentStatusByClientId(@RequestParam(required = true) String clientId){
        return equipmentStatusController.getEquipmentStatusJsonArrByClientId(clientId);

    }
}