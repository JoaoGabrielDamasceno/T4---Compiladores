package ufscar.compiladores.linguagemdieta;

import org.antlr.v4.runtime.BaseErrorListener;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.*;

///ANTLR Error Listener para detectar erro sintático, classe filha de BaseErrorListeneroverride de syntaxError
public class ErrorListener extends BaseErrorListener {
    
    //Estava printando varias linhas de erro sintatico, então a variavel "x" é para controle disso e printar só a primeira
    int x;

    public ErrorListener(int x) {
        this.x = x;
    }
    
    @Override
    public void syntaxError(Recognizer<?, ?> rcgnzr, Object o, int i, int i1, String string, RecognitionException re) {
        //Pegando o token do erro para uma string
        Token t = (Token) o;
        String texto = t.getText();
        //Estava printando "<EOF>" então caso a token do erro for "<EOF>" mudará para "EOF"
        if ( t.getText () == "<EOF>" ){
                texto = "EOF";
                //i = i-1;
            }else{
                texto = t.getText ();
            }
        //Caso já tenha printando uma linha, não printará mais outra, i indica a linha do erro
        if(x==0){
        System.out.println("Linha " + (i) + ": erro sintatico proximo a " + texto);
        x = x + 1;
        }
             
    }
}