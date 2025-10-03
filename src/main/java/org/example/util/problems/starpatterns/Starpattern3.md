Problem 3: [Star Pattern 3](https://www.youtube.com/watch?v=63R1UuaFQVE&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=3)

```java
class Solution{
    void pattern() {
        for(int outPtr=1;outPtr<=n;outPtr++) {
            for (int inPtr=1;inPtr<=n;inPtr++) {
                if (inPtr < outPtr)
                    System.out.print(" ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
```