Feature: Creat and Delete Functionality for Subject Category

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
      | education         |
      | setupEducation    |
      | subjectCategories |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | MySubjectCat3 |
      | code | 123           |

    And User click on the element in the dialog content class
      | saveButton |

    Then User should see success/error message
      | successfully |

    When User click on the element in the leftNav class
      | subject |

    And User click on the element in the dialog content class
      | addButton |

    And User sending the keys in the dialog content class
      | name | Group3Subject5 |
      | code | 123            |

    And User click on the element in the dialog content class
      | subjectCategory |
      | MySubjectCat3   |
      | saveButton      |

    Then User should see success/error message
      | successfully |

    When User click on the element in the leftNav class
      | subjectCategories |

    When User delete value
      | MySubjectCat3 |

    Then User should see success/error message
      | error |