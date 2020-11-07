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

  Scenario:  Create , Edit and Delete Salary Constants

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryConstants |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | nameConstans | Group3SalaryConstans5 |

    And Tarih yazilacak
    |validFrom|11/11/2011|

    And User sending the keys in the dialog content class
      | key | cc34 |
      | valueConstans | 100 |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see success/error message
      | successfully |

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryConstants |

    Then User edit the element with value
      | Group3SalaryConstans5 | editGroup3SalaryConstans5 |

    Then User should see success/error message
      | successfully |

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryConstants |

    When User delete value
      | editGroup3SalaryConstans5 |

    Then User should see success/error message
      | successfully |

