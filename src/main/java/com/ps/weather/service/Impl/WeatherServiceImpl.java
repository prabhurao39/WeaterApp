package com.ps.weather.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ps.weather.ApiConstants;
import com.ps.weather.WeatherResponse;
import com.ps.weather.service.WeatherService;

@Service
public class WeatherServiceImpl implements WeatherService {

  @Autowired
  private RestTemplate restTemplate;

  @Override
  public WeatherResponse getData(String city) {
    ObjectMapper mapper = new ObjectMapper();
    WeatherResponse response = null;
    String result = restTemplate.getForObject(ApiConstants.GET_WEATHER_URL, String.class);
    try {
      response = mapper.readValue(result, WeatherResponse.class);
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    return response;
  }


}
