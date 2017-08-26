'currentThread' @ [27:52] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [27:68] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'REPEAT_ONLY_MOST_RECENT' @ [29:76] ==> enum entry REPEAT_ONLY_MOST_RECENT defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'GenericReplEvaluatorState' @ [32:82] ==> public constructor GenericReplEvaluatorState(baseClasspath: Iterable<File>, baseClassloader: ClassLoader?, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[ClassConstructorDescriptorImpl]

'baseClasspath' @ [32:108] ==> public final val baseClasspath: Iterable<File> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[PropertyDescriptorImpl]

'baseClassloader' @ [32:123] ==> public final val baseClassloader: ClassLoader? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[PropertyDescriptorImpl]

'lock' @ [32:140] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.createState[ValueParameterDescriptorImpl]

'state' @ [38:9] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'lock' @ [38:15] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'write' @ [38:20] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Nothing): Nothing defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Nothing

'state' @ [39:29] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'asState' @ [39:35] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out GenericReplEvaluatorState>): GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[SimpleFunctionDescriptorImpl]
Inferred types:
    <StateT : IReplStageState<*>> -> GenericReplEvaluatorState

'GenericReplEvaluatorState' @ [39:43] ==> public constructor GenericReplEvaluatorState(baseClasspath: Iterable<File>, baseClassloader: ClassLoader?, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[ClassConstructorDescriptorImpl]

'java' @ [39:76] ==> public val <T> KClass<GenericReplEvaluatorState>.java: Class<GenericReplEvaluatorState> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> GenericReplEvaluatorState

'when (repeatingMode) {
                ReplRepeatingMode.NONE -> HistoryActionsForNoRepeat(evalState)
                ReplRepeatingMode.REPEAT_ONLY_MOST_RECENT -> {
                    val lastItem = evalState.history.peek()
                    if (lastItem == null || lastItem.id != compileResult.lineId) {
                        HistoryActionsForNoRepeat(evalState)
                    }
                    else {
                        HistoryActionsForRepeatRecentOnly(evalState)
                    }
                }
                ReplRepeatingMode.REPEAT_ANY_PREVIOUS -> {
                    val matchingItem = evalState.history.firstOrNull { it.id == compileResult.lineId }
                    if (matchingItem == null) {
                        HistoryActionsForNoRepeat(evalState)
                    }
                    else {
                        HistoryActionsForRepeatAny(evalState, matchingItem)
                    }
                }
            }' @ [40:32] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: HistoryActionsForNoRepeat, entry1: HistoryActionsForNoRepeat, entry2: HistoryActionsForNoRepeat): HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> HistoryActionsForNoRepeat

'repeatingMode' @ [40:38] ==> protected final val repeatingMode: ReplRepeatingMode defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[PropertyDescriptorImpl]

'NONE' @ [41:35] ==> enum entry NONE defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'HistoryActionsForNoRepeat' @ [41:43] ==> public constructor HistoryActionsForNoRepeat(state: GenericReplEvaluatorState) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[ClassConstructorDescriptorImpl]

'evalState' @ [41:69] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'REPEAT_ONLY_MOST_RECENT' @ [42:35] ==> enum entry REPEAT_ONLY_MOST_RECENT defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'evalState' @ [43:36] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'history' @ [43:46] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'peek' @ [43:54] ==> public open fun peek(): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'if (lastItem == null || lastItem.id != compileResult.lineId) {
                        HistoryActionsForNoRepeat(evalState)
                    }
                    else {
                        HistoryActionsForRepeatRecentOnly(evalState)
                    }' @ [44:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HistoryActionsForNoRepeat, elseBranch: HistoryActionsForNoRepeat): HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HistoryActionsForNoRepeat

'lastItem' @ [44:25] ==> val lastItem: ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'lastItem' @ [44:45] ==> val lastItem: ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'id' @ [44:54] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'compileResult' @ [44:60] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'lineId' @ [44:74] ==> public final val lineId: LineId defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'HistoryActionsForNoRepeat' @ [45:25] ==> public constructor HistoryActionsForNoRepeat(state: GenericReplEvaluatorState) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[ClassConstructorDescriptorImpl]

'evalState' @ [45:51] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'HistoryActionsForRepeatRecentOnly' @ [48:25] ==> public constructor HistoryActionsForRepeatRecentOnly(state: GenericReplEvaluatorState) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[ClassConstructorDescriptorImpl]

'evalState' @ [48:59] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'REPEAT_ANY_PREVIOUS' @ [51:35] ==> enum entry REPEAT_ANY_PREVIOUS defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'evalState' @ [52:40] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'history' @ [52:50] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'firstOrNull' @ [52:58] ==> public inline fun <T> Iterable<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.firstOrNull(predicate: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> Boolean): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>

'it' @ [52:72] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [52:75] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'compileResult' @ [52:81] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'lineId' @ [52:95] ==> public final val lineId: LineId defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'if (matchingItem == null) {
                        HistoryActionsForNoRepeat(evalState)
                    }
                    else {
                        HistoryActionsForRepeatAny(evalState, matchingItem)
                    }' @ [53:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: HistoryActionsForNoRepeat, elseBranch: HistoryActionsForNoRepeat): HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> HistoryActionsForNoRepeat

'matchingItem' @ [53:25] ==> val matchingItem: ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'HistoryActionsForNoRepeat' @ [54:25] ==> public constructor HistoryActionsForNoRepeat(state: GenericReplEvaluatorState) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[ClassConstructorDescriptorImpl]

'evalState' @ [54:51] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'HistoryActionsForRepeatAny' @ [57:25] ==> public constructor HistoryActionsForRepeatAny(state: GenericReplEvaluatorState, matchingLine: ReplHistoryRecord<EvalClassWithInstanceAndLoader>) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[ClassConstructorDescriptorImpl]

'evalState' @ [57:52] ==> val evalState: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'matchingItem' @ [57:63] ==> val matchingItem: ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'historyActor' @ [62:33] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'firstMismatch' @ [62:46] ==> public open fun firstMismatch(other: Sequence<ILineId>): Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]

'compileResult' @ [62:60] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'previousLines' @ [62:74] ==> public final val previousLines: List<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'asSequence' @ [62:88] ==> public fun <T> Iterable<ILineId>.asSequence(): Sequence<ILineId> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId

'firstMismatch' @ [63:17] ==> val firstMismatch: Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'ReplEvalResult' @ [64:29] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult[FakeCallableDescriptorForObject]

'HistoryMismatch' @ [64:44] ==> public constructor HistoryMismatch(lineNo: Int) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.HistoryMismatch[ClassConstructorDescriptorImpl]

'firstMismatch' @ [64:60] ==> val firstMismatch: Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'first' @ [64:74] ==> public final val first: ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'id' @ [64:81] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'no' @ [64:85] ==> public abstract val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ILineId[PropertyDescriptorImpl]

'firstMismatch' @ [64:91] ==> val firstMismatch: Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'second' @ [64:105] ==> public final val second: ILineId? defined in kotlin.Pair[DeserializedPropertyDescriptor]

'no' @ [64:113] ==> public abstract val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ILineId[PropertyDescriptorImpl]

'-' @ [64:119] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'component1' @ [67:18] ==> public final operator fun component1(): ClassLoader defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [67:31] ==> public final operator fun component2(): Class<out Any> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'historyActor' @ [68:17] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'processClasses' @ [68:30] ==> public open fun processClasses(compileResult: ReplCompileResult.CompiledClasses): Pair<ClassLoader, Class<out Any>> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]

'compileResult' @ [68:45] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'ReplEvalResult' @ [71:29] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult[FakeCallableDescriptorForObject]

'Runtime' @ [71:50] ==> public constructor Runtime(message: String, cause: Exception? /* = Exception? */ = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.Runtime[ClassConstructorDescriptorImpl]

'e' @ [71:58] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'message' @ [71:60] ==> public open val message: String? defined in java.lang.Exception[DeserializedPropertyDescriptor]

'e' @ [71:82] ==> val e: Exception /* = Exception */ defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'scriptArgs' @ [74:37] ==> value-parameter scriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'fallbackScriptArgs' @ [74:51] ==> protected final val fallbackScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[PropertyDescriptorImpl]

'currentScriptArgs' @ [75:33] ==> val currentScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'scriptArgs' @ [75:52] ==> public final val scriptArgs: Array<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[PropertyDescriptorImpl]

'currentScriptArgs' @ [76:38] ==> val currentScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'scriptArgsTypes' @ [76:57] ==> public final val scriptArgsTypes: Array<out KClass<out Any>> defined in org.jetbrains.kotlin.cli.common.repl.ScriptArgsWithTypes[PropertyDescriptorImpl]

'map' @ [76:74] ==> public inline fun <T, R> Array<out KClass<out Any>>.map(transform: (KClass<out Any>) -> Class<out Any>): List<Class<out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KClass<out Any>
    <R> -> Class<out Any>

'it' @ [76:80] ==> value-parameter it: KClass<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'java' @ [76:83] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(out Any)

'historyActor' @ [78:30] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'effectiveHistory' @ [78:43] ==> public open val effectiveHistory: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'isNotEmpty' @ [78:60] ==> @InlineOnly public inline fun <T> Collection<EvalClassWithInstanceAndLoader>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'+' @ [80:54] ==> public operator fun <T> Array<Class<*>>.plus(elements: Collection<Class<*>>): Array<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'if (hasHistory) arrayOf<Class<*>>(Array<Any>::class.java) else emptyArray<Class<*>>()' @ [80:55] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<Class<*>>, elseBranch: Array<Class<*>>): Array<Class<*>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<Class<*>>

'hasHistory' @ [80:59] ==> val hasHistory: Boolean defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'arrayOf' @ [80:71] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Class<*>): Array<Class<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<*>

'Array' @ [80:89] ==> public constructor Array<T>(size: Int, init: (Int) -> ???) defined in kotlin.Array[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@69fc9b4b

'java' @ [80:107] ==> public val <T> KClass<Array<Any>>.java: Class<Array<Any>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Array<Any>

'emptyArray' @ [80:118] ==> public inline fun <reified @PureReifiable T> emptyArray(): Array<Class<*>> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Class<*>

'useScriptArgs' @ [81:55] ==> val useScriptArgs: Array<out Any?>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'mapIndexed' @ [81:70] ==> public inline fun <T, R> Array<out Any?>.mapIndexed(transform: (index: Int, Any?) -> Class<out Any>): List<Class<out Any>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?
    <R> -> Class<out Any>

'useScriptArgsTypes' @ [81:92] ==> val useScriptArgsTypes: List<Class<out Any>>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'getOrNull' @ [81:112] ==> public fun <T> List<Class<out Any>>.getOrNull(index: Int): Class<out Any>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<out Any>

'i' @ [81:122] ==> value-parameter i: Int defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [81:128] ==> value-parameter it: Any? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'javaClass' @ [81:132] ==> public val <T : Any> Any.javaClass: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Any

'Any' @ [81:145] ==> public constructor Any() defined in kotlin.Any[DeserializedClassConstructorDescriptor]

'java' @ [81:156] ==> public val <T> KClass<Any>.java: Class<Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Any

'emptyList' @ [81:166] ==> public fun <T> emptyList(): List<Class<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Class<*>

'if (hasHistory) arrayOf(historyActor.effectiveHistory.map { it.instance }.takeIf { it.isNotEmpty() }?.toTypedArray(),
                                                                           *(useScriptArgs.orEmpty()))
                                                   else useScriptArgs.orEmpty()' @ [83:52] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Array<out Any?>, elseBranch: Array<out Any?>): Array<out Any?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Array<out Any?>

'hasHistory' @ [83:56] ==> val hasHistory: Boolean defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'arrayOf' @ [83:68] ==> public inline fun <reified @PureReifiable T> arrayOf(vararg elements: Any?): Array<Any?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> Any?

'historyActor' @ [83:76] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'effectiveHistory' @ [83:89] ==> public open val effectiveHistory: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'map' @ [83:106] ==> public inline fun <T, R> Iterable<EvalClassWithInstanceAndLoader>.map(transform: (EvalClassWithInstanceAndLoader) -> Any?): List<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader
    <R> -> Any?

'it' @ [83:112] ==> value-parameter it: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'instance' @ [83:115] ==> public final val instance: Any? defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'takeIf' @ [83:126] ==> @InlineOnly @SinceKotlin public inline fun <T> List<Any?>.takeIf(predicate: (List<Any?>) -> Boolean): List<Any?>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<Any?>

'it' @ [83:135] ==> value-parameter it: List<Any?> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [83:138] ==> @InlineOnly public inline fun <T> Collection<Any?>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Any?

'toTypedArray' @ [83:154] ==> public inline fun <reified T> Collection<Any?>.toTypedArray(): Array<Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'useScriptArgs' @ [84:78] ==> val useScriptArgs: Array<out Any?>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'orEmpty' @ [84:92] ==> public inline fun <reified T> Array<out Any?>?.orEmpty(): Array<out Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'useScriptArgs' @ [85:57] ==> val useScriptArgs: Array<out Any?>? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'orEmpty' @ [85:71] ==> public inline fun <reified T> Array<out Any?>?.orEmpty(): Array<out Any?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified T> -> Any?

'scriptClass' @ [88:45] ==> val scriptClass: Class<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'getConstructor' @ [88:57] ==> @CallerSensitive public open fun getConstructor(vararg p0: (Class<*>..Class<*>?)): (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?) defined in java.lang.Class[JavaMethodDescriptor]

'constructorParams' @ [88:73] ==> val constructorParams: Array<Class<*>> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'historyActor' @ [90:13] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'addPlaceholder' @ [90:26] ==> public open fun addPlaceholder(lineId: ILineId, value: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]

'compileResult' @ [90:41] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'lineId' @ [90:55] ==> public final val lineId: LineId defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'EvalClassWithInstanceAndLoader' @ [90:63] ==> public constructor EvalClassWithInstanceAndLoader(klass: KClass<*>, instance: Any?, classLoader: ClassLoader, invokeWrapper: InvokeWrapper?) defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[ClassConstructorDescriptorImpl]

'scriptClass' @ [90:94] ==> val scriptClass: Class<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'kotlin' @ [90:106] ==> public val <T : Any> Class<out Any>.kotlin: KClass<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out Any)

'classLoader' @ [90:120] ==> val classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'invokeWrapper' @ [90:133] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'if (invokeWrapper != null) invokeWrapper.invoke { scriptInstanceConstructor.newInstance(*constructorArgs) }
                        else scriptInstanceConstructor.newInstance(*constructorArgs)' @ [94:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Any..Any?), elseBranch: (Any..Any?)): (Any..Any?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (kotlin.Any..kotlin.Any?)

'invokeWrapper' @ [94:29] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'invokeWrapper' @ [94:52] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'invoke' @ [94:66] ==> public abstract operator fun <T> invoke(body: () -> (Any..Any?)): (Any..Any?) defined in org.jetbrains.kotlin.cli.common.repl.InvokeWrapper[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> (kotlin.Any..kotlin.Any?)

'scriptInstanceConstructor' @ [94:75] ==> val scriptInstanceConstructor: (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'newInstance' @ [94:101] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'constructorArgs' @ [94:114] ==> val constructorArgs: Array<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'scriptInstanceConstructor' @ [95:30] ==> val scriptInstanceConstructor: (Constructor<out (Any..Any?)>..Constructor<out (Any..Any?)>?) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'newInstance' @ [95:56] ==> @CallerSensitive public open fun newInstance(vararg p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Constructor[JavaMethodDescriptor]

'constructorArgs' @ [95:69] ==> val constructorArgs: Array<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'ReplEvalResult' @ [99:37] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult[FakeCallableDescriptorForObject]

'Runtime' @ [99:58] ==> public constructor Runtime(message: String, cause: Exception? /* = Exception? */ = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.Runtime[ClassConstructorDescriptorImpl]

'renderReplStackTrace' @ [99:66] ==> public fun renderReplStackTrace(cause: Throwable, startFromMethodName: String): String defined in org.jetbrains.kotlin.cli.common.repl in file replUtil.kt[SimpleFunctionDescriptorImpl]

'e' @ [99:87] ==> val e: InvocationTargetException defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'cause' @ [99:89] ==> public open val cause: Throwable? defined in java.lang.reflect.InvocationTargetException[JavaPropertyDescriptor]

'scriptClass' @ [99:123] ==> val scriptClass: Class<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'name' @ [99:135] ==> public final val <T : (Any..Any?)> Class<out Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'e' @ [99:151] ==> val e: InvocationTargetException defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'targetException' @ [99:153] ==> public final val InvocationTargetException.targetException: (Throwable..Throwable?)[MyPropertyDescriptor]

'ReplEvalResult' @ [103:37] ==> public companion object defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult[FakeCallableDescriptorForObject]

'Runtime' @ [103:58] ==> public constructor Runtime(message: String, cause: Exception? /* = Exception? */ = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.Runtime[ClassConstructorDescriptorImpl]

'renderReplStackTrace' @ [103:66] ==> public fun renderReplStackTrace(cause: Throwable, startFromMethodName: String): String defined in org.jetbrains.kotlin.cli.common.repl in file replUtil.kt[SimpleFunctionDescriptorImpl]

'e' @ [103:87] ==> val e: Throwable defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'cause' @ [103:89] ==> public open val cause: Throwable? defined in kotlin.Throwable[DeserializedPropertyDescriptor]

'scriptClass' @ [103:123] ==> val scriptClass: Class<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'name' @ [103:135] ==> public final val <T : (Any..Any?)> Class<out Any>.name: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> Captured(out Any)

'e' @ [103:151] ==> val e: Throwable defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'historyActor' @ [106:25] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'removePlaceholder' @ [106:38] ==> public open fun removePlaceholder(lineId: ILineId): Boolean defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]

'compileResult' @ [106:56] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'lineId' @ [106:70] ==> public final val lineId: LineId defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'historyActor' @ [109:13] ==> val historyActor: HistoryActionsForNoRepeat defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'addFinal' @ [109:26] ==> public open fun addFinal(lineId: ILineId, value: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]

'compileResult' @ [109:35] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'lineId' @ [109:49] ==> public final val lineId: LineId defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'EvalClassWithInstanceAndLoader' @ [109:57] ==> public constructor EvalClassWithInstanceAndLoader(klass: KClass<*>, instance: Any?, classLoader: ClassLoader, invokeWrapper: InvokeWrapper?) defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[ClassConstructorDescriptorImpl]

'scriptClass' @ [109:88] ==> val scriptClass: Class<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'kotlin' @ [109:100] ==> public val <T : Any> Class<out Any>.kotlin: KClass<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T : Any> -> Captured(out Any)

'scriptInstance' @ [109:108] ==> val scriptInstance: (Any..Any?) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'classLoader' @ [109:124] ==> val classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'invokeWrapper' @ [109:137] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'scriptClass' @ [111:31] ==> val scriptClass: Class<out Any> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'getDeclaredField' @ [111:43] ==> @CallerSensitive public open fun getDeclaredField(p0: (String..String?)): (Field..Field?) defined in java.lang.Class[JavaMethodDescriptor]

'SCRIPT_RESULT_FIELD_NAME' @ [111:60] ==> private final val SCRIPT_RESULT_FIELD_NAME: String defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.Companion[PropertyDescriptorImpl]

'apply' @ [111:86] ==> @InlineOnly public inline fun <T> (Field..Field?).apply(block: (Field..Field?).() -> Unit): (Field..Field?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (java.lang.reflect.Field..java.lang.reflect.Field?)

'isAccessible' @ [111:94] ==> public final var Field.isAccessible: Boolean[MyPropertyDescriptor]

'resultField' @ [112:37] ==> val resultField: (Field..Field?) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'get' @ [112:49] ==> @CallerSensitive public open operator fun get(p0: (Any..Any?)): (Any..Any?) defined in java.lang.reflect.Field[JavaMethodDescriptor]

'scriptInstance' @ [112:53] ==> val scriptInstance: (Any..Any?) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'if (compileResult.hasResult) ReplEvalResult.ValueResult(resultValue, compileResult.type)
            else ReplEvalResult.UnitResult()' @ [114:20] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ReplEvalResult, elseBranch: ReplEvalResult): ReplEvalResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ReplEvalResult

'compileResult' @ [114:24] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'hasResult' @ [114:38] ==> public final val hasResult: Boolean defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'ValueResult' @ [114:64] ==> public constructor ValueResult(value: Any?, type: String?) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.ValueResult[ClassConstructorDescriptorImpl]

'resultValue' @ [114:76] ==> val resultValue: Any? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval.<anonymous>[LocalVariableDescriptor]

'compileResult' @ [114:89] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator.eval[ValueParameterDescriptorImpl]

'type' @ [114:103] ==> public final val type: String? defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'UnitResult' @ [115:33] ==> public constructor UnitResult() defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.UnitResult[ClassConstructorDescriptorImpl]

'state' @ [127:77] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'history' @ [127:83] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'map' @ [127:91] ==> public inline fun <T, R> Iterable<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.map(transform: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> EvalClassWithInstanceAndLoader): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>
    <R> -> EvalClassWithInstanceAndLoader

'it' @ [127:97] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.<get-effectiveHistory>.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [127:100] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'state' @ [129:125] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'history' @ [129:131] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'firstMismatch' @ [129:139] ==> public fun <T> IReplStageHistory<EvalClassWithInstanceAndLoader>.firstMismatch(other: Sequence<ILineId>): Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'other' @ [129:153] ==> value-parameter other: Sequence<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.firstMismatch[ValueParameterDescriptorImpl]

'state' @ [131:87] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'history' @ [131:93] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'push' @ [131:101] ==> public abstract fun push(id: ILineId, item: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'lineId' @ [131:106] ==> value-parameter lineId: ILineId defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.addPlaceholder[ValueParameterDescriptorImpl]

'value' @ [131:114] ==> value-parameter value: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.addPlaceholder[ValueParameterDescriptorImpl]

'state' @ [133:60] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'history' @ [133:66] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'verifiedPop' @ [133:74] ==> public open fun verifiedPop(id: ILineId): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'lineId' @ [133:86] ==> value-parameter lineId: ILineId defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.removePlaceholder[ValueParameterDescriptorImpl]

'state' @ [135:81] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'history' @ [135:87] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'push' @ [135:95] ==> public abstract fun push(id: ILineId, item: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'lineId' @ [135:100] ==> value-parameter lineId: ILineId defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.addFinal[ValueParameterDescriptorImpl]

'value' @ [135:108] ==> value-parameter value: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.addFinal[ValueParameterDescriptorImpl]

'prependClassLoaderWithNewClasses' @ [137:116] ==> private final fun prependClassLoaderWithNewClasses(effectiveHistory: List<EvalClassWithInstanceAndLoader>, compileResult: ReplCompileResult.CompiledClasses): Pair<ClassLoader, Class<out Any>> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[SimpleFunctionDescriptorImpl]

'effectiveHistory' @ [137:149] ==> public open val effectiveHistory: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'compileResult' @ [137:167] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.processClasses[ValueParameterDescriptorImpl]

'makeReplClassLoader' @ [143:27] ==> internal fun makeReplClassLoader(baseClassloader: ClassLoader?, baseClasspath: Iterable<File>): ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl in file GenericEvaluatorState.kt[SimpleFunctionDescriptorImpl]

'effectiveHistory' @ [143:47] ==> value-parameter effectiveHistory: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[ValueParameterDescriptorImpl]

'lastOrNull' @ [143:64] ==> public fun <T> List<EvalClassWithInstanceAndLoader>.lastOrNull(): EvalClassWithInstanceAndLoader? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'classLoader' @ [143:78] ==> public final val classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'state' @ [143:93] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'topClassLoader' @ [143:99] ==> public final val topClassLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'compileResult' @ [143:115] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[ValueParameterDescriptorImpl]

'classpathAddendum' @ [143:129] ==> public final val classpathAddendum: List<File> defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'byInternalName' @ [144:60] ==> @NotNull public open fun byInternalName(@NotNull p0: String): JvmClassName defined in org.jetbrains.kotlin.resolve.jvm.JvmClassName[JavaMethodDescriptor]

'path' @ [144:75] ==> value-parameter path: String defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.classNameFromPath[ValueParameterDescriptorImpl]

'removeSuffix' @ [144:80] ==> public fun String.removeSuffix(suffix: CharSequence): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compileResult' @ [145:38] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[ValueParameterDescriptorImpl]

'classes' @ [145:52] ==> public final val classes: List<CompiledClassData> defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'map' @ [145:60] ==> public inline fun <T, R> Iterable<CompiledClassData>.map(transform: (CompiledClassData) -> String): List<String> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompiledClassData
    <R> -> String

'classNameFromPath' @ [145:66] ==> local final fun classNameFromPath(path: String): JvmClassName defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[SimpleFunctionDescriptorImpl]

'it' @ [145:84] ==> value-parameter it: CompiledClassData defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.compiledClassesNames.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [145:87] ==> public final val path: String defined in org.jetbrains.kotlin.cli.common.repl.CompiledClassData[PropertyDescriptorImpl]

'internalName' @ [145:93] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'replace' @ [145:106] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'compileResult' @ [146:33] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[ValueParameterDescriptorImpl]

'mainClassName' @ [146:47] ==> public final val mainClassName: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'compileResult' @ [147:9] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[ValueParameterDescriptorImpl]

'classes' @ [147:23] ==> public final val classes: List<CompiledClassData> defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.CompiledClasses[PropertyDescriptorImpl]

'filter' @ [147:31] ==> public inline fun <T> Iterable<CompiledClassData>.filter(predicate: (CompiledClassData) -> Boolean): List<CompiledClassData> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompiledClassData

'it' @ [147:40] ==> value-parameter it: CompiledClassData defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [147:43] ==> public final val path: String defined in org.jetbrains.kotlin.cli.common.repl.CompiledClassData[PropertyDescriptorImpl]

'endsWith' @ [147:48] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'forEach' @ [148:18] ==> @HidesMembers public inline fun <T> Iterable<CompiledClassData>.forEach(action: (CompiledClassData) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CompiledClassData

'classNameFromPath' @ [149:37] ==> local final fun classNameFromPath(path: String): JvmClassName defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[SimpleFunctionDescriptorImpl]

'it' @ [149:55] ==> value-parameter it: CompiledClassData defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[ValueParameterDescriptorImpl]

'path' @ [149:58] ==> public final val path: String defined in org.jetbrains.kotlin.cli.common.repl.CompiledClassData[PropertyDescriptorImpl]

'className' @ [150:25] ==> val className: JvmClassName defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[LocalVariableDescriptor]

'internalName' @ [150:35] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'expectedClassName' @ [150:51] ==> val expectedClassName: String defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'className' @ [150:72] ==> val className: JvmClassName defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[LocalVariableDescriptor]

'internalName' @ [150:82] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'endsWith' @ [150:95] ==> public fun String.endsWith(suffix: String, ignoreCase: Boolean = ...): Boolean defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'expectedClassName' @ [150:107] ==> val expectedClassName: String defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'mainLineClassName' @ [151:25] ==> var mainLineClassName: String? defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'className' @ [151:45] ==> val className: JvmClassName defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[LocalVariableDescriptor]

'internalName' @ [151:55] ==> public final val JvmClassName.internalName: String[MyPropertyDescriptor]

'replace' @ [151:68] ==> public fun String.replace(oldChar: Char, newChar: Char, ignoreCase: Boolean = ...): String defined in kotlin.text[DeserializedSimpleFunctionDescriptor]

'classLoader' @ [153:21] ==> val classLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'addClass' @ [153:33] ==> public open fun addClass(@NotNull className: JvmClassName, @NotNull bytes: ByteArray): Unit defined in org.jetbrains.kotlin.cli.common.repl.ReplClassLoader[JavaMethodDescriptor]

'className' @ [153:42] ==> val className: JvmClassName defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[LocalVariableDescriptor]

'it' @ [153:53] ==> value-parameter it: CompiledClassData defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses.<anonymous>[ValueParameterDescriptorImpl]

'bytes' @ [153:56] ==> public final val bytes: ByteArray defined in org.jetbrains.kotlin.cli.common.repl.CompiledClassData[PropertyDescriptorImpl]

'classLoader' @ [157:13] ==> val classLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'loadClass' @ [157:25] ==> public open fun loadClass(p0: (String..String?)): (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.common.repl.ReplClassLoader[JavaMethodDescriptor]

'mainLineClassName' @ [157:35] ==> var mainLineClassName: String? defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'Exception' @ [160:19] ==> public final fun <init>(p0: (String..String?), p1: (Throwable..Throwable?)): Exception /* = Exception */ defined in kotlin.Exception[TypeAliasConstructorDescriptorImpl]

'mainLineClassName' @ [160:51] ==> var mainLineClassName: String? defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'compiledClassesNames' @ [160:87] ==> local final fun compiledClassesNames(): List<String> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[SimpleFunctionDescriptorImpl]

't' @ [160:113] ==> val t: Throwable defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'Pair' @ [162:16] ==> public constructor Pair<out A, out B>(first: ReplClassLoader, second: (Class<*>..Class<*>?)) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ReplClassLoader
    <out B> -> (java.lang.Class<*>..java.lang.Class<*>?)

'classLoader' @ [162:21] ==> val classLoader: ReplClassLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'scriptClass' @ [162:34] ==> val scriptClass: (Class<*>..Class<*>?) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat.prependClassLoaderWithNewClasses[LocalVariableDescriptor]

'HistoryActionsForNoRepeat' @ [166:90] ==> public constructor HistoryActionsForNoRepeat(state: GenericReplEvaluatorState) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[ClassConstructorDescriptorImpl]

'state' @ [166:116] ==> value-parameter state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly.<init>[ValueParameterDescriptorImpl]

'state' @ [168:23] ==> value-parameter state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly.<init>[ValueParameterDescriptorImpl]

'history' @ [168:29] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'peek' @ [168:37] ==> public open fun peek(): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'super' @ [170:81] ==> <this> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[LazyClassReceiverParameterDescriptor]

'effectiveHistory' @ [170:87] ==> public open val effectiveHistory: List<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[PropertyDescriptorImpl]

'dropLast' @ [170:104] ==> public fun <T> List<EvalClassWithInstanceAndLoader>.dropLast(n: Int): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'state' @ [173:13] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[PropertyDescriptorImpl]

'history' @ [173:19] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'firstMismatchFiltered' @ [173:27] ==> public fun <T> IReplStageHistory<EvalClassWithInstanceAndLoader>.firstMismatchFiltered(other: Sequence<ILineId>, predicate: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> Boolean): Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'other' @ [173:49] ==> value-parameter other: Sequence<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly.firstMismatch[ValueParameterDescriptorImpl]

'it' @ [173:58] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly.firstMismatch.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [173:61] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'currentLast' @ [173:67] ==> public final val currentLast: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[PropertyDescriptorImpl]

'id' @ [173:79] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'state' @ [180:9] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[PropertyDescriptorImpl]

'history' @ [180:15] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'pop' @ [180:23] ==> public abstract fun pop(): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'state' @ [181:9] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[PropertyDescriptorImpl]

'history' @ [181:15] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'push' @ [181:23] ==> public abstract fun push(id: ILineId, item: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'lineId' @ [181:28] ==> value-parameter lineId: ILineId defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly.addFinal[ValueParameterDescriptorImpl]

'value' @ [181:36] ==> value-parameter value: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly.addFinal[ValueParameterDescriptorImpl]

'currentLast' @ [185:13] ==> public final val currentLast: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[PropertyDescriptorImpl]

'item' @ [185:25] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'classLoader' @ [185:30] ==> public final val classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'currentLast' @ [185:45] ==> public final val currentLast: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatRecentOnly[PropertyDescriptorImpl]

'item' @ [185:57] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'klass' @ [185:62] ==> public final val klass: KClass<*> defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'java' @ [185:68] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

'HistoryActionsForNoRepeat' @ [188:151] ==> public constructor HistoryActionsForNoRepeat(state: GenericReplEvaluatorState) defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForNoRepeat[ClassConstructorDescriptorImpl]

'state' @ [188:177] ==> value-parameter state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.<init>[ValueParameterDescriptorImpl]

'state' @ [190:81] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [190:87] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'takeWhile' @ [190:95] ==> public inline fun <T> Iterable<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.takeWhile(predicate: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> Boolean): List<ReplHistoryRecord<EvalClassWithInstanceAndLoader>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>

'it' @ [190:107] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.<get-effectiveHistory>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [190:110] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'matchingLine' @ [190:116] ==> public final val matchingLine: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'id' @ [190:129] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'map' @ [190:134] ==> public inline fun <T, R> Iterable<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.map(transform: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> EvalClassWithInstanceAndLoader): List<EvalClassWithInstanceAndLoader> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>
    <R> -> EvalClassWithInstanceAndLoader

'it' @ [190:140] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.<get-effectiveHistory>.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [190:143] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'state' @ [193:13] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [193:19] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'firstMismatchWhile' @ [193:27] ==> public fun <T> IReplStageHistory<EvalClassWithInstanceAndLoader>.firstMismatchWhile(other: Sequence<ILineId>, predicate: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> Boolean): Pair<ReplHistoryRecord<EvalClassWithInstanceAndLoader>?, ILineId?>? defined in org.jetbrains.kotlin.cli.common.repl[SimpleFunctionDescriptorImpl]
Inferred types:
    <T> -> EvalClassWithInstanceAndLoader

'other' @ [193:46] ==> value-parameter other: Sequence<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.firstMismatch[ValueParameterDescriptorImpl]

'it' @ [193:55] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.firstMismatch.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [193:58] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'matchingLine' @ [193:64] ==> public final val matchingLine: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'id' @ [193:77] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'state' @ [200:26] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [200:32] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'takeLastWhile' @ [200:40] ==> public inline fun <T> List<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.takeLastWhile(predicate: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> Boolean): List<ReplHistoryRecord<EvalClassWithInstanceAndLoader>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>

'it' @ [200:56] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [200:59] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'matchingLine' @ [200:65] ==> public final val matchingLine: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'id' @ [200:78] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'state' @ [201:9] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [201:15] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'resetTo' @ [201:23] ==> public abstract fun resetTo(id: ILineId): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'lineId' @ [201:31] ==> value-parameter lineId: ILineId defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal[ValueParameterDescriptorImpl]

'state' @ [202:9] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [202:15] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'pop' @ [202:23] ==> public abstract fun pop(): ReplHistoryRecord<EvalClassWithInstanceAndLoader>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'state' @ [203:9] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [203:15] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'push' @ [203:23] ==> public abstract fun push(id: ILineId, item: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'lineId' @ [203:28] ==> value-parameter lineId: ILineId defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal[ValueParameterDescriptorImpl]

'value' @ [203:36] ==> value-parameter value: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal[ValueParameterDescriptorImpl]

'extraLines' @ [204:9] ==> val extraLines: List<ReplHistoryRecord<EvalClassWithInstanceAndLoader>> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal[LocalVariableDescriptor]

'forEach' @ [204:20] ==> @HidesMembers public inline fun <T> Iterable<ReplHistoryRecord<EvalClassWithInstanceAndLoader>>.forEach(action: (ReplHistoryRecord<EvalClassWithInstanceAndLoader>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<EvalClassWithInstanceAndLoader>

'state' @ [205:13] ==> public final val state: GenericReplEvaluatorState defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'history' @ [205:19] ==> public open val history: IReplStageHistory<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluatorState[PropertyDescriptorImpl]

'push' @ [205:27] ==> public abstract fun push(id: ILineId, item: EvalClassWithInstanceAndLoader): Unit defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'it' @ [205:32] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [205:35] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'it' @ [205:39] ==> value-parameter it: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny.addFinal.<anonymous>[ValueParameterDescriptorImpl]

'item' @ [205:42] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'matchingLine' @ [210:13] ==> public final val matchingLine: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'item' @ [210:26] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'classLoader' @ [210:31] ==> public final val classLoader: ClassLoader defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'matchingLine' @ [210:46] ==> public final val matchingLine: ReplHistoryRecord<EvalClassWithInstanceAndLoader> defined in org.jetbrains.kotlin.cli.common.repl.HistoryActionsForRepeatAny[PropertyDescriptorImpl]

'item' @ [210:59] ==> public final val item: EvalClassWithInstanceAndLoader defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'klass' @ [210:64] ==> public final val klass: KClass<*> defined in org.jetbrains.kotlin.cli.common.repl.EvalClassWithInstanceAndLoader[PropertyDescriptorImpl]

'java' @ [210:70] ==> public val <T> KClass<out Any>.java: Class<out Any> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> Captured(*)

