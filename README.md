# CityDistanceCal 
#This application  is able to:
                   1)calculate the distance between cities in two ways:
                                - “Crowflight” (straight distance) between cities 
                                - “Distance matrix” (distance table in the database).  
                   2)show list of all cityies in the DB;                            
                   3)get XML POST request,parses it and stores it into the database;
# By default, this App contains 3 Cities(Liquibase),whitch uploads when the App starts.

# To show list of all cityies in the DB -----  http://localhost:8080/cities

# To calculate the distance between cities, You should input:
                                 - city0 (From City <List of cities>);
                                 - city1=(To City <List of cities>); 
                                 - calculation type: <Crowflight,Distance matrix>
----- http://localhost:8080/calc?city0=Moscow&city1=Novokuibishevsk&calculate=matrix

# To add another cities to the DB you should send XML POST request (POSTMAN) to ----- http://localhost:8080/uploads

# The example of POST request
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


                              
                              
                              
                              
                              
                              
                              
                              
Tools/Libraries
•	IDEA
•	Git
•	Maven
•	PostgreSQL DB
•	Liquibase
•	Java 
•	JAXB
•	Spring + Tomcat
                              
                              
