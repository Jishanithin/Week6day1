Feature: LeafTaps create lead functionality

Background: 
Given Open the chrome browser
And Load the application 'http://leaftaps.com/opentaps/control/main'

Scenario: To Create lead with mandatory information
Given Enter the username as 'Demosalesmanager'
And Enter the password as 'crmsfa'
When Click login button  
 
Then Homepage should be displayed
When Click on 'CRM/SFA' link
Then 'My Home' page should be displayed
When Click on 'Leads' link
Then 'My Leads' page should be displayed
When Click on 'Create Lead' link
Then 'Create Lead' page should be displayed
Given Enter the Company name as 'Amazon'
And Enter the First Name as 'Jisha'
And Enter the Last Name as 'A'
When Click on Create Lead
When Click on close button

