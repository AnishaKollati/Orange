@tag
Feature: EssEmployee Details

  @tag1
  Scenario Outline: 
    Given Open Portal
    When Enter Username<uname>,Password<pass> and click login
   	Then click PIM and fill <empname> and search
   	Then click on the name and view all details
   	Examples:
  	|	uname	|	pass			|	empname			|
  	|	Admin	|	admin123	|	Aaliyah Haq	| 
  	
  	