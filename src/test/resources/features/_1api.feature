Feature: Set Base URL
Scenario: call base url
Given we have valid url "http://localhost:8080/swagger-jaxrs-server-1.0.0/v1"
When we enter latitude as "12.0" and longitude as "12.0"
Then location fetch sucessfully.