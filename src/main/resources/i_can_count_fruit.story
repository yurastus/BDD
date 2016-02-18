Narrative:

As a user
I want to add fruits to bucket
So that I can see chosen fruits in bucket as well

Scenario: total apples in bucket

Given bucket with <givenApples> apples
When I add <whenApples> apples to bucket
Then the total number of apples in bucket should be <thenApples>

Examples:
|givenApples|whenApples|thenApples|
|2          |2         |4         |
|3          |2         |5         |


Scenario: total bananas in bucket

Given bucket with 2 bananas
When I add 2 to bucket
Then the total number of bananas in bucket should be 4
