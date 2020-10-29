package com.codes.book.ticket.app.service;

import com.codes.book.ticket.app.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class EmployeeService {
    
    @Autowired
    private RestTemplate restTemplate;
 
    public Employee getEmployee(String id) {
	ResponseEntity resp =
          restTemplate.getForEntity("http://localhost:8080/employee/" + id, Employee.class);
        
	return resp.getStatusCode() == HttpStatus.OK ? (Employee) resp.getBody() : null;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
