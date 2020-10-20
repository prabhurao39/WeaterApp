package com.ps.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.ps.weather.api.WeatherApi;
import com.ps.weather.service.WeatherService;

@RestController
public class WeatherController implements WeatherApi {
  
  @Autowired
  WeatherService weatherServiceImpl;
  
  @Override
  public ResponseEntity<String> getInfo(String city) {
    String wRes = weatherServiceImpl.getData(city);
    return  new ResponseEntity<>(wRes, HttpStatus.ACCEPTED);
  }
  
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

}
