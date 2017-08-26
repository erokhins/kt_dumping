'if (!element.isEmpty) this append prefix append element else this' @ [21:83] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'!' @ [21:87] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [21:88] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.ast.appendWithPrefix[ValueParameterDescriptorImpl]

'isEmpty' @ [21:96] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'this' @ [21:105] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendWithPrefix[ReceiverParameterDescriptorImpl]

'prefix' @ [21:117] ==> value-parameter prefix: String defined in org.jetbrains.kotlin.j2k.ast.appendWithPrefix[ValueParameterDescriptorImpl]

'element' @ [21:131] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.ast.appendWithPrefix[ValueParameterDescriptorImpl]

'this' @ [21:144] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendWithPrefix[ReceiverParameterDescriptorImpl]

'if (!element.isEmpty) this append element append suffix else this' @ [22:83] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'!' @ [22:87] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'element' @ [22:88] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.ast.appendWithSuffix[ValueParameterDescriptorImpl]

'isEmpty' @ [22:96] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Element[PropertyDescriptorImpl]

'this' @ [22:105] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendWithSuffix[ReceiverParameterDescriptorImpl]

'element' @ [22:117] ==> value-parameter element: Element defined in org.jetbrains.kotlin.j2k.ast.appendWithSuffix[ValueParameterDescriptorImpl]

'suffix' @ [22:132] ==> value-parameter suffix: String defined in org.jetbrains.kotlin.j2k.ast.appendWithSuffix[ValueParameterDescriptorImpl]

'this' @ [22:144] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendWithSuffix[ReceiverParameterDescriptorImpl]

'expression' @ [25:28] ==> value-parameter expression: Expression defined in org.jetbrains.kotlin.j2k.ast.appendOperand[ValueParameterDescriptorImpl]

'precedence' @ [25:39] ==> private fun Expression.precedence(): Int? defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'IllegalArgumentException' @ [25:61] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'expression' @ [25:112] ==> value-parameter expression: Expression defined in org.jetbrains.kotlin.j2k.ast.appendOperand[ValueParameterDescriptorImpl]

'operand' @ [26:29] ==> value-parameter operand: Expression defined in org.jetbrains.kotlin.j2k.ast.appendOperand[ValueParameterDescriptorImpl]

'precedence' @ [26:37] ==> private fun Expression.precedence(): Int? defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'operandPrecedence' @ [27:27] ==> val operandPrecedence: Int? defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'parentPrecedence' @ [28:14] ==> val parentPrecedence: Int defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'operandPrecedence' @ [28:33] ==> val operandPrecedence: Int? defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'parentPrecedence' @ [28:54] ==> val parentPrecedence: Int defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'operandPrecedence' @ [28:74] ==> val operandPrecedence: Int? defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'parenthesisForSamePrecedence' @ [28:95] ==> value-parameter parenthesisForSamePrecedence: Boolean = ... defined in org.jetbrains.kotlin.j2k.ast.appendOperand[ValueParameterDescriptorImpl]

'needParenthesis' @ [29:9] ==> val needParenthesis: Boolean defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'append' @ [29:26] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [30:5] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'operand' @ [30:12] ==> value-parameter operand: Expression defined in org.jetbrains.kotlin.j2k.ast.appendOperand[ValueParameterDescriptorImpl]

'needParenthesis' @ [31:9] ==> val needParenthesis: Boolean defined in org.jetbrains.kotlin.j2k.ast.appendOperand[LocalVariableDescriptor]

'append' @ [31:26] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'this' @ [32:12] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.appendOperand[ReceiverParameterDescriptorImpl]

'when (this) {
    is AssignmentExpression -> if (isMultiAssignment()) Block.of(this).assignNoPrototype() else this
    else -> this
}' @ [35:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Element, entry1: Element): Element[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Element

'this' @ [35:54] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.wrapToBlockIfRequired[ReceiverParameterDescriptorImpl]

'if (isMultiAssignment()) Block.of(this).assignNoPrototype() else this' @ [36:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'isMultiAssignment' @ [36:36] ==> public final fun isMultiAssignment(): Boolean defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[SimpleFunctionDescriptorImpl]

'of' @ [36:63] ==> public final fun of(statement: Statement): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'this' @ [36:66] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.wrapToBlockIfRequired[ReceiverParameterDescriptorImpl]

'assignNoPrototype' @ [36:72] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'this' @ [36:97] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.wrapToBlockIfRequired[ReceiverParameterDescriptorImpl]

'this' @ [37:13] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.wrapToBlockIfRequired[ReceiverParameterDescriptorImpl]

'when (this) {
        is QualifiedExpression, is MethodCallExpression, is ArrayAccessExpression, is PostfixExpression, is BangBangExpression, is StarExpression -> 0

        is PrefixExpression -> 1

        is TypeCastExpression -> 2

        is BinaryExpression -> op.precedence

        is RangeExpression, is DownToExpression -> 5

        is IsOperator -> 8

        is IfStatement -> 13

        is AssignmentExpression -> 14

        else -> null
    }' @ [42:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int?, entry1: Int?, entry2: Int?, entry3: Int?, entry4: Int?, entry5: Int?, entry6: Int?, entry7: Int?, entry8: Int?): Int?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int?

'this' @ [42:18] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.precedence[ReceiverParameterDescriptorImpl]

'op' @ [49:32] ==> public final val op: Operator defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[PropertyDescriptorImpl]

'precedence' @ [49:35] ==> public final val precedence: Int defined in org.jetbrains.kotlin.j2k.ast.Operator[PropertyDescriptorImpl]

