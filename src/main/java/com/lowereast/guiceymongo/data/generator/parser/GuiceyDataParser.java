// $ANTLR 3.2 Sep 23, 2009 14:05:07 com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g 2010-10-25 14:58:08

package com.lowereast.guiceymongo.data.generator.parser;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;

public class GuiceyDataParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DATA", "TYPE_MAP", "TYPE_SET", "TYPE_LIST", "PARAMETERIZED_TYPE", "TYPE_PRIMITIVE", "PROPERTY", "OPTION", "PAIR", "ENUM", "ID", "INT", "FLOAT", "STRING", "TYPE", "WS", "EXPONENT", "ESC_SEQ", "HEX_DIGIT", "UNICODE_ESC", "OCTAL_ESC", "'{'", "'}'", "'{}'", "','", "'['", "']'", "'('", "')]'", "'='", "'data;'", "';'", "'map<'", "'>'", "'set<'", "'list<'", "'<'"
    };
    public static final int T__40=40;
    public static final int EXPONENT=20;
    public static final int OPTION=11;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int UNICODE_ESC=23;
    public static final int OCTAL_ESC=24;
    public static final int HEX_DIGIT=22;
    public static final int FLOAT=16;
    public static final int INT=15;
    public static final int TYPE_LIST=7;
    public static final int ID=14;
    public static final int EOF=-1;
    public static final int TYPE_PRIMITIVE=9;
    public static final int TYPE=18;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int PARAMETERIZED_TYPE=8;
    public static final int T__32=32;
    public static final int ESC_SEQ=21;
    public static final int WS=19;
    public static final int T__33=33;
    public static final int ENUM=13;
    public static final int T__34=34;
    public static final int TYPE_MAP=5;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int PROPERTY=10;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int TYPE_SET=6;
    public static final int PAIR=12;
    public static final int DATA=4;
    public static final int STRING=17;

    // delegates
    // delegators


        public GuiceyDataParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GuiceyDataParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return GuiceyDataParser.tokenNames; }
    public String getGrammarFileName() { return "com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "start"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:30:1: start : ( entry )+ EOF ;
    public final GuiceyDataParser.start_return start() throws RecognitionException {
        GuiceyDataParser.start_return retval = new GuiceyDataParser.start_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token EOF2=null;
        GuiceyDataParser.entry_return entry1 = null;


        Object EOF2_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:30:7: ( ( entry )+ EOF )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:30:9: ( entry )+ EOF
            {
            root_0 = (Object)adaptor.nil();

            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:30:9: ( entry )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case DATA:
                case ENUM:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: entry
            	    {
            	    pushFollow(FOLLOW_entry_in_start114);
            	    entry1=entry();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_start117); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            EOF2_tree = (Object)adaptor.create(EOF2);
            adaptor.addChild(root_0, EOF2_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "start"

    public static class entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "entry"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:33:1: entry : ( data | enumeration );
    public final GuiceyDataParser.entry_return entry() throws RecognitionException {
        GuiceyDataParser.entry_return retval = new GuiceyDataParser.entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.data_return data3 = null;

        GuiceyDataParser.enumeration_return enumeration4 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:33:7: ( data | enumeration )
            int alt2=2;
            switch ( input.LA(1) ) {
            case DATA:
                {
                alt2=1;
                }
                break;
            case ENUM:
                {
                alt2=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:33:9: data
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_data_in_entry127);
                    data3=data();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, data3.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:34:4: enumeration
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_enumeration_in_entry132);
                    enumeration4=enumeration();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, enumeration4.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "entry"

    public static class data_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:1: data : ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) | DATA ID '{}' -> ^( DATA ID ) );
    public final GuiceyDataParser.data_return data() throws RecognitionException {
        GuiceyDataParser.data_return retval = new GuiceyDataParser.data_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token DATA5=null;
        Token ID6=null;
        Token char_literal7=null;
        Token char_literal9=null;
        Token DATA10=null;
        Token ID11=null;
        Token string_literal12=null;
        GuiceyDataParser.data_entry_return data_entry8 = null;


        Object DATA5_tree=null;
        Object ID6_tree=null;
        Object char_literal7_tree=null;
        Object char_literal9_tree=null;
        Object DATA10_tree=null;
        Object ID11_tree=null;
        Object string_literal12_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_DATA=new RewriteRuleTokenStream(adaptor,"token DATA");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleSubtreeStream stream_data_entry=new RewriteRuleSubtreeStream(adaptor,"rule data_entry");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:6: ( DATA ID '{' ( data_entry )* '}' -> ^( DATA ID ( data_entry )* ) | DATA ID '{}' -> ^( DATA ID ) )
            int alt4=2;
            switch ( input.LA(1) ) {
            case DATA:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 25:
                        {
                        alt4=1;
                        }
                        break;
                    case 27:
                        {
                        alt4=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:8: DATA ID '{' ( data_entry )* '}'
                    {
                    DATA5=(Token)match(input,DATA,FOLLOW_DATA_in_data142); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA5);

                    ID6=(Token)match(input,ID,FOLLOW_ID_in_data144); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID6);

                    char_literal7=(Token)match(input,25,FOLLOW_25_in_data146); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal7);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:20: ( data_entry )*
                    loop3:
                    do {
                        int alt3=2;
                        switch ( input.LA(1) ) {
                        case DATA:
                        case ENUM:
                        case ID:
                        case TYPE:
                        case 29:
                        case 36:
                        case 38:
                        case 39:
                            {
                            alt3=1;
                            }
                            break;

                        }

                        switch (alt3) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: data_entry
                    	    {
                    	    pushFollow(FOLLOW_data_entry_in_data148);
                    	    data_entry8=data_entry();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_data_entry.add(data_entry8.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);

                    char_literal9=(Token)match(input,26,FOLLOW_26_in_data151); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal9);



                    // AST REWRITE
                    // elements: data_entry, DATA, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 37:36: -> ^( DATA ID ( data_entry )* )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:39: ^( DATA ID ( data_entry )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:37:49: ( data_entry )*
                        while ( stream_data_entry.hasNext() ) {
                            adaptor.addChild(root_1, stream_data_entry.nextTree());

                        }
                        stream_data_entry.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:4: DATA ID '{}'
                    {
                    DATA10=(Token)match(input,DATA,FOLLOW_DATA_in_data167); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DATA.add(DATA10);

                    ID11=(Token)match(input,ID,FOLLOW_ID_in_data169); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID11);

                    string_literal12=(Token)match(input,27,FOLLOW_27_in_data171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal12);



                    // AST REWRITE
                    // elements: ID, DATA
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 38:17: -> ^( DATA ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:38:20: ^( DATA ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_DATA.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "data"

    public static class enumeration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "enumeration"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:41:1: enumeration : ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) );
    public final GuiceyDataParser.enumeration_return enumeration() throws RecognitionException {
        GuiceyDataParser.enumeration_return retval = new GuiceyDataParser.enumeration_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ENUM13=null;
        Token ID14=null;
        Token string_literal15=null;
        Token ENUM16=null;
        Token ID17=null;
        Token char_literal18=null;
        Token ID19=null;
        Token char_literal20=null;
        Token ID21=null;
        Token char_literal22=null;

        Object ENUM13_tree=null;
        Object ID14_tree=null;
        Object string_literal15_tree=null;
        Object ENUM16_tree=null;
        Object ID17_tree=null;
        Object char_literal18_tree=null;
        Object ID19_tree=null;
        Object char_literal20_tree=null;
        Object ID21_tree=null;
        Object char_literal22_tree=null;
        RewriteRuleTokenStream stream_ENUM=new RewriteRuleTokenStream(adaptor,"token ENUM");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_25=new RewriteRuleTokenStream(adaptor,"token 25");
        RewriteRuleTokenStream stream_26=new RewriteRuleTokenStream(adaptor,"token 26");
        RewriteRuleTokenStream stream_27=new RewriteRuleTokenStream(adaptor,"token 27");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:2: ( ENUM ID '{}' -> ^( ENUM ID ) | ENUM ID '{' ( ID ',' )* ID '}' -> ^( ENUM ( ID )+ ) )
            int alt6=2;
            switch ( input.LA(1) ) {
            case ENUM:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 27:
                        {
                        alt6=1;
                        }
                        break;
                    case 25:
                        {
                        alt6=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:4: ENUM ID '{}'
                    {
                    ENUM13=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration190); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM13);

                    ID14=(Token)match(input,ID,FOLLOW_ID_in_enumeration192); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID14);

                    string_literal15=(Token)match(input,27,FOLLOW_27_in_enumeration194); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_27.add(string_literal15);



                    // AST REWRITE
                    // elements: ID, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 42:17: -> ^( ENUM ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:42:20: ^( ENUM ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:4: ENUM ID '{' ( ID ',' )* ID '}'
                    {
                    ENUM16=(Token)match(input,ENUM,FOLLOW_ENUM_in_enumeration207); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ENUM.add(ENUM16);

                    ID17=(Token)match(input,ID,FOLLOW_ID_in_enumeration209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID17);

                    char_literal18=(Token)match(input,25,FOLLOW_25_in_enumeration211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_25.add(char_literal18);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:16: ( ID ',' )*
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case 28:
                                {
                                alt5=1;
                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:17: ID ','
                    	    {
                    	    ID19=(Token)match(input,ID,FOLLOW_ID_in_enumeration214); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_ID.add(ID19);

                    	    char_literal20=(Token)match(input,28,FOLLOW_28_in_enumeration216); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal20);


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    ID21=(Token)match(input,ID,FOLLOW_ID_in_enumeration220); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID21);

                    char_literal22=(Token)match(input,26,FOLLOW_26_in_enumeration222); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_26.add(char_literal22);



                    // AST REWRITE
                    // elements: ID, ENUM
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 43:33: -> ^( ENUM ( ID )+ )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:43:36: ^( ENUM ( ID )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_ENUM.nextNode(), root_1);

                        if ( !(stream_ID.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_ID.hasNext() ) {
                            adaptor.addChild(root_1, stream_ID.nextNode());

                        }
                        stream_ID.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "enumeration"

    public static class data_entry_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "data_entry"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:46:1: data_entry : ( entry | ( option )* property -> ^( property ( option )* ) );
    public final GuiceyDataParser.data_entry_return data_entry() throws RecognitionException {
        GuiceyDataParser.data_entry_return retval = new GuiceyDataParser.data_entry_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.entry_return entry23 = null;

        GuiceyDataParser.option_return option24 = null;

        GuiceyDataParser.property_return property25 = null;


        RewriteRuleSubtreeStream stream_property=new RewriteRuleSubtreeStream(adaptor,"rule property");
        RewriteRuleSubtreeStream stream_option=new RewriteRuleSubtreeStream(adaptor,"rule option");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:2: ( entry | ( option )* property -> ^( property ( option )* ) )
            int alt8=2;
            switch ( input.LA(1) ) {
            case DATA:
            case ENUM:
                {
                alt8=1;
                }
                break;
            case ID:
            case TYPE:
            case 29:
            case 36:
            case 38:
            case 39:
                {
                alt8=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:47:4: entry
                    {
                    root_0 = (Object)adaptor.nil();

                    pushFollow(FOLLOW_entry_in_data_entry242);
                    entry23=entry();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, entry23.getTree());

                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:48:4: ( option )* property
                    {
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:48:4: ( option )*
                    loop7:
                    do {
                        int alt7=2;
                        switch ( input.LA(1) ) {
                        case 29:
                            {
                            alt7=1;
                            }
                            break;

                        }

                        switch (alt7) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:0:0: option
                    	    {
                    	    pushFollow(FOLLOW_option_in_data_entry247);
                    	    option24=option();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_option.add(option24.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    pushFollow(FOLLOW_property_in_data_entry250);
                    property25=property();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_property.add(property25.getTree());


                    // AST REWRITE
                    // elements: property, option
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 48:21: -> ^( property ( option )* )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:48:24: ^( property ( option )* )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(stream_property.nextNode(), root_1);

                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:48:35: ( option )*
                        while ( stream_option.hasNext() ) {
                            adaptor.addChild(root_1, stream_option.nextTree());

                        }
                        stream_option.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "data_entry"

    public static class option_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "option"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:51:1: option : ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) );
    public final GuiceyDataParser.option_return option() throws RecognitionException {
        GuiceyDataParser.option_return retval = new GuiceyDataParser.option_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal26=null;
        Token ID27=null;
        Token char_literal28=null;
        Token char_literal29=null;
        Token ID30=null;
        Token char_literal31=null;
        Token string_literal33=null;
        Token char_literal34=null;
        Token ID35=null;
        Token char_literal36=null;
        Token char_literal38=null;
        Token string_literal40=null;
        GuiceyDataParser.value_return value32 = null;

        GuiceyDataParser.pair_return pair37 = null;

        GuiceyDataParser.pair_return pair39 = null;


        Object char_literal26_tree=null;
        Object ID27_tree=null;
        Object char_literal28_tree=null;
        Object char_literal29_tree=null;
        Object ID30_tree=null;
        Object char_literal31_tree=null;
        Object string_literal33_tree=null;
        Object char_literal34_tree=null;
        Object ID35_tree=null;
        Object char_literal36_tree=null;
        Object char_literal38_tree=null;
        Object string_literal40_tree=null;
        RewriteRuleTokenStream stream_30=new RewriteRuleTokenStream(adaptor,"token 30");
        RewriteRuleTokenStream stream_32=new RewriteRuleTokenStream(adaptor,"token 32");
        RewriteRuleTokenStream stream_31=new RewriteRuleTokenStream(adaptor,"token 31");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_29=new RewriteRuleTokenStream(adaptor,"token 29");
        RewriteRuleSubtreeStream stream_pair=new RewriteRuleSubtreeStream(adaptor,"rule pair");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:2: ( '[' ID ']' -> ^( OPTION ID ) | '[' ID '(' value ')]' -> ^( OPTION ID value ) | '[' ID '(' ( pair ',' )* pair ')]' -> ^( OPTION ID ( pair )+ ) )
            int alt10=3;
            switch ( input.LA(1) ) {
            case 29:
                {
                switch ( input.LA(2) ) {
                case ID:
                    {
                    switch ( input.LA(3) ) {
                    case 30:
                        {
                        alt10=1;
                        }
                        break;
                    case 31:
                        {
                        switch ( input.LA(4) ) {
                        case ID:
                            {
                            alt10=3;
                            }
                            break;
                        case INT:
                        case FLOAT:
                        case STRING:
                            {
                            alt10=2;
                            }
                            break;
                        default:
                            if (state.backtracking>0) {state.failed=true; return retval;}
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 4, input);

                            throw nvae;
                        }

                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;
                    }

                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:4: '[' ID ']'
                    {
                    char_literal26=(Token)match(input,29,FOLLOW_29_in_option270); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal26);

                    ID27=(Token)match(input,ID,FOLLOW_ID_in_option272); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID27);

                    char_literal28=(Token)match(input,30,FOLLOW_30_in_option274); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_30.add(char_literal28);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 52:15: -> ^( OPTION ID )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:52:18: ^( OPTION ID )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:53:4: '[' ID '(' value ')]'
                    {
                    char_literal29=(Token)match(input,29,FOLLOW_29_in_option287); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal29);

                    ID30=(Token)match(input,ID,FOLLOW_ID_in_option289); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID30);

                    char_literal31=(Token)match(input,31,FOLLOW_31_in_option291); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal31);

                    pushFollow(FOLLOW_value_in_option293);
                    value32=value();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_value.add(value32.getTree());
                    string_literal33=(Token)match(input,32,FOLLOW_32_in_option295); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(string_literal33);



                    // AST REWRITE
                    // elements: value, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 53:26: -> ^( OPTION ID value )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:53:29: ^( OPTION ID value )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_value.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:55:4: '[' ID '(' ( pair ',' )* pair ')]'
                    {
                    char_literal34=(Token)match(input,29,FOLLOW_29_in_option311); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_29.add(char_literal34);

                    ID35=(Token)match(input,ID,FOLLOW_ID_in_option313); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID35);

                    char_literal36=(Token)match(input,31,FOLLOW_31_in_option315); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_31.add(char_literal36);

                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:55:15: ( pair ',' )*
                    loop9:
                    do {
                        int alt9=2;
                        switch ( input.LA(1) ) {
                        case ID:
                            {
                            switch ( input.LA(2) ) {
                            case 33:
                                {
                                switch ( input.LA(3) ) {
                                case INT:
                                case FLOAT:
                                case STRING:
                                    {
                                    switch ( input.LA(4) ) {
                                    case 28:
                                        {
                                        alt9=1;
                                        }
                                        break;

                                    }

                                    }
                                    break;

                                }

                                }
                                break;

                            }

                            }
                            break;

                        }

                        switch (alt9) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:55:16: pair ','
                    	    {
                    	    pushFollow(FOLLOW_pair_in_option318);
                    	    pair37=pair();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_pair.add(pair37.getTree());
                    	    char_literal38=(Token)match(input,28,FOLLOW_28_in_option320); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal38);


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);

                    pushFollow(FOLLOW_pair_in_option324);
                    pair39=pair();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_pair.add(pair39.getTree());
                    string_literal40=(Token)match(input,32,FOLLOW_32_in_option326); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_32.add(string_literal40);



                    // AST REWRITE
                    // elements: pair, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 55:37: -> ^( OPTION ID ( pair )+ )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:55:40: ^( OPTION ID ( pair )+ )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(OPTION, "OPTION"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        if ( !(stream_pair.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_pair.hasNext() ) {
                            adaptor.addChild(root_1, stream_pair.nextTree());

                        }
                        stream_pair.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "option"

    public static class pair_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "pair"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:58:1: pair : key '=' value -> ^( PAIR key value ) ;
    public final GuiceyDataParser.pair_return pair() throws RecognitionException {
        GuiceyDataParser.pair_return retval = new GuiceyDataParser.pair_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token char_literal42=null;
        GuiceyDataParser.key_return key41 = null;

        GuiceyDataParser.value_return value43 = null;


        Object char_literal42_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_value=new RewriteRuleSubtreeStream(adaptor,"rule value");
        RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:59:2: ( key '=' value -> ^( PAIR key value ) )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:59:4: key '=' value
            {
            pushFollow(FOLLOW_key_in_pair349);
            key41=key();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_key.add(key41.getTree());
            char_literal42=(Token)match(input,33,FOLLOW_33_in_pair351); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_33.add(char_literal42);

            pushFollow(FOLLOW_value_in_pair353);
            value43=value();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_value.add(value43.getTree());


            // AST REWRITE
            // elements: key, value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:18: -> ^( PAIR key value )
            {
                // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:59:21: ^( PAIR key value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PAIR, "PAIR"), root_1);

                adaptor.addChild(root_1, stream_key.nextTree());
                adaptor.addChild(root_1, stream_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            retval.tree = root_0;}
            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "pair"

    public static class key_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:62:1: key : ID ;
    public final GuiceyDataParser.key_return key() throws RecognitionException {
        GuiceyDataParser.key_return retval = new GuiceyDataParser.key_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token ID44=null;

        Object ID44_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:63:2: ( ID )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:63:4: ID
            {
            root_0 = (Object)adaptor.nil();

            ID44=(Token)match(input,ID,FOLLOW_ID_in_key375); if (state.failed) return retval;
            if ( state.backtracking==0 ) {
            ID44_tree = (Object)adaptor.create(ID44);
            adaptor.addChild(root_0, ID44_tree);
            }

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "key"

    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:65:1: value : ( INT | FLOAT | STRING );
    public final GuiceyDataParser.value_return value() throws RecognitionException {
        GuiceyDataParser.value_return retval = new GuiceyDataParser.value_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token set45=null;

        Object set45_tree=null;

        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:66:2: ( INT | FLOAT | STRING )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:
            {
            root_0 = (Object)adaptor.nil();

            set45=(Token)input.LT(1);
            if ( (input.LA(1)>=INT && input.LA(1)<=STRING) ) {
                input.consume();
                if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set45));
                state.errorRecovery=false;state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value"

    public static class property_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "property"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:71:1: property : ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) );
    public final GuiceyDataParser.property_return property() throws RecognitionException {
        GuiceyDataParser.property_return retval = new GuiceyDataParser.property_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal47=null;
        Token ID49=null;
        Token char_literal50=null;
        GuiceyDataParser.type_return type46 = null;

        GuiceyDataParser.type_return type48 = null;


        Object string_literal47_tree=null;
        Object ID49_tree=null;
        Object char_literal50_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_35=new RewriteRuleTokenStream(adaptor,"token 35");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:79:2: ( type 'data;' -> ^( PROPERTY 'data' type ) | type ID ';' -> ^( PROPERTY ID type ) )
            int alt11=2;
            switch ( input.LA(1) ) {
            case 36:
                {
                int LA11_1 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;
                }
                }
                break;
            case 38:
                {
                int LA11_2 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 2, input);

                    throw nvae;
                }
                }
                break;
            case 39:
                {
                int LA11_3 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 3, input);

                    throw nvae;
                }
                }
                break;
            case TYPE:
                {
                int LA11_4 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 4, input);

                    throw nvae;
                }
                }
                break;
            case ID:
                {
                int LA11_5 = input.LA(2);

                if ( (synpred14_GuiceyData()) ) {
                    alt11=1;
                }
                else if ( (true) ) {
                    alt11=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 5, input);

                    throw nvae;
                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:79:4: type 'data;'
                    {
                    pushFollow(FOLLOW_type_in_property409);
                    type46=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type46.getTree());
                    string_literal47=(Token)match(input,34,FOLLOW_34_in_property411); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_34.add(string_literal47);



                    // AST REWRITE
                    // elements: DATA, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 79:17: -> ^( PROPERTY 'data' type )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:79:20: ^( PROPERTY 'data' type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, (Object)adaptor.create(DATA, "DATA"));
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:80:4: type ID ';'
                    {
                    pushFollow(FOLLOW_type_in_property426);
                    type48=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type48.getTree());
                    ID49=(Token)match(input,ID,FOLLOW_ID_in_property428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID49);

                    char_literal50=(Token)match(input,35,FOLLOW_35_in_property430); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_35.add(char_literal50);



                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 80:16: -> ^( PROPERTY ID type )
                    {
                        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:80:19: ^( PROPERTY ID type )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot((Object)adaptor.create(PROPERTY, "PROPERTY"), root_1);

                        adaptor.addChild(root_1, stream_ID.nextNode());
                        adaptor.addChild(root_1, stream_type.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "property"

    public static class key_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "key_type"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:83:1: key_type : type ;
    public final GuiceyDataParser.key_type_return key_type() throws RecognitionException {
        GuiceyDataParser.key_type_return retval = new GuiceyDataParser.key_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type51 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:84:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:84:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_key_type451);
            type51=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type51.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "key_type"

    public static class value_type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "value_type"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:87:1: value_type : type ;
    public final GuiceyDataParser.value_type_return value_type() throws RecognitionException {
        GuiceyDataParser.value_type_return retval = new GuiceyDataParser.value_type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        GuiceyDataParser.type_return type52 = null;



        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:2: ( type )
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:88:4: type
            {
            root_0 = (Object)adaptor.nil();

            pushFollow(FOLLOW_type_in_value_type462);
            type52=type();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, type52.getTree());

            }

            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "value_type"

    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "type"
    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:91:1: type : ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID | ID '<' type ( ',' type )* '>' -> PARAMETERIZED_TYPE ID ( type )+ );
    public final GuiceyDataParser.type_return type() throws RecognitionException {
        GuiceyDataParser.type_return retval = new GuiceyDataParser.type_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token string_literal53=null;
        Token char_literal55=null;
        Token char_literal57=null;
        Token string_literal58=null;
        Token char_literal60=null;
        Token string_literal61=null;
        Token char_literal63=null;
        Token TYPE64=null;
        Token ID65=null;
        Token ID66=null;
        Token char_literal67=null;
        Token char_literal69=null;
        Token char_literal71=null;
        GuiceyDataParser.type_return type54 = null;

        GuiceyDataParser.type_return type56 = null;

        GuiceyDataParser.type_return type59 = null;

        GuiceyDataParser.type_return type62 = null;

        GuiceyDataParser.type_return type68 = null;

        GuiceyDataParser.type_return type70 = null;


        Object string_literal53_tree=null;
        Object char_literal55_tree=null;
        Object char_literal57_tree=null;
        Object string_literal58_tree=null;
        Object char_literal60_tree=null;
        Object string_literal61_tree=null;
        Object char_literal63_tree=null;
        Object TYPE64_tree=null;
        Object ID65_tree=null;
        Object ID66_tree=null;
        Object char_literal67_tree=null;
        Object char_literal69_tree=null;
        Object char_literal71_tree=null;
        RewriteRuleTokenStream stream_40=new RewriteRuleTokenStream(adaptor,"token 40");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_36=new RewriteRuleTokenStream(adaptor,"token 36");
        RewriteRuleTokenStream stream_39=new RewriteRuleTokenStream(adaptor,"token 39");
        RewriteRuleTokenStream stream_TYPE=new RewriteRuleTokenStream(adaptor,"token TYPE");
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_28=new RewriteRuleTokenStream(adaptor,"token 28");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleSubtreeStream stream_type=new RewriteRuleSubtreeStream(adaptor,"rule type");
        try {
            // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:92:2: ( 'map<' type ',' type '>' -> TYPE_MAP ( type )+ | 'set<' type '>' -> TYPE_SET type | 'list<' type '>' -> TYPE_LIST type | TYPE -> TYPE_PRIMITIVE TYPE | ID -> TYPE_PRIMITIVE ID | ID '<' type ( ',' type )* '>' -> PARAMETERIZED_TYPE ID ( type )+ )
            int alt13=6;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt13=1;
                }
                break;
            case 38:
                {
                alt13=2;
                }
                break;
            case 39:
                {
                alt13=3;
                }
                break;
            case TYPE:
                {
                alt13=4;
                }
                break;
            case ID:
                {
                switch ( input.LA(2) ) {
                case 40:
                    {
                    alt13=6;
                    }
                    break;
                case EOF:
                case ID:
                case 28:
                case 34:
                case 37:
                    {
                    alt13=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 5, input);

                    throw nvae;
                }

                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }

            switch (alt13) {
                case 1 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:92:4: 'map<' type ',' type '>'
                    {
                    string_literal53=(Token)match(input,36,FOLLOW_36_in_type473); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_36.add(string_literal53);

                    pushFollow(FOLLOW_type_in_type475);
                    type54=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type54.getTree());
                    char_literal55=(Token)match(input,28,FOLLOW_28_in_type477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_28.add(char_literal55);

                    pushFollow(FOLLOW_type_in_type479);
                    type56=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type56.getTree());
                    char_literal57=(Token)match(input,37,FOLLOW_37_in_type481); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal57);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 92:29: -> TYPE_MAP ( type )+
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_MAP, "TYPE_MAP"));
                        if ( !(stream_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_type.hasNext() ) {
                            adaptor.addChild(root_0, stream_type.nextTree());

                        }
                        stream_type.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 2 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:93:4: 'set<' type '>'
                    {
                    string_literal58=(Token)match(input,38,FOLLOW_38_in_type493); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_38.add(string_literal58);

                    pushFollow(FOLLOW_type_in_type495);
                    type59=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type59.getTree());
                    char_literal60=(Token)match(input,37,FOLLOW_37_in_type497); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal60);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 93:20: -> TYPE_SET type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_SET, "TYPE_SET"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 3 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:94:4: 'list<' type '>'
                    {
                    string_literal61=(Token)match(input,39,FOLLOW_39_in_type508); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_39.add(string_literal61);

                    pushFollow(FOLLOW_type_in_type510);
                    type62=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type62.getTree());
                    char_literal63=(Token)match(input,37,FOLLOW_37_in_type512); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal63);



                    // AST REWRITE
                    // elements: type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 94:21: -> TYPE_LIST type
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_LIST, "TYPE_LIST"));
                        adaptor.addChild(root_0, stream_type.nextTree());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 4 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:95:4: TYPE
                    {
                    TYPE64=(Token)match(input,TYPE,FOLLOW_TYPE_in_type523); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_TYPE.add(TYPE64);



                    // AST REWRITE
                    // elements: TYPE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 95:9: -> TYPE_PRIMITIVE TYPE
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_TYPE.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 5 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:96:4: ID
                    {
                    ID65=(Token)match(input,ID,FOLLOW_ID_in_type534); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID65);



                    // AST REWRITE
                    // elements: ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 96:7: -> TYPE_PRIMITIVE ID
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(TYPE_PRIMITIVE, "TYPE_PRIMITIVE"));
                        adaptor.addChild(root_0, stream_ID.nextNode());

                    }

                    retval.tree = root_0;}
                    }
                    break;
                case 6 :
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:97:4: ID '<' type ( ',' type )* '>'
                    {
                    ID66=(Token)match(input,ID,FOLLOW_ID_in_type545); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ID.add(ID66);

                    char_literal67=(Token)match(input,40,FOLLOW_40_in_type547); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_40.add(char_literal67);

                    pushFollow(FOLLOW_type_in_type549);
                    type68=type();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_type.add(type68.getTree());
                    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:97:16: ( ',' type )*
                    loop12:
                    do {
                        int alt12=2;
                        switch ( input.LA(1) ) {
                        case 28:
                            {
                            alt12=1;
                            }
                            break;

                        }

                        switch (alt12) {
                    	case 1 :
                    	    // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:97:17: ',' type
                    	    {
                    	    char_literal69=(Token)match(input,28,FOLLOW_28_in_type552); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_28.add(char_literal69);

                    	    pushFollow(FOLLOW_type_in_type554);
                    	    type70=type();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_type.add(type70.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);

                    char_literal71=(Token)match(input,37,FOLLOW_37_in_type558); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_37.add(char_literal71);



                    // AST REWRITE
                    // elements: ID, type
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 97:32: -> PARAMETERIZED_TYPE ID ( type )+
                    {
                        adaptor.addChild(root_0, (Object)adaptor.create(PARAMETERIZED_TYPE, "PARAMETERIZED_TYPE"));
                        adaptor.addChild(root_0, stream_ID.nextNode());
                        if ( !(stream_type.hasNext()) ) {
                            throw new RewriteEarlyExitException();
                        }
                        while ( stream_type.hasNext() ) {
                            adaptor.addChild(root_0, stream_type.nextTree());

                        }
                        stream_type.reset();

                    }

                    retval.tree = root_0;}
                    }
                    break;

            }
            retval.stop = input.LT(-1);

            if ( state.backtracking==0 ) {

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "type"

    // $ANTLR start synpred14_GuiceyData
    public final void synpred14_GuiceyData_fragment() throws RecognitionException {   
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:79:4: ( type 'data;' )
        // com\\lowereast\\guiceymongo\\data\\generator\\parser\\GuiceyData.g:79:4: type 'data;'
        {
        pushFollow(FOLLOW_type_in_synpred14_GuiceyData409);
        type();

        state._fsp--;
        if (state.failed) return ;
        match(input,34,FOLLOW_34_in_synpred14_GuiceyData411); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred14_GuiceyData

    // Delegated rules

    public final boolean synpred14_GuiceyData() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_GuiceyData_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_entry_in_start114 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_EOF_in_start117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_data_in_entry127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enumeration_in_entry132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data142 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_data144 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_data146 = new BitSet(new long[]{0x000000D024046010L});
    public static final BitSet FOLLOW_data_entry_in_data148 = new BitSet(new long[]{0x000000D024046010L});
    public static final BitSet FOLLOW_26_in_data151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DATA_in_data167 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_data169 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_data171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration190 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_enumeration192 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_27_in_enumeration194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ENUM_in_enumeration207 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_enumeration209 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_enumeration211 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_enumeration214 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_enumeration216 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_enumeration220 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_enumeration222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_entry_in_data_entry242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_option_in_data_entry247 = new BitSet(new long[]{0x000000D020046010L});
    public static final BitSet FOLLOW_property_in_data_entry250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_option270 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_option272 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_option274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_option287 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_option289 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option291 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_value_in_option293 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_option295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_option311 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_option313 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_option315 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_pair_in_option318 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_option320 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_pair_in_option324 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_32_in_option326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_key_in_pair349 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_pair351 = new BitSet(new long[]{0x0000000000038000L});
    public static final BitSet FOLLOW_value_in_pair353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_key375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_value0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property409 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_property411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_property426 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_property428 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_property430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_key_type451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_value_type462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_type473 = new BitSet(new long[]{0x000000D000044000L});
    public static final BitSet FOLLOW_type_in_type475 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_type477 = new BitSet(new long[]{0x000000D000044000L});
    public static final BitSet FOLLOW_type_in_type479 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_type481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_type493 = new BitSet(new long[]{0x000000D000044000L});
    public static final BitSet FOLLOW_type_in_type495 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_type497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_type508 = new BitSet(new long[]{0x000000D000044000L});
    public static final BitSet FOLLOW_type_in_type510 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_type512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPE_in_type523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_type545 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_type547 = new BitSet(new long[]{0x000000D000044000L});
    public static final BitSet FOLLOW_type_in_type549 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_28_in_type552 = new BitSet(new long[]{0x000000D000044000L});
    public static final BitSet FOLLOW_type_in_type554 = new BitSet(new long[]{0x0000002010000000L});
    public static final BitSet FOLLOW_37_in_type558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_synpred14_GuiceyData409 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_synpred14_GuiceyData411 = new BitSet(new long[]{0x0000000000000002L});

}