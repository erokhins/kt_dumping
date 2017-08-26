'collectReferencedNames' @ [26:9] ==> private fun collectReferencedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [26:32] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectFunctionReferencesInside[ValueParameterDescriptorImpl]

'filter' @ [26:39] ==> public inline fun <T> Iterable<JsName>.filter(predicate: (JsName) -> Boolean): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'it' @ [26:48] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.util.collectFunctionReferencesInside.<anonymous>[ValueParameterDescriptorImpl]

'staticRef' @ [26:51] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'mutableSetOf' @ [29:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'RecursiveJsVisitor' @ [31:14] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [37:31] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visit[ValueParameterDescriptorImpl]

'initExpression' @ [37:33] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'initializer' @ [38:17] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visit[LocalVariableDescriptor]

'accept' @ [39:17] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'initializer' @ [39:24] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visit[LocalVariableDescriptor]

'super' @ [44:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [44:19] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [44:32] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'nameRef' @ [45:24] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'name' @ [45:32] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [46:17] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visitNameRef[LocalVariableDescriptor]

'references' @ [47:17] ==> val references: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames[LocalVariableDescriptor]

'name' @ [47:31] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>.visitNameRef[LocalVariableDescriptor]

'accept' @ [50:7] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'scope' @ [50:14] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames[ValueParameterDescriptorImpl]

'references' @ [52:12] ==> val references: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectReferencedNames[LocalVariableDescriptor]

'mutableSetOf' @ [56:22] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'RecursiveJsVisitor' @ [58:14] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [64:31] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visit[ValueParameterDescriptorImpl]

'initExpression' @ [64:33] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'initializer' @ [65:17] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visit[LocalVariableDescriptor]

'accept' @ [66:17] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'initializer' @ [66:24] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visit[LocalVariableDescriptor]

'super' @ [71:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [71:19] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [71:32] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'nameRef' @ [72:24] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'name' @ [72:32] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [73:17] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visitNameRef[LocalVariableDescriptor]

'nameRef' @ [73:33] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'qualifier' @ [73:41] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'references' @ [74:17] ==> val references: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames[LocalVariableDescriptor]

'add' @ [74:28] ==> public abstract fun add(element: JsName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'name' @ [74:32] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visitNameRef[LocalVariableDescriptor]

'references' @ [79:13] ==> val references: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames[LocalVariableDescriptor]

'x' @ [79:27] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'collectFreeVariables' @ [79:29] ==> public fun JsFunction.collectFreeVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'accept' @ [81:7] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'scope' @ [81:14] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames[ValueParameterDescriptorImpl]

'references' @ [83:12] ==> val references: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectUsedNames[LocalVariableDescriptor]

'mutableSetOf' @ [87:17] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'RecursiveJsVisitor' @ [89:14] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [91:31] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visit[ValueParameterDescriptorImpl]

'initExpression' @ [91:33] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'initializer' @ [92:17] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visit[LocalVariableDescriptor]

'accept' @ [93:17] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'initializer' @ [93:24] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visit[LocalVariableDescriptor]

'names' @ [95:13] ==> val names: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames[LocalVariableDescriptor]

'x' @ [95:22] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visit[ValueParameterDescriptorImpl]

'name' @ [95:24] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'x' @ [99:30] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [99:32] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'expression' @ [100:17] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'expression' @ [101:28] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'name' @ [101:39] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'name' @ [102:21] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'names' @ [103:21] ==> val names: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames[LocalVariableDescriptor]

'name' @ [103:30] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'super' @ [106:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpressionStatement' @ [106:19] ==> public open fun visitExpressionStatement(x: JsExpressionStatement): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [106:44] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'accept' @ [112:7] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'scope' @ [112:14] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames[ValueParameterDescriptorImpl]

'names' @ [114:12] ==> val names: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util.collectDefinedNames[LocalVariableDescriptor]

'collectUsedNames' @ [117:41] ==> public fun collectUsedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'body' @ [117:58] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'collectDefinedNames' @ [117:66] ==> public fun collectDefinedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'body' @ [117:86] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'parameters' @ [117:94] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'map' @ [117:105] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsName): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsName

'it' @ [117:111] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.inline.util.collectFreeVariables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [117:114] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'collectDefinedNames' @ [119:42] ==> public fun collectDefinedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'body' @ [119:62] ==> public final var JsFunction.body: JsBlock[MyPropertyDescriptor]

'parameters' @ [119:70] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'map' @ [119:81] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsName): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsName

'it' @ [119:87] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.inline.util.collectLocalVariables.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [119:90] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'collectNamedFunctionsAndMetadata' @ [121:44] ==> public fun collectNamedFunctionsAndMetadata(scope: JsNode): Map<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [121:77] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[ValueParameterDescriptorImpl]

'mapValues' @ [121:84] ==> public inline fun <K, V, R> Map<out JsName, Pair<JsFunction, JsExpression>>.mapValues(transform: (Map.Entry<JsName, Pair<JsFunction, JsExpression>>) -> JsFunction): Map<JsName, JsFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> Pair<JsFunction, JsExpression>
    <R> -> JsFunction

'it' @ [121:96] ==> value-parameter it: Map.Entry<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [121:99] ==> public abstract val value: Pair<JsFunction, JsExpression> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'first' @ [121:105] ==> public final val first: JsFunction defined in kotlin.Pair[DeserializedPropertyDescriptor]

'collectNamedFunctionsAndMetadata' @ [123:54] ==> public fun collectNamedFunctionsAndMetadata(scope: JsNode): Map<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [123:87] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsOrMetadata[ValueParameterDescriptorImpl]

'mapValues' @ [123:94] ==> public inline fun <K, V, R> Map<out JsName, Pair<JsFunction, JsExpression>>.mapValues(transform: (Map.Entry<JsName, Pair<JsFunction, JsExpression>>) -> JsExpression): Map<JsName, JsExpression> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> Pair<JsFunction, JsExpression>
    <R> -> JsExpression

'it' @ [123:106] ==> value-parameter it: Map.Entry<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsOrMetadata.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [123:109] ==> public abstract val value: Pair<JsFunction, JsExpression> defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'second' @ [123:115] ==> public final val second: JsExpression defined in kotlin.Pair[DeserializedPropertyDescriptor]

'mutableMapOf' @ [126:18] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, JsFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsFunction

'fragments' @ [127:22] ==> value-parameter fragments: List<JsProgramFragment> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[ValueParameterDescriptorImpl]

'result' @ [128:9] ==> val result: MutableMap<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[LocalVariableDescriptor]

'collectNamedFunctions' @ [128:19] ==> public fun collectNamedFunctions(scope: JsNode): Map<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'fragment' @ [128:41] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[LocalVariableDescriptor]

'declarationBlock' @ [128:50] ==> public final val JsProgramFragment.declarationBlock: JsGlobalBlock[MyPropertyDescriptor]

'result' @ [129:9] ==> val result: MutableMap<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[LocalVariableDescriptor]

'collectNamedFunctions' @ [129:19] ==> public fun collectNamedFunctions(scope: JsNode): Map<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'fragment' @ [129:41] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[LocalVariableDescriptor]

'initializerBlock' @ [129:50] ==> public final val JsProgramFragment.initializerBlock: JsGlobalBlock[MyPropertyDescriptor]

'result' @ [131:12] ==> val result: MutableMap<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctions[LocalVariableDescriptor]

'mutableMapOf' @ [135:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, Pair<JsFunction, JsExpression>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> Pair<JsFunction, JsExpression>

'scope' @ [137:5] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata[ValueParameterDescriptorImpl]

'accept' @ [137:11] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [137:27] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'decomposeAssignment' @ [139:41] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [139:61] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'assignment' @ [140:17] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'component1' @ [141:22] ==> public final operator fun component1(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [141:28] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assignment' @ [141:37] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'left' @ [142:21] ==> val left: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'left' @ [143:32] ==> val left: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'name' @ [143:37] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'extractFunction' @ [144:36] ==> private final fun extractFunction(expression: JsExpression): JsFunction? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>[SimpleFunctionDescriptorImpl]

'right' @ [144:52] ==> val right: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'function' @ [145:25] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'name' @ [145:45] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'namedFunctions' @ [146:25] ==> val namedFunctions: MutableMap<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata[LocalVariableDescriptor]

'name' @ [146:40] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'Pair' @ [146:48] ==> public constructor Pair<out A, out B>(first: JsFunction, second: (JsExpression..JsExpression?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsFunction
    <out B> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'function' @ [146:53] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'right' @ [146:63] ==> val right: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[LocalVariableDescriptor]

'super' @ [150:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitBinaryExpression' @ [150:19] ==> public open fun visitBinaryExpression(x: JsBinaryOperation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [150:41] ==> value-parameter x: JsBinaryOperation defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitBinaryExpression[ValueParameterDescriptorImpl]

'x' @ [154:31] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[ValueParameterDescriptorImpl]

'initExpression' @ [154:33] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'x' @ [155:24] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[ValueParameterDescriptorImpl]

'name' @ [155:26] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'initializer' @ [156:17] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'name' @ [156:40] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'extractFunction' @ [157:32] ==> private final fun extractFunction(expression: JsExpression): JsFunction? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>[SimpleFunctionDescriptorImpl]

'initializer' @ [157:48] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'function' @ [158:21] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'namedFunctions' @ [159:21] ==> val namedFunctions: MutableMap<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata[LocalVariableDescriptor]

'name' @ [159:36] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'Pair' @ [159:44] ==> public constructor Pair<out A, out B>(first: JsFunction, second: (JsExpression..JsExpression?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsFunction
    <out B> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'function' @ [159:49] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'initializer' @ [159:59] ==> val initializer: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[LocalVariableDescriptor]

'super' @ [162:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [162:19] ==> public open fun visit(x: JsVars.JsVar): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [162:25] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visit[ValueParameterDescriptorImpl]

'x' @ [166:24] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'name' @ [166:26] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'name' @ [167:17] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitFunction[LocalVariableDescriptor]

'namedFunctions' @ [168:17] ==> val namedFunctions: MutableMap<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata[LocalVariableDescriptor]

'name' @ [168:32] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitFunction[LocalVariableDescriptor]

'Pair' @ [168:40] ==> public constructor Pair<out A, out B>(first: JsFunction, second: JsFunction) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsFunction
    <out B> -> JsFunction

'x' @ [168:45] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'x' @ [168:48] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'super' @ [170:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitFunction' @ [170:19] ==> public open fun visitFunction(x: JsFunction): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [170:33] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'when (expression) {
            is JsFunction -> expression
            else -> InlineMetadata.decompose(expression)?.function
        }' @ [173:65] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsFunction?, entry1: JsFunction?): JsFunction?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsFunction?

'expression' @ [173:71] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.extractFunction[ValueParameterDescriptorImpl]

'expression' @ [174:30] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.extractFunction[ValueParameterDescriptorImpl]

'decompose' @ [175:36] ==> @JvmStatic public final fun decompose(expression: JsExpression?): InlineMetadata? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion[SimpleFunctionDescriptorImpl]

'expression' @ [175:46] ==> value-parameter expression: JsExpression defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata.<no name provided>.extractFunction[ValueParameterDescriptorImpl]

'function' @ [175:59] ==> public final val function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'namedFunctions' @ [179:12] ==> val namedFunctions: MutableMap<JsName, Pair<JsFunction, JsExpression>> defined in org.jetbrains.kotlin.js.inline.util.collectNamedFunctionsAndMetadata[LocalVariableDescriptor]

'hashMapOf' @ [183:21] ==> @SinceKotlin @InlineOnly public inline fun <K, V> hashMapOf(): HashMap<String, JsFunction> /* = HashMap<String, JsFunction> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsFunction

'scope' @ [185:5] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[ValueParameterDescriptorImpl]

'accept' @ [185:11] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [185:27] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'InlineMetadata' @ [187:13] ==> public companion object defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[FakeCallableDescriptorForObject]

'decompose' @ [187:28] ==> @JvmStatic public final fun decompose(expression: JsExpression?): InlineMetadata? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion[SimpleFunctionDescriptorImpl]

'invocation' @ [187:38] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.collectAccessors.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'let' @ [187:51] ==> @InlineOnly public inline fun <T, R> InlineMetadata.let(block: (InlineMetadata) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InlineMetadata
    <R> -> Unit

'accessors' @ [188:17] ==> val accessors: HashMap<String, JsFunction> /* = HashMap<String, JsFunction> */ defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[LocalVariableDescriptor]

'it' @ [188:27] ==> value-parameter it: InlineMetadata defined in org.jetbrains.kotlin.js.inline.util.collectAccessors.<no name provided>.visitInvocation.<anonymous>[ValueParameterDescriptorImpl]

'tag' @ [188:30] ==> public final val tag: JsStringLiteral defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'value' @ [188:34] ==> public final val JsStringLiteral.value: (String..String?)[MyPropertyDescriptor]

'it' @ [188:43] ==> value-parameter it: InlineMetadata defined in org.jetbrains.kotlin.js.inline.util.collectAccessors.<no name provided>.visitInvocation.<anonymous>[ValueParameterDescriptorImpl]

'function' @ [188:46] ==> public final val function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'super' @ [190:13] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectAccessors.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitInvocation' @ [190:19] ==> public open fun visitInvocation(invocation: JsInvocation): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'invocation' @ [190:35] ==> value-parameter invocation: JsInvocation defined in org.jetbrains.kotlin.js.inline.util.collectAccessors.<no name provided>.visitInvocation[ValueParameterDescriptorImpl]

'accessors' @ [194:12] ==> val accessors: HashMap<String, JsFunction> /* = HashMap<String, JsFunction> */ defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[LocalVariableDescriptor]

'mutableMapOf' @ [198:18] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<String, JsFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> String
    <V> -> JsFunction

'fragments' @ [199:22] ==> value-parameter fragments: List<JsProgramFragment> defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[ValueParameterDescriptorImpl]

'result' @ [200:9] ==> val result: MutableMap<String, JsFunction> defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[LocalVariableDescriptor]

'collectAccessors' @ [200:19] ==> public fun collectAccessors(scope: JsNode): Map<String, JsFunction> defined in org.jetbrains.kotlin.js.inline.util in file collectUtils.kt[SimpleFunctionDescriptorImpl]

'fragment' @ [200:36] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[LocalVariableDescriptor]

'declarationBlock' @ [200:45] ==> public final val JsProgramFragment.declarationBlock: JsGlobalBlock[MyPropertyDescriptor]

'result' @ [202:12] ==> val result: MutableMap<String, JsFunction> defined in org.jetbrains.kotlin.js.inline.util.collectAccessors[LocalVariableDescriptor]

'with' @ [206:12] ==> @InlineOnly public inline fun <T, R> with(receiver: InstanceCollector<T>, block: InstanceCollector<T>.() -> MutableList<T>): MutableList<T> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> InstanceCollector<T>
    <R> -> MutableList<T>

'InstanceCollector' @ [206:17] ==> public constructor InstanceCollector<T : JsNode>(klass: Class<T>, visitNestedDeclarations: Boolean) defined in org.jetbrains.kotlin.js.inline.util.collectors.InstanceCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <T : JsNode> -> T

'klass' @ [206:35] ==> value-parameter klass: Class<T> defined in org.jetbrains.kotlin.js.inline.util.collectInstances[ValueParameterDescriptorImpl]

'accept' @ [207:9] ==> public open fun <T : JsNode?> accept(node: JsNode): Unit defined in org.jetbrains.kotlin.js.inline.util.collectors.InstanceCollector[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsNode

'scope' @ [207:16] ==> value-parameter scope: JsNode defined in org.jetbrains.kotlin.js.inline.util.collectInstances[ValueParameterDescriptorImpl]

'collected' @ [208:9] ==> public final val collected: MutableList<T> defined in org.jetbrains.kotlin.js.inline.util.collectors.InstanceCollector[PropertyDescriptorImpl]

'mutableMapOf' @ [213:19] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsContinue, JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsContinue
    <V> -> JsStatement

'accept' @ [215:5] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsNode[JavaMethodDescriptor]

'RecursiveJsVisitor' @ [215:21] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'mutableMapOf' @ [217:28] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, JsStatement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsStatement?

'mutableMapOf' @ [219:31] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, JsStatement?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsStatement?

'x' @ [222:25] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [222:27] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'when (inner) {
                is JsDoWhile -> handleLoop(inner, inner.body, x.name)

                is JsWhile -> handleLoop(inner, inner.body, x.name)

                is JsFor -> handleLoop(inner, inner.body, x.name)

                is JsSwitch -> handleSwitch(inner, x.name)

                else -> {
                    withBreakAndContinue(x.name, x.statement, null) {
                        accept(inner)
                    }
                }
            }' @ [223:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit, entry3: Unit, entry4: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'inner' @ [223:19] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'handleLoop' @ [224:33] ==> private final fun handleLoop(loop: JsStatement, body: JsStatement, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'inner' @ [224:44] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'inner' @ [224:51] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'body' @ [224:57] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'x' @ [224:63] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [224:65] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'handleLoop' @ [226:31] ==> private final fun handleLoop(loop: JsStatement, body: JsStatement, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'inner' @ [226:42] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'inner' @ [226:49] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'body' @ [226:55] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'x' @ [226:61] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [226:63] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'handleLoop' @ [228:29] ==> private final fun handleLoop(loop: JsStatement, body: JsStatement, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'inner' @ [228:40] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'inner' @ [228:47] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'body' @ [228:53] ==> public final var JsFor.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'x' @ [228:59] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [228:61] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'handleSwitch' @ [230:32] ==> private final fun handleSwitch(statement: JsSwitch, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'inner' @ [230:45] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'x' @ [230:52] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [230:54] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'withBreakAndContinue' @ [233:21] ==> private final fun withBreakAndContinue(label: JsName?, breakTargetStatement: JsStatement, continueTargetStatement: JsStatement? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [233:42] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'name' @ [233:44] ==> public final var JsLabel.name: (JsName..JsName?)[MyPropertyDescriptor]

'x' @ [233:50] ==> value-parameter x: JsLabel defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[ValueParameterDescriptorImpl]

'statement' @ [233:52] ==> public final var JsLabel.statement: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'accept' @ [234:25] ==> public open fun <T : JsNode?> accept(node: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'inner' @ [234:32] ==> val inner: (JsStatement..JsStatement?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitLabel[LocalVariableDescriptor]

'handleLoop' @ [240:47] ==> private final fun handleLoop(loop: JsStatement, body: JsStatement, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [240:58] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitWhile[ValueParameterDescriptorImpl]

'x' @ [240:61] ==> value-parameter x: JsWhile defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitWhile[ValueParameterDescriptorImpl]

'body' @ [240:63] ==> public final var JsWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'handleLoop' @ [242:51] ==> private final fun handleLoop(loop: JsStatement, body: JsStatement, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [242:62] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitDoWhile[ValueParameterDescriptorImpl]

'x' @ [242:65] ==> value-parameter x: JsDoWhile defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitDoWhile[ValueParameterDescriptorImpl]

'body' @ [242:67] ==> public final var JsDoWhile.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'handleLoop' @ [244:43] ==> private final fun handleLoop(loop: JsStatement, body: JsStatement, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [244:54] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'x' @ [244:57] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'body' @ [244:59] ==> public final var JsFor.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'handleSwitch' @ [246:43] ==> private final fun handleSwitch(statement: JsSwitch, label: JsName?): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'x' @ [246:56] ==> value-parameter x: JsSwitch defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visit[ValueParameterDescriptorImpl]

'withBreakAndContinue' @ [249:13] ==> private final fun withBreakAndContinue(label: JsName?, breakTargetStatement: JsStatement, continueTargetStatement: JsStatement? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'label' @ [249:34] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleSwitch[ValueParameterDescriptorImpl]

'statement' @ [249:41] ==> value-parameter statement: JsSwitch defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleSwitch[ValueParameterDescriptorImpl]

'statement' @ [250:17] ==> value-parameter statement: JsSwitch defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleSwitch[ValueParameterDescriptorImpl]

'cases' @ [250:27] ==> public final val JsSwitch.cases: (MutableList<(JsSwitchMember..JsSwitchMember?)>..List<(JsSwitchMember..JsSwitchMember?)>?)[MyPropertyDescriptor]

'forEach' @ [250:33] ==> @HidesMembers public inline fun <T> Iterable<(JsSwitchMember..JsSwitchMember?)>.forEach(action: ((JsSwitchMember..JsSwitchMember?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'accept' @ [250:43] ==> public open fun <T : JsNode?> accept(node: (JsSwitchMember..JsSwitchMember?)): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsSwitchMember..org.jetbrains.kotlin.js.backend.ast.JsSwitchMember?)

'it' @ [250:50] ==> value-parameter it: (JsSwitchMember..JsSwitchMember?) defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleSwitch.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'withBreakAndContinue' @ [255:13] ==> private final fun withBreakAndContinue(label: JsName?, breakTargetStatement: JsStatement, continueTargetStatement: JsStatement? = ..., action: () -> Unit): Unit defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[SimpleFunctionDescriptorImpl]

'label' @ [255:34] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleLoop[ValueParameterDescriptorImpl]

'loop' @ [255:41] ==> value-parameter loop: JsStatement defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleLoop[ValueParameterDescriptorImpl]

'loop' @ [255:47] ==> value-parameter loop: JsStatement defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleLoop[ValueParameterDescriptorImpl]

'body' @ [256:17] ==> value-parameter body: JsStatement defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.handleLoop[ValueParameterDescriptorImpl]

'accept' @ [256:22] ==> public abstract fun accept(p0: (JsVisitor..JsVisitor?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsStatement[JavaMethodDescriptor]

'this' @ [256:29] ==> <this> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[LazyClassReceiverParameterDescriptor]

'x' @ [261:31] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitBreak[ValueParameterDescriptorImpl]

'label' @ [261:33] ==> public final val JsBreak.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [261:40] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'targets' @ [262:13] ==> val targets: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets[LocalVariableDescriptor]

'x' @ [262:21] ==> value-parameter x: JsBreak defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitBreak[ValueParameterDescriptorImpl]

'if (targetLabel == null) {
                defaultBreakTarget!!
            }
            else {
                breakTargets[targetLabel]!!
            }' @ [262:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement, elseBranch: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement

'targetLabel' @ [262:30] ==> val targetLabel: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitBreak[LocalVariableDescriptor]

'defaultBreakTarget' @ [263:17] ==> public final var defaultBreakTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'breakTargets' @ [266:17] ==> public final var breakTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'targetLabel' @ [266:30] ==> val targetLabel: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitBreak[LocalVariableDescriptor]

'x' @ [271:31] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitContinue[ValueParameterDescriptorImpl]

'label' @ [271:33] ==> public final val JsContinue.label: (JsNameRef..JsNameRef?)[MyPropertyDescriptor]

'name' @ [271:40] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'targets' @ [272:13] ==> val targets: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets[LocalVariableDescriptor]

'x' @ [272:21] ==> value-parameter x: JsContinue defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitContinue[ValueParameterDescriptorImpl]

'if (targetLabel == null) {
                defaultContinueTarget!!
            }
            else {
                continueTargets[targetLabel]!!
            }' @ [272:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement, elseBranch: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement

'targetLabel' @ [272:30] ==> val targetLabel: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitContinue[LocalVariableDescriptor]

'defaultContinueTarget' @ [273:17] ==> public final var defaultContinueTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'continueTargets' @ [276:17] ==> public final var continueTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'targetLabel' @ [276:33] ==> val targetLabel: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.visitContinue[LocalVariableDescriptor]

'defaultBreakTarget' @ [286:41] ==> public final var defaultBreakTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'defaultContinueTarget' @ [287:44] ==> public final var defaultContinueTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'component1' @ [288:18] ==> public final operator fun component1(): JsStatement? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [288:34] ==> public final operator fun component2(): JsStatement? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'if (label != null) {
                Pair(breakTargets[label], continueTargets[label])
            }
            else {
                Pair(null, null)
            }' @ [288:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Pair<JsStatement?, JsStatement?>, elseBranch: Pair<JsStatement?, JsStatement?>): Pair<JsStatement?, JsStatement?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Pair<JsStatement?, JsStatement?>

'label' @ [288:59] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'Pair' @ [289:17] ==> public constructor Pair<out A, out B>(first: JsStatement?, second: JsStatement?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsStatement?
    <out B> -> JsStatement?

'breakTargets' @ [289:22] ==> public final var breakTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'label' @ [289:35] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'continueTargets' @ [289:43] ==> public final var continueTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'label' @ [289:59] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'Pair' @ [292:17] ==> public constructor Pair<out A, out B>(first: Nothing?, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Nothing?
    <out B> -> Nothing?

'defaultBreakTarget' @ [295:13] ==> public final var defaultBreakTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'breakTargetStatement' @ [295:34] ==> value-parameter breakTargetStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'label' @ [296:17] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'breakTargets' @ [297:17] ==> public final var breakTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'label' @ [297:30] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'breakTargetStatement' @ [297:39] ==> value-parameter breakTargetStatement: JsStatement defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'continueTargets' @ [298:17] ==> public final var continueTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'label' @ [298:33] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'continueTargetStatement' @ [298:42] ==> value-parameter continueTargetStatement: JsStatement? = ... defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'continueTargetStatement' @ [300:17] ==> value-parameter continueTargetStatement: JsStatement? = ... defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'defaultContinueTarget' @ [301:17] ==> public final var defaultContinueTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'continueTargetStatement' @ [301:41] ==> value-parameter continueTargetStatement: JsStatement? = ... defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'invoke' @ [304:13] ==> public abstract operator fun invoke(): Unit defined in kotlin.Function0[FunctionInvokeDescriptor]

'defaultBreakTarget' @ [306:13] ==> public final var defaultBreakTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'oldDefaultBreakTarget' @ [306:34] ==> val oldDefaultBreakTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[LocalVariableDescriptor]

'defaultContinueTarget' @ [307:13] ==> public final var defaultContinueTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'oldDefaultContinueTarget' @ [307:37] ==> val oldDefaultContinueTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[LocalVariableDescriptor]

'label' @ [308:17] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'breakTargets' @ [309:17] ==> public final var breakTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'label' @ [309:30] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'oldBreakTarget' @ [309:39] ==> val oldBreakTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[LocalVariableDescriptor]

'continueTargets' @ [310:17] ==> public final var continueTargets: MutableMap<JsName, JsStatement?> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>[PropertyDescriptorImpl]

'label' @ [310:33] ==> value-parameter label: JsName? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[ValueParameterDescriptorImpl]

'oldContinueTarget' @ [310:42] ==> val oldContinueTarget: JsStatement? defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets.<no name provided>.withBreakAndContinue[LocalVariableDescriptor]

'targets' @ [315:12] ==> val targets: MutableMap<JsContinue, JsStatement> defined in org.jetbrains.kotlin.js.inline.util.collectBreakContinueTargets[LocalVariableDescriptor]

