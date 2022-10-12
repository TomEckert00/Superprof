package solid.Aufgabe7;

public class SoftwareProjekt {

    // Was kann man verbessern?

    private FrontEndDeveloper frontEndDeveloper = new FrontEndDeveloper();
    private BackEndDeveloper backEndDeveloper = new BackEndDeveloper();

    public void CreateSoftware(){
        backEndDeveloper.WriteJavaCode();
        frontEndDeveloper.WriteJavascriptCode();
    }

}


