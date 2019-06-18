package com.lsantamaria.designpatterns.structural.facade;

import com.lsantamaria.designpatterns.structural.facade.subsystem.Encoder;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Filter;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Quantifier;
import com.lsantamaria.designpatterns.structural.facade.subsystem.Sampler;

public class ADConverterFacade extends ConverterFacade {
  private Filter filter;
  private Sampler sampler;
  private Quantifier quantifier;
  private Encoder encoder;

  public ADConverterFacade(Filter filter,
      Sampler sampler,
      Quantifier quantifier,
      Encoder encoder) {
    this.filter = filter;
    this.sampler = sampler;
    this.quantifier = quantifier;
    this.encoder = encoder;
  }

  @Override
  public Signal convert(Signal inputSignal) {
    Signal filtered = filter.filter(inputSignal);
    Signal sampled = sampler.sample(filtered);
    Signal quantified = quantifier.quantify(sampled);
    Signal encoded = encoder.encode(quantified);
    return encoded;
  }
}
