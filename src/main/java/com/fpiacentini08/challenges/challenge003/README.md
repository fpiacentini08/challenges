You have to code a function that receives an array of the first N Fibonacci's numbers in order.

You have to return an array with the same numbers, but moving all the even numbers to the first positions of the array.

Any extra memory space you use to do the processing should be constant and not grow with the amount of numbers received.

For example:

```agsl
int[] list = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144}
```

Should return:

```agsl
int[] list = {144, 34, 2, 8, 5, 3, 13, 21, 1, 55, 89, 1}
```
or
```agsl
int[] list = {34, 144, 2, 8, 5, 3, 13, 1, 21, 55, 89, 1}
```
or any other solution that meets the requirement.