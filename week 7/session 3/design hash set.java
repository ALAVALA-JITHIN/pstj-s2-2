```java
class MyHashSet {

    boolean[] set;

    public MyHashSet() {
        set = new boolean[1000001];
    }

    public void add(int key) {
        set[key] = true;
    }

    public void remove(int key) {
        set[key] = false;
    }

    public boolean contains(int key) {
        return set[key];
    }
}
```
//
output:
add(5)
add(10)
contains(5)    → true
contains(3)    → false
remove(5)
contains(5)    → false
