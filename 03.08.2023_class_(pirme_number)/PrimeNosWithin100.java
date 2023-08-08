class PrimeNosWithin100 {
    public static void main(String[] args) {
        for(int i=2; i<=100; i++){
            boolean rs = is100Prime(i);
            if(rs==true){
                System.out.print(i+" ");
            }
        }
    }

    static boolean is100Prime(int x) {
        for (int i = 2; i <= x / 2; i++) {
            if (x % i == 0)
                return false;
        }
        return true;
    }
}
