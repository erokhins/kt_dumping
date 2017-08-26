'specialConverter' @ [34:19] ==> value-parameter specialConverter: SpecialStatementConverter defined in org.jetbrains.kotlin.j2k.withSpecialConverter[ValueParameterDescriptorImpl]

'convertStatement' @ [34:36] ==> public abstract fun convertStatement(statement: PsiStatement, codeConverter: CodeConverter): Statement? defined in org.jetbrains.kotlin.j2k.SpecialStatementConverter[SimpleFunctionDescriptorImpl]

'statement' @ [34:53] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.withSpecialConverter.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'codeConverter' @ [34:64] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.withSpecialConverter.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'this@withSpecialConverter' @ [34:82] ==> <this> defined in org.jetbrains.kotlin.j2k.withSpecialConverter[ReceiverParameterDescriptorImpl]

'convertStatement' @ [34:108] ==> public abstract fun convertStatement(statement: PsiStatement, codeConverter: CodeConverter): Statement defined in org.jetbrains.kotlin.j2k.StatementConverter[SimpleFunctionDescriptorImpl]

'statement' @ [34:125] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.withSpecialConverter.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'codeConverter' @ [34:136] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.withSpecialConverter.<no name provided>.convertStatement[ValueParameterDescriptorImpl]

'JavaElementVisitor' @ [38:35] ==> public constructor JavaElementVisitor() defined in com.intellij.psi.JavaElementVisitor[JavaClassConstructorDescriptor]

'Empty' @ [40:47] ==> public object Empty : Statement defined in org.jetbrains.kotlin.j2k.ast.Statement[FakeCallableDescriptorForObject]

'_codeConverter' @ [42:54] ==> private final var _codeConverter: CodeConverter? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'codeConverter' @ [43:46] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'converter' @ [43:60] ==> public final val converter: Converter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'this' @ [46:9] ==> <this> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[LazyClassReceiverParameterDescriptor]

'_codeConverter' @ [46:14] ==> private final var _codeConverter: CodeConverter? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'codeConverter' @ [46:31] ==> value-parameter codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertStatement[ValueParameterDescriptorImpl]

'result' @ [47:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'Empty' @ [47:28] ==> public object Empty : Statement defined in org.jetbrains.kotlin.j2k.ast.Statement[FakeCallableDescriptorForObject]

'statement' @ [49:9] ==> value-parameter statement: PsiStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertStatement[ValueParameterDescriptorImpl]

'accept' @ [49:19] ==> public abstract fun accept(@NotNull p0: PsiElementVisitor): Unit defined in com.intellij.psi.PsiStatement[JavaMethodDescriptor]

'this' @ [49:26] ==> <this> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[LazyClassReceiverParameterDescriptor]

'result' @ [50:16] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'statement' @ [54:31] ==> value-parameter statement: PsiAssertStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[ValueParameterDescriptorImpl]

'assertDescription' @ [54:41] ==> public final val PsiAssertStatement.assertDescription: PsiExpression?[MyPropertyDescriptor]

'codeConverter' @ [55:25] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [55:39] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [55:57] ==> value-parameter statement: PsiAssertStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[ValueParameterDescriptorImpl]

'assertCondition' @ [55:67] ==> public final val PsiAssertStatement.assertCondition: PsiExpression?[MyPropertyDescriptor]

'result' @ [56:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'if (descriptionExpr == null) {
            MethodCallExpression.buildNonNull(null, "assert", ArgumentList.withNoPrototype(condition))
        }
        else {
            val description = codeConverter.convertExpression(descriptionExpr)
            val lambda = LambdaExpression(null, Block.of(description).assignNoPrototype())
            MethodCallExpression.buildNonNull(null, "assert", ArgumentList.withNoPrototype(condition, lambda))
        }' @ [56:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'descriptionExpr' @ [56:22] ==> val descriptionExpr: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[LocalVariableDescriptor]

'buildNonNull' @ [57:34] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'withNoPrototype' @ [57:76] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'condition' @ [57:92] ==> val condition: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[LocalVariableDescriptor]

'codeConverter' @ [60:31] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [60:45] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'descriptionExpr' @ [60:63] ==> val descriptionExpr: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[LocalVariableDescriptor]

'LambdaExpression' @ [61:26] ==> public constructor LambdaExpression(parameterList: ParameterList?, block: Block) defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[ClassConstructorDescriptorImpl]

'of' @ [61:55] ==> public final fun of(statement: Statement): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'description' @ [61:58] ==> val description: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[LocalVariableDescriptor]

'assignNoPrototype' @ [61:71] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'buildNonNull' @ [62:34] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'withNoPrototype' @ [62:76] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'condition' @ [62:92] ==> val condition: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[LocalVariableDescriptor]

'lambda' @ [62:103] ==> val lambda: LambdaExpression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitAssertStatement[LocalVariableDescriptor]

'codeConverter' @ [67:21] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertBlock' @ [67:35] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [67:48] ==> value-parameter statement: PsiBlockStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitBlockStatement[ValueParameterDescriptorImpl]

'codeBlock' @ [67:58] ==> public final val PsiBlockStatement.codeBlock: PsiCodeBlock[MyPropertyDescriptor]

'result' @ [68:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'MethodCallExpression' @ [68:18] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[FakeCallableDescriptorForObject]

'buildNonNull' @ [68:39] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'withNoPrototype' @ [68:78] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'LambdaExpression' @ [68:94] ==> public constructor LambdaExpression(parameterList: ParameterList?, block: Block) defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[ClassConstructorDescriptorImpl]

'block' @ [68:117] ==> val block: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitBlockStatement[LocalVariableDescriptor]

'assignNoPrototype' @ [68:124] ==> public fun <TElement : Element> LambdaExpression.assignNoPrototype(): LambdaExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LambdaExpression

'result' @ [72:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'if (statement.labelIdentifier == null) {
            BreakStatement(Identifier.Empty)
        }
        else {
            BreakStatement(converter.convertIdentifier(statement.labelIdentifier))
        }' @ [72:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'statement' @ [72:22] ==> value-parameter statement: PsiBreakStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitBreakStatement[ValueParameterDescriptorImpl]

'labelIdentifier' @ [72:32] ==> public final val PsiBreakStatement.labelIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'BreakStatement' @ [73:13] ==> public constructor BreakStatement(label: Identifier = ...) defined in org.jetbrains.kotlin.j2k.ast.BreakStatement[ClassConstructorDescriptorImpl]

'Empty' @ [73:39] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'BreakStatement' @ [76:13] ==> public constructor BreakStatement(label: Identifier = ...) defined in org.jetbrains.kotlin.j2k.ast.BreakStatement[ClassConstructorDescriptorImpl]

'converter' @ [76:28] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertIdentifier' @ [76:38] ==> public final fun convertIdentifier(identifier: PsiIdentifier?): Identifier defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'statement' @ [76:56] ==> value-parameter statement: PsiBreakStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitBreakStatement[ValueParameterDescriptorImpl]

'labelIdentifier' @ [76:66] ==> public final val PsiBreakStatement.labelIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'result' @ [81:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'if (statement.labelIdentifier == null) {
            ContinueStatement(Identifier.Empty)
        }
        else {
            ContinueStatement(converter.convertIdentifier(statement.labelIdentifier))
        }' @ [81:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'statement' @ [81:22] ==> value-parameter statement: PsiContinueStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitContinueStatement[ValueParameterDescriptorImpl]

'labelIdentifier' @ [81:32] ==> public final val PsiContinueStatement.labelIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'ContinueStatement' @ [82:13] ==> public constructor ContinueStatement(label: Identifier = ...) defined in org.jetbrains.kotlin.j2k.ast.ContinueStatement[ClassConstructorDescriptorImpl]

'Empty' @ [82:42] ==> public final val Empty: Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[PropertyDescriptorImpl]

'ContinueStatement' @ [85:13] ==> public constructor ContinueStatement(label: Identifier = ...) defined in org.jetbrains.kotlin.j2k.ast.ContinueStatement[ClassConstructorDescriptorImpl]

'converter' @ [85:31] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertIdentifier' @ [85:41] ==> public final fun convertIdentifier(identifier: PsiIdentifier?): Identifier defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'statement' @ [85:59] ==> value-parameter statement: PsiContinueStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitContinueStatement[ValueParameterDescriptorImpl]

'labelIdentifier' @ [85:69] ==> public final val PsiContinueStatement.labelIdentifier: PsiIdentifier?[MyPropertyDescriptor]

'result' @ [90:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'DeclarationStatement' @ [90:18] ==> public constructor DeclarationStatement(elements: List<Element>) defined in org.jetbrains.kotlin.j2k.ast.DeclarationStatement[ClassConstructorDescriptorImpl]

'statement' @ [90:39] ==> value-parameter statement: PsiDeclarationStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDeclarationStatement[ValueParameterDescriptorImpl]

'declaredElements' @ [90:49] ==> public final val PsiDeclarationStatement.declaredElements: (Array<(PsiElement..PsiElement?)>..Array<out (PsiElement..PsiElement?)>)[MyPropertyDescriptor]

'map' @ [90:66] ==> public inline fun <T, R> Array<out (PsiElement..PsiElement?)>.map(transform: ((PsiElement..PsiElement?)) -> Element): List<Element> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> Element

'when (it) {
                is PsiLocalVariable -> codeConverter.convertLocalVariable(it)
                is PsiClass -> converter.convertClass(it)
                else -> Element.Empty //what else can be here?
            }' @ [91:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Element, entry1: Element, entry2: Element): Element[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Element

'it' @ [91:19] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDeclarationStatement.<anonymous>[ValueParameterDescriptorImpl]

'codeConverter' @ [92:40] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertLocalVariable' @ [92:54] ==> public final fun convertLocalVariable(variable: PsiLocalVariable): LocalVariable defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'it' @ [92:75] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDeclarationStatement.<anonymous>[ValueParameterDescriptorImpl]

'converter' @ [93:32] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertClass' @ [93:42] ==> public final fun convertClass(psiClass: PsiClass): Class defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'it' @ [93:55] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDeclarationStatement.<anonymous>[ValueParameterDescriptorImpl]

'Empty' @ [94:33] ==> public object Empty : Element defined in org.jetbrains.kotlin.j2k.ast.Element[FakeCallableDescriptorForObject]

'statement' @ [100:25] ==> value-parameter statement: PsiDoWhileStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[ValueParameterDescriptorImpl]

'condition' @ [100:35] ==> public final val PsiDoWhileStatement.condition: PsiExpression?[MyPropertyDescriptor]

'if (condition?.type != null)
            codeConverter.convertExpression(condition, condition.type)
        else
            codeConverter.convertExpression(condition)' @ [101:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'condition' @ [101:30] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[LocalVariableDescriptor]

'type' @ [101:41] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'codeConverter' @ [102:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [102:27] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'condition' @ [102:45] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[LocalVariableDescriptor]

'condition' @ [102:56] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[LocalVariableDescriptor]

'type' @ [102:66] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'codeConverter' @ [104:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [104:27] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'condition' @ [104:45] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[LocalVariableDescriptor]

'result' @ [105:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'DoWhileStatement' @ [105:18] ==> public constructor DoWhileStatement(condition: Expression, body: Element, singleLine: Boolean) defined in org.jetbrains.kotlin.j2k.ast.DoWhileStatement[ClassConstructorDescriptorImpl]

'expression' @ [105:35] ==> val expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[LocalVariableDescriptor]

'codeConverter' @ [105:47] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [105:61] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'statement' @ [105:85] ==> value-parameter statement: PsiDoWhileStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[ValueParameterDescriptorImpl]

'body' @ [105:95] ==> public final val PsiDoWhileStatement.body: PsiStatement?[MyPropertyDescriptor]

'statement' @ [105:102] ==> value-parameter statement: PsiDoWhileStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitDoWhileStatement[ValueParameterDescriptorImpl]

'isInSingleLine' @ [105:112] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'result' @ [109:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'codeConverter' @ [109:18] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [109:32] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [109:50] ==> value-parameter statement: PsiExpressionStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [109:60] ==> public final val PsiExpressionStatement.expression: PsiExpression[MyPropertyDescriptor]

'result' @ [113:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'ExpressionListStatement' @ [113:18] ==> public constructor ExpressionListStatement(expressions: List<Expression>) defined in org.jetbrains.kotlin.j2k.ast.ExpressionListStatement[ClassConstructorDescriptorImpl]

'codeConverter' @ [113:42] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpressionsInList' @ [113:56] ==> public final fun convertExpressionsInList(expressions: List<PsiExpression>): List<Expression> defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [113:81] ==> value-parameter statement: PsiExpressionListStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitExpressionListStatement[ValueParameterDescriptorImpl]

'expressionList' @ [113:91] ==> public final val PsiExpressionListStatement.expressionList: (PsiExpressionList..PsiExpressionList?)[MyPropertyDescriptor]

'expressions' @ [113:106] ==> public final val PsiExpressionList.expressions: (Array<(PsiExpression..PsiExpression?)>..Array<out (PsiExpression..PsiExpression?)>)[MyPropertyDescriptor]

'asList' @ [113:118] ==> public fun <T> Array<out (PsiExpression..PsiExpression?)>.asList(): List<(PsiExpression..PsiExpression?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiExpression..com.intellij.psi.PsiExpression?)

'result' @ [117:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'ForConverter' @ [117:18] ==> public constructor ForConverter(statement: PsiForStatement, codeConverter: CodeConverter) defined in org.jetbrains.kotlin.j2k.ForConverter[ClassConstructorDescriptorImpl]

'statement' @ [117:31] ==> value-parameter statement: PsiForStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForStatement[ValueParameterDescriptorImpl]

'codeConverter' @ [117:42] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'execute' @ [117:57] ==> public final fun execute(): Statement defined in org.jetbrains.kotlin.j2k.ForConverter[SimpleFunctionDescriptorImpl]

'codeConverter' @ [121:24] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [121:38] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [121:56] ==> value-parameter statement: PsiForeachStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[ValueParameterDescriptorImpl]

'iteratedValue' @ [121:66] ==> public final val PsiForeachStatement.iteratedValue: PsiExpression?[MyPropertyDescriptor]

'NotNull' @ [121:99] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'statement' @ [122:34] ==> value-parameter statement: PsiForeachStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[ValueParameterDescriptorImpl]

'iterationParameter' @ [122:44] ==> public final val PsiForeachStatement.iterationParameter: PsiParameter[MyPropertyDescriptor]

'result' @ [123:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'ForeachStatement' @ [123:18] ==> public constructor ForeachStatement(variableName: Identifier, explicitVariableType: Type?, collection: Expression, body: Element, singleLine: Boolean) defined in org.jetbrains.kotlin.j2k.ast.ForeachStatement[ClassConstructorDescriptorImpl]

'iterationParameter' @ [123:35] ==> val iterationParameter: PsiParameter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[LocalVariableDescriptor]

'declarationIdentifier' @ [123:54] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'if (codeConverter.settings.specifyLocalVariableTypeByDefault) codeConverter.typeConverter.convertVariableType(iterationParameter) else null' @ [124:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Type?, elseBranch: Type?): Type?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Type?

'codeConverter' @ [124:39] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'settings' @ [124:53] ==> public final val settings: ConverterSettings defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'specifyLocalVariableTypeByDefault' @ [124:62] ==> public final var specifyLocalVariableTypeByDefault: Boolean defined in org.jetbrains.kotlin.j2k.ConverterSettings[PropertyDescriptorImpl]

'codeConverter' @ [124:97] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'typeConverter' @ [124:111] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'convertVariableType' @ [124:125] ==> public final fun convertVariableType(variable: PsiVariable): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

'iterationParameter' @ [124:145] ==> val iterationParameter: PsiParameter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[LocalVariableDescriptor]

'iterator' @ [125:35] ==> val iterator: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[LocalVariableDescriptor]

'codeConverter' @ [126:35] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [126:49] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'statement' @ [126:73] ==> value-parameter statement: PsiForeachStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[ValueParameterDescriptorImpl]

'body' @ [126:83] ==> public final val PsiForeachStatement.body: PsiStatement?[MyPropertyDescriptor]

'statement' @ [127:35] ==> value-parameter statement: PsiForeachStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitForeachStatement[ValueParameterDescriptorImpl]

'isInSingleLine' @ [127:45] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'statement' @ [131:25] ==> value-parameter statement: PsiIfStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitIfStatement[ValueParameterDescriptorImpl]

'condition' @ [131:35] ==> public final val PsiIfStatement.condition: PsiExpression?[MyPropertyDescriptor]

'codeConverter' @ [132:26] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [132:40] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'condition' @ [132:58] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitIfStatement[LocalVariableDescriptor]

'BOOLEAN' @ [132:77] ==> public final val BOOLEAN: (PsiPrimitiveType..PsiPrimitiveType?) defined in com.intellij.psi.PsiType[JavaPropertyDescriptor]

'result' @ [133:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'IfStatement' @ [133:18] ==> public constructor IfStatement(condition: Expression, thenStatement: Element, elseStatement: Element, singleLine: Boolean) defined in org.jetbrains.kotlin.j2k.ast.IfStatement[ClassConstructorDescriptorImpl]

'expression' @ [133:30] ==> val expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitIfStatement[LocalVariableDescriptor]

'codeConverter' @ [134:30] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [134:44] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'statement' @ [134:68] ==> value-parameter statement: PsiIfStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitIfStatement[ValueParameterDescriptorImpl]

'thenBranch' @ [134:78] ==> public final val PsiIfStatement.thenBranch: PsiStatement?[MyPropertyDescriptor]

'codeConverter' @ [135:30] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [135:44] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'statement' @ [135:68] ==> value-parameter statement: PsiIfStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitIfStatement[ValueParameterDescriptorImpl]

'elseBranch' @ [135:78] ==> public final val PsiIfStatement.elseBranch: PsiStatement?[MyPropertyDescriptor]

'statement' @ [136:30] ==> value-parameter statement: PsiIfStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitIfStatement[ValueParameterDescriptorImpl]

'isInSingleLine' @ [136:40] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'codeConverter' @ [140:34] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertStatement' @ [140:48] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [140:65] ==> value-parameter statement: PsiLabeledStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[ValueParameterDescriptorImpl]

'statement' @ [140:75] ==> public final val PsiLabeledStatement.statement: PsiStatement?[MyPropertyDescriptor]

'converter' @ [141:26] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertIdentifier' @ [141:36] ==> public final fun convertIdentifier(identifier: PsiIdentifier?): Identifier defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'statement' @ [141:54] ==> value-parameter statement: PsiLabeledStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[ValueParameterDescriptorImpl]

'labelIdentifier' @ [141:64] ==> public final val PsiLabeledStatement.labelIdentifier: PsiIdentifier[MyPropertyDescriptor]

'result' @ [142:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'if (statementConverted is ForConverter.WhileWithInitializationPseudoStatement) {
            // special case - if our loop gets converted to while with initialization we should move the label to the loop
            val labeledLoop = LabeledStatement(identifier, statementConverted.loop).assignPrototype(statement)
            ForConverter.WhileWithInitializationPseudoStatement(statementConverted.initialization, labeledLoop, statementConverted.kind)
        }
        else {
            LabeledStatement(identifier, statementConverted)
        }' @ [142:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'statementConverted' @ [142:22] ==> val statementConverted: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'LabeledStatement' @ [144:31] ==> public constructor LabeledStatement(name: Identifier, statement: Element) defined in org.jetbrains.kotlin.j2k.ast.LabeledStatement[ClassConstructorDescriptorImpl]

'identifier' @ [144:48] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'statementConverted' @ [144:60] ==> val statementConverted: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'loop' @ [144:79] ==> public final val loop: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'assignPrototype' @ [144:85] ==> public fun <TElement : Element> LabeledStatement.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): LabeledStatement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LabeledStatement

'statement' @ [144:101] ==> value-parameter statement: PsiLabeledStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[ValueParameterDescriptorImpl]

'WhileWithInitializationPseudoStatement' @ [145:26] ==> public constructor WhileWithInitializationPseudoStatement(initialization: Statement, loop: Statement, kind: ForConverter.WhileWithInitializationPseudoStatement.Kind) defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[ClassConstructorDescriptorImpl]

'statementConverted' @ [145:65] ==> val statementConverted: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'initialization' @ [145:84] ==> public final val initialization: Statement defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'labeledLoop' @ [145:100] ==> val labeledLoop: LabeledStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'statementConverted' @ [145:113] ==> val statementConverted: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'kind' @ [145:132] ==> public final val kind: ForConverter.WhileWithInitializationPseudoStatement.Kind defined in org.jetbrains.kotlin.j2k.ForConverter.WhileWithInitializationPseudoStatement[PropertyDescriptorImpl]

'LabeledStatement' @ [148:13] ==> public constructor LabeledStatement(name: Identifier, statement: Element) defined in org.jetbrains.kotlin.j2k.ast.LabeledStatement[ClassConstructorDescriptorImpl]

'identifier' @ [148:30] ==> val identifier: Identifier defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'statementConverted' @ [148:42] ==> val statementConverted: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitLabeledStatement[LocalVariableDescriptor]

'result' @ [153:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'if (statement.isDefaultCase)
            ElseWhenEntrySelector()
        else
            ValueWhenEntrySelector(codeConverter.convertExpression(statement.caseValue))' @ [153:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'statement' @ [153:22] ==> value-parameter statement: PsiSwitchLabelStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitSwitchLabelStatement[ValueParameterDescriptorImpl]

'isDefaultCase' @ [153:32] ==> public final val PsiSwitchLabelStatement.isDefaultCase: Boolean[MyPropertyDescriptor]

'ElseWhenEntrySelector' @ [154:13] ==> public constructor ElseWhenEntrySelector() defined in org.jetbrains.kotlin.j2k.ast.ElseWhenEntrySelector[ClassConstructorDescriptorImpl]

'ValueWhenEntrySelector' @ [156:13] ==> public constructor ValueWhenEntrySelector(expression: Expression) defined in org.jetbrains.kotlin.j2k.ast.ValueWhenEntrySelector[ClassConstructorDescriptorImpl]

'codeConverter' @ [156:36] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [156:50] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [156:68] ==> value-parameter statement: PsiSwitchLabelStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitSwitchLabelStatement[ValueParameterDescriptorImpl]

'caseValue' @ [156:78] ==> public final val PsiSwitchLabelStatement.caseValue: PsiExpression?[MyPropertyDescriptor]

'result' @ [160:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'SwitchConverter' @ [160:18] ==> public constructor SwitchConverter(codeConverter: CodeConverter) defined in org.jetbrains.kotlin.j2k.SwitchConverter[ClassConstructorDescriptorImpl]

'codeConverter' @ [160:34] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convert' @ [160:49] ==> public final fun convert(statement: PsiSwitchStatement): WhenStatement defined in org.jetbrains.kotlin.j2k.SwitchConverter[SimpleFunctionDescriptorImpl]

'statement' @ [160:57] ==> value-parameter statement: PsiSwitchStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitSwitchStatement[ValueParameterDescriptorImpl]

'result' @ [164:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'SynchronizedStatement' @ [164:18] ==> public constructor SynchronizedStatement(expression: Expression, block: Block) defined in org.jetbrains.kotlin.j2k.ast.SynchronizedStatement[ClassConstructorDescriptorImpl]

'codeConverter' @ [164:40] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [164:54] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [164:72] ==> value-parameter statement: PsiSynchronizedStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitSynchronizedStatement[ValueParameterDescriptorImpl]

'lockExpression' @ [164:82] ==> public final val PsiSynchronizedStatement.lockExpression: PsiExpression?[MyPropertyDescriptor]

'codeConverter' @ [165:40] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertBlock' @ [165:54] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [165:67] ==> value-parameter statement: PsiSynchronizedStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitSynchronizedStatement[ValueParameterDescriptorImpl]

'body' @ [165:77] ==> public final val PsiSynchronizedStatement.body: PsiCodeBlock?[MyPropertyDescriptor]

'result' @ [169:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'ThrowStatement' @ [169:18] ==> public constructor ThrowStatement(expression: Expression) defined in org.jetbrains.kotlin.j2k.ast.ThrowStatement[ClassConstructorDescriptorImpl]

'codeConverter' @ [169:33] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [169:47] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [169:65] ==> value-parameter statement: PsiThrowStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitThrowStatement[ValueParameterDescriptorImpl]

'exception' @ [169:75] ==> public final val PsiThrowStatement.exception: PsiExpression?[MyPropertyDescriptor]

'tryStatement' @ [173:24] ==> value-parameter tryStatement: PsiTryStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[ValueParameterDescriptorImpl]

'tryBlock' @ [173:37] ==> public final val PsiTryStatement.tryBlock: PsiCodeBlock?[MyPropertyDescriptor]

'convertCatches' @ [174:32] ==> private final fun convertCatches(tryStatement: PsiTryStatement): List<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[SimpleFunctionDescriptorImpl]

'tryStatement' @ [174:47] ==> value-parameter tryStatement: PsiTryStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[ValueParameterDescriptorImpl]

'codeConverter' @ [175:32] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertBlock' @ [175:46] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'tryStatement' @ [175:59] ==> value-parameter tryStatement: PsiTryStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[ValueParameterDescriptorImpl]

'finallyBlock' @ [175:72] ==> public final val PsiTryStatement.finallyBlock: PsiCodeBlock?[MyPropertyDescriptor]

'tryStatement' @ [177:28] ==> value-parameter tryStatement: PsiTryStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[ValueParameterDescriptorImpl]

'resourceList' @ [177:41] ==> public final val PsiTryStatement.resourceList: PsiResourceList?[MyPropertyDescriptor]

'resourceList' @ [178:13] ==> val resourceList: PsiResourceList? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'resourceList' @ [179:29] ==> val resourceList: PsiResourceList? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'resourceVariables' @ [179:42] ==> public final val PsiResourceList.resourceVariables: (MutableList<(PsiResourceVariable..PsiResourceVariable?)>..List<(PsiResourceVariable..PsiResourceVariable?)>?)[MyPropertyDescriptor]

'variables' @ [180:17] ==> val variables: (MutableList<(PsiResourceVariable..PsiResourceVariable?)>..List<(PsiResourceVariable..PsiResourceVariable?)>?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'isNotEmpty' @ [180:27] ==> @InlineOnly public inline fun <T> Collection<(PsiResourceVariable..PsiResourceVariable?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiResourceVariable..com.intellij.psi.PsiResourceVariable?)

'result' @ [181:17] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertTryWithResources' @ [181:26] ==> private final fun convertTryWithResources(tryBlock: PsiCodeBlock?, resourceVariables: List<PsiResourceVariable>, catchesConverted: List<CatchStatement>, finallyConverted: Block): Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[SimpleFunctionDescriptorImpl]

'tryBlock' @ [181:50] ==> val tryBlock: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'variables' @ [181:60] ==> val variables: (MutableList<(PsiResourceVariable..PsiResourceVariable?)>..List<(PsiResourceVariable..PsiResourceVariable?)>?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'catchesConverted' @ [181:71] ==> val catchesConverted: List<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'finallyConverted' @ [181:89] ==> val finallyConverted: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'result' @ [186:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'TryStatement' @ [186:18] ==> public constructor TryStatement(block: Block, catches: List<CatchStatement>, finallyBlock: Block) defined in org.jetbrains.kotlin.j2k.ast.TryStatement[ClassConstructorDescriptorImpl]

'codeConverter' @ [186:31] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertBlock' @ [186:45] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'tryBlock' @ [186:58] ==> val tryBlock: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'catchesConverted' @ [186:69] ==> val catchesConverted: List<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'finallyConverted' @ [186:87] ==> val finallyConverted: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitTryStatement[LocalVariableDescriptor]

'ArrayList' @ [190:23] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> CatchStatement

'component1' @ [191:15] ==> public final operator fun component1(): (PsiCodeBlock..PsiCodeBlock?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [191:22] ==> public final operator fun component2(): (PsiParameter..PsiParameter?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'tryStatement' @ [191:36] ==> value-parameter tryStatement: PsiTryStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[ValueParameterDescriptorImpl]

'catchBlocks' @ [191:49] ==> public final val PsiTryStatement.catchBlocks: (Array<(PsiCodeBlock..PsiCodeBlock?)>..Array<out (PsiCodeBlock..PsiCodeBlock?)>)[MyPropertyDescriptor]

'zip' @ [191:61] ==> public infix fun <T, R> Array<out (PsiCodeBlock..PsiCodeBlock?)>.zip(other: Array<out (PsiParameter..PsiParameter?)>): List<Pair<(PsiCodeBlock..PsiCodeBlock?), (PsiParameter..PsiParameter?)>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiCodeBlock..com.intellij.psi.PsiCodeBlock?)
    <R> -> (com.intellij.psi.PsiParameter..com.intellij.psi.PsiParameter?)

'tryStatement' @ [191:65] ==> value-parameter tryStatement: PsiTryStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[ValueParameterDescriptorImpl]

'catchBlockParameters' @ [191:78] ==> public final val PsiTryStatement.catchBlockParameters: (Array<(PsiParameter..PsiParameter?)>..Array<out (PsiParameter..PsiParameter?)>)[MyPropertyDescriptor]

'codeConverter' @ [192:34] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertBlock' @ [192:48] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'block' @ [192:61] ==> val block: (PsiCodeBlock..PsiCodeBlock?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'converter' @ [193:31] ==> private final val converter: Converter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertAnnotations' @ [193:41] ==> public final fun convertAnnotations(owner: PsiModifierListOwner, target: AnnotationUseTarget? = ...): Annotations defined in org.jetbrains.kotlin.j2k.Converter[SimpleFunctionDescriptorImpl]

'parameter' @ [193:60] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'parameter' @ [194:33] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'type' @ [194:43] ==> public final val PsiParameter.type: PsiType[MyPropertyDescriptor]

'?:' @ [195:25] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: List<(PsiType..PsiType?)>?, right: List<(PsiType..PsiType?)>): List<(PsiType..PsiType?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> List<(com.intellij.psi.PsiType..com.intellij.psi.PsiType?)>

'parameterType' @ [195:26] ==> val parameterType: PsiType defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'disjunctions' @ [195:65] ==> public final val PsiDisjunctionType.disjunctions: (MutableList<(PsiType..PsiType?)>..List<(PsiType..PsiType?)>)[MyPropertyDescriptor]

'listOf' @ [195:81] ==> public fun <T> listOf(element: PsiType): List<PsiType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiType

'parameterType' @ [195:88] ==> val parameterType: PsiType defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'types' @ [196:23] ==> val types: List<(PsiType..PsiType?)> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'codeConverter' @ [197:37] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'typeConverter' @ [197:51] ==> public final val typeConverter: TypeConverter defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'convertType' @ [197:65] ==> public final fun convertType(type: PsiType?, nullability: Nullability = ..., mutability: Mutability = ..., inAnnotationType: Boolean = ...): Type defined in org.jetbrains.kotlin.j2k.TypeConverter[SimpleFunctionDescriptorImpl]

't' @ [197:77] ==> val t: (PsiType..PsiType?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'NotNull' @ [197:92] ==> enum entry NotNull defined in org.jetbrains.kotlin.j2k.ast.Nullability[FakeCallableDescriptorForObject]

'FunctionParameter' @ [198:42] ==> public constructor FunctionParameter(identifier: Identifier, type: Type?, varVal: FunctionParameter.VarValModifier, annotations: Annotations, modifiers: Modifiers, defaultValue: DeferredElement<Expression>? = ...) defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter[ClassConstructorDescriptorImpl]

'parameter' @ [198:60] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'declarationIdentifier' @ [198:70] ==> public fun PsiNameIdentifierOwner.declarationIdentifier(): Identifier defined in org.jetbrains.kotlin.j2k.ast in file Identifier.kt[SimpleFunctionDescriptorImpl]

'convertedType' @ [199:60] ==> val convertedType: Type defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'None' @ [200:93] ==> enum entry None defined in org.jetbrains.kotlin.j2k.ast.FunctionParameter.VarValModifier[FakeCallableDescriptorForObject]

'annotations' @ [201:60] ==> val annotations: Annotations defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'Empty' @ [202:70] ==> public final val Empty: Modifiers defined in org.jetbrains.kotlin.j2k.ast.Modifiers.Companion[PropertyDescriptorImpl]

'assignPrototype' @ [202:77] ==> public fun <TElement : Element> FunctionParameter.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): FunctionParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> FunctionParameter

'parameter' @ [202:93] ==> val parameter: (PsiParameter..PsiParameter?) defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'catches' @ [203:17] ==> val catches: ArrayList<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'add' @ [203:25] ==> public open fun add(element: CatchStatement): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'CatchStatement' @ [203:29] ==> public constructor CatchStatement(variable: FunctionParameter, block: Block) defined in org.jetbrains.kotlin.j2k.ast.CatchStatement[ClassConstructorDescriptorImpl]

'convertedParameter' @ [203:44] ==> val convertedParameter: FunctionParameter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'blockConverted' @ [203:64] ==> val blockConverted: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'assignNoPrototype' @ [203:80] ==> public fun <TElement : Element> CatchStatement.assignNoPrototype(): CatchStatement defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> CatchStatement

'catches' @ [206:16] ==> val catches: ArrayList<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertCatches[LocalVariableDescriptor]

'it' @ [210:64] ==> value-parameter it: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources.<anonymous>[ValueParameterDescriptorImpl]

'codeConverter' @ [211:32] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'converterForBody' @ [213:21] ==> val converterForBody: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'convertBlock' @ [213:38] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'tryBlock' @ [213:51] ==> value-parameter tryBlock: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'Empty' @ [214:49] ==> public object Empty : Expression defined in org.jetbrains.kotlin.j2k.ast.Expression[FakeCallableDescriptorForObject]

'resourceVariables' @ [215:26] ==> value-parameter resourceVariables: List<PsiResourceVariable> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'asReversed' @ [215:44] ==> public fun <T> List<PsiResourceVariable>.asReversed(): List<PsiResourceVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiResourceVariable

'LambdaParameter' @ [216:29] ==> public constructor LambdaParameter(identifier: Identifier, type: Type?) defined in org.jetbrains.kotlin.j2k.ast.LambdaParameter[ClassConstructorDescriptorImpl]

'withNoPrototype' @ [216:56] ==> public final fun withNoPrototype(name: String, isNullable: Boolean = ..., quotingNeeded: Boolean = ..., imports: Collection<FqName> = ...): Identifier defined in org.jetbrains.kotlin.j2k.ast.Identifier.Companion[SimpleFunctionDescriptorImpl]

'variable' @ [216:72] ==> val variable: PsiResourceVariable defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'name' @ [216:81] ==> public final val PsiResourceVariable.name: String?[MyPropertyDescriptor]

'assignNoPrototype' @ [216:96] ==> public fun <TElement : Element> LambdaParameter.assignNoPrototype(): LambdaParameter defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LambdaParameter

'ParameterList' @ [217:33] ==> public constructor ParameterList(parameters: List<Parameter>, lPar: LPar?, rPar: RPar?) defined in org.jetbrains.kotlin.j2k.ast.ParameterList[ClassConstructorDescriptorImpl]

'listOf' @ [217:47] ==> public fun <T> listOf(element: LambdaParameter): List<LambdaParameter> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LambdaParameter

'parameter' @ [217:54] ==> val parameter: LambdaParameter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'assignNoPrototype' @ [217:92] ==> public fun <TElement : Element> ParameterList.assignNoPrototype(): ParameterList defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> ParameterList

'LambdaExpression' @ [218:26] ==> public constructor LambdaExpression(parameterList: ParameterList?, block: Block) defined in org.jetbrains.kotlin.j2k.ast.LambdaExpression[ClassConstructorDescriptorImpl]

'parameterList' @ [218:43] ==> val parameterList: ParameterList defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'block' @ [218:58] ==> var block: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'expression' @ [219:13] ==> var expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'MethodCallExpression' @ [219:26] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression[FakeCallableDescriptorForObject]

'buildNonNull' @ [219:47] ==> public final fun buildNonNull(receiver: Expression?, methodName: String, argumentList: ArgumentList = ..., typeArguments: List<Type> = ..., dotPrototype: PsiElement? = ...): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast.MethodCallExpression.Companion[SimpleFunctionDescriptorImpl]

'codeConverter' @ [219:60] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [219:74] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'variable' @ [219:92] ==> val variable: PsiResourceVariable defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'initializer' @ [219:101] ==> public final var PsiResourceVariable.initializer: PsiExpression?[MyPropertyDescriptor]

'withNoPrototype' @ [219:135] ==> public final fun withNoPrototype(vararg arguments: Expression): ArgumentList defined in org.jetbrains.kotlin.j2k.ast.ArgumentList.Companion[SimpleFunctionDescriptorImpl]

'lambda' @ [219:151] ==> val lambda: LambdaExpression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'expression' @ [220:13] ==> var expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'assignNoPrototype' @ [220:24] ==> public fun <TElement : Element> MethodCallExpression.assignNoPrototype(): MethodCallExpression defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> MethodCallExpression

'block' @ [221:13] ==> var block: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'Block' @ [221:21] ==> public companion object defined in org.jetbrains.kotlin.j2k.ast.Block[FakeCallableDescriptorForObject]

'of' @ [221:27] ==> public final fun of(statement: Statement): Block defined in org.jetbrains.kotlin.j2k.ast.Block.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [221:30] ==> var expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'assignNoPrototype' @ [221:42] ==> public fun <TElement : Element> Block.assignNoPrototype(): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'catchesConverted' @ [224:13] ==> value-parameter catchesConverted: List<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'isEmpty' @ [224:30] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'finallyConverted' @ [224:43] ==> value-parameter finallyConverted: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'isEmpty' @ [224:60] ==> public open val isEmpty: Boolean defined in org.jetbrains.kotlin.j2k.ast.Block[PropertyDescriptorImpl]

'invoke' @ [225:20] ==> public abstract operator fun invoke(p1: Expression): Statement defined in kotlin.Function1[FunctionInvokeDescriptor]

'expression' @ [225:40] ==> var expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'block' @ [228:9] ==> var block: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'Block' @ [228:17] ==> public constructor Block(statements: List<Statement>, lBrace: LBrace, rBrace: RBrace, notEmpty: Boolean = ...) defined in org.jetbrains.kotlin.j2k.ast.Block[ClassConstructorDescriptorImpl]

'listOf' @ [228:23] ==> public fun <T> listOf(element: Statement): List<Statement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Statement

'invoke' @ [228:30] ==> public abstract operator fun invoke(p1: Expression): Statement defined in kotlin.Function1[FunctionInvokeDescriptor]

'expression' @ [228:50] ==> var expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'LBrace' @ [228:64] ==> public constructor LBrace() defined in org.jetbrains.kotlin.j2k.ast.LBrace[ClassConstructorDescriptorImpl]

'assignPrototype' @ [228:73] ==> public fun <TElement : Element> LBrace.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): LBrace defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> LBrace

'tryBlock' @ [228:89] ==> value-parameter tryBlock: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'lBrace' @ [228:99] ==> public final val PsiCodeBlock.lBrace: PsiJavaToken?[MyPropertyDescriptor]

'RBrace' @ [228:108] ==> public constructor RBrace() defined in org.jetbrains.kotlin.j2k.ast.RBrace[ClassConstructorDescriptorImpl]

'assignPrototype' @ [228:117] ==> public fun <TElement : Element> RBrace.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): RBrace defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> RBrace

'tryBlock' @ [228:133] ==> value-parameter tryBlock: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'rBrace' @ [228:143] ==> public final val PsiCodeBlock.rBrace: PsiJavaToken?[MyPropertyDescriptor]

'TryStatement' @ [229:16] ==> public constructor TryStatement(block: Block, catches: List<CatchStatement>, finallyBlock: Block) defined in org.jetbrains.kotlin.j2k.ast.TryStatement[ClassConstructorDescriptorImpl]

'block' @ [229:29] ==> var block: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[LocalVariableDescriptor]

'assignPrototype' @ [229:35] ==> public fun <TElement : Element> Block.assignPrototype(prototype: PsiElement?, inheritance: CommentsAndSpacesInheritance = ...): Block defined in org.jetbrains.kotlin.j2k.ast[SimpleFunctionDescriptorImpl]
Inferred types:
    <TElement : Element> -> Block

'tryBlock' @ [229:51] ==> value-parameter tryBlock: PsiCodeBlock? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'catchesConverted' @ [229:62] ==> value-parameter catchesConverted: List<CatchStatement> defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'finallyConverted' @ [229:80] ==> value-parameter finallyConverted: Block defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.convertTryWithResources[ValueParameterDescriptorImpl]

'statement' @ [233:25] ==> value-parameter statement: PsiWhileStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[ValueParameterDescriptorImpl]

'condition' @ [233:35] ==> public final val PsiWhileStatement.condition: PsiExpression?[MyPropertyDescriptor]

'if (condition?.type != null)
            codeConverter.convertExpression(condition, condition.type)
        else
            codeConverter.convertExpression(condition)' @ [234:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'condition' @ [234:30] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[LocalVariableDescriptor]

'type' @ [234:41] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'codeConverter' @ [235:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [235:27] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'condition' @ [235:45] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[LocalVariableDescriptor]

'condition' @ [235:56] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[LocalVariableDescriptor]

'type' @ [235:66] ==> public final val PsiExpression.type: PsiType?[MyPropertyDescriptor]

'codeConverter' @ [237:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [237:27] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'condition' @ [237:45] ==> val condition: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[LocalVariableDescriptor]

'result' @ [238:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'WhileStatement' @ [238:18] ==> public constructor WhileStatement(condition: Expression, body: Element, singleLine: Boolean) defined in org.jetbrains.kotlin.j2k.ast.WhileStatement[ClassConstructorDescriptorImpl]

'expression' @ [238:33] ==> val expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[LocalVariableDescriptor]

'codeConverter' @ [238:45] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertStatementOrBlock' @ [238:59] ==> public fun CodeConverter.convertStatementOrBlock(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k in file StatementConverter.kt[SimpleFunctionDescriptorImpl]

'statement' @ [238:83] ==> value-parameter statement: PsiWhileStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[ValueParameterDescriptorImpl]

'body' @ [238:93] ==> public final val PsiWhileStatement.body: PsiStatement?[MyPropertyDescriptor]

'statement' @ [238:100] ==> value-parameter statement: PsiWhileStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitWhileStatement[ValueParameterDescriptorImpl]

'isInSingleLine' @ [238:110] ==> public fun PsiElement.isInSingleLine(): Boolean defined in org.jetbrains.kotlin.j2k in file Utils.kt[SimpleFunctionDescriptorImpl]

'statement' @ [242:27] ==> value-parameter statement: PsiReturnStatement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[ValueParameterDescriptorImpl]

'returnValue' @ [242:37] ==> public final val PsiReturnStatement.returnValue: PsiExpression?[MyPropertyDescriptor]

'codeConverter' @ [243:32] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'methodReturnType' @ [243:46] ==> public final val methodReturnType: PsiType? defined in org.jetbrains.kotlin.j2k.CodeConverter[PropertyDescriptorImpl]

'if (returnValue != null && methodReturnType != null)
            codeConverter.convertExpression(returnValue, methodReturnType)
        else
            codeConverter.convertExpression(returnValue)' @ [244:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Expression, elseBranch: Expression): Expression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Expression

'returnValue' @ [244:30] ==> val returnValue: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[LocalVariableDescriptor]

'methodReturnType' @ [244:53] ==> val methodReturnType: PsiType? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[LocalVariableDescriptor]

'codeConverter' @ [245:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [245:27] ==> public final fun convertExpression(expression: PsiExpression?, expectedType: PsiType?, expectedNullability: Nullability? = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'returnValue' @ [245:45] ==> val returnValue: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[LocalVariableDescriptor]

'methodReturnType' @ [245:58] ==> val methodReturnType: PsiType? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[LocalVariableDescriptor]

'codeConverter' @ [247:13] ==> private final val codeConverter: CodeConverter defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'convertExpression' @ [247:27] ==> public final fun convertExpression(expression: PsiExpression?, shouldParenthesize: Boolean = ...): Expression defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'returnValue' @ [247:45] ==> val returnValue: PsiExpression? defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[LocalVariableDescriptor]

'result' @ [249:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'ReturnStatement' @ [249:18] ==> public constructor ReturnStatement(expression: Expression, label: Identifier? = ...) defined in org.jetbrains.kotlin.j2k.ast.ReturnStatement[ClassConstructorDescriptorImpl]

'expression' @ [249:34] ==> val expression: Expression defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter.visitReturnStatement[LocalVariableDescriptor]

'result' @ [253:9] ==> private final var result: Statement defined in org.jetbrains.kotlin.j2k.DefaultStatementConverter[PropertyDescriptorImpl]

'Empty' @ [253:28] ==> public object Empty : Statement defined in org.jetbrains.kotlin.j2k.ast.Statement[FakeCallableDescriptorForObject]

'if (statement is PsiBlockStatement)
        convertBlock(statement.codeBlock)
    else
        convertStatement(statement)' @ [258:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Statement, elseBranch: Statement): Statement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Statement

'statement' @ [258:16] ==> value-parameter statement: PsiStatement? defined in org.jetbrains.kotlin.j2k.convertStatementOrBlock[ValueParameterDescriptorImpl]

'convertBlock' @ [259:9] ==> public final fun convertBlock(block: PsiCodeBlock?, notEmpty: Boolean = ..., statementFilter: (PsiStatement) -> Boolean = ...): Block defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [259:22] ==> value-parameter statement: PsiStatement? defined in org.jetbrains.kotlin.j2k.convertStatementOrBlock[ValueParameterDescriptorImpl]

'codeBlock' @ [259:32] ==> public final val PsiBlockStatement.codeBlock: PsiCodeBlock[MyPropertyDescriptor]

'convertStatement' @ [261:9] ==> public final fun convertStatement(statement: PsiStatement?): Statement defined in org.jetbrains.kotlin.j2k.CodeConverter[SimpleFunctionDescriptorImpl]

'statement' @ [261:26] ==> value-parameter statement: PsiStatement? defined in org.jetbrains.kotlin.j2k.convertStatementOrBlock[ValueParameterDescriptorImpl]

