'when (ktOperator) {
            KtTokens.EQ -> IrStatementOrigin.EQ
            KtTokens.PLUSEQ -> IrStatementOrigin.PLUSEQ
            KtTokens.MINUSEQ -> IrStatementOrigin.MINUSEQ
            KtTokens.MULTEQ -> IrStatementOrigin.MULTEQ
            KtTokens.DIVEQ -> IrStatementOrigin.DIVEQ
            KtTokens.PERCEQ -> IrStatementOrigin.PERCEQ
            KtTokens.PLUS -> IrStatementOrigin.PLUS
            KtTokens.MINUS -> IrStatementOrigin.MINUS
            KtTokens.MUL -> IrStatementOrigin.MUL
            KtTokens.DIV -> IrStatementOrigin.DIV
            KtTokens.PERC -> IrStatementOrigin.PERC
            KtTokens.RANGE -> IrStatementOrigin.RANGE
            KtTokens.LT -> IrStatementOrigin.LT
            KtTokens.LTEQ -> IrStatementOrigin.LTEQ
            KtTokens.GT -> IrStatementOrigin.GT
            KtTokens.GTEQ -> IrStatementOrigin.GTEQ
            KtTokens.EQEQ -> IrStatementOrigin.EQEQ
            KtTokens.EXCLEQ -> IrStatementOrigin.EXCLEQ
            KtTokens.EQEQEQ -> IrStatementOrigin.EQEQEQ
            KtTokens.EXCLEQEQEQ -> IrStatementOrigin.EXCLEQEQ
            KtTokens.IN_KEYWORD -> IrStatementOrigin.IN
            KtTokens.NOT_IN -> IrStatementOrigin.NOT_IN
            KtTokens.ANDAND -> IrStatementOrigin.ANDAND
            KtTokens.OROR -> IrStatementOrigin.OROR
            KtTokens.ELVIS -> IrStatementOrigin.ELVIS
            else -> null
        }' @ [26:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrStatementOrigin?, entry1: IrStatementOrigin?, entry2: IrStatementOrigin?, entry3: IrStatementOrigin?, entry4: IrStatementOrigin?, entry5: IrStatementOrigin?, entry6: IrStatementOrigin?, entry7: IrStatementOrigin?, entry8: IrStatementOrigin?, entry9: IrStatementOrigin?, entry10: IrStatementOrigin?, entry11: IrStatementOrigin?, entry12: IrStatementOrigin?, entry13: IrStatementOrigin?, entry14: IrStatementOrigin?, entry15: IrStatementOrigin?, entry16: IrStatementOrigin?, entry17: IrStatementOrigin?, entry18: IrStatementOrigin?, entry19: IrStatementOrigin?, entry20: IrStatementOrigin?, entry21: IrStatementOrigin?, entry22: IrStatementOrigin?, entry23: IrStatementOrigin?, entry24: IrStatementOrigin?, entry25: IrStatementOrigin?): IrStatementOrigin?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrStatementOrigin?

'ktOperator' @ [26:15] ==> value-parameter ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.getInfixOperator[ValueParameterDescriptorImpl]

'EQ' @ [27:22] ==> public final val EQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQ' @ [27:46] ==> public object EQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PLUSEQ' @ [28:22] ==> public final val PLUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PLUSEQ' @ [28:50] ==> public object PLUSEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUSEQ' @ [29:22] ==> public final val MINUSEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUSEQ' @ [29:51] ==> public object MINUSEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MULTEQ' @ [30:22] ==> public final val MULTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MULTEQ' @ [30:50] ==> public object MULTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'DIVEQ' @ [31:22] ==> public final val DIVEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DIVEQ' @ [31:49] ==> public object DIVEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PERCEQ' @ [32:22] ==> public final val PERCEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PERCEQ' @ [32:50] ==> public object PERCEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PLUS' @ [33:22] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PLUS' @ [33:48] ==> public object PLUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUS' @ [34:22] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MINUS' @ [34:49] ==> public object MINUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MUL' @ [35:22] ==> public final val MUL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'MUL' @ [35:47] ==> public object MUL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'DIV' @ [36:22] ==> public final val DIV: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'DIV' @ [36:47] ==> public object DIV : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PERC' @ [37:22] ==> public final val PERC: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PERC' @ [37:48] ==> public object PERC : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'RANGE' @ [38:22] ==> public final val RANGE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'RANGE' @ [38:49] ==> public object RANGE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'LT' @ [39:22] ==> public final val LT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LT' @ [39:46] ==> public object LT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'LTEQ' @ [40:22] ==> public final val LTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'LTEQ' @ [40:48] ==> public object LTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'GT' @ [41:22] ==> public final val GT: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [41:46] ==> public object GT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'GTEQ' @ [42:22] ==> public final val GTEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GTEQ' @ [42:48] ==> public object GTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EQEQ' @ [43:22] ==> public final val EQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQ' @ [43:48] ==> public object EQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCLEQ' @ [44:22] ==> public final val EXCLEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQ' @ [44:50] ==> public object EXCLEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EQEQEQ' @ [45:22] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EQEQEQ' @ [45:50] ==> public object EQEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCLEQEQEQ' @ [46:22] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQ' @ [46:54] ==> public object EXCLEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'IN_KEYWORD' @ [47:22] ==> public final val IN_KEYWORD: (KtModifierKeywordToken..KtModifierKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'IN' @ [47:54] ==> public object IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'NOT_IN' @ [48:22] ==> public final val NOT_IN: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_IN' @ [48:50] ==> public object NOT_IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'ANDAND' @ [49:22] ==> public final val ANDAND: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANDAND' @ [49:50] ==> public object ANDAND : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'OROR' @ [50:22] ==> public final val OROR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'OROR' @ [50:48] ==> public object OROR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'ELVIS' @ [51:22] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ELVIS' @ [51:49] ==> public object ELVIS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'when (ktOperator) {
            KtTokens.PLUSPLUS -> IrStatementOrigin.PREFIX_INCR
            KtTokens.MINUSMINUS -> IrStatementOrigin.PREFIX_DECR
            KtTokens.EXCL -> IrStatementOrigin.EXCL
            KtTokens.MINUS -> IrStatementOrigin.UMINUS
            KtTokens.PLUS -> IrStatementOrigin.UPLUS
            else -> null
        }' @ [56:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrStatementOrigin?, entry1: IrStatementOrigin?, entry2: IrStatementOrigin?, entry3: IrStatementOrigin?, entry4: IrStatementOrigin?, entry5: IrStatementOrigin?): IrStatementOrigin?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrStatementOrigin?

'ktOperator' @ [56:15] ==> value-parameter ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.getPrefixOperator[ValueParameterDescriptorImpl]

'PLUSPLUS' @ [57:22] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PREFIX_INCR' @ [57:52] ==> public object PREFIX_INCR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUSMINUS' @ [58:22] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'PREFIX_DECR' @ [58:54] ==> public object PREFIX_DECR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCL' @ [59:22] ==> public final val EXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCL' @ [59:48] ==> public object EXCL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUS' @ [60:22] ==> public final val MINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UMINUS' @ [60:49] ==> public object UMINUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PLUS' @ [61:22] ==> public final val PLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'UPLUS' @ [61:48] ==> public object UPLUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'when (ktOperator) {
            KtTokens.PLUSPLUS -> IrStatementOrigin.POSTFIX_INCR
            KtTokens.MINUSMINUS -> IrStatementOrigin.POSTFIX_DECR
            KtTokens.EXCLEXCL -> IrStatementOrigin.EXCLEXCL
            else -> null
        }' @ [66:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrStatementOrigin?, entry1: IrStatementOrigin?, entry2: IrStatementOrigin?, entry3: IrStatementOrigin?): IrStatementOrigin?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrStatementOrigin?

'ktOperator' @ [66:15] ==> value-parameter ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.getPostfixOperator[ValueParameterDescriptorImpl]

'PLUSPLUS' @ [67:22] ==> public final val PLUSPLUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'POSTFIX_INCR' @ [67:52] ==> public object POSTFIX_INCR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUSMINUS' @ [68:22] ==> public final val MINUSMINUS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'POSTFIX_DECR' @ [68:54] ==> public object POSTFIX_DECR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCLEXCL' @ [69:22] ==> public final val EXCLEXCL: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEXCL' @ [69:52] ==> public object EXCLEXCL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'when (ktOperator) {
            KtTokens.IS_KEYWORD -> IrTypeOperator.INSTANCEOF
            KtTokens.NOT_IS -> IrTypeOperator.NOT_INSTANCEOF
            KtTokens.AS_KEYWORD -> IrTypeOperator.CAST
            KtTokens.AS_SAFE -> IrTypeOperator.SAFE_CAST
            else -> null
        }' @ [74:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: IrTypeOperator?, entry1: IrTypeOperator?, entry2: IrTypeOperator?, entry3: IrTypeOperator?, entry4: IrTypeOperator?): IrTypeOperator?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> IrTypeOperator?

'ktOperator' @ [74:15] ==> value-parameter ktOperator: IElementType defined in org.jetbrains.kotlin.psi2ir.generators.getIrTypeOperator[ValueParameterDescriptorImpl]

'IS_KEYWORD' @ [75:22] ==> public final val IS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'INSTANCEOF' @ [75:51] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'NOT_IS' @ [76:22] ==> public final val NOT_IS: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'NOT_INSTANCEOF' @ [76:47] ==> enum entry NOT_INSTANCEOF defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'AS_KEYWORD' @ [77:22] ==> public final val AS_KEYWORD: (KtKeywordToken..KtKeywordToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'CAST' @ [77:51] ==> enum entry CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'AS_SAFE' @ [78:22] ==> public final val AS_SAFE: (KtToken..KtToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'SAFE_CAST' @ [78:48] ==> enum entry SAFE_CAST defined in org.jetbrains.kotlin.ir.expressions.IrTypeOperator[FakeCallableDescriptorForObject]

'setOf' @ [83:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'PLUSEQ' @ [83:33] ==> public object PLUSEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUSEQ' @ [83:59] ==> public object MINUSEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MULTEQ' @ [83:86] ==> public object MULTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'DIVEQ' @ [83:112] ==> public object DIVEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PERCEQ' @ [83:137] ==> public object PERCEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [86:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'PLUS' @ [86:33] ==> public object PLUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MINUS' @ [86:57] ==> public object MINUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'MUL' @ [86:82] ==> public object MUL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'DIV' @ [86:105] ==> public object DIV : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PERC' @ [86:128] ==> public object PERC : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'RANGE' @ [86:152] ==> public object RANGE : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCL' @ [87:33] ==> public object EXCL : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'UMINUS' @ [87:57] ==> public object UMINUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'UPLUS' @ [87:83] ==> public object UPLUS : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [90:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'LT' @ [90:33] ==> public object LT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'LTEQ' @ [90:55] ==> public object LTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'GT' @ [90:79] ==> public object GT : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'GTEQ' @ [90:101] ==> public object GTEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [93:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'EQEQ' @ [93:33] ==> public object EQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCLEQ' @ [93:57] ==> public object EXCLEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [96:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'EQEQEQ' @ [96:33] ==> public object EQEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'EXCLEQEQ' @ [96:59] ==> public object EXCLEQEQ : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [99:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'IN' @ [99:33] ==> public object IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'NOT_IN' @ [99:55] ==> public object NOT_IN : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [102:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'ANDAND' @ [102:33] ==> public object ANDAND : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'OROR' @ [102:59] ==> public object OROR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [105:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'PREFIX_INCR' @ [105:33] ==> public object PREFIX_INCR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'PREFIX_DECR' @ [105:64] ==> public object PREFIX_DECR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'POSTFIX_INCR' @ [105:95] ==> public object POSTFIX_INCR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'POSTFIX_DECR' @ [105:127] ==> public object POSTFIX_DECR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'setOf' @ [108:9] ==> public fun <T> setOf(vararg elements: IrStatementOriginImpl): Set<IrStatementOriginImpl> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> IrStatementOriginImpl

'POSTFIX_INCR' @ [108:33] ==> public object POSTFIX_INCR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

'POSTFIX_DECR' @ [108:65] ==> public object POSTFIX_DECR : IrStatementOriginImpl defined in org.jetbrains.kotlin.ir.expressions.IrStatementOrigin[FakeCallableDescriptorForObject]

