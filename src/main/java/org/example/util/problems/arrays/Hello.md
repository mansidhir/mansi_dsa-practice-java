Problem 1: [Star pattern 1](https://youtu.be/6irHnysGbSI?list=PL7ersPsTyYt2prN058WfA_j3ElgwD1bht)

```java
class Solution {
void hello(){
    //n= user input
    for(int i=1;i<=n;i++) {
        for (int j=0;j<i;j++) {
            System.out.print("*");
        }
        System.out.println();
    }
    }
}
```

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
