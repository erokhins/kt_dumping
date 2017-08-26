'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'expression' @ [42:31] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'condition' @ [42:42] ==> public final val KtWhileExpressionBase.condition: KtExpression?[MyPropertyDescriptor]

'IllegalArgumentException' @ [43:37] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'expression' @ [43:106] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'text' @ [43:117] ==> public final val KtWhileExpressionBase.text: (String..String?)[MyPropertyDescriptor]

'JsBlock' @ [44:26] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'translateAsExpression' @ [45:35] ==> @NotNull public open fun translateAsExpression(@NotNull expression: KtExpression, @NotNull context: TranslationContext, @NotNull block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'conditionExpression' @ [45:57] ==> val conditionExpression: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'context' @ [45:78] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'conditionBlock' @ [45:87] ==> val conditionBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'expression' @ [46:16] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'body' @ [46:27] ==> public final val KtWhileExpressionBase.body: KtExpression?[MyPropertyDescriptor]

'if (body != null)
            Translation.translateAsStatementAndMergeInBlockIfNeeded(body, context)
        else
            JsEmpty' @ [48:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement, elseBranch: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement

'body' @ [48:13] ==> val body: KtExpression? defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'translateAsStatementAndMergeInBlockIfNeeded' @ [49:25] ==> @NotNull public open fun translateAsStatementAndMergeInBlockIfNeeded(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsStatement defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'body' @ [49:69] ==> val body: KtExpression? defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'context' @ [49:75] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'JsEmpty' @ [51:13] ==> public object JsEmpty : SourceInfoAwareJsNode, JsStatement defined in org.jetbrains.kotlin.js.backend.ast[FakeCallableDescriptorForObject]

'!' @ [53:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'conditionBlock' @ [53:10] ==> val conditionBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'isEmpty' @ [53:25] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'JsIf' @ [54:48] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'not' @ [54:53] ==> @NotNull public open fun not(@NotNull expression: JsExpression): JsPrefixOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'jsCondition' @ [54:57] ==> var jsCondition: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'JsBreak' @ [54:71] ==> public constructor JsBreak() defined in org.jetbrains.kotlin.js.backend.ast.JsBreak[JavaClassConstructorDescriptor]

'apply' @ [54:81] ==> @InlineOnly public inline fun <T> JsBreak.apply(block: JsBreak.() -> Unit): JsBreak defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsBreak

'source' @ [54:89] ==> public final var JsBreak.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [54:98] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'apply' @ [55:18] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [55:26] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [55:35] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'convertToBlock' @ [56:25] ==> @NotNull public open fun convertToBlock(@NotNull jsNode: JsNode): JsBlock defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'bodyStatement' @ [56:40] ==> var bodyStatement: JsStatement defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'jsCondition' @ [57:9] ==> var jsCondition: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'JsBooleanLiteral' @ [57:23] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'if (doWhile) {
            // translate to: tmpSecondRun = false;
            // do { if(tmpSecondRun) { <expr> if(!tmpExprVar) break; } else tmpSecondRun=true; <body> } while(true)
            val secondRun = context.defineTemporary(JsBooleanLiteral(false).source(expression))
            conditionBlock.statements.add(breakIfConditionIsFalseStatement)
            val ifStatement = JsIf(secondRun, conditionBlock, assignment(secondRun, JsBooleanLiteral(true)).source(expression).makeStmt())
            bodyBlock.statements.add(0, ifStatement.apply { source = expression })
        }
        else {
            conditionBlock.statements.add(breakIfConditionIsFalseStatement)
            bodyBlock.statements.addAll(0, conditionBlock.statements)
        }' @ [59:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any, elseBranch: Any): Any[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any

'doWhile' @ [59:13] ==> value-parameter doWhile: Boolean defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'context' @ [62:29] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'defineTemporary' @ [62:37] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsBooleanLiteral' @ [62:53] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'source' @ [62:77] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaMethodDescriptor]

'expression' @ [62:84] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'conditionBlock' @ [63:13] ==> val conditionBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'statements' @ [63:28] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [63:39] ==> public abstract fun add(element: (JsStatement..JsStatement?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'breakIfConditionIsFalseStatement' @ [63:43] ==> val breakIfConditionIsFalseStatement: JsIf defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'JsIf' @ [64:31] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement, @Nullable p2: JsStatement?) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'secondRun' @ [64:36] ==> val secondRun: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'conditionBlock' @ [64:47] ==> val conditionBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'assignment' @ [64:63] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'secondRun' @ [64:74] ==> val secondRun: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'JsBooleanLiteral' @ [64:85] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'source' @ [64:109] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'expression' @ [64:116] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'makeStmt' @ [64:128] ==> @NotNull public open fun makeStmt(): JsStatement defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'bodyBlock' @ [65:13] ==> val bodyBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'statements' @ [65:23] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [65:34] ==> public abstract fun add(index: Int, element: (JsStatement..JsStatement?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'ifStatement' @ [65:41] ==> val ifStatement: JsIf defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'apply' @ [65:53] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [65:61] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [65:70] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'conditionBlock' @ [68:13] ==> val conditionBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'statements' @ [68:28] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [68:39] ==> public abstract fun add(element: (JsStatement..JsStatement?)): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'breakIfConditionIsFalseStatement' @ [68:43] ==> val breakIfConditionIsFalseStatement: JsIf defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'bodyBlock' @ [69:13] ==> val bodyBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'statements' @ [69:23] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'addAll' @ [69:34] ==> public abstract fun addAll(index: Int, elements: Collection<(JsStatement..JsStatement?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'conditionBlock' @ [69:44] ==> val conditionBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'statements' @ [69:59] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'bodyStatement' @ [72:9] ==> var bodyStatement: JsStatement defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'bodyBlock' @ [72:25] ==> val bodyBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'if (doWhile) JsDoWhile() else JsWhile()' @ [75:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsWhile, elseBranch: JsWhile): JsWhile[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsWhile

'doWhile' @ [75:22] ==> value-parameter doWhile: Boolean defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'JsDoWhile' @ [75:31] ==> public constructor JsDoWhile() defined in org.jetbrains.kotlin.js.backend.ast.JsDoWhile[JavaClassConstructorDescriptor]

'JsWhile' @ [75:48] ==> public constructor JsWhile() defined in org.jetbrains.kotlin.js.backend.ast.JsWhile[JavaClassConstructorDescriptor]

'result' @ [76:5] ==> val result: JsWhile defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'condition' @ [76:12] ==> public final var JsWhile.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'jsCondition' @ [76:24] ==> var jsCondition: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'result' @ [77:5] ==> val result: JsWhile defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'body' @ [77:12] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'bodyStatement' @ [77:19] ==> var bodyStatement: JsStatement defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'result' @ [78:12] ==> val result: JsWhile defined in org.jetbrains.kotlin.js.translate.expression.createWhile[LocalVariableDescriptor]

'source' @ [78:19] ==> public open fun source(p0: (Any..Any?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.backend.ast.JsWhile[JavaMethodDescriptor]

'expression' @ [78:26] ==> value-parameter expression: KtWhileExpressionBase defined in org.jetbrains.kotlin.js.translate.expression.createWhile[ValueParameterDescriptorImpl]

'getLoopRange' @ [82:21] ==> @NotNull public open fun getLoopRange(@NotNull expression: KtForExpression): KtExpression defined in org.jetbrains.kotlin.js.translate.utils.PsiUtils[JavaMethodDescriptor]

'expression' @ [82:34] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'getTypeForExpression' @ [83:21] ==> @NotNull public open fun getTypeForExpression(@NotNull context: BindingContext, @NotNull expression: KtExpression): KotlinType defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [83:42] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [83:50] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'loopRange' @ [83:68] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'rangeType' @ [87:19] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'constructor' @ [87:29] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [87:41] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'fqNameSafe' @ [87:64] ==> public val DeclarationDescriptor.fqNameSafe: FqName defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'fqn' @ [88:16] ==> val fqn: FqName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.isForOverRange[LocalVariableDescriptor]

'asString' @ [88:20] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqName[JavaMethodDescriptor]

'loopRange' @ [92:13] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'loopRange' @ [92:48] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'operationToken' @ [92:58] ==> public final val KtBinaryExpression.operationToken: IElementType[MyPropertyDescriptor]

'RANGE' @ [92:85] ==> public final val RANGE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'isForOverRange' @ [92:94] ==> local final fun isForOverRange(): Boolean defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'isArray' @ [95:31] ==> public open fun isArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'rangeType' @ [95:39] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'isPrimitiveArray' @ [95:68] ==> public open fun isPrimitiveArray(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'rangeType' @ [95:85] ==> val rangeType: KotlinType defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'expression' @ [99:25] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'loopParameter' @ [99:36] ==> public final val KtForExpression.loopParameter: KtParameter?[MyPropertyDescriptor]

'loopParameter' @ [100:63] ==> val loopParameter: KtParameter defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'destructuringDeclaration' @ [100:77] ==> public final val KtParameter.destructuringDeclaration: KtDestructuringDeclaration?[MyPropertyDescriptor]

'if (destructuringParameter == null) {
        context.getNameForElement(loopParameter)
    }
    else {
        JsScope.declareTemporary()
    }' @ [101:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsName, elseBranch: JsName): JsName[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsName

'destructuringParameter' @ [101:29] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'context' @ [102:9] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'getNameForElement' @ [102:17] ==> @NotNull public open fun getNameForElement(@NotNull element: PsiElement): JsName defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'loopParameter' @ [102:35] ==> val loopParameter: KtParameter defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'declareTemporary' @ [105:17] ==> @NotNull public open fun declareTemporary(): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'expression' @ [109:24] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'body' @ [109:35] ==> public final val KtForExpression.body: KtExpression?[MyPropertyDescriptor]

'let' @ [109:41] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> JsStatement): JsStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> JsStatement

'translateAsStatementAndMergeInBlockIfNeeded' @ [109:59] ==> @NotNull public open fun translateAsStatementAndMergeInBlockIfNeeded(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsStatement defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'it' @ [109:103] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [109:107] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'if (itemValue == null && destructuringParameter == null) {
            return realBody
        }
        else {
            val block = JsBlock()

            val currentVarInit =
                if (destructuringParameter == null) {
                    newVar(parameterName, itemValue).apply { source = expression.loopRange }
                }
                else {
                    val innerBlockContext = context.innerBlock(block)
                    if (itemValue != null) {
                        val parameterStatement = JsAstUtils.newVar(parameterName, itemValue).apply { source = expression.loopRange }
                        innerBlockContext.addStatementToCurrentBlock(parameterStatement)
                    }
                    DestructuringDeclarationTranslator.translate(
                            destructuringParameter, JsAstUtils.pureFqn(parameterName, null), innerBlockContext)
                }
            block.statements += currentVarInit
            block.statements += if (realBody is JsBlock) realBody.statements else listOfNotNull(realBody)

            return block
        }' @ [110:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'itemValue' @ [110:13] ==> value-parameter itemValue: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[ValueParameterDescriptorImpl]

'destructuringParameter' @ [110:34] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'realBody' @ [111:20] ==> val realBody: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'JsBlock' @ [114:25] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'if (destructuringParameter == null) {
                    newVar(parameterName, itemValue).apply { source = expression.loopRange }
                }
                else {
                    val innerBlockContext = context.innerBlock(block)
                    if (itemValue != null) {
                        val parameterStatement = JsAstUtils.newVar(parameterName, itemValue).apply { source = expression.loopRange }
                        innerBlockContext.addStatementToCurrentBlock(parameterStatement)
                    }
                    DestructuringDeclarationTranslator.translate(
                            destructuringParameter, JsAstUtils.pureFqn(parameterName, null), innerBlockContext)
                }' @ [117:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsVars, elseBranch: JsVars): JsVars[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsVars

'destructuringParameter' @ [117:21] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'newVar' @ [118:21] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [118:28] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'itemValue' @ [118:43] ==> value-parameter itemValue: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[ValueParameterDescriptorImpl]

'apply' @ [118:54] ==> @InlineOnly public inline fun <T> JsVars.apply(block: (JsVars).() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'source' @ [118:62] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [118:71] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [118:82] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'context' @ [121:45] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'innerBlock' @ [121:53] ==> @NotNull public open fun innerBlock(@NotNull block: JsBlock): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'block' @ [121:64] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'itemValue' @ [122:25] ==> value-parameter itemValue: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[ValueParameterDescriptorImpl]

'newVar' @ [123:61] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [123:68] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'itemValue' @ [123:83] ==> value-parameter itemValue: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[ValueParameterDescriptorImpl]

'apply' @ [123:94] ==> @InlineOnly public inline fun <T> JsVars.apply(block: (JsVars).() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'source' @ [123:102] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [123:111] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [123:122] ==> public final val KtForExpression.loopRange: KtExpression?[MyPropertyDescriptor]

'innerBlockContext' @ [124:25] ==> val innerBlockContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'addStatementToCurrentBlock' @ [124:43] ==> public open fun addStatementToCurrentBlock(@NotNull statement: JsStatement): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'parameterStatement' @ [124:70] ==> val parameterStatement: JsVars defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'translate' @ [126:56] ==> @NotNull public open fun translate(@NotNull multiDeclaration: KtDestructuringDeclaration, @NotNull multiObjectExpr: JsExpression, @NotNull context: TranslationContext): JsVars defined in org.jetbrains.kotlin.js.translate.expression.DestructuringDeclarationTranslator[JavaMethodDescriptor]

'destructuringParameter' @ [127:29] ==> val destructuringParameter: KtDestructuringDeclaration? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'pureFqn' @ [127:64] ==> @NotNull public open fun pureFqn(@NotNull identifier: JsName, @Nullable qualifier: JsExpression?): JsNameRef defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [127:72] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'innerBlockContext' @ [127:94] ==> val innerBlockContext: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'block' @ [129:13] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'statements' @ [129:19] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'currentVarInit' @ [129:33] ==> val currentVarInit: JsVars defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'block' @ [130:13] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'statements' @ [130:19] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'if (realBody is JsBlock) realBody.statements else listOfNotNull(realBody)' @ [130:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (List<JsStatement>..List<(JsStatement..JsStatement?)>), elseBranch: (List<JsStatement>..List<(JsStatement..JsStatement?)>)): (List<JsStatement>..List<(JsStatement..JsStatement?)>)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.collections.List<org.jetbrains.kotlin.js.backend.ast.JsStatement>..kotlin.collections.List<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>)

'realBody' @ [130:37] ==> val realBody: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'realBody' @ [130:58] ==> val realBody: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'statements' @ [130:67] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'listOfNotNull' @ [130:83] ==> public fun <T : Any> listOfNotNull(element: JsStatement?): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> JsStatement

'realBody' @ [130:97] ==> val realBody: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'block' @ [132:20] ==> val block: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateBody[LocalVariableDescriptor]

'loopRange' @ [138:13] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'IllegalStateException' @ [138:53] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'loopRange' @ [138:112] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'text' @ [138:122] ==> public final val KtExpression.text: (String..String?)[MyPropertyDescriptor]

'JsBlock' @ [140:26] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'translateLeftExpression' @ [141:47] ==> @NotNull public open fun translateLeftExpression(@NotNull context: TranslationContext, @NotNull expression: KtBinaryExpression, @NotNull block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [141:71] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [141:80] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'startBlock' @ [141:91] ==> val startBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'JsBlock' @ [142:24] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'translateRightExpression' @ [143:48] ==> @NotNull public open fun translateRightExpression(@NotNull context: TranslationContext, @NotNull expression: KtBinaryExpression, @NotNull block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'context' @ [143:73] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'loopRange' @ [143:82] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'endBlock' @ [143:93] ==> val endBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'context' @ [144:26] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'cacheExpressionIfNeeded' @ [144:34] ==> @NotNull public open fun cacheExpressionIfNeeded(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'leftExpression' @ [144:58] ==> val leftExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'context' @ [145:9] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'addStatementsToCurrentBlockFrom' @ [145:17] ==> public open fun addStatementsToCurrentBlockFrom(@NotNull block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'startBlock' @ [145:49] ==> val startBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'context' @ [146:9] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'addStatementsToCurrentBlockFrom' @ [146:17] ==> public open fun addStatementsToCurrentBlockFrom(@NotNull block: JsBlock): Unit defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'endBlock' @ [146:49] ==> val endBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'context' @ [147:24] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [147:32] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'rightExpression' @ [147:48] ==> val rightExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'translateBody' @ [149:20] ==> local final fun translateBody(itemValue: JsExpression?): JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'lessThanEq' @ [150:35] ==> @NotNull public open fun lessThanEq(@NotNull arg1: JsExpression, @NotNull arg2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [150:46] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'makeRef' @ [150:60] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'rangeEnd' @ [150:71] ==> val rangeEnd: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'source' @ [150:81] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'expression' @ [150:88] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsPostfixOperation' @ [151:35] ==> public constructor JsPostfixOperation(p0: (JsUnaryOperator..JsUnaryOperator?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsPostfixOperation[JavaClassConstructorDescriptor]

'INC' @ [151:70] ==> enum entry INC defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'parameterName' @ [151:75] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'makeRef' @ [151:89] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'source' @ [151:100] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsPostfixOperation[JavaMethodDescriptor]

'expression' @ [151:107] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'newVar' @ [152:24] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [152:31] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'rangeStart' @ [152:46] ==> val rangeStart: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'apply' @ [152:58] ==> @InlineOnly public inline fun <T> JsVars.apply(block: (JsVars).() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'source' @ [152:66] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [152:75] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsFor' @ [154:16] ==> public constructor JsFor(p0: (JsVars..JsVars?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?), p3: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsFor[JavaClassConstructorDescriptor]

'initVars' @ [154:22] ==> val initVars: JsVars defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'conditionExpression' @ [154:32] ==> val conditionExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'incrementExpression' @ [154:53] ==> val incrementExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'body' @ [154:74] ==> val body: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverLiteralRange[LocalVariableDescriptor]

'context' @ [158:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [158:39] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'translateAsExpression' @ [158:67] ==> @NotNull public open fun translateAsExpression(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'loopRange' @ [158:89] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'context' @ [158:100] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsNameRef' @ [160:58] ==> public constructor JsNameRef(@NotNull p0: String, p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaClassConstructorDescriptor]

'funName' @ [160:68] ==> value-parameter funName: String defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange.getProperty[ValueParameterDescriptorImpl]

'rangeExpression' @ [160:77] ==> val rangeExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'source' @ [160:94] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsNameRef[JavaMethodDescriptor]

'loopRange' @ [160:101] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'context' @ [162:21] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [162:29] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getProperty' @ [162:45] ==> local final fun getProperty(funName: String): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[SimpleFunctionDescriptorImpl]

'context' @ [163:19] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [163:27] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getProperty' @ [163:43] ==> local final fun getProperty(funName: String): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[SimpleFunctionDescriptorImpl]

'context' @ [164:25] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [164:33] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'getProperty' @ [164:49] ==> local final fun getProperty(funName: String): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[SimpleFunctionDescriptorImpl]

'translateBody' @ [166:20] ==> local final fun translateBody(itemValue: JsExpression?): JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'lessThanEq' @ [168:35] ==> @NotNull public open fun lessThanEq(@NotNull arg1: JsExpression, @NotNull arg2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [168:46] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'makeRef' @ [168:60] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'end' @ [168:71] ==> val end: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'source' @ [168:76] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'expression' @ [168:83] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'addAssign' @ [169:35] ==> @NotNull public open fun addAssign(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [169:45] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'makeRef' @ [169:59] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'increment' @ [169:70] ==> val increment: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'source' @ [169:81] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'expression' @ [169:88] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'newVar' @ [170:24] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'parameterName' @ [170:31] ==> val parameterName: JsName defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'start' @ [170:46] ==> val start: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'apply' @ [170:53] ==> @InlineOnly public inline fun <T> JsVars.apply(block: (JsVars).() -> Unit): JsVars defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars

'source' @ [170:61] ==> public final var JsVars.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [170:70] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsFor' @ [172:16] ==> public constructor JsFor(p0: (JsVars..JsVars?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?), p3: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsFor[JavaClassConstructorDescriptor]

'initVars' @ [172:22] ==> val initVars: JsVars defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'conditionExpression' @ [172:32] ==> val conditionExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'incrementExpression' @ [172:53] ==> val incrementExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'body' @ [172:74] ==> val body: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverRange[LocalVariableDescriptor]

'context' @ [176:31] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [176:39] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'translateAsExpression' @ [176:67] ==> @NotNull public open fun translateAsExpression(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'loopRange' @ [176:89] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'context' @ [176:100] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'ArrayFIF' @ [177:22] ==> public object ArrayFIF : CompositeFIF defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories in file ArrayFIF.kt[FakeCallableDescriptorForObject]

'LENGTH_PROPERTY_INTRINSIC' @ [177:31] ==> @JvmField public final val LENGTH_PROPERTY_INTRINSIC: BuiltInPropertyIntrinsic defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.factories.ArrayFIF[PropertyDescriptorImpl]

'apply' @ [177:57] ==> @NotNull @Override public open fun apply(@Nullable receiver: JsExpression?, @NotNull arguments: List<JsExpression>, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.intrinsic.functions.basic.BuiltInPropertyIntrinsic[JavaMethodDescriptor]

'rangeExpression' @ [177:63] ==> val rangeExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'listOf' @ [177:80] ==> @InlineOnly public inline fun <T> listOf(): List<JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression

'context' @ [177:104] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'context' @ [178:19] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [178:27] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'length' @ [178:43] ==> val length: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'context' @ [179:21] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'declareTemporary' @ [179:29] ==> @NotNull public open fun declareTemporary(@Nullable initExpression: JsExpression?, @Nullable source: Any?): TemporaryVariable defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'JsIntLiteral' @ [179:46] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'expression' @ [179:63] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsArrayAccess' @ [181:27] ==> public constructor JsArrayAccess(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayAccess[JavaClassConstructorDescriptor]

'rangeExpression' @ [181:41] ==> val rangeExpression: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'index' @ [181:58] ==> val index: TemporaryVariable defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'reference' @ [181:64] ==> @NotNull public open fun reference(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.TemporaryVariable[JavaMethodDescriptor]

'source' @ [181:77] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsArrayAccess[JavaMethodDescriptor]

'expression' @ [181:84] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'translateBody' @ [182:20] ==> local final fun translateBody(itemValue: JsExpression?): JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'arrayAccess' @ [182:34] ==> val arrayAccess: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'assignment' @ [183:30] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'index' @ [183:41] ==> val index: TemporaryVariable defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'reference' @ [183:47] ==> @NotNull public open fun reference(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.TemporaryVariable[JavaMethodDescriptor]

'JsIntLiteral' @ [183:60] ==> public constructor JsIntLiteral(p0: Int) defined in org.jetbrains.kotlin.js.backend.ast.JsIntLiteral[JavaClassConstructorDescriptor]

'source' @ [183:77] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'expression' @ [183:84] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'inequality' @ [184:35] ==> @NotNull public open fun inequality(@NotNull arg1: JsExpression, @NotNull arg2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'index' @ [184:46] ==> val index: TemporaryVariable defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'reference' @ [184:52] ==> @NotNull public open fun reference(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.TemporaryVariable[JavaMethodDescriptor]

'end' @ [184:65] ==> val end: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'source' @ [184:70] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'expression' @ [184:77] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsPrefixOperation' @ [185:35] ==> public constructor JsPrefixOperation(p0: (JsUnaryOperator..JsUnaryOperator?), p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsPrefixOperation[JavaClassConstructorDescriptor]

'INC' @ [185:69] ==> enum entry INC defined in org.jetbrains.kotlin.js.backend.ast.JsUnaryOperator[FakeCallableDescriptorForObject]

'index' @ [185:74] ==> val index: TemporaryVariable defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'reference' @ [185:80] ==> @NotNull public open fun reference(): JsNameRef defined in org.jetbrains.kotlin.js.translate.context.TemporaryVariable[JavaMethodDescriptor]

'source' @ [185:93] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsPrefixOperation[JavaMethodDescriptor]

'expression' @ [185:100] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsFor' @ [187:16] ==> public constructor JsFor(p0: (JsExpression..JsExpression?), p1: (JsExpression..JsExpression?), p2: (JsExpression..JsExpression?), p3: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsFor[JavaClassConstructorDescriptor]

'initExpression' @ [187:22] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'conditionExpression' @ [187:38] ==> val conditionExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'incrementExpression' @ [187:59] ==> val incrementExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'body' @ [187:80] ==> val body: JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverArray[LocalVariableDescriptor]

'CallTranslator' @ [196:27] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translate' @ [196:42] ==> @JvmOverloads @JvmStatic public final fun translate(context: TranslationContext, resolvedCall: ResolvedCall<out FunctionDescriptor>, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'context' @ [196:52] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'innerBlock' @ [196:60] ==> @NotNull public open fun innerBlock(@NotNull block: JsBlock): TranslationContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'block' @ [196:71] ==> value-parameter block: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.translateMethodInvocation[ValueParameterDescriptorImpl]

'resolvedCall' @ [196:79] ==> value-parameter resolvedCall: ResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.translateMethodInvocation[ValueParameterDescriptorImpl]

'receiver' @ [196:93] ==> value-parameter receiver: JsExpression? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.translateMethodInvocation[ValueParameterDescriptorImpl]

'translateAsExpression' @ [199:37] ==> @NotNull public open fun translateAsExpression(@NotNull expression: KtExpression, @NotNull context: TranslationContext): JsExpression defined in org.jetbrains.kotlin.js.translate.general.Translation[JavaMethodDescriptor]

'loopRange' @ [199:59] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'context' @ [199:70] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'getIteratorFunction' @ [200:32] ==> @NotNull public open fun getIteratorFunction(@NotNull context: BindingContext, @NotNull rangeExpression: KtExpression): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [200:52] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [200:60] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'loopRange' @ [200:78] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'CallTranslator' @ [201:20] ==> public object CallTranslator defined in org.jetbrains.kotlin.js.translate.callTranslator in file CallTranslator.kt[FakeCallableDescriptorForObject]

'translate' @ [201:35] ==> @JvmOverloads @JvmStatic public final fun translate(context: TranslationContext, resolvedCall: ResolvedCall<out FunctionDescriptor>, extensionOrDispatchReceiver: JsExpression? = ...): JsExpression defined in org.jetbrains.kotlin.js.translate.callTranslator.CallTranslator[SimpleFunctionDescriptorImpl]

'context' @ [201:45] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'resolvedCall' @ [201:54] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.iteratorMethodInvocation[LocalVariableDescriptor]

'range' @ [201:68] ==> val range: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.iteratorMethodInvocation[LocalVariableDescriptor]

'context' @ [204:27] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'defineTemporary' @ [204:35] ==> @NotNull public open fun defineTemporary(@NotNull initExpression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'iteratorMethodInvocation' @ [204:51] ==> local final fun iteratorMethodInvocation(): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[SimpleFunctionDescriptorImpl]

'getHasNextCallable' @ [207:32] ==> @NotNull public open fun getHasNextCallable(@NotNull context: BindingContext, @NotNull rangeExpression: KtExpression): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [207:51] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [207:59] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'loopRange' @ [207:77] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'translateMethodInvocation' @ [208:20] ==> local final fun translateMethodInvocation(receiver: JsExpression?, resolvedCall: ResolvedCall<FunctionDescriptor>, block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[SimpleFunctionDescriptorImpl]

'iteratorVar' @ [208:46] ==> val iteratorVar: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'resolvedCall' @ [208:59] ==> val resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.hasNextMethodInvocation[LocalVariableDescriptor]

'block' @ [208:73] ==> value-parameter block: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator.hasNextMethodInvocation[ValueParameterDescriptorImpl]

'JsBlock' @ [211:28] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'hasNextMethodInvocation' @ [212:33] ==> local final fun hasNextMethodInvocation(block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[SimpleFunctionDescriptorImpl]

'hasNextBlock' @ [212:57] ==> val hasNextBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'JsBlock' @ [214:25] ==> public constructor JsBlock() defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'translateMethodInvocation' @ [215:26] ==> local final fun translateMethodInvocation(receiver: JsExpression?, resolvedCall: ResolvedCall<FunctionDescriptor>, block: JsBlock): JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[SimpleFunctionDescriptorImpl]

'iteratorVar' @ [215:52] ==> val iteratorVar: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'getNextFunction' @ [215:65] ==> @NotNull public open fun getNextFunction(@NotNull context: BindingContext, @NotNull rangeExpression: KtExpression): ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)> defined in org.jetbrains.kotlin.js.translate.utils.BindingUtils[JavaMethodDescriptor]

'context' @ [215:81] ==> value-parameter context: TranslationContext defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'bindingContext' @ [215:89] ==> @NotNull public open fun bindingContext(): BindingContext defined in org.jetbrains.kotlin.js.translate.context.TranslationContext[JavaMethodDescriptor]

'loopRange' @ [215:107] ==> val loopRange: KtExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'nextBlock' @ [215:119] ==> val nextBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'mutableListOf' @ [217:30] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'if (hasNextBlock.isEmpty) {
            hasNextInvocation
        }
        else {
            bodyStatements += hasNextBlock.statements
            bodyStatements += JsIf(notOptimized(hasNextInvocation), JsBreak().apply { source = expression }).apply { source = expression }
            JsBooleanLiteral(true)
        }' @ [218:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression, elseBranch: JsExpression): JsExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression

'hasNextBlock' @ [218:33] ==> val hasNextBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'isEmpty' @ [218:46] ==> public final val JsBlock.isEmpty: Boolean[MyPropertyDescriptor]

'hasNextInvocation' @ [219:13] ==> val hasNextInvocation: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'bodyStatements' @ [222:13] ==> val bodyStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'hasNextBlock' @ [222:31] ==> val hasNextBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'statements' @ [222:44] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'bodyStatements' @ [223:13] ==> val bodyStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'JsIf' @ [223:31] ==> public constructor JsIf(@NotNull p0: JsExpression, @NotNull p1: JsStatement) defined in org.jetbrains.kotlin.js.backend.ast.JsIf[JavaClassConstructorDescriptor]

'notOptimized' @ [223:36] ==> @NotNull public open fun notOptimized(@NotNull expression: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'hasNextInvocation' @ [223:49] ==> val hasNextInvocation: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'JsBreak' @ [223:69] ==> public constructor JsBreak() defined in org.jetbrains.kotlin.js.backend.ast.JsBreak[JavaClassConstructorDescriptor]

'apply' @ [223:79] ==> @InlineOnly public inline fun <T> JsBreak.apply(block: JsBreak.() -> Unit): JsBreak defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsBreak

'source' @ [223:87] ==> public final var JsBreak.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [223:96] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'apply' @ [223:110] ==> @InlineOnly public inline fun <T> JsIf.apply(block: JsIf.() -> Unit): JsIf defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsIf

'source' @ [223:118] ==> public final var JsIf.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [223:127] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

'JsBooleanLiteral' @ [224:13] ==> public constructor JsBooleanLiteral(p0: Boolean) defined in org.jetbrains.kotlin.js.backend.ast.JsBooleanLiteral[JavaClassConstructorDescriptor]

'bodyStatements' @ [226:9] ==> val bodyStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'nextBlock' @ [226:27] ==> val nextBlock: JsBlock defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'statements' @ [226:37] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'bodyStatements' @ [227:9] ==> val bodyStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'translateBody' @ [227:27] ==> local final fun translateBody(itemValue: JsExpression?): JsStatement? defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'nextInvoke' @ [227:41] ==> val nextInvoke: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'let' @ [227:54] ==> @InlineOnly public inline fun <T, R> JsStatement.let(block: (JsStatement) -> (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement
    <R> -> (kotlin.collections.MutableList<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>..kotlin.collections.List<(org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)>)

'orEmpty' @ [227:78] ==> @InlineOnly public inline fun <T> List<(JsStatement..JsStatement?)>?.orEmpty(): List<(JsStatement..JsStatement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'JsWhile' @ [228:16] ==> public constructor JsWhile(p0: (JsExpression..JsExpression?), p1: (JsStatement..JsStatement?)) defined in org.jetbrains.kotlin.js.backend.ast.JsWhile[JavaClassConstructorDescriptor]

'exitCondition' @ [228:24] ==> val exitCondition: JsExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'bodyStatements' @ [228:39] ==> val bodyStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'singleOrNull' @ [228:54] ==> public fun <T> List<JsStatement>.singleOrNull(): JsStatement? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'JsBlock' @ [228:72] ==> public constructor JsBlock(@NotNull p0: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)) defined in org.jetbrains.kotlin.js.backend.ast.JsBlock[JavaClassConstructorDescriptor]

'bodyStatements' @ [228:80] ==> val bodyStatements: MutableList<JsStatement> defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression.translateForOverIterator[LocalVariableDescriptor]

'when {
        isForOverRangeLiteral() ->
            translateForOverLiteralRange()

        isForOverRange() ->
            translateForOverRange()

        isForOverArray() ->
            translateForOverArray()

        else ->
            translateForOverIterator()
    }' @ [231:18] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsStatement, entry1: JsStatement, entry2: JsStatement, entry3: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsStatement

'isForOverRangeLiteral' @ [232:9] ==> local final fun isForOverRangeLiteral(): Boolean defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'translateForOverLiteralRange' @ [233:13] ==> local final fun translateForOverLiteralRange(): JsStatement defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'isForOverRange' @ [235:9] ==> local final fun isForOverRange(): Boolean defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'translateForOverRange' @ [236:13] ==> local final fun translateForOverRange(): JsStatement defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'isForOverArray' @ [238:9] ==> local final fun isForOverArray(): Boolean defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'translateForOverArray' @ [239:13] ==> local final fun translateForOverArray(): JsStatement defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'translateForOverIterator' @ [242:13] ==> local final fun translateForOverIterator(): JsStatement defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[SimpleFunctionDescriptorImpl]

'result' @ [245:12] ==> val result: JsStatement defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[LocalVariableDescriptor]

'apply' @ [245:19] ==> @InlineOnly public inline fun <T> JsStatement.apply(block: JsStatement.() -> Unit): JsStatement defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'source' @ [245:27] ==> public final var JsStatement.source: (Any..Any?)[MyPropertyDescriptor]

'expression' @ [245:36] ==> value-parameter expression: KtForExpression defined in org.jetbrains.kotlin.js.translate.expression.translateForExpression[ValueParameterDescriptorImpl]

