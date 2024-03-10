package com.example.designpattern.CreationalPatterns._3_abstract_factory_method.factory

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class.MidRangeLaptop
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._class.MidRangePhone
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Laptop
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Phone
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.abstract_class.ElectronicDeviceAbstractFactory

class MidRangeDeviceFactory : ElectronicDeviceAbstractFactory() {
    override fun getPhone(): Phone {
        return MidRangePhone()
    }

    override fun getLaptop(): Laptop {
        return MidRangeLaptop()
    }
}