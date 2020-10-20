package com.ps.weather.model;

import lombok.Data;

@Data
public class City {
  String id;
  String name;
  Coordinates coord;
  String country;

  public String toString() {
    return id + " " + name + " " + coord.toString() + " " + country;
  }
}
