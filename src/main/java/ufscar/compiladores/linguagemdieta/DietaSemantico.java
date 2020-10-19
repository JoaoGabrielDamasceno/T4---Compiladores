package ufscar.compiladores.linguagemdieta;

import ufscar.compiladores.linguagemdieta.linguagemDIETABaseVisitor;
import ufscar.compiladores.linguagemdieta.linguagemDIETAParser;
import java.util.HashMap;
import java.util.List;


public class DietaSemantico extends linguagemDIETABaseVisitor<Object>{
    
    TabelaSimbolos tabelas = new TabelaSimbolos();
    
    @Override
    public Void visitFicha(linguagemDIETAParser.FichaContext ctx) {
        visitCabeçalho(ctx.cabeçalho());
        visitRodape(ctx.rodape());
        visitDieta(ctx.dieta());
        
        return null;
    }
   
    /*Apenas verificação se foi preenchido o nome do profissional, do cliente e a especialidade do profissional
    possa ser que o profissional não tenha um consultório ou atenda online sem ter um endereço*/   
    @Override
    public Void visitProfissional(linguagemDIETAParser.ProfissionalContext ctx){
        String verificaNull = ctx.cadeia.getText();
        
        if(verificaNull.equals("\"\"")){
             System.out.println("Linha " + ctx.getStart().getLine() + ": nome do profissional não inserido!");       
        }
        return null;
    }
    
    @Override
    public Void visitCliente(linguagemDIETAParser.ClienteContext ctx){
        String verificaNull = ctx.cadeia.getText();
        
        if(verificaNull.equals("\"\"")){
             System.out.println("Linha " + ctx.getStart().getLine() + ": nome do paciente não inserido!");     
        }
        return null;
    }
    
    @Override
    public Void visitEspecialidade(linguagemDIETAParser.EspecialidadeContext ctx){
        String verificaNull = ctx.cadeia.getText();
        
        if(verificaNull.equals("\"\"")){
             System.out.println("Linha " + ctx.getStart().getLine() + ": especialidade não inserida!");
        }
        return null;
    }
    
    //Verificação do CRN, tanto o dígito do código do estado quanto o número do CRN
    @Override
    public Void visitCrn(linguagemDIETAParser.CrnContext ctx){
        String verificaNull = ctx.digito.getText();
        int verificaCRN = Integer.parseInt(verificaNull);
        
        if(verificaNull == null){
             System.out.println("Linha " + ctx.getStart().getLine() + ": dígito do CRN não inserido!");
        } else if((verificaCRN < 11) || (verificaCRN == 0)){
            System.out.println("Linha " + ctx.getStart().getLine() + ": dígito do CRN inexistente, só pode ser de 1 a 10!");
        }
        return null;
    }
    
    @Override
    public Void visitNum_identificador(linguagemDIETAParser.Num_identificadorContext ctx){
        String verificaNull = ctx.identificador.getText();
        
        if(verificaNull == null){
             System.out.println("Linha " + ctx.getStart().getLine() + ": código do CRN não inserido!");
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


