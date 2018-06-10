Feature: Login into LeafTap
@Smoke
Scenario: Login into LeafTap
Given Invoke the LeafTap Application
And Enter the UserName as DemosalesManager 
And Enter the password as crmsfa
And Click the login
Then Verify the login Success

@Sanity
Scenario Outline: Login into LeafTap
Given Invoke the LeafTap Application
And Enter the UserName as <UserName> 
And Enter the password as <password>
And Click the login
Then Verify the login Success

Examples:
|UserName|password|
|DemoSalesManager|crmsfa|
|DemoCSR|crmsfa|




#Scenario: Login into LeafTap
#Given Invoke the LeafTap Application
#And Enter the UserName as DemoCSR
#And Enter the password as crmsfa
#And Click the login
#Then Verify the login Success
