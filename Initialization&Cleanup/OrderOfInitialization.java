//Demonstrates initialization order

public class OrderOfInitialization {

}


//When the constructor is called to create a window OBject, you will see a message
class Window{
    Window(int maker){
        System.out.println("Window("+maker+")");
    }
}

class House{
    Window w1 = new Window(1);
}

