public class Main {
    public static void main(String[] args) {
        IndexSearch search = new IndexSearch();
        assert search.indexOf(new int[]{1, 2, 4, 4, 5, 4, 9, 8, 11, 13, 0}, 4, 3, 7) == 6;
    }
}