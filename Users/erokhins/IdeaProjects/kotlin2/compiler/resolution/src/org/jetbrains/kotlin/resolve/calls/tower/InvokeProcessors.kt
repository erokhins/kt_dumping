'ArrayList' @ [33:32] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> TowerData

'ArrayList' @ [34:86] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Collection<VariableInvokeProcessor<C>>

'createInvokeProcessor' @ [37:55] ==> protected abstract fun createInvokeProcessor(variableCandidate: C): ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[SimpleFunctionDescriptorImpl]

'variableCandidate' @ [37:77] ==> public final val variableCandidate: C defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor[PropertyDescriptorImpl]

'invokeProcessor' @ [40:19] ==> public final val invokeProcessor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor[PropertyDescriptorImpl]

'process' @ [40:35] ==> public abstract fun process(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [40:43] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor.process[ValueParameterDescriptorImpl]

'map' @ [40:49] ==> public inline fun <T, R> Iterable<Collection<C>>.map(transform: (Collection<C>) -> List<C>): List<List<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> List<C>

'candidateGroup' @ [41:21] ==> value-parameter candidateGroup: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'map' @ [41:36] ==> public inline fun <T, R> Iterable<C>.map(transform: (C) -> C): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <R> -> C

'factoryProviderForInvoke' @ [41:42] ==> protected final val factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[PropertyDescriptorImpl]

'transformCandidate' @ [41:67] ==> public abstract fun transformCandidate(variable: C, invoke: C): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactoryProviderForInvoke[SimpleFunctionDescriptorImpl]

'variableCandidate' @ [41:86] ==> public final val variableCandidate: C defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor[PropertyDescriptorImpl]

'it' @ [41:105] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor.process.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'previousData' @ [48:9] ==> private final val previousData: ArrayList<TowerData> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[PropertyDescriptorImpl]

'add' @ [48:22] ==> public open fun add(element: TowerData): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'data' @ [48:26] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[ValueParameterDescriptorImpl]

'ArrayList' @ [50:31] ==> public constructor ArrayList<E : (Any..Any?)>(p0: Int) defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Collection<C>

'invokeProcessors' @ [52:33] ==> private final val invokeProcessors: MutableList<Collection<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[PropertyDescriptorImpl]

'candidateGroups' @ [53:13] ==> val candidateGroups: ArrayList<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'addAll' @ [53:29] ==> public open fun addAll(elements: Collection<Collection<C>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'processorsGroup' @ [53:36] ==> val processorsGroup: Collection<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'processVariableGroup' @ [53:52] ==> private final fun Collection<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>.processVariableGroup(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [53:73] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[ValueParameterDescriptorImpl]

'variableProcessor' @ [56:36] ==> private final val variableProcessor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[PropertyDescriptorImpl]

'process' @ [56:54] ==> public abstract fun process(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [56:62] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[ValueParameterDescriptorImpl]

'variableCandidates' @ [57:39] ==> val variableCandidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'filter' @ [57:58] ==> public inline fun <T> Iterable<C>.filter(predicate: (C) -> Boolean): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [58:17] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'isSuccessful' @ [58:20] ==> public abstract val isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'successfulVariables' @ [61:17] ==> val successfulVariables: List<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'isNotEmpty' @ [61:37] ==> @InlineOnly public inline fun <T> Collection<C>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'successfulVariables' @ [62:42] ==> val successfulVariables: List<C> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'map' @ [62:62] ==> public inline fun <T, R> Iterable<C>.map(transform: (C) -> AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor): List<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <R> -> VariableInvokeProcessor<C>

'VariableInvokeProcessor' @ [62:68] ==> public constructor VariableInvokeProcessor(variableCandidate: C) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor[ClassConstructorDescriptorImpl]

'it' @ [62:92] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'invokeProcessors' @ [63:17] ==> private final val invokeProcessors: MutableList<Collection<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[PropertyDescriptorImpl]

'add' @ [63:34] ==> public abstract fun add(element: Collection<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'variableProcessors' @ [63:38] ==> val variableProcessors: List<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'previousData' @ [65:33] ==> private final val previousData: ArrayList<TowerData> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[PropertyDescriptorImpl]

'candidateGroups' @ [66:21] ==> val candidateGroups: ArrayList<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'addAll' @ [66:37] ==> public open fun addAll(elements: Collection<Collection<C>>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'variableProcessors' @ [66:44] ==> val variableProcessors: List<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'processVariableGroup' @ [66:63] ==> private final fun Collection<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>.processVariableGroup(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[SimpleFunctionDescriptorImpl]

'oldData' @ [66:84] ==> val oldData: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'candidateGroups' @ [71:16] ==> val candidateGroups: ArrayList<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.process[LocalVariableDescriptor]

'when (size) {
            0 -> emptyList()
            1 -> single().process(data)
        // overload on variables see KT-10093 Resolve depends on the order of declaration for variable with implicit invoke

            else -> listOf(this.flatMap { it.process(data).flatten() })
        }' @ [75:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: List<Collection<C>>, entry1: List<Collection<C>>, entry2: List<Collection<C>>): List<Collection<C>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> List<Collection<C>>

'size' @ [75:22] ==> public abstract val size: Int defined in kotlin.collections.Collection[DeserializedPropertyDescriptor]

'emptyList' @ [76:18] ==> public fun <T> emptyList(): List<Collection<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>

'single' @ [77:18] ==> public fun <T> Iterable<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>.single(): AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInvokeProcessor<C>

'process' @ [77:27] ==> public open fun process(data: TowerData): List<List<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor[SimpleFunctionDescriptorImpl]

'data' @ [77:35] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.processVariableGroup[ValueParameterDescriptorImpl]

'listOf' @ [80:21] ==> public fun <T> listOf(element: List<C>): List<List<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<C>

'this' @ [80:28] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.processVariableGroup[ReceiverParameterDescriptorImpl]

'flatMap' @ [80:33] ==> public inline fun <T, R> Iterable<AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor>.flatMap(transform: (AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor) -> Iterable<C>): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableInvokeProcessor<C>
    <R> -> C

'it' @ [80:43] ==> value-parameter it: AbstractInvokeTowerProcessor<C>.VariableInvokeProcessor defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.processVariableGroup.<anonymous>[ValueParameterDescriptorImpl]

'process' @ [80:46] ==> public open fun process(data: TowerData): List<List<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.VariableInvokeProcessor[SimpleFunctionDescriptorImpl]

'data' @ [80:54] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor.processVariableGroup[ValueParameterDescriptorImpl]

'flatten' @ [80:60] ==> public fun <T> Iterable<Iterable<C>>.flatten(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'AbstractInvokeTowerProcessor<C>' @ [92:5] ==> public constructor AbstractInvokeTowerProcessor<C : Candidate>(factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C>, variableProcessor: ScopeTowerProcessor<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'factoryProviderForInvoke' @ [93:9] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'createVariableAndObjectProcessor' @ [94:9] ==> public fun <C : Candidate> createVariableAndObjectProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): PrioritizedCompositeScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [94:42] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'name' @ [94:54] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'factoryProviderForInvoke' @ [94:60] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'factoryForVariable' @ [94:85] ==> public abstract fun factoryForVariable(stripExplicitReceiver: Boolean): CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactoryProviderForInvoke[SimpleFunctionDescriptorImpl]

'explicitReceiver' @ [94:136] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'component1' @ [99:14] ==> public final operator fun component1(): ReceiverValueWithSmartCastInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [99:32] ==> public final operator fun component2(): CandidateFactory<C> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'factoryProviderForInvoke' @ [99:49] ==> protected final val factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor[PropertyDescriptorImpl]

'factoryForInvoke' @ [99:74] ==> public abstract fun factoryForInvoke(variable: C, useExplicitReceiver: Boolean): Pair<ReceiverValueWithSmartCastInfo, CandidateFactory<C>>? defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactoryProviderForInvoke[SimpleFunctionDescriptorImpl]

'variableCandidate' @ [99:91] ==> value-parameter variableCandidate: C defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.createInvokeProcessor[ValueParameterDescriptorImpl]

'KnownResultProcessor' @ [100:59] ==> public constructor KnownResultProcessor<out C>(result: Collection<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'emptyList' @ [100:80] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'ExplicitReceiverScopeTowerProcessor' @ [101:16] ==> public constructor ExplicitReceiverScopeTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: ReceiverValueWithSmartCastInfo, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */) defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [101:52] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor[PropertyDescriptorImpl]

'invokeContext' @ [101:64] ==> val invokeContext: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.createInvokeProcessor[LocalVariableDescriptor]

'variableReceiver' @ [101:79] ==> val variableReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.createInvokeProcessor[LocalVariableDescriptor]

'getFunctions' @ [101:99] ==> public abstract fun getFunctions(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'OperatorNameConventions' @ [101:112] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [101:136] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'it' @ [101:144] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor.createInvokeProcessor.<anonymous>[ValueParameterDescriptorImpl]

'AbstractInvokeTowerProcessor<C>' @ [110:5] ==> public constructor AbstractInvokeTowerProcessor<C : Candidate>(factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C>, variableProcessor: ScopeTowerProcessor<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractInvokeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'factoryProviderForInvoke' @ [111:9] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.<init>[ValueParameterDescriptorImpl]

'createVariableAndObjectProcessor' @ [112:9] ==> public fun <C : Candidate> createVariableAndObjectProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): PrioritizedCompositeScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [112:42] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.<init>[ValueParameterDescriptorImpl]

'name' @ [112:54] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.<init>[ValueParameterDescriptorImpl]

'factoryProviderForInvoke' @ [112:60] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.<init>[ValueParameterDescriptorImpl]

'factoryForVariable' @ [112:85] ==> public abstract fun factoryForVariable(stripExplicitReceiver: Boolean): CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactoryProviderForInvoke[SimpleFunctionDescriptorImpl]

'component1' @ [116:14] ==> public final operator fun component1(): ReceiverValueWithSmartCastInfo defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [116:32] ==> public final operator fun component2(): CandidateFactory<C> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'factoryProviderForInvoke' @ [116:49] ==> protected final val factoryProviderForInvoke: CandidateFactoryProviderForInvoke<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor[PropertyDescriptorImpl]

'factoryForInvoke' @ [116:74] ==> public abstract fun factoryForInvoke(variable: C, useExplicitReceiver: Boolean): Pair<ReceiverValueWithSmartCastInfo, CandidateFactory<C>>? defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactoryProviderForInvoke[SimpleFunctionDescriptorImpl]

'variableCandidate' @ [116:91] ==> value-parameter variableCandidate: C defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.createInvokeProcessor[ValueParameterDescriptorImpl]

'KnownResultProcessor' @ [117:59] ==> public constructor KnownResultProcessor<out C>(result: Collection<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'emptyList' @ [117:80] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'scopeTower' @ [118:32] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor[PropertyDescriptorImpl]

'getExtensionInvokeCandidateDescriptor' @ [118:43] ==> private fun ImplicitScopeTower.getExtensionInvokeCandidateDescriptor(extensionFunctionReceiver: ReceiverValueWithSmartCastInfo): CandidateWithBoundDispatchReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower in file InvokeProcessors.kt[SimpleFunctionDescriptorImpl]

'variableReceiver' @ [118:81] ==> val variableReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.createInvokeProcessor[LocalVariableDescriptor]

'KnownResultProcessor' @ [119:42] ==> public constructor KnownResultProcessor<out C>(result: Collection<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'emptyList' @ [119:63] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'InvokeExtensionScopeTowerProcessor' @ [120:16] ==> public constructor InvokeExtensionScopeTowerProcessor<C : Candidate>(context: CandidateFactory<C>, invokeCandidateDescriptor: CandidateWithBoundDispatchReceiver, explicitReceiver: ReceiverValueWithSmartCastInfo?) defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'invokeContext' @ [120:51] ==> val invokeContext: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.createInvokeProcessor[LocalVariableDescriptor]

'invokeDescriptor' @ [120:66] ==> val invokeDescriptor: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor.createInvokeProcessor[LocalVariableDescriptor]

'explicitReceiver' @ [120:84] ==> private final val explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor[PropertyDescriptorImpl]

'AbstractSimpleScopeTowerProcessor<C>' @ [128:5] ==> public constructor AbstractSimpleScopeTowerProcessor<C : Candidate>(candidateFactory: CandidateFactory<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractSimpleScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'context' @ [128:42] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'explicitReceiver' @ [131:13] ==> private final val explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'data' @ [131:41] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'Empty' @ [131:59] ==> public object Empty : TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[FakeCallableDescriptorForObject]

'listOf' @ [132:20] ==> public fun <T> listOf(element: C): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'candidateFactory' @ [132:27] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [132:44] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'invokeCandidateDescriptor' @ [132:60] ==> private final val invokeCandidateDescriptor: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'BOTH_RECEIVERS' @ [132:108] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceiver' @ [132:124] ==> private final val explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'explicitReceiver' @ [135:13] ==> private final val explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'data' @ [135:41] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'listOf' @ [136:20] ==> public fun <T> listOf(element: C): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'candidateFactory' @ [136:27] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [136:44] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'invokeCandidateDescriptor' @ [136:60] ==> private final val invokeCandidateDescriptor: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[PropertyDescriptorImpl]

'DISPATCH_RECEIVER' @ [136:108] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'data' @ [136:127] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'implicitReceiver' @ [136:132] ==> public final val implicitReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.OnlyImplicitReceiver[PropertyDescriptorImpl]

'emptyList' @ [139:16] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'extensionFunctionReceiver' @ [147:16] ==> value-parameter extensionFunctionReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[ValueParameterDescriptorImpl]

'receiverValue' @ [147:42] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [147:56] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'!' @ [148:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [148:10] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'isBuiltinExtensionFunctionalType' @ [148:15] ==> public val KotlinType.isBuiltinExtensionFunctionalType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'type' @ [150:28] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'memberScope' @ [150:33] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [150:45] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'OperatorNameConventions' @ [150:69] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [150:93] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'location' @ [150:101] ==> public abstract val location: LookupLocation defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'single' @ [150:111] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.single(): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'createSynthesizedInvokes' @ [151:30] ==> public fun createSynthesizedInvokes(functions: Collection<FunctionDescriptor>): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tasks[SimpleFunctionDescriptorImpl]

'listOf' @ [151:55] ==> public fun <T> listOf(element: SimpleFunctionDescriptor): List<SimpleFunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'invokeDescriptor' @ [151:62] ==> val invokeDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'synthesizedInvokes' @ [152:29] ==> val synthesizedInvokes: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'singleOrNull' @ [152:48] ==> public fun <T> Iterable<FunctionDescriptor>.singleOrNull(): FunctionDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'error' @ [153:32] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'invokeDescriptor' @ [153:73] ==> val invokeDescriptor: SimpleFunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'synthesizedInvokes' @ [153:92] ==> val synthesizedInvokes: Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'CandidateWithBoundDispatchReceiverImpl' @ [156:12] ==> public constructor CandidateWithBoundDispatchReceiverImpl(dispatchReceiver: ReceiverValueWithSmartCastInfo?, descriptor: CallableDescriptor, diagnostics: List<ResolutionDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiverImpl[ClassConstructorDescriptorImpl]

'extensionFunctionReceiver' @ [156:51] ==> value-parameter extensionFunctionReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[ValueParameterDescriptorImpl]

'synthesizedInvoke' @ [156:78] ==> val synthesizedInvoke: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.getExtensionInvokeCandidateDescriptor[LocalVariableDescriptor]

'listOf' @ [156:97] ==> @InlineOnly public inline fun <T> listOf(): List<ResolutionDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionDiagnostic

'scopeTower' @ [166:37] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'getExtensionInvokeCandidateDescriptor' @ [166:48] ==> private fun ImplicitScopeTower.getExtensionInvokeCandidateDescriptor(extensionFunctionReceiver: ReceiverValueWithSmartCastInfo): CandidateWithBoundDispatchReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower in file InvokeProcessors.kt[SimpleFunctionDescriptorImpl]

'expressionForInvoke' @ [166:86] ==> value-parameter expressionForInvoke: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'if (explicitReceiver != null) {
        return if (invokeExtensionDescriptor == null) {
            // case 1.(foo())(), where foo() isn't extension function
            KnownResultProcessor(emptyList())
        }
        else {
            InvokeExtensionScopeTowerProcessor(functionContext, invokeExtensionDescriptor, explicitReceiver = explicitReceiver)
        }
    }
    else {
        val usualInvoke = ExplicitReceiverScopeTowerProcessor(scopeTower, functionContext, expressionForInvoke) { getFunctions(OperatorNameConventions.INVOKE, it) } // todo operator

        return if (invokeExtensionDescriptor == null) {
            usualInvoke
        }
        else {
            PrioritizedCompositeScopeTowerProcessor(
                    usualInvoke,
                    InvokeExtensionScopeTowerProcessor(functionContext, invokeExtensionDescriptor, explicitReceiver = null)
            )
        }
    }' @ [167:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Nothing, elseBranch: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Nothing

'explicitReceiver' @ [167:9] ==> value-parameter explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'if (invokeExtensionDescriptor == null) {
            // case 1.(foo())(), where foo() isn't extension function
            KnownResultProcessor(emptyList())
        }
        else {
            InvokeExtensionScopeTowerProcessor(functionContext, invokeExtensionDescriptor, explicitReceiver = explicitReceiver)
        }' @ [168:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScopeTowerProcessor<C>, elseBranch: ScopeTowerProcessor<C>): ScopeTowerProcessor<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScopeTowerProcessor<C>

'invokeExtensionDescriptor' @ [168:20] ==> val invokeExtensionDescriptor: CandidateWithBoundDispatchReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[LocalVariableDescriptor]

'KnownResultProcessor' @ [170:13] ==> public constructor KnownResultProcessor<out C>(result: Collection<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'emptyList' @ [170:34] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'InvokeExtensionScopeTowerProcessor' @ [173:13] ==> public constructor InvokeExtensionScopeTowerProcessor<C : Candidate>(context: CandidateFactory<C>, invokeCandidateDescriptor: CandidateWithBoundDispatchReceiver, explicitReceiver: ReceiverValueWithSmartCastInfo?) defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'functionContext' @ [173:48] ==> value-parameter functionContext: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'invokeExtensionDescriptor' @ [173:65] ==> val invokeExtensionDescriptor: CandidateWithBoundDispatchReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[LocalVariableDescriptor]

'explicitReceiver' @ [173:111] ==> value-parameter explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'ExplicitReceiverScopeTowerProcessor' @ [177:27] ==> public constructor ExplicitReceiverScopeTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: ReceiverValueWithSmartCastInfo, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */) defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [177:63] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'functionContext' @ [177:75] ==> value-parameter functionContext: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'expressionForInvoke' @ [177:92] ==> value-parameter expressionForInvoke: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'getFunctions' @ [177:115] ==> public abstract fun getFunctions(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'OperatorNameConventions' @ [177:128] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [177:152] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'it' @ [177:160] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke.<anonymous>[ValueParameterDescriptorImpl]

'if (invokeExtensionDescriptor == null) {
            usualInvoke
        }
        else {
            PrioritizedCompositeScopeTowerProcessor(
                    usualInvoke,
                    InvokeExtensionScopeTowerProcessor(functionContext, invokeExtensionDescriptor, explicitReceiver = null)
            )
        }' @ [179:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScopeTowerProcessor<C>, elseBranch: ScopeTowerProcessor<C>): ScopeTowerProcessor<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScopeTowerProcessor<C>

'invokeExtensionDescriptor' @ [179:20] ==> val invokeExtensionDescriptor: CandidateWithBoundDispatchReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[LocalVariableDescriptor]

'usualInvoke' @ [180:13] ==> val usualInvoke: ExplicitReceiverScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[LocalVariableDescriptor]

'PrioritizedCompositeScopeTowerProcessor' @ [183:13] ==> public constructor PrioritizedCompositeScopeTowerProcessor<out C>(vararg processors: ScopeTowerProcessor<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'usualInvoke' @ [184:21] ==> val usualInvoke: ExplicitReceiverScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[LocalVariableDescriptor]

'InvokeExtensionScopeTowerProcessor' @ [185:21] ==> public constructor InvokeExtensionScopeTowerProcessor<C : Candidate>(context: CandidateFactory<C>, invokeCandidateDescriptor: CandidateWithBoundDispatchReceiver, explicitReceiver: ReceiverValueWithSmartCastInfo?) defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'functionContext' @ [185:56] ==> value-parameter functionContext: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[ValueParameterDescriptorImpl]

'invokeExtensionDescriptor' @ [185:73] ==> val invokeExtensionDescriptor: CandidateWithBoundDispatchReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallTowerProcessorForExplicitInvoke[LocalVariableDescriptor]

