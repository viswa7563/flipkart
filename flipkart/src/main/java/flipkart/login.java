package flipkart;

import org.teavm.jso.dom.html.HTMLDocument;
import org.teavm.jso.dom.html.HTMLElement;

public class login {
    public static void main(String[] args) {
        HTMLDocument document = HTMLDocument.current();
        HTMLElement div = document.createElement("div");
        div.appendChild(document.createTextNode("TeaVM generated element"));
        document.getBody().appendChild(div);
    }
}

