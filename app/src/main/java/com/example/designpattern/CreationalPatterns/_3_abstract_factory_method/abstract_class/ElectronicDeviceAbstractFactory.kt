package com.example.designpattern.CreationalPatterns._3_abstract_factory_method.abstract_class

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Laptop
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Phone

abstract class ElectronicDeviceAbstractFactory {
    abstract fun getPhone() : Phone
    abstract fun getLaptop() : Laptop
}