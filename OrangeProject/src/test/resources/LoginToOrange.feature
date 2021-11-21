Feature: Login to Orange Page

Scenario: 

Given I access to Orange  login site

And I enter "<username>"

And I enter my "<password>"

When I hit on the login CTA

Then I want to land on my Homepage

Examples: 
| username  | password    |
| Admin  | admin123 |
| Admi  | admin12 |

