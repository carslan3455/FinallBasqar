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

  Scenario:  Create, Edit and Delete Position Salary

    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | positionSalary |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | namePositionSalary | Group3NewPositionSalary |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User sending the keys in the dialog content class
      | searchName | Group3NewPositionSalary |

    And User click on the element in the dialog content class
      | search |

    Then User edit "Group3NewPositionSalary"

    And User sending the keys in the dialog content class
      | namePositionSalary | editedPositionSalary |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User sending the keys in the dialog content class
      | searchName | editedPositionSalary |

    And User click on the element in the dialog content class
      | search |

    When User delete "editedPositionSalary"

    Then User should see "successfully" message


  Scenario:  Create and Delete Positions

    When User click on the element in the leftNav class
      | humanResources |
      | setupHR        |
      | positions      |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name      | Group3NewPosition |
      | shortName | G3NP              |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User sending the keys in the dialog content class
      | searchName | Group3NewPosition |

    And User click on the element in the dialog content class
      | search |

    Then User edit "Group3NewPosition"

    And User sending the keys in the dialog content class
      | name      | editedPosition |
      | shortName | G3NnewP        |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User sending the keys in the dialog content class
      | searchName | editedPosition |

    And User click on the element in the dialog content class
      | search |

    When User delete "editedPosition"

    Then User should see "successfully" message
