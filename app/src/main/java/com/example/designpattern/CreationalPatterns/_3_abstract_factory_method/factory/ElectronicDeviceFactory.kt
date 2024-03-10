package com.example.designpattern.CreationalPatterns._3_abstract_factory_method.factory

import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.abstract_class.ElectronicDeviceAbstractFactory
import com.example.designpattern.CreationalPatterns._3_abstract_factory_method.enum.Segment

class ElectronicDeviceFactory {

    companion object{
        fun getFactory(segment: Segment) : ElectronicDeviceAbstractFactory {
            when(segment){
                Segment.MID_RANGE -> return MidRangeDeviceFactory()
                Segment.HIGH_END -> return HighEndDeviceFactory()
                else -> throw UnsupportedOperationException("This device is unsupported")
            }
        }
    }
}