# spring-boot-kafka-example
A Apache kafka example with Spring boot. This project requires/depends upon:-
<ol>
  <li>JDK 1.8</li>
  <li>Maven</li>
  <li>Apache Kafka [2.7.1](https://archive.apache.org/dist/kafka/2.7.1/kafka_2.13-2.7.1.tgz) </li>
  <li>Apache Zookeeper (Included with kafka above)</li>
  <li>Spring boot</li>
</ol>



## What's included
<ol>
  <li>A spring boot java based producer module</li>
  <li>A spring boot java based consumer module</li>
  <li>The Apache kafka (including zookeeper) setup</li>
  <li>Sample curl to send a message from producer to consumer</li>
</ol>


## How to Run
<ol>
  <li>Copy the contents of "kafka" to C:</li>
  <li>Use the commands to run apache kafka located [here](https://github.com/iamnav/spring-boot-kafka-example/blob/main/kafka/Run%20commands.txt) </li>
  <li>Start the Producer (Port 8081) and Consumer (Port 8082) locally</li>
  <li>Use the sample curl to verify the messaging</li>
</ol>


<img src="https://github.com/iamnav/spring-boot-kafka-example/blob/main/Kafka%20Producer-Consumer.PNG" width="100">


## Producer publish curl
`curl --location --request POST 'localhost:8081/kafka/publish' \
--header 'Content-Type: application/json' \
--data-raw '{
    "name": "Bob",
    "dept": "IT",
    "salary": 12345
}'`
