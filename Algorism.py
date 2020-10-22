def pibo(a): return pibo(a-1)+pibo(a-2) if a>=2 else a

for i in range(1,11): print(pibo(i))

#피보나치수열 - DB

def db_pibo():
    x = int(input())
    d = [0]*100001

    for i in range(1,x+1):
        
        d[i] = d[i-1]+d[i-2]
        
        if i<=2: d[i]=i;  
        else: d[i] = max(d[i-1]+d[i-2],d[i]); 

        print("d [",i,"] = ", d[i])
    

    return d[x-1]



db_pibo()
