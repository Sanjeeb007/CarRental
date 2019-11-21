package com.sanjeeb.carrental.implement;

import com.sanjeeb.carrental.model.Datacenter;

public interface TabLayoutInterface {
    boolean adduser(Datacenter dc);

    boolean Checkuser(String name, String password);
}
