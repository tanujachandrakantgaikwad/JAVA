import java.io.File;

class Demo {
    public static void main(String args[]) {

        for (int i = 0; i < args.length; i++) {
            File f1 = new File(args[i]);

            if (f1.exists()) {
                String name = f1.getName();
                String path = f1.getAbsolutePath();
                long size = f1.length();

                if (name.endsWith(".txt")) 
            {
                    f1.delete();
                    System.out.println("Deleted file: " + name);
                } 
else {
                    // Display remaining file details
                    System.out.println("File: " + name);
                    System.out.println("Path: " + path);
                    System.out.println("Size: " + size + " bytes");
                    System.out.println("-------------------------");
                }
            } 
else 
{
                System.out.println("File not found: " + args[i]);
            }
        }
    }
}
