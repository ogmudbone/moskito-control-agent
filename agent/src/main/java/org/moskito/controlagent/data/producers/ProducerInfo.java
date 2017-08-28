package org.moskito.controlagent.data.producers;

import java.io.Serializable;
import java.util.List;

public class ProducerInfo implements Serializable{

    private List<StatsInfo> stats;
    private String id;
    private String category;
    private String subsystem;

    public List<StatsInfo> getStats() {
        return stats;
    }

    void setStats(List<StatsInfo> stats) {
        this.stats = stats;
    }

    public String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    void setCategory(String category) {
        this.category = category;
    }

    public String getSubsystem() {
        return subsystem;
    }

    void setSubsystem(String subsystem) {
        this.subsystem = subsystem;
    }

}
