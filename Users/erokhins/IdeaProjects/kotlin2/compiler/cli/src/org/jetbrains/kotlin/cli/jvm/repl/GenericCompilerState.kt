'BasicReplStageHistory<ScriptDescriptor>' @ [27:79] ==> public constructor BasicReplStageHistory<T>(lock: ReentrantReadWriteLock = ...) defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[DeserializedClassConstructorDescriptor]
Inferred types:
    <T> -> ScriptDescriptor

'state' @ [27:119] ==> value-parameter state: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.<init>[ValueParameterDescriptorImpl]

'lock' @ [27:125] ==> public open val lock: ReentrantReadWriteLock defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'super' @ [30:36] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[LazyClassReceiverParameterDescriptor]

'reset' @ [30:42] ==> public open fun reset(): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[DeserializedSimpleFunctionDescriptor]

'state' @ [31:36] ==> private final val state: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[PropertyDescriptorImpl]

'analyzerEngine' @ [31:42] ==> public final val analyzerEngine: ReplCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'reset' @ [31:57] ==> public final fun reset(): List<ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[SimpleFunctionDescriptorImpl]

'checkConsistent' @ [33:9] ==> private final fun checkConsistent(removedCompiledLines: Iterable<ILineId>, removedAnalyzedLines: List<ReplCodeLine>): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[SimpleFunctionDescriptorImpl]

'removedCompiledLines' @ [33:25] ==> val removedCompiledLines: Iterable<ILineId> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.reset[LocalVariableDescriptor]

'removedAnalyzedLines' @ [33:47] ==> val removedAnalyzedLines: List<ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.reset[LocalVariableDescriptor]

'removedCompiledLines' @ [34:16] ==> val removedCompiledLines: Iterable<ILineId> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.reset[LocalVariableDescriptor]

'super' @ [38:36] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[LazyClassReceiverParameterDescriptor]

'resetTo' @ [38:42] ==> public open fun resetTo(id: ILineId): Iterable<ILineId> defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[DeserializedSimpleFunctionDescriptor]

'id' @ [38:50] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.resetTo[ValueParameterDescriptorImpl]

'state' @ [39:36] ==> private final val state: GenericReplCompilerState defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[PropertyDescriptorImpl]

'analyzerEngine' @ [39:42] ==> public final val analyzerEngine: ReplCodeAnalyzer defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'resetToLine' @ [39:57] ==> public final fun resetToLine(lineId: ILineId): List<ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[SimpleFunctionDescriptorImpl]

'id' @ [39:69] ==> value-parameter id: ILineId defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.resetTo[ValueParameterDescriptorImpl]

'checkConsistent' @ [41:9] ==> private final fun checkConsistent(removedCompiledLines: Iterable<ILineId>, removedAnalyzedLines: List<ReplCodeLine>): Unit defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[SimpleFunctionDescriptorImpl]

'removedCompiledLines' @ [41:25] ==> val removedCompiledLines: Iterable<ILineId> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.resetTo[LocalVariableDescriptor]

'removedAnalyzedLines' @ [41:47] ==> val removedAnalyzedLines: List<ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.resetTo[LocalVariableDescriptor]

'removedCompiledLines' @ [42:16] ==> val removedCompiledLines: Iterable<ILineId> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.resetTo[LocalVariableDescriptor]

'removedCompiledLines' @ [46:9] ==> value-parameter removedCompiledLines: Iterable<ILineId> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.checkConsistent[ValueParameterDescriptorImpl]

'zip' @ [46:30] ==> public infix fun <T, R> Iterable<ILineId>.zip(other: Iterable<ReplCodeLine>): List<Pair<ILineId, ReplCodeLine>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ILineId
    <R> -> ReplCodeLine

'removedAnalyzedLines' @ [46:34] ==> value-parameter removedAnalyzedLines: List<ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.checkConsistent[ValueParameterDescriptorImpl]

'forEach' @ [46:56] ==> @HidesMembers public inline fun <T> Iterable<Pair<ILineId, ReplCodeLine>>.forEach(action: (Pair<ILineId, ReplCodeLine>) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<ILineId, ReplCodeLine>

'it' @ [47:17] ==> value-parameter it: Pair<ILineId, ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.checkConsistent.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [47:20] ==> public final val first: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'LineId' @ [47:29] ==> public constructor LineId(codeLine: ReplCodeLine) defined in org.jetbrains.kotlin.cli.common.repl.LineId[DeserializedClassConstructorDescriptor]

'it' @ [47:36] ==> value-parameter it: Pair<ILineId, ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.checkConsistent.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [47:39] ==> public final val second: ReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'IllegalStateException' @ [48:23] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'it' @ [48:87] ==> value-parameter it: Pair<ILineId, ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.checkConsistent.<anonymous>[ValueParameterDescriptorImpl]

'first' @ [48:90] ==> public final val first: ILineId defined in kotlin.Pair[DeserializedPropertyDescriptor]

'no' @ [48:96] ==> public abstract val no: Int defined in org.jetbrains.kotlin.cli.common.repl.ILineId[DeserializedPropertyDescriptor]

'it' @ [48:105] ==> value-parameter it: Pair<ILineId, ReplCodeLine> defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory.checkConsistent.<anonymous>[ValueParameterDescriptorImpl]

'second' @ [48:108] ==> public final val second: ReplCodeLine defined in kotlin.Pair[DeserializedPropertyDescriptor]

'ReentrantReadWriteLock' @ [65:112] ==> public constructor ReentrantReadWriteLock() defined in java.util.concurrent.locks.ReentrantReadWriteLock[JavaClassConstructorDescriptor]

'GenericReplCheckerState' @ [65:175] ==> public constructor GenericReplCheckerState() defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCheckerState[ClassConstructorDescriptorImpl]

'ReplCompilerStageHistory' @ [67:28] ==> public constructor ReplCompilerStageHistory(state: GenericReplCompilerState) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCompilerStageHistory[ClassConstructorDescriptorImpl]

'this' @ [67:53] ==> <this> defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[LazyClassReceiverParameterDescriptor]

'history' @ [69:50] ==> public open val history: ReplCompilerStageHistory defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState[PropertyDescriptorImpl]

'currentGeneration' @ [69:87] ==> public final val currentGeneration: AtomicInteger defined in org.jetbrains.kotlin.cli.common.repl.BasicReplStageHistory[DeserializedPropertyDescriptor]

'get' @ [69:105] ==> public final fun get(): Int defined in java.util.concurrent.atomic.AtomicInteger[JavaMethodDescriptor]

'ReplCodeAnalyzer' @ [71:26] ==> public constructor ReplCodeAnalyzer(environment: KotlinCoreEnvironment) defined in org.jetbrains.kotlin.cli.jvm.repl.ReplCodeAnalyzer[ClassConstructorDescriptorImpl]

'environment' @ [71:43] ==> value-parameter environment: KotlinCoreEnvironment defined in org.jetbrains.kotlin.cli.jvm.repl.GenericReplCompilerState.<init>[ValueParameterDescriptorImpl]

