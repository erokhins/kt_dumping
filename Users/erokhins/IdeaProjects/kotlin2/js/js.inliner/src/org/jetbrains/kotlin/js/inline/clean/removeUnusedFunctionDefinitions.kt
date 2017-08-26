'with' @ [33:21] ==> @InlineOnly public inline fun <T, R> with(receiver: UnusedLocalFunctionsCollector, block: UnusedLocalFunctionsCollector.() -> List<JsFunction>): List<JsFunction> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnusedLocalFunctionsCollector
    <R> -> List<JsFunction>

'UnusedLocalFunctionsCollector' @ [33:26] ==> public constructor UnusedLocalFunctionsCollector(functions: Map<JsName, JsFunction>) defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[ClassConstructorDescriptorImpl]

'functions' @ [33:56] ==> value-parameter functions: Map<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions[ValueParameterDescriptorImpl]

'process' @ [34:9] ==> public final fun process(): Unit defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[SimpleFunctionDescriptorImpl]

'roots' @ [35:9] ==> value-parameter roots: List<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions[ValueParameterDescriptorImpl]

'forEach' @ [35:15] ==> @HidesMembers public inline fun <T> Iterable<JsNode>.forEach(action: (JsNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'accept' @ [35:25] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'it' @ [35:32] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'removableFunctions' @ [36:9] ==> public final val removableFunctions: List<JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'toSet' @ [37:7] ==> public fun <T> Iterable<JsFunction>.toSet(): Set<JsFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsFunction

'NodeRemover' @ [39:19] ==> public constructor NodeRemover<T>(klass: Class<JsStatement>, predicate: (JsStatement) -> Boolean) defined in org.jetbrains.kotlin.js.inline.clean.NodeRemover[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> JsStatement

'java' @ [39:50] ==> public val <T> KClass<JsStatement>.java: Class<JsStatement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JsStatement

'when (statement) {
            is JsExpressionStatement -> statement.expression
            is JsVars -> if (statement.vars.size == 1) statement.vars[0].initExpression else null
            else -> null
        }' @ [40:26] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?, entry2: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'statement' @ [40:32] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'statement' @ [41:41] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'expression' @ [41:51] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'if (statement.vars.size == 1) statement.vars[0].initExpression else null' @ [42:26] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'statement' @ [42:30] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [42:40] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'size' @ [42:45] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'statement' @ [42:56] ==> value-parameter statement: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'vars' @ [42:66] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'initExpression' @ [42:74] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'expression' @ [45:9] ==> val expression: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[LocalVariableDescriptor]

'expression' @ [45:37] ==> val expression: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[LocalVariableDescriptor]

'removable' @ [45:51] ==> val removable: Set<JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions[LocalVariableDescriptor]

'roots' @ [48:5] ==> value-parameter roots: List<JsNode> defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions[ValueParameterDescriptorImpl]

'forEach' @ [48:11] ==> @HidesMembers public inline fun <T> Iterable<JsNode>.forEach(action: (JsNode) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsNode

'remover' @ [48:21] ==> val remover: NodeRemover<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions[LocalVariableDescriptor]

'accept' @ [48:29] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.clean.NodeRemover[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'it' @ [48:36] ==> value-parameter it: JsNode defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedFunctionDefinitions.<anonymous>[ValueParameterDescriptorImpl]

'JsVisitorWithContextImpl' @ [51:95] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'ReferenceTracker' @ [52:27] ==> public constructor ReferenceTracker<in Reference, RemoveCandidate : JsNode>() defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[ClassConstructorDescriptorImpl]
Inferred types:
    <in Reference> -> JsName
    <RemoveCandidate : JsNode> -> JsFunction

'IdentitySet' @ [53:29] ==> public fun <T> IdentitySet(): MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsFunction

'tracker' @ [56:17] ==> private final val tracker: ReferenceTracker<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'removable' @ [56:25] ==> public final val removable: List<JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'functions' @ [59:9] ==> private final val functions: Map<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'filter' @ [59:19] ==> public inline fun <K, V> Map<out JsName, JsFunction>.filter(predicate: (Map.Entry<JsName, JsFunction>) -> Boolean): Map<JsName, JsFunction> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsFunction

'it' @ [59:28] ==> value-parameter it: Map.Entry<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [59:31] ==> public abstract val value: JsFunction defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'isLocal' @ [59:37] ==> public var JsFunction.isLocal: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'forEach' @ [60:19] ==> @HidesMembers public inline fun <K, V> Map<out JsName, JsFunction>.forEach(action: (Map.Entry<JsName, JsFunction>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsFunction

'tracker' @ [60:29] ==> private final val tracker: ReferenceTracker<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'addCandidateForRemoval' @ [60:37] ==> public final fun addCandidateForRemoval(reference: JsName, candidate: JsFunction): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'it' @ [60:60] ==> value-parameter it: Map.Entry<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process.<anonymous>[ValueParameterDescriptorImpl]

'key' @ [60:63] ==> public abstract val key: JsName defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'it' @ [60:68] ==> value-parameter it: Map.Entry<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [60:71] ==> public abstract val value: JsFunction defined in kotlin.collections.Map.Entry[DeserializedPropertyDescriptor]

'component1' @ [62:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<JsName, JsFunction>.component1(): JsName defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsFunction

'component2' @ [62:21] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<JsName, JsFunction>.component2(): JsFunction defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsName
    <V> -> JsFunction

'functions' @ [62:34] ==> private final val functions: Map<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'if (function.isLocal) {
                processLocalFunction(name, function)
            } else {
                processNonLocalFunction(function)
            }' @ [63:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'function' @ [63:17] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process[LocalVariableDescriptor]

'isLocal' @ [63:26] ==> public var JsFunction.isLocal: Boolean defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'processLocalFunction' @ [64:17] ==> private final fun processLocalFunction(name: JsName, function: JsFunction): Unit defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[SimpleFunctionDescriptorImpl]

'name' @ [64:38] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process[LocalVariableDescriptor]

'function' @ [64:44] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process[LocalVariableDescriptor]

'processNonLocalFunction' @ [66:17] ==> private final fun processNonLocalFunction(function: JsFunction): Unit defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[SimpleFunctionDescriptorImpl]

'function' @ [66:41] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process[LocalVariableDescriptor]

'processed' @ [69:13] ==> private final val processed: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'add' @ [69:23] ==> public abstract fun add(element: JsFunction): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'function' @ [69:27] ==> val function: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.process[LocalVariableDescriptor]

'x' @ [74:21] ==> value-parameter x: JsPropertyInitializer defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.visit[ValueParameterDescriptorImpl]

'valueExpr' @ [74:23] ==> public final val JsPropertyInitializer.valueExpr: JsExpression[MyPropertyDescriptor]

'when (value) {
            is JsFunction -> !wasProcessed(value)
            else -> super.visit(x, ctx)
        }' @ [76:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'value' @ [76:22] ==> val value: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.visit[LocalVariableDescriptor]

'!' @ [77:30] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'wasProcessed' @ [77:31] ==> private final fun wasProcessed(function: JsFunction?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[SimpleFunctionDescriptorImpl]

'value' @ [77:44] ==> val value: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.visit[LocalVariableDescriptor]

'super' @ [78:21] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[LazyClassReceiverParameterDescriptor]

'visit' @ [78:27] ==> public open fun visit(@NotNull p0: JsPropertyInitializer, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [78:33] ==> value-parameter x: JsPropertyInitializer defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.visit[ValueParameterDescriptorImpl]

'ctx' @ [78:36] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.visit[ValueParameterDescriptorImpl]

'!' @ [83:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'wasProcessed' @ [83:18] ==> private final fun wasProcessed(function: JsFunction?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[SimpleFunctionDescriptorImpl]

'x' @ [83:31] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.visit[ValueParameterDescriptorImpl]

'processed' @ [87:9] ==> private final val processed: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'add' @ [87:19] ==> public abstract fun add(element: JsFunction): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'x' @ [87:23] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.endVisit[ValueParameterDescriptorImpl]

'x' @ [91:20] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.endVisit[ValueParameterDescriptorImpl]

'name' @ [91:22] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'isFunctionReference' @ [92:13] ==> private final fun isFunctionReference(nameRef: HasName?): Boolean defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[SimpleFunctionDescriptorImpl]

'x' @ [92:33] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.endVisit[ValueParameterDescriptorImpl]

'name' @ [92:39] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.endVisit[LocalVariableDescriptor]

'tracker' @ [93:13] ==> private final val tracker: ReferenceTracker<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'markReachable' @ [93:21] ==> public final fun markReachable(reference: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'name' @ [93:35] ==> val name: JsName? defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.endVisit[LocalVariableDescriptor]

'collectFunctionReferencesInside' @ [98:28] ==> public fun collectFunctionReferencesInside(scope: JsNode): List<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'function' @ [98:60] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.processLocalFunction[ValueParameterDescriptorImpl]

'tracker' @ [99:13] ==> private final val tracker: ReferenceTracker<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'addRemovableReference' @ [99:21] ==> public final fun addRemovableReference(referrer: JsName, referenced: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'name' @ [99:43] ==> value-parameter name: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.processLocalFunction[ValueParameterDescriptorImpl]

'referenced' @ [99:49] ==> val referenced: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.processLocalFunction[LocalVariableDescriptor]

'collectFunctionReferencesInside' @ [104:28] ==> public fun collectFunctionReferencesInside(scope: JsNode): List<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'function' @ [104:60] ==> value-parameter function: JsFunction defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.processNonLocalFunction[ValueParameterDescriptorImpl]

'tracker' @ [105:13] ==> private final val tracker: ReferenceTracker<JsName, JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

'markReachable' @ [105:21] ==> public final fun markReachable(reference: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'referenced' @ [105:35] ==> val referenced: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.processNonLocalFunction[LocalVariableDescriptor]

'nameRef' @ [110:16] ==> value-parameter nameRef: HasName? defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.isFunctionReference[ValueParameterDescriptorImpl]

'name' @ [110:25] ==> public final var HasName.name: (JsName..JsName?)[MyPropertyDescriptor]

'staticRef' @ [110:31] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'function' @ [113:64] ==> value-parameter function: JsFunction? defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.wasProcessed[ValueParameterDescriptorImpl]

'function' @ [113:84] ==> value-parameter function: JsFunction? defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector.wasProcessed[ValueParameterDescriptorImpl]

'processed' @ [113:96] ==> private final val processed: MutableSet<JsFunction> defined in org.jetbrains.kotlin.js.inline.clean.UnusedLocalFunctionsCollector[PropertyDescriptorImpl]

