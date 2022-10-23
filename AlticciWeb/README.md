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

To run the application you must have nodejs and angular-cli installed 

# How to run the project

- Go to `alticciWeb` folder;

- run command to install project's dependencies:

```
npm i
```

- run command to start server:

```sh
ng serve
```

If all commands were executed with any error, go to the browser and access:

- URL <http://localhost:4200/> to test the application