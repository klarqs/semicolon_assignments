public class Girl {

    private String name;
    private String complexion;

    public Girl(String name, String complexion) {
        this.name = name;
        this.complexion = complexion;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getComplexion() {
        return complexion;
    }
    public void setComplexion(String complexion) {
        this.complexion = complexion;
    }

    public static void main(String[] args) {

        Girl girl1 = new Girl("Jane", "Dark-skinned");
        Girl girl2 = new Girl("Sofia","Light-skinned");
        Girl girl3 = new Girl("Dorcas","Olive-skinned");

        String girl1Name = girl1.getName();
        String girl1Complexion = girl1.getComplexion();
        String girl2Name = girl2.getName();
        String girl2Complexion = girl2.getComplexion();
        String girl3Name = girl3.getName();
        String girl3Complexion = girl3.getComplexion();

        System.out.println();

        System.out.printf("%s is %s in complexion\n", girl1Name, girl1Complexion);
        System.out.printf("%s is %s in complexion\n", girl2Name, girl2Complexion);
        System.out.printf("%s is %s in complexion\n", girl3Name, girl3Complexion);

    }
}
