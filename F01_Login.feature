Feature: Leaftaps login functionality 

Background: 
	Given Open the chrome browser 
	And Load the application 'http://leaftaps.com/opentaps/control/main' 
	
Scenario Outline: Test with positive credential 


	Given Enter the username as <username> 
	And Enter the password as <password> 
	When Click login button 
	
	Then Homepage should be displayed
	When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on close button
	
	Examples: 
		|username|password|
		|'DemoSalesmanager'|'crmsfa'|
		|'DemoCSR'|'crmsfa'|
		
Scenario: Test with negative credential 


	Given Enter the username as 'Demo' 
	And Enter the password as 'crmsfa' 
	When Click login button 
	
	But Error should be displayed   
	When Click on close button