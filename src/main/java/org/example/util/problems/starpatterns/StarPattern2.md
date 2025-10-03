Problem 2: [Star pattern 2](https://www.youtube.com/watch?v=hje73IXa8hI&list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht&index=2)

```java
class Solution{
    void pattern(){
        //n= user input
        for(int outPtr=1;outPtr<=n;outPtr++) {
            for (int inPtr=1;inPtr<=n;inPtr++) {
                if (inPtr >= (n+1) - outPtr)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        
    }
}
```