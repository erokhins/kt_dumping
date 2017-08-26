'TowerData' @ [55:20] ==> private constructor TowerData() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[ClassConstructorDescriptorImpl]

'TowerData' @ [56:87] ==> private constructor TowerData() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[ClassConstructorDescriptorImpl]

'TowerData' @ [57:52] ==> private constructor TowerData() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[ClassConstructorDescriptorImpl]

'TowerData' @ [58:129] ==> private constructor TowerData() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[ClassConstructorDescriptorImpl]

'listOfNotNull' @ [70:66] ==> public fun <T : Any> listOfNotNull(element: Collection<C>?): List<Collection<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> Collection<C>

'simpleProcess' @ [70:80] ==> public abstract fun simpleProcess(data: TowerData): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.SimpleScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'data' @ [70:94] ==> value-parameter data: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.SimpleScopeTowerProcessor.process[ValueParameterDescriptorImpl]

'takeIf' @ [70:100] ==> @InlineOnly @SinceKotlin public inline fun <T> Collection<C>.takeIf(predicate: (Collection<C>) -> Boolean): Collection<C>? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>

'it' @ [70:109] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.SimpleScopeTowerProcessor.process.<anonymous>[ValueParameterDescriptorImpl]

'isNotEmpty' @ [70:112] ==> @InlineOnly public inline fun <T> Collection<C>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'scopeTower' @ [78:24] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runResolve[ValueParameterDescriptorImpl]

'run' @ [78:35] ==> private final fun <C : Candidate> ImplicitScopeTower.run(processor: ScopeTowerProcessor<C>, resultCollector: TowerResolver.ResultCollector<C>, useOrder: Boolean): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'processor' @ [78:39] ==> value-parameter processor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runResolve[ValueParameterDescriptorImpl]

'SuccessfulResultCollector' @ [78:50] ==> public constructor SuccessfulResultCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'useOrder' @ [78:79] ==> value-parameter useOrder: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runResolve[ValueParameterDescriptorImpl]

'scopeTower' @ [84:15] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.collectAllCandidates[ValueParameterDescriptorImpl]

'run' @ [84:26] ==> private final fun <C : Candidate> ImplicitScopeTower.run(processor: ScopeTowerProcessor<C>, resultCollector: TowerResolver.ResultCollector<C>, useOrder: Boolean): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'processor' @ [84:30] ==> value-parameter processor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.collectAllCandidates[ValueParameterDescriptorImpl]

'AllCandidatesCollector' @ [84:41] ==> public constructor AllCandidatesCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'ArrayList' @ [87:22] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> ScopeTowerLevel

'lexicalScope' @ [89:9] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'parentsWithSelf' @ [89:22] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[PropertyDescriptorImpl]

'forEach' @ [89:38] ==> public inline fun <T> Sequence<HierarchicalScope>.forEach(action: (HierarchicalScope) -> Unit): Unit defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HierarchicalScope

'if (scope is LexicalScope) {
                if (!scope.kind.withLocalDescriptors) result.add(ScopeBasedTowerLevel(this, scope))

                getImplicitReceiver(scope)?.let { result.add(MemberScopeTowerLevel(this, it)) }
            }
            else {
                result.add(ImportingScopeBasedTowerLevel(this, scope as ImportingScope))
            }' @ [90:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Boolean?, elseBranch: Boolean?): Boolean?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Boolean?

'scope' @ [90:17] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [91:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'scope' @ [91:22] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [91:28] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'withLocalDescriptors' @ [91:33] ==> public final val withLocalDescriptors: Boolean defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[PropertyDescriptorImpl]

'result' @ [91:55] ==> val result: ArrayList<ScopeTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[LocalVariableDescriptor]

'add' @ [91:62] ==> public open fun add(element: ScopeTowerLevel): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ScopeBasedTowerLevel' @ [91:66] ==> internal constructor ScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, lexicalScope: LexicalScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [91:87] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[ReceiverParameterDescriptorImpl]

'scope' @ [91:93] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels.<anonymous>[ValueParameterDescriptorImpl]

'getImplicitReceiver' @ [93:17] ==> public abstract fun getImplicitReceiver(scope: LexicalScope): ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[SimpleFunctionDescriptorImpl]

'scope' @ [93:37] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [93:45] ==> @InlineOnly public inline fun <T, R> ReceiverValueWithSmartCastInfo.let(block: (ReceiverValueWithSmartCastInfo) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValueWithSmartCastInfo
    <R> -> Boolean

'result' @ [93:51] ==> val result: ArrayList<ScopeTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[LocalVariableDescriptor]

'add' @ [93:58] ==> public open fun add(element: ScopeTowerLevel): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'MemberScopeTowerLevel' @ [93:62] ==> public constructor MemberScopeTowerLevel(scopeTower: ImplicitScopeTower, dispatchReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [93:84] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[ReceiverParameterDescriptorImpl]

'it' @ [93:90] ==> value-parameter it: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [96:17] ==> val result: ArrayList<ScopeTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[LocalVariableDescriptor]

'add' @ [96:24] ==> public open fun add(element: ScopeTowerLevel): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'ImportingScopeBasedTowerLevel' @ [96:28] ==> public constructor ImportingScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, importingScope: ImportingScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ImportingScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [96:58] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[ReceiverParameterDescriptorImpl]

'scope' @ [96:64] ==> value-parameter scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels.<anonymous>[ValueParameterDescriptorImpl]

'result' @ [100:16] ==> val result: ArrayList<ScopeTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.createNonLocalLevels[LocalVariableDescriptor]

'processTowerData' @ [108:35] ==> private final fun <C : Candidate> processTowerData(processor: ScopeTowerProcessor<C>, resultCollector: TowerResolver.ResultCollector<C>, useOrder: Boolean, towerData: TowerData): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'processor' @ [108:52] ==> value-parameter processor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ValueParameterDescriptorImpl]

'resultCollector' @ [108:63] ==> value-parameter resultCollector: TowerResolver.ResultCollector<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ValueParameterDescriptorImpl]

'useOrder' @ [108:80] ==> value-parameter useOrder: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ValueParameterDescriptorImpl]

'this' @ [108:90] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.process[ReceiverParameterDescriptorImpl]

'lexicalScope' @ [110:27] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'parentsWithSelf' @ [110:40] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[PropertyDescriptorImpl]

'filterIsInstance' @ [111:17] ==> public inline fun <reified R> Sequence<*>.filterIsInstance(): Sequence<LexicalScope> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified R> -> LexicalScope

'filter' @ [111:50] ==> public fun <T> Sequence<LexicalScope>.filter(predicate: (LexicalScope) -> Boolean): Sequence<LexicalScope> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LexicalScope

'it' @ [111:59] ==> value-parameter it: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'kind' @ [111:62] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'withLocalDescriptors' @ [111:67] ==> public final val withLocalDescriptors: Boolean defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[PropertyDescriptorImpl]

'map' @ [112:17] ==> public fun <T, R> Sequence<LexicalScope>.map(transform: (LexicalScope) -> ScopeBasedTowerLevel): Sequence<ScopeBasedTowerLevel> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> LexicalScope
    <R> -> ScopeBasedTowerLevel

'ScopeBasedTowerLevel' @ [112:23] ==> internal constructor ScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, lexicalScope: LexicalScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'this@run' @ [112:44] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ReceiverParameterDescriptorImpl]

'it' @ [112:54] ==> value-parameter it: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'HidesMembersTowerLevel' @ [116:33] ==> public constructor HidesMembersTowerLevel(scopeTower: ImplicitScopeTower) defined in org.jetbrains.kotlin.resolve.calls.tower.HidesMembersTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [116:56] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ReceiverParameterDescriptorImpl]

'SyntheticScopeBasedTowerLevel' @ [117:30] ==> public constructor SyntheticScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, syntheticScopes: SyntheticScopes) defined in org.jetbrains.kotlin.resolve.calls.tower.SyntheticScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [117:60] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ReceiverParameterDescriptorImpl]

'syntheticScopes' @ [117:66] ==> public abstract val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'TowerLevel' @ [120:19] ==> public constructor TowerLevel(level: ScopeTowerLevel) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[ClassConstructorDescriptorImpl]

'hidesMembersLevel' @ [120:30] ==> val hidesMembersLevel: HidesMembersTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [120:49] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [120:60] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [120:73] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'process' @ [122:25] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [122:36] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [122:49] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'TowerLevel' @ [124:19] ==> public constructor TowerLevel(level: ScopeTowerLevel) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[ClassConstructorDescriptorImpl]

'syntheticLevel' @ [124:30] ==> val syntheticLevel: SyntheticScopeBasedTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [124:46] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [124:57] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [124:70] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'localLevels' @ [127:28] ==> val localLevels: Sequence<ScopeBasedTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'TowerLevel' @ [128:23] ==> public constructor TowerLevel(level: ScopeTowerLevel) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[ClassConstructorDescriptorImpl]

'localLevel' @ [128:34] ==> val localLevel: ScopeBasedTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [128:46] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [128:57] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [128:70] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'lexicalScope' @ [131:23] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'parentsWithSelf' @ [131:36] ==> public val HierarchicalScope.parentsWithSelf: Sequence<HierarchicalScope> defined in org.jetbrains.kotlin.resolve.scopes.utils in file ScopeUtils.kt[PropertyDescriptorImpl]

'if (scope is LexicalScope) {
                // statics
                if (!scope.kind.withLocalDescriptors) {
                    TowerData.TowerLevel(ScopeBasedTowerLevel(this, scope)).process()?.let { return it }
                }

                val implicitReceiver = getImplicitReceiver(scope)
                if (implicitReceiver != null) {
                    // hides members extensions
                    TowerData.BothTowerLevelAndImplicitReceiver(hidesMembersLevel, implicitReceiver).process()?.let { return it }

                    // members of implicit receiver or member extension for explicit receiver
                    TowerData.TowerLevel(MemberScopeTowerLevel(this, implicitReceiver)).process()?.let { return it }

                    // synthetic properties
                    TowerData.BothTowerLevelAndImplicitReceiver(syntheticLevel, implicitReceiver).process()?.let { return it }

                    // invokeExtension on local variable
                    TowerData.OnlyImplicitReceiver(implicitReceiver).process()?.let { return it }

                    // local extensions for implicit receiver
                    for (localLevel in localLevels) {
                        TowerData.BothTowerLevelAndImplicitReceiver(localLevel, implicitReceiver).process()?.let { return it }
                    }

                    // extension for implicit receiver
                    if (nonLocalLevels == null) {
                        nonLocalLevels = createNonLocalLevels()
                    }

                    for (nonLocalLevel in nonLocalLevels) {
                        TowerData.BothTowerLevelAndImplicitReceiver(nonLocalLevel, implicitReceiver).process()?.let { return it }
                    }
                }
            }
            else {
                // functions with no receiver or extension for explicit receiver
                TowerData.TowerLevel(ImportingScopeBasedTowerLevel(this, scope as ImportingScope)).process()?.let { return it }
            }' @ [132:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit?, elseBranch: Unit?): Unit?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit?

'scope' @ [132:17] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'!' @ [134:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'scope' @ [134:22] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'kind' @ [134:28] ==> public abstract val kind: LexicalScopeKind defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'withLocalDescriptors' @ [134:33] ==> public final val withLocalDescriptors: Boolean defined in org.jetbrains.kotlin.resolve.scopes.LexicalScopeKind[PropertyDescriptorImpl]

'TowerLevel' @ [135:31] ==> public constructor TowerLevel(level: ScopeTowerLevel) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[ClassConstructorDescriptorImpl]

'ScopeBasedTowerLevel' @ [135:42] ==> internal constructor ScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, lexicalScope: LexicalScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [135:63] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ReceiverParameterDescriptorImpl]

'scope' @ [135:69] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [135:77] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [135:88] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [135:101] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'getImplicitReceiver' @ [138:40] ==> public abstract fun getImplicitReceiver(scope: LexicalScope): ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[SimpleFunctionDescriptorImpl]

'scope' @ [138:60] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'implicitReceiver' @ [139:21] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'BothTowerLevelAndImplicitReceiver' @ [141:31] ==> public constructor BothTowerLevelAndImplicitReceiver(level: ScopeTowerLevel, implicitReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[ClassConstructorDescriptorImpl]

'hidesMembersLevel' @ [141:65] ==> val hidesMembersLevel: HidesMembersTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'implicitReceiver' @ [141:84] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [141:102] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [141:113] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [141:126] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'TowerLevel' @ [144:31] ==> public constructor TowerLevel(level: ScopeTowerLevel) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[ClassConstructorDescriptorImpl]

'MemberScopeTowerLevel' @ [144:42] ==> public constructor MemberScopeTowerLevel(scopeTower: ImplicitScopeTower, dispatchReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.MemberScopeTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [144:64] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ReceiverParameterDescriptorImpl]

'implicitReceiver' @ [144:70] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [144:89] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [144:100] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [144:113] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'BothTowerLevelAndImplicitReceiver' @ [147:31] ==> public constructor BothTowerLevelAndImplicitReceiver(level: ScopeTowerLevel, implicitReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[ClassConstructorDescriptorImpl]

'syntheticLevel' @ [147:65] ==> val syntheticLevel: SyntheticScopeBasedTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'implicitReceiver' @ [147:81] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [147:99] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [147:110] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [147:123] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'OnlyImplicitReceiver' @ [150:31] ==> public constructor OnlyImplicitReceiver(implicitReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.OnlyImplicitReceiver[ClassConstructorDescriptorImpl]

'implicitReceiver' @ [150:52] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [150:70] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [150:81] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [150:94] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'localLevels' @ [153:40] ==> val localLevels: Sequence<ScopeBasedTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'BothTowerLevelAndImplicitReceiver' @ [154:35] ==> public constructor BothTowerLevelAndImplicitReceiver(level: ScopeTowerLevel, implicitReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[ClassConstructorDescriptorImpl]

'localLevel' @ [154:69] ==> val localLevel: ScopeBasedTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'implicitReceiver' @ [154:81] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [154:99] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [154:110] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [154:123] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'nonLocalLevels' @ [158:25] ==> var nonLocalLevels: Collection<ScopeTowerLevel>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'nonLocalLevels' @ [159:25] ==> var nonLocalLevels: Collection<ScopeTowerLevel>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'createNonLocalLevels' @ [159:42] ==> private final fun ImplicitScopeTower.createNonLocalLevels(): List<ScopeTowerLevel> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]

'nonLocalLevels' @ [162:43] ==> var nonLocalLevels: Collection<ScopeTowerLevel>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'BothTowerLevelAndImplicitReceiver' @ [163:35] ==> public constructor BothTowerLevelAndImplicitReceiver(level: ScopeTowerLevel, implicitReceiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.BothTowerLevelAndImplicitReceiver[ClassConstructorDescriptorImpl]

'nonLocalLevel' @ [163:69] ==> val nonLocalLevel: ScopeTowerLevel defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'implicitReceiver' @ [163:84] ==> val implicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [163:102] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [163:113] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [163:126] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'TowerLevel' @ [169:27] ==> public constructor TowerLevel(level: ScopeTowerLevel) defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData.TowerLevel[ClassConstructorDescriptorImpl]

'ImportingScopeBasedTowerLevel' @ [169:38] ==> public constructor ImportingScopeBasedTowerLevel(scopeTower: ImplicitScopeTower, importingScope: ImportingScope) defined in org.jetbrains.kotlin.resolve.calls.tower.ImportingScopeBasedTowerLevel[ClassConstructorDescriptorImpl]

'this' @ [169:68] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ReceiverParameterDescriptorImpl]

'scope' @ [169:74] ==> val scope: HierarchicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[LocalVariableDescriptor]

'process' @ [169:100] ==> local final fun TowerData.process(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[SimpleFunctionDescriptorImpl]

'let' @ [169:111] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Unit?): Unit? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Unit?

'it' @ [169:124] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run.<anonymous>[ValueParameterDescriptorImpl]

'resultCollector' @ [173:16] ==> value-parameter resultCollector: TowerResolver.ResultCollector<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.run[ValueParameterDescriptorImpl]

'getFinalCandidates' @ [173:32] ==> public abstract fun getFinalCandidates(): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.ResultCollector[SimpleFunctionDescriptorImpl]

'processTowerData' @ [180:24] ==> private final fun <C : Candidate> processTowerData(processor: ScopeTowerProcessor<C>, resultCollector: TowerResolver.ResultCollector<C>, useOrder: Boolean, towerData: TowerData): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'processor' @ [180:41] ==> value-parameter processor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runWithEmptyTowerData[ValueParameterDescriptorImpl]

'resultCollector' @ [180:52] ==> value-parameter resultCollector: TowerResolver.ResultCollector<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runWithEmptyTowerData[ValueParameterDescriptorImpl]

'useOrder' @ [180:69] ==> value-parameter useOrder: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runWithEmptyTowerData[ValueParameterDescriptorImpl]

'Empty' @ [180:89] ==> public object Empty : TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerData[FakeCallableDescriptorForObject]

'resultCollector' @ [180:99] ==> value-parameter resultCollector: TowerResolver.ResultCollector<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.runWithEmptyTowerData[ValueParameterDescriptorImpl]

'getFinalCandidates' @ [180:115] ==> public abstract fun getFinalCandidates(): Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.ResultCollector[SimpleFunctionDescriptorImpl]

'ProgressIndicatorAndCompilationCanceledStatus' @ [188:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [188:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'if (useOrder) {
            processor.process(towerData)
        }
        else {
            listOf(processor.process(towerData).flatMap { it })
        }' @ [190:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<Collection<C>>, elseBranch: List<Collection<C>>): List<Collection<C>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<Collection<C>>

'useOrder' @ [190:36] ==> value-parameter useOrder: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'processor' @ [191:13] ==> value-parameter processor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'process' @ [191:23] ==> public abstract fun process(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'towerData' @ [191:31] ==> value-parameter towerData: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'listOf' @ [194:13] ==> public fun <T> listOf(element: List<C>): List<List<C>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> List<C>

'processor' @ [194:20] ==> value-parameter processor: ScopeTowerProcessor<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'process' @ [194:30] ==> public abstract fun process(data: TowerData): List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.ScopeTowerProcessor[SimpleFunctionDescriptorImpl]

'towerData' @ [194:38] ==> value-parameter towerData: TowerData defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'flatMap' @ [194:49] ==> public inline fun <T, R> Iterable<Collection<C>>.flatMap(transform: (Collection<C>) -> Iterable<C>): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> C

'it' @ [194:59] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData.<anonymous>[ValueParameterDescriptorImpl]

'candidatesGroups' @ [197:33] ==> val candidatesGroups: List<Collection<C>> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[LocalVariableDescriptor]

'resultCollector' @ [198:13] ==> value-parameter resultCollector: TowerResolver.ResultCollector<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'pushCandidates' @ [198:29] ==> public abstract fun pushCandidates(candidates: Collection<C>): Unit defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.ResultCollector[SimpleFunctionDescriptorImpl]

'candidatesGroup' @ [198:44] ==> val candidatesGroup: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[LocalVariableDescriptor]

'resultCollector' @ [199:13] ==> value-parameter resultCollector: TowerResolver.ResultCollector<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData[ValueParameterDescriptorImpl]

'getSuccessfulCandidates' @ [199:29] ==> public abstract fun getSuccessfulCandidates(): Collection<C>? defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.ResultCollector[SimpleFunctionDescriptorImpl]

'let' @ [199:56] ==> @InlineOnly public inline fun <T, R> Collection<C>.let(block: (Collection<C>) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R> -> Nothing

'it' @ [199:69] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.processTowerData.<anonymous>[ValueParameterDescriptorImpl]

'ResultCollector<C>' @ [214:50] ==> public constructor ResultCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.ResultCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'ArrayList' @ [215:37] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> C

'allCandidates' @ [219:60] ==> private final val allCandidates: ArrayList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector[PropertyDescriptorImpl]

'candidates' @ [222:13] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector.pushCandidates[ValueParameterDescriptorImpl]

'filterNotTo' @ [222:24] ==> public inline fun <T, C : MutableCollection<in C>> Iterable<C>.filterNotTo(destination: ArrayList<C>, predicate: (C) -> Boolean): ArrayList<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <C : MutableCollection<in T>> -> ArrayList<C>

'allCandidates' @ [222:36] ==> private final val allCandidates: ArrayList<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector[PropertyDescriptorImpl]

'it' @ [223:17] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector.pushCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingApplicability' @ [223:20] ==> public abstract val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'HIDDEN' @ [223:79] ==> enum entry HIDDEN defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'ResultCollector<C>' @ [228:54] ==> public constructor ResultCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.ResultCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> C

'arrayListOf' @ [229:39] ==> @SinceKotlin @InlineOnly public inline fun <T> arrayListOf(): ArrayList<Collection<C>> /* = ArrayList<Collection<C>> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>

'!' @ [233:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSuccessful' @ [233:18] ==> private final var isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'candidateGroups' @ [234:42] ==> private final var candidateGroups: ArrayList<Collection<C>> /* = ArrayList<Collection<C>> */ defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'firstOrNull' @ [234:58] ==> public inline fun <T> Iterable<Collection<C>>.firstOrNull(predicate: (Collection<C>) -> Boolean): Collection<C>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>

'it' @ [235:17] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getSuccessfulCandidates.<anonymous>[ValueParameterDescriptorImpl]

'any' @ [235:20] ==> public inline fun <T> Iterable<C>.any(predicate: (C) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [235:26] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getSuccessfulCandidates.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resultingApplicability' @ [235:29] ==> public abstract val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'RESOLVED' @ [235:88] ==> enum entry RESOLVED defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'firstGroupWithResolved' @ [238:20] ==> val firstGroupWithResolved: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getSuccessfulCandidates[LocalVariableDescriptor]

'filter' @ [238:43] ==> public inline fun <T> Iterable<C>.filter(predicate: (C) -> Boolean): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [238:52] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getSuccessfulCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingApplicability' @ [238:55] ==> public abstract val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'RESOLVED' @ [238:114] ==> enum entry RESOLVED defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'candidates' @ [242:37] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates[ValueParameterDescriptorImpl]

'any' @ [242:48] ==> public inline fun <T> Iterable<C>.any(predicate: (C) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [242:54] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates.<anonymous>[ValueParameterDescriptorImpl]

'isSuccessful' @ [242:57] ==> public abstract val isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'!' @ [243:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSuccessful' @ [243:18] ==> private final var isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'!' @ [243:34] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'thereIsSuccessful' @ [243:35] ==> val thereIsSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates[LocalVariableDescriptor]

'candidateGroups' @ [244:17] ==> private final var candidateGroups: ArrayList<Collection<C>> /* = ArrayList<Collection<C>> */ defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'add' @ [244:33] ==> public open fun add(element: Collection<C>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'candidates' @ [244:37] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates[ValueParameterDescriptorImpl]

'!' @ [248:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSuccessful' @ [248:18] ==> private final var isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'candidateGroups' @ [249:17] ==> private final var candidateGroups: ArrayList<Collection<C>> /* = ArrayList<Collection<C>> */ defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'clear' @ [249:33] ==> public open fun clear(): Unit defined in java.util.ArrayList[JavaMethodDescriptor]

'isSuccessful' @ [250:17] ==> private final var isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'thereIsSuccessful' @ [252:17] ==> val thereIsSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates[LocalVariableDescriptor]

'candidateGroups' @ [253:17] ==> private final var candidateGroups: ArrayList<Collection<C>> /* = ArrayList<Collection<C>> */ defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'add' @ [253:33] ==> public open fun add(element: Collection<C>): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'candidates' @ [253:37] ==> value-parameter candidates: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates[ValueParameterDescriptorImpl]

'filter' @ [253:48] ==> public inline fun <T> Iterable<C>.filter(predicate: (C) -> Boolean): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [253:57] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.pushCandidates.<anonymous>[ValueParameterDescriptorImpl]

'isSuccessful' @ [253:60] ==> public abstract val isSuccessful: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'candidateGroups' @ [258:37] ==> private final var candidateGroups: ArrayList<Collection<C>> /* = ArrayList<Collection<C>> */ defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'minBy' @ [258:53] ==> public inline fun <T, R : Comparable<ResolutionCandidateApplicability>> Iterable<Collection<C>>.minBy(selector: (Collection<C>) -> ResolutionCandidateApplicability): Collection<C>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Collection<C>
    <R : Comparable<R>> -> ResolutionCandidateApplicability

'it' @ [258:61] ==> value-parameter it: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getFinalCandidates.<anonymous>[ValueParameterDescriptorImpl]

'groupApplicability' @ [258:64] ==> private final val Collection<C>.groupApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'emptyList' @ [258:95] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'moreSuitableGroup' @ [259:38] ==> val moreSuitableGroup: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getFinalCandidates[LocalVariableDescriptor]

'groupApplicability' @ [259:56] ==> private final val Collection<C>.groupApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[PropertyDescriptorImpl]

'groupApplicability' @ [260:17] ==> val groupApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getFinalCandidates[LocalVariableDescriptor]

'HIDDEN' @ [260:72] ==> enum entry HIDDEN defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'emptyList' @ [260:87] ==> public fun <T> emptyList(): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'moreSuitableGroup' @ [262:20] ==> val moreSuitableGroup: Collection<C> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getFinalCandidates[LocalVariableDescriptor]

'filter' @ [262:38] ==> public inline fun <T> Iterable<C>.filter(predicate: (C) -> Boolean): List<C> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C

'it' @ [262:47] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getFinalCandidates.<anonymous>[ValueParameterDescriptorImpl]

'resultingApplicability' @ [262:50] ==> public abstract val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'groupApplicability' @ [262:76] ==> val groupApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.getFinalCandidates[LocalVariableDescriptor]

'minBy' @ [266:13] ==> public inline fun <T, R : Comparable<ResolutionCandidateApplicability>> Iterable<C>.minBy(selector: (C) -> ResolutionCandidateApplicability): C? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> C
    <R : Comparable<R>> -> ResolutionCandidateApplicability

'it' @ [266:21] ==> value-parameter it: C defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector.<get-groupApplicability>.<anonymous>[ValueParameterDescriptorImpl]

'resultingApplicability' @ [266:24] ==> public abstract val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'resultingApplicability' @ [266:50] ==> public abstract val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.Candidate[PropertyDescriptorImpl]

'HIDDEN' @ [266:109] ==> enum entry HIDDEN defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

