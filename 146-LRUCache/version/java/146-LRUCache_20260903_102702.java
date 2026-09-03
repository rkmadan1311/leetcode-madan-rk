// Last updated: 03/09/2026, 10:27:02
1import java.util.*;
2
3class LRUCache {
4    private final int capacity;
5    private final LinkedHashMap<Integer, Integer> cache;
6
7    public LRUCache(int capacity) {
8        this.capacity = capacity;
9        cache = new LinkedHashMap<>(capacity, 0.75f, true);
10    }
11
12    public int get(int key) {
13        return cache.getOrDefault(key, -1);
14    }
15
16    public void put(int key, int value) {
17        cache.put(key, value);
18
19        if (cache.size() > capacity) {
20            int firstKey = cache.keySet().iterator().next();
21            cache.remove(firstKey);
22        }
23    }
24}