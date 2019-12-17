public class VerifySeqOfBST_33 {
    public static boolean verifySeqOfBST(int[] seq){
        if(seq == null || seq.length == 0) return false;
        return verifySeqOfBSTReccur(seq, 0, seq.length-1);
    }

    public static boolean verifySeqOfBSTReccur(int[] seq, int start, int end){
        if(start >= end) return true;
        int i=start;
        for(;i<end;i++){
            if(seq[i] > seq[end]){
                break;
            }
        }

        for(int j=i+1; j<end; j++){
            if(seq[j] <= seq[end]) return false;
        }
        return verifySeqOfBSTReccur(seq, start,i-1) && verifySeqOfBSTReccur(seq, i, end-1);
    }

    public static void main(String[] args){
        int[] test = new int[]{7,4,6,5};
        System.out.println(verifySeqOfBST(test));
    }
}
