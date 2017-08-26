'JsVisitorWithContextImpl' @ [24:32] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'mutableMapOf' @ [25:46] ==> @SinceKotlin @InlineOnly public inline fun <K, V> mutableMapOf(): MutableMap<JsNode, List<JsStatement>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> JsNode
    <V> -> List<JsStatement>

'additionalStatementsByNode' @ [28:9] ==> private final val additionalStatementsByNode: MutableMap<JsNode, List<JsStatement>> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[PropertyDescriptorImpl]

'remove' @ [28:36] ==> public abstract fun remove(key: JsNode): List<JsStatement>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'x' @ [28:43] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'forEach' @ [28:47] ==> @HidesMembers public inline fun <T> Iterable<JsStatement>.forEach(action: (JsStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'ctx' @ [28:57] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'addNext' @ [28:61] ==> public open fun <R : (JsNode..JsNode?)> addNext(p0: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsStatement)..CapturedType(in JsStatement)?)> -> JsStatement

'it' @ [28:69] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [29:9] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[LazyClassReceiverParameterDescriptor]

'endVisit' @ [29:15] ==> public open fun endVisit(@NotNull p0: JsExpressionStatement, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [29:24] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [29:27] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'x' @ [33:19] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'vars' @ [33:21] ==> public final val JsVars.vars: (MutableList<(JsVars.JsVar..JsVars.JsVar?)>..List<(JsVars.JsVar..JsVars.JsVar?)>?)[MyPropertyDescriptor]

'additionalStatementsByNode' @ [34:13] ==> private final val additionalStatementsByNode: MutableMap<JsNode, List<JsStatement>> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[PropertyDescriptorImpl]

'remove' @ [34:40] ==> public abstract fun remove(key: JsNode): List<JsStatement>? defined in kotlin.collections.MutableMap[DeserializedSimpleFunctionDescriptor]

'v' @ [34:47] ==> val v: (JsVars.JsVar..JsVars.JsVar?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[LocalVariableDescriptor]

'forEach' @ [34:51] ==> @HidesMembers public inline fun <T> Iterable<JsStatement>.forEach(action: (JsStatement) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsStatement

'ctx' @ [34:61] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'addNext' @ [34:65] ==> public open fun <R : (JsNode..JsNode?)> addNext(p0: (JsStatement..JsStatement?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (CapturedType(in JsStatement)..CapturedType(in JsStatement)?)> -> JsStatement

'it' @ [34:73] ==> value-parameter it: JsStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit.<anonymous>[ValueParameterDescriptorImpl]

'super' @ [36:9] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[LazyClassReceiverParameterDescriptor]

'endVisit' @ [36:15] ==> public open fun endVisit(@NotNull p0: JsVars, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [36:24] ==> value-parameter x: JsVars defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [36:27] ==> value-parameter ctx: JsContext<in JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.endVisit[ValueParameterDescriptorImpl]

'x' @ [40:26] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'expression' @ [40:28] ==> public final val JsExpressionStatement.expression: JsExpression[MyPropertyDescriptor]

'decomposeAssignment' @ [41:37] ==> @Nullable public open fun decomposeAssignment(@NotNull expr: JsExpression): Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'expression' @ [41:57] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'if (assignment != null) {
            val (lhs, rhs) = assignment
            val function = rhs as? JsFunction ?: InlineMetadata.decompose(rhs)?.function
            if (function?.coroutineMetadata != null) {
                val name = ((lhs as? JsNameRef)?.name ?: function.name)?.ident
                additionalStatementsByNode[x] = CoroutineFunctionTransformer(function, name).transform()
                return false
            }
        }
        else if (expression is JsFunction) {
            if (expression.coroutineMetadata != null) {
                additionalStatementsByNode[x] = CoroutineFunctionTransformer(expression, expression.name?.ident).transform()
                return false
            }
        }' @ [42:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'assignment' @ [42:13] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'component1' @ [43:18] ==> public final operator fun component1(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [43:23] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'assignment' @ [43:30] ==> val assignment: Pair<(JsExpression..JsExpression?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'rhs' @ [44:28] ==> val rhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'InlineMetadata' @ [44:50] ==> public companion object defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[FakeCallableDescriptorForObject]

'decompose' @ [44:65] ==> @JvmStatic public final fun decompose(expression: JsExpression?): InlineMetadata? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion[SimpleFunctionDescriptorImpl]

'rhs' @ [44:75] ==> val rhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'function' @ [44:81] ==> public final val function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'function' @ [45:17] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'coroutineMetadata' @ [45:27] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'?:' @ [46:29] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: JsName?, right: (JsName..JsName?)): (JsName..JsName?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> (org.jetbrains.kotlin.js.backend.ast.JsName..org.jetbrains.kotlin.js.backend.ast.JsName?)

'lhs' @ [46:30] ==> val lhs: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'name' @ [46:50] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'function' @ [46:58] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'name' @ [46:67] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'ident' @ [46:74] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'additionalStatementsByNode' @ [47:17] ==> private final val additionalStatementsByNode: MutableMap<JsNode, List<JsStatement>> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[PropertyDescriptorImpl]

'x' @ [47:44] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'CoroutineFunctionTransformer' @ [47:49] ==> public constructor CoroutineFunctionTransformer(function: JsFunction, name: String?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[ClassConstructorDescriptorImpl]

'function' @ [47:78] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'name' @ [47:88] ==> val name: String? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'transform' @ [47:94] ==> public final fun transform(): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'expression' @ [51:18] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'expression' @ [52:17] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'coroutineMetadata' @ [52:28] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'additionalStatementsByNode' @ [53:17] ==> private final val additionalStatementsByNode: MutableMap<JsNode, List<JsStatement>> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[PropertyDescriptorImpl]

'x' @ [53:44] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'CoroutineFunctionTransformer' @ [53:49] ==> public constructor CoroutineFunctionTransformer(function: JsFunction, name: String?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[ClassConstructorDescriptorImpl]

'expression' @ [53:78] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'expression' @ [53:90] ==> val expression: JsExpression defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'name' @ [53:101] ==> public final var JsFunction.name: (JsName..JsName?)[MyPropertyDescriptor]

'ident' @ [53:107] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'transform' @ [53:114] ==> public final fun transform(): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'super' @ [57:16] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[LazyClassReceiverParameterDescriptor]

'visit' @ [57:22] ==> public open fun visit(@NotNull p0: JsExpressionStatement, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [57:28] ==> value-parameter x: JsExpressionStatement defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'ctx' @ [57:31] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'x' @ [61:30] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'initExpression' @ [61:32] ==> public final var JsVars.JsVar.initExpression: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'initExpression' @ [62:13] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'initExpression' @ [63:28] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'InlineMetadata' @ [63:61] ==> public companion object defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[FakeCallableDescriptorForObject]

'decompose' @ [63:76] ==> @JvmStatic public final fun decompose(expression: JsExpression?): InlineMetadata? defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata.Companion[SimpleFunctionDescriptorImpl]

'initExpression' @ [63:86] ==> val initExpression: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'function' @ [63:103] ==> public final val function: JsFunction defined in org.jetbrains.kotlin.js.translate.expression.InlineMetadata[PropertyDescriptorImpl]

'function' @ [64:17] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'coroutineMetadata' @ [64:27] ==> public var JsFunction.coroutineMetadata: CoroutineMetadata? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'x' @ [65:28] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'name' @ [65:30] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'ident' @ [65:35] ==> public final val JsName.ident: String[MyPropertyDescriptor]

'additionalStatementsByNode' @ [66:17] ==> private final val additionalStatementsByNode: MutableMap<JsNode, List<JsStatement>> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[PropertyDescriptorImpl]

'x' @ [66:44] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'CoroutineFunctionTransformer' @ [66:49] ==> public constructor CoroutineFunctionTransformer(function: JsFunction, name: String?) defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[ClassConstructorDescriptorImpl]

'function' @ [66:78] ==> val function: JsFunction? defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'name' @ [66:88] ==> val name: String defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[LocalVariableDescriptor]

'transform' @ [66:94] ==> public final fun transform(): List<JsStatement> defined in org.jetbrains.kotlin.js.coroutine.CoroutineFunctionTransformer[SimpleFunctionDescriptorImpl]

'super' @ [70:16] ==> <this> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer[LazyClassReceiverParameterDescriptor]

'visit' @ [70:22] ==> public open fun visit(@NotNull p0: JsVars.JsVar, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [70:28] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

'ctx' @ [70:31] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.coroutine.CoroutineTransformer.visit[ValueParameterDescriptorImpl]

