public class EmailException extends Exception {
    private int error;
    private String pesanError;

    public EmailException(String email) {
        super(email);
        if (email.isEmpty()) {
            this.pesanError = "Maaf, email tidak boleh kosong!";
        } else if () {
            this.pesanError = "";
        }
    }

    public String getPesanError() {
        return pesanError;
    }

    public int getError() {
        return error;
    }
}