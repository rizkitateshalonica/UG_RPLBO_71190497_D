public class UsernameException extends Exception{
    private int error;
    private String pesanError;

    public UsernameException(String username) {
        super(username);
        if (username.isEmpty()) {
            this.pesanError = "Maaf, username tidak boleh kosong!";
        } else if (username.length() <6) {
            this.pesanError = "Maaf, username minimal harus terdiri dari 6 karakter";
        }
    }

    public String getPesanError() {
        return pesanError;
    }

    public int getError() {
        return error;
    }
}