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
