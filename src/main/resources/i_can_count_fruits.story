Narrative:

As a apple fun
I want to eat apples
So that I can get actual rest of fruits in bucket as well

Scenario: total fruits in bucket

Given bucket with {givenApples} apples
When I get {whenApples} apples from bucket
Then the rest of apples should be {thenApples}

Examples:
|givenApples|whenApples|thenApples|
|5          |2         |3         |
|10         |4         |6         |