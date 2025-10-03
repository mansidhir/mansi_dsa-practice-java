Problem 9: [Star pattern 9](https://www.youtube.com/watch?v=nEvDsMud17M&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=9)

```java
class Solution{
    void pattern() {
        for(int outPtr=1;outPtr<=n;outPtr++) {
            char flag ='A';
            for (int inPtr=1;inPtr<=(2*n -1);inPtr++) {
                if (inPtr <= ((n+1)-outPtr) || inPtr >= ((n-1)+outPtr)) {
                    System.out.print(flag);
                    if(inPtr<n)
                        flag++;
                    else
                        flag--;
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