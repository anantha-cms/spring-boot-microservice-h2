# spring-boot-microservice-h2
Java 17 with Spring boot 3 with Microservices and h2 Database Application 
# spring-boot-microservices-new
This repository contains the latest source code of the spring-boot-microservices tutorial

## Set Path for Angular
 
 1. set path=C:\Users\ananthu.behara\AppData\Roaming\npm;%path%
 (OR)
 2. set path=C:\Users\ananthu.behara\AppData\Roaming\npm\node_modules\@angular\cli\bin;%path%
 
 ### Maven user session path 
 set path=C:\Users\ananthu.behara\Documents\Personal Files\apache-maven-3.9.6\bin;%path%
 ### java user session  to the path
 set JAVA_HOME=C:\Users\ananthu.behara\Documents\Personal Files\jdk-17
 set path=C:\Users\ananthu.behara\Documents\Personal Files\jdk-17\bin;%path%
 ==================
   private OrderResponse mapToOrderResponse(Order order) {
        return OrderResponse.builder()
                .id(order.getId())
                .orderNumber(order.getOrderNumber())
                .orderLineItemsList(order.getOrderLineItemsList())               
                .build();
    }
