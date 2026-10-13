# Online Order Processing — Facade Pattern

A simple Java project demonstrating the **Facade Design Pattern** using an online order processing system.

## Design Pattern

The Facade pattern provides a simplified interface to a complex subsystem.

In this project, `OrderFacade` coordinates three services:

- **InventoryService** — checks product availability, calculates prices, and manages stock.
- **PaymentProcessor** — processes payments and refunds.
- **ShippingService** — validates addresses and creates shipments.

## How It Works

The client places an order through a single method:

```java
OrderFacade facade = new OrderFacade();
boolean success = facade.placeOrder("book", 2, "Astana");
```

The Facade handles the following steps:

1. Calculate the total price.
2. Reserve products.
3. Process payment.
4. Create shipment.
5. Roll back completed operations if a step fails.

## Project Structure

```text
src/
├── Main.java
├── OrderFacade.java
├── InventoryService.java
├── PaymentProcessor.java
└── ShippingService.java
```

## Technologies

- Java
- Facade Design Pattern
- Object-Oriented Programming (OOP)

## Running the Project

Run `Main.java` in IntelliJ IDEA or any Java IDE.

## Clean Code Principles

- Single Responsibility Principle
- Meaningful naming
- Encapsulation
- Guard clauses
- Proper error handling and rollback

## Conclusion

The Facade pattern simplifies order processing by hiding subsystem interactions and providing a single interface for the client.
