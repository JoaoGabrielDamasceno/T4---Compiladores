package ufscar.compiladores.linguagemdieta;

import ufscar.compiladores.linguagemdieta.linguagemDIETABaseVisitor;
import ufscar.compiladores.linguagemdieta.linguagemDIETAParser;
import java.util.HashMap;
import java.util.List;



/**
 *
 * @author joaog
 */
public class DietaSemantico extends linguagemDIETABaseVisitor<Object>{
    
    TabelaSimbolos tabelas = new TabelaSimbolos();
    
    @Override
    public Void visitFicha(linguagemDIETAParser.FichaContext ctx) {
        visitCabeçalho(ctx.cabeçalho());
        visitRodape(ctx.rodape());
        visitDieta(ctx.dieta());
        
        return null;
    }
   
    //Apenas verificação se foi preenchido o nome do profissional ou do cliente, possa ser que o profissional não tenha um consultório ou atenda online sem ter um endereço
    
    @Override
    public Void visitProfissional(linguagemDIETAParser.ProfissionalContext ctx){
        String verificaNull = ctx.cadeia.getText();
        
        if(verificaNull.equals("\"\"")){
             System.out.println("Linha " + ctx.getStart().getLine() + ": nome do profissional não  inserido!");
        
        }
    return null;
    }
    
    @Override
    public Void visitCliente(linguagemDIETAParser.ClienteContext ctx){
        String verificaNull = ctx.cadeia.getText();
        
        if(verificaNull.equals("\"\"")){
             System.out.println("Linha " + ctx.getStart().getLine() + ": nome do paciente não  inserido!");
        
        }
    return null;
    }
    
    @Override
    public Void visitDieta(linguagemDIETAParser.DietaContext ctx){
            visitCorpo(ctx.corpo());
        return null; // declaração não tem valor
        
    }
    
    //Verifica se não tem refeicão repetida, ou seja, declarada duas vezes
    @Override
    public Void visitRefeicao(linguagemDIETAParser.RefeicaoContext ctx){
            if (tabelas.verificar(ctx.ident_refeicao.getText()) != null ) {
                System.out.println( "Refeição " + ctx.ident_refeicao.getText() + " declarada duas vezes!");
            } else {
            tabelas.inserir(ctx.ident_refeicao.getText());
        }
        return null; // declaração não tem valor
        
    }

}


