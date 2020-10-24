package ufscar.compiladores.linguagemdieta;

import ufscar.compiladores.linguagemdieta.linguagemDIETABaseVisitor;
import ufscar.compiladores.linguagemdieta.linguagemDIETAParser;
import java.util.HashMap;
import java.util.List;

public class DietaSemantico extends linguagemDIETABaseVisitor<Object>{
    //String global_refeicao = null;
    Escopos escoposAninhados = new Escopos();
    TabelaSimbolos tabelas = new TabelaSimbolos();
    Boolean erroSemantico = false;
    
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
            System.out.println("[ERRO SEMANTICO]" + "Linha " + ctx.getStart().getLine() + ": nome do profissional não  inserido!");
            erroSemantico = true;
        }
    return null;
    }
    
    @Override
    public Void visitCliente(linguagemDIETAParser.ClienteContext ctx){
        String verificaNull = ctx.cadeia.getText();
        
        if(verificaNull.equals("\"\"")){
            System.out.println("[ERRO SEMANTICO]" + "Linha " + ctx.getStart().getLine() + ": nome do paciente não  inserido!");
            erroSemantico = true;
        }
    return null;
    }
    
     //Verificação do CRN, tanto o dígito do código do estado quanto o número do CRN
    @Override
    public Void visitCrn(linguagemDIETAParser.CrnContext ctx){
        String verificaNull = ctx.digito.getText();
        int verificaCRN = Integer.parseInt(verificaNull);
        
        if((verificaCRN <= 0) || (verificaCRN >= 11)){
            System.out.println("[ERRO SEMANTICO]" + "Linha " + ctx.getStart().getLine() + ": dígito do CRN inexistente, só pode ser de 1 a 10!");
            erroSemantico = true;
        }
        return null;
    }
  
    
    @Override
    public Void visitDieta(linguagemDIETAParser.DietaContext ctx){
        visitCorpo(ctx.corpo());
        
        return null;   
    }
    
    //Verifica se não tem refeicão repetida, ou seja, declarada duas vezes
    @Override
    public Void visitRefeicao(linguagemDIETAParser.RefeicaoContext ctx){
        if (tabelas.verificar(ctx.ident_refeicao.getText()) != null ) {
            System.out.println("[ERRO SEMANTICO]" + "Linha" + ctx.ident_refeicao.getStart().getLine() + ":" + "Refeição " + ctx.ident_refeicao.getText() + " já declarada!");
            erroSemantico = true;
        } else {
            tabelas.inserir(ctx.ident_refeicao.getText());
        }
        escoposAninhados.criarNovoEscopo();
        visitOpcao_alimentos(ctx.opcao_alimentos());
        escoposAninhados.abandonarEscopo();
           
        return null;   
    }
    
    //Verifica se dentro da mesma refeição, uma opção de alimentação foi declarada duas vezes igual (muito dificil mas foi feita verificação desse erro semantico
    @Override
    public Void visitOpcao_alimentos(linguagemDIETAParser.Opcao_alimentosContext ctx){
        TabelaSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();
        
        if (escopoAtual.verificar(ctx.a1.getText()) != null) {
            System.out.println("[ERRO SEMANTICO]" + "Linha "  + ctx.a1.getStart().getLine() + ":" + "Opção de alimentação " + ctx.a1.getText() + " já declarada na mesma refeição!");
            erroSemantico = true;
        } else{
            escopoAtual.inserir(ctx.a1.getText());
            escoposAninhados.criarNovoEscopo();
            visitAlimentos(ctx.a1);
            escoposAninhados.abandonarEscopo();             
        }
        for (linguagemDIETAParser.AlimentosContext alimentosCtx : ctx.outrosA1) {
            if (escopoAtual.verificar(alimentosCtx.getText()) != null) {
                System.out.println("[ERRO SEMANTICO]" + "Linha "  + alimentosCtx.getStart().getLine() + ":" + "Opção de alimentação " + alimentosCtx.getText() + " já declarada na mesma refeição!");
                erroSemantico = true;
            } else{
                escopoAtual.inserir(alimentosCtx.getText());    
            } 
        }
        visitAlimentos(ctx.alimentos);   
        
        return null;
    }
    
     //Verifica se dentro da mesma opção da refeição, um alimento não foi declarado igual duas vezes (apenas o nome é o suficiente, não é preciso que a declaração seja igual na quantidade do alimento também 
    @Override
    public Void visitAlimentos(linguagemDIETAParser.AlimentosContext ctx){
        TabelaSimbolos escopoAtual = escoposAninhados.obterEscopoAtual();
        
        if (escopoAtual.verificar(ctx.a2.cadeia.getText()) != null) {
            System.out.println("[ERRO SEMANTICO]" + "Linha "  + ctx.a2.getStart().getLine() + ":" + " Alimento " + ctx.a2.cadeia.getText() + " já declarada na mesma opção da refeição!");
            erroSemantico = true;
        } else{
            escopoAtual.inserir(ctx.a2.cadeia.getText());            
        }
        for (linguagemDIETAParser.AlimentoContext alimentoCtx : ctx.outrosA2) {
            if (escopoAtual.verificar(alimentoCtx.cadeia.getText()) != null) {
                System.out.println("[ERRO SEMANTICO]" + "Linha "  + alimentoCtx.getStart().getLine() + ":" + " Alimento " + alimentoCtx.cadeia.getText() + " já declarada na mesma opção da refeição!");
                erroSemantico = true;
            } else{
                escopoAtual.inserir(alimentoCtx.cadeia.getText());    
            }     
        }

        return null;
    }
}


