 class HeapQuiz {
    int id = 0;
    public HeapQuiz(int id){
        this.id=id;
    }
    public static void main(String[] args) {
        int x = 0;
        HeapQuiz[] hq = new HeapQuiz[5];
        while (x < 3) {
            hq[x] = new HeapQuiz(x);
            hq[x].id = x;
            x = x + 1;
        }
        hq[3] = hq[1];
        hq[4] = hq[1];
        hq[3] = null;
        hq[4] = hq[0];
        hq[0] = hq[3];
        hq[3] = hq[2];
        hq[2] = hq[0];
        int y=0;
        while(y<hq.length){
            if(hq[y]!=null)
                System.out.println("hq["+y+"]=" +hq[y].id);
            else
                System.out.println("hq["+y+"]=" +hq[y]);
            y++;
        }
    }
}