//12. Write a program in java to print even number from 1 to 100.

import java.util.Scanner;
class Even
{
 public static void main(String [] args)
   {
	int i=2;
	System.out.print("Even no.: ");
        while(i<=100){
         	System.out.println(+i);
		i=i+2;
	} 
}
} 



/*
OUTPUT: 2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100

C:\Users\Asus\Desktop\Java Lab>javac 12que.java

C:\Users\Asus\Desktop\Java Lab>java Even
Even no.:
2468101214161820222426283032343638404244464850525456586062646668707274767880828486889092949698100
C:\Users\Asus\Desktop\Java Lab>javac 12que.java

C:\Users\Asus\Desktop\Java Lab>java Even
Even no.: 2468101214161820222426283032343638404244464850525456586062646668707274767880828486889092949698100
C:\Users\Asus\Desktop\Java Lab>javac 12que.java

C:\Users\Asus\Desktop\Java Lab>java Even
Even no.: 2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
52
54
56
58
60
62
64
66
68
70
72
74
76
78
80
82
84
86
88
90
92
94
96
98
100
*/