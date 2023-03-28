You will be receiving a bidimensional array where every row is compounded by two strings. 

The first is the student id and the second is the subject name.

You have to code a function that returns a list that includes every pair of students with the subjects they share. 

Each pair will be represented by the string "studentId1,studentId2". 

Notice that if you include "studentId1,studentId2", you should not include "studentId2,studentId1" as it is the same.

Example

Input:

```
String[][]  list = {
{"12", "Maths"},
{"34", "Maths"},
{"12", "IT"},
{"34", "Chemistry"},
{"17", "IT"},
{"12", "Chemistry"}
}
```

Output:

```
{
{"12,34", "Maths", "Chemistry"},
{"12,17", "IT"},
{"17,34"}
}
```