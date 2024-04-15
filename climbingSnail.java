// Дано следующее условие: улитка поднимается по дереву на a метров в день. Затем каждую ночь улитка сползает вниз на b метров. Высота дерева — h метров.
// Напишите программу с подсчетом количества дней, которые потребуются улитке, чтобы добраться до вершины дерева.
// Программа читает a, b, h построчно. Входные значения гарантированно являются положительными целыми числами.
// Если улитка не может добраться до вершины дерева, должно выводиться сообщение: Никогда.

public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;
        boolean foundWord = false;

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != ' ') {
                // Found a non-space character
                foundWord = true;
                length++;
            } else if (foundWord) {
                // Found a space after the last word
                break;
            }
        }

        return length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example usage:
        String s = "Hello World";
        System.out.println(solution.lengthOfLastWord(s)); // Output: 5
    }
}
