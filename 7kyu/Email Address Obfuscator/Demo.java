public class EmailObfuscator {
    public static String obfuscate(String email) {
        return email.replace("@", " [at] ")
                    .replace(".", " [dot] ");
    }
}

//https://www.codewars.com/kata/562d8d4c434582007300004e/train/java