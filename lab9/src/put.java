public class put {
    private Node put(Node h, Key key, Value val) {
        if (h == null) return new Node(key, val, RED, 1);



        int cmp = key.compareTo(h.key);
        if      (cmp < 0) {
            h.left = put(h.left, key, val);
        }

        else if (cmp > 0) {
            h.right = put(h.right, key, val);
        }
        else {
            h.val = val;
        }


        // fix-up any right-leaning links
        if (isRed(h.right) && !isRed(h.left))      h = rotateLeft(h);
        if (isRed(h.left)  &&  isRed(h.left.left)) h = rotateRight(h);
        if (isRed(h.left)  &&  isRed(h.right))     flipColors(h);
        h.size = size(h.left) + size(h.right) + 1;

        String L;
        if (h.color == BLACK)
            L = "Black";
        else
            L = "Red";

        System.out.print(h.key+" ");
        System.out.println(L);
        return h;

    }
}
