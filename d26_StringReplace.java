
public class mute {

    public static void main(String[] args) {
        String inputString = "mute";
        String stringToReplace = "mute";
        String replacementString = "mutmainna";
// mengganto substring dalam string
        String resultString = inputString.replace(stringToReplace, replacementString);
        System.out.println("String awal:" + inputString);
        System.out.println("String setelah penggantian:" + resultString);

    }
}
