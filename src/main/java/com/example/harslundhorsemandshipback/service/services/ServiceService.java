package com.example.harslundhorsemandshipback.service.services;

import com.example.harslundhorsemandshipback.service.models.Service;

import java.util.List;
import java.util.Optional;

public interface ServiceService {
    Optional<Service> createService(Service service);
    List<Service> readServices();
    Optional<Service> updateService(Service service);
    boolean deleteService(Service service);
}
