'kotlinCall' @ [44:9] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'checkCallInvariants' @ [44:20] ==> public fun KotlinCall.checkCallInvariants(): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCall.kt[SimpleFunctionDescriptorImpl]

'SimpleCandidateFactory' @ [46:32] ==> public constructor SimpleCandidateFactory(callComponents: KotlinCallComponents, scopeTower: ImplicitScopeTower, kotlinCall: KotlinCall) defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[ClassConstructorDescriptorImpl]

'callComponents' @ [46:55] ==> private final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'scopeTower' @ [46:71] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'kotlinCall' @ [46:83] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'when(kotlinCall.callKind) {
            KotlinCallKind.VARIABLE -> {
                createVariableAndObjectProcessor(scopeTower, kotlinCall.name, candidateFactory, kotlinCall.explicitReceiver?.receiver)
            }
            KotlinCallKind.FUNCTION -> {
                createFunctionProcessor(scopeTower, kotlinCall.name, candidateFactory, factoryProviderForInvoke, kotlinCall.explicitReceiver?.receiver)
            }
            KotlinCallKind.UNSUPPORTED -> throw UnsupportedOperationException()
        }' @ [47:25] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate>, entry1: PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate>, entry2: PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate>): PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate>

'kotlinCall' @ [47:30] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'callKind' @ [47:41] ==> public abstract val callKind: KotlinCallKind defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'VARIABLE' @ [48:28] ==> enum entry VARIABLE defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'createVariableAndObjectProcessor' @ [49:17] ==> public fun <C : Candidate> createVariableAndObjectProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<KotlinResolutionCandidate>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'scopeTower' @ [49:50] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'kotlinCall' @ [49:62] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'name' @ [49:73] ==> public abstract val name: Name defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'candidateFactory' @ [49:79] ==> val candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'kotlinCall' @ [49:97] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'explicitReceiver' @ [49:108] ==> public abstract val explicitReceiver: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'receiver' @ [49:126] ==> public abstract val receiver: DetailedReceiver defined in org.jetbrains.kotlin.resolve.calls.model.ReceiverKotlinCallArgument[PropertyDescriptorImpl]

'FUNCTION' @ [51:28] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'createFunctionProcessor' @ [52:17] ==> public fun <С : Candidate> createFunctionProcessor(scopeTower: ImplicitScopeTower, name: Name, simpleContext: CandidateFactory<KotlinResolutionCandidate>, factoryProviderForInvoke: CandidateFactoryProviderForInvoke<KotlinResolutionCandidate>, explicitReceiver: DetailedReceiver?): PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <С : Candidate> -> KotlinResolutionCandidate

'scopeTower' @ [52:41] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'kotlinCall' @ [52:53] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'name' @ [52:64] ==> public abstract val name: Name defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'candidateFactory' @ [52:70] ==> val candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'factoryProviderForInvoke' @ [52:88] ==> value-parameter factoryProviderForInvoke: CandidateFactoryProviderForInvoke<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'kotlinCall' @ [52:114] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'explicitReceiver' @ [52:125] ==> public abstract val explicitReceiver: ReceiverKotlinCallArgument? defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'receiver' @ [52:143] ==> public abstract val receiver: DetailedReceiver defined in org.jetbrains.kotlin.resolve.calls.model.ReceiverKotlinCallArgument[PropertyDescriptorImpl]

'UNSUPPORTED' @ [54:28] ==> enum entry UNSUPPORTED defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'UnsupportedOperationException' @ [54:49] ==> public constructor UnsupportedOperationException() defined in java.lang.UnsupportedOperationException[JavaClassConstructorDescriptor]

'collectAllCandidates' @ [57:13] ==> value-parameter collectAllCandidates: Boolean defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'towerResolver' @ [58:33] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'collectAllCandidates' @ [58:47] ==> public final fun <C : Candidate> collectAllCandidates(scopeTower: ImplicitScopeTower, processor: ScopeTowerProcessor<KotlinResolutionCandidate>): Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'scopeTower' @ [58:68] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'processor' @ [58:80] ==> val processor: PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'kotlinCallCompleter' @ [59:20] ==> private final val kotlinCallCompleter: KotlinCallCompleter defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'createAllCandidatesResult' @ [59:40] ==> public final fun createAllCandidatesResult(candidates: Collection<KotlinResolutionCandidate>, expectedType: UnwrappedType?, resolutionCallbacks: KotlinResolutionCallbacks): CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'allCandidates' @ [59:66] ==> val allCandidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'expectedType' @ [59:81] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'resolutionCallbacks' @ [59:95] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'towerResolver' @ [62:26] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'runResolve' @ [62:40] ==> public final fun <C : Candidate> runResolve(scopeTower: ImplicitScopeTower, processor: ScopeTowerProcessor<KotlinResolutionCandidate>, useOrder: Boolean): Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'scopeTower' @ [62:51] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'processor' @ [62:63] ==> val processor: PrioritizedCompositeScopeTowerProcessor<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'kotlinCall' @ [62:85] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'callKind' @ [62:96] ==> public abstract val callKind: KotlinCallKind defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCall[PropertyDescriptorImpl]

'UNSUPPORTED' @ [62:123] ==> enum entry UNSUPPORTED defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'choseMostSpecific' @ [64:16] ==> private final fun choseMostSpecific(candidateFactory: SimpleCandidateFactory, resolutionCallbacks: KotlinResolutionCallbacks, expectedType: UnwrappedType?, candidates: Collection<KotlinResolutionCandidate>): CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[SimpleFunctionDescriptorImpl]

'candidateFactory' @ [64:34] ==> val candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'resolutionCallbacks' @ [64:52] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'expectedType' @ [64:73] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[ValueParameterDescriptorImpl]

'candidates' @ [64:87] ==> val candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveCall[LocalVariableDescriptor]

'kotlinCall' @ [75:9] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'checkCallInvariants' @ [75:20] ==> public fun KotlinCall.checkCallInvariants(): Unit defined in org.jetbrains.kotlin.resolve.calls.model in file KotlinCall.kt[SimpleFunctionDescriptorImpl]

'SimpleCandidateFactory' @ [76:32] ==> public constructor SimpleCandidateFactory(callComponents: KotlinCallComponents, scopeTower: ImplicitScopeTower, kotlinCall: KotlinCall) defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[ClassConstructorDescriptorImpl]

'callComponents' @ [76:55] ==> private final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'scopeTower' @ [76:71] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'kotlinCall' @ [76:83] ==> value-parameter kotlinCall: KotlinCall defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'givenCandidates' @ [78:36] ==> value-parameter givenCandidates: Collection<GivenCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'map' @ [78:52] ==> public inline fun <T, R> Iterable<GivenCandidate>.map(transform: (GivenCandidate) -> KotlinResolutionCandidate): List<KotlinResolutionCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> GivenCandidate
    <R> -> KotlinResolutionCandidate

'candidateFactory' @ [78:58] ==> val candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[LocalVariableDescriptor]

'createCandidate' @ [78:75] ==> public final fun createCandidate(givenCandidate: GivenCandidate): KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[SimpleFunctionDescriptorImpl]

'it' @ [78:91] ==> value-parameter it: GivenCandidate defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates.<anonymous>[ValueParameterDescriptorImpl]

'forceResolution' @ [78:95] ==> public fun <C : Candidate> KotlinResolutionCandidate.forceResolution(): KotlinResolutionCandidate defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'collectAllCandidates' @ [80:13] ==> value-parameter collectAllCandidates: Boolean defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'towerResolver' @ [81:33] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'runWithEmptyTowerData' @ [81:47] ==> public final fun <C : Candidate> runWithEmptyTowerData(processor: ScopeTowerProcessor<KotlinResolutionCandidate>, resultCollector: TowerResolver.ResultCollector<KotlinResolutionCandidate>, useOrder: Boolean): Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'KnownResultProcessor' @ [81:69] ==> public constructor KnownResultProcessor<out C>(result: Collection<KotlinResolutionCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> KotlinResolutionCandidate

'resolutionCandidates' @ [81:90] ==> val resolutionCandidates: List<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[LocalVariableDescriptor]

'AllCandidatesCollector' @ [82:83] ==> public constructor AllCandidatesCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'kotlinCallCompleter' @ [84:20] ==> private final val kotlinCallCompleter: KotlinCallCompleter defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'createAllCandidatesResult' @ [84:40] ==> public final fun createAllCandidatesResult(candidates: Collection<KotlinResolutionCandidate>, expectedType: UnwrappedType?, resolutionCallbacks: KotlinResolutionCallbacks): CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'allCandidates' @ [84:66] ==> val allCandidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[LocalVariableDescriptor]

'expectedType' @ [84:81] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'resolutionCallbacks' @ [84:95] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'towerResolver' @ [87:26] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'runWithEmptyTowerData' @ [87:40] ==> public final fun <C : Candidate> runWithEmptyTowerData(processor: ScopeTowerProcessor<KotlinResolutionCandidate>, resultCollector: TowerResolver.ResultCollector<KotlinResolutionCandidate>, useOrder: Boolean): Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'KnownResultProcessor' @ [87:62] ==> public constructor KnownResultProcessor<out C>(result: Collection<KotlinResolutionCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> KotlinResolutionCandidate

'resolutionCandidates' @ [87:83] ==> val resolutionCandidates: List<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[LocalVariableDescriptor]

'SuccessfulResultCollector' @ [88:76] ==> public constructor SuccessfulResultCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[ClassConstructorDescriptorImpl]
Inferred types:
    <C : Candidate> -> KotlinResolutionCandidate

'choseMostSpecific' @ [90:16] ==> private final fun choseMostSpecific(candidateFactory: SimpleCandidateFactory, resolutionCallbacks: KotlinResolutionCallbacks, expectedType: UnwrappedType?, candidates: Collection<KotlinResolutionCandidate>): CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[SimpleFunctionDescriptorImpl]

'candidateFactory' @ [90:34] ==> val candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[LocalVariableDescriptor]

'resolutionCallbacks' @ [90:52] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'expectedType' @ [90:73] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[ValueParameterDescriptorImpl]

'candidates' @ [90:87] ==> val candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.resolveGivenCandidates[LocalVariableDescriptor]

'candidateFactory' @ [99:33] ==> value-parameter candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[ValueParameterDescriptorImpl]

'scopeTower' @ [99:50] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.model.SimpleCandidateFactory[PropertyDescriptorImpl]

'isDebuggerContext' @ [99:61] ==> public abstract val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'overloadingConflictResolver' @ [101:43] ==> private final val overloadingConflictResolver: NewOverloadingConflictResolver defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'chooseMaximallySpecificCandidates' @ [101:71] ==> public final fun chooseMaximallySpecificCandidates(candidates: Collection<KotlinResolutionCandidate>, checkArgumentsMode: CheckArgumentTypesMode, discriminateGenerics: Boolean, isDebuggerContext: Boolean): Set<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.NewOverloadingConflictResolver[SimpleFunctionDescriptorImpl]

'candidates' @ [102:17] ==> value-parameter candidates: Collection<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[ValueParameterDescriptorImpl]

'CHECK_VALUE_ARGUMENTS' @ [103:40] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'isDebuggerContext' @ [105:37] ==> val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[LocalVariableDescriptor]

'kotlinCallCompleter' @ [107:16] ==> private final val kotlinCallCompleter: KotlinCallCompleter defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver[PropertyDescriptorImpl]

'runCompletion' @ [107:36] ==> public final fun runCompletion(factory: SimpleCandidateFactory, candidates: Collection<KotlinResolutionCandidate>, expectedType: UnwrappedType?, resolutionCallbacks: KotlinResolutionCallbacks): CallResolutionResult defined in org.jetbrains.kotlin.resolve.calls.components.KotlinCallCompleter[SimpleFunctionDescriptorImpl]

'candidateFactory' @ [107:50] ==> value-parameter candidateFactory: SimpleCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[ValueParameterDescriptorImpl]

'maximallySpecificCandidates' @ [107:68] ==> val maximallySpecificCandidates: Set<KotlinResolutionCandidate> defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[LocalVariableDescriptor]

'expectedType' @ [107:97] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[ValueParameterDescriptorImpl]

'resolutionCallbacks' @ [107:111] ==> value-parameter resolutionCallbacks: KotlinResolutionCallbacks defined in org.jetbrains.kotlin.resolve.calls.KotlinCallResolver.choseMostSpecific[ValueParameterDescriptorImpl]

