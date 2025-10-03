Problem 7: [Star pattern 6](

```java
class Solution{
    void pattern() { 
        for(int outPtr=1;outPtr<=n;outPtr++) 
        {
            for (int inPtr=1;inPtr<=(2*n -1);inPtr++) 
            {
                if (inPtr <= ((n+1)-outPtr) || inPtr >= ((n-1)+outPtr)) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
        System.out.println();
        }
    }
}
```