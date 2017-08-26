'with' @ [33:13] ==> @InlineOnly public inline fun <T, R> with(receiver: UnusedInstanceCollector, block: UnusedInstanceCollector.() -> List<JsStatement>): List<JsStatement> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> UnusedInstanceCollector
    <R> -> List<JsStatement>

'UnusedInstanceCollector' @ [33:18] ==> public constructor UnusedInstanceCollector() defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[ClassConstructorDescriptorImpl]

'accept' @ [34:17] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'root' @ [34:24] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedLocalFunctionDeclarations[ValueParameterDescriptorImpl]

'removableDeclarations' @ [35:17] ==> public final val removableDeclarations: List<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[PropertyDescriptorImpl]

'NodeRemover' @ [38:5] ==> public constructor NodeRemover<T>(klass: Class<JsStatement>, predicate: (JsStatement) -> Boolean) defined in org.jetbrains.kotlin.js.inline.clean.NodeRemover[ClassConstructorDescriptorImpl]
Inferred types:
    <T> -> JsStatement

'java' @ [38:36] ==> public val <T> KClass<JsStatement>.java: Class<JsStatement> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> JsStatement

'it' @ [39:9] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedLocalFunctionDeclarations.<anonymous>[ValueParameterDescriptorImpl]

'removable' @ [39:15] ==> val removable: List<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedLocalFunctionDeclarations[LocalVariableDescriptor]

'accept' @ [40:7] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsNode..JsNode?)): (JsNode..JsNode?) defined in org.jetbrains.kotlin.js.inline.clean.NodeRemover[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsNode

'root' @ [40:14] ==> value-parameter root: JsNode defined in org.jetbrains.kotlin.js.inline.clean.removeUnusedLocalFunctionDeclarations[ValueParameterDescriptorImpl]

'JsVisitorWithContextImpl' @ [43:41] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'ReferenceTracker' @ [44:27] ==> public constructor ReferenceTracker<in Reference, RemoveCandidate : JsNode>() defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[ClassConstructorDescriptorImpl]
Inferred types:
    <in Reference> -> JsName
    <RemoveCandidate : JsNode> -> JsStatement

'tracker' @ [47:17] ==> private final val tracker: ReferenceTracker<JsName, JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[PropertyDescriptorImpl]

'removable' @ [47:25] ==> public final val removable: List<JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[PropertyDescriptorImpl]

'!' @ [50:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocalFunctionDeclaration' @ [50:14] ==> private final fun isLocalFunctionDeclaration(jsVar: JsVars.JsVar): Boolean defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[SimpleFunctionDescriptorImpl]

'x' @ [50:41] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[ValueParameterDescriptorImpl]

'super' @ [50:52] ==> <this> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[LazyClassReceiverParameterDescriptor]

'visit' @ [50:58] ==> public open fun visit(@NotNull p0: JsVars.JsVar, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [50:64] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[ValueParameterDescriptorImpl]

'ctx' @ [50:67] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[ValueParameterDescriptorImpl]

'x' @ [52:20] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[ValueParameterDescriptorImpl]

'name' @ [52:22] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'lastStatementLevelContext' @ [53:32] ==> protected/*protected and package*/ for synthetic extension final val UnusedInstanceCollector.lastStatementLevelContext: JsContext<(JsStatement..JsStatement?)>[MyPropertyDescriptor]

'statementContext' @ [54:32] ==> val statementContext: JsContext<(JsStatement..JsStatement?)> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'currentNode' @ [54:49] ==> public final val <T : (JsNode..JsNode?)> JsContext<(JsStatement..JsStatement?)>.currentNode: JsStatement?[MyPropertyDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> (org.jetbrains.kotlin.js.backend.ast.JsStatement..org.jetbrains.kotlin.js.backend.ast.JsStatement?)

'tracker' @ [55:9] ==> private final val tracker: ReferenceTracker<JsName, JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[PropertyDescriptorImpl]

'addCandidateForRemoval' @ [55:17] ==> public final fun addCandidateForRemoval(reference: JsName, candidate: JsStatement): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'name' @ [55:40] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'currentStatement' @ [55:46] ==> val currentStatement: JsStatement? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'collectUsedNames' @ [57:26] ==> public fun collectUsedNames(scope: JsNode): Set<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]

'x' @ [57:43] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[ValueParameterDescriptorImpl]

'references' @ [58:9] ==> val references: Set<JsName> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'forEach' @ [58:20] ==> @HidesMembers public inline fun <T> Iterable<JsName>.forEach(action: (JsName) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'tracker' @ [58:30] ==> private final val tracker: ReferenceTracker<JsName, JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[PropertyDescriptorImpl]

'addRemovableReference' @ [58:38] ==> public final fun addRemovableReference(referrer: JsName, referenced: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'name' @ [58:60] ==> val name: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'it' @ [58:66] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit.<anonymous>[ValueParameterDescriptorImpl]

'x' @ [64:29] ==> value-parameter x: JsNameRef defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[ValueParameterDescriptorImpl]

'q' @ [65:16] ==> var q: JsNameRef? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'q' @ [66:13] ==> var q: JsNameRef? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'name' @ [66:15] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'let' @ [66:21] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Unit

'tracker' @ [66:27] ==> private final val tracker: ReferenceTracker<JsName, JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[PropertyDescriptorImpl]

'markReachable' @ [66:35] ==> public final fun markReachable(reference: JsName): Unit defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'it' @ [66:49] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit.<anonymous>[ValueParameterDescriptorImpl]

'q' @ [67:13] ==> var q: JsNameRef? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'q' @ [67:17] ==> var q: JsNameRef? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.visit[LocalVariableDescriptor]

'qualifier' @ [67:19] ==> public final var JsNameRef.qualifier: JsExpression?[MyPropertyDescriptor]

'jsVar' @ [73:20] ==> value-parameter jsVar: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[ValueParameterDescriptorImpl]

'name' @ [73:26] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'jsVar' @ [74:20] ==> value-parameter jsVar: JsVars.JsVar defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[ValueParameterDescriptorImpl]

'initExpression' @ [74:26] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'expr' @ [79:13] ==> val expr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'expr' @ [79:35] ==> val expr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'name' @ [79:40] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'let' @ [79:46] ==> @InlineOnly public inline fun <T, R> JsName.let(block: (JsName) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName
    <R> -> Boolean

'tracker' @ [79:52] ==> private final val tracker: ReferenceTracker<JsName, JsStatement> defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector[PropertyDescriptorImpl]

'isReferenceToRemovableCandidate' @ [79:60] ==> public final fun isReferenceToRemovableCandidate(ref: JsName): Boolean defined in org.jetbrains.kotlin.js.inline.clean.ReferenceTracker[SimpleFunctionDescriptorImpl]

'it' @ [79:92] ==> value-parameter it: JsName defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [81:25] ==> val name: (JsName..JsName?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'staticRef' @ [81:31] ==> public var JsName.staticRef: JsNode? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'staticRef' @ [82:16] ==> val staticRef: JsNode? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'staticRef' @ [82:37] ==> val staticRef: JsNode? defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'expr' @ [82:50] ==> val expr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'isFunctionReference' @ [82:58] ==> private fun isFunctionReference(expr: JsExpression): Boolean defined in org.jetbrains.kotlin.js.inline.clean in file removeUnusedLocalFunctionDeclarations.kt[SimpleFunctionDescriptorImpl]

'expr' @ [82:78] ==> val expr: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.inline.clean.UnusedInstanceCollector.isLocalFunctionDeclaration[LocalVariableDescriptor]

'when (expr) {
        // `var tmp = foo(closure)`, where `foo` is a closure constructor.
        is JsInvocation -> expr.qualifier

        // Either alias to another variable that holds function or a lambda without closure.
        is JsNameRef -> expr

        else -> null
    }' @ [88:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?, entry2: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'expr' @ [88:27] ==> value-parameter expr: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.isFunctionReference[ValueParameterDescriptorImpl]

'expr' @ [90:28] ==> value-parameter expr: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.isFunctionReference[ValueParameterDescriptorImpl]

'qualifier' @ [90:33] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'expr' @ [93:25] ==> value-parameter expr: JsExpression defined in org.jetbrains.kotlin.js.inline.clean.isFunctionReference[ValueParameterDescriptorImpl]

'qualifier' @ [98:12] ==> val qualifier: JsExpression? defined in org.jetbrains.kotlin.js.inline.clean.isFunctionReference[LocalVariableDescriptor]

'transitiveStaticRef' @ [98:23] ==> public val JsExpression.transitiveStaticRef: JsExpression defined in org.jetbrains.kotlin.js.inline.util in file invocationUtils.kt[PropertyDescriptorImpl]

