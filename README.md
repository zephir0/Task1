
# TASK1 - NumberAnalyzer
NumberAnalyzer is a simple Java program that reads a list of integers from the user, processes the input, and displays basic analytical results. It filters distinct numbers, sorts them, and provides various measurements.

## Features
- Accepts a list of integers separated by spaces.
- Validates the input and handles cases where non-integer values are provided.
- Displays:
  - The distinct numbers in ascending order.
  - Total count of numbers.
  - Count of distinct numbers.
  - Minimum number value.
  - Maximum number value.
## Structure Note
All functionalities of the program are contained within a single class, NumberAnalyzer, to maintain the simplicity and clarity of the task.
## Usage
Run the program:  
```  
java NumberAnalyzer.java
```  
When prompted, input a list of integers separated by spaces. If you enter non-integer values, the program will notify you and skip those values.  

Example:
```
Enter a list of integers separated by spaces:  
5 7 3 3 8 apple 9  
apple is not a valid integer.  
3 5 7 8 9  
count: 5  
distinct: 5  
min: 3  
max: 9
```