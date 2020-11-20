Feature: Creat and Delete Functionality for Cities

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario: Creat and Delete City

    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | cities     |

    And User click on the element in the dialog content class
      | addButton     |
      | country       |
      | randomSelect |

    And User sending the keys in the dialog content class
      | name | Group3City5 |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User delete "Group3City5"

    Then User should see "successfully" message

