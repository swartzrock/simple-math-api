## Math API

A REST API built with HTTP4s. Requires a bit of work to get working correctly.


### Setup

1. Compile and run the app as-is by running ````sbt run````
1. Access the "hello" endpoint at http://localhost:8080/hello/world . The page should print "Hello, world".
1. Open the project in an editor and go to the "RestAPI.scala" file.
1. In addition to the "hello" endpoint, you can see there is also a "max" and "average" endpoints. 
1. Test out the "max" endpoint by going to http://localhost:8080/max/3,2,73,3,1 . You'll see the result is fixed.
1. Test out the "average" endpoint by going to http://localhost:8080/average/3,2,73,3,1 . You'll see the result is also fixed.

### Instructions

1. Fix the "max" endpoint so that it returns the correct number.
1. Fix the "average" endpoint so that it returns the correct number.
1. Add basic input checking to the endpoints. You can return an error message if you detect improper input. For example, an empty input string shouldn't be allowed.



