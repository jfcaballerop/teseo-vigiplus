package com.logesta.teseovigiplus.services;

import com.logesta.teseovigiplus.entity.Conductor;

public interface DriverService {
    public Conductor[] getDrivers(String id);
    public Conductor[] getDrivers(String id1,String id2);

}