'mutableMapOf' @ [27:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> Int

'mutableMapOf' @ [34:26] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, TemporaryAssignmentElimination.Usage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> Usage

'mutableSetOf' @ [35:38] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsStatement> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'mutableMapOf' @ [36:34] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsName, TemporaryAssignmentElimination.UsageSequence?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> UsageSequence?

'mutableSetOf' @ [37:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'mutableSetOf' @ [39:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'analyze' @ [42:9] ==> private final fun analyze(): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'calculateDeclarations' @ [43:9] ==> private final fun calculateDeclarations(): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'process' @ [44:9] ==> private final fun process(): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'generateDeclarations' @ [45:9] ==> private final fun generateDeclarations(): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'hasChanges' @ [46:16] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'namesToProcess' @ [50:9] ==> private final val namesToProcess: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'addAll' @ [50:24] ==> public abstract fun addAll(elements: Collection<JsName>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'collectDefinedNames' @ [50:31] ==> public fun collectDefinedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'root' @ [50:51] ==> private final val root: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'RecursiveJsVisitor' @ [52:18] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'x' @ [54:34] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'expression' @ [54:36] ==> public final var JsReturn.expression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'returnExpr' @ [55:21] ==> val returnExpr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitReturn[LocalVariableDescriptor]

'tryRecord' @ [56:21] ==> private final fun tryRecord(expr: JsExpression, usage: TemporaryAssignmentElimination.Usage): Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'returnExpr' @ [56:31] ==> val returnExpr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitReturn[LocalVariableDescriptor]

'Return' @ [56:49] ==> public constructor Return(statement: JsStatement) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.Return[ClassConstructorDescriptorImpl]

'x' @ [56:56] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'super' @ [58:17] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitReturn' @ [58:23] ==> public open fun visitReturn(x: JsReturn): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [58:35] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitReturn[ValueParameterDescriptorImpl]

'decomposeAssignmentToVariable' @ [62:53] ==> @Nullable public open fun decomposeAssignmentToVariable(@NotNull expr: JsExpression): Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [62:83] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [62:85] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'variableAssignment' @ [63:21] ==> val variableAssignment: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'component1' @ [64:26] ==> public final operator fun component1(): (JsName..JsName?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [64:32] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'variableAssignment' @ [64:41] ==> val variableAssignment: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'VariableAssignment' @ [65:39] ==> public constructor VariableAssignment(statement: JsStatement, target: JsName) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableAssignment[ClassConstructorDescriptorImpl]

'x' @ [65:58] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'name' @ [65:61] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'x' @ [66:25] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'synthetic' @ [66:27] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'syntheticNames' @ [67:25] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'name' @ [67:43] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'tryRecord' @ [69:21] ==> private final fun tryRecord(expr: JsExpression, usage: TemporaryAssignmentElimination.Usage): Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'value' @ [69:31] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'usage' @ [69:38] ==> val usage: TemporaryAssignmentElimination.Usage.VariableAssignment defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'accept' @ [70:21] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'value' @ [70:28] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'decomposeAssignment' @ [75:51] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [75:71] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [75:73] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'propertyMutation' @ [76:21] ==> val propertyMutation: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'component1' @ [77:26] ==> public final operator fun component1(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [77:34] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'propertyMutation' @ [77:43] ==> val propertyMutation: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'!' @ [78:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'target' @ [78:26] ==> val target: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'canHaveSideEffect' @ [78:33] ==> public fun JsExpression.canHaveSideEffect(localVars: Set<JsName>): Boolean defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'namesToProcess' @ [78:51] ==> private final val namesToProcess: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'PropertyMutation' @ [79:43] ==> public constructor PropertyMutation(statement: JsStatement, target: JsExpression) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.PropertyMutation[ClassConstructorDescriptorImpl]

'x' @ [79:60] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'target' @ [79:63] ==> val target: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'tryRecord' @ [80:25] ==> private final fun tryRecord(expr: JsExpression, usage: TemporaryAssignmentElimination.Usage): Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'value' @ [80:35] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'usage' @ [80:42] ==> val usage: TemporaryAssignmentElimination.Usage.PropertyMutation defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'accept' @ [81:25] ==> public open fun <T : JsNode?> accept(node: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'value' @ [81:32] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'super' @ [86:24] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpressionStatement' @ [86:30] ==> public open fun visitExpressionStatement(x: JsExpressionStatement): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [86:55] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'x' @ [91:21] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'vars' @ [91:23] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'size' @ [91:28] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'x' @ [92:39] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'vars' @ [92:41] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'declaration' @ [93:42] ==> val declaration: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[LocalVariableDescriptor]

'initExpression' @ [93:54] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'initExpression' @ [94:25] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[LocalVariableDescriptor]

'tryRecord' @ [95:25] ==> private final fun tryRecord(expr: JsExpression, usage: TemporaryAssignmentElimination.Usage): Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'initExpression' @ [95:35] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[LocalVariableDescriptor]

'VariableDeclaration' @ [95:57] ==> public constructor VariableDeclaration(statement: JsStatement, target: JsName) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[ClassConstructorDescriptorImpl]

'x' @ [95:77] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'declaration' @ [95:80] ==> val declaration: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[LocalVariableDescriptor]

'name' @ [95:92] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'x' @ [98:25] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'synthetic' @ [98:27] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'syntheticNames' @ [99:25] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'declaration' @ [99:43] ==> val declaration: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[LocalVariableDescriptor]

'name' @ [99:55] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'x' @ [103:17] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars[ValueParameterDescriptorImpl]

'vars' @ [103:19] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'forEach' @ [103:24] ==> @HidesMembers public inline fun <T> Iterable<(JsVars.JsVar..JsVars.JsVar?)>.forEach(action: ((JsVars.JsVar..JsVars.JsVar?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'v' @ [103:39] ==> value-parameter v: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars.<anonymous>[ValueParameterDescriptorImpl]

'initExpression' @ [103:42] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [103:58] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'accept' @ [103:64] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'it' @ [103:71] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitVars.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'nameRef' @ [107:28] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'name' @ [107:36] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [108:21] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitNameRef[LocalVariableDescriptor]

'nameRef' @ [108:37] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'qualifier' @ [108:45] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'use' @ [109:21] ==> private final fun use(name: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'name' @ [109:25] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitNameRef[LocalVariableDescriptor]

'super' @ [112:24] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitNameRef' @ [112:30] ==> public open fun visitNameRef(nameRef: JsNameRef): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'nameRef' @ [112:43] ==> value-parameter nameRef: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitNameRef[ValueParameterDescriptorImpl]

'x' @ [118:17] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFunction[ValueParameterDescriptorImpl]

'collectFreeVariables' @ [118:19] ==> public fun JsFunction.collectFreeVariables(): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'forEach' @ [118:42] ==> @HidesMembers public inline fun <T> Iterable<JsName>.forEach(action: (JsName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'use' @ [118:52] ==> private final fun use(name: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'it' @ [118:56] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'use' @ [118:61] ==> private final fun use(name: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'it' @ [118:65] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFunction.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [126:17] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'initVars' @ [126:19] ==> public final val JsFor.initVars: (JsVars..JsVars?)[MyPropertyDescriptor]

'let' @ [126:29] ==> @InlineOnly public inline fun <T, R> JsVars.let(block: (JsVars) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsVars
    <R> -> Unit

'it' @ [126:35] ==> value-parameter it: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [126:38] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'forEach' @ [126:43] ==> @HidesMembers public inline fun <T> Iterable<(JsVars.JsVar..JsVars.JsVar?)>.forEach(action: ((JsVars.JsVar..JsVars.JsVar?)) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar..org.jetbrains.kotlin.js.backend.ast.JsVars.JsVar?)

'it' @ [126:53] ==> value-parameter it: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'initExpression' @ [126:56] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [126:72] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'accept' @ [126:78] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'it' @ [126:85] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [127:17] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'initExpression' @ [127:19] ==> public final val JsFor.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [127:35] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'accept' @ [127:41] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'it' @ [127:48] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [128:17] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'condition' @ [128:19] ==> public final val JsFor.condition: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [128:30] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'accept' @ [128:36] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'it' @ [128:43] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [129:17] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'body' @ [129:19] ==> public final var JsFor.body: (JsStatement..JsStatement?)[MyPropertyDescriptor]

'let' @ [129:25] ==> @InlineOnly public inline fun <T, R> JsStatement.let(block: (JsStatement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement
    <R> -> Unit

'accept' @ [129:31] ==> public open fun <T : JsNode?> accept(node: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsStatement

'it' @ [129:38] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [130:17] ==> value-parameter x: JsFor defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor[ValueParameterDescriptorImpl]

'incrementExpression' @ [130:19] ==> public final val JsFor.incrementExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'let' @ [130:40] ==> @InlineOnly public inline fun <T, R> JsExpression.let(block: (JsExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsExpression
    <R> -> Unit

'accept' @ [130:46] ==> public open fun <T : JsNode?> accept(node: JsExpression): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsExpression

'it' @ [130:53] ==> value-parameter it: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>.visitFor.<anonymous>[ValueParameterDescriptorImpl]

'accept' @ [132:11] ==> public open fun <T : JsNode?> accept(node: JsBlock): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.analyze.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsBlock

'root' @ [132:18] ==> private final val root: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'usages' @ [134:9] ==> private final val usages: MutableMap<JsName, TemporaryAssignmentElimination.Usage> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'keys' @ [134:16] ==> public abstract val keys: MutableSet<JsName> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'retainAll' @ [134:21] ==> public abstract fun retainAll(elements: Collection<JsName>): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'syntheticNames' @ [134:31] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'usageSequences' @ [138:16] ==> private final val usageSequences: MutableMap<JsName, TemporaryAssignmentElimination.UsageSequence?> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'getOrPut' @ [138:31] ==> public inline fun <K, V> MutableMap<JsName, TemporaryAssignmentElimination.UsageSequence?>.getOrPut(key: JsName, defaultValue: () -> TemporaryAssignmentElimination.UsageSequence?): TemporaryAssignmentElimination.UsageSequence? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> UsageSequence?

'name' @ [138:40] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence[ValueParameterDescriptorImpl]

'referenceCount' @ [139:17] ==> private final val referenceCount: MutableMap<JsName, Int> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'name' @ [139:32] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence[ValueParameterDescriptorImpl]

'usages' @ [141:25] ==> private final val usages: MutableMap<JsName, TemporaryAssignmentElimination.Usage> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'name' @ [141:32] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence[ValueParameterDescriptorImpl]

'when (usage) {
                is Usage.VariableAssignment -> UsageSequence(usage, getUsageSequence(usage.target))
                is Usage.VariableDeclaration -> UsageSequence(usage, getUsageSequence(usage.target))
                null -> null
                else -> UsageSequence(usage, null)
            }' @ [142:47] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TemporaryAssignmentElimination.UsageSequence?, entry1: TemporaryAssignmentElimination.UsageSequence?, entry2: TemporaryAssignmentElimination.UsageSequence?, entry3: TemporaryAssignmentElimination.UsageSequence?): TemporaryAssignmentElimination.UsageSequence?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UsageSequence?

'usage' @ [142:53] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'UsageSequence' @ [143:48] ==> public constructor UsageSequence(value: TemporaryAssignmentElimination.Usage, next: TemporaryAssignmentElimination.UsageSequence?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[ClassConstructorDescriptorImpl]

'usage' @ [143:62] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'getUsageSequence' @ [143:69] ==> private final fun getUsageSequence(name: JsName): TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'usage' @ [143:86] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'target' @ [143:92] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableAssignment[PropertyDescriptorImpl]

'UsageSequence' @ [144:49] ==> public constructor UsageSequence(value: TemporaryAssignmentElimination.Usage, next: TemporaryAssignmentElimination.UsageSequence?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[ClassConstructorDescriptorImpl]

'usage' @ [144:63] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'getUsageSequence' @ [144:70] ==> private final fun getUsageSequence(name: JsName): TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'usage' @ [144:87] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'target' @ [144:93] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'UsageSequence' @ [146:25] ==> public constructor UsageSequence(value: TemporaryAssignmentElimination.Usage, next: TemporaryAssignmentElimination.UsageSequence?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[ClassConstructorDescriptorImpl]

'usage' @ [146:39] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'mappedUsage' @ [149:13] ==> val mappedUsage: TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.getUsageSequence.<anonymous>[LocalVariableDescriptor]

'usages' @ [154:9] ==> private final val usages: MutableMap<JsName, TemporaryAssignmentElimination.Usage> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'keys' @ [154:16] ==> public abstract val keys: MutableSet<JsName> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'forEach' @ [154:21] ==> @HidesMembers public inline fun <T> Iterable<JsName>.forEach(action: (JsName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'getUsageSequence' @ [154:31] ==> private final fun getUsageSequence(name: JsName): TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'it' @ [154:48] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'RecursiveJsVisitor' @ [156:18] ==> public constructor RecursiveJsVisitor() defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[JavaClassConstructorDescriptor]

'decomposeAssignmentToVariable' @ [158:45] ==> @Nullable public open fun decomposeAssignmentToVariable(@NotNull expr: JsExpression): Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [158:75] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'expression' @ [158:77] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'assignment' @ [159:21] ==> val assignment: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'getUsageSequence' @ [160:33] ==> private final fun getUsageSequence(name: JsName): TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'assignment' @ [160:50] ==> val assignment: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'first' @ [160:61] ==> public final val first: (JsName..JsName?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'lastUsage' @ [160:69] ==> public final fun lastUsage(): TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[SimpleFunctionDescriptorImpl]

'usage' @ [161:25] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'usage' @ [162:25] ==> val usage: TemporaryAssignmentElimination.Usage? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>.visitExpressionStatement[LocalVariableDescriptor]

'count' @ [162:31] ==> public final var count: Int defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'super' @ [165:17] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>[LazyClassReceiverParameterDescriptor]

'visitExpressionStatement' @ [165:23] ==> public open fun visitExpressionStatement(x: JsExpressionStatement): Unit defined in org.jetbrains.kotlin.js.backend.ast.RecursiveJsVisitor[DeserializedSimpleFunctionDescriptor]

'x' @ [165:48] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>.visitExpressionStatement[ValueParameterDescriptorImpl]

'accept' @ [167:11] ==> public open fun <T : JsNode?> accept(node: JsBlock): Unit defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.calculateDeclarations.<no name provided>[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : JsNode?> -> JsBlock

'root' @ [167:18] ==> private final val root: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'JsVisitorWithContextImpl' @ [171:18] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'x' @ [173:21] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'statementsToRemove' @ [173:26] ==> private final val statementsToRemove: MutableSet<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'hasChanges' @ [174:21] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'ctx' @ [175:21] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'removeMe' @ [175:25] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'decomposeAssignmentToVariable' @ [179:45] ==> @Nullable public open fun decomposeAssignmentToVariable(@NotNull expr: JsExpression): Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'x' @ [179:75] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'expression' @ [179:77] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'assignment' @ [180:21] ==> val assignment: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'component1' @ [181:26] ==> public final operator fun component1(): (JsName..JsName?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [181:32] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assignment' @ [181:41] ==> val assignment: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'getUsageSequence' @ [182:41] ==> private final fun getUsageSequence(name: JsName): TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[SimpleFunctionDescriptorImpl]

'name' @ [182:58] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'usageSequence' @ [183:25] ==> val usageSequence: TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'usageSequence' @ [184:37] ==> val usageSequence: TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'lastUsage' @ [184:51] ==> public final fun lastUsage(): TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[SimpleFunctionDescriptorImpl]

'when (usage) {
                            is Usage.Return -> JsReturn(value).apply { source(x.expression.source) }
                            is Usage.VariableAssignment -> {
                                val expr = JsAstUtils.assignment(usage.target.makeRef(), value).source(x.expression.source)
                                val statement = JsExpressionStatement(expr)
                                statement.synthetic = usage.target in syntheticNames
                                statement
                            }
                            is Usage.VariableDeclaration -> {
                                val statement: JsStatement = if (usage.count > 1) {
                                    val expr = JsAstUtils.assignment(usage.target.makeRef(), value).source(x.expression.source)
                                    val result = JsExpressionStatement(expr)
                                    result.synthetic = usage.target in syntheticNames
                                    result
                                }
                                else {
                                    val declaration = JsAstUtils.newVar(usage.target, value)
                                    declaration.source(x.expression.source)
                                    declaration.synthetic = usage.target in syntheticNames
                                    declaration
                                }
                                statement
                            }
                            is Usage.PropertyMutation -> {
                                JsExpressionStatement(JsAstUtils.assignment(usage.target, value).source(x.expression.source))
                            }
                        }' @ [185:43] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsStatement, entry1: JsStatement, entry2: JsStatement, entry3: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsStatement

'usage' @ [185:49] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'JsReturn' @ [186:48] ==> public constructor JsReturn(p0: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaClassConstructorDescriptor]

'value' @ [186:57] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'apply' @ [186:64] ==> @InlineOnly public inline fun <T> JsReturn.apply(block: JsReturn.() -> Unit): JsReturn defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsReturn

'source' @ [186:72] ==> public open fun source(p0: (Any..Any?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.backend.ast.JsReturn[JavaMethodDescriptor]

'x' @ [186:79] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'expression' @ [186:81] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'source' @ [186:92] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'assignment' @ [188:55] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'usage' @ [188:66] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [188:72] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableAssignment[PropertyDescriptorImpl]

'makeRef' @ [188:79] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'value' @ [188:90] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'source' @ [188:97] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'x' @ [188:104] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'expression' @ [188:106] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'source' @ [188:117] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'JsExpressionStatement' @ [189:49] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'expr' @ [189:71] ==> val expr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'statement' @ [190:33] ==> val statement: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [190:43] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'usage' @ [190:55] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [190:61] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableAssignment[PropertyDescriptorImpl]

'syntheticNames' @ [190:71] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'statement' @ [191:33] ==> val statement: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'if (usage.count > 1) {
                                    val expr = JsAstUtils.assignment(usage.target.makeRef(), value).source(x.expression.source)
                                    val result = JsExpressionStatement(expr)
                                    result.synthetic = usage.target in syntheticNames
                                    result
                                }
                                else {
                                    val declaration = JsAstUtils.newVar(usage.target, value)
                                    declaration.source(x.expression.source)
                                    declaration.synthetic = usage.target in syntheticNames
                                    declaration
                                }' @ [194:62] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsStatement, elseBranch: JsStatement): JsStatement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsStatement

'usage' @ [194:66] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'count' @ [194:72] ==> public final var count: Int defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'assignment' @ [195:59] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'usage' @ [195:70] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [195:76] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'makeRef' @ [195:83] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'value' @ [195:94] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'source' @ [195:101] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'x' @ [195:108] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'expression' @ [195:110] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'source' @ [195:121] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'JsExpressionStatement' @ [196:50] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'expr' @ [196:72] ==> val expr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'result' @ [197:37] ==> val result: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [197:44] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'usage' @ [197:56] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [197:62] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'syntheticNames' @ [197:72] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'result' @ [198:37] ==> val result: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'newVar' @ [201:66] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'usage' @ [201:73] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [201:79] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'value' @ [201:87] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'declaration' @ [202:37] ==> val declaration: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'source' @ [202:49] ==> public open fun source(p0: (Any..Any?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.backend.ast.JsVars[JavaMethodDescriptor]

'x' @ [202:56] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'expression' @ [202:58] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'source' @ [202:69] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'declaration' @ [203:37] ==> val declaration: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'synthetic' @ [203:49] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'usage' @ [203:61] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [203:67] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'syntheticNames' @ [203:77] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'declaration' @ [204:37] ==> val declaration: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'statement' @ [206:33] ==> val statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'JsExpressionStatement' @ [209:33] ==> public constructor JsExpressionStatement(@NotNull p0: JsExpression) defined in org.jetbrains.kotlin.js.backend.ast.JsExpressionStatement[JavaClassConstructorDescriptor]

'assignment' @ [209:66] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'usage' @ [209:77] ==> val usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'target' @ [209:83] ==> public final val target: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.PropertyMutation[PropertyDescriptorImpl]

'value' @ [209:91] ==> val value: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'source' @ [209:98] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsBinaryOperation[JavaMethodDescriptor]

'x' @ [209:105] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'expression' @ [209:107] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'source' @ [209:118] ==> public final var JsExpression.source: (Any..Any?)[MyPropertyDescriptor]

'hasChanges' @ [212:25] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'ctx' @ [213:25] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [213:29] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsStatement

'replacement' @ [213:39] ==> val replacement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'statementsToRemove' @ [214:25] ==> private final val statementsToRemove: MutableSet<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'usageSequence' @ [214:47] ==> val usageSequence: TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[LocalVariableDescriptor]

'collectStatements' @ [214:61] ==> public final fun collectStatements(): Sequence<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[SimpleFunctionDescriptorImpl]

'super' @ [218:24] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [218:30] ==> public open fun visit(@NotNull p0: JsExpressionStatement, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [218:36] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'ctx' @ [218:39] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'x' @ [222:21] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'statementsToRemove' @ [222:26] ==> private final val statementsToRemove: MutableSet<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'hasChanges' @ [223:21] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'ctx' @ [224:21] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'removeMe' @ [224:25] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'super' @ [227:24] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [227:30] ==> public open fun visit(@NotNull p0: JsReturn, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [227:36] ==> value-parameter x: JsReturn defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'ctx' @ [227:39] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'x' @ [231:21] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'statementsToRemove' @ [231:26] ==> private final val statementsToRemove: MutableSet<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'hasChanges' @ [232:21] ==> private final var hasChanges: Boolean defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'ctx' @ [233:21] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'removeMe' @ [233:25] ==> public abstract fun removeMe(): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]

'super' @ [236:24] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>[LazyClassReceiverParameterDescriptor]

'visit' @ [236:30] ==> public open fun visit(@NotNull p0: JsVars, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [236:36] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'ctx' @ [236:39] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>.visit[ValueParameterDescriptorImpl]

'accept' @ [240:11] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsBlock..JsBlock?)): (JsBlock..JsBlock?) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.process.<no name provided>[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsBlock

'root' @ [240:18] ==> private final val root: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'usages' @ [245:9] ==> private final val usages: MutableMap<JsName, TemporaryAssignmentElimination.Usage> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'values' @ [245:16] ==> public abstract val values: MutableCollection<TemporaryAssignmentElimination.Usage> defined in kotlin.collections.MutableMap[DeserializedPropertyDescriptor]

'asSequence' @ [245:23] ==> public fun <T> Iterable<TemporaryAssignmentElimination.Usage>.asSequence(): Sequence<TemporaryAssignmentElimination.Usage> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Usage

'filter' @ [246:18] ==> public fun <T> Sequence<TemporaryAssignmentElimination.Usage>.filter(predicate: (TemporaryAssignmentElimination.Usage) -> Boolean): Sequence<TemporaryAssignmentElimination.Usage> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Usage

'it' @ [246:27] ==> value-parameter it: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [246:62] ==> value-parameter it: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'count' @ [246:65] ==> public final var count: Int defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'map' @ [247:18] ==> public fun <T, R> Sequence<TemporaryAssignmentElimination.Usage>.map(transform: (TemporaryAssignmentElimination.Usage) -> TemporaryAssignmentElimination.Usage.VariableDeclaration): Sequence<TemporaryAssignmentElimination.Usage.VariableDeclaration> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Usage
    <R> -> VariableDeclaration

'it' @ [247:24] ==> value-parameter it: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'forEach' @ [248:18] ==> public inline fun <T> Sequence<TemporaryAssignmentElimination.Usage.VariableDeclaration>.forEach(action: (TemporaryAssignmentElimination.Usage.VariableDeclaration) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDeclaration

'newVar' @ [249:48] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'it' @ [249:55] ==> value-parameter it: TemporaryAssignmentElimination.Usage.VariableDeclaration defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [249:58] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'statement' @ [250:21] ==> val statement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[LocalVariableDescriptor]

'synthetic' @ [250:31] ==> public var HasMetadata.synthetic: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'it' @ [250:43] ==> value-parameter it: TemporaryAssignmentElimination.Usage.VariableDeclaration defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'target' @ [250:46] ==> public final val target: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration[PropertyDescriptorImpl]

'syntheticNames' @ [250:56] ==> private final val syntheticNames: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'root' @ [251:21] ==> private final val root: JsBlock defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'statements' @ [251:26] ==> public final val JsBlock.statements: (MutableList<(JsStatement..JsStatement?)>..List<(JsStatement..JsStatement?)>)[MyPropertyDescriptor]

'add' @ [251:37] ==> public abstract fun add(index: Int, element: (JsStatement..JsStatement?)): Unit defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'index' @ [251:41] ==> var index: Int defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations[LocalVariableDescriptor]

'statement' @ [251:50] ==> val statement: JsVars defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.generateDeclarations.<anonymous>[LocalVariableDescriptor]

'expr' @ [256:13] ==> value-parameter expr: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.tryRecord[ValueParameterDescriptorImpl]

'expr' @ [257:20] ==> value-parameter expr: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.tryRecord[ValueParameterDescriptorImpl]

'name' @ [257:25] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'name' @ [258:13] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.tryRecord[LocalVariableDescriptor]

'namesToProcess' @ [258:22] ==> private final val namesToProcess: MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'usages' @ [260:9] ==> private final val usages: MutableMap<JsName, TemporaryAssignmentElimination.Usage> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'name' @ [260:16] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.tryRecord[LocalVariableDescriptor]

'usage' @ [260:24] ==> value-parameter usage: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.tryRecord[ValueParameterDescriptorImpl]

'referenceCount' @ [265:9] ==> private final val referenceCount: MutableMap<JsName, Int> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'name' @ [265:24] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.use[ValueParameterDescriptorImpl]

'+' @ [265:32] ==> public final operator fun plus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'referenceCount' @ [265:37] ==> private final val referenceCount: MutableMap<JsName, Int> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination[PropertyDescriptorImpl]

'name' @ [265:52] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.use[ValueParameterDescriptorImpl]

'Usage' @ [269:48] ==> private constructor Usage(statement: JsStatement) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage[ClassConstructorDescriptorImpl]

'statement' @ [269:54] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.Return.<init>[ValueParameterDescriptorImpl]

'Usage' @ [271:80] ==> private constructor Usage(statement: JsStatement) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage[ClassConstructorDescriptorImpl]

'statement' @ [271:86] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableAssignment.<init>[ValueParameterDescriptorImpl]

'Usage' @ [273:81] ==> private constructor Usage(statement: JsStatement) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage[ClassConstructorDescriptorImpl]

'statement' @ [273:87] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.VariableDeclaration.<init>[ValueParameterDescriptorImpl]

'Usage' @ [277:84] ==> private constructor Usage(statement: JsStatement) defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage[ClassConstructorDescriptorImpl]

'statement' @ [277:90] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage.PropertyMutation.<init>[ValueParameterDescriptorImpl]

'generateSequence' @ [281:35] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: TemporaryAssignmentElimination.UsageSequence?, nextFunction: (TemporaryAssignmentElimination.UsageSequence) -> TemporaryAssignmentElimination.UsageSequence?): Sequence<TemporaryAssignmentElimination.UsageSequence> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> UsageSequence

'this' @ [281:52] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[LazyClassReceiverParameterDescriptor]

'it' @ [281:60] ==> value-parameter it: TemporaryAssignmentElimination.UsageSequence defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence.collectStatements.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [281:63] ==> public final val next: TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[PropertyDescriptorImpl]

'map' @ [281:70] ==> public fun <T, R> Sequence<TemporaryAssignmentElimination.UsageSequence>.map(transform: (TemporaryAssignmentElimination.UsageSequence) -> JsStatement): Sequence<JsStatement> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageSequence
    <R> -> JsStatement

'it' @ [281:76] ==> value-parameter it: TemporaryAssignmentElimination.UsageSequence defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence.collectStatements.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [281:79] ==> public final val value: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[PropertyDescriptorImpl]

'statement' @ [281:85] ==> public final val statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.Usage[PropertyDescriptorImpl]

'generateSequence' @ [283:27] ==> @LowPriorityInOverloadResolution public fun <T : Any> generateSequence(seed: TemporaryAssignmentElimination.UsageSequence?, nextFunction: (TemporaryAssignmentElimination.UsageSequence) -> TemporaryAssignmentElimination.UsageSequence?): Sequence<TemporaryAssignmentElimination.UsageSequence> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> UsageSequence

'this' @ [283:44] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[LazyClassReceiverParameterDescriptor]

'it' @ [283:52] ==> value-parameter it: TemporaryAssignmentElimination.UsageSequence defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence.lastUsage.<anonymous>[ValueParameterDescriptorImpl]

'next' @ [283:55] ==> public final val next: TemporaryAssignmentElimination.UsageSequence? defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[PropertyDescriptorImpl]

'last' @ [283:62] ==> public fun <T> Sequence<TemporaryAssignmentElimination.UsageSequence>.last(): TemporaryAssignmentElimination.UsageSequence defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UsageSequence

'value' @ [283:69] ==> public final val value: TemporaryAssignmentElimination.Usage defined in org.jetbrains.kotlin.js.inline.clean.TemporaryAssignmentElimination.UsageSequence[PropertyDescriptorImpl]

