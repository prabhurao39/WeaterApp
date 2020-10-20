package com.ps.weather.service;

import com.ps.weather.WeatherResponse;

public interface WeatherService {
  public WeatherResponse getData(String city);
}
