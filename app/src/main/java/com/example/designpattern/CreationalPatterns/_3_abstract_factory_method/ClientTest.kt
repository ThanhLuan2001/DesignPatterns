package com.example.designpattern.CreationalPatterns._3_abstract_factory_method

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Laptop
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method._interface.Phone
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.abstract_class.ElectronicDeviceAbstractFactory
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.enum.Segment
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.factory.ElectronicDeviceFactory

fun main(){
    val highEndDeviceFactory : ElectronicDeviceAbstractFactory = ElectronicDeviceFactory.getFactory(
        Segment.HIGH_END)

    val highEndLaptop : Laptop = highEndDeviceFactory.getLaptop()
    val highEndPhone : Phone = highEndDeviceFactory.getPhone()
    println(highEndLaptop.getSegment())
    println(highEndPhone.getSegment())
    println("===========================")

    val midRangeDeviceFactory : ElectronicDeviceAbstractFactory = ElectronicDeviceFactory.getFactory(Segment.MID_RANGE)

    val midRangeLaptop : Laptop = midRangeDeviceFactory.getLaptop()
    val midRangePhone : Phone = midRangeDeviceFactory.getPhone()
    println(midRangeLaptop.getSegment())
    println(midRangePhone.getSegment())

}