Feature: Create and Delete Functionality for Cost Centers

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully



    # Budget > Setup > Cost Centers
  Scenario:  Create, Edit and Delete Cost Centers

    When User click on the element in the leftNav class
      | budget      |
      | setupBudget |



