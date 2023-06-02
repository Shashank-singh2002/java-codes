class Solution:
    def maximumDetonation(self, bombs: List[List[int]]) -> int:
        #BFS - Second attempt with Jake, Time O(N^3) since (N+2*N+3*N+...+N*N) 
        # construct directed graph - quasi memoization
        G = collections.defaultdict(list)
        for i in range(len(bombs)):
            for j in range(len(bombs)):
                if i == j:
                    continue
                if (bombs[i][0] - bombs[j][0])**2 + (bombs[i][1] - bombs[j][1])**2 <= bombs[i][2]**2:
                    G[i].append(j)
        
        ans = 0 #record maximum of bombs detonated
        htb = set() #htb outside while loop to avoid not-optimal DFS
        for i in range(len(bombs)):
            if i in htb: continue
            queue = collections.deque([i])
            exploded = set([i])
            count = 0
            while queue:
                ind = queue.popleft()
                count += 1
                for j in G[ind]:
                    if j not in exploded:
                        queue.append(j)
                        exploded.add(j)
                        htb.add(j)
            ans = max(ans, count)
            if ans == len(bombs): return len(bombs)
        return ans
