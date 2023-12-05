package com.example.harslundhorsemandshipback.service.services.impl;

import com.example.harslundhorsemandshipback.service.models.Service;
import com.example.harslundhorsemandshipback.service.repositories.ServiceRepository;
import com.example.harslundhorsemandshipback.service.services.PracticeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ServiceServiceImpl implements PracticeService {
    @Autowired
    ServiceRepository serviceRepository;

    @Override
    public Optional<Service> createService(Service service){
        return Optional.of(serviceRepository.save(service));
    }

    @Override
    public List<Service> readServices(){
        return serviceRepository.findAll();
    }

    @Override
    public Optional<Service> updateService(Service service){
        Optional<Service> practiceFound = serviceRepository.findById(service.getId());

        if(practiceFound.isPresent()){
            return Optional.of(serviceRepository.save(service));
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteService(Service service){
        Optional<Service> practiceFound = serviceRepository.findById(service.getId());

        if(practiceFound.isPresent()){
            serviceRepository.delete(practiceFound.get());
            return true;
        }
        return false;
    }
}
