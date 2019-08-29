# boot-consul-rabbitmq-msa
Microservices sample project uses a number of open source projects


What is it?
"Microservices", a trending buzz word nowadays. What problems does it solve?

Many organizations nowadays are driving the technology migrations and one of the biggest challenges is to migrate from monolithic application to micro-services based application.

This mircoservices-sample project demonstrates how multiple services run independently leveraging on the best microservices patterns to enable scale, performance and resilience.


Use case
The sample application has three services namely service-one, service-two and service-three. Each of the service has its own database service-one-db, service-two-db and service-three-db respectively. During the startup of the services, it persists the service name and an auto generated UUID in its perspective database and sends the data to the RabbitMQ exchange which then broadcasts the data to all the queues based on the routing key. Every microservices listens to its own RabbitMQ queue and keeps updating the database as and when it receives the data.

Below are the screens of the application.
<img width="1074" alt="01  Home" src="https://user-images.githubusercontent.com/42566418/63941249-d1754f80-ca88-11e9-9c3d-733221ee228b.png">



Clicking on the tab's one, two or three the data that you see on the screen is based on the data fetched by the respective service by calling its database.

<img width="1074" alt="02  One" src="https://user-images.githubusercontent.com/42566418/63941363-1b5e3580-ca89-11e9-961a-5c7011a8d7e9.png">

Notice that the UUID generated for service-one which lies in service-one-db is in sync with service-two and service-three tabs which is achieved by RabbitMQ (asychronous communication between microservices).

<img width="1074" alt="03  Two" src="https://user-images.githubusercontent.com/42566418/63941466-58c2c300-ca89-11e9-8ed9-e77bfa675d66.png">


<img width="1074" alt="04  Three" src="https://user-images.githubusercontent.com/42566418/63941581-90ca0600-ca89-11e9-8ac0-1dbd5058e49e.png">

Service Registration

During the initialization of a service, it would get registered to the discovery and registration server (which in our example is Hashicorp's Consul).

![microservices-sample (service registration sequence)](https://user-images.githubusercontent.com/42566418/63941718-cc64d000-ca89-11e9-91b1-26a5376e83f9.png)

Service Discovery

When one service (say api-gateway) needs to access a resource from another service (say service-one), all it has to do is ask discovery and registration server (Consul) to give one of the service-one's instance information.

![microservices-sample (service discovery sequence)](https://user-images.githubusercontent.com/42566418/63941836-0b932100-ca8a-11e9-98b9-4c32cab3deb2.png)

Architecture

Below is the architectural diagram for microservices sample project.

![Architecture](https://user-images.githubusercontent.com/42566418/63941926-3ed5b000-ca8a-11e9-9c0e-bd244a25bc51.jpg)

Technology
Microservices sample project uses a number of open source projects to work properly:

SpringBoot - Application framework
Zuul - API Gateway (Load Balancer)
Consul - Service registration and Discovery
Docker - Containerization platform
RabbitMQ - asynchronous microservices messaging.
Logstash - Log collector
Elasticsearch - Log indexer
Kibana - Data visualization
Angular - HTML enhanced for web apps!
Bootstrap - great UI boilerplate for modern web apps
jQuery - HTML document traversal and manipulation
Swagger - API documentation
Tools
Java - Programming
Maven - Build
Git - Version control
Docker - Deployment


