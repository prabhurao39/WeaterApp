package com.ps.weather;

import java.util.List;
import com.ps.weather.model.City;
import com.ps.weather.model.WeatherInfo;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherResponse {
  int cod;
  double message;
  long cnt;
  
  List<WeatherInfo> list;
  City city;
}
