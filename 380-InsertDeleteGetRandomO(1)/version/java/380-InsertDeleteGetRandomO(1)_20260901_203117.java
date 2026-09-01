// Last updated: 01/09/2026, 20:31:17
1class RandomizedSet {
2    ArrayList<Integer> list;
3    HashMap<Integer, Integer> map;
4
5    public RandomizedSet() {
6        list = new ArrayList<>();
7        map = new HashMap<>();
8    }
9
10    public boolean insert(int val) {
11        if (map.containsKey(val))
12            return false;
13
14        map.put(val, list.size());
15        list.add(val);
16        return true;
17    }
18
19    public boolean remove(int val) {
20        if (!map.containsKey(val))
21            return false;
22
23        int index = map.get(val);
24        int last = list.get(list.size() - 1);
25
26        list.set(index, last);
27        map.put(last, index);
28
29        list.remove(list.size() - 1);
30        map.remove(val);
31
32        return true;
33    }
34
35    public int getRandom() {
36        return list.get((int)(Math.random() * list.size()));
37    }
38}