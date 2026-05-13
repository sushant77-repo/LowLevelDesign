package CreationalDesignPatterns.SingletonPattern;

public class DBConnectionDoubleCheckedLock {
    // instance variable
    // volatile keyword makes sure that value of variable is fetched from main memory
    // and not from cache of any thread - so value remains latest
    // it also ensures order of object creation is not changed internally by java
    private static volatile DBConnectionDoubleCheckedLock connectionObj = null;
    private int portNumber;

    // private constructor to avoid creation of new object
    private DBConnectionDoubleCheckedLock(int portNumber) {
        this.portNumber = portNumber;
    }

    // thread safe method to get unique instance of class
    // ensures no more than one instance is created
    public DBConnectionDoubleCheckedLock getConnectionObj() {
        if (connectionObj ==  null) {
            synchronized (DBConnectionDoubleCheckedLock.class) {
                if (connectionObj == null) { // second check also required
                    connectionObj = new DBConnectionDoubleCheckedLock(5567);
                }
            }
        }
        return connectionObj;
    }
}
