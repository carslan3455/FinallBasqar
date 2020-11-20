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
      | addButton  |
      | validFrom  |
      | selectDate |

    And User sending the keys in the dialog content class
      | nameConstants  | isim |
      | key            | a12  |
      | valueConstants | 100  |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    Then User edit "isim"

    And User sending the keys in the dialog content class
      | nameConstants | editedisim |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User delete "editedisim"

    Then User should see "successfully" message