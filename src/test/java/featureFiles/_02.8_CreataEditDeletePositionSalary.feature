Feature: Create Edit and Delete Functionality for Human Resources

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create , Edit and Delete Position Salary

    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | positionSalary|

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group3PositionSalary5 |
      | code | 123            |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see success/error message
      | successfully |

    Then User edit the element with value
    |Group3PositionSalary5|editPositionSalary5|

    Then User should see success/error message
      | successfully |

    When User delete value
      | editPositionSalary5 |

    Then User should see success/error message
      | successfully |

    Scenario: Create , Edit and Delete Position

      When User click on the element in the leftNav class
        | humanResources |
        | setupHR        |
        | position      |

      And User click on the element in the dialog content class
        | addButton |

      And User sending the keys in the dialog content class
        | name | Group3Position5 |
        | code | 123            |

      And User click on the element in the dialog content class
        | saveButton |

      Then User should see success/error message
        | successfully |

      Then User edit the element with value
        |Group3Position5|editPosition5|

      When User delete value
        | editPosition5 |

      Then User should see success/error message
        | successfully |

