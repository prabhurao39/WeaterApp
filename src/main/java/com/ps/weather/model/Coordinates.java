package com.ps.weather.model;

import lombok.Data;

@Data
public class Coordinates {
  double lat;
  double lon;
  
  public String toString() {
    return lat + " " + lon;
  }
}
