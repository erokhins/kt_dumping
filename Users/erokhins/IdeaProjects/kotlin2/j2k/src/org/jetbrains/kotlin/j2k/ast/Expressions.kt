'Expression' @ [26:103] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [28:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [28:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [28:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression[LazyClassReceiverParameterDescriptor]

'expression' @ [28:37] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression[PropertyDescriptorImpl]

'!' @ [29:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'lvalue' @ [29:14] ==> public final val lvalue: Boolean defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression[PropertyDescriptorImpl]

'expression' @ [29:24] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression[PropertyDescriptorImpl]

'isNullable' @ [29:35] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Expression[PropertyDescriptorImpl]

'builder' @ [29:47] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [29:55] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'builder' @ [30:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression.generateCode[ValueParameterDescriptorImpl]

'index' @ [30:35] ==> public final val index: Expression defined in org.jetbrains.kotlin.j2k.ast.ArrayAccessExpression[PropertyDescriptorImpl]

'Expression' @ [34:98] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'right' @ [36:31] ==> public final val right: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'builder' @ [39:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.appendAssignment[ValueParameterDescriptorImpl]

'appendOperand' @ [39:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [39:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[LazyClassReceiverParameterDescriptor]

'left' @ [39:37] ==> value-parameter left: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.appendAssignment[ValueParameterDescriptorImpl]

'append' @ [39:43] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [39:55] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'op' @ [39:62] ==> public final val op: Operator defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'append' @ [39:66] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendOperand' @ [39:78] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [39:92] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[LazyClassReceiverParameterDescriptor]

'right' @ [39:98] ==> value-parameter right: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.appendAssignment[ValueParameterDescriptorImpl]

'if (right !is AssignmentExpression)
            appendAssignment(builder, left, right)
        else {
            right.generateCode(builder)
            builder.append("\n")
            appendAssignment(builder, left, right.left)
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'right' @ [43:13] ==> public final val right: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'appendAssignment' @ [44:13] ==> public final fun appendAssignment(builder: CodeBuilder, left: Expression, right: Expression): Unit defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[SimpleFunctionDescriptorImpl]

'builder' @ [44:30] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.generateCode[ValueParameterDescriptorImpl]

'left' @ [44:39] ==> public final val left: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'right' @ [44:45] ==> public final val right: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'right' @ [46:13] ==> public final val right: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'generateCode' @ [46:19] ==> public abstract fun generateCode(builder: CodeBuilder): Unit defined in org.jetbrains.kotlin.j2k.ast.Expression[SimpleFunctionDescriptorImpl]

'builder' @ [46:32] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.generateCode[ValueParameterDescriptorImpl]

'builder' @ [47:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [47:21] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendAssignment' @ [48:13] ==> public final fun appendAssignment(builder: CodeBuilder, left: Expression, right: Expression): Unit defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[SimpleFunctionDescriptorImpl]

'builder' @ [48:30] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression.generateCode[ValueParameterDescriptorImpl]

'left' @ [48:39] ==> public final val left: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'right' @ [48:45] ==> public final val right: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'left' @ [48:51] ==> public final val left: Expression defined in org.jetbrains.kotlin.j2k.ast.AssignmentExpression[PropertyDescriptorImpl]

'Expression' @ [53:50] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [55:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [55:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [55:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression[LazyClassReceiverParameterDescriptor]

'expr' @ [55:37] ==> public final val expr: Expression defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression[PropertyDescriptorImpl]

'append' @ [55:43] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'if (expression.isNullable)
                BangBangExpression(expression).assignNoPrototype()
            else
                expression' @ [60:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'expression' @ [60:24] ==> value-parameter expression: Expression defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression.Companion.surroundIfNullable[ValueParameterDescriptorImpl]

'isNullable' @ [60:35] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Expression[PropertyDescriptorImpl]

'BangBangExpression' @ [61:17] ==> public constructor BangBangExpression(expr: Expression) defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression[ClassConstructorDescriptorImpl]

'expression' @ [61:36] ==> value-parameter expression: Expression defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression.Companion.surroundIfNullable[ValueParameterDescriptorImpl]

'assignNoPrototype' @ [61:48] ==> public fun <TElement : Element> BangBangExpression.assignNoPrototype(): BangBangExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> BangBangExpression

'expression' @ [63:17] ==> value-parameter expression: Expression defined in org.jetbrains.kotlin.j2k.ast.BangBangExpression.Companion.surroundIfNullable[ValueParameterDescriptorImpl]

'Expression' @ [68:89] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [70:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [70:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [70:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[LazyClassReceiverParameterDescriptor]

'left' @ [70:37] ==> public final val left: Expression defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[PropertyDescriptorImpl]

'append' @ [70:50] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [70:62] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'op' @ [70:69] ==> public final val op: Operator defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[PropertyDescriptorImpl]

'append' @ [70:73] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendOperand' @ [70:85] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [70:99] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[LazyClassReceiverParameterDescriptor]

'right' @ [70:105] ==> public final val right: Expression defined in org.jetbrains.kotlin.j2k.ast.BinaryExpression[PropertyDescriptorImpl]

'Expression' @ [74:64] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [76:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.IsOperator.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [76:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [76:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.IsOperator[LazyClassReceiverParameterDescriptor]

'expression' @ [76:37] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.IsOperator[PropertyDescriptorImpl]

'append' @ [76:49] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [76:64] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [76:71] ==> public final val type: Type defined in org.jetbrains.kotlin.j2k.ast.IsOperator[PropertyDescriptorImpl]

'Expression' @ [80:72] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [82:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.TypeCastExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [82:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [82:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.TypeCastExpression[LazyClassReceiverParameterDescriptor]

'expression' @ [82:37] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.TypeCastExpression[PropertyDescriptorImpl]

'append' @ [82:49] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [82:64] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [82:71] ==> public final val type: Type defined in org.jetbrains.kotlin.j2k.ast.TypeCastExpression[PropertyDescriptorImpl]

'type' @ [86:17] ==> public final val type: Type defined in org.jetbrains.kotlin.j2k.ast.TypeCastExpression[PropertyDescriptorImpl]

'isNullable' @ [86:22] ==> public abstract val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Type[PropertyDescriptorImpl]

'Expression' @ [89:57] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [92:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [92:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'literalText' @ [92:24] ==> public final val literalText: String defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[PropertyDescriptorImpl]

'LiteralExpression' @ [95:26] ==> public constructor LiteralExpression(literalText: String) defined in org.jetbrains.kotlin.j2k.ast.LiteralExpression[ClassConstructorDescriptorImpl]

'Expression' @ [101:61] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [103:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ParenthesizedExpression.generateCode[ValueParameterDescriptorImpl]

'expression' @ [103:35] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.ParenthesizedExpression[PropertyDescriptorImpl]

'Expression' @ [107:72] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [109:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.PrefixExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [109:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'op' @ [109:24] ==> public final val op: Operator defined in org.jetbrains.kotlin.j2k.ast.PrefixExpression[PropertyDescriptorImpl]

'appendOperand' @ [109:28] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [109:42] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.PrefixExpression[LazyClassReceiverParameterDescriptor]

'expression' @ [109:48] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.PrefixExpression[PropertyDescriptorImpl]

'expression' @ [113:17] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.PrefixExpression[PropertyDescriptorImpl]

'isNullable' @ [113:28] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Expression[PropertyDescriptorImpl]

'Expression' @ [116:73] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [118:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.PostfixExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [118:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [118:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.PostfixExpression[LazyClassReceiverParameterDescriptor]

'expression' @ [118:37] ==> public final val expression: Expression defined in org.jetbrains.kotlin.j2k.ast.PostfixExpression[PropertyDescriptorImpl]

'op' @ [118:56] ==> public final val op: Operator defined in org.jetbrains.kotlin.j2k.ast.PostfixExpression[PropertyDescriptorImpl]

'Expression' @ [122:52] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [124:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ThisExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [124:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendWithPrefix' @ [124:32] ==> public fun CodeBuilder.appendWithPrefix(element: Element, prefix: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'identifier' @ [124:49] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.ast.ThisExpression[PropertyDescriptorImpl]

'Expression' @ [128:53] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [130:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.SuperExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [130:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendWithPrefix' @ [130:33] ==> public fun CodeBuilder.appendWithPrefix(element: Element, prefix: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'identifier' @ [130:50] ==> public final val identifier: Identifier defined in org.jetbrains.kotlin.j2k.ast.SuperExpression[PropertyDescriptorImpl]

'Expression' @ [134:111] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'Dot' @ [135:23] ==> public constructor Dot() defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression.Dot[ClassConstructorDescriptorImpl]

'assignPrototype' @ [135:29] ==> public fun <TElement : Element> QualifiedExpression.Dot.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): QualifiedExpression.Dot defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Dot

'dotPrototype' @ [135:45] ==> value-parameter dotPrototype: PsiElement? defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression.<init>[ValueParameterDescriptorImpl]

'CommentsAndSpacesInheritance' @ [135:59] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance[FakeCallableDescriptorForObject]

'LINE_BREAKS' @ [135:88] ==> public final val LINE_BREAKS: CommentsAndSpacesInheritance defined in org.jetbrains.kotlin.j2k.ast.CommentsAndSpacesInheritance.Companion[PropertyDescriptorImpl]

'identifier' @ [138:17] ==> public final val identifier: Expression defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[PropertyDescriptorImpl]

'isNullable' @ [138:28] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Expression[PropertyDescriptorImpl]

'!' @ [141:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'qualifier' @ [141:14] ==> public final val qualifier: Expression defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[PropertyDescriptorImpl]

'isEmpty' @ [141:24] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Expression[PropertyDescriptorImpl]

'builder' @ [142:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [142:21] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [142:35] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[LazyClassReceiverParameterDescriptor]

'qualifier' @ [142:41] ==> public final val qualifier: Expression defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[PropertyDescriptorImpl]

'append' @ [142:52] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'if (qualifier.isNullable) "!!" else ""' @ [142:59] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'qualifier' @ [142:63] ==> public final val qualifier: Expression defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[PropertyDescriptorImpl]

'isNullable' @ [142:73] ==> public open val isNullable: Boolean defined in org.jetbrains.kotlin.j2k.ast.Expression[PropertyDescriptorImpl]

'builder' @ [143:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [143:21] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'dot' @ [143:28] ==> private final val dot: QualifiedExpression.Dot defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[PropertyDescriptorImpl]

'builder' @ [146:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [146:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'identifier' @ [146:24] ==> public final val identifier: Expression defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression[PropertyDescriptorImpl]

'Element' @ [149:25] ==> public constructor Element() defined in org.jetbrains.kotlin.j2k.ast.Element[ClassConstructorDescriptorImpl]

'builder' @ [151:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.QualifiedExpression.Dot.generateCode[ValueParameterDescriptorImpl]

'append' @ [151:21] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'Expression' @ [156:54] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [158:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.Operator.generateCode[ValueParameterDescriptorImpl]

'append' @ [158:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'asString' @ [158:24] ==> private final fun asString(tokenType: IElementType): String defined in org.jetbrains.kotlin.j2k.ast.Operator[SimpleFunctionDescriptorImpl]

'operatorType' @ [158:33] ==> public final val operatorType: IElementType defined in org.jetbrains.kotlin.j2k.ast.Operator[PropertyDescriptorImpl]

'asString' @ [161:22] ==> private final fun asString(tokenType: IElementType): String defined in org.jetbrains.kotlin.j2k.ast.Operator[SimpleFunctionDescriptorImpl]

'operatorType' @ [161:31] ==> public final val operatorType: IElementType defined in org.jetbrains.kotlin.j2k.ast.Operator[PropertyDescriptorImpl]

'when(operatorType) {
            JavaTokenType.ANDAND,
            JavaTokenType.OROR,
            JavaTokenType.PLUS,
            JavaTokenType.MINUS -> true
            else -> false
        }' @ [164:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'operatorType' @ [164:21] ==> public final val operatorType: IElementType defined in org.jetbrains.kotlin.j2k.ast.Operator[PropertyDescriptorImpl]

'ANDAND' @ [165:27] ==> public final val ANDAND: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'OROR' @ [166:27] ==> public final val OROR: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PLUS' @ [167:27] ==> public final val PLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUS' @ [168:27] ==> public final val MINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'when (this.operatorType) {
            JavaTokenType.ASTERISK, JavaTokenType.DIV, JavaTokenType.PERC -> 3
            JavaTokenType.PLUS, JavaTokenType.MINUS -> 4
            KtTokens.ELVIS -> 7
            JavaTokenType.GT, JavaTokenType.LT, JavaTokenType.GE, JavaTokenType.LE -> 9
            JavaTokenType.EQEQ, JavaTokenType.NE, KtTokens.EQEQEQ, KtTokens.EXCLEQEQEQ -> 10
            JavaTokenType.ANDAND -> 11
            JavaTokenType.OROR -> 12
            JavaTokenType.GTGTGT, JavaTokenType.GTGT, JavaTokenType.LTLT -> 7
            else -> 6 /* simple name */
        }' @ [174:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Int, entry1: Int, entry2: Int, entry3: Int, entry4: Int, entry5: Int, entry6: Int, entry7: Int, entry8: Int): Int[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Int

'this' @ [174:23] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.Operator[LazyClassReceiverParameterDescriptor]

'operatorType' @ [174:28] ==> public final val operatorType: IElementType defined in org.jetbrains.kotlin.j2k.ast.Operator[PropertyDescriptorImpl]

'ASTERISK' @ [175:27] ==> public final val ASTERISK: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'DIV' @ [175:51] ==> public final val DIV: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PERC' @ [175:70] ==> public final val PERC: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PLUS' @ [176:27] ==> public final val PLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUS' @ [176:47] ==> public final val MINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'ELVIS' @ [177:22] ==> public final val ELVIS: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'GT' @ [178:27] ==> public final val GT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LT' @ [178:45] ==> public final val LT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GE' @ [178:63] ==> public final val GE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LE' @ [178:81] ==> public final val LE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'EQEQ' @ [179:27] ==> public final val EQEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'NE' @ [179:47] ==> public final val NE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'EQEQEQ' @ [179:60] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [179:77] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'ANDAND' @ [180:27] ==> public final val ANDAND: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'OROR' @ [181:27] ==> public final val OROR: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GTGTGT' @ [182:27] ==> public final val GTGTGT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GTGT' @ [182:49] ==> public final val GTGT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LTLT' @ [182:69] ==> public final val LTLT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'when (tokenType) {
            JavaTokenType.EQ -> "="
            JavaTokenType.EQEQ -> "=="
            JavaTokenType.NE -> "!="
            JavaTokenType.ANDAND -> "&&"
            JavaTokenType.OROR -> "||"
            JavaTokenType.GT -> ">"
            JavaTokenType.LT -> "<"
            JavaTokenType.GE -> ">="
            JavaTokenType.LE -> "<="
            JavaTokenType.EXCL -> "!"
            JavaTokenType.PLUS -> "+"
            JavaTokenType.MINUS -> "-"
            JavaTokenType.ASTERISK -> "*"
            JavaTokenType.DIV -> "/"
            JavaTokenType.PERC -> "%"
            JavaTokenType.PLUSEQ -> "+="
            JavaTokenType.MINUSEQ -> "-="
            JavaTokenType.ASTERISKEQ -> "*="
            JavaTokenType.DIVEQ -> "/="
            JavaTokenType.PERCEQ -> "%="
            JavaTokenType.GTGT -> "shr"
            JavaTokenType.LTLT -> "shl"
            JavaTokenType.XOR -> "xor"
            JavaTokenType.AND -> "and"
            JavaTokenType.OR -> "or"
            JavaTokenType.GTGTGT -> "ushr"
            JavaTokenType.GTGTEQ -> "shr"
            JavaTokenType.LTLTEQ -> "shl"
            JavaTokenType.XOREQ -> "xor"
            JavaTokenType.ANDEQ -> "and"
            JavaTokenType.OREQ -> "or"
            JavaTokenType.GTGTGTEQ -> "ushr"
            JavaTokenType.PLUSPLUS -> "++"
            JavaTokenType.MINUSMINUS -> "--"
            KtTokens.EQEQEQ -> "==="
            KtTokens.EXCLEQEQEQ -> "!=="
            else -> "" //System.out.println("UNSUPPORTED TOKEN TYPE: " + tokenType?.toString())
        }' @ [187:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String, entry3: String, entry4: String, entry5: String, entry6: String, entry7: String, entry8: String, entry9: String, entry10: String, entry11: String, entry12: String, entry13: String, entry14: String, entry15: String, entry16: String, entry17: String, entry18: String, entry19: String, entry20: String, entry21: String, entry22: String, entry23: String, entry24: String, entry25: String, entry26: String, entry27: String, entry28: String, entry29: String, entry30: String, entry31: String, entry32: String, entry33: String, entry34: String, entry35: String, entry36: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'tokenType' @ [187:22] ==> value-parameter tokenType: IElementType defined in org.jetbrains.kotlin.j2k.ast.Operator.asString[ValueParameterDescriptorImpl]

'EQ' @ [188:27] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'EQEQ' @ [189:27] ==> public final val EQEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'NE' @ [190:27] ==> public final val NE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'ANDAND' @ [191:27] ==> public final val ANDAND: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'OROR' @ [192:27] ==> public final val OROR: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GT' @ [193:27] ==> public final val GT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LT' @ [194:27] ==> public final val LT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GE' @ [195:27] ==> public final val GE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LE' @ [196:27] ==> public final val LE: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'EXCL' @ [197:27] ==> public final val EXCL: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PLUS' @ [198:27] ==> public final val PLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUS' @ [199:27] ==> public final val MINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'ASTERISK' @ [200:27] ==> public final val ASTERISK: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'DIV' @ [201:27] ==> public final val DIV: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PERC' @ [202:27] ==> public final val PERC: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PLUSEQ' @ [203:27] ==> public final val PLUSEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUSEQ' @ [204:27] ==> public final val MINUSEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'ASTERISKEQ' @ [205:27] ==> public final val ASTERISKEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'DIVEQ' @ [206:27] ==> public final val DIVEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PERCEQ' @ [207:27] ==> public final val PERCEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GTGT' @ [208:27] ==> public final val GTGT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LTLT' @ [209:27] ==> public final val LTLT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'XOR' @ [210:27] ==> public final val XOR: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'AND' @ [211:27] ==> public final val AND: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'OR' @ [212:27] ==> public final val OR: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GTGTGT' @ [213:27] ==> public final val GTGTGT: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GTGTEQ' @ [214:27] ==> public final val GTGTEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'LTLTEQ' @ [215:27] ==> public final val LTLTEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'XOREQ' @ [216:27] ==> public final val XOREQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'ANDEQ' @ [217:27] ==> public final val ANDEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'OREQ' @ [218:27] ==> public final val OREQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'GTGTGTEQ' @ [219:27] ==> public final val GTGTGTEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'PLUSPLUS' @ [220:27] ==> public final val PLUSPLUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'MINUSMINUS' @ [221:27] ==> public final val MINUSMINUS: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'EQEQEQ' @ [222:22] ==> public final val EQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'EXCLEQEQEQ' @ [223:22] ==> public final val EXCLEQEQEQ: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'Operator' @ [229:20] ==> public constructor Operator(operatorType: IElementType) defined in org.jetbrains.kotlin.j2k.ast.Operator[ClassConstructorDescriptorImpl]

'EQEQ' @ [229:43] ==> public final val EQEQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'assignNoPrototype' @ [229:49] ==> public fun <TElement : Element> Operator.assignNoPrototype(): Operator defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Operator

'Operator' @ [230:18] ==> public constructor Operator(operatorType: IElementType) defined in org.jetbrains.kotlin.j2k.ast.Operator[ClassConstructorDescriptorImpl]

'EQ' @ [230:41] ==> public final val EQ: (IElementType..IElementType?) defined in com.intellij.psi.JavaTokenType[JavaPropertyDescriptor]

'assignNoPrototype' @ [230:45] ==> public fun <TElement : Element> Operator.assignNoPrototype(): Operator defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Operator

'Expression' @ [234:79] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'assignPrototypesFrom' @ [236:9] ==> public fun <TElement : Element> LambdaExpression.assignPrototypesFrom(element: Element, inheritance: CommentsAndSpacesInheritance? = ...): LambdaExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LambdaExpression

'block' @ [236:30] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'builder' @ [240:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression.generateCode[ValueParameterDescriptorImpl]

'block' @ [240:24] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'lBrace' @ [240:30] ==> public final val lBrace: LBrace defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'if (parameterList != null && !parameterList.parameters.isEmpty()) {
            builder.append(parameterList)
                    .append("->")
                    .append(if (block.statements.size > 1) "\n" else " ")
                    .append(block.statements, "\n")
        }
        else {
            builder.append(block.statements, "\n")
        }' @ [242:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CodeBuilder, elseBranch: CodeBuilder): CodeBuilder[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CodeBuilder

'parameterList' @ [242:13] ==> public final val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'!' @ [242:38] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'parameterList' @ [242:39] ==> public final val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'parameters' @ [242:53] ==> public final val parameters: List<Parameter> defined in org.jetbrains.kotlin.j2k.ast.ParameterList[PropertyDescriptorImpl]

'isEmpty' @ [242:64] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'builder' @ [243:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [243:21] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'parameterList' @ [243:28] ==> public final val parameterList: ParameterList? defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'append' @ [244:22] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'append' @ [245:22] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'if (block.statements.size > 1) "\n" else " "' @ [245:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'block' @ [245:33] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'statements' @ [245:39] ==> public final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'size' @ [245:50] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'append' @ [246:22] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'block' @ [246:29] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'statements' @ [246:35] ==> public final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'builder' @ [249:13] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [249:21] ==> @JvmName public fun CodeBuilder.append(elements: Collection<Element>, separator: String, prefix: String = ..., suffix: String = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k[SimpleFunctionDescriptorImpl]

'block' @ [249:28] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'statements' @ [249:34] ==> public final val statements: List<Statement> defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'builder' @ [252:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression.generateCode[ValueParameterDescriptorImpl]

'block' @ [252:35] ==> public final val block: Block defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[PropertyDescriptorImpl]

'rBrace' @ [252:41] ==> public final val rBrace: RBrace defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'Expression' @ [256:49] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [258:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.StarExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [258:17] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendOperand' @ [258:29] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [258:43] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.StarExpression[LazyClassReceiverParameterDescriptor]

'operand' @ [258:49] ==> public final val operand: Expression defined in org.jetbrains.kotlin.j2k.ast.StarExpression[PropertyDescriptorImpl]

'Expression' @ [262:68] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [264:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.RangeExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [264:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [264:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.RangeExpression[LazyClassReceiverParameterDescriptor]

'start' @ [264:37] ==> public final val start: Expression defined in org.jetbrains.kotlin.j2k.ast.RangeExpression[PropertyDescriptorImpl]

'append' @ [264:44] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendOperand' @ [264:57] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [264:71] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.RangeExpression[LazyClassReceiverParameterDescriptor]

'end' @ [264:77] ==> public final val end: Expression defined in org.jetbrains.kotlin.j2k.ast.RangeExpression[PropertyDescriptorImpl]

'Expression' @ [268:69] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [270:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.DownToExpression.generateCode[ValueParameterDescriptorImpl]

'appendOperand' @ [270:17] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [270:31] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.DownToExpression[LazyClassReceiverParameterDescriptor]

'start' @ [270:37] ==> public final val start: Expression defined in org.jetbrains.kotlin.j2k.ast.DownToExpression[PropertyDescriptorImpl]

'append' @ [270:44] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'appendOperand' @ [270:63] ==> public fun CodeBuilder.appendOperand(expression: Expression, operand: Expression, parenthesisForSamePrecedence: Boolean = ...): CodeBuilder defined in org.jetbrains.kotlin.j2k.ast in file Util.kt[SimpleFunctionDescriptorImpl]

'this' @ [270:77] ==> <this> defined in org.jetbrains.kotlin.j2k.ast.DownToExpression[LazyClassReceiverParameterDescriptor]

'end' @ [270:83] ==> public final val end: Expression defined in org.jetbrains.kotlin.j2k.ast.DownToExpression[PropertyDescriptorImpl]

'Expression' @ [274:47] ==> public constructor Expression() defined in org.jetbrains.kotlin.j2k.ast.Expression[ClassConstructorDescriptorImpl]

'builder' @ [276:9] ==> value-parameter builder: CodeBuilder defined in org.jetbrains.kotlin.j2k.ast.ClassLiteralExpression.generateCode[ValueParameterDescriptorImpl]

'append' @ [276:17] ==> public final infix fun append(element: Element): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'type' @ [276:24] ==> public final val type: Type defined in org.jetbrains.kotlin.j2k.ast.ClassLiteralExpression[PropertyDescriptorImpl]

'append' @ [276:30] ==> public final infix fun append(text: String): CodeBuilder defined in org.jetbrains.kotlin.j2k.CodeBuilder[SimpleFunctionDescriptorImpl]

'arrayType' @ [281:23] ==> value-parameter arrayType: ArrayType defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[ValueParameterDescriptorImpl]

'elementType' @ [281:33] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'when {
        elementType is PrimitiveType -> (elementType.toNotNullType().canonicalCode() + "ArrayOf").decapitalize()
        needExplicitType -> "arrayOf<" + arrayType.elementType.canonicalCode() + ">"
        else -> "arrayOf"
    }' @ [282:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: String, entry1: String, entry2: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> String

'elementType' @ [283:9] ==> val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[LocalVariableDescriptor]

'elementType' @ [283:42] ==> val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[LocalVariableDescriptor]

'toNotNullType' @ [283:54] ==> public open fun toNotNullType(): Type defined in org.jetbrains.kotlin.j2k.ast.Type[SimpleFunctionDescriptorImpl]

'canonicalCode' @ [283:70] ==> public fun Element.canonicalCode(): String defined in org.jetbrains.kotlin.j2k.ast in file Element.kt[SimpleFunctionDescriptorImpl]

'decapitalize' @ [283:99] ==> public fun String.decapitalize(): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'needExplicitType' @ [284:9] ==> value-parameter needExplicitType: Boolean = ... defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[ValueParameterDescriptorImpl]

'+' @ [284:29] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'arrayType' @ [284:42] ==> value-parameter arrayType: ArrayType defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[ValueParameterDescriptorImpl]

'elementType' @ [284:52] ==> public final val elementType: Type defined in org.jetbrains.kotlin.j2k.ast.ArrayType[PropertyDescriptorImpl]

'canonicalCode' @ [284:64] ==> public fun Element.canonicalCode(): String defined in org.jetbrains.kotlin.j2k.ast in file Element.kt[SimpleFunctionDescriptorImpl]

'MethodCallExpression' @ [287:12] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[FakeCallableDescriptorForObject]

'buildNonNull' @ [287:33] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'createArrayFunction' @ [287:52] ==> val createArrayFunction: String defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[LocalVariableDescriptor]

'ArgumentList' @ [287:73] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.ArgumentList[FakeCallableDescriptorForObject]

'withNoPrototype' @ [287:86] ==> public final fun withNoPrototype(arguments: List<Expression>): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'initializers' @ [287:102] ==> value-parameter initializers: List<Expression> defined in org.jetbrains.kotlin.j2k.ast.createArrayInitializerExpression[ValueParameterDescriptorImpl]

