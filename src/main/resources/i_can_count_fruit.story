Narrative:

As a user
I want to add fruits to bucket
So that I can see chosen fruits in bucket as well

Scenario: total fruits in bucket

Given bucket with 4 apples
When I add 3 apples to bucket
Then the total number of apples in bucket should be 7
