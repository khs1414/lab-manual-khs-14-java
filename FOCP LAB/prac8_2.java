public class prac8_2 {
    public static void main(String[] args) {
        String s = null;
        try{
            System.out.println("The length is : "+ len(s));
        }
        catch(Exception exception){
            System.out.println(exception);
            System.out.println("Value was null");
    
        }
        finally{
            System.out.println("length calculated");
        }

    }
    static int len(String str){
        return str.length();
    }
    
}
