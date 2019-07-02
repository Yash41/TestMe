Feature:login
Scenario outline :successful login
Given user is on the home page
When user enters correct <username> and <password> 
Then user does successful login

Examples :
|tutorial|tutorial|
|merury|mercury|