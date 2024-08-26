# Order Fulfill

## Problem Statement
A company will be shipping a new product with supply of Q quantities at their warehouse. 
There are N orders (array from 0 to N-1) already placed by customers for this product.
The k-th order has to be delivered to a location at distance D[k] from the warehouse and is for exactly O[k] quantities.

Now the product has shipped to the warehouse and ready to be delivered to the clients.
The orders will be fulfilled one by one. To minimize the delivery time, the deliveries will be made in order of increasing distance from the warehouse.
If there are many customers at the same distance, they are processed in order of minimum quantities of the order.
Customer orders to more distant locations are processed only once all orders to customers closer to the warehouse have already been fulfilled.

What is the maximum total number of orders that can be fulfilled?

Given two arrays of intergers D and O, and an integer Q, return the maximum total number of orders that can be fulfilled.

## Examples
1) Given, D = [5,11,1,3], O = [6,1,3,2], and Q = 7, the function should return 2. The customers at distances 1 and 3 will have their orders fulfilled and 3 + 2 = 5 monitors will be delivered.
2) Given, D = [10,15,1], O = [10,1,2] and Q = 3, the function should return 1. Only the order for the customer at distance 1 will be fulfilled. There will not be enough product in the warehouse for the customer at distance 10. Therefore, orders for customers at distances 10 and 15 will not be fulfilled.

## Assumptions / Constraints
* N is an integer within the range [0..100,000]
* Q is an integer within the range [0..1,000,000,000]
* D is an array of integers within the range [1..1,000,000,000]
* O is an array of integers within the range [1..1,000,000,000]

## Input / Output Format
### Input Format  
The first line contains the value of product quantities Q.
The second and third line contains the integer elements of array D and O respectively.

### Output Format
A single integer representing the maximum total number of orders that can be fulfilled.

## Sample Inputs / Outputs
### Input 1
```
7
5 11 1 3
6 1 3 2
```
### Output 1
```
2
```
### Input 2
```
3
10 15 1
10 1 2
```
### Output 2
```
1
```
### Input 3
```
7
11 18 1
9 18 8
```
### Output 3
```
0
```
### Input 4
```
19
1 4 2 5
4 9 2 3
```
### Output 4
```
4
```
