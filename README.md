# Microservices with Springboot and Kafka as a Message Broker.

<p align"center">
  <img src="https://snipboard.io/UO84JC.jpg"/>
</p>


## Description of Project

Simple Example of Microservices with Event-Driven Architecture with Multiple Consumers. 

## Functionalities

:bell: Event-Driven Microservices using Spring boot and Kafka.

:bell: Asynchronous communication.

:bell: Message/Event Producer subscribed.

:bell: Two Message/Event Consumers subscribed.


## Tools and technologies used:
  1. Java 17+

  2. Spring boot

  3. Microservices

  4. Kafka

  5. Maven

  6. Intellij Idea

  7. Postman


## Steps and Requirements to build and run the Project

**1. Clone the application.**
```bash
git clone https://github.com/SergioRuyDev/springboot-kafka-microservices.git
```
**2. Use the terminal to go inside of the folder kafka_2.13-3.3.1 and run in two diferents tabs, the commands below.**
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
bin/kafka-server-start.sh config/server.properties
```
**3. In your prefered IDE run in sequence as a Java application the classes below.**
```bash
OrderServiceApplication
StockServiceApplication
EmailServiceApplication
```
**4. Use the Postman for test the POST Request.**
```bash
POST - URL - http://localhost:8080/api/v1/orders
Body Example
{
    "orderName": "Notebook",
    "qty": 1,
    "price": 4000
}
Response - 200 Ok - Order placed successfully...
```
