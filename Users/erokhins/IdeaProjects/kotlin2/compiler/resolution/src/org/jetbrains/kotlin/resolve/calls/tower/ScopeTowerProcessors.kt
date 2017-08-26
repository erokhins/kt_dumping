'if (data == TowerData.Empty) listOfNotNull(result.takeIf { it.isNotEmpty() }) else emptyList()' @ [31:15] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Collection<C>>, elseBranch: List<Collection<C>>): List<Collection<C>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Collection<C>>

'data' @ [31:19] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor.process[ValueParameterDescriptorImpl]

'Empty' @ [31:37] ==> public object Empty : TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[FakeCallableDescriptorForObject]

'listOfNotNull' @ [31:44] ==> public fun <T : Any> listOfNotNull(element: Collection<C>?): List<Collection<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<C>

'result' @ [31:58] ==> public final val result: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[PropertyDescriptorImpl]

'takeIf' @ [31:65] ==> @InlineOnly @SinceKotlin public inline fun <T> Collection<C>.takeIf(predicate: (Collection<C>) -> Boolean): Collection<C>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>

'it' @ [31:74] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [31:77] ==> @InlineOnly public inline fun <T> Collection<C>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'emptyList' @ [31:98] ==> public fun <T> emptyList(): List<Collection<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>

'processors' @ [38:66] ==> public final val processors: Array<out ScopeTowerProcessor<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[PropertyDescriptorImpl]

'flatMap' @ [38:77] ==> public inline fun <T, R> Array<out ScopeTowerProcessor<C>>.flatMap(transform: (ScopeTowerProcessor<C>) -> Iterable<Collection<C>>): List<Collection<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ScopeTowerProcessor<C>
    <R> -> Collection<C>

'it' @ [38:87] ==> value-parameter it: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'process' @ [38:90] ==> public abstract fun process(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [38:98] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor.process[ValueParameterDescriptorImpl]

'processors' @ [45:66] ==> private final val processors: Array<out SimpleScopeTowerProcessor<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.SamePriorityCompositeScopeTowerProcessor[PropertyDescriptorImpl]

'flatMap' @ [45:77] ==> public inline fun <T, R> Array<out SimpleScopeTowerProcessor<C>>.flatMap(transform: (SimpleScopeTowerProcessor<C>) -> Iterable<C>): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleScopeTowerProcessor<C>
    <R> -> C

'it' @ [45:87] ==> value-parameter it: SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.SamePriorityCompositeScopeTowerProcessor.simpleProcess.<anonymous>[ValueParameterDescriptorImpl]

'simpleProcess' @ [45:90] ==> public abstract fun simpleProcess(data: TowerData): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.SimpleScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [45:104] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.SamePriorityCompositeScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'AbstractSimpleScopeTowerProcessor<C>' @ [60:4] ==> public constructor AbstractSimpleScopeTowerProcessor<C : Candidate>(candidateFactory: CandidateFactory<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractSimpleScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'context' @ [60:41] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'when (data) {
            TowerData.Empty -> resolveAsMember()
            is TowerData.TowerLevel -> resolveAsExtension(data.level)
            else -> emptyList()
        }' @ [62:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<C>, entry1: Collection<C>, entry2: Collection<C>): Collection<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<C>

'data' @ [62:22] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'Empty' @ [63:23] ==> public object Empty : TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[FakeCallableDescriptorForObject]

'resolveAsMember' @ [63:32] ==> private final fun resolveAsMember(): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'resolveAsExtension' @ [64:40] ==> private final fun resolveAsExtension(level: ScopeTowerLevel): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [64:59] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'level' @ [64:64] ==> public final val level: ScopeTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[PropertyDescriptorImpl]

'emptyList' @ [65:21] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'mutableListOf' @ [70:23] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'MemberScopeTowerLevel' @ [71:33] ==> public constructor MemberScopeTowerLevel(scopeTower: ImplicitScopeTower, dispatchReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [71:55] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'explicitReceiver' @ [71:67] ==> public final val explicitReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'invoke' @ [71:85] ==> public abstract operator fun ScopeTowerLevel.invoke(extensionReceiver: @ParameterName ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in kotlin.Function2[FunctionInvokeDescriptor]

'!' @ [72:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'memberCandidate' @ [72:18] ==> val memberCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsMember[LocalVariableDescriptor]

'requiresExtensionReceiver' @ [72:34] ==> public val CandidateWithBoundDispatchReceiver.requiresExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'members' @ [73:17] ==> val members: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsMember[LocalVariableDescriptor]

'add' @ [73:25] ==> public abstract fun add(element: C): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'candidateFactory' @ [73:29] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [73:46] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'memberCandidate' @ [73:62] ==> val memberCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsMember[LocalVariableDescriptor]

'DISPATCH_RECEIVER' @ [73:100] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'members' @ [76:16] ==> val members: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsMember[LocalVariableDescriptor]

'mutableListOf' @ [80:26] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'level' @ [81:36] ==> value-parameter level: ScopeTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsExtension[ValueParameterDescriptorImpl]

'invoke' @ [81:42] ==> public abstract operator fun ScopeTowerLevel.invoke(extensionReceiver: @ParameterName ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in kotlin.Function2[FunctionInvokeDescriptor]

'explicitReceiver' @ [81:60] ==> public final val explicitReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'extensionCandidate' @ [82:17] ==> val extensionCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsExtension[LocalVariableDescriptor]

'requiresExtensionReceiver' @ [82:36] ==> public val CandidateWithBoundDispatchReceiver.requiresExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'extensions' @ [83:17] ==> val extensions: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsExtension[LocalVariableDescriptor]

'add' @ [83:28] ==> public abstract fun add(element: C): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'candidateFactory' @ [83:32] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [83:49] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'extensionCandidate' @ [83:65] ==> val extensionCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsExtension[LocalVariableDescriptor]

'EXTENSION_RECEIVER' @ [83:106] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'explicitReceiver' @ [83:146] ==> public final val explicitReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'extensions' @ [86:16] ==> val extensions: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor.resolveAsExtension[LocalVariableDescriptor]

'AbstractSimpleScopeTowerProcessor<C>' @ [95:4] ==> public constructor AbstractSimpleScopeTowerProcessor<C : Candidate>(candidateFactory: CandidateFactory<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractSimpleScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'context' @ [95:41] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'data' @ [97:13] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'Empty' @ [97:31] ==> public object Empty : TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[FakeCallableDescriptorForObject]

'emptyList' @ [97:45] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'mutableListOf' @ [99:29] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'QualifierScopeTowerLevel' @ [100:32] ==> public constructor QualifierScopeTowerLevel(scopeTower: ImplicitScopeTower, qualifier: QualifierReceiver) defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerLevel[ClassConstructorDescriptorImpl]

'scopeTower' @ [100:57] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor[PropertyDescriptorImpl]

'qualifier' @ [100:69] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor[PropertyDescriptorImpl]

'invoke' @ [100:80] ==> public abstract operator fun ScopeTowerLevel.invoke(extensionReceiver: @ParameterName ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in kotlin.Function2[FunctionInvokeDescriptor]

'!' @ [101:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'towerCandidate' @ [101:18] ==> val towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'requiresExtensionReceiver' @ [101:33] ==> public val CandidateWithBoundDispatchReceiver.requiresExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'staticMembers' @ [102:17] ==> val staticMembers: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'add' @ [102:31] ==> public abstract fun add(element: C): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'candidateFactory' @ [102:35] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [102:52] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'towerCandidate' @ [102:68] ==> val towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'NO_EXPLICIT_RECEIVER' @ [102:105] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'staticMembers' @ [105:16] ==> val staticMembers: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'AbstractSimpleScopeTowerProcessor<C>' @ [112:5] ==> public constructor AbstractSimpleScopeTowerProcessor<C : Candidate>(candidateFactory: CandidateFactory<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.AbstractSimpleScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'context' @ [112:42] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.<init>[ValueParameterDescriptorImpl]

'when(data) {
                is TowerData.TowerLevel -> {
                    val result = mutableListOf<C>()
                    for (towerCandidate in data.level.collectCandidates(null)) {
                        if (!towerCandidate.requiresExtensionReceiver) {
                            result.add(candidateFactory.createCandidate(towerCandidate, ExplicitReceiverKind.NO_EXPLICIT_RECEIVER, extensionReceiver = null))
                        }
                    }
                    result
                }
                is TowerData.BothTowerLevelAndImplicitReceiver -> {
                    val result = mutableListOf<C>()
                    for (towerCandidate in data.level.collectCandidates(data.implicitReceiver)) {
                        if (towerCandidate.requiresExtensionReceiver) {
                            result.add(candidateFactory.createCandidate(towerCandidate, ExplicitReceiverKind.NO_EXPLICIT_RECEIVER, extensionReceiver = data.implicitReceiver))
                        }
                    }
                    result
                }
                else -> emptyList()
            }' @ [114:15] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<C>, entry1: Collection<C>, entry2: Collection<C>): Collection<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<C>

'data' @ [114:20] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'mutableListOf' @ [116:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'data' @ [117:44] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'level' @ [117:49] ==> public final val level: ScopeTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[PropertyDescriptorImpl]

'invoke' @ [117:55] ==> public abstract operator fun ScopeTowerLevel.invoke(extensionReceiver: @ParameterName ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in kotlin.Function2[FunctionInvokeDescriptor]

'!' @ [118:29] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'towerCandidate' @ [118:30] ==> val towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'requiresExtensionReceiver' @ [118:45] ==> public val CandidateWithBoundDispatchReceiver.requiresExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'result' @ [119:29] ==> val result: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'add' @ [119:36] ==> public abstract fun add(element: C): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'candidateFactory' @ [119:40] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [119:57] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'towerCandidate' @ [119:73] ==> val towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'NO_EXPLICIT_RECEIVER' @ [119:110] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'result' @ [122:21] ==> val result: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'mutableListOf' @ [125:34] ==> @SinceKotlin @InlineOnly public inline fun <T> mutableListOf(): MutableList<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'data' @ [126:44] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'level' @ [126:49] ==> public final val level: ScopeTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[PropertyDescriptorImpl]

'invoke' @ [126:55] ==> public abstract operator fun ScopeTowerLevel.invoke(extensionReceiver: @ParameterName ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in kotlin.Function2[FunctionInvokeDescriptor]

'data' @ [126:73] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'implicitReceiver' @ [126:78] ==> public final val implicitReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[PropertyDescriptorImpl]

'towerCandidate' @ [127:29] ==> val towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'requiresExtensionReceiver' @ [127:44] ==> public val CandidateWithBoundDispatchReceiver.requiresExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'result' @ [128:29] ==> val result: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'add' @ [128:36] ==> public abstract fun add(element: C): Boolean defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'candidateFactory' @ [128:40] ==> public final val candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor[PropertyDescriptorImpl]

'createCandidate' @ [128:57] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'towerCandidate' @ [128:73] ==> val towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'NO_EXPLICIT_RECEIVER' @ [128:110] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'data' @ [128:152] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[ValueParameterDescriptorImpl]

'implicitReceiver' @ [128:157] ==> public final val implicitReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[PropertyDescriptorImpl]

'result' @ [131:21] ==> val result: MutableList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor.simpleProcess[LocalVariableDescriptor]

'emptyList' @ [133:25] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'component1' @ [145:10] ==> public final operator fun component1(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [145:19] ==> public final operator fun component2(): List<CandidateWithBoundDispatchReceiver> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'scopeTowerLevel' @ [146:13] ==> value-parameter scopeTowerLevel: ScopeTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[ValueParameterDescriptorImpl]

'invoke' @ [146:29] ==> public abstract operator fun ScopeTowerLevel.invoke(extensionReceiver: @ParameterName ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in kotlin.Function2[FunctionInvokeDescriptor]

'filter' @ [147:22] ==> public inline fun <T> Iterable<CandidateWithBoundDispatchReceiver>.filter(predicate: (CandidateWithBoundDispatchReceiver) -> Boolean): List<CandidateWithBoundDispatchReceiver> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'it' @ [148:25] ==> value-parameter it: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [148:28] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'dispatchReceiverParameter' @ [148:39] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'it' @ [148:76] ==> value-parameter it: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [148:79] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [148:90] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'partition' @ [149:23] ==> public inline fun <T> Iterable<CandidateWithBoundDispatchReceiver>.partition(predicate: (CandidateWithBoundDispatchReceiver) -> Boolean): Pair<List<CandidateWithBoundDispatchReceiver>, List<CandidateWithBoundDispatchReceiver>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver

'!' @ [149:35] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [149:36] ==> value-parameter it: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers.<anonymous>[ValueParameterDescriptorImpl]

'requiresExtensionReceiver' @ [149:39] ==> public val CandidateWithBoundDispatchReceiver.requiresExtensionReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'members' @ [151:12] ==> val members: List<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[LocalVariableDescriptor]

'map' @ [151:20] ==> public inline fun <T, R> Iterable<CandidateWithBoundDispatchReceiver>.map(transform: (CandidateWithBoundDispatchReceiver) -> C): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver
    <R> -> C

'candidateFactory' @ [152:16] ==> value-parameter candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[ValueParameterDescriptorImpl]

'createCandidate' @ [152:33] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'it' @ [153:24] ==> value-parameter it: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers.<anonymous>[ValueParameterDescriptorImpl]

'if (isExplicitReceiver) ExplicitReceiverKind.DISPATCH_RECEIVER else ExplicitReceiverKind.NO_EXPLICIT_RECEIVER' @ [154:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExplicitReceiverKind, elseBranch: ExplicitReceiverKind): ExplicitReceiverKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExplicitReceiverKind

'isExplicitReceiver' @ [154:28] ==> value-parameter isExplicitReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[ValueParameterDescriptorImpl]

'DISPATCH_RECEIVER' @ [154:69] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'NO_EXPLICIT_RECEIVER' @ [154:113] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'syntheticExtension' @ [158:12] ==> val syntheticExtension: List<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[LocalVariableDescriptor]

'map' @ [158:31] ==> public inline fun <T, R> Iterable<CandidateWithBoundDispatchReceiver>.map(transform: (CandidateWithBoundDispatchReceiver) -> C): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CandidateWithBoundDispatchReceiver
    <R> -> C

'candidateFactory' @ [159:16] ==> value-parameter candidateFactory: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[ValueParameterDescriptorImpl]

'createCandidate' @ [159:33] ==> public abstract fun createCandidate(towerCandidate: CandidateWithBoundDispatchReceiver, explicitReceiverKind: ExplicitReceiverKind, extensionReceiver: ReceiverValueWithSmartCastInfo?): C defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateFactory[SimpleFunctionDescriptorImpl]

'it' @ [160:24] ==> value-parameter it: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers.<anonymous>[ValueParameterDescriptorImpl]

'if (isExplicitReceiver) ExplicitReceiverKind.EXTENSION_RECEIVER else ExplicitReceiverKind.NO_EXPLICIT_RECEIVER' @ [161:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ExplicitReceiverKind, elseBranch: ExplicitReceiverKind): ExplicitReceiverKind[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ExplicitReceiverKind

'isExplicitReceiver' @ [161:28] ==> value-parameter isExplicitReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[ValueParameterDescriptorImpl]

'EXTENSION_RECEIVER' @ [161:69] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'NO_EXPLICIT_RECEIVER' @ [161:114] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'receiverForMember' @ [162:44] ==> value-parameter receiverForMember: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.processCommonAndSyntheticMembers[ValueParameterDescriptorImpl]

'when (explicitReceiver) {
            is ReceiverValueWithSmartCastInfo -> ExplicitReceiverScopeTowerProcessor(scopeTower, context, explicitReceiver, collectCandidates)
            is QualifierReceiver -> QualifierScopeTowerProcessor(scopeTower, context, explicitReceiver, collectCandidates)
            else -> {
                assert(explicitReceiver == null) {
                    "Illegal explicit receiver: $explicitReceiver(${explicitReceiver!!::class.java.simpleName})"
                }
                NoExplicitReceiverScopeTowerProcessor(context, collectCandidates)
            }
        }' @ [173:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: SimpleScopeTowerProcessor<C>, entry1: SimpleScopeTowerProcessor<C>, entry2: SimpleScopeTowerProcessor<C>): SimpleScopeTowerProcessor<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> SimpleScopeTowerProcessor<C>

'explicitReceiver' @ [173:15] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'ExplicitReceiverScopeTowerProcessor' @ [174:50] ==> public constructor ExplicitReceiverScopeTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: ReceiverValueWithSmartCastInfo, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */) defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [174:86] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'context' @ [174:98] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'explicitReceiver' @ [174:107] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'collectCandidates' @ [174:125] ==> value-parameter collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */ defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'QualifierScopeTowerProcessor' @ [175:37] ==> public constructor QualifierScopeTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, qualifier: QualifierReceiver, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */) defined in org.jetbrains.kotlin.resolve.calls.tower.QualifierScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [175:66] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'context' @ [175:78] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'explicitReceiver' @ [175:87] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'collectCandidates' @ [175:105] ==> value-parameter collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */ defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'assert' @ [177:17] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'explicitReceiver' @ [177:24] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'explicitReceiver' @ [178:50] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'explicitReceiver' @ [178:69] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'java' @ [178:95] ==> public val <T> KClass<out DetailedReceiver>.java: Class<out DetailedReceiver> defined in kotlin.jvm[DeserializedPropertyDescriptor]
Inferred types:
    <T> -> DetailedReceiver

'simpleName' @ [178:100] ==> public final val <T : (Any..Any?)> Class<out DetailedReceiver>.simpleName: (String..String?)[MyPropertyDescriptor]
Inferred types:
    <T : (Any..Any?)> -> DetailedReceiver

'NoExplicitReceiverScopeTowerProcessor' @ [180:17] ==> public constructor NoExplicitReceiverScopeTowerProcessor<C : Candidate>(context: CandidateFactory<C>, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */) defined in org.jetbrains.kotlin.resolve.calls.tower.NoExplicitReceiverScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'context' @ [180:55] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'collectCandidates' @ [180:64] ==> value-parameter collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */ defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessorWithoutClassValueReceiver[ValueParameterDescriptorImpl]

'createSimpleProcessorWithoutClassValueReceiver' @ [191:38] ==> private fun <C : Candidate> createSimpleProcessorWithoutClassValueReceiver(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */): SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [191:85] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'context' @ [191:97] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [191:106] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'collectCandidates' @ [191:124] ==> value-parameter collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */ defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'classValueReceiver' @ [193:9] ==> value-parameter classValueReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [193:31] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [194:26] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'classValueReceiverWithSmartCastInfo' @ [194:43] ==> public open val classValueReceiverWithSmartCastInfo: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'withoutClassValueProcessor' @ [194:89] ==> val withoutClassValueProcessor: SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[LocalVariableDescriptor]

'PrioritizedCompositeScopeTowerProcessor' @ [195:16] ==> public constructor PrioritizedCompositeScopeTowerProcessor<out C>(vararg processors: ScopeTowerProcessor<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'withoutClassValueProcessor' @ [196:17] ==> val withoutClassValueProcessor: SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[LocalVariableDescriptor]

'ExplicitReceiverScopeTowerProcessor' @ [197:17] ==> public constructor ExplicitReceiverScopeTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: ReceiverValueWithSmartCastInfo, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */) defined in org.jetbrains.kotlin.resolve.calls.tower.ExplicitReceiverScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [197:53] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'context' @ [197:65] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'classValue' @ [197:74] ==> val classValue: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[LocalVariableDescriptor]

'collectCandidates' @ [197:86] ==> value-parameter collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */ defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[ValueParameterDescriptorImpl]

'withoutClassValueProcessor' @ [200:12] ==> val withoutClassValueProcessor: SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleProcessor[LocalVariableDescriptor]

'createSimpleProcessorWithoutClassValueReceiver' @ [208:20] ==> private fun <C : Candidate> createSimpleProcessorWithoutClassValueReceiver(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */): SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [208:67] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'context' @ [208:79] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [208:88] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'getVariables' @ [208:108] ==> public abstract fun getVariables(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [208:121] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'it' @ [208:127] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor.<anonymous>[ValueParameterDescriptorImpl]

'createSimpleProcessorWithoutClassValueReceiver' @ [209:20] ==> private fun <C : Candidate> createSimpleProcessorWithoutClassValueReceiver(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */): SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [209:67] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'context' @ [209:79] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [209:88] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'getFunctions' @ [209:108] ==> public abstract fun getFunctions(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [209:121] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'it' @ [209:127] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor.<anonymous>[ValueParameterDescriptorImpl]

'SamePriorityCompositeScopeTowerProcessor' @ [210:12] ==> public constructor SamePriorityCompositeScopeTowerProcessor<out C>(vararg processors: SimpleScopeTowerProcessor<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.SamePriorityCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'variable' @ [210:53] ==> val variable: SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[LocalVariableDescriptor]

'function' @ [210:63] ==> val function: SimpleScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createCallableReferenceProcessor[LocalVariableDescriptor]

'createSimpleProcessor' @ [215:5] ==> private fun <C : Candidate> createSimpleProcessor(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */): ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [215:27] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableProcessor[ValueParameterDescriptorImpl]

'context' @ [215:39] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [215:48] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableProcessor[ValueParameterDescriptorImpl]

'classValueReceiver' @ [215:66] ==> value-parameter classValueReceiver: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableProcessor[ValueParameterDescriptorImpl]

'getVariables' @ [215:88] ==> public abstract fun getVariables(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [215:101] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableProcessor[ValueParameterDescriptorImpl]

'it' @ [215:107] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableProcessor.<anonymous>[ValueParameterDescriptorImpl]

'PrioritizedCompositeScopeTowerProcessor' @ [219:5] ==> public constructor PrioritizedCompositeScopeTowerProcessor<out C>(vararg processors: ScopeTowerProcessor<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'createVariableProcessor' @ [220:9] ==> public fun <C : Candidate> createVariableProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [220:33] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'name' @ [220:45] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'context' @ [220:51] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [220:60] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'createSimpleProcessor' @ [221:9] ==> private fun <C : Candidate> createSimpleProcessor(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */): ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [221:31] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'context' @ [221:43] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [221:52] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'classValueReceiver' @ [221:70] ==> value-parameter classValueReceiver: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'getObjects' @ [221:92] ==> public abstract fun getObjects(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [221:103] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor[ValueParameterDescriptorImpl]

'it' @ [221:109] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createVariableAndObjectProcessor.<anonymous>[ValueParameterDescriptorImpl]

'createSimpleProcessor' @ [226:5] ==> private fun <C : Candidate> createSimpleProcessor(scopeTower: ImplicitScopeTower, context: CandidateFactory<C>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean, collectCandidates: CandidatesCollector /* = ScopeTowerLevel.(extensionReceiver: ReceiverValueWithSmartCastInfo?) -> Collection<CandidateWithBoundDispatchReceiver> */): ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'scopeTower' @ [226:27] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleFunctionProcessor[ValueParameterDescriptorImpl]

'context' @ [226:39] ==> value-parameter context: CandidateFactory<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleFunctionProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [226:48] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleFunctionProcessor[ValueParameterDescriptorImpl]

'classValueReceiver' @ [226:66] ==> value-parameter classValueReceiver: Boolean = ... defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleFunctionProcessor[ValueParameterDescriptorImpl]

'getFunctions' @ [226:88] ==> public abstract fun getFunctions(name: Name, extensionReceiver: ReceiverValueWithSmartCastInfo?): Collection<CandidateWithBoundDispatchReceiver> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerLevel[SimpleFunctionDescriptorImpl]

'name' @ [226:101] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleFunctionProcessor[ValueParameterDescriptorImpl]

'it' @ [226:107] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createSimpleFunctionProcessor.<anonymous>[ValueParameterDescriptorImpl]

'createSimpleFunctionProcessor' @ [238:26] ==> public fun <C : Candidate> createSimpleFunctionProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<С>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): ScopeTowerProcessor<С> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> С

'scopeTower' @ [238:56] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'name' @ [238:68] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'simpleContext' @ [238:74] ==> value-parameter simpleContext: CandidateFactory<С> defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [238:89] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'InvokeTowerProcessor' @ [241:27] ==> public constructor InvokeTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, name: Name, factoryProviderForInvoke: CandidateFactoryProviderForInvoke<С>, explicitReceiver: DetailedReceiver?) defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> С

'scopeTower' @ [241:48] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'name' @ [241:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'factoryProviderForInvoke' @ [241:66] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<С> defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'explicitReceiver' @ [241:92] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'createProcessorWithReceiverValueOrEmpty' @ [244:36] ==> public fun <C : Candidate> createProcessorWithReceiverValueOrEmpty(explicitReceiver: DetailedReceiver?, create: (ReceiverValueWithSmartCastInfo?) -> ScopeTowerProcessor<С>): ScopeTowerProcessor<С> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> С

'explicitReceiver' @ [244:76] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'InvokeExtensionTowerProcessor' @ [245:9] ==> public constructor InvokeExtensionTowerProcessor<C : Candidate>(scopeTower: ImplicitScopeTower, name: Name, factoryProviderForInvoke: CandidateFactoryProviderForInvoke<С>, explicitReceiver: ReceiverValueWithSmartCastInfo?) defined in org.jetbrains.kotlin.resolve.calls.tower.InvokeExtensionTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> С

'scopeTower' @ [245:39] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'name' @ [245:51] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'factoryProviderForInvoke' @ [245:57] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<С> defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[ValueParameterDescriptorImpl]

'it' @ [245:83] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor.<anonymous>[ValueParameterDescriptorImpl]

'PrioritizedCompositeScopeTowerProcessor' @ [248:12] ==> public constructor PrioritizedCompositeScopeTowerProcessor<out C>(vararg processors: ScopeTowerProcessor<С>) defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> С

'simpleFunction' @ [248:52] ==> val simpleFunction: ScopeTowerProcessor<С> defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[LocalVariableDescriptor]

'invokeProcessor' @ [248:68] ==> val invokeProcessor: InvokeTowerProcessor<С> defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[LocalVariableDescriptor]

'invokeExtensionProcessor' @ [248:85] ==> val invokeExtensionProcessor: ScopeTowerProcessor<С> defined in org.jetbrains.kotlin.resolve.calls.tower.createFunctionProcessor[LocalVariableDescriptor]

'if (explicitReceiver is QualifierReceiver) {
        explicitReceiver.classValueReceiverWithSmartCastInfo?.let(create)
        ?: KnownResultProcessor<C>(listOf())
    }
    else {
        create(explicitReceiver as ReceiverValueWithSmartCastInfo?)
    }' @ [256:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ScopeTowerProcessor<C>, elseBranch: ScopeTowerProcessor<C>): ScopeTowerProcessor<C>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ScopeTowerProcessor<C>

'explicitReceiver' @ [256:16] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createProcessorWithReceiverValueOrEmpty[ValueParameterDescriptorImpl]

'explicitReceiver' @ [257:9] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createProcessorWithReceiverValueOrEmpty[ValueParameterDescriptorImpl]

'classValueReceiverWithSmartCastInfo' @ [257:26] ==> public open val classValueReceiverWithSmartCastInfo: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'let' @ [257:63] ==> @InlineOnly public inline fun <T, R> ReceiverValueWithSmartCastInfo.let(block: (ReceiverValueWithSmartCastInfo) -> ScopeTowerProcessor<C>): ScopeTowerProcessor<C> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValueWithSmartCastInfo
    <R> -> ScopeTowerProcessor<C>

'create' @ [257:67] ==> value-parameter create: (ReceiverValueWithSmartCastInfo?) -> ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.createProcessorWithReceiverValueOrEmpty[ValueParameterDescriptorImpl]

'KnownResultProcessor' @ [258:12] ==> public constructor KnownResultProcessor<out C>(result: Collection<C>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> C

'listOf' @ [258:36] ==> @InlineOnly public inline fun <T> listOf(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'invoke' @ [261:9] ==> public abstract operator fun invoke(p1: ReceiverValueWithSmartCastInfo?): ScopeTowerProcessor<C> defined in kotlin.Function1[FunctionInvokeDescriptor]

'explicitReceiver' @ [261:16] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.createProcessorWithReceiverValueOrEmpty[ValueParameterDescriptorImpl]

