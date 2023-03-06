package com.philimonov.spring.rest;

import com.philimonov.spring.rest.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Component
public class Communication {

    private final String URL = "http://localhost:8080/api/employees";

    @Autowired
    private RestTemplate restTemplate;

    public List<Employee> getAllEmployees() {
        ResponseEntity<List<Employee>> responseEntity = restTemplate.exchange(URL, HttpMethod.GET, null, new ParameterizedTypeReference<List<Employee>>() {
        });
        List<Employee> allEmployees = responseEntity.getBody();

        return allEmployees;
    }

    public Employee getEmployee(int id) {
        return null;
    }

    public void saveEmployee(int id) {

    }

    public void deleteEmployee(int id) {

    }
}