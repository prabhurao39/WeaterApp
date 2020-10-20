package com.ps.weather.model;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Weather {
  long id;
  String main;
  String description;
  String icon;
}
