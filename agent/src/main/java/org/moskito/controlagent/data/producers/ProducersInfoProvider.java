package org.moskito.controlagent.data.producers;

import net.anotheria.moskito.core.producers.IStats;
import net.anotheria.moskito.core.producers.IStatsProducer;
import net.anotheria.moskito.core.registry.ProducerRegistryAPIFactory;

import java.util.LinkedList;
import java.util.List;

public class ProducersInfoProvider {

    public static List<ProducerInfo> getProducers(){

        List<ProducerInfo> producersInfo = new LinkedList<>();

        List<IStatsProducer> producers =
                new ProducerRegistryAPIFactory().createProducerRegistryAPI().getAllProducers();

        for(IStatsProducer producer : producers){

            ProducerInfo producerInfo = new ProducerInfo();
            producerInfo.setId(producer.getProducerId());
            producerInfo.setCategory(producer.getCategory());
            producerInfo.setSubsystem(producer.getSubsystem());

            List<StatsInfo> statsInfos = new LinkedList<>();

            for(Object _stats : producer.getStats()){

                IStats stats = (IStats)_stats;

                StatsInfo statsInfo = new StatsInfo();
                statsInfo.setName(stats.getName());
                statsInfo.setValuesNames(stats.getAvailableValueNames());
                statsInfos.add(statsInfo);

            }

            producerInfo.setStats(statsInfos);
            producersInfo.add(producerInfo);

        }

        return producersInfo;

    }

}
