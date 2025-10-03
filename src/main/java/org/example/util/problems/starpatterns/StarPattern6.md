Problem 6: [Star pattern 6](https://www.youtube.com/watch?v=JWMKN7OW_SA&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=6)
```java
class Solution{
    void pattern() {
        for(int outPtr=1;outPtr<=n;outPtr++) {
            int flag = 1;
            for (int inPtr=1;inPtr<=(2*n -1);inPtr++) {
                if (inPtr >= ((n+1)-outPtr) && inPtr <= ((n-1)+outPtr) && flag ==1) {
                    System.out.print("*");
                    flag = 0;
                }
                else {
                    System.out.print(" ");
                    flag = 1;
                }
            }
            System.out.println();
        }
    }
}
```