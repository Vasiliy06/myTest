public enum Test {
    I(1, "I"), II(2, "II"), III(3, "III"), IV(4, "IV"), V(5, "V"), VI(6, "VI"), VII(7, "VII"), VIII(8, "VIII"), IX(9, "IX"), X(10, "X");

    private int arab;
    private String stroka;
    Test(int arab, String stroka){
        this.arab = arab;
        this.stroka = stroka;
    }

    public int getArab() {
        return arab;
    }


    public String getString(){
        return stroka;
    }
}
