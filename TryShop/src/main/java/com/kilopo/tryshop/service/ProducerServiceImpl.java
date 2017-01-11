package com.kilopo.tryshop.service;

import com.kilopo.tryshop.entity.Producer;
import com.kilopo.tryshop.repository.ProducerRepository;
import com.kilopo.tryshop.service.interfaces.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {

    @Autowired
    ProducerRepository producerRepository;

    public boolean addFromFile(String path) {
        File file = new File(path);
        Producer producer;

        String s;
        String[] sm;

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                while ((s = in.readLine()) != null) {
                    sm = s.split(",");
                    producer = new Producer();
                    producer.setName(sm[0]);
                    producer.setAddress(sm[1]);
                    producer.setPhone(sm[2]);
                    producerRepository.save(producer);
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public boolean updateFromFile(String path) {
        File file = new File(path);
        Producer producer;

        String s;
        String[] sm;

        try {
            BufferedReader in = new BufferedReader(new FileReader(file.getAbsoluteFile()));
            try {
                while ((s = in.readLine()) != null) {
                    sm = s.split(",");
                    producer = new Producer();
                    producer.setId(Long.parseLong(sm[0]));
                    producer.setName(sm[1]);
                    producer.setAddress(sm[2]);
                    producer.setPhone(sm[3]);
                    producerRepository.save(producer);
                }

            } finally {
                in.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return true;
    }

    public List<Producer> getAllProducers() {
        return producerRepository.findAll();
    }

    public Producer getProducerById(long id) {
        return producerRepository.findOne(id);
    }

    public boolean addProducer(Producer producer) {
        producerRepository.saveAndFlush(producer);
        return true;
    }

    public boolean deleteProducer(long id) {
        producerRepository.delete(id);
        return true;
    }


}
