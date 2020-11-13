Problem:

Software system used for entering articles into the shoe store.

Specification of the valid shoe name is as follows:

Article id, list of sizes
	
- Id is 2-10 characters long string consisting of only alphabet signs
- Size must be a integer in range 29-50
- There are 10 sizes at most and they must be in ascending order, separated with commas
- Id is separated from sizes with comma
- Blank spaces are all ignored.

Test Plan:

1. Id is a word (correct) 
2. Id isn't a word (incorrect)
3. Id is shorter than 2 letters (incorrect)
4. Id is longer than 10 letters (incorrect)
5. Id is 2-10 letters (correct)
6. Size is smaller than 29 (incorrect)
7. Size is bigger than 50 (incorrect)
8. Size is in between 29 and 50 (correct)
9. Size consists of numbers (correct)
10. Size is an integer (correct)
11. Size isn't an integer (incorrect)
12. Size has a non-number character(s) (incorrect)
13. Sizes are in ascending order (correct)
14. Sizes are not in ascending order (incorrect)
15. List of sizes is empty (incorrect)
16. List's length is between 1 and 5 (correct)
17. List's length is more than 5 (incorrect)
18. Id is written before list of sizes (correct)
19. Id is not written before list of sizes (incorrect)
20. All input data is separated with commas (correct)
21. All input data isn't separated with commas (incorrect)
22. Data has blank spaces (correct)
23. Data doesn't have blank spaces (correct)

Test Plan Minimized:
 
| Test example  | Expected Result |  Covered possibilities (classes) |
| ------------- | ------------- | -------------------|
| Nike,43,44    | (correct)    |  1,5,8,9,10,13,16,18,20,23          |
| nike,  43, 44 | (correct)    |  1,5,8,9,10,13,16,18,20,22          |
| n1ke,36,37    | (incorrect)  |         2           |
| P,34,35       | (incorrect)  |         3           |
|Abcdefghijk,30 | (incorrect)  |         4           |
| Nike, 28, 30  | (incorrect)  |         6           |
| Nike, 49, 51  | (incorrect)  |         7           |
| Abc, 39.5     | (incorrect)  |         11          |
| Abc,40?,41    | (incorrect)  |         12          |
| abC, 40,39,41 | (incorrect)  |         13          |
| aBc,          | (incorrect)  |         15          |
| Nike, 40,41,42, 43,44,45     |    (incorrect) | 17 |
| 40,41,42,43   | (incorrect)  |         19          |
| Nike45,46,47  | (incorrect)  |         21          |


