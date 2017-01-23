
public class MemoryLeakExample {

    private static StringBuffer stringBuffer = null;
    public static void main(String[] args) {
        for(long i =0; i <= 1000000000000l; i++) {
            stringBuffer = new StringBuffer();
            stringBuffer.append("a");
        }
        System.out.println("done");
    }
    
    
}
