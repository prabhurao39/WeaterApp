package com.ps.weather.model;
import lombok.Data;

@Data
public class Main {
  double temp;
  double temp_min;
  double temp_max;
  double pressure;
  double sea_level;
  double grnd_level;
  int humidity;
  double temp_kf;
}
