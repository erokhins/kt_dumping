'Suppress' @ [29:1] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'state' @ [35:25] ==> public abstract val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[PropertyDescriptorImpl]

'asState' @ [35:31] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out GenericReplEvaluatorState>): GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[SimpleFunctionDescriptorImpl]
Inferred types:
    <StateT : IReplStageState<*>> -> GenericReplEvaluatorState

'GenericReplEvaluatorState' @ [35:39] ==> public constructor GenericReplEvaluatorState(baseClasspath: Iterable<File>, baseClassloader: ClassLoader?, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[ClassConstructorDescriptorImpl]

'java' @ [35:72] ==> public val <T> KClass<GenericReplEvaluatorState>.java: Class<GenericReplEvaluatorState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenericReplEvaluatorState

'evalState' @ [36:16] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory[LocalVariableDescriptor]

'history' @ [36:26] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'map' @ [36:34] ==> public inline fun <T, R> Iterable<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.map(transform: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> EvalClassWithInstanceAndLoader): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>
    <R> -> EvalClassWithInstanceAndLoader

'it' @ [36:40] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [36:43] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'filter' @ [36:50] ==> public inline fun <T> Iterable<EvalClassWithInstanceAndLoader>.filter(predicate: (EvalClassWithInstanceAndLoader) -> Boolean): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'it' @ [36:59] ==> value-parameter it: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[ValueParameterDescriptorImpl]

'instance' @ [36:62] ==> public final val instance: Any? defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'reversed' @ [36:81] ==> public fun <T> Iterable<EvalClassWithInstanceAndLoader>.reversed(): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'ensureNotEmpty' @ [36:92] ==> internal fun <T : Any> List<EvalClassWithInstanceAndLoader>.ensureNotEmpty(error: String): List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> EvalClassWithInstanceAndLoader

'let' @ [36:121] ==> @InlineOnly public inline fun <T, R> List<EvalClassWithInstanceAndLoader>.let(block: (List<EvalClassWithInstanceAndLoader>) -> List<EvalClassWithInstanceAndLoader>): List<EvalClassWithInstanceAndLoader> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<EvalClassWithInstanceAndLoader>
    <R> -> List<EvalClassWithInstanceAndLoader>

'if (receiverInstance != null) {
                val receiverKlass = receiverClass ?: receiverInstance::class.java.kotlin
                val receiverInHistory = history.find { it.instance == receiverInstance } ?:
                                        EvalClassWithInstanceAndLoader(receiverKlass, receiverInstance, receiverKlass.java.classLoader, history.first().invokeWrapper)
                listOf(receiverInHistory) + history.filterNot { it == receiverInHistory }
            }
            else {
                history
            }' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<EvalClassWithInstanceAndLoader>, elseBranch: List<EvalClassWithInstanceAndLoader>): List<EvalClassWithInstanceAndLoader>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<EvalClassWithInstanceAndLoader>

'receiverInstance' @ [37:17] ==> value-parameter receiverInstance: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory[ValueParameterDescriptorImpl]

'receiverClass' @ [38:37] ==> value-parameter receiverClass: KClass<*>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory[ValueParameterDescriptorImpl]

'receiverInstance' @ [38:54] ==> value-parameter receiverInstance: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory[ValueParameterDescriptorImpl]

'java' @ [38:78] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'kotlin' @ [38:83] ==> public val <T : Any> Class<out Any>.kotlin: KClass<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out Any)

'history' @ [39:41] ==> value-parameter history: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[ValueParameterDescriptorImpl]

'find' @ [39:49] ==> @InlineOnly public inline fun <T> Iterable<EvalClassWithInstanceAndLoader>.find(predicate: (EvalClassWithInstanceAndLoader) -> Boolean): EvalClassWithInstanceAndLoader? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'it' @ [39:56] ==> value-parameter it: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'instance' @ [39:59] ==> public final val instance: Any? defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'receiverInstance' @ [39:71] ==> value-parameter receiverInstance: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory[ValueParameterDescriptorImpl]

'EvalClassWithInstanceAndLoader' @ [40:41] ==> public constructor EvalClassWithInstanceAndLoader(klass: KClass<*>, instance: Any?, classLoader: ClassLoader, invokeWrapper: InvokeWrapper?) defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[ClassConstructorDescriptorImpl]

'receiverKlass' @ [40:72] ==> val receiverKlass: KClass<out Any> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[LocalVariableDescriptor]

'receiverInstance' @ [40:87] ==> value-parameter receiverInstance: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory[ValueParameterDescriptorImpl]

'receiverKlass' @ [40:105] ==> val receiverKlass: KClass<out Any> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[LocalVariableDescriptor]

'java' @ [40:119] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'classLoader' @ [40:124] ==> public final val <T : (Any..Any?)> Class<out Any>.classLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'history' @ [40:137] ==> value-parameter history: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [40:145] ==> public fun <T> List<EvalClassWithInstanceAndLoader>.first(): EvalClassWithInstanceAndLoader defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'invokeWrapper' @ [40:153] ==> public final val invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'listOf' @ [41:17] ==> public fun <T> listOf(element: EvalClassWithInstanceAndLoader): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'receiverInHistory' @ [41:24] ==> val receiverInHistory: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[LocalVariableDescriptor]

'history' @ [41:45] ==> value-parameter history: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[ValueParameterDescriptorImpl]

'filterNot' @ [41:53] ==> public inline fun <T> Iterable<EvalClassWithInstanceAndLoader>.filterNot(predicate: (EvalClassWithInstanceAndLoader) -> Boolean): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'it' @ [41:65] ==> value-parameter it: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'receiverInHistory' @ [41:71] ==> val receiverInHistory: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[LocalVariableDescriptor]

'history' @ [44:17] ==> value-parameter history: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.prioritizedHistory.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [50:13] ==> value-parameter name: String? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeFunction[ValueParameterDescriptorImpl]

'NullPointerException' @ [50:43] ==> public constructor NullPointerException(p0: (String..String?)) defined in java.lang.NullPointerException[JavaClassConstructorDescriptor]

'invokeImpl' @ [51:16] ==> private final fun invokeImpl(prioritizedCallOrder: List<EvalClassWithInstanceAndLoader>, name: String, args: Array<out Any?>): Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]

'prioritizedHistory' @ [51:27] ==> private final fun prioritizedHistory(receiverClass: KClass<*>?, receiverInstance: Any?): List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]

'name' @ [51:59] ==> value-parameter name: String? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeFunction[ValueParameterDescriptorImpl]

'args' @ [51:65] ==> value-parameter vararg args: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeFunction[ValueParameterDescriptorImpl]

'name' @ [55:13] ==> value-parameter name: String? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeMethod[ValueParameterDescriptorImpl]

'NullPointerException' @ [55:43] ==> public constructor NullPointerException(p0: (String..String?)) defined in java.lang.NullPointerException[JavaClassConstructorDescriptor]

'thiz' @ [56:13] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeMethod[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [56:33] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'invokeImpl' @ [57:16] ==> private final fun invokeImpl(prioritizedCallOrder: List<EvalClassWithInstanceAndLoader>, name: String, args: Array<out Any?>): Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]

'prioritizedHistory' @ [57:27] ==> private final fun prioritizedHistory(receiverClass: KClass<*>?, receiverInstance: Any?): List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]

'thiz' @ [57:46] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeMethod[ValueParameterDescriptorImpl]

'java' @ [57:58] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'kotlin' @ [57:63] ==> public val <T : Any> Class<out Any>.kotlin: KClass<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out Any)

'thiz' @ [57:71] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeMethod[ValueParameterDescriptorImpl]

'name' @ [57:78] ==> value-parameter name: String? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeMethod[ValueParameterDescriptorImpl]

'args' @ [57:84] ==> value-parameter vararg args: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeMethod[ValueParameterDescriptorImpl]

'component1' @ [63:14] ==> public final operator fun component1(): KFunction<*> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [63:18] ==> public final operator fun component2(): Map<KParameter, Any?> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component3' @ [63:27] ==> public final operator fun component3(): InvokeWrapper? defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'prioritizedCallOrder' @ [63:44] ==> value-parameter prioritizedCallOrder: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[ValueParameterDescriptorImpl]

'asSequence' @ [63:65] ==> public fun <T> Iterable<EvalClassWithInstanceAndLoader>.asSequence(): Sequence<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'map' @ [63:78] ==> public fun <T, R> Sequence<EvalClassWithInstanceAndLoader>.map(transform: (EvalClassWithInstanceAndLoader) -> Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>?): Sequence<Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>?> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader
    <R> -> Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>?

'component1' @ [63:85] ==> public final operator fun component1(): KClass<*> defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[SimpleFunctionDescriptorImpl]

'component2' @ [63:92] ==> public final operator fun component2(): Any? defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[SimpleFunctionDescriptorImpl]

'component3' @ [63:102] ==> public final operator fun component3(): ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[SimpleFunctionDescriptorImpl]

'component4' @ [63:105] ==> public final operator fun component4(): InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[SimpleFunctionDescriptorImpl]

'klass' @ [64:30] ==> val klass: KClass<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>[LocalVariableDescriptor]

'functions' @ [64:36] ==> @SinceKotlin public val KClass<*>.functions: Collection<KFunction<*>> defined in kotlin.reflect.full[DeserializedPropertyDescriptor]

'filter' @ [64:46] ==> public inline fun <T> Iterable<KFunction<*>>.filter(predicate: (KFunction<*>) -> Boolean): List<KFunction<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KFunction<*>

'it' @ [64:55] ==> value-parameter it: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [64:58] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'name' @ [64:66] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[ValueParameterDescriptorImpl]

'candidates' @ [65:13] ==> val candidates: List<KFunction<*>> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>[LocalVariableDescriptor]

'findMapping' @ [65:24] ==> private fun Iterable<KFunction<*>>.findMapping(args: List<Any?>): Pair<KFunction<*>, Map<KParameter, Any?>>? defined in org.jetbrains.kotlin.cli.common.repl in file KotlinJsr223JvmInvocableScriptEngine.kt[SimpleFunctionDescriptorImpl]

'listOf' @ [65:36] ==> public fun <T> listOf(element: Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'instance' @ [65:43] ==> val instance: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>[LocalVariableDescriptor]

'args' @ [65:55] ==> value-parameter args: Array<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[ValueParameterDescriptorImpl]

'let' @ [65:62] ==> @InlineOnly public inline fun <T, R> Pair<KFunction<*>, Map<KParameter, Any?>>.let(block: (Pair<KFunction<*>, Map<KParameter, Any?>>) -> Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>): Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<KFunction<*>, Map<KParameter, Any?>>
    <R> -> Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>

'Triple' @ [66:17] ==> public constructor Triple<out A, out B, out C>(first: KFunction<*>, second: Map<KParameter, Any?>, third: InvokeWrapper?) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> KFunction<*>
    <out B> -> Map<KParameter, Any?>
    <out C> -> InvokeWrapper?

'it' @ [66:24] ==> value-parameter it: Pair<KFunction<*>, Map<KParameter, Any?>> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [66:27] ==> public final val first: KFunction<*> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'it' @ [66:34] ==> value-parameter it: Pair<KFunction<*>, Map<KParameter, Any?>> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [66:37] ==> public final val second: Map<KParameter, Any?> defined in kotlin.Pair[DeserializedPropertyDescriptor]

'invokeWrapper' @ [66:45] ==> val invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl.<anonymous>[LocalVariableDescriptor]

'filterNotNull' @ [68:11] ==> public fun <T : Any> Sequence<Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>?>.filterNotNull(): Sequence<Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>

'firstOrNull' @ [68:27] ==> public fun <T> Sequence<Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>>.firstOrNull(): Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Triple<KFunction<*>, Map<KParameter, Any?>, InvokeWrapper?>

'NoSuchMethodException' @ [68:50] ==> public constructor NoSuchMethodException(p0: (String..String?)) defined in java.lang.NoSuchMethodException[JavaClassConstructorDescriptor]

'name' @ [68:96] ==> value-parameter name: String defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[ValueParameterDescriptorImpl]

'if (invokeWrapper != null) {
                invokeWrapper.invoke {
                    fn.callBy(mapping)
                }
            }
            else {
                fn.callBy(mapping)
            }' @ [71:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'invokeWrapper' @ [71:17] ==> val invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'invokeWrapper' @ [72:17] ==> val invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'invoke' @ [72:31] ==> public abstract operator fun <T> invoke(body: () -> Any?): Any? defined in org.jetbrains.kotlin.cli.common.repl.InvokeWrapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> Any?

'fn' @ [73:21] ==> val fn: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'callBy' @ [73:24] ==> public abstract fun callBy(args: Map<KParameter, Any?>): Any? defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'mapping' @ [73:31] ==> val mapping: Map<KParameter, Any?> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'fn' @ [77:17] ==> val fn: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'callBy' @ [77:20] ==> public abstract fun callBy(args: Map<KParameter, Any?>): Any? defined in kotlin.reflect.KFunction[DeserializedSimpleFunctionDescriptor]

'mapping' @ [77:27] ==> val mapping: Map<KParameter, Any?> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'ScriptException' @ [82:19] ==> public constructor ScriptException(p0: (String..String?)) defined in javax.script.ScriptException[JavaClassConstructorDescriptor]

'renderReplStackTrace' @ [82:35] ==> public fun renderReplStackTrace(cause: Throwable, startFromMethodName: String): String defined in org.jetbrains.kotlin.cli.common.repl in file replUtil.kt[SimpleFunctionDescriptorImpl]

'e' @ [82:56] ==> val e: Throwable defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'cause' @ [82:58] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'fn' @ [82:89] ==> val fn: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'name' @ [82:92] ==> public abstract val name: String defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'if (fn.returnType.classifier == Unit::class) Unit else res' @ [84:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Any?, elseBranch: Any?): Any?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Any?

'fn' @ [84:20] ==> val fn: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'returnType' @ [84:23] ==> public abstract val returnType: KType defined in kotlin.reflect.KFunction[DeserializedPropertyDescriptor]

'classifier' @ [84:34] ==> @SinceKotlin public abstract val classifier: KClassifier? defined in kotlin.reflect.KType[DeserializedPropertyDescriptor]

'Unit' @ [84:48] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'Unit' @ [84:61] ==> public object Unit defined in kotlin[FakeCallableDescriptorForObject]

'res' @ [84:71] ==> val res: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.invokeImpl[LocalVariableDescriptor]

'proxyInterface' @ [89:16] ==> private final fun <T : Any> proxyInterface(thiz: Any?, clasz: Class<T>?): T? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'clasz' @ [89:37] ==> value-parameter clasz: Class<T>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.getInterface[ValueParameterDescriptorImpl]

'thiz' @ [93:13] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.getInterface[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [93:33] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'proxyInterface' @ [94:16] ==> private final fun <T : Any> proxyInterface(thiz: Any?, clasz: Class<T>?): T? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> T

'thiz' @ [94:31] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.getInterface[ValueParameterDescriptorImpl]

'clasz' @ [94:37] ==> value-parameter clasz: Class<T>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.getInterface[ValueParameterDescriptorImpl]

'state' @ [98:13] ==> public abstract val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[PropertyDescriptorImpl]

'history' @ [98:19] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'size' @ [98:27] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'IllegalStateException' @ [98:44] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'prioritizedHistory' @ [99:24] ==> private final fun prioritizedHistory(receiverClass: KClass<*>?, receiverInstance: Any?): List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]

'thiz' @ [99:43] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[ValueParameterDescriptorImpl]

'javaClass' @ [99:49] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'kotlin' @ [99:60] ==> public val <T : Any> Class<Any>.kotlin: KClass<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'thiz' @ [99:68] ==> value-parameter thiz: Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[ValueParameterDescriptorImpl]

'clasz' @ [101:13] ==> value-parameter clasz: Class<T>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[ValueParameterDescriptorImpl]

'IllegalArgumentException' @ [101:34] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'!' @ [102:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'clasz' @ [102:14] ==> value-parameter clasz: Class<T>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[ValueParameterDescriptorImpl]

'isInterface' @ [102:20] ==> public final val <T : (Any..Any?)> Class<T>.isInterface: Boolean[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> T

'IllegalArgumentException' @ [102:39] ==> public final fun <init>(p0: (String..String?)): IllegalArgumentException /* = IllegalArgumentException */ defined in kotlin.IllegalArgumentException[TypeAliasConstructorDescriptorImpl]

'newProxyInstance' @ [106:27] ==> @CallerSensitive public final fun newProxyInstance(p0: (ClassLoader..ClassLoader?), p1: (Array<(Class<*>..Class<*>?)>..Array<out (Class<*>..Class<*>?)>?), p2: (((Any..Any?), (Method..Method?), (Array<(Any..Any?)>..Array<out (Any..Any?)>?)) -> (Any..Any?)..(((Any..Any?), (Method..Method?), (Array<(Any..Any?)>..Array<out (Any..Any?)>?)) -> (Any..Any?))?)): (Any..Any?) defined in java.lang.reflect.Proxy[SamAdapterFunctionDescriptor]

'currentThread' @ [106:51] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [106:67] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'arrayOf' @ [106:87] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Class<T>): Array<Class<T>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<T>

'clasz' @ [106:95] ==> value-parameter clasz: Class<T>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[ValueParameterDescriptorImpl]

'invokeImpl' @ [107:13] ==> private final fun invokeImpl(prioritizedCallOrder: List<EvalClassWithInstanceAndLoader>, name: String, args: Array<out Any?>): Any? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine[SimpleFunctionDescriptorImpl]

'priority' @ [107:24] ==> val priority: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[LocalVariableDescriptor]

'method' @ [107:34] ==> value-parameter method: (Method..Method?) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface.<anonymous>[ValueParameterDescriptorImpl]

'name' @ [107:41] ==> public final val Method.name: (String..String?)[MyPropertyDescriptor]

'args' @ [107:47] ==> value-parameter args: (Array<(Any..Any?)>..Array<out (Any..Any?)>?) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface.<anonymous>[ValueParameterDescriptorImpl]

'emptyArray' @ [107:55] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Any?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any?

'clasz' @ [109:16] ==> value-parameter clasz: Class<T>? defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[ValueParameterDescriptorImpl]

'kotlin' @ [109:22] ==> public val <T : Any> Class<T>.kotlin: KClass<T> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> T

'safeCast' @ [109:29] ==> @SinceKotlin public fun <T : Any> KClass<T>.safeCast(value: Any?): T? defined in kotlin.reflect.full[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> T

'proxy' @ [109:38] ==> val proxy: (Any..Any?) defined in org.jetbrains.kotlin.cli.common.repl.KotlinJsr223JvmInvocableScriptEngine.proxyInterface[LocalVariableDescriptor]

'this' @ [114:16] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.findMapping[ReceiverParameterDescriptorImpl]

'tryCreateCallableMapping' @ [115:23] ==> public fun tryCreateCallableMapping(callable: KCallable<*>, args: List<Any?>): Map<KParameter, Any?>? defined in org.jetbrains.kotlin.script[DeserializedSimpleFunctionDescriptor]

'fn' @ [115:48] ==> val fn: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.findMapping[LocalVariableDescriptor]

'args' @ [115:52] ==> value-parameter args: List<Any?> defined in org.jetbrains.kotlin.cli.common.repl.findMapping[ValueParameterDescriptorImpl]

'mapping' @ [116:13] ==> val mapping: Map<KParameter, Any?>? defined in org.jetbrains.kotlin.cli.common.repl.findMapping[LocalVariableDescriptor]

'fn' @ [116:37] ==> val fn: KFunction<*> defined in org.jetbrains.kotlin.cli.common.repl.findMapping[LocalVariableDescriptor]

'mapping' @ [116:43] ==> val mapping: Map<KParameter, Any?>? defined in org.jetbrains.kotlin.cli.common.repl.findMapping[LocalVariableDescriptor]

