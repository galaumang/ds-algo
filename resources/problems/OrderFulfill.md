# Order Fulfill
A company will be shipping a new product with supply of Q quantities at their warehouse. 
There are N orders (array from 0 to N-1) already placed by customers for this product.
The k-th order has to be delivered to a location at distance D[k] from the warehouse and is for exactly O(k) quantities.

Now the product has shipped to the warehouse and ready to be delivered to the clients.
The orders will be fulfilled one by one. To minimize the delivery time, the deliveries will be made in order of increasing distance from the warehouse.
If there are many customers at the same distance, they are processed in order of minimum quantities of the order.
Customer orders to more distant locations are processed only once all orders to customers closer to the warehouse have already been fulfilled.

What is the maximum total number of orders that can be fulfilled?
