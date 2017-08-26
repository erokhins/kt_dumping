'currentThread' @ [25:76] ==> public open fun currentThread(): (Thread..Thread?) defined in java.lang.Thread[JavaMethodDescriptor]

'contextClassLoader' @ [25:92] ==> public final var Thread.contextClassLoader: (ClassLoader..ClassLoader?)[MyPropertyDescriptor]

'REPEAT_ONLY_MOST_RECENT' @ [27:90] ==> enum entry REPEAT_ONLY_MOST_RECENT defined in org.jetbrains.kotlin.cli.common.repl.ReplRepeatingMode[FakeCallableDescriptorForObject]

'GenericReplEvaluator' @ [29:29] ==> public constructor GenericReplEvaluator(baseClasspath: Iterable<File>, baseClassloader: ClassLoader? = ..., fallbackScriptArgs: ScriptArgsWithTypes? = ..., repeatingMode: ReplRepeatingMode = ...) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[ClassConstructorDescriptorImpl]

'baseClasspath' @ [29:50] ==> value-parameter baseClasspath: Iterable<File> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.<init>[ValueParameterDescriptorImpl]

'baseClassloader' @ [29:65] ==> value-parameter baseClassloader: ClassLoader? = ... defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.<init>[ValueParameterDescriptorImpl]

'fallbackScriptArgs' @ [29:82] ==> private final val fallbackScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'repeatingMode' @ [29:102] ==> value-parameter repeatingMode: ReplRepeatingMode = ... defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.<init>[ValueParameterDescriptorImpl]

'AggregatedReplStageState' @ [31:82] ==> public constructor AggregatedReplStageState<T1, T2>(state1: IReplStageState<out Any?>, state2: IReplStageState<out Any?>, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[ClassConstructorDescriptorImpl]
Inferred types:
    <T1> -> Captured(*)
    <T2> -> Captured(*)

'compiler' @ [31:107] ==> public final val compiler: ReplCompiler defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'createState' @ [31:116] ==> public abstract fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[SimpleFunctionDescriptorImpl]

'lock' @ [31:128] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.createState[ValueParameterDescriptorImpl]

'evaluator' @ [31:135] ==> private final val evaluator: GenericReplEvaluator defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'createState' @ [31:145] ==> public open fun createState(lock: ReentrantReadWriteLock): IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[SimpleFunctionDescriptorImpl]

'lock' @ [31:157] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.createState[ValueParameterDescriptorImpl]

'lock' @ [31:164] ==> value-parameter lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.createState[ValueParameterDescriptorImpl]

'state' @ [34:16] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'lock' @ [34:22] ==> public abstract val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'write' @ [34:27] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> ReplEvalResult): ReplEvalResult defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplEvalResult

'state' @ [35:35] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'asState' @ [35:41] ==> public open fun <StateT : IReplStageState<*>> asState(target: Class<out AggregatedReplStageState<*, *>>): AggregatedReplStageState<*, *> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[SimpleFunctionDescriptorImpl]
Inferred types:
    <StateT : IReplStageState<*>> -> AggregatedReplStageState<*, *>

'AggregatedReplStageState' @ [35:49] ==> public constructor AggregatedReplStageState<T1, T2>(state1: IReplStageState<???>, state2: IReplStageState<???>, lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[ClassConstructorDescriptorImpl]
Inferred types:
    <T1> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@2c72165b
    <T2> -> org.jetbrains.kotlin.types.ErrorUtils$UninferredParameterTypeConstructor@7b2d3129

'java' @ [35:81] ==> public val <T> KClass<AggregatedReplStageState<*, *>>.java: Class<AggregatedReplStageState<*, *>> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> AggregatedReplStageState<*, *>

'compiler' @ [36:28] ==> public final val compiler: ReplCompiler defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'compile' @ [36:37] ==> public abstract fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[SimpleFunctionDescriptorImpl]

'state' @ [36:45] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'codeLine' @ [36:52] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'when (compiled) {
                is ReplCompileResult.Error -> ReplEvalResult.Error.CompileTime(compiled.message, compiled.location)
                is ReplCompileResult.Incomplete -> ReplEvalResult.Incomplete()
                is ReplCompileResult.CompiledClasses -> {
                    val result = eval(state, compiled, scriptArgs, invokeWrapper)
                    when (result) {
                        is ReplEvalResult.Error,
                        is ReplEvalResult.HistoryMismatch,
                        is ReplEvalResult.Incomplete -> {
                            aggregatedState.apply {
                                lock.write {
                                    if (state1.history.size > state2.history.size) {
                                        if (state2.history.size == 0) {
                                            state1.history.reset()
                                        }
                                        else {
                                            state2.history.peek()?.let {
                                                state1.history.resetTo(it.id)
                                            }
                                        }
                                        assert(state1.history.size == state2.history.size)
                                    }
                                }
                            }
                            result
                        }
                        is ReplEvalResult.ValueResult,
                        is ReplEvalResult.UnitResult ->
                            result
                    }
                }
            }' @ [37:13] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplEvalResult, entry1: ReplEvalResult, entry2: ReplEvalResult): ReplEvalResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReplEvalResult

'compiled' @ [37:19] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'CompileTime' @ [38:68] ==> public constructor CompileTime(message: String, location: CompilerMessageLocation? = ...) defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Error.CompileTime[ClassConstructorDescriptorImpl]

'compiled' @ [38:80] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'message' @ [38:89] ==> public final val message: String defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[PropertyDescriptorImpl]

'compiled' @ [38:98] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'location' @ [38:107] ==> public final val location: CompilerMessageLocation? defined in org.jetbrains.kotlin.cli.common.repl.ReplCompileResult.Error[PropertyDescriptorImpl]

'Incomplete' @ [39:67] ==> public constructor Incomplete() defined in org.jetbrains.kotlin.cli.common.repl.ReplEvalResult.Incomplete[ClassConstructorDescriptorImpl]

'eval' @ [41:34] ==> public open fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[SimpleFunctionDescriptorImpl]

'state' @ [41:39] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'compiled' @ [41:46] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'scriptArgs' @ [41:56] ==> value-parameter scriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'invokeWrapper' @ [41:68] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval[ValueParameterDescriptorImpl]

'when (result) {
                        is ReplEvalResult.Error,
                        is ReplEvalResult.HistoryMismatch,
                        is ReplEvalResult.Incomplete -> {
                            aggregatedState.apply {
                                lock.write {
                                    if (state1.history.size > state2.history.size) {
                                        if (state2.history.size == 0) {
                                            state1.history.reset()
                                        }
                                        else {
                                            state2.history.peek()?.let {
                                                state1.history.resetTo(it.id)
                                            }
                                        }
                                        assert(state1.history.size == state2.history.size)
                                    }
                                }
                            }
                            result
                        }
                        is ReplEvalResult.ValueResult,
                        is ReplEvalResult.UnitResult ->
                            result
                    }' @ [42:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReplEvalResult, entry1: ReplEvalResult): ReplEvalResult[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReplEvalResult

'result' @ [42:27] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'aggregatedState' @ [46:29] ==> val aggregatedState: AggregatedReplStageState<*, *> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'apply' @ [46:45] ==> @InlineOnly public inline fun <T> AggregatedReplStageState<*, *>.apply(block: AggregatedReplStageState<*, *>.() -> Unit): AggregatedReplStageState<*, *> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AggregatedReplStageState<*, *>

'lock' @ [47:33] ==> public final val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'write' @ [47:38] ==> @InlineOnly public inline fun <T> ReentrantReadWriteLock.write(action: () -> Unit): Unit defined in kotlin.concurrent[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Unit

'state1' @ [48:41] ==> public final val state1: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [48:48] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'size' @ [48:56] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'state2' @ [48:63] ==> public final val state2: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [48:70] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'size' @ [48:78] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'if (state2.history.size == 0) {
                                            state1.history.reset()
                                        }
                                        else {
                                            state2.history.peek()?.let {
                                                state1.history.resetTo(it.id)
                                            }
                                        }' @ [49:41] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Iterable<ILineId>?, elseBranch: Iterable<ILineId>?): Iterable<ILineId>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Iterable<ILineId>?

'state2' @ [49:45] ==> public final val state2: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [49:52] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'size' @ [49:60] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'state1' @ [50:45] ==> public final val state1: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [50:52] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'reset' @ [50:60] ==> public abstract fun reset(): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'state2' @ [53:45] ==> public final val state2: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [53:52] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'peek' @ [53:60] ==> public open fun peek(): ReplHistoryRecord<Any?>? defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'let' @ [53:68] ==> @InlineOnly public inline fun <T, R> ReplHistoryRecord<Any?>.let(block: (ReplHistoryRecord<Any?>) -> Iterable<ILineId>): Iterable<ILineId> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReplHistoryRecord<Any?>
    <R> -> Iterable<ILineId>

'state1' @ [54:49] ==> public final val state1: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [54:56] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'resetTo' @ [54:64] ==> public abstract fun resetTo(id: ILineId): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[SimpleFunctionDescriptorImpl]

'it' @ [54:72] ==> value-parameter it: ReplHistoryRecord<Any?> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>.<anonymous>.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'id' @ [54:75] ==> public final val id: ILineId defined in org.jetbrains.kotlin.cli.common.repl.ReplHistoryRecord[PropertyDescriptorImpl]

'assert' @ [57:41] ==> @InlineOnly public inline fun assert(value: Boolean): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'state1' @ [57:48] ==> public final val state1: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [57:55] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'size' @ [57:63] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'state2' @ [57:71] ==> public final val state2: IReplStageState<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.AggregatedReplStageState[PropertyDescriptorImpl]

'history' @ [57:78] ==> public abstract val history: IReplStageHistory<out Any?> defined in org.jetbrains.kotlin.cli.common.repl.IReplStageState[PropertyDescriptorImpl]

'size' @ [57:86] ==> public abstract val size: Int defined in org.jetbrains.kotlin.cli.common.repl.IReplStageHistory[DeserializedPropertyDescriptor]

'result' @ [61:29] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'result' @ [65:29] ==> val result: ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileAndEval.<anonymous>[LocalVariableDescriptor]

'evaluator' @ [73:13] ==> private final val evaluator: GenericReplEvaluator defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'eval' @ [73:23] ==> public open fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplEvaluator[SimpleFunctionDescriptorImpl]

'state' @ [73:28] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.eval[ValueParameterDescriptorImpl]

'compileResult' @ [73:35] ==> value-parameter compileResult: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.eval[ValueParameterDescriptorImpl]

'scriptArgs' @ [73:50] ==> value-parameter scriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.eval[ValueParameterDescriptorImpl]

'invokeWrapper' @ [73:62] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.eval[ValueParameterDescriptorImpl]

'compiler' @ [75:94] ==> public final val compiler: ReplCompiler defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'check' @ [75:103] ==> public abstract fun check(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCheckResult defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[SimpleFunctionDescriptorImpl]

'state' @ [75:109] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.check[ValueParameterDescriptorImpl]

'codeLine' @ [75:116] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.check[ValueParameterDescriptorImpl]

'compiler' @ [78:24] ==> public final val compiler: ReplCompiler defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'compile' @ [78:33] ==> public abstract fun compile(state: IReplStageState<*>, codeLine: ReplCodeLine): ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.ReplCompiler[SimpleFunctionDescriptorImpl]

'state' @ [78:41] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[ValueParameterDescriptorImpl]

'codeLine' @ [78:48] ==> value-parameter codeLine: ReplCodeLine defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[ValueParameterDescriptorImpl]

'when (compiled) {
            // TODO: seems usafe when delayed evaluation may happen after some more compileAndEval calls on the same state; check and fix or protect
            is ReplCompileResult.CompiledClasses -> Pair(compiled, DelayedEvaluation(state, compiled, evaluator, defaultScriptArgs ?: fallbackScriptArgs))
            else -> Pair(compiled, null)
        }' @ [79:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<ReplCompileResult, Evaluable?>, entry1: Pair<ReplCompileResult, Evaluable?>): Pair<ReplCompileResult, Evaluable?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<ReplCompileResult, Evaluable?>

'compiled' @ [79:22] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[LocalVariableDescriptor]

'Pair' @ [81:53] ==> public constructor Pair<out A, out B>(first: ReplCompileResult.CompiledClasses, second: GenericReplCompilingEvaluator.DelayedEvaluation) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> CompiledClasses
    <out B> -> DelayedEvaluation

'compiled' @ [81:58] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[LocalVariableDescriptor]

'DelayedEvaluation' @ [81:68] ==> public constructor DelayedEvaluation(state: IReplStageState<*>, compiledCode: ReplCompileResult.CompiledClasses, evaluator: ReplEvaluator, defaultScriptArgs: ScriptArgsWithTypes?) defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation[ClassConstructorDescriptorImpl]

'state' @ [81:86] ==> value-parameter state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[ValueParameterDescriptorImpl]

'compiled' @ [81:93] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[LocalVariableDescriptor]

'evaluator' @ [81:103] ==> private final val evaluator: GenericReplEvaluator defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'defaultScriptArgs' @ [81:114] ==> value-parameter defaultScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[ValueParameterDescriptorImpl]

'fallbackScriptArgs' @ [81:135] ==> private final val fallbackScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator[PropertyDescriptorImpl]

'Pair' @ [82:21] ==> public constructor Pair<out A, out B>(first: ReplCompileResult, second: Nothing?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ReplCompileResult
    <out B> -> Nothing?

'compiled' @ [82:26] ==> val compiled: ReplCompileResult defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.compileToEvaluable[LocalVariableDescriptor]

'evaluator' @ [91:17] ==> private final val evaluator: ReplEvaluator defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation[PropertyDescriptorImpl]

'eval' @ [91:27] ==> public abstract fun eval(state: IReplStageState<*>, compileResult: ReplCompileResult.CompiledClasses, scriptArgs: ScriptArgsWithTypes?, invokeWrapper: InvokeWrapper?): ReplEvalResult defined in org.jetbrains.kotlin.cli.common.repl.ReplEvaluator[SimpleFunctionDescriptorImpl]

'state' @ [91:32] ==> private final val state: IReplStageState<*> defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation[PropertyDescriptorImpl]

'compiledCode' @ [91:39] ==> public open val compiledCode: ReplCompileResult.CompiledClasses defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation[PropertyDescriptorImpl]

'scriptArgs' @ [91:53] ==> value-parameter scriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation.eval[ValueParameterDescriptorImpl]

'defaultScriptArgs' @ [91:67] ==> private final val defaultScriptArgs: ScriptArgsWithTypes? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation[PropertyDescriptorImpl]

'invokeWrapper' @ [91:86] ==> value-parameter invokeWrapper: InvokeWrapper? defined in org.jetbrains.kotlin.cli.common.repl.GenericReplCompilingEvaluator.DelayedEvaluation.eval[ValueParameterDescriptorImpl]

