package com.lsantamaria.designpatterns.structural.facade;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.lsantamaria.designpatterns.structural.facade.subsystem.Encoder;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Filter;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Quantifier;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Sampler;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.AntialiasingFilter;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.Encoder8Bits;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.NormalizedQuantifier;
import com.lsantamaria.designpatterns.structural.facade.subsystem.impl.NyquistSampler;
import org.junit.Test;
import org.mockito.Mockito;

public class FacadeTests {

  @Test
  public void testFacadeOk() {
    Filter filter = mock(AntialiasingFilter.class);
    Sampler sampler = mock(NyquistSampler.class);
    Quantifier quantifier = mock(NormalizedQuantifier.class);
    Encoder encoder = mock(Encoder8Bits.class);
    Signal outputSignal = mock(Signal.class);

    when(filter.filter(any(Signal.class))).thenReturn(outputSignal);
    when(sampler.sample(any(Signal.class))).thenReturn(outputSignal);
    when(quantifier.quantify(any(Signal.class))).thenReturn(outputSignal);
    when(encoder.encode(any(Signal.class))).thenReturn(outputSignal);

    Signal analogSignal = new AnalogSignal();

    ConverterFacade converterFacade = new ADConverterFacade(filter, sampler, quantifier, encoder);
    converterFacade.convert(analogSignal);

    Mockito.verify(filter, Mockito.times(1)).filter(any(Signal.class));
    Mockito.verify(sampler, Mockito.times(1)).sample(any(Signal.class));
    Mockito.verify(quantifier, Mockito.times(1)).quantify(any(Signal.class));
    Mockito.verify(encoder, Mockito.times(1)).encode(any(Signal.class));
  }

}
