package com.ps.weather.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ps.weather.WeatherResponse;
import com.ps.weather.api.WeatherApi;
import com.ps.weather.service.WeatherService;

@RestController
public class WeatherController implements WeatherApi {
  
  @Autowired
  WeatherService weatherServiceImpl;
  
  @Override
  public ResponseEntity<WeatherResponse> getInfo(String city) {
    return  new ResponseEntity<>(weatherServiceImpl.getData(city), HttpStatus.ACCEPTED);
  }
  
  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
  }

  @Override
  public ResponseEntity<String> putInfo(String city, WeatherResponse request) {
    System.out.println(request);
    return null;
  }


}
