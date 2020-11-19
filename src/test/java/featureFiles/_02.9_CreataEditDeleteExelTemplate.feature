Feature: Create Edit and Delete Functionality for Reports

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create , Edit and Delete Excel Template

    When User click on the element in the leftNav class
      | reports |
      | setupReports|
      | excelTemplate|

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group3ExcelTemplate |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User click on the element in the dialog content class
      | closeDialog |

    Then User edit "Group3NewExcelTemplete"

    And User sending the keys in the dialog content class
      | name | Group3EditedExcelTemplete |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    And User click on the element in the dialog content class
      | closeDialog |

    When User delete "Group3EditedExcelTemplete"

    Then User should see "successfully" message

