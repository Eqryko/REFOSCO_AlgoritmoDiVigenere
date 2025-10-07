public class Lettera {
    int code;
    private int key;

    public Lettera(int code, int key) {
        this.code = code;
        this.key = key;
    }

    public Lettera trasla(char tipo) {
        int nuovoCode = code;

        if (Character.isUpperCase(code)) {
            // Lettera maiuscola: A=65, Z=90
            int base = 'A';
            if (tipo == '+')
                nuovoCode = base + ((code - base + key) % 26);
            else if (tipo == '-')
                nuovoCode = base + ((code - base - key + 26) % 26);
        }
        else if (Character.isLowerCase(code)) {
            // Lettera minuscola: a=97, z=122
            int base = 'a';
            if (tipo == '+')
                nuovoCode = base + ((code - base + key) % 26);
            else if (tipo == '-')
                nuovoCode = base + ((code - base - key + 26) % 26);
        }
        // Se non è una lettera, la lasciamo invariata

        return new Lettera(nuovoCode, key);
    }
}
