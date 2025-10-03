Problem 5: [Star pattern 5](
https://www.youtube.com/watch?v=yGCQ9if5I-8&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=7)
```java
class Solution{
    void pattern() {
        for(int outPtr=1;outPtr<=n;outPtr++) {
            for (int inPtr=1;inPtr<=(2*n -1);inPtr++) {
                if (inPtr >= (n+1)-outPtr && inPtr <= (n-1)+outPtr)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
```