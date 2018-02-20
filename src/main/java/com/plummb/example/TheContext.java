/*
 * Copyright © 2018 Plummb Technologies. All rights reserved.
 */

package com.plummb.example;

/**
 * The context.
 * One can set appropriate flag to enable/disable Simulation, Resilience or Circuit Breaker.
 */
public class TheContext {
  private static final ThreadLocal<TheContext> THREAD_LOCAL = new ThreadLocal<>();
  private String name;
  private boolean simulationEnabled;
  private boolean resilienceEnabled;
  private boolean circuitEnabled;
  private boolean morphEnabled;

  public static TheContext getContext() {
    return THREAD_LOCAL.get();
  }

  public static void setContext(TheContext theContext) {
    THREAD_LOCAL.set(theContext);
  }

  /**
   * Gets name.
   *
   * @return the name
   */
  public String getName() {
    return name;
  }

  /**
   * Sets name.
   *
   * @param name the name
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Is simulation enabled boolean.
   *
   * @return the boolean
   */
  public boolean isSimulationEnabled() {
    return simulationEnabled;
  }

  /**
   * Sets simulation enabled.
   *
   * @param simulationEnabled the simulation enabled
   */
  public void setSimulationEnabled(boolean simulationEnabled) {
    this.simulationEnabled = simulationEnabled;
  }

  /**
   * Is resilience enabled boolean.
   *
   * @return the boolean
   */
  public boolean isResilienceEnabled() {
    return resilienceEnabled;
  }

  /**
   * Sets resilience enabled.
   *
   * @param resilienceEnabled the resilience enabled
   */
  public void setResilienceEnabled(boolean resilienceEnabled) {
    this.resilienceEnabled = resilienceEnabled;
  }

  /**
   * Is circuit enabled boolean.
   *
   * @return the boolean
   */
  public boolean isCircuitEnabled() {
    return circuitEnabled;
  }

  /**
   * Sets circuit enabled.
   *
   * @param circuitEnabled the circuit enabled
   */
  public void setCircuitEnabled(boolean circuitEnabled) {
    this.circuitEnabled = circuitEnabled;
  }

  /**
   * Is morph enabled boolean.
   *
   * @return the boolean
   */
  public boolean isMorphEnabled() {
    return morphEnabled;
  }

  /**
   * Sets morph enabled.
   *
   * @param morphEnabled the morph enabled
   * @return the morph enabled
   */
  public TheContext setMorphEnabled(boolean morphEnabled) {
    this.morphEnabled = morphEnabled;
    return this;
  }
}
