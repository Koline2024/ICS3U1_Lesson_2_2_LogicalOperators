# 2.2 Logical Operators and Expressions

Recall that boolean expressions are expressions that result in `true` or `false`. Up to this point we’ve only worked with boolean expressions that had one comparison operator in it.  In programming there is another set of operators in addition to the arithmetic and comparison operators we’ve seen already — logical operators.  With the logical operators **and (&&), or (||), not** (!) we can create boolean expressions that are a combination of other boolean expressions.


## The and `&&` Operator

Consider the example: ABC University’s Computer Science program requires a **Grade 12 math** credit and an **overall average of 80% or higher**. Below is a table of students applying for the program and their credentials coming out of high school.


<table>
  <tr>
   <td><strong>Student</strong>
   </td>
   <td><strong>Courses</strong>
   </td>
   <td><strong>Overall Average</strong>
   </td>
  </tr>
  <tr>
   <td>Doug
   </td>
   <td>Visual Arts, Law, Vocal, Theatre, History, Phys Ed
   </td>
   <td>72%
   </td>
  </tr>
  <tr>
   <td>Stu
   </td>
   <td>Physics, French, Phys Ed, Biology, History, Math(Calculus)
   </td>
   <td>77%
   </td>
  </tr>
  <tr>
   <td>Alan
   </td>
   <td>Visual Arts, Law, Vocal, Theatre, History, French
   </td>
   <td>91%
   </td>
  </tr>
  <tr>
   <td>Phil
   </td>
   <td>Chemistry, Math (Advanced Functions), Phys Ed, Visual Arts, Biology, Math (Data Management)
   </td>
   <td>85%
   </td>
  </tr>
</table>


When deciding which students get accepted to the computer science program, ABC University must check whether each student meets their conditions.  The following table summarizes their findings:


<table>
  <tr>
   <td><strong>Student</strong>
   </td>
   <td><strong>Has Grade 12 Math Credit?</strong>
   </td>
   <td><strong>Avg >= 80%</strong>
   </td>
   <td><strong>Has Grade 12 Math Credit <em>&&</em> Avg >= 80%</strong>
   </td>
  </tr>
  <tr>
   <td>Doug
   </td>
   <td>false
   </td>
   <td>false
   </td>
   <td>false
   </td>
  </tr>
  <tr>
   <td>Stu
   </td>
   <td>true
   </td>
   <td>false
   </td>
   <td>false
   </td>
  </tr>
  <tr>
   <td>Alan
   </td>
   <td>false
   </td>
   <td>true
   </td>
   <td>false
   </td>
  </tr>
  <tr>
   <td>Phil
   </td>
   <td>true
   </td>
   <td>True
   </td>
   <td>true
   </td>
  </tr>
</table>




The table above illustrates the properties of our and &&. If  **a** and **b** are conditions that evaluate to True or False, the result the expression **a && b **can be summarized in the following Truth Table:


### The _&&_ Truth Table


<table>
  <tr>
   <td><strong>a</strong>
   </td>
   <td><strong>b</strong>
   </td>
   <td><strong>a && b</strong>
   </td>
  </tr>
  <tr>
   <td>F
   </td>
   <td>F
   </td>
   <td>F
   </td>
  </tr>
  <tr>
   <td>T
   </td>
   <td>F
   </td>
   <td>F
   </td>
  </tr>
  <tr>
   <td>F
   </td>
   <td>T
   </td>
   <td>F
   </td>
  </tr>
  <tr>
   <td>T
   </td>
   <td>T
   </td>
   <td>T
   </td>
  </tr>
</table>


Therefore, **a _&&_ b** is only true if **a** is true and **b** is true.


### Working with the _&&_ Operator in Java

The _&& _operator can be used just like any other operator in Java when forming an expression (i.e arithmetic, comparison operators).  Here are some examples:


<table>
  <tr>
   <td><strong>You Try</strong>
   </td>
   <td><strong>Result</strong>
   </td>
  </tr>
  <tr>
   <td><code>
   int a = 5;<p>
System.out.println(((1 &lt; a) && (a &lt; 10)));
</code>
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td><code>System.out.println((1 &lt; a) && (a &lt; 4));</code>
   </td>
   <td>false
   </td>
  </tr>
</table>


 





## The or || Operator

Consider the example: The sequel to Sharknado, “Sharknado 2: The Second One” is coming out this Friday.  The movie is rated 18A, meaning adults or those accompanied by an adult can see the movie. The following people want to see the movie


<table>
  <tr>
   <td><strong>Name(s)</strong>
   </td>
   <td><strong>Age</strong>
   </td>
   <td><strong>Accompanied By an Adult</strong>
   </td>
  </tr>
  <tr>
   <td>Gertie
   </td>
   <td>13
   </td>
   <td>No
   </td>
  </tr>
  <tr>
   <td>Michael
   </td>
   <td>19
   </td>
   <td>No
   </td>
  </tr>
  <tr>
   <td>Elliott
   </td>
   <td>16
   </td>
   <td>Yes, with mother
   </td>
  </tr>
  <tr>
   <td>Mary
   </td>
   <td>25
   </td>
   <td>Yes, with friend (same age)
   </td>
  </tr>
</table>


When deciding who gets to see the movie, the box office cashier must check to see if the admission conditions for this movie have been met.  The following table summarizes their findings:


<table>
  <tr>
   <td><strong>Student</strong>
   </td>
   <td><strong>Age >=18</strong>
   </td>
   <td><strong>Accompanied By an Adult</strong>
   </td>
   <td><strong>Able to watch movie?</strong>
   </td>
  </tr>
  <tr>
   <td>Gertie
   </td>
   <td>False
   </td>
   <td>False
   </td>
   <td>false
   </td>
  </tr>
  <tr>
   <td>Michael
   </td>
   <td>True
   </td>
   <td>False
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>Elliott
   </td>
   <td>False
   </td>
   <td>True
   </td>
   <td>true
   </td>
  </tr>
  <tr>
   <td>Mary
   </td>
   <td>True
   </td>
   <td>True
   </td>
   <td>true
   </td>
  </tr>
</table>


The table above illustrates the properties of _or. _If  **a** and **b** are conditions that evaluate to true or false, the result the expression **a || b **can be summarized in the following Truth Table:


### The _or_ || Truth Table


<table>
  <tr>
   <td><strong>a</strong>
   </td>
   <td><strong>b</strong>
   </td>
   <td><strong>a || b</strong>
   </td>
  </tr>
  <tr>
   <td>F
   </td>
   <td>F
   </td>
   <td>F
   </td>
  </tr>
  <tr>
   <td>T
   </td>
   <td>F
   </td>
   <td>T
   </td>
  </tr>
  <tr>
   <td>F
   </td>
   <td>T
   </td>
   <td>T
   </td>
  </tr>
  <tr>
   <td>T
   </td>
   <td>T
   </td>
   <td>T
   </td>
  </tr>
</table>


Therefore, **a || b** is True if either a, b, or both conditions are True.


### Working with the or || Operator in Java

The _or_ operator can be used just like any other operator in Python when forming an expression (i.e arithmetic, comparison operators).  Here are some examples:


<table>
  <tr>
   <td><strong>You Try</strong>
   </td>
   <td><strong>Result</strong>
   </td>
  </tr>
  <tr>
   <td><code>int a = 5;<p>
System.out.println((a == 4) || (a == 5));</code>
   </td>
   <td><code>true</code>
   </td>
  </tr>
  <tr>
   <td><code>System.out.println((a > 2) || (a &lt; 10));</code>
<p>
<code>System.out.println ((a >= 6) || (a &lt;=4));</code>
   </td>
   <td>true
<p>
false
   </td>
  </tr>
  <tr>
   <td>
   </td>
   <td>
   </td>
  </tr>
</table>




## The not ! Operator

Quite simply, the **!** operator allows us to reverse the result of a boolean expression.  Consider the boolean expression (1 &lt; 2), this would evaluate  to **true**.  The expression **!(1 &lt;2)** would result to **false**.


### The not Truth Table


<table>
  <tr>
   <td><strong>a</strong>
   </td>
   <td><strong>! (a)</strong>
   </td>
  </tr>
  <tr>
   <td>F
   </td>
   <td>T
   </td>
  </tr>
  <tr>
   <td>T
   </td>
   <td>F
   </td>
  </tr>
</table>



### Working with ! in Java

Say we want a boolean expression that tests if a mark was not a passing mark, this can be expressed as:


```
int mark = 51;
boolean blnHasPassed = !(mark < 50);
