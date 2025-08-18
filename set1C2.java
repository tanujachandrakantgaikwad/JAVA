//2. Write a java program to display each word in reverse order from a string array. 
class ReverseWords
 {
    public static void main(String[] args)
 {   
        String words[] = {"Java", "Programming", "is", "Fun"};

        System.out.println(" reverse:");
        for (int i = 0; i < words.length; i++) 
       {
            String word = words[i];
            String rev = "";

            for (int j = word.length() - 1; j >= 0; j--) 
           {
                rev = rev + word.charAt(j);
            }

            System.out.println(rev);
        }
    }
}
