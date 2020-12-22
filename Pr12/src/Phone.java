public class Phone {

    public String convert(String s){
        // 8-915-085-86-51
        // +79150858651
        StringBuffer sb = new StringBuffer(s);
        if(s.length() == 11){
            sb.setCharAt(0,'7');
            sb.insert(0,'+');
        }
        sb.insert(2," ");
        sb.insert(6,"-");
        sb.insert(10,"-");
        return sb.toString();
    }

    public static void main(String[] args) {
        Phone phone = new Phone();
        System.out.println(phone.convert("89158506851"));
    }
}
