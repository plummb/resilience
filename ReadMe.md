# README #

### What is this repository for? ###
* This demonstrates the power of Plummb. It also provides a way to play around with pre-configured rule.

## Features ##
* SimulationTest 
    * Delay Action
    * Throw Exception Action
* ResilienceTest
    * Retry Action
* CircuitBreakerTest
    * Circuit Breaker Action
        * Closed Circuit
        * Open Circuit
        * Half-Open Circuit
* MorphingTest
    * Morphing a sensitive Exception message
* ExpensiveServiceTest
    * Method Logging
    * Pending Method Logging
        
## IP Tracking ##
* IP is NOT tracked for this account.
  
## Pre-requisites ##
* Java 7+
* Maven 3.3.9 or above

## How do I set it up? ##
* The project contains a bundled Plummb Jar file.

## Working with Latest Plummb Jar ##
* Login to www.plummb.com
* Download appropriate Plummb tar from Help link
* Follow the process to install Plummb Jar
* Remove 2 lines from pom.xml

## Playing Around ##
* TheContext is the object to play around. By default all are enabled.
    * Set simulationEnabled flag to enable/disable Simulation Rule 
    * Set resilienceEnabled flag to enable/disable Resilience Rule
    * Set circuitEnabled flag to enable/disable Circuit Breakers

### Who do I talk to? ###
* Repo owner : support@plummb.com
