private void keys(Node x,Queue<Key> queue,Key lo,Key hi){
        if(x==null)return;
        int cmplo=lo.compareTo(x.key);
        int cmphi=hi.compareTo(x.key);
        if(cmplo< 0){
        keys(x.left,queue,lo,hi);
        }
        if(cmplo<=0&&cmphi>=0){
        queue.enqueue(x.key);
        }
        if(cmphi>0){
        keys(x.right,queue,lo,hi);
        if(x.color==false){
        System.out.println("RED");
        }
        if(x.color==true){
        System.out.println("Black");
        }
        System.out.println(x.val);
        System.out.println(x.key);
        }

        }