package interviewQuestions4;

public class Q03_hacker {
    // Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çeviren bir method(method ismi hackerDili) yazınız.
//    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
//    s -> 5
//    a -> 4
//    e -> 3
//    i -> 1
//    o -> 0
//    Test data
//    hackerDili("java ile hersey guzel")
//    j4v4 1l3 h3r53y guz3l
//    İpucu harfleri değiştirin ve ekrana yazdırın.

    public static void main(String[] args) {
        String str = "Java ile herşey çok güzel";
        hackerDili(str);
    }
    private static void hackerDili(String str) {
        String arr[] = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.toLowerCase().substring(i, i + 1);
        }
        String yeniStr = "";
        for (String w : arr) {
            if (w.equals("s")) {w = "5";
            } else if (w.equals("a")) {w = "4";
            } else if (w.equals("e")) {w = "3";
            } else if (w.equals("v")) {w = "2";
            } else if (w.equals("i")) {w = "1";
            }else if (w.equals("o")) {w = "0";
            }
            yeniStr += w;
        }
        System.out.println(str);
        System.out.println(yeniStr);
    }
}
