package ufscar.compiladores.linguagemdieta;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import ufscar.compiladores.linguagemdieta.linguagemDIETAParser.FichaContext;

public class Principal {

    public static void main(String[] args) throws FileNotFoundException {
        // Preparação do arquivo de saída, args[1] é o caminho do arquivo de saída
        PrintStream out = new PrintStream(new FileOutputStream(args[1])); 
        System.setOut(out);
        try {
            int x = 0;
            // args[0] é o primeiro argumento da linha de comando referente ao arquivo de entrada
            // Cria uma instância do interpretador para a linguagem LA
            CharStream cs = CharStreams.fromFileName(args[0]);
            linguagemDIETALexer lexer = new linguagemDIETALexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            linguagemDIETAParser parser = new linguagemDIETAParser(tokens);
            
            ErrorListener el = new ErrorListener(x);
            parser.addErrorListener(el);
            
            if(el.erroSintatico == false) {
                FichaContext arvore = parser.ficha();
                DietaSemantico as = new DietaSemantico();
                as.visitFicha(arvore);
                
                if(as.erroSemantico == false){
                    GeradorHTML agc = new GeradorHTML();
                    agc.visitFicha(arvore);
                    try(PrintWriter pw = new PrintWriter(args[1])) {
                        pw.print(agc.saida.toString());
                    }
                } else{
                    //Adicionado output ao semantico
                    System.out.println("Fim da compilacao"); 
                }
            }
             
        } catch (IOException ex) {
            
        }catch (ParseCancellationException ex){
            //Erros Lexicos
            System.out.println(ex.getMessage());
            System.out.println("Fim da compilacao");
        }

    }
}