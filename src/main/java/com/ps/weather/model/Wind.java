package com.ps.weather.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Wind {
  double speed;
  double deg;
}
