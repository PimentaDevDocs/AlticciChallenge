# AlticciChallenge

Alticci-API is a java backend application for calculate the alticci sequence.

The Alticci sequence - a(n) - is defined by:

```
n=0 => a(0) = 0
n=1 => a(1) = 1
n=2 => a(2) = 1
n>2 => a(n) = a(n-3) + a(n-2)
```

Examples - first 10:

```
0
1
1
1
2
2
3
4
5
7
9
```

## What do you need to know

To run the application you must have Java JDK and maven installed 

# How to run the project

- Go to `alticciApi` folder;
- execute the command to run back end:

 mvn spring-boot:run

If all commands were executed with any error, go to the browser and access:

- URL <http://localhost:8080/alticci/{index}> to test the application

- URL <http://localhost:8080/swagger-ui/> to swagger
