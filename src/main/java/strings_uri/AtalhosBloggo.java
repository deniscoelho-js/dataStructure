package strings_uri;

public class AtalhosBloggo {
    public void atalhosBlog(String string){

           String resultado = string.replaceAll("_(.*?)_", "<i>$1</i>")
                   .replaceAll("\\*(.*?)\\*", "<b>$1</b>");

        System.out.println(resultado);
    }

    public static void main(String[] args) {
        AtalhosBloggo a = new AtalhosBloggo();
        String s1 = "You _should_ see the baby elephant at the zoo!";
        String s2 = "Move it from *Receiving* to *Accounts Payable*.";
        a.atalhosBlog(s1);
        a.atalhosBlog(s2);
    }
}
