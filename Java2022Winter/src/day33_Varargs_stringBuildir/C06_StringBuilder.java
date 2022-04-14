package day33_Varargs_stringBuildir;
public class C06_StringBuilder {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Prize dikkat");
        System.out.println(sb1.insert(12," edin")); // Prize dikkat edin
        String str="Hayatta cok guzel seyler var";

        System.out.println(sb1.insert(0,str,0,8)); //Hayatta Prize dikkat edin
        System.out.println(sb1.reverse()); // nide takkid ezirP

        System.out.println(sb1.reverse()); // Prize dikkat edin


    }
}
