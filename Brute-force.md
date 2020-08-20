# Brute-force

- 3 - sum

for(int i = 0; i < N; i++) {
    for(int j  = i+1; j < N; j++) {
        for(int k = j+1; k < N; k++) {
            if(a[i]+a[j]+a[k] == 0) {
                count ++;
            }
        }
    }
}

- time measure = Stopwatch stopwatch = new Stopwatch();
- double time = stopwatch.elapsedTime();
- StdOut.println("elapsed time " + time);

- Run Time :

N ,time (seconds)
250, 0.0
500 ,0.0
1,000, 0.1
2,000 ,0.8
4,000 ,6.4
8,000 ,51.1
16,000 ,?


log plot :

lg(T (N)) = b lg N + c
b = 2.999
c = -33.2103
T (N) = a (sub)N (sup)b
, where a = 2^c

![] ( x-special/nautilus-clipboard
copy
file:///home/prem/Desktop/Screenshot%20from%202020-08-20%2020-40-01.png
 )



x-special/nautilus-clipboard
copy
file:///home/prem/Desktop/Screenshot%20from%202020-08-20%2020-40-01.png

