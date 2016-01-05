Narrative:
As a user
I want to get rest of all fruits
So that I can actual rest of fruits in bucket

Scenario: total fruits in bucket

Given bucket with {givenApples} apples
When I get {whenApples} apples from bucket
Then the rest of apples should be {thenApples}

Examples:
|givenApples|whenApples|thenApples|
|5          |2         |3         |
|10         |4         |6         |