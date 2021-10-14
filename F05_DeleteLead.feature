Feature: LeafTaps EditLead functionality

Scenario: To edit the created lead
Given Open the chrome browser 
And Load the application 'http://leaftaps.com/opentaps/control/main'
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button  
 
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Find Leads' link
Given Enter the FName as 'Jisha'
When Click on Find Leads 
When Click First Leads 
When Click on Delete button
Then 'My Leads' page should be displayed