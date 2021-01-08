public class ImprimindoVariaveis {
    // Comentário de uma linha

    /*
    Comentário multilinhas
     */

    /***
     * Comentário oficial
     * @param args argumentos do terminal
     */
    public static void main(String[] args) {
        int total = 242;
        System.out.println("O total é: " + total);

        int idade = 10;
        double salarioDouble = 3000;
        byte idadeByte = 12;
        short idadeShort = 32767;
        boolean verdadeiroBoolean = true;
        boolean falsoBoolean = false;
        long numeroGrandeLong =  1000L;
        char caractereChar = 'A'; //
        String nome = "William";
        System.out.println(nome + " de idade " + idade);
    }

    /*
     * Valores Primitivos:
     * - int: 32 bit / 4 bytes // min: -2^31 / max: 2^31-1L
     * - boolean: 1 bit // true or false
     * - float: 32 bit / 4 bytes // precision 1
     * - short: 16 bit / 2 bytes // min: -32.768 / max: 32767 (inclusive)
     * - long: 64 bit / 8 bytes // min: -2^63L / max: 2^31-1L
     * - double: 64 bit / 8 bytes // precision 2
     * - byte: 8 bit / 1 byte // min: -128 / max: 127 (inclusive)
     * - char: 16-bit / 2 bytes // '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535 inclusive).
     */




}
