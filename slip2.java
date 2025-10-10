// Write a java program to display all the vowels from a given string.
class Demo {
    public static void main(String args[]) {
        String name = "Tanuja";

        for (int i = 0; i < name.length(); i++) {
            char ch = name.charAt(i);

            if (ch == 'A' || ch == 'a' ||
                ch == 'E' || ch == 'e' ||
                ch == 'I' || ch == 'i' ||
                ch == 'O' || ch == 'o' ||
                ch == 'U' || ch == 'u') {
                System.out.print(ch + " ");
            }
        }
    }
}
