Problem 4: [Star pattern 4](https://www.youtube.com/watch?v=rPPbyLq_hDo&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=4)
```java
class Solution{
    void pattern() {
        for(int outPtr=1;outPtr<=n;outPtr++) {
            for (int inPtr=outPtr;inPtr<=n;inPtr++) {
                if (inPtr <= n)
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
```