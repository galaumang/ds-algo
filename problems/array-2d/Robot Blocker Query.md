# Robot Blocker Query

## Problem Statement
Given two inputs,
First input is the location map, a 2D array

```
| O | E | E | E | X |
| E | O | X | X | X |
| E | E | E | E | E |
| X | E | O | E | E |
| X | E | X | E | X |
```
O = Robot, E = Empty, X = blocker

Second input is the query. It’s a 1D array consisting of distance to the closest blocker in the order from left, top, bottom and right

[2, 2, 4, 1] -> This means distance of 2 to the left blocker, 2 to the top blocker, 4 to the bottom blocker and 1 to the right blocker

**Note:** The location map boundary is also considered blocker, meaning if the robot hits the boundary it also means it’s hitting the blocker.

Write a function that takes these two inputs and returns the index of the robots (if any) that matches the query that we’re looking for.
Solution for the example above would be the robot located at index [1, 1]

## Sample Inputs / Outputs
### Input 1
```
5 5
O E E E X
E O X X X
E E E E E
X E O E E
X E X E X
2 2 4 1
```

### Output 1
```
1 1
```

## Input / Output Format
### Input Format
The first line contains two values (n,m) separated by space, where n represents no of rows and m represents no of columns in location map grid
Next n lines represents the grid with each having m elements separated by space
Next line contains query in the form of 4 space separated integers, represents the distance to the closest blocker in the order from left, top, bottom and right

### Output Format
An array of size 2, which consist of (x,y) position of the robot in the location map
