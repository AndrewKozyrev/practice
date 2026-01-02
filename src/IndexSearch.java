public class IndexSearch {

    /**
     * Возвращает индекс первого вхождения value в array.
     * Если не найдено — вернуть -1.
     * array = [10 13 5 4 11], value = 5, return = 2
     *
     * @param array - исходный массив
     * @param value - искомое значение
     * @return индекс найденного элемента
     */
    public int indexOf(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Возвращает индекс последнего вхождения value в array.
     * Если не найдено — вернуть -1.
     *            i
     * array = [1 2 4 4 5 4 9], value = 2, return = 1
     *
     * @param array - исходный массив
     * @param value - искомое значение
     * @return индекс найденного элемента
     */
    public int lastIndexOf(int[] array, int value) {
        int index = -1;
        for (int i = array.length -1; i >= 0; i--) {
            if (array[i] == value) {
                index = i;
            }
        }
        return index;
    }

    /**
     * Ищет value только в поддиапазоне [fromIndex, toIndex) (то есть toIndex не включительно).
     * Если не найдено — вернуть -1.
     *                [       ]
     * array = [1 2 4 4 5 4 9 8 11 13 0], fromIndex = 3, toIndex = 7, value = 9, return 6
     *
     * @param array - исходный массив
     * @param value - искомое значение
     * @param fromIndex
     * @param toIndex
     * @return
     */
    public int indexOf(int[] array, int value, int fromIndex, int toIndex) {
        return -1;
    }
}
