Feature: Create And Delete Subjects

  Background:
    Given Navigate to basqar

    When User sending the keys in the dialog content class
      | username | daulet2030@gmail.com |
      | password | TechnoStudy123@      |

    And User click on the element in the dialog content class
      | loginButton |
      | gotItButton |

    Then User should login successfully

  Scenario:  Create and Delete Subjects

    When User click on the element in the leftNav class
      | education      |
      | setupEducation |
      | subject        |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group3Subject5 |
      | code | 123            |

    And User click on the element in the dialog content class
      | subjectCategory |
      | categoryRandom  |
      | saveButton      |

    Then User should see success/error message
      | successfully |

    When User delete value
      | Group3Subject5 |

    Then User should see success/error message
      | successfully |

