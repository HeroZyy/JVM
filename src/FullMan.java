public class FullMan {
    private static FullMan fullMan;
    private FullMan(){};
    public static synchronized FullMan getInstance(){
        if(fullMan == null){
            fullMan = new FullMan();
        }
        return fullMan;
    }
}
