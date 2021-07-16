package com.company;

class KekAdapter implements Processor{

    KekeClass kekeClass;
    public KekAdapter(KekeClass kekeClass) {this.kekeClass = kekeClass;}

    @Override
    public String name() { return kekeClass.name();}

    @Override
    public Object process(Object input) { return kekeClass.process((KekeClass)input); }
}

    public class KekeProcessor{
        public static void main(String[] args) {
            KekeClass kekeClass = new KekeClass(new StringBuilder("igor keklolagaab"));
            Main.process(new KekAdapter(kekeClass),kekeClass);
        }
    }

 class KekeClass {
    StringBuilder kekeClass;

     public KekeClass(StringBuilder kekeClass) {
         StringBuilder stringBuilder = new StringBuilder();
         for (int i = 0; i < kekeClass.length();i += 2) {
             if ((i + 1) >= kekeClass.length()){
                 stringBuilder.append(kekeClass.charAt(i));
             break;
         } else {
                 stringBuilder.append(kekeClass.charAt(i+1)).append(kekeClass.charAt(i));
             }
         }
         this.kekeClass = stringBuilder;
     }

     @Override
     public String toString() {
         return  kekeClass.toString();
     }
     public String name(){ return getClass().getSimpleName(); }
        public KekeClass process(KekeClass input) { return input; }

}

