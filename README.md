# Java ArithmeticException: / by zero

This repository contains a simple Java program that demonstrates an `ArithmeticException` caused by division by zero. The bug is explained, and a solution is provided.

## Bug

The bug lies in the `main` method of `MyClass`.  The program attempts to divide the integer `x` by the integer `y`, which is 0.  This results in an `ArithmeticException`.

## Solution

The solution involves adding a check to ensure that `y` is not 0 before performing the division.  If `y` is 0, an appropriate error message is printed, or the division is avoided altogether.