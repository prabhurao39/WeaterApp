package com.ps.weather.api;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.ps.weather.WeatherResponse;
import io.swagger.annotations.ApiParam;

@RequestMapping(path="/weather")
public interface WeatherApi {
  
  @GetMapping(value="/getInfo/{city}", produces= {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<WeatherResponse> getInfo(@ApiParam(value="city name",
  required = true) @PathVariable String city);
  
  @PostMapping(value="/putInfo/{city}", consumes= {MediaType.APPLICATION_JSON_VALUE})
  public ResponseEntity<String> putInfo(@ApiParam(value="city name",
  required = true) @PathVariable String city, @RequestBody WeatherResponse request);
}
