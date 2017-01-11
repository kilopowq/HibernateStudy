package com.kilopo.tryshop.service.interfaces;

import com.kilopo.tryshop.entity.Producer;

import java.util.List;

public interface ProducerService {

    boolean addFromFile(String path);
    boolean updateFromFile(String path);
    List<Producer> getAllProducers();
    Producer getProducerById(long id);
    boolean addProducer(Producer producer);
    boolean deleteProducer(long id);

}
