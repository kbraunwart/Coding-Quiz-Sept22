# Coding-Quiz-Sept22
Coding Quiz 9/22/23

miniMaxSum:
    Time Complexity: O(c) as the code takes an array of 5
    integers an input, declares 3 variables using the first integer,
    and iterates through the remaining integers, in each iteration
    adding the current integer to the sum and checking if
    it is less than or greater than the current min values.

    Because each integer in the array is checked for these conditions,
    the same number of computations will be completed regardless of
    the integer values.

    Space Complexity: Constant because only 3 vars are declared

hackerrankInString:
    Time Complexity: O(n): Recursion will be called for either n =
    the length of "hackerrank" or the  length of the string you are checking.
    Increasing the input size of the string you are checking will increase
    the run size.

    Space Complexity: Constant, String "hackerrank" is the only declaration
