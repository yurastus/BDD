Narrative:

As a user
I want to add fruits to bucket
So that I can see chosen fruits in bucket as well

Scenario: total fruits in bucket

Given bucket with {givenApples} apples
When I add {whenApples} apples to bucket
Then the total number of apples in bucket should be {thenApples}

Examples:
|givenApples|whenApples|thenApples|
|0          |2         |2         |
|3          |3         |6         |