public class e1 {

    public static void main(String[] args){
        int res = elevar(2,10);
        System.out.println(res);
    }

    public static int elevar(int a,int b){
        return elevar(a,b,1,0);
    }
    private static int elevar(int a,int b,int res,int cont){
        if(cont != b){
            return elevar(a,b,res*a,cont+1);
        }else{
            return res;
        }
    }
}
