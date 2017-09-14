# API test for HelloFresh
This is Rest Assured and Cucumber automation tests, which are verifying 
at the [Test web-services](http://services.groupkt.com/country/get/all) 
following test scenarios:
* Get all countries and validate that US, DE and GB were returned in the response;
* Get each country (US, DE and GB) individually and validate the response;
* Try to get information for not exists countries and validate the response;
* Test that would validate new country addition using POST 
(This API has not a POST method at the momen, so this test won't work);

### Preconditions
In order to run this test the following steps are need to be done:
* [Install Maven](https://maven.apache.org/install.html) 

### Usage
To run a tests from command line. Go to project's root folder and type:
* _mvn test_