Feature: Creat and Delete Functionality for Countries and Cities

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario: Creat and Delete Country and City

    When User click on the element in the leftNav class
      | setup      |
      | parameters |
      | countries  |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group3Country5 |
      | code | 123            |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | cities |

    And User click on the element in the dialog content class
      | addButton      |
      | country        |
      | Group3Country5 |

    And User sending the keys in the dialog content class
      | name | Group3City5 |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see "successfully" message

    When User click on the element in the leftNav class
      | countries |

    When User delete "Group3Country5"

    Then User should see "error" message

      #    ilave kısım
    Then User click on the element in the leftNav class
      | cities |
    When User delete "Group3City5"
    Then User should see "successfully" message
    Then User click on the element in the leftNav class
      | countries |
    When User delete "Group3Country5"
    Then User should see "successfully" message