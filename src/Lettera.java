public class Lettera {
    int code;
    private int key;

    public Lettera(int code, int key) {
        this.code = code;
        this.key = key;
    }
    public Lettera trasla(char tipo){
        Lettera nuovaLettera;
        nuovaLettera = new Lettera(code, key);
        if(tipo == '+'){
            nuovaLettera = new Lettera(this.code+key, this.key);
        } else if(tipo == '-'){
            nuovaLettera = new Lettera(this.code-key, this.key);
        }
        return nuovaLettera;
    }
}
