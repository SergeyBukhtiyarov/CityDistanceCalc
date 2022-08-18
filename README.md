# *CityDistanceCal* 

## *This application  is able to:*
                   1)calculate the distance between cities in two ways:
                                - “Crowflight” (straight distance) between cities 
                                - “Distance matrix” (distance table in the database).  
                   2)show list of all cityies in the DB;                            
                   3)get XML,parses it and stores it into the database;
 #### 1.By default, this App contains 3 Cities(Liquibase),whitch uploads when the App starts.

 #### 2.To show list of all cityies in the DB 
 as example: 
 - http://localhost:8080/cities

 #### 3.To calculate the distance between cities, You should input:
                   1) From City name);
                   2) To City name); 
                   3) calculation type: <Crowflight,matrix>
 as example:
 - http://localhost:8080/calc?city0=Moscow&city1=Novokuibishevsk&calculate=matrix

 #### 4.To add another cities to the DB you should send POST request with XML payload (POSTMAN) to http://localhost:8080/uploads

 as example of POST request:
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
                              
                              
