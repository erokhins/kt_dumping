'getDefaultParamsNames' @ [33:20] ==> private fun getDefaultParamsNames(args: List<JsExpression>, params: List<JsParameter>, initialized: Boolean): Set<JsName> defined in org.jetbrains.kotlin.js.inline.clean[SimpleFunctionDescriptorImpl]

'arguments' @ [33:42] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[ValueParameterDescriptorImpl]

'parameters' @ [33:53] ==> value-parameter parameters: List<JsParameter> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[ValueParameterDescriptorImpl]

'getDefaultParamsNames' @ [34:20] ==> private fun getDefaultParamsNames(args: List<JsExpression>, params: List<JsParameter>, initialized: Boolean): Set<JsName> defined in org.jetbrains.kotlin.js.inline.clean[SimpleFunctionDescriptorImpl]

'arguments' @ [34:42] ==> value-parameter arguments: List<JsExpression> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[ValueParameterDescriptorImpl]

'parameters' @ [34:53] ==> value-parameter parameters: List<JsParameter> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[ValueParameterDescriptorImpl]

'body' @ [36:22] ==> value-parameter body: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[ValueParameterDescriptorImpl]

'statements' @ [36:27] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'statements' @ [37:25] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[LocalVariableDescriptor]

'flatMap' @ [37:36] ==> public inline fun <T, R> Iterable<(JsStatement..JsStatement?)>.flatMap(transform: ((JsStatement..JsStatement?)) -> Iterable<(JsStatement..JsStatement?)>): List<(JsStatement..JsStatement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)
    <R> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'getNameFromInitializer' @ [38:20] ==> private fun getNameFromInitializer(statement: JsStatement): JsName? defined in org.jetbrains.kotlin.js.inline.clean in file removeDefaultInitializers.kt[SimpleFunctionDescriptorImpl]

'it' @ [38:43] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [39:13] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'!' @ [39:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNameInitialized' @ [39:30] ==> private fun isNameInitialized(name: JsName, initializer: JsStatement): Boolean defined in org.jetbrains.kotlin.js.inline.clean in file removeDefaultInitializers.kt[SimpleFunctionDescriptorImpl]

'name' @ [39:48] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'it' @ [39:54] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [40:19] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'when {
            name != null && name in toRemove ->
                listOf<JsStatement>()
            name != null && name in toExpand -> {
                val thenStatement = (it as JsIf).thenStatement
                markAssignmentAsStaticRef(name, thenStatement)
                flattenStatement(thenStatement)
            }
            else ->
                listOf(it)
        }' @ [43:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<JsStatement>, entry1: List<JsStatement>, entry2: List<JsStatement>): List<JsStatement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<JsStatement>

'name' @ [44:13] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'name' @ [44:29] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'toRemove' @ [44:37] ==> val toRemove: Set<JsName> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[LocalVariableDescriptor]

'listOf' @ [45:17] ==> @InlineOnly public inline fun <T> listOf(): List<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'name' @ [46:13] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'name' @ [46:29] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'toExpand' @ [46:37] ==> val toExpand: Set<JsName> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[LocalVariableDescriptor]

'it' @ [47:38] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[ValueParameterDescriptorImpl]

'thenStatement' @ [47:50] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'markAssignmentAsStaticRef' @ [48:17] ==> private fun markAssignmentAsStaticRef(name: JsName, node: JsNode): Unit defined in org.jetbrains.kotlin.js.inline.clean in file removeDefaultInitializers.kt[SimpleFunctionDescriptorImpl]

'name' @ [48:43] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'thenStatement' @ [48:49] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'flattenStatement' @ [49:17] ==> @NotNull public open fun flattenStatement(@NotNull statement: JsStatement): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thenStatement' @ [49:34] ==> val thenStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[LocalVariableDescriptor]

'listOf' @ [52:17] ==> public fun <T> listOf(element: (JsStatement..JsStatement?)): List<(JsStatement..JsStatement?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'it' @ [52:24] ==> value-parameter it: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers.<anonymous>[ValueParameterDescriptorImpl]

'statements' @ [56:5] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[LocalVariableDescriptor]

'clear' @ [56:16] ==> public abstract fun clear(): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'statements' @ [57:5] ==> val statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[LocalVariableDescriptor]

'addAll' @ [57:16] ==> public abstract fun addAll(elements: Collection<(JsStatement..JsStatement?)>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'newStatements' @ [57:23] ==> val newStatements: List<(JsStatement..JsStatement?)> defined in org.jetbrains.kotlin.js.inline.clean.removeDefaultInitializers[LocalVariableDescriptor]

'node' @ [61:5] ==> value-parameter node: JsNode defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef[ValueParameterDescriptorImpl]

'accept' @ [61:10] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [61:26] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'decomposeAssignmentToVariable' @ [63:13] ==> @Nullable public open fun decomposeAssignmentToVariable(@NotNull expr: JsExpression): Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [63:43] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'let' @ [63:47] ==> @InlineOnly public inline fun <T, R> Pair<(JsName..JsName?), (JsExpression..JsExpression?)>.let(block: (Pair<(JsName..JsName?), (JsExpression..JsExpression?)>) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.js.backend.ast.JsName..org.jetbrains.kotlin.js.backend.ast.JsName?), (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)>
    <R> -> Unit

'component1' @ [63:54] ==> public final operator fun component1(): (JsName..JsName?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [63:72] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assignmentTarget' @ [64:21] ==> val assignmentTarget: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef.<no name provided>.visitBinaryExpression.<anonymous>[LocalVariableDescriptor]

'name' @ [64:41] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef[ValueParameterDescriptorImpl]

'assignmentTarget' @ [65:21] ==> val assignmentTarget: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef.<no name provided>.visitBinaryExpression.<anonymous>[LocalVariableDescriptor]

'staticRef' @ [65:38] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'assignmentExpr' @ [65:50] ==> val assignmentExpr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef.<no name provided>.visitBinaryExpression.<anonymous>[LocalVariableDescriptor]

'super' @ [68:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitBinaryExpression' @ [68:19] ==> public open fun visitBinaryExpression(x: JsBinaryOperation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [68:41] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.clean.markAssignmentAsStaticRef.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'statement' @ [74:19] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[ValueParameterDescriptorImpl]

'ifStmt' @ [75:20] ==> val ifStmt: JsIf? defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'ifExpression' @ [75:28] ==> public final var JsIf.ifExpression: JsExpression[MyPropertyDescriptor]

'ifStmt' @ [77:20] ==> val ifStmt: JsIf? defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'elseStatement' @ [77:28] ==> public final var JsIf.elseStatement: JsStatement?[MyPropertyDescriptor]

'elseStmt' @ [78:9] ==> val elseStmt: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'testExpr' @ [78:29] ==> val testExpr: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'getNameFromInitializer' @ [79:16] ==> private fun getNameFromInitializer(isInitializedExpr: JsBinaryOperation): JsName? defined in org.jetbrains.kotlin.js.inline.clean in file removeDefaultInitializers.kt[SimpleFunctionDescriptorImpl]

'testExpr' @ [79:39] ==> val testExpr: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'isInitializedExpr' @ [85:16] ==> value-parameter isInitializedExpr: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[ValueParameterDescriptorImpl]

'arg1' @ [85:34] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'isInitializedExpr' @ [86:16] ==> value-parameter isInitializedExpr: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[ValueParameterDescriptorImpl]

'arg2' @ [86:34] ==> public final var JsBinaryOperation.arg2: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'isInitializedExpr' @ [87:14] ==> value-parameter isInitializedExpr: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[ValueParameterDescriptorImpl]

'operator' @ [87:32] ==> public final val JsBinaryOperation.operator: JsBinaryOperator[MyPropertyDescriptor]

'arg1' @ [89:9] ==> val arg1: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'arg2' @ [89:25] ==> val arg2: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'op' @ [93:9] ==> val op: JsBinaryOperator defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'REF_EQ' @ [93:32] ==> enum entry REF_EQ defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperator[FakeCallableDescriptorForObject]

'isUndefinedExpression' @ [93:53] ==> public open fun isUndefinedExpression(expression: (JsExpression..JsExpression?)): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'arg2' @ [93:75] ==> val arg2: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'arg1' @ [94:17] ==> val arg1: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.getNameFromInitializer[LocalVariableDescriptor]

'name' @ [94:38] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'initializer' @ [108:21] ==> value-parameter initializer: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[ValueParameterDescriptorImpl]

'thenStatement' @ [108:42] ==> public final var JsIf.thenStatement: JsStatement[MyPropertyDescriptor]

'flattenStatement' @ [109:24] ==> @NotNull public open fun flattenStatement(@NotNull statement: JsStatement): (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>) defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'thenStmt' @ [109:41] ==> val thenStmt: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'last' @ [109:51] ==> public fun <T> List<(JsStatement..JsStatement?)>.last(): (JsStatement..JsStatement?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'lastThenStmt' @ [111:17] ==> val lastThenStmt: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'expression' @ [111:58] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'expr' @ [112:9] ==> val expr: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'expr' @ [114:14] ==> val expr: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'operator' @ [114:19] ==> public final val JsBinaryOperation.operator: JsBinaryOperator[MyPropertyDescriptor]

'!' @ [115:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'op' @ [115:10] ==> val op: JsBinaryOperator defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'isAssignment' @ [115:13] ==> public final val JsBinaryOperator.isAssignment: Boolean[MyPropertyDescriptor]

'expr' @ [117:16] ==> val expr: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'arg1' @ [117:21] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'arg1' @ [118:9] ==> val arg1: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'arg1' @ [118:28] ==> val arg1: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[LocalVariableDescriptor]

'name' @ [118:33] ==> public final var HasName.name: (JsName..JsName?)[MyPropertyDescriptor]

'name' @ [118:42] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.isNameInitialized[ValueParameterDescriptorImpl]

'args' @ [129:22] ==> value-parameter args: List<JsExpression> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames[ValueParameterDescriptorImpl]

'zipWithDefault' @ [129:27] ==> public fun <T, R> Iterable<JsExpression>.zipWithDefault(other: Iterable<JsParameter>, defaultT: JsExpression): List<Pair<JsExpression, JsParameter>> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsExpression
    <R> -> JsParameter

'params' @ [129:42] ==> value-parameter params: List<JsParameter> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames[ValueParameterDescriptorImpl]

'getUndefinedExpression' @ [129:56] ==> @NotNull public open fun getUndefinedExpression(): JsExpression defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'argsParams' @ [130:26] ==> val argsParams: List<Pair<JsExpression, JsParameter>> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames[LocalVariableDescriptor]

'asSequence' @ [130:37] ==> public fun <T> Iterable<Pair<JsExpression, JsParameter>>.asSequence(): Sequence<Pair<JsExpression, JsParameter>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<JsExpression, JsParameter>

'filter' @ [131:37] ==> public fun <T> Sequence<Pair<JsExpression, JsParameter>>.filter(predicate: (Pair<JsExpression, JsParameter>) -> Boolean): Sequence<Pair<JsExpression, JsParameter>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<JsExpression, JsParameter>

'it' @ [131:46] ==> value-parameter it: Pair<JsExpression, JsParameter> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [131:49] ==> public final val second: JsParameter defined in kotlin.Pair[DeserializedPropertyDescriptor]

'hasDefaultValue' @ [131:56] ==> public var JsParameter.hasDefaultValue: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'filter' @ [132:37] ==> public fun <T> Sequence<Pair<JsExpression, JsParameter>>.filter(predicate: (Pair<JsExpression, JsParameter>) -> Boolean): Sequence<Pair<JsExpression, JsParameter>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<JsExpression, JsParameter>

'initialized' @ [132:46] ==> value-parameter initialized: Boolean defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames[ValueParameterDescriptorImpl]

'!' @ [132:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isUndefinedExpression' @ [132:73] ==> public open fun isUndefinedExpression(expression: (JsExpression..JsExpression?)): Boolean defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'it' @ [132:95] ==> value-parameter it: Pair<JsExpression, JsParameter> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [132:98] ==> public final val first: JsExpression defined in kotlin.Pair[DeserializedPropertyDescriptor]

'relevantParams' @ [134:17] ==> val relevantParams: Sequence<Pair<JsExpression, JsParameter>> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames[LocalVariableDescriptor]

'map' @ [134:32] ==> public fun <T, R> Sequence<Pair<JsExpression, JsParameter>>.map(transform: (Pair<JsExpression, JsParameter>) -> JsName): Sequence<JsName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<JsExpression, JsParameter>
    <R> -> JsName

'it' @ [134:38] ==> value-parameter it: Pair<JsExpression, JsParameter> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [134:41] ==> public final val second: JsParameter defined in kotlin.Pair[DeserializedPropertyDescriptor]

'name' @ [134:48] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'names' @ [135:12] ==> val names: Sequence<JsName> defined in org.jetbrains.kotlin.js.inline.clean.getDefaultParamsNames[LocalVariableDescriptor]

'toSet' @ [135:18] ==> public fun <T> Sequence<JsName>.toSet(): Set<JsName> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

