Feature: LeafTaps MergeLead functionality

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
When Click on 'Merge Leads' link
Then 'Merge Leads' page should be displayed
When Click on From Lead icon
Then 'Find Leads' page should be displayed
When Click on From Lead icon
When Click on First Lead ID
When Click on To Lead icon
When Click on Second Lead ID
When Click on 'Merge' link
When Click on ok button
When Click on close button
