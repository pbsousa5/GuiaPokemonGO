package br.com.extractor.guiapokemongo.model;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by muryllo.santos on 25/07/2016.
 */
public class Move extends RealmObject {

    @PrimaryKey
    private String uuid;
    private String name;
    private Double dps;
    private Integer type;
    private Integer charges;
    private Boolean primary;

    public Move() {}

    public String getUuid() {
        return uuid;
    }
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Double getDps() {
        return dps;
    }
    public void setDps(Double dps) {
        this.dps = dps;
    }

    public Integer getType() {
        return type;
    }
    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getCharges() {
        return charges;
    }
    public void setCharges(Integer charges) {
        this.charges = charges;
    }

    public Boolean getPrimary() {
        return primary;
    }
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }
}
