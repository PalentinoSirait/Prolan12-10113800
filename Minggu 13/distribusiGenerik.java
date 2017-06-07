public class distribusiGenerik {
    public static <T>void distribusi(T temp){
        System.out.println(temp);
    }
    public boolean statusDistribusi(){
        return true;
    }
    public static void main(String[] args) {
    String nama = "Palentino Sirait";
    int umur = 22;
    distribusi(nama);
    distribusi("umur: " +umur);
    distribusi("DIstribui via: Internet");
    }
}