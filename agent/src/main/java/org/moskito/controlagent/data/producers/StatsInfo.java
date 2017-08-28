package org.moskito.controlagent.data.producers;

import java.io.Serializable;
import java.util.List;

public class StatsInfo implements Serializable{

    private String name;
    private List<String> valuesNames;

    public List<String> getValuesNames() {
        return valuesNames;
    }

    void setValuesNames(List<String> valuesNames) {
        this.valuesNames = valuesNames;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

}
