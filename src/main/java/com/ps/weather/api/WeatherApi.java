package com.ps.weather.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.annotations.ApiParam;

@RequestMapping(path="/weather")
public interface WeatherApi {
  
  @GetMapping(value="/getInfo/{city}", produces= {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<String> getInfo(@ApiParam(value="city name",
  required = true) @PathVariable String city);
  
}
