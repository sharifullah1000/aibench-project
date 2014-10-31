/* Generated By:JJTree&JavaCC: Do not edit this line. ParserConstants.java */
package bsh;

public interface ParserConstants {

        int EOF = 0;

        int NONPRINTABLE = 6;

        int SINGLE_LINE_COMMENT = 7;

        int HASH_BANG_COMMENT = 8;

        int MULTI_LINE_COMMENT = 9;

        int ABSTRACT = 10;

        int BOOLEAN = 11;

        int BREAK = 12;

        int CLASS = 13;

        int BYTE = 14;

        int CASE = 15;

        int CATCH = 16;

        int CHAR = 17;

        int CONST = 18;

        int CONTINUE = 19;

        int _DEFAULT = 20;

        int DO = 21;

        int DOUBLE = 22;

        int ELSE = 23;

        int ENUM = 24;

        int EXTENDS = 25;

        int FALSE = 26;

        int FINAL = 27;

        int FINALLY = 28;

        int FLOAT = 29;

        int FOR = 30;

        int GOTO = 31;

        int IF = 32;

        int IMPLEMENTS = 33;

        int IMPORT = 34;

        int INSTANCEOF = 35;

        int INT = 36;

        int INTERFACE = 37;

        int LONG = 38;

        int NATIVE = 39;

        int NEW = 40;

        int NULL = 41;

        int PACKAGE = 42;

        int PRIVATE = 43;

        int PROTECTED = 44;

        int PUBLIC = 45;

        int RETURN = 46;

        int SHORT = 47;

        int STATIC = 48;

        int STRICTFP = 49;

        int SWITCH = 50;

        int SYNCHRONIZED = 51;

        int TRANSIENT = 52;

        int THROW = 53;

        int THROWS = 54;

        int TRUE = 55;

        int TRY = 56;

        int VOID = 57;

        int VOLATILE = 58;

        int WHILE = 59;

        int INTEGER_LITERAL = 60;

        int DECIMAL_LITERAL = 61;

        int HEX_LITERAL = 62;

        int OCTAL_LITERAL = 63;

        int FLOATING_POINT_LITERAL = 64;

        int EXPONENT = 65;

        int CHARACTER_LITERAL = 66;

        int STRING_LITERAL = 67;

        int FORMAL_COMMENT = 68;

        int IDENTIFIER = 69;

        int LETTER = 70;

        int DIGIT = 71;

        int LPAREN = 72;

        int RPAREN = 73;

        int LBRACE = 74;

        int RBRACE = 75;

        int LBRACKET = 76;

        int RBRACKET = 77;

        int SEMICOLON = 78;

        int COMMA = 79;

        int DOT = 80;

        int ASSIGN = 81;

        int GT = 82;

        int GTX = 83;

        int LT = 84;

        int LTX = 85;

        int BANG = 86;

        int TILDE = 87;

        int HOOK = 88;

        int COLON = 89;

        int EQ = 90;

        int LE = 91;

        int LEX = 92;

        int GE = 93;

        int GEX = 94;

        int NE = 95;

        int BOOL_OR = 96;

        int BOOL_ORX = 97;

        int BOOL_AND = 98;

        int BOOL_ANDX = 99;

        int INCR = 100;

        int DECR = 101;

        int PLUS = 102;

        int MINUS = 103;

        int STAR = 104;

        int SLASH = 105;

        int BIT_AND = 106;

        int BIT_ANDX = 107;

        int BIT_OR = 108;

        int BIT_ORX = 109;

        int XOR = 110;

        int MOD = 111;

        int LSHIFT = 112;

        int LSHIFTX = 113;

        int RSIGNEDSHIFT = 114;

        int RSIGNEDSHIFTX = 115;

        int RUNSIGNEDSHIFT = 116;

        int RUNSIGNEDSHIFTX = 117;

        int PLUSASSIGN = 118;

        int MINUSASSIGN = 119;

        int STARASSIGN = 120;

        int SLASHASSIGN = 121;

        int ANDASSIGN = 122;

        int ANDASSIGNX = 123;

        int ORASSIGN = 124;

        int ORASSIGNX = 125;

        int XORASSIGN = 126;

        int MODASSIGN = 127;

        int LSHIFTASSIGN = 128;

        int LSHIFTASSIGNX = 129;

        int RSIGNEDSHIFTASSIGN = 130;

        int RSIGNEDSHIFTASSIGNX = 131;

        int RUNSIGNEDSHIFTASSIGN = 132;

        int RUNSIGNEDSHIFTASSIGNX = 133;

        int DEFAULT = 0;

        String[] tokenImage = { "<EOF>", "\" \"", "\"\\t\"", "\"\\r\"", "\"\\f\"", "\"\\n\"", "<NONPRINTABLE>", "<SINGLE_LINE_COMMENT>", "<HASH_BANG_COMMENT>", "<MULTI_LINE_COMMENT>", "\"abstract\"", "\"boolean\"", "\"break\"", "\"class\"", "\"byte\"", "\"case\"", "\"catch\"", "\"char\"", "\"const\"", "\"continue\"", "\"default\"", "\"do\"", "\"double\"", "\"else\"", "\"enum\"", "\"extends\"", "\"false\"", "\"final\"", "\"finally\"", "\"float\"", "\"for\"", "\"goto\"", "\"if\"", "\"implements\"", "\"import\"", "\"instanceof\"", "\"int\"", "\"interface\"", "\"long\"", "\"native\"", "\"new\"", "\"null\"", "\"package\"", "\"private\"", "\"protected\"", "\"public\"", "\"return\"", "\"short\"", "\"static\"", "\"strictfp\"", "\"switch\"", "\"synchronized\"", "\"transient\"", "\"throw\"", "\"throws\"", "\"true\"", "\"try\"", "\"void\"", "\"volatile\"", "\"while\"", "<INTEGER_LITERAL>", "<DECIMAL_LITERAL>", "<HEX_LITERAL>", "<OCTAL_LITERAL>", "<FLOATING_POINT_LITERAL>", "<EXPONENT>", "<CHARACTER_LITERAL>", "<STRING_LITERAL>", "<FORMAL_COMMENT>", "<IDENTIFIER>", "<LETTER>", "<DIGIT>", "\"(\"", "\")\"", "\"{\"", "\"}\"", "\"[\"", "\"]\"", "\";\"", "\",\"", "\".\"", "\"=\"", "\">\"", "\"@gt\"", "\"<\"", "\"@lt\"", "\"!\"", "\"~\"", "\"?\"", "\":\"", "\"==\"", "\"<=\"", "\"@lteq\"", "\">=\"", "\"@gteq\"", "\"!=\"", "\"||\"", "\"@or\"", "\"&&\"", "\"@and\"", "\"++\"", "\"--\"", "\"+\"", "\"-\"", "\"*\"", "\"/\"", "\"&\"", "\"@bitwise_and\"", "\"|\"", "\"@bitwise_or\"", "\"^\"", "\"%\"", "\"<<\"", "\"@left_shift\"", "\">>\"", "\"@right_shift\"", "\">>>\"", "\"@right_unsigned_shift\"", "\"+=\"", "\"-=\"", "\"*=\"", "\"/=\"", "\"&=\"", "\"@and_assign\"", "\"|=\"", "\"@or_assign\"", "\"^=\"", "\"%=\"", "\"<<=\"", "\"@left_shift_assign\"", "\">>=\"", "\"@right_shift_assign\"", "\">>>=\"", "\"@right_unsigned_shift_assign\"", };

}
