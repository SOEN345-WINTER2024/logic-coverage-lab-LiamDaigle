# Logic Coverage Lab
## By: Liam Daigle

### Step 1: Identify Logical Expresions
The only logic expression is : a || (b && c), where a, b and c are all boolean values.

### Step 2: Determine Predicate Coverage
For the expression a || (b && c):
  True when either a or b and c are true
  False when a and b or c are false

### Step 3: Determine Clause Coverage
There can be 2 values for each boolean variable (true or false).
This means that there are 3 clauses in total:
Clause 1: a = true, a = false
Clause 2: b = true, b = false
Clause 3: c = true, c = false

### Step 4: Determine Combinatorial Coverage
Since we have 3 clauses, and in each of these clauses there can be one of 2 values for the variable, that means there is 2^3 test cases to be written.
![image](https://github.com/SOEN345-WINTER2024/logic-coverage-lab-LiamDaigle/assets/70587593/adead455-e772-4cff-83bf-51d00887f53e)

### Step 5: Correlated Active Clause Coverage
The values in yellow represent a row that is satisfied:
![image](https://github.com/SOEN345-WINTER2024/logic-coverage-lab-LiamDaigle/assets/70587593/3c41e587-1916-4a8d-b615-33784e31c42c)

### Step 6: Restricted Active Clause Coverage
![image](https://github.com/SOEN345-WINTER2024/logic-coverage-lab-LiamDaigle/assets/70587593/987f8e81-6d4d-4630-8fe2-5e78d320330e)
