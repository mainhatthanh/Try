public interface Hello {

    public int answer = 42;
    default void doSomething(){
        System.out.println("hi");
    }

        }
