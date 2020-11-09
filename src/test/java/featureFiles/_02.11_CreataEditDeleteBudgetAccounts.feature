Feature: Create Edit and Delete Functionality for Budget

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create , Edit and Delete Budget Accounts

    When User click on the element in the leftNav class
      | budget  |
      | budgetAccounts |

    And User click on the element in the dialog content class
      | addButton |

    And User click on the element in the dialog content class
      | type |
      | Group |
      | balanceType |
      | Debit |
      | currency |
      | EUR |
      | formula |
      | addButton |
      | budgetType |
      | current |

    And User sending the keys in the dialog content class
      | formulaList | ilk3harf |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see success/error message
      | successfully |

