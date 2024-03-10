package com.example.designpattern.CreationalPatterns._3_abstract_factory_method.factory

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class.HighEndLaptop
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class.HighEndPhone
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Laptop
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Phone
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.abstract_class.ElectronicDeviceAbstractFactory

class HighEndDeviceFactory : ElectronicDeviceAbstractFactory(){
    override fun getPhone(): Phone {
        return HighEndPhone()
    }

    override fun getLaptop(): Laptop {
        return HighEndLaptop()
    }
}