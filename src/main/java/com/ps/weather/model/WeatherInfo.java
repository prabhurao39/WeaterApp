package com.ps.weather.model;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WeatherInfo {
  long dt;
  Main main;
  List<Weather> weather;
  Clouds clouds;
  Wind wind;
  String rain;
  String snow;
  SysInfo sys;
  String dt_txt;
}
