package com.book.store.model;

public class TbCommonConfig {
    private String commonConfigId;

    private String configName;

    private String commonKey;

    private String commonValue;

    private String status;

    public String getCommonConfigId() {
        return commonConfigId;
    }

    public void setCommonConfigId(String commonConfigId) {
        this.commonConfigId = commonConfigId == null ? null : commonConfigId.trim();
    }

    public String getConfigName() {
        return configName;
    }

    public void setConfigName(String configName) {
        this.configName = configName == null ? null : configName.trim();
    }

    public String getCommonKey() {
        return commonKey;
    }

    public void setCommonKey(String commonKey) {
        this.commonKey = commonKey == null ? null : commonKey.trim();
    }

    public String getCommonValue() {
        return commonValue;
    }

    public void setCommonValue(String commonValue) {
        this.commonValue = commonValue == null ? null : commonValue.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}