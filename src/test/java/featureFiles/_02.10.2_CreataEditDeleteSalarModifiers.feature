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

  Scenario:  Create , Edit and Delete Salary Modifiers

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryModifiers |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | description | CocukYardimi |
      | variable    | odenek        |
      | priority    | 1             |
      | amount      | 100           |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryModifiers |

    Then User edit "CocukYardimi"

    And User sending the keys in the dialog content class
      | description | editedCocukYardimi |
      | variable    | ecck               |
      | priority    | 13                 |
      | amount      | 300                |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryModifiers |

    When User delete "editedCocukYardimi"

    Then User should see "successfully" message

