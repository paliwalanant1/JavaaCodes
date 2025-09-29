package constructor.parameterizeconstructor.staticvalues.parameterizeseventeen;

public class TeamInfo {
    public static void main(String[] args) {
        Team t = new Team("Developers", 5);
        System.out.println(t.getName() + " - Members: " + t.getMembers());
    }
}
