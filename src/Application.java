public class Application {

   public static void main(String[] args) {
      
       DuplicateRemover dp = new DuplicateRemover();
       dp.remove("problem1.txt");
       dp.write("unique_words.txt");
      
   }
}