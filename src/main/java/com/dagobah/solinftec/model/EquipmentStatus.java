package com.dagobah.solinftec.model;

public class EquipmentStatus {

    private String clientId;
    private String equipmentId;
    private String equipmentStatus;
    private String since;

    public EquipmentStatus(){};

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getEquipamentId() {
        return equipmentId;
    }

    public void setEquipamentId(String equipmentId) {
        this.equipmentId = equipmentId;
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipamentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public String getsince() {
        return since;
    }

    public void setsince(String since) {
        this.since = since;
    }

    public String getClientId() {
        return clientId;
    }

    public String toJson() {
        return "EquipmentJson{" +
                "clientId:" + clientId +
                ", equipmentId:" + equipmentId +
                ", equipmentStatus:" + equipmentStatus +
                ", since:" + since +
                '}';
    }



}
