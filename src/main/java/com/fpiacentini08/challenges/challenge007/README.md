You will be receiving an array of arrays as input.
This arrays represent a range of numbers.
You have to create a method that returns the ranges that includes all the ranges, merging the arrays.


For example:

```agsl

  int[][] s1 = {{3, 9}, {4, 8}, {15, 30}, {13, 25}, {17, 19}};
  Should return {[3, 9], [13, 30]}



  int[][] s2 = {{7, 12}, {3, 5}, {12, 13}, {17, 25}, {15, 25}};
  Should return {[ 3, 5], [7, 13], [15, 25]};


  int[][] s3 = {{2, 3}, {3, 4}, {6, 7}};
  Should return {[ 2, 4], [6, 7]};

```