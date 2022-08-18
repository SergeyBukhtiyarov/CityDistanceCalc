# *CityDistanceCal* 

## *This application  is able to:*
                   1)calculate the distance between cities in two ways:
                                - “Crowflight” (straight distance) between cities 
                                - “Distance matrix” (distance table in the database).  
                   2)show list of all cityies in the DB;                            
                   3)get XML,parses it and stores it into the database;
#### By default, this App contains 3 Cities(Liquibase),whitch uploads when the App starts.

#### *API has 3 endpoints:*

 #### 1. /cities  
 Responses list of all cityies to GET request.



 #### 2. /calc
 #### Responses distance between cities to GET request with params:
                   1) From City name;
                   2) To City name; 
                   3) calculation type: <Crowflight,matrix>
 as example:
 - http://localhost:8080/calc?city0=Moscow&city1=Novokuibishevsk&calculate=matrix

 #### 3. /uploads
 Responses HTTP 200 to POST request with XML payload (POSTMAN) 

 as example of request body:
 ```xml
<cities>
<city>
  <id>1</id>
  <name>Samara</name>
  <latitude>53.20007</latitude>
  <longitude>50.15</longitude>
</city>
<city>
  <id>2</id>
  <name>Novokuibishevsk</name>
  <latitude>53.0959</latitude>
  <longitude>49.9462</longitude>
</city>
<city>
  <id>3</id>
  <name>Moscow</name>
  <latitude>55.75222</latitude>
  <longitude>37.61556</longitude>
</city>
</cities> 
```                              
                              
                              
                                                   
                              
Tools/Libraries
-	IDEA
-	Git
-	Maven
-	PostgreSQL DB
-	Liquibase
-	Java 
-	JAXB
-	Spring + Tomcat
                              
                              
