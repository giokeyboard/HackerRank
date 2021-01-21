class Singleton {
    private volatile static Singleton instance;
    public static String str;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) instance = new Singleton();
            }
        }
        return instance;
    }
}