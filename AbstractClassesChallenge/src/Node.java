public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.next;
    }

    @Override
    ListItem setNext(ListItem node) {
        this.next = node;
        return this.next;
    }

    @Override
    ListItem previous() {
        return this.previous;
    }

    @Override
    ListItem setPrevious(ListItem node) {
        this.previous = node;
        return this.previous;
    }

    @Override
    int compareTo(ListItem node) {
        if (node != null) {
            return ((String) super.getValue()).compareTo((String) node.getValue());
        } else {
            return -1;
        }
    }
}
