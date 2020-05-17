package excepciones;

public class TryCatch {

    public static void main(String[] args) throws SampleException {


        String s = null;

        try {
            s.length();
            System.out.println(s);

        }catch (NullPointerException | SecurityException e){
            System.out.println("Es null " + e.getMessage());
        }
        catch (Exception e){

        }finally {

        }


        testRegular();

        if(true){
            throw new NumberFormatException();
        }
    }


    public static void test() {
        //testRegular();
        //testRunTime();
    }

    public static void testRunTime(){
        throw new RunTimeSampleException();
    }


    public static void testRegular() throws SampleException{

        throw new SampleException();

    }

}
