You will be receiving a bidimensional array where every row is compounded by two subjects.

The first subject is the prerrequisite to study the second subject.

```
String[][]  list = {
{"A", "B"},
{"C", "D"},
{"B", "C"},
{"F", "G"},
{"E", "F"},
{"D", "E"}
}
```

So to course subject B, you have to first take subject A.

Every subject has a prerrequisite only one subject. So the way to pass the subjects is always linear.

In this case, the whole carrer will be:

```
A -> B -> C -> D -> E -> F -> G
```

Create a function that returns the middle subject of the whole carrer.

In the above example, the expected response will be "D".

If the number of subjects is even, return the first one in the middle.

For example, if the whole carrer is:

```
A -> B -> C -> D -> E -> F
```

return "C"