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
      | code | 2.1.19  |
      | name | Group3A |

    And User click on the element in the dialog content class
      | type        |
      | Group       |
      | balanceType |
      | Debit       |
      | currency    |
      | EUR         |
      | formula     |
      | addFormula  |
      | maximizes   |
      | budgetType  |
      | current     |

    And User sending the keys List in the dialog content class
      | formulaList | JAN |

    And User click on the element in the dialog content class
      | saveFormula |

    Then User should see "successfully" message

    And User click on the element in the dialog content class
      | contraAcc    |
      | addContraAcc |

    And User sending the keys in the dialog content class
      | codeAcc | 1010 |

    And User click on the element in the dialog content class
      | budgetType   |
      | Current      |
      | balanceType2 |
      | Debit        |
      | maximizes    |

    And User sending the keys in the dialog content class
      | order | 4 |

    And User sending the keys List in the dialog content class
      | formulaList | Formul |

    And User click on the element in the dialog content class
      | addButtonContAcc |
      | saveButton       |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    And User sending the keys in the dialog content class
      | searchName | Group3A |

    And User click on the element in the dialog content class
      | search |

    Then User edit "Group3A"

    And User sending the keys in the dialog content class
      | name | Group3NewAsd |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | budget         |
      | budgetAccounts |

    And User sending the keys in the dialog content class
      | searchName | Group3NewAsd |

    And User click on the element in the dialog content class
      | search |

    When User delete "Group3NewAsd"

    Then User should see "successfully" message



