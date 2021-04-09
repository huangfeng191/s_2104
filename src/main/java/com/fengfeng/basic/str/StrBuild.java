package com.fengfeng.basic.str;

public class StrBuild {
//    未完成
    static class Cs{
        private StringBuilder bf;
        private int flag=0;

        public int getFlag() {
            return flag;
        }

        public void setFlag(int flag) {
            this.flag = flag;
        }

        public StringBuilder getBf() {
            return bf;
        }

        public Cs(StringBuilder bf) {
            this.bf = bf;
        }
        public void append(String s){
            bf.append(s);
        }
        public void delete(){
            bf.deleteCharAt(bf.length() - 1);
        }

        public void setBf(StringBuilder bf) {
            this.bf = bf;
        }
    }

    public static void main(String[] args) {
        Cs cs = new Cs(new StringBuilder("cs"));
//        Runnable 接口 无线程名字
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                String print ="第一个线程";
                if (cs.getFlag()==0){
                    cs.setFlag(1);
                    for (int i = 0; i < 1000; i++) {
                        cs.append(String.valueOf(i));
                        System.out.println(print+cs.getBf());
                    }

                }else{

                    print="第二个线程";
                    for (int i = 0; i < 1000; i++) {
                        cs.delete();
                        System.out.println(print+cs.getBf());
                    }


                }


            }
        };
       runnable.run();
       runnable.run();

    }
}
