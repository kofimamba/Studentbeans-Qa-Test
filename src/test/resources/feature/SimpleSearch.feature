@simpleSearch
Feature: Simple Search

  @searchBrand
  Scenario Outline: As a user I want to search for a brand and get a discount on that brand
    Given I am on the studentbeans homepage
    When I open the search bar
    And I enter "<Samsung>"
    Then I should be shown a search listing for "<Samsung>"
    Examples:
      | Samsung |
      | Samsung |


