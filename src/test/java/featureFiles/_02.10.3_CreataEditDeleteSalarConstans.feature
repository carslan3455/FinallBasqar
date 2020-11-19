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
      | validFrom |
      | selectDate |

    #      TODO Alttaki tarihe çift tıklamak gerekiyor.
    And User sending the keys in the dialog content class
      | nameConstants  | isim       |
      | key           | a12        |
      | valueConstants | 100        |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryConstants |

    Then User edit "isim"

    And User sending the keys in the dialog content class
      | nameConstants  | editedisim |
#      TODO Alttaki tarihe çift tıklamak gerekiyor.
      | validFrom     | 11/10/2011 |
      | key           | a12        |
      | valueConstants | 100        |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | humanResources  |
      | setupHR         |
      | salaryConstants |

    When User delete "editedisim"

    Then User should see "successfully" message