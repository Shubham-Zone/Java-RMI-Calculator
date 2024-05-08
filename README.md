# Java RMI Calculator

![Java RMI Calculator](https://via.placeholder.com/800x300.png?text=Java+RMI+Calculator)

This repository contains a simple Remote Method Invocation (RMI) calculator application implemented in Java. The application allows clients to perform basic arithmetic operations remotely using RMI.

## Features

- Addition
- Subtraction
- Multiplication
- Division

## Getting Started

### Prerequisites

- Java Development Kit (JDK)
- Git

### Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/Shubham-Zone/Java-RMI-Calculator.git
   ```

2. Compile the Java files:

   ```bash
   javac *.java
   ```

3. Start the RMI registry:

   ```bash
   start rmiregistry
   ```

4. Run the server:

   ```bash
   java CalculatorServer
   ```

5. Run the client:

   ```bash
   java CalculatorClient
   ```

### Usage

```java
// Sample code for using the RMI Calculator

// Import the necessary packages
import rmi.Calculator;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            // Locate the RMI registry
            Registry registry = LocateRegistry.getRegistry("localhost");

            // Look up the remote object
            Calculator calculator = (Calculator) registry.lookup("CalculatorService");

            // Perform remote operations
            double result = calculator.add(5, 3);
            System.out.println("Addition Result: " + result);
        } catch (Exception e) {
            System.err.println("Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
```

## Acknowledgments

- This project is inspired by the concepts of Remote Method Invocation (RMI) in Java.

```
