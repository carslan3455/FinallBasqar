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
      | reports |
      | setupReports|
      | exelTemplate|

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group3ExcelTemplate5 |


    And User click on the element in the dialog content class
      | saveButton |

    Then User should see success/error message
      | successfully |

    Then User edit the element with value
    |Group3ExcelTemplate5|editExcelTemplate5|

    Then User should see success/error message
      | successfully |

    When User delete value
      | editExcelTemplate5 |

    Then User should see success/error message
      | successfully |

