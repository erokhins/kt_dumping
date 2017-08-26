'TypeCheckRewritingVisitor' @ [28:19] ==> public constructor TypeCheckRewritingVisitor() defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[ClassConstructorDescriptorImpl]

'fragments' @ [29:22] ==> value-parameter fragments: List<JsProgramFragment> defined in org.jetbrains.kotlin.js.translate.utils.expandIsCalls[ValueParameterDescriptorImpl]

'visitor' @ [30:9] ==> val visitor: TypeCheckRewritingVisitor defined in org.jetbrains.kotlin.js.translate.utils.expandIsCalls[LocalVariableDescriptor]

'accept' @ [30:17] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsGlobalBlock..JsGlobalBlock?)): (JsGlobalBlock..JsGlobalBlock?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsGlobalBlock

'fragment' @ [30:24] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.js.translate.utils.expandIsCalls[LocalVariableDescriptor]

'declarationBlock' @ [30:33] ==> public final val JsProgramFragment.declarationBlock: JsGlobalBlock[MyPropertyDescriptor]

'visitor' @ [31:9] ==> val visitor: TypeCheckRewritingVisitor defined in org.jetbrains.kotlin.js.translate.utils.expandIsCalls[LocalVariableDescriptor]

'accept' @ [31:17] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsGlobalBlock..JsGlobalBlock?)): (JsGlobalBlock..JsGlobalBlock?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsGlobalBlock

'fragment' @ [31:24] ==> val fragment: JsProgramFragment defined in org.jetbrains.kotlin.js.translate.utils.expandIsCalls[LocalVariableDescriptor]

'initializerBlock' @ [31:33] ==> public final val JsProgramFragment.initializerBlock: JsGlobalBlock[MyPropertyDescriptor]

'JsVisitorWithContextImpl' @ [35:43] ==> public constructor JsVisitorWithContextImpl() defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaClassConstructorDescriptor]

'Stack' @ [37:26] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> JsScope

'Stack' @ [38:29] ==> public constructor Stack<E : (Any..Any?)>() defined in java.util.Stack[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> MutableSet<JsName>

'apply' @ [38:57] ==> @InlineOnly public inline fun <T> Stack<MutableSet<JsName>>.apply(block: Stack<MutableSet<JsName>>.() -> Unit): Stack<MutableSet<JsName>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Stack<MutableSet<JsName>>

'push' @ [38:65] ==> public open fun push(p0: (MutableSet<JsName>..MutableSet<JsName>?)): (MutableSet<JsName>..MutableSet<JsName>?) defined in java.util.Stack[JavaMethodDescriptor]

'mutableSetOf' @ [38:70] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableSetOf(): MutableSet<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName

'scopes' @ [41:9] ==> private final val scopes: Stack<JsScope> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'push' @ [41:16] ==> public open fun push(p0: (JsScope..JsScope?)): (JsScope..JsScope?) defined in java.util.Stack[JavaMethodDescriptor]

'x' @ [41:21] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'scope' @ [41:23] ==> public final val JsFunction.scope: JsFunctionScope[MyPropertyDescriptor]

'localVars' @ [42:9] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'push' @ [42:19] ==> public open fun push(p0: (MutableSet<JsName>..MutableSet<JsName>?)): (MutableSet<JsName>..MutableSet<JsName>?) defined in java.util.Stack[JavaMethodDescriptor]

'IdentitySet' @ [42:24] ==> public fun <T> IdentitySet(): MutableSet<JsName> defined in org.jetbrains.kotlin.js.inline.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> JsName

'apply' @ [42:46] ==> @InlineOnly public inline fun <T> MutableSet<JsName>.apply(block: MutableSet<JsName>.() -> Unit): MutableSet<JsName> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MutableSet<JsName>

'this' @ [42:54] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit.<anonymous>[ReceiverParameterDescriptorImpl]

'x' @ [42:62] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'parameters' @ [42:64] ==> public final val JsFunction.parameters: (MutableList<(JsParameter..JsParameter?)>..List<(JsParameter..JsParameter?)>)[MyPropertyDescriptor]

'map' @ [42:75] ==> public inline fun <T, R> Iterable<(JsParameter..JsParameter?)>.map(transform: ((JsParameter..JsParameter?)) -> JsName): List<JsName> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsParameter..org.jetbrains.kotlin.js.backend.ast.JsParameter?)
    <R> -> JsName

'it' @ [42:81] ==> value-parameter it: (JsParameter..JsParameter?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [42:84] ==> public final var JsParameter.name: JsName[MyPropertyDescriptor]

'super' @ [43:16] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[LazyClassReceiverParameterDescriptor]

'visit' @ [43:22] ==> public open fun visit(@NotNull p0: JsFunction, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [43:28] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'ctx' @ [43:31] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'localVars' @ [47:9] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'peek' @ [47:19] ==> public open fun peek(): (MutableSet<JsName>..MutableSet<JsName>?) defined in java.util.Stack[JavaMethodDescriptor]

'add' @ [47:26] ==> public abstract fun add(element: JsName): Boolean defined in kotlin.collections.MutableSet[DeserializedSimpleFunctionDescriptor]

'x' @ [47:30] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'name' @ [47:32] ==> public final var JsVars.JsVar.name: (JsName..JsName?)[MyPropertyDescriptor]

'super' @ [48:16] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[LazyClassReceiverParameterDescriptor]

'visit' @ [48:22] ==> public open fun visit(@NotNull p0: JsVars.JsVar, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Boolean defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [48:28] ==> value-parameter x: JsVars.JsVar defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'ctx' @ [48:31] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'scopes' @ [52:9] ==> private final val scopes: Stack<JsScope> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'pop' @ [52:16] ==> public open fun pop(): (JsScope..JsScope?) defined in java.util.Stack[JavaMethodDescriptor]

'localVars' @ [53:9] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'pop' @ [53:19] ==> public open fun pop(): (MutableSet<JsName>..MutableSet<JsName>?) defined in java.util.Stack[JavaMethodDescriptor]

'super' @ [54:9] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[LazyClassReceiverParameterDescriptor]

'endVisit' @ [54:15] ==> public open fun endVisit(@NotNull p0: JsFunction, @NotNull p1: raw (JsContext<(JsNode..JsNode?)>..JsContext<*>)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsVisitorWithContextImpl[JavaMethodDescriptor]

'x' @ [54:24] ==> value-parameter x: JsFunction defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.endVisit[ValueParameterDescriptorImpl]

'ctx' @ [54:27] ==> value-parameter ctx: JsContext<*> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.endVisit[ValueParameterDescriptorImpl]

'x' @ [59:22] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'qualifier' @ [59:24] ==> public final var JsInvocation.qualifier: JsExpression[MyPropertyDescriptor]

'callee' @ [60:31] ==> val callee: JsInvocation? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'arguments' @ [60:39] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'x' @ [61:24] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'arguments' @ [61:26] ==> public final val JsInvocation.arguments: (MutableList<(JsExpression..JsExpression?)>..List<(JsExpression..JsExpression?)>)[MyPropertyDescriptor]

'firstOrNull' @ [61:36] ==> public fun <T> List<(JsExpression..JsExpression?)>.firstOrNull(): JsExpression? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'callee' @ [63:13] ==> val callee: JsInvocation? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'argument' @ [63:31] ==> val argument: JsExpression? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'calleeArguments' @ [63:51] ==> val calleeArguments: (MutableList<(JsExpression..JsExpression?)>?..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'getReplacement' @ [64:31] ==> private final fun getReplacement(callee: JsInvocation, calleeArguments: List<JsExpression>, argument: JsExpression): JsExpression? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[SimpleFunctionDescriptorImpl]

'callee' @ [64:46] ==> val callee: JsInvocation? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'calleeArguments' @ [64:54] ==> val calleeArguments: (MutableList<(JsExpression..JsExpression?)>?..List<(JsExpression..JsExpression?)>?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'argument' @ [64:71] ==> val argument: JsExpression? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'replacement' @ [66:17] ==> val replacement: JsExpression? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'ctx' @ [67:17] ==> value-parameter ctx: JsContext<JsNode> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'replaceMe' @ [67:21] ==> public abstract fun <R : (JsNode..JsNode?)> replaceMe(p0: (JsExpression..JsExpression?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsNode..JsNode?)> -> JsExpression

'accept' @ [67:31] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'replacement' @ [67:38] ==> val replacement: JsExpression? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[LocalVariableDescriptor]

'source' @ [67:51] ==> public open fun source(p0: (Any..Any?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.backend.ast.JsExpression[JavaMethodDescriptor]

'x' @ [67:58] ==> value-parameter x: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.visit[ValueParameterDescriptorImpl]

'source' @ [67:60] ==> public final var JsInvocation.source: (Any..Any?)[MyPropertyDescriptor]

'callee' @ [76:25] ==> value-parameter callee: JsInvocation defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'typeCheck' @ [76:32] ==> public var JsInvocation.typeCheck: TypeCheck? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'when (typeCheck) {
            TypeCheck.TYPEOF -> {
                // `Kotlin.isTypeOf(calleeArgument)(argument)` -> `typeOf argument === calleeArgument`
                if (calleeArguments.size == 1) typeOfIs(argument, calleeArguments[0] as JsStringLiteral) else null
            }

            TypeCheck.INSTANCEOF -> {
                // `Kotlin.isInstanceOf(calleeArgument)(argument)` -> `argument instanceof calleeArgument`
                if (calleeArguments.size == 1) Namer.isInstanceOf(argument, calleeArguments[0]) else null
            }

            TypeCheck.OR_NULL -> {
                // `Kotlin.orNull(calleeArgument)(argument)` -> `(tmp = argument) == null || calleeArgument(tmp)`
                if (calleeArguments.size == 1) getReplacementForOrNull(argument, calleeArguments[0]) else null
            }

            TypeCheck.AND_PREDICATE -> {
                // `Kotlin.andPredicate(p1, p2)(argument)` -> `p1(tmp = argument) && p2(tmp)`
                if (calleeArguments.size == 2) {
                    getReplacementForAndPredicate(argument, calleeArguments[0], calleeArguments[1])
                }
                else {
                    null
                }
            }

            null -> null
        }' @ [77:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: JsExpression?, entry1: JsExpression?, entry2: JsExpression?, entry3: JsExpression?, entry4: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> JsExpression?

'typeCheck' @ [77:22] ==> val typeCheck: TypeCheck? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[LocalVariableDescriptor]

'TYPEOF' @ [78:23] ==> enum entry TYPEOF defined in org.jetbrains.kotlin.js.backend.ast.metadata.TypeCheck[FakeCallableDescriptorForObject]

'if (calleeArguments.size == 1) typeOfIs(argument, calleeArguments[0] as JsStringLiteral) else null' @ [80:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsBinaryOperation?, elseBranch: JsBinaryOperation?): JsBinaryOperation?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsBinaryOperation?

'calleeArguments' @ [80:21] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'size' @ [80:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeOfIs' @ [80:48] ==> @NotNull public open fun typeOfIs(@NotNull expression: JsExpression, @NotNull string: JsStringLiteral): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'argument' @ [80:57] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'calleeArguments' @ [80:67] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'INSTANCEOF' @ [83:23] ==> enum entry INSTANCEOF defined in org.jetbrains.kotlin.js.backend.ast.metadata.TypeCheck[FakeCallableDescriptorForObject]

'if (calleeArguments.size == 1) Namer.isInstanceOf(argument, calleeArguments[0]) else null' @ [85:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'calleeArguments' @ [85:21] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'size' @ [85:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'isInstanceOf' @ [85:54] ==> @NotNull public open fun isInstanceOf(@NotNull instance: JsExpression, @NotNull type: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.context.Namer[JavaMethodDescriptor]

'argument' @ [85:67] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'calleeArguments' @ [85:77] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'OR_NULL' @ [88:23] ==> enum entry OR_NULL defined in org.jetbrains.kotlin.js.backend.ast.metadata.TypeCheck[FakeCallableDescriptorForObject]

'if (calleeArguments.size == 1) getReplacementForOrNull(argument, calleeArguments[0]) else null' @ [90:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'calleeArguments' @ [90:21] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'size' @ [90:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getReplacementForOrNull' @ [90:48] ==> private final fun getReplacementForOrNull(argument: JsExpression, calleeArgument: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [90:72] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'calleeArguments' @ [90:82] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'AND_PREDICATE' @ [93:23] ==> enum entry AND_PREDICATE defined in org.jetbrains.kotlin.js.backend.ast.metadata.TypeCheck[FakeCallableDescriptorForObject]

'if (calleeArguments.size == 2) {
                    getReplacementForAndPredicate(argument, calleeArguments[0], calleeArguments[1])
                }
                else {
                    null
                }' @ [95:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: JsExpression?, elseBranch: JsExpression?): JsExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> JsExpression?

'calleeArguments' @ [95:21] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'size' @ [95:37] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'getReplacementForAndPredicate' @ [96:21] ==> private final fun getReplacementForAndPredicate(argument: JsExpression, p1: JsExpression, p2: JsExpression): JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [96:51] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'calleeArguments' @ [96:61] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'calleeArguments' @ [96:81] ==> value-parameter calleeArguments: List<JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacement[ValueParameterDescriptorImpl]

'calleeArgument' @ [108:13] ==> value-parameter calleeArgument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[ValueParameterDescriptorImpl]

'calleeArgument' @ [108:47] ==> value-parameter calleeArgument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[ValueParameterDescriptorImpl]

'typeCheck' @ [108:62] ==> public var JsInvocation.typeCheck: TypeCheck? defined in org.jetbrains.kotlin.js.backend.ast.metadata[DeserializedPropertyDescriptor]

'OR_NULL' @ [108:85] ==> enum entry OR_NULL defined in org.jetbrains.kotlin.js.backend.ast.metadata.TypeCheck[FakeCallableDescriptorForObject]

'JsInvocation' @ [109:20] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'calleeArgument' @ [109:33] ==> value-parameter calleeArgument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[ValueParameterDescriptorImpl]

'argument' @ [109:49] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[ValueParameterDescriptorImpl]

'component1' @ [112:14] ==> public final operator fun component1(): JsExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [112:31] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'expandArgumentForTwoInvocations' @ [112:50] ==> private final fun expandArgumentForTwoInvocations(argument: JsExpression): Pair<JsExpression, (JsExpression..JsExpression?)> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [112:82] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[ValueParameterDescriptorImpl]

'isNullCheck' @ [113:39] ==> @NotNull public open fun isNullCheck(@NotNull expressionToCheck: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.TranslationUtils[JavaMethodDescriptor]

'nullCheckTarget' @ [113:51] ==> val nullCheckTarget: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[LocalVariableDescriptor]

'or' @ [114:16] ==> @NotNull public open fun or(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'isNull' @ [114:19] ==> val isNull: JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[LocalVariableDescriptor]

'JsInvocation' @ [114:27] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'calleeArgument' @ [114:40] ==> value-parameter calleeArgument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[ValueParameterDescriptorImpl]

'nextCheckTarget' @ [114:56] ==> val nextCheckTarget: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForOrNull[LocalVariableDescriptor]

'component1' @ [118:14] ==> public final operator fun component1(): JsExpression defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [118:20] ==> public final operator fun component2(): (JsExpression..JsExpression?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'expandArgumentForTwoInvocations' @ [118:28] ==> private final fun expandArgumentForTwoInvocations(argument: JsExpression): Pair<JsExpression, (JsExpression..JsExpression?)> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [118:60] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[ValueParameterDescriptorImpl]

'accept' @ [119:21] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'JsInvocation' @ [119:28] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'p1' @ [119:41] ==> value-parameter p1: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[ValueParameterDescriptorImpl]

'arg1' @ [119:45] ==> val arg1: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[LocalVariableDescriptor]

'accept' @ [120:22] ==> public final fun <T : (JsNode..JsNode?)> accept(p0: (JsExpression..JsExpression?)): (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[JavaMethodDescriptor]
Inferred types:
    <T : (JsNode..JsNode?)> -> JsExpression

'JsInvocation' @ [120:29] ==> public constructor JsInvocation(@NotNull p0: JsExpression, vararg p1: (JsExpression..JsExpression?)) defined in org.jetbrains.kotlin.js.backend.ast.JsInvocation[JavaClassConstructorDescriptor]

'p2' @ [120:42] ==> value-parameter p2: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[ValueParameterDescriptorImpl]

'arg2' @ [120:46] ==> val arg2: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[LocalVariableDescriptor]

'and' @ [121:27] ==> @NotNull public open fun and(@NotNull op1: JsExpression, @NotNull op2: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'first' @ [121:31] ==> val first: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[LocalVariableDescriptor]

'second' @ [121:38] ==> val second: (JsExpression..JsExpression?) defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.getReplacementForAndPredicate[LocalVariableDescriptor]

'when {
        // `(P * Q)(localVar=someExpr)` -> `P(localVar=someExpr), Q(localVar)`
        // Where P, Q - predicate, * - function composition
        argument.isAssignmentToLocalVar -> Pair(argument, (argument as JsBinaryOperation).arg1)

        // `(P * Q)(expression)` -> `P(tmp = expression), Q(tmp)`
        argument.needsAlias -> generateAlias(argument)

        // `(P * Q)(primitive)` -> `P(primitive), Q(primitive)`
        else -> Pair(argument, argument)
    }' @ [124:75] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<JsExpression, (JsExpression..JsExpression?)>, entry1: Pair<JsExpression, (JsExpression..JsExpression?)>, entry2: Pair<JsExpression, (JsExpression..JsExpression?)>): Pair<JsExpression, (JsExpression..JsExpression?)>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<JsExpression, (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)>

'argument' @ [127:9] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'isAssignmentToLocalVar' @ [127:18] ==> private final val JsExpression.isAssignmentToLocalVar: Boolean defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'Pair' @ [127:44] ==> public constructor Pair<out A, out B>(first: JsExpression, second: (JsExpression..JsExpression?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsExpression
    <out B> -> (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)

'argument' @ [127:49] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'argument' @ [127:60] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'arg1' @ [127:91] ==> public final var JsBinaryOperation.arg1: (JsExpression..JsExpression?)[MyPropertyDescriptor]

'argument' @ [130:9] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'needsAlias' @ [130:18] ==> private final val JsExpression.needsAlias: Boolean defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'generateAlias' @ [130:32] ==> private final fun generateAlias(argument: JsExpression): Pair<JsExpression, JsExpression> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[SimpleFunctionDescriptorImpl]

'argument' @ [130:46] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'Pair' @ [133:17] ==> public constructor Pair<out A, out B>(first: JsExpression, second: JsExpression) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsExpression
    <out B> -> JsExpression

'argument' @ [133:22] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'argument' @ [133:32] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.expandArgumentForTwoInvocations[ValueParameterDescriptorImpl]

'declareTemporary' @ [137:27] ==> @NotNull public open fun declareTemporary(): JsName defined in org.jetbrains.kotlin.js.backend.ast.JsScope[JavaMethodDescriptor]

'lastStatementLevelContext' @ [138:32] ==> protected/*protected and package*/ for synthetic extension final val TypeCheckRewritingVisitor.lastStatementLevelContext: JsContext<(JsStatement..JsStatement?)>[MyPropertyDescriptor]

'statementContext' @ [139:9] ==> val statementContext: JsContext<(JsStatement..JsStatement?)> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.generateAlias[LocalVariableDescriptor]

'addPrevious' @ [139:26] ==> public open fun <R : (JsStatement..JsStatement?)> addPrevious(p0: (JsVars..JsVars?)): Unit defined in org.jetbrains.kotlin.js.backend.ast.JsContext[JavaMethodDescriptor]
Inferred types:
    <R : (JsStatement..JsStatement?)> -> JsVars

'newVar' @ [139:38] ==> @NotNull public open fun newVar(@NotNull name: JsName, @Nullable expr: JsExpression?): JsVars defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'tmp' @ [139:45] ==> val tmp: JsName defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.generateAlias[LocalVariableDescriptor]

'Pair' @ [140:16] ==> public constructor Pair<out A, out B>(first: JsBinaryOperation, second: JsNameRef) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> JsBinaryOperation
    <out B> -> JsNameRef

'assignment' @ [140:21] ==> @NotNull public open fun assignment(@NotNull left: JsExpression, @NotNull right: JsExpression): JsBinaryOperation defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'tmp' @ [140:32] ==> val tmp: JsName defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.generateAlias[LocalVariableDescriptor]

'makeRef' @ [140:36] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'argument' @ [140:47] ==> value-parameter argument: JsExpression defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.generateAlias[ValueParameterDescriptorImpl]

'tmp' @ [140:58] ==> val tmp: JsName defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.generateAlias[LocalVariableDescriptor]

'makeRef' @ [140:62] ==> @NotNull public open fun makeRef(): JsNameRef defined in org.jetbrains.kotlin.js.backend.ast.JsName[JavaMethodDescriptor]

'when (this) {
            is JsLiteral.JsValueLiteral -> false
            else -> !isLocalVar
        }' @ [144:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Boolean, entry1: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Boolean

'this' @ [144:23] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.needsAlias[ReceiverParameterDescriptorImpl]

'!' @ [146:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isLocalVar' @ [146:22] ==> private final val JsExpression.isLocalVar: Boolean defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'localVars' @ [150:17] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'isNotEmpty' @ [150:27] ==> @InlineOnly public inline fun <T> Collection<(MutableSet<JsName>..MutableSet<JsName>?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableSet<org.jetbrains.kotlin.js.backend.ast.JsName>..kotlin.collections.MutableSet<org.jetbrains.kotlin.js.backend.ast.JsName>?)

'this' @ [150:43] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.isLocalVar[ReceiverParameterDescriptorImpl]

'name' @ [150:64] ==> public final var JsNameRef.name: JsName?[MyPropertyDescriptor]

'let' @ [150:69] ==> @InlineOnly public inline fun <T, R> JsName?.let(block: (JsName?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> JsName?
    <R> -> Boolean

'it' @ [150:75] ==> value-parameter it: JsName? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.<get-isLocalVar>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [150:89] ==> value-parameter it: JsName? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.<get-isLocalVar>.<anonymous>[ValueParameterDescriptorImpl]

'localVars' @ [150:95] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'peek' @ [150:105] ==> public open fun peek(): (MutableSet<JsName>..MutableSet<JsName>?) defined in java.util.Stack[JavaMethodDescriptor]

'localVars' @ [153:17] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'isNotEmpty' @ [153:27] ==> @InlineOnly public inline fun <T> Collection<(MutableSet<JsName>..MutableSet<JsName>?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (kotlin.collections.MutableSet<org.jetbrains.kotlin.js.backend.ast.JsName>..kotlin.collections.MutableSet<org.jetbrains.kotlin.js.backend.ast.JsName>?)

'decomposeAssignmentToVariable' @ [154:28] ==> @Nullable public open fun decomposeAssignmentToVariable(@NotNull expr: JsExpression): Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.JsAstUtils[JavaMethodDescriptor]

'this' @ [154:58] ==> <this> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.isAssignmentToLocalVar[ReceiverParameterDescriptorImpl]

'let' @ [154:64] ==> @InlineOnly public inline fun <T, R> Pair<(JsName..JsName?), (JsExpression..JsExpression?)>?.let(block: (Pair<(JsName..JsName?), (JsExpression..JsExpression?)>?) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<(org.jetbrains.kotlin.js.backend.ast.JsName..org.jetbrains.kotlin.js.backend.ast.JsName?), (org.jetbrains.kotlin.js.backend.ast.JsExpression..org.jetbrains.kotlin.js.backend.ast.JsExpression?)>?
    <R> -> Boolean

'it' @ [154:70] ==> value-parameter it: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.<get-isAssignmentToLocalVar>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [154:84] ==> value-parameter it: Pair<(JsName..JsName?), (JsExpression..JsExpression?)>? defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor.<get-isAssignmentToLocalVar>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [154:87] ==> public final val first: (JsName..JsName?) defined in kotlin.Pair[DeserializedPropertyDescriptor]

'localVars' @ [154:96] ==> private final val localVars: Stack<MutableSet<JsName>> defined in org.jetbrains.kotlin.js.translate.utils.TypeCheckRewritingVisitor[PropertyDescriptorImpl]

'peek' @ [154:106] ==> public open fun peek(): (MutableSet<JsName>..MutableSet<JsName>?) defined in java.util.Stack[JavaMethodDescriptor]

