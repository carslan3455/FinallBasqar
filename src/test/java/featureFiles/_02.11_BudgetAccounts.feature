Feature: Create and Delete Functionality for Budget Accounts

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create, Edit and Delete Budget Accounts

    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | code | 123 |
      | name | Group3Asd |

    And User click on the element in the dialog content class
      | type        |
      | Group       |
      | balanceType |
      | Debit       |
      | currency    |
      | EUR         |
      | formula     |
      | addButton   |
      | budgetType  |
      | current     |

    And User sending the keys in the dialog content class
      | formulaList | JAN |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User click on the element in the dialog content class
      | contraAcc |
      | addButton |

    And User sending the keys in the dialog content class
      | codeAcc | 1010 |

    And User click on the element in the dialog content class
      | budgetType   |
      | randomSelect |
      | balanceType  |
      | randomSelect |

    And User sending the keys in the dialog content class
      | orderNo       | 4      |
      | formulaList | Formul |

    And User click on the element in the dialog content class
      | addContraAcc |
      | saveButton   |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    Then User edit "Group3Asd"

    And User sending the keys in the dialog content class
      | name | Group3NewAsd |

    And User click on the element in the dialog content class
      | saveButton |
    Then User should see "successfully" message

    When User delete "Group3NewAsd"

    Then User should see "successfully" message



