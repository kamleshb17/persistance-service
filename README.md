# persistance-service


This service is used to persist the booking data and returns the booking ref no

once the spring boot project deployed, following url can be used to 
localhost:8080/api/bookings/ with requestbody 


{
“containerType” : “DRY”,
“containerSize” : 20,
“origin” : “Southampton”,
“destination” : “Singapore”,
“quantity” : 5,
“timestamp” : “2020-10-12T13:53:09Z”
}


technology stack -

Java8
webflux
spring data cassenda reactive
springboot - 2.6.6
