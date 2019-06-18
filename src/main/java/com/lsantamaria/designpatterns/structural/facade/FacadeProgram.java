package com.lsantamaria.designpatterns.structural.facade;

import com.lsantamaria.designpatterns.structural.facade.subsystem.Encoder;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Filter;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Quantifier;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Sampler;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.AntialiasingFilter;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.Encoder8Bits;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.NormalizedQuantifier;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.NyquistSampler;

/**
 * The facade pattern allows to wrap all the calls to different components of a system in just one
 * by providing a unified interface to that system. Most of the times a client who uses a system
 * does not mind about the internal calls it needs to do to get the final result, so just with one
 * call would be enough to get the result.
 *
 * In this example we are going to exemplify that pattern by using the conversion of an analog
 * signal to digital. This is a process usually done by an ADC converter, that internally is
 * composed by different steps done by sub-components. In this case, the converter will be our
 * Facade, and all the subcomponents involved in the process will be called by that.
 */
public class FacadeProgram {


  public static void main(String... args){
    Filter filter = new AntialiasingFilter();
    Sampler sampler = new NyquistSampler();
    Quantifier quantifier = new NormalizedQuantifier();
    Encoder encoder = new Encoder8Bits();

    Signal signal = new AnalogSignal();

    System.out.println("Converting signal from analog to digital:\n ");
    ConverterFacade adcConverter = new ADConverterFacade(filter, sampler, quantifier, encoder);

    adcConverter.convert(signal);

    System.out.println("Conversion done!");

  }
}
