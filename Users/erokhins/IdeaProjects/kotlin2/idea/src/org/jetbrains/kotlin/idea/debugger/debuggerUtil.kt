'visibleVariables' @ [43:12] ==> value-parameter visibleVariables: List<LocalVariableProxyImpl> defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineFunctionBody[ValueParameterDescriptorImpl]

'any' @ [43:29] ==> public inline fun <T> Iterable<LocalVariableProxyImpl>.any(predicate: (LocalVariableProxyImpl) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariableProxyImpl

'it' @ [43:35] ==> value-parameter it: LocalVariableProxyImpl defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineFunctionBody.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [43:38] ==> public open fun name(): (String..String?) defined in com.intellij.debugger.jdi.LocalVariableProxyImpl[JavaMethodDescriptor]

'startsWith' @ [43:45] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOCAL_VARIABLE_NAME_PREFIX_INLINE_FUNCTION' @ [43:63] ==> public const final val LOCAL_VARIABLE_NAME_PREFIX_INLINE_FUNCTION: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'visibleVariables' @ [47:12] ==> value-parameter visibleVariables: List<LocalVariableProxyImpl> defined in org.jetbrains.kotlin.idea.debugger.numberOfInlinedFunctions[ValueParameterDescriptorImpl]

'count' @ [47:29] ==> public inline fun <T> Iterable<LocalVariableProxyImpl>.count(predicate: (LocalVariableProxyImpl) -> Boolean): Int defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariableProxyImpl

'it' @ [47:37] ==> value-parameter it: LocalVariableProxyImpl defined in org.jetbrains.kotlin.idea.debugger.numberOfInlinedFunctions.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [47:40] ==> public open fun name(): (String..String?) defined in com.intellij.debugger.jdi.LocalVariableProxyImpl[JavaMethodDescriptor]

'startsWith' @ [47:47] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOCAL_VARIABLE_NAME_PREFIX_INLINE_FUNCTION' @ [47:65] ==> public const final val LOCAL_VARIABLE_NAME_PREFIX_INLINE_FUNCTION: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'location' @ [51:28] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[ValueParameterDescriptorImpl]

'visibleVariables' @ [51:37] ==> private fun Location.visibleVariables(debugProcess: DebugProcessImpl): List<LocalVariable> defined in org.jetbrains.kotlin.idea.debugger[SimpleFunctionDescriptorImpl]

'debugProcess' @ [51:54] ==> value-parameter debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[ValueParameterDescriptorImpl]

'KotlinDebuggerCaches' @ [53:19] ==> public companion object defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches[FakeCallableDescriptorForObject]

'getOrCreateTypeMapper' @ [53:40] ==> public final fun getOrCreateTypeMapper(psiElement: PsiElement): KotlinTypeMapper defined in org.jetbrains.kotlin.idea.debugger.evaluate.KotlinDebuggerCaches.Companion[SimpleFunctionDescriptorImpl]

'inlineArgument' @ [53:62] ==> value-parameter inlineArgument: KtFunction defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[ValueParameterDescriptorImpl]

'bindingContext' @ [53:78] ==> public final val KotlinTypeMapper.bindingContext: BindingContext[MyPropertyDescriptor]

'runReadAction' @ [55:25] ==> public fun <T> runReadAction(action: () -> Int): Int defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'lambdaOrdinalByArgument' @ [55:41] ==> private fun lambdaOrdinalByArgument(elementAt: KtFunction, context: BindingContext): Int defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'inlineArgument' @ [55:65] ==> value-parameter inlineArgument: KtFunction defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[ValueParameterDescriptorImpl]

'context' @ [55:81] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[LocalVariableDescriptor]

'visibleVariables' @ [56:32] ==> val visibleVariables: List<LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[LocalVariableDescriptor]

'filter' @ [56:49] ==> public inline fun <T> Iterable<LocalVariable>.filter(predicate: (LocalVariable) -> Boolean): List<LocalVariable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariable

'it' @ [56:58] ==> value-parameter it: LocalVariable defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [56:61] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.LocalVariable[JavaMethodDescriptor]

'startsWith' @ [56:68] ==> public fun String.startsWith(prefix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOCAL_VARIABLE_NAME_PREFIX_INLINE_ARGUMENT' @ [56:86] ==> public const final val LOCAL_VARIABLE_NAME_PREFIX_INLINE_ARGUMENT: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'runReadAction' @ [58:24] ==> public fun <T> runReadAction(action: () -> String): String defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String

'functionNameByArgument' @ [58:40] ==> private fun functionNameByArgument(elementAt: KtFunction, context: BindingContext): String defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'inlineArgument' @ [58:63] ==> value-parameter inlineArgument: KtFunction defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[ValueParameterDescriptorImpl]

'context' @ [58:79] ==> val context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[LocalVariableDescriptor]

'markerLocalVariables' @ [60:12] ==> val markerLocalVariables: List<LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[LocalVariableDescriptor]

'firstOrNull' @ [60:33] ==> public inline fun <T> Iterable<LocalVariable>.firstOrNull(predicate: (LocalVariable) -> Boolean): LocalVariable? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LocalVariable

'lambdaOrdinalByLocalVariable' @ [61:9] ==> private fun lambdaOrdinalByLocalVariable(name: String): Int defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [61:38] ==> value-parameter it: LocalVariable defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [61:41] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.LocalVariable[JavaMethodDescriptor]

'lambdaOrdinal' @ [61:52] ==> val lambdaOrdinal: Int defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[LocalVariableDescriptor]

'functionNameByLocalVariable' @ [61:69] ==> private fun functionNameByLocalVariable(name: String): String defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'it' @ [61:97] ==> value-parameter it: LocalVariable defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [61:100] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.LocalVariable[JavaMethodDescriptor]

'functionName' @ [61:111] ==> val functionName: String defined in org.jetbrains.kotlin.idea.debugger.isInsideInlineArgument[LocalVariableDescriptor]

'DebuggerCommandImpl' @ [67:49] ==> public constructor DebuggerCommandImpl() defined in com.intellij.debugger.engine.events.DebuggerCommandImpl[JavaClassConstructorDescriptor]

'result' @ [69:13] ==> var result: T? defined in org.jetbrains.kotlin.idea.debugger.invokeInManagerThread[LocalVariableDescriptor]

'runReadAction' @ [69:22] ==> public fun <T> runReadAction(action: () -> T?): T? defined in org.jetbrains.kotlin.idea.util.application[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T?

'invoke' @ [69:38] ==> public abstract operator fun invoke(p1: DebuggerContextImpl): T? defined in kotlin.Function1[FunctionInvokeDescriptor]

'debuggerContext' @ [69:40] ==> public final val DebugProcessImpl.debuggerContext: DebuggerContextImpl[MyPropertyDescriptor]

'when {
        DebuggerManagerThreadImpl.isManagerThread() ->
            managerThread.invoke(command)
        else ->
            managerThread.invokeAndWait(command)
    }' @ [73:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'isManagerThread' @ [74:35] ==> public open fun isManagerThread(): Boolean defined in com.intellij.debugger.engine.DebuggerManagerThreadImpl[JavaMethodDescriptor]

'managerThread' @ [75:13] ==> public final val DebugProcessImpl.managerThread: (DebuggerManagerThreadImpl..DebuggerManagerThreadImpl?)[MyPropertyDescriptor]

'invoke' @ [75:27] ==> public open operator fun invoke(p0: (DebuggerCommandImpl..DebuggerCommandImpl?)): Unit defined in com.intellij.debugger.engine.DebuggerManagerThreadImpl[JavaMethodDescriptor]

'command' @ [75:34] ==> val command: DebuggerCommandImpl defined in org.jetbrains.kotlin.idea.debugger.invokeInManagerThread[LocalVariableDescriptor]

'managerThread' @ [77:13] ==> public final val DebugProcessImpl.managerThread: (DebuggerManagerThreadImpl..DebuggerManagerThreadImpl?)[MyPropertyDescriptor]

'invokeAndWait' @ [77:27] ==> public open fun invokeAndWait(p0: (DebuggerCommandImpl..DebuggerCommandImpl?)): Unit defined in com.intellij.debugger.engine.DebuggerManagerThreadImpl[JavaMethodDescriptor]

'command' @ [77:41] ==> val command: DebuggerCommandImpl defined in org.jetbrains.kotlin.idea.debugger.invokeInManagerThread[LocalVariableDescriptor]

'result' @ [80:12] ==> var result: T? defined in org.jetbrains.kotlin.idea.debugger.invokeInManagerThread[LocalVariableDescriptor]

'asmTypeForAnonymousClass' @ [84:31] ==> @NotNull public open fun asmTypeForAnonymousClass(@NotNull p0: BindingContext, @NotNull p1: KtElement): Type defined in org.jetbrains.kotlin.codegen.binding.CodegenBinding[JavaMethodDescriptor]

'context' @ [84:56] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.lambdaOrdinalByArgument[ValueParameterDescriptorImpl]

'elementAt' @ [84:65] ==> value-parameter elementAt: KtFunction defined in org.jetbrains.kotlin.idea.debugger.lambdaOrdinalByArgument[ValueParameterDescriptorImpl]

'type' @ [85:12] ==> val type: Type defined in org.jetbrains.kotlin.idea.debugger.lambdaOrdinalByArgument[LocalVariableDescriptor]

'className' @ [85:17] ==> public final val Type.className: (String..String?)[MyPropertyDescriptor]

'substringAfterLast' @ [85:27] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'toInt' @ [85:51] ==> @InlineOnly public inline fun String.toInt(): Int defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'getInlineArgumentDescriptor' @ [89:47] ==> @Nullable public open fun getInlineArgumentDescriptor(@NotNull p0: KtFunction, @NotNull p1: BindingContext): ValueParameterDescriptor? defined in org.jetbrains.kotlin.resolve.inline.InlineUtil[JavaMethodDescriptor]

'elementAt' @ [89:75] ==> value-parameter elementAt: KtFunction defined in org.jetbrains.kotlin.idea.debugger.functionNameByArgument[ValueParameterDescriptorImpl]

'context' @ [89:86] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.debugger.functionNameByArgument[ValueParameterDescriptorImpl]

'inlineArgumentDescriptor' @ [90:12] ==> val inlineArgumentDescriptor: ValueParameterDescriptor? defined in org.jetbrains.kotlin.idea.debugger.functionNameByArgument[LocalVariableDescriptor]

'containingDeclaration' @ [90:38] ==> public final val ValueParameterDescriptor.containingDeclaration: CallableDescriptor[MyPropertyDescriptor]

'name' @ [90:61] ==> public final val CallableDescriptor.name: Name[MyPropertyDescriptor]

'asString' @ [90:67] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'MockStackFrame' @ [94:22] ==> public constructor MockStackFrame(location: Location, vm: VirtualMachine) defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[ClassConstructorDescriptorImpl]

'this' @ [94:37] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.visibleVariables[ReceiverParameterDescriptorImpl]

'debugProcess' @ [94:43] ==> value-parameter debugProcess: DebugProcessImpl defined in org.jetbrains.kotlin.idea.debugger.visibleVariables[ValueParameterDescriptorImpl]

'virtualMachineProxy' @ [94:56] ==> public final val DebugProcessImpl.virtualMachineProxy: VirtualMachineProxyImpl[MyPropertyDescriptor]

'virtualMachine' @ [94:76] ==> public final val VirtualMachineProxyImpl.virtualMachine: VirtualMachine[MyPropertyDescriptor]

'stackFrame' @ [95:12] ==> val stackFrame: MockStackFrame defined in org.jetbrains.kotlin.idea.debugger.visibleVariables[LocalVariableDescriptor]

'visibleVariables' @ [95:23] ==> public open fun visibleVariables(): List<LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[SimpleFunctionDescriptorImpl]

'name' @ [100:33] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.lambdaOrdinalByLocalVariable[ValueParameterDescriptorImpl]

'removePrefix' @ [100:38] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOCAL_VARIABLE_NAME_PREFIX_INLINE_ARGUMENT' @ [100:58] ==> public const final val LOCAL_VARIABLE_NAME_PREFIX_INLINE_ARGUMENT: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'parseInt' @ [101:24] ==> public open fun parseInt(p0: (String..String?)): Int defined in java.lang.Integer[JavaMethodDescriptor]

'nameWithoutPrefix' @ [101:33] ==> val nameWithoutPrefix: String defined in org.jetbrains.kotlin.idea.debugger.lambdaOrdinalByLocalVariable[LocalVariableDescriptor]

'substringBefore' @ [101:51] ==> public fun String.substringBefore(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'nameWithoutPrefix' @ [101:72] ==> val nameWithoutPrefix: String defined in org.jetbrains.kotlin.idea.debugger.lambdaOrdinalByLocalVariable[LocalVariableDescriptor]

'name' @ [109:29] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.functionNameByLocalVariable[ValueParameterDescriptorImpl]

'removePrefix' @ [109:34] ==> public fun String.removePrefix(prefix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'LOCAL_VARIABLE_NAME_PREFIX_INLINE_ARGUMENT' @ [109:54] ==> public const final val LOCAL_VARIABLE_NAME_PREFIX_INLINE_ARGUMENT: String defined in org.jetbrains.kotlin.load.java.JvmAbi[JavaPropertyDescriptor]

'nameWithoutPrefix' @ [110:12] ==> val nameWithoutPrefix: String defined in org.jetbrains.kotlin.idea.debugger.functionNameByLocalVariable[LocalVariableDescriptor]

'substringAfterLast' @ [110:30] ==> public fun String.substringAfterLast(delimiter: String, missingDelimiterValue: String = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'location' @ [116:31] ==> private final val location: Location defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'visibleVariables' @ [121:13] ==> private final var visibleVariables: Map<String, LocalVariable>? defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'location' @ [122:32] ==> private final val location: Location defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'method' @ [122:41] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'variables' @ [122:50] ==> public abstract fun variables(): (MutableList<(LocalVariable..LocalVariable?)>..List<(LocalVariable..LocalVariable?)>?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'HashMap' @ [123:23] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>(p0: Int) defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> String
    <V : (Any..Any?)> -> LocalVariable

'allVariables' @ [123:54] ==> val allVariables: (MutableList<(LocalVariable..LocalVariable?)>..List<(LocalVariable..LocalVariable?)>?) defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'size' @ [123:67] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'allVariables' @ [125:33] ==> val allVariables: (MutableList<(LocalVariable..LocalVariable?)>..List<(LocalVariable..LocalVariable?)>?) defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'allVariable' @ [126:32] ==> val allVariable: (LocalVariable..LocalVariable?) defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'variable' @ [127:28] ==> val variable: LocalVariableImpl defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'name' @ [127:37] ==> public open fun name(): (String..String?) defined in com.sun.tools.jdi.LocalVariableImpl[JavaMethodDescriptor]

'variable' @ [128:21] ==> val variable: LocalVariableImpl defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'isVisible' @ [128:30] ==> public open fun isVisible(p0: (StackFrame..StackFrame?)): Boolean defined in com.sun.tools.jdi.LocalVariableImpl[JavaMethodDescriptor]

'this' @ [128:40] ==> <this> defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[LazyClassReceiverParameterDescriptor]

'map' @ [129:21] ==> val map: HashMap<String, LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'put' @ [129:25] ==> public open fun put(key: String, value: LocalVariable): LocalVariable? defined in java.util.HashMap[JavaMethodDescriptor]

'name' @ [129:29] ==> val name: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'variable' @ [129:35] ==> val variable: LocalVariableImpl defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'visibleVariables' @ [132:13] ==> private final var visibleVariables: Map<String, LocalVariable>? defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'map' @ [132:32] ==> val map: HashMap<String, LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.createVisibleVariables[LocalVariableDescriptor]

'createVisibleVariables' @ [137:9] ==> private final fun createVisibleVariables(): Unit defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[SimpleFunctionDescriptorImpl]

'ArrayList' @ [138:25] ==> public constructor ArrayList<E : (Any..Any?)>(p0: (MutableCollection<out (LocalVariable..LocalVariable?)>..Collection<(LocalVariable..LocalVariable?)>?)) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> LocalVariable

'visibleVariables' @ [138:35] ==> private final var visibleVariables: Map<String, LocalVariable>? defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'values' @ [138:54] ==> public abstract val values: Collection<LocalVariable> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'sort' @ [139:21] ==> public open fun <T : (Comparable<(LocalVariable..LocalVariable?)>..Comparable<(LocalVariable..LocalVariable?)>?)> sort(p0: (MutableList<(LocalVariable..LocalVariable?)>..List<(LocalVariable..LocalVariable?)>?)): Unit defined in java.util.Collections[JavaMethodDescriptor]
Inferred types:
    <T : (Comparable<(T..T?)>..Comparable<(T..T?)>?)> -> LocalVariable

'mapAsList' @ [139:26] ==> val mapAsList: ArrayList<LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.visibleVariables[LocalVariableDescriptor]

'mapAsList' @ [140:16] ==> val mapAsList: ArrayList<LocalVariable> defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.visibleVariables[LocalVariableDescriptor]

'createVisibleVariables' @ [144:9] ==> private final fun createVisibleVariables(): Unit defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[SimpleFunctionDescriptorImpl]

'visibleVariables' @ [145:16] ==> private final var visibleVariables: Map<String, LocalVariable>? defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'name' @ [145:35] ==> value-parameter name: String defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame.visibleVariableByName[ValueParameterDescriptorImpl]

'emptyMap' @ [149:89] ==> public fun <K, V> emptyMap(): Map<LocalVariable, Value> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> LocalVariable
    <V> -> Value

'emptyList' @ [153:53] ==> public fun <T> emptyList(): List<Value> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Value

'vm' @ [154:37] ==> private final val vm: VirtualMachine defined in org.jetbrains.kotlin.idea.debugger.MockStackFrame[PropertyDescriptorImpl]

'location' @ [160:18] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isInSuspendMethod[ValueParameterDescriptorImpl]

'method' @ [160:27] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'method' @ [161:21] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.isInSuspendMethod[LocalVariableDescriptor]

'signature' @ [161:28] ==> public abstract fun signature(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'signature' @ [163:12] ==> val signature: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.isInSuspendMethod[LocalVariableDescriptor]

'contains' @ [163:22] ==> public operator fun CharSequence.contains(other: CharSequence, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'CONTINUATION_ASM_TYPE' @ [163:31] ==> @field:JvmField public val CONTINUATION_ASM_TYPE: Type defined in org.jetbrains.kotlin.codegen.coroutines[DeserializedPropertyDescriptor]

'toString' @ [163:53] ==> public open fun toString(): String defined in org.jetbrains.org.objectweb.asm.Type[JavaMethodDescriptor]

'method' @ [164:13] ==> val method: (Method..Method?) defined in org.jetbrains.kotlin.idea.debugger.isInSuspendMethod[LocalVariableDescriptor]

'name' @ [164:20] ==> public abstract fun name(): (String..String?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'DO_RESUME_METHOD_NAME' @ [164:30] ==> public const val DO_RESUME_METHOD_NAME: String defined in org.jetbrains.kotlin.codegen.coroutines[DeserializedPropertyDescriptor]

'signature' @ [164:55] ==> val signature: (String..String?) defined in org.jetbrains.kotlin.idea.debugger.isInSuspendMethod[LocalVariableDescriptor]

'DO_RESUME_SIGNATURE' @ [164:68] ==> private val DO_RESUME_SIGNATURE: String defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[PropertyDescriptorImpl]

'!' @ [168:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInSuspendMethod' @ [168:10] ==> public fun isInSuspendMethod(location: Location): Boolean defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [168:28] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.suspendFunctionFirstLineLocation[ValueParameterDescriptorImpl]

'location' @ [172:22] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.suspendFunctionFirstLineLocation[ValueParameterDescriptorImpl]

'method' @ [172:31] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'location' @ [172:40] ==> public abstract fun location(): (Location..Location?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'lineNumber' @ [172:51] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'lineNumber' @ [173:9] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.debugger.suspendFunctionFirstLineLocation[LocalVariableDescriptor]

'-' @ [173:23] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'lineNumber' @ [177:12] ==> val lineNumber: Int defined in org.jetbrains.kotlin.idea.debugger.suspendFunctionFirstLineLocation[LocalVariableDescriptor]

'suspendFunctionFirstLineLocation' @ [181:34] ==> public fun suspendFunctionFirstLineLocation(location: Location): Int? defined in org.jetbrains.kotlin.idea.debugger in file debuggerUtil.kt[SimpleFunctionDescriptorImpl]

'location' @ [181:67] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isOnSuspendReturnOrReenter[ValueParameterDescriptorImpl]

'suspendStartLineNumber' @ [182:12] ==> val suspendStartLineNumber: Int defined in org.jetbrains.kotlin.idea.debugger.isOnSuspendReturnOrReenter[LocalVariableDescriptor]

'location' @ [182:38] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isOnSuspendReturnOrReenter[ValueParameterDescriptorImpl]

'lineNumber' @ [182:47] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'location' @ [186:22] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isLastLineLocationInMethod[ValueParameterDescriptorImpl]

'method' @ [186:31] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'allLineLocations' @ [186:40] ==> public abstract fun allLineLocations(): (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'map' @ [186:59] ==> public inline fun <T, R> Iterable<(Location..Location?)>.map(transform: ((Location..Location?)) -> Int): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Location..com.sun.jdi.Location?)
    <R> -> Int

'it' @ [186:65] ==> value-parameter it: (Location..Location?) defined in org.jetbrains.kotlin.idea.debugger.isLastLineLocationInMethod.<anonymous>[ValueParameterDescriptorImpl]

'lineNumber' @ [186:68] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'filter' @ [186:83] ==> public inline fun <T> Iterable<Int>.filter(predicate: (Int) -> Boolean): List<Int> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int

'it' @ [186:92] ==> value-parameter it: Int defined in org.jetbrains.kotlin.idea.debugger.isLastLineLocationInMethod.<anonymous>[ValueParameterDescriptorImpl]

'-' @ [186:98] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'knownLines' @ [187:9] ==> val knownLines: List<Int> defined in org.jetbrains.kotlin.idea.debugger.isLastLineLocationInMethod[LocalVariableDescriptor]

'isEmpty' @ [187:20] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'knownLines' @ [191:12] ==> val knownLines: List<Int> defined in org.jetbrains.kotlin.idea.debugger.isLastLineLocationInMethod[LocalVariableDescriptor]

'max' @ [191:23] ==> public fun <T : Comparable<Int>> Iterable<Int>.max(): Int? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> Int

'location' @ [191:32] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isLastLineLocationInMethod[ValueParameterDescriptorImpl]

'lineNumber' @ [191:41] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'location' @ [195:28] ==> value-parameter location: Location defined in org.jetbrains.kotlin.idea.debugger.isOneLineMethod[ValueParameterDescriptorImpl]

'method' @ [195:37] ==> public abstract fun method(): (Method..Method?) defined in com.sun.jdi.Location[JavaMethodDescriptor]

'allLineLocations' @ [195:46] ==> public abstract fun allLineLocations(): (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in com.sun.jdi.Method[JavaMethodDescriptor]

'allLineLocations' @ [196:21] ==> val allLineLocations: (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in org.jetbrains.kotlin.idea.debugger.isOneLineMethod[LocalVariableDescriptor]

'firstOrNull' @ [196:38] ==> public fun <T> List<(Location..Location?)>.firstOrNull(): Location? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Location..com.sun.jdi.Location?)

'lineNumber' @ [196:53] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'allLineLocations' @ [197:20] ==> val allLineLocations: (MutableList<(Location..Location?)>..List<(Location..Location?)>?) defined in org.jetbrains.kotlin.idea.debugger.isOneLineMethod[LocalVariableDescriptor]

'lastOrNull' @ [197:37] ==> public fun <T> List<(Location..Location?)>.lastOrNull(): Location? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.sun.jdi.Location..com.sun.jdi.Location?)

'lineNumber' @ [197:51] ==> public abstract fun lineNumber(): Int defined in com.sun.jdi.Location[JavaMethodDescriptor]

'firstLine' @ [199:12] ==> val firstLine: Int? defined in org.jetbrains.kotlin.idea.debugger.isOneLineMethod[LocalVariableDescriptor]

'firstLine' @ [199:33] ==> val firstLine: Int? defined in org.jetbrains.kotlin.idea.debugger.isOneLineMethod[LocalVariableDescriptor]

'lastLine' @ [199:46] ==> val lastLine: Int? defined in org.jetbrains.kotlin.idea.debugger.isOneLineMethod[LocalVariableDescriptor]

'file' @ [203:27] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[ValueParameterDescriptorImpl]

'getLineStartOffset' @ [203:32] ==> public fun PsiFile.getLineStartOffset(line: Int): Int? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'line' @ [203:51] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[ValueParameterDescriptorImpl]

'file' @ [204:25] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[ValueParameterDescriptorImpl]

'getLineEndOffset' @ [204:30] ==> public fun PsiFile.getLineEndOffset(line: Int): Int? defined in org.jetbrains.kotlin.idea.refactoring in file kotlinRefactoringUtil.kt[SimpleFunctionDescriptorImpl]

'line' @ [204:47] ==> value-parameter line: Int defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[ValueParameterDescriptorImpl]

'lineStartOffset' @ [208:20] ==> val lineStartOffset: Int defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'lineEndOffset' @ [208:42] ==> val lineEndOffset: Int defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'elementAt' @ [209:9] ==> var elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'file' @ [209:21] ==> value-parameter file: KtFile defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[ValueParameterDescriptorImpl]

'findElementAt' @ [209:26] ==> public open fun findElementAt(p0: Int): PsiElement? defined in org.jetbrains.kotlin.psi.KtFile[JavaMethodDescriptor]

'offset' @ [209:40] ==> val offset: Int defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'elementAt' @ [210:13] ==> var elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'topMostElement' @ [211:13] ==> var topMostElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'getTopmostElementAtOffset' @ [211:47] ==> @NotNull public open fun getTopmostElementAtOffset(@NotNull element: PsiElement, offset: Int): PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'elementAt' @ [211:73] ==> var elementAt: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'offset' @ [211:84] ==> val offset: Int defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'topMostElement' @ [212:17] ==> var topMostElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'topMostElement' @ [218:12] ==> var topMostElement: PsiElement? defined in org.jetbrains.kotlin.idea.debugger.findElementAtLine[LocalVariableDescriptor]

'element' @ [222:9] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[ValueParameterDescriptorImpl]

'when (element.node.elementType) {
        KtTokens.RPAR -> (element.parent as? KtValueArgumentList)?.parent as? KtCallExpression
        KtTokens.RBRACE -> {
            val braceParent = CodeInsightUtils.getTopParentWithEndOffset(element, KtCallExpression::class.java)
            when (braceParent) {
                is KtCallExpression -> braceParent
                is KtLambdaArgument -> braceParent.parent as? KtCallExpression
                is KtValueArgument -> (braceParent.parent as? KtValueArgumentList)?.parent as? KtCallExpression
                else -> null
            }
        }
        else -> null
    }' @ [224:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallExpression?, entry1: KtCallExpression?, entry2: KtCallExpression?): KtCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallExpression?

'element' @ [224:18] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[ValueParameterDescriptorImpl]

'node' @ [224:26] ==> public final val PsiElement.node: (ASTNode..ASTNode?)[MyPropertyDescriptor]

'elementType' @ [224:31] ==> public final val ASTNode.elementType: IElementType[MyPropertyDescriptor]

'RPAR' @ [225:18] ==> public final val RPAR: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'element' @ [225:27] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[ValueParameterDescriptorImpl]

'parent' @ [225:35] ==> public final val PsiElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [225:68] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'RBRACE' @ [226:18] ==> public final val RBRACE: (KtSingleValueToken..KtSingleValueToken?) defined in org.jetbrains.kotlin.lexer.KtTokens[JavaPropertyDescriptor]

'getTopParentWithEndOffset' @ [227:48] ==> @NotNull public open fun getTopParentWithEndOffset(@NotNull element: PsiElement, @NotNull stopAt: Class<*>): PsiElement defined in org.jetbrains.kotlin.idea.codeInsight.CodeInsightUtils[JavaMethodDescriptor]

'element' @ [227:74] ==> value-parameter element: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[ValueParameterDescriptorImpl]

'KtCallExpression' @ [227:83] ==> public constructor KtCallExpression(@NotNull p0: ASTNode) defined in org.jetbrains.kotlin.psi.KtCallExpression[JavaClassConstructorDescriptor]

'java' @ [227:107] ==> public val <T> KClass<KtCallExpression>.java: Class<KtCallExpression> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> KtCallExpression

'when (braceParent) {
                is KtCallExpression -> braceParent
                is KtLambdaArgument -> braceParent.parent as? KtCallExpression
                is KtValueArgument -> (braceParent.parent as? KtValueArgumentList)?.parent as? KtCallExpression
                else -> null
            }' @ [228:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KtCallExpression?, entry1: KtCallExpression?, entry2: KtCallExpression?, entry3: KtCallExpression?): KtCallExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KtCallExpression?

'braceParent' @ [228:19] ==> val braceParent: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[LocalVariableDescriptor]

'braceParent' @ [229:40] ==> val braceParent: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[LocalVariableDescriptor]

'braceParent' @ [230:40] ==> val braceParent: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[LocalVariableDescriptor]

'parent' @ [230:52] ==> public final val KtLambdaArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'braceParent' @ [231:40] ==> val braceParent: PsiElement defined in org.jetbrains.kotlin.idea.debugger.findCallByEndToken[LocalVariableDescriptor]

'parent' @ [231:52] ==> public final val KtValueArgument.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'parent' @ [231:85] ==> public final val KtValueArgumentList.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

