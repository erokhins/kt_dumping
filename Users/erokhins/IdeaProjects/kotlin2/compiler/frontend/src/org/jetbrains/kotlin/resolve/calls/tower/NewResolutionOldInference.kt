'UNSUPPORTED' @ [71:109] ==> enum entry UNSUPPORTED defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'ResolutionKind<FunctionDescriptor>' @ [81:27] ==> private constructor ResolutionKind<D : CallableDescriptor>(kotlinCallKind: KotlinCallKind = ...) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'FUNCTION' @ [81:77] ==> enum entry FUNCTION defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'outer' @ [86:39] ==> value-parameter outer: NewResolutionOldInference defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'CandidateFactoryImpl' @ [86:45] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'name' @ [86:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'context' @ [86:72] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'tracing' @ [86:81] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'createFunctionProcessor' @ [87:24] ==> public fun <С : Candidate> createFunctionProcessor(scopeTower: ImplicitScopeTower, name: Name, simpleContext: CandidateFactory<NewResolutionOldInference.MyCandidate>, factoryProviderForInvoke: CandidateFactoryProviderForInvoke<NewResolutionOldInference.MyCandidate>, explicitReceiver: DetailedReceiver?): PrioritizedCompositeScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <С : Candidate> -> MyCandidate

'scopeTower' @ [87:48] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'name' @ [87:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'functionFactory' @ [87:66] ==> val functionFactory: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[LocalVariableDescriptor]

'outer' @ [87:83] ==> value-parameter outer: NewResolutionOldInference defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'CandidateFactoryProviderForInvokeImpl' @ [87:89] ==> public constructor CandidateFactoryProviderForInvokeImpl(functionContext: NewResolutionOldInference.CandidateFactoryImpl) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[ClassConstructorDescriptorImpl]

'functionFactory' @ [87:127] ==> val functionFactory: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[LocalVariableDescriptor]

'explicitReceiver' @ [87:145] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Function.createTowerProcessor[ValueParameterDescriptorImpl]

'ResolutionKind<VariableDescriptor>' @ [91:27] ==> private constructor ResolutionKind<D : CallableDescriptor>(kotlinCallKind: KotlinCallKind = ...) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> VariableDescriptor

'VARIABLE' @ [91:77] ==> enum entry VARIABLE defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallKind[FakeCallableDescriptorForObject]

'outer' @ [96:39] ==> value-parameter outer: NewResolutionOldInference defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'CandidateFactoryImpl' @ [96:45] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'name' @ [96:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'context' @ [96:72] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'tracing' @ [96:81] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'createVariableAndObjectProcessor' @ [97:24] ==> public fun <C : Candidate> createVariableAndObjectProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<NewResolutionOldInference.MyCandidate>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): PrioritizedCompositeScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [97:57] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'name' @ [97:69] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'variableFactory' @ [97:75] ==> val variableFactory: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[LocalVariableDescriptor]

'explicitReceiver' @ [97:92] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Variable.createTowerProcessor[ValueParameterDescriptorImpl]

'ResolutionKind<CallableDescriptor>' @ [101:36] ==> private constructor ResolutionKind<D : CallableDescriptor>(kotlinCallKind: KotlinCallKind = ...) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> CallableDescriptor

'outer' @ [106:39] ==> value-parameter outer: NewResolutionOldInference defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'CandidateFactoryImpl' @ [106:45] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'name' @ [106:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'context' @ [106:72] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'tracing' @ [106:81] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'outer' @ [107:39] ==> value-parameter outer: NewResolutionOldInference defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'CandidateFactoryImpl' @ [107:45] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'name' @ [107:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'context' @ [107:72] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'tracing' @ [107:81] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'PrioritizedCompositeScopeTowerProcessor' @ [108:24] ==> public constructor PrioritizedCompositeScopeTowerProcessor<out C>(vararg processors: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[DeserializedClassConstructorDescriptor]
Inferred types:
    <out C> -> MyCandidate

'createSimpleFunctionProcessor' @ [109:25] ==> public fun <C : Candidate> createSimpleFunctionProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<NewResolutionOldInference.MyCandidate>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [109:55] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'name' @ [109:67] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'functionFactory' @ [109:73] ==> val functionFactory: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[LocalVariableDescriptor]

'explicitReceiver' @ [109:90] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'createVariableProcessor' @ [110:25] ==> public fun <C : Candidate> createVariableProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<NewResolutionOldInference.MyCandidate>, explicitReceiver: DetailedReceiver?, classValueReceiver: Boolean = ...): ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [110:49] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'name' @ [110:61] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'variableFactory' @ [110:67] ==> val variableFactory: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[LocalVariableDescriptor]

'explicitReceiver' @ [110:84] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.CallableReference.createTowerProcessor[ValueParameterDescriptorImpl]

'ResolutionKind<FunctionDescriptor>' @ [115:25] ==> private constructor ResolutionKind<D : CallableDescriptor>(kotlinCallKind: KotlinCallKind = ...) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> FunctionDescriptor

'outer' @ [120:39] ==> value-parameter outer: NewResolutionOldInference defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'CandidateFactoryImpl' @ [120:45] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'name' @ [120:66] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'context' @ [120:72] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'tracing' @ [120:81] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'context' @ [122:29] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'call' @ [122:37] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'sure' @ [122:85] ==> public inline fun <T : Any> CallTransformer.CallForImplicitInvoke?.sure(message: () -> String): CallTransformer.CallForImplicitInvoke defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> CallForImplicitInvoke

'context' @ [123:73] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'call' @ [123:81] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'createProcessorWithReceiverValueOrEmpty' @ [125:24] ==> public fun <C : Candidate> createProcessorWithReceiverValueOrEmpty(explicitReceiver: DetailedReceiver?, create: (ReceiverValueWithSmartCastInfo?) -> ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>): ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'explicitReceiver' @ [125:64] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'createCallTowerProcessorForExplicitInvoke' @ [126:21] ==> public fun <C : Candidate> createCallTowerProcessorForExplicitInvoke(scopeTower: ImplicitScopeTower, functionContext: CandidateFactory<NewResolutionOldInference.MyCandidate>, expressionForInvoke: ReceiverValueWithSmartCastInfo, explicitReceiver: ReceiverValueWithSmartCastInfo?): ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [126:63] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'functionFactory' @ [126:75] ==> val functionFactory: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[LocalVariableDescriptor]

'context' @ [126:92] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[ValueParameterDescriptorImpl]

'transformToReceiverWithSmartCastInfo' @ [126:100] ==> public fun ResolutionContext<*>.transformToReceiverWithSmartCastInfo(receiver: ReceiverValue): ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'call' @ [126:137] ==> val call: CallTransformer.CallForImplicitInvoke defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor[LocalVariableDescriptor]

'dispatchReceiver' @ [126:142] ==> public final val CallTransformer.CallForImplicitInvoke.dispatchReceiver: ExpressionReceiver[MyPropertyDescriptor]

'it' @ [126:161] ==> value-parameter it: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind.Invoke.createTowerProcessor.<anonymous>[ValueParameterDescriptorImpl]

'ResolutionKind<D>' @ [132:57] ==> private constructor ResolutionKind<D : CallableDescriptor>(kotlinCallKind: KotlinCallKind = ...) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[ClassConstructorDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'IllegalStateException' @ [137:23] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'context' @ [148:32] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'call' @ [148:40] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'explicitReceiver' @ [148:45] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'if (explicitReceiver is QualifierReceiver?) {
            explicitReceiver
        }
        else {
            context.transformToReceiverWithSmartCastInfo(explicitReceiver as ReceiverValue)
        }' @ [149:32] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DetailedReceiver?, elseBranch: DetailedReceiver?): DetailedReceiver?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DetailedReceiver?

'explicitReceiver' @ [149:36] ==> val explicitReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'explicitReceiver' @ [150:13] ==> val explicitReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'context' @ [153:13] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'transformToReceiverWithSmartCastInfo' @ [153:21] ==> public fun ResolutionContext<*>.transformToReceiverWithSmartCastInfo(receiver: ReceiverValue): ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'explicitReceiver' @ [153:58] ==> val explicitReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'dynamicCallableDescriptors' @ [156:28] ==> private final val dynamicCallableDescriptors: DynamicCallableDescriptors defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'createDynamicDescriptorScope' @ [156:55] ==> public final fun createDynamicDescriptorScope(call: Call, owner: DeclarationDescriptor): MemberScopeImpl defined in org.jetbrains.kotlin.resolve.calls.tasks.DynamicCallableDescriptors[SimpleFunctionDescriptorImpl]

'context' @ [156:84] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'call' @ [156:92] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'context' @ [156:98] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'scope' @ [156:106] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [156:112] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'ImplicitScopeTowerImpl' @ [157:26] ==> public constructor ImplicitScopeTowerImpl(resolutionContext: ResolutionContext<*>, dynamicScope: MemberScope, syntheticScopes: SyntheticScopes, location: LookupLocation) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl[ClassConstructorDescriptorImpl]

'context' @ [157:49] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'dynamicScope' @ [157:58] ==> val dynamicScope: MemberScopeImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'syntheticScopes' @ [157:72] ==> private final val syntheticScopes: SyntheticScopes defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'context' @ [157:89] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'call' @ [157:97] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'createLookupLocation' @ [157:102] ==> public fun Call.createLookupLocation(): KotlinLookupLocation defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [159:36] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'supportsFeature' @ [159:60] ==> public open fun supportsFeature(feature: LanguageFeature): Boolean defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedSimpleFunctionDescriptor]

'LanguageFeature' @ [159:76] ==> public companion object defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'OperatorRem' @ [159:92] ==> enum entry OperatorRem defined in org.jetbrains.kotlin.config.LanguageFeature[FakeCallableDescriptorForObject]

'isBinaryRemOperator' @ [160:35] ==> public fun isBinaryRemOperator(call: Call): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'context' @ [160:55] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'call' @ [160:63] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'if (isBinaryRemOperator && !shouldUseOperatorRem)
            OperatorConventions.REM_TO_MOD_OPERATION_NAMES[name]!!
        else
            name' @ [161:29] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Name, elseBranch: Name): Name[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Name

'isBinaryRemOperator' @ [161:33] ==> val isBinaryRemOperator: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'!' @ [161:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'shouldUseOperatorRem' @ [161:57] ==> val shouldUseOperatorRem: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'OperatorConventions.REM_TO_MOD_OPERATION_NAMES[name]' @ [162:13] ==> public abstract fun get(@Nullable key: Name?): Name? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'REM_TO_MOD_OPERATION_NAMES' @ [162:33] ==> public final val REM_TO_MOD_OPERATION_NAMES: (ImmutableBiMap<(Name..Name?), (Name..Name?)>..ImmutableBiMap<(Name..Name?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'name' @ [162:60] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'name' @ [164:13] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'kind' @ [166:25] ==> value-parameter kind: NewResolutionOldInference.ResolutionKind<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'createTowerProcessor' @ [166:30] ==> internal abstract fun createTowerProcessor(outer: NewResolutionOldInference, name: Name, tracing: TracingStrategy, scopeTower: ImplicitScopeTower, explicitReceiver: DetailedReceiver?, context: BasicCallResolutionContext): ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[SimpleFunctionDescriptorImpl]

'this' @ [166:51] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[LazyClassReceiverParameterDescriptor]

'nameToResolve' @ [166:57] ==> val nameToResolve: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'tracing' @ [166:72] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'scopeTower' @ [166:81] ==> val scopeTower: NewResolutionOldInference.ImplicitScopeTowerImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'detailedReceiver' @ [166:93] ==> val detailedReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'context' @ [166:111] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'context' @ [168:13] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'collectAllCandidates' @ [168:21] ==> public final val collectAllCandidates: Boolean defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'allCandidatesResult' @ [169:20] ==> private final fun <D : CallableDescriptor> allCandidatesResult(allCandidates: Collection<NewResolutionOldInference.MyCandidate>): (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'towerResolver' @ [169:40] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'collectAllCandidates' @ [169:54] ==> public final fun <C : Candidate> collectAllCandidates(scopeTower: ImplicitScopeTower, processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>): Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [169:75] ==> val scopeTower: NewResolutionOldInference.ImplicitScopeTowerImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'processor' @ [169:87] ==> val processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'towerResolver' @ [172:26] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'runResolve' @ [172:40] ==> public final fun <C : Candidate> runResolve(scopeTower: ImplicitScopeTower, processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>, useOrder: Boolean): Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [172:51] ==> val scopeTower: NewResolutionOldInference.ImplicitScopeTowerImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'processor' @ [172:63] ==> val processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'kind' @ [172:85] ==> value-parameter kind: NewResolutionOldInference.ResolutionKind<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'CallableReference' @ [172:108] ==> public object CallableReference : NewResolutionOldInference.ResolutionKind<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[FakeCallableDescriptorForObject]

'candidates' @ [175:45] ==> var candidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'isEmpty' @ [175:56] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'candidates' @ [176:45] ==> var candidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'all' @ [176:56] ==> public inline fun <T> Iterable<NewResolutionOldInference.MyCandidate>.all(predicate: (NewResolutionOldInference.MyCandidate) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MyCandidate

'it' @ [176:62] ==> value-parameter it: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution.<anonymous>[ValueParameterDescriptorImpl]

'resultingApplicability' @ [176:65] ==> public open val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'isInapplicable' @ [176:88] ==> public val ResolutionCandidateApplicability.isInapplicable: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedPropertyDescriptor]

'isBinaryRemOperator' @ [177:13] ==> val isBinaryRemOperator: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'shouldUseOperatorRem' @ [177:36] ==> val shouldUseOperatorRem: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'emptyOrInapplicableCandidates' @ [177:60] ==> val emptyOrInapplicableCandidates: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'OperatorConventions.REM_TO_MOD_OPERATION_NAMES[name]' @ [178:34] ==> public abstract fun get(@Nullable key: Name?): Name? defined in com.google.common.collect.ImmutableBiMap[JavaMethodDescriptor]

'REM_TO_MOD_OPERATION_NAMES' @ [178:54] ==> public final val REM_TO_MOD_OPERATION_NAMES: (ImmutableBiMap<(Name..Name?), (Name..Name?)>..ImmutableBiMap<(Name..Name?), (Name..Name?)>?) defined in org.jetbrains.kotlin.types.expressions.OperatorConventions[JavaPropertyDescriptor]

'name' @ [178:81] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'kind' @ [179:46] ==> value-parameter kind: NewResolutionOldInference.ResolutionKind<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'createTowerProcessor' @ [179:51] ==> internal abstract fun createTowerProcessor(outer: NewResolutionOldInference, name: Name, tracing: TracingStrategy, scopeTower: ImplicitScopeTower, explicitReceiver: DetailedReceiver?, context: BasicCallResolutionContext): ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[SimpleFunctionDescriptorImpl]

'this' @ [179:72] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[LazyClassReceiverParameterDescriptor]

'deprecatedName' @ [179:78] ==> val deprecatedName: Name? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'tracing' @ [179:96] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'scopeTower' @ [179:105] ==> val scopeTower: NewResolutionOldInference.ImplicitScopeTowerImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'detailedReceiver' @ [179:117] ==> val detailedReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'context' @ [179:135] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'candidates' @ [180:13] ==> var candidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'towerResolver' @ [180:26] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'runResolve' @ [180:40] ==> public final fun <C : Candidate> runResolve(scopeTower: ImplicitScopeTower, processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>, useOrder: Boolean): Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'scopeTower' @ [180:51] ==> val scopeTower: NewResolutionOldInference.ImplicitScopeTowerImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'processorForDeprecatedName' @ [180:63] ==> val processorForDeprecatedName: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'kind' @ [180:102] ==> value-parameter kind: NewResolutionOldInference.ResolutionKind<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'CallableReference' @ [180:125] ==> public object CallableReference : NewResolutionOldInference.ResolutionKind<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[FakeCallableDescriptorForObject]

'candidates' @ [183:13] ==> var candidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'isEmpty' @ [183:24] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.Collection[DeserializedSimpleFunctionDescriptor]

'reportAdditionalDiagnosticIfNoCandidates' @ [184:17] ==> private final fun reportAdditionalDiagnosticIfNoCandidates(context: BasicCallResolutionContext, name: Name, kind: NewResolutionOldInference.ResolutionKind<*>, scopeTower: ImplicitScopeTower, detailedReceiver: DetailedReceiver?): Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[SimpleFunctionDescriptorImpl]

'context' @ [184:58] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'nameToResolve' @ [184:67] ==> val nameToResolve: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'kind' @ [184:82] ==> value-parameter kind: NewResolutionOldInference.ResolutionKind<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'scopeTower' @ [184:88] ==> val scopeTower: NewResolutionOldInference.ImplicitScopeTowerImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'detailedReceiver' @ [184:100] ==> val detailedReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'nameNotFound' @ [185:54] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> nameNotFound(): (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsImpl[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'convertToOverloadResults' @ [189:31] ==> private final fun <D : CallableDescriptor> convertToOverloadResults(candidates: Collection<NewResolutionOldInference.MyCandidate>, tracing: TracingStrategy, basicCallContext: BasicCallResolutionContext, languageVersionSettings: LanguageVersionSettings): OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidates' @ [189:59] ==> var candidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'tracing' @ [189:71] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'context' @ [189:80] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [189:89] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'coroutineInferenceSupport' @ [190:9] ==> private final val coroutineInferenceSupport: CoroutineInferenceSupport defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'checkCoroutineCalls' @ [190:35] ==> public final fun checkCoroutineCalls(context: BasicCallResolutionContext, tracingStrategy: TracingStrategy, overloadResults: OverloadResolutionResultsImpl<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.CoroutineInferenceSupport[SimpleFunctionDescriptorImpl]

'context' @ [190:55] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'tracing' @ [190:64] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[ValueParameterDescriptorImpl]

'overloadResults' @ [190:73] ==> val overloadResults: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'overloadResults' @ [191:16] ==> val overloadResults: OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolution[LocalVariableDescriptor]

'candidates' @ [199:34] ==> value-parameter candidates: Collection<ResolutionCandidate<D>> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'map' @ [199:45] ==> public inline fun <T, R> Iterable<ResolutionCandidate<D>>.map(transform: (ResolutionCandidate<D>) -> NewResolutionOldInference.MyCandidate): List<NewResolutionOldInference.MyCandidate> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionCandidate<D>
    <R> -> MyCandidate

'create' @ [200:56] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?)): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'basicCallContext' @ [200:63] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'trace' @ [200:80] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'create' @ [201:49] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> create(@NotNull candidate: ResolutionCandidate<(D..D?)>, @NotNull trace: DelegatingBindingTrace, @NotNull tracing: TracingStrategy, @NotNull dataFlowInfoForArguments: MutableDataFlowInfoForArguments): ResolvedCallImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'candidate' @ [201:56] ==> value-parameter candidate: ResolutionCandidate<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[ValueParameterDescriptorImpl]

'candidateTrace' @ [201:67] ==> val candidateTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'tracing' @ [201:83] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'basicCallContext' @ [201:92] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'dataFlowInfoForArguments' @ [201:109] ==> @NotNull public final val dataFlowInfoForArguments: MutableDataFlowInfoForArguments defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'candidate' @ [203:17] ==> value-parameter candidate: ResolutionCandidate<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[ValueParameterDescriptorImpl]

'descriptor' @ [203:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolutionCandidate<D>.descriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'isHiddenInResolution' @ [203:38] ==> @JvmOverloads public fun DeclarationDescriptor.isHiddenInResolution(languageVersionSettings: LanguageVersionSettings, isSuperCall: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve in file deprecationUtil.kt[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [203:59] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'basicCallContext' @ [203:84] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'isSuperCall' @ [203:101] ==> private val BasicCallResolutionContext.isSuperCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file NewResolutionOldInference.kt[PropertyDescriptorImpl]

'MyCandidate' @ [204:28] ==> public constructor MyCandidate(diagnostics: List<KotlinCallDiagnostic>, resolvedCall: MutableResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[ClassConstructorDescriptorImpl]

'listOf' @ [204:40] ==> public fun <T> listOf(element: HiddenDescriptor): List<HiddenDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HiddenDescriptor

'HiddenDescriptor' @ [204:47] ==> public object HiddenDescriptor : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower[FakeCallableDescriptorForObject]

'resolvedCall' @ [204:66] ==> val resolvedCall: ResolvedCallImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'create' @ [207:81] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> create(@NotNull candidateCall: MutableResolvedCall<(D..D?)>, @NotNull context: CallResolutionContext<*>, @NotNull trace: BindingTrace, @NotNull tracing: TracingStrategy, @NotNull call: Call, @NotNull candidateResolveMode: CandidateResolveMode): (CallCandidateResolutionContext<(D..D?)>..CallCandidateResolutionContext<(D..D?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'resolvedCall' @ [208:21] ==> val resolvedCall: ResolvedCallImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'basicCallContext' @ [208:35] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'candidateTrace' @ [208:53] ==> val candidateTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'tracing' @ [208:69] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'basicCallContext' @ [208:78] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'call' @ [208:95] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'FULLY' @ [209:42] ==> enum entry FULLY defined in org.jetbrains.kotlin.resolve.calls.context.CandidateResolveMode[FakeCallableDescriptorForObject]

'candidateResolver' @ [211:13] ==> private final val candidateResolver: CandidateResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'performResolutionForCandidateCall' @ [211:31] ==> public final fun <D : CallableDescriptor> performResolutionForCandidateCall(context: CallCandidateResolutionContext<(D..D?)>, checkArguments: CheckArgumentTypesMode): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (D..D?)

'callCandidateResolutionContext' @ [211:65] ==> val callCandidateResolutionContext: (CallCandidateResolutionContext<(D..D?)>..CallCandidateResolutionContext<(D..D?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'basicCallContext' @ [211:97] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'checkArguments' @ [211:114] ==> @NotNull public final val checkArguments: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'listOfNotNull' @ [213:31] ==> public fun <T : Any> listOfNotNull(element: PreviousResolutionError?): List<PreviousResolutionError> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> PreviousResolutionError

'createPreviousResolveError' @ [213:45] ==> @Deprecated internal fun createPreviousResolveError(status: ResolutionStatus): PreviousResolutionError? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewResolutionOldInference.kt[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [213:72] ==> val resolvedCall: ResolvedCallImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'status' @ [213:85] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCallImpl<(D..D?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'MyCandidate' @ [214:13] ==> public constructor MyCandidate(diagnostics: List<KotlinCallDiagnostic>, resolvedCall: MutableResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[ClassConstructorDescriptorImpl]

'diagnostics' @ [214:25] ==> val diagnostics: List<PreviousResolutionError> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [214:38] ==> val resolvedCall: ResolvedCallImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates.<anonymous>[LocalVariableDescriptor]

'basicCallContext' @ [216:13] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'collectAllCandidates' @ [216:30] ==> public final val collectAllCandidates: Boolean defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'towerResolver' @ [217:33] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'runWithEmptyTowerData' @ [217:47] ==> public final fun <C : Candidate> runWithEmptyTowerData(processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>, resultCollector: TowerResolver.ResultCollector<NewResolutionOldInference.MyCandidate>, useOrder: Boolean): Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'KnownResultProcessor' @ [217:69] ==> public constructor KnownResultProcessor<out C>(result: Collection<NewResolutionOldInference.MyCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[DeserializedClassConstructorDescriptor]
Inferred types:
    <out C> -> MyCandidate

'resolvedCandidates' @ [217:90] ==> val resolvedCandidates: List<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[LocalVariableDescriptor]

'AllCandidatesCollector' @ [218:65] ==> public constructor AllCandidatesCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.AllCandidatesCollector[DeserializedClassConstructorDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'allCandidatesResult' @ [219:20] ==> private final fun <D : CallableDescriptor> allCandidatesResult(allCandidates: Collection<NewResolutionOldInference.MyCandidate>): (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'allCandidates' @ [219:40] ==> val allCandidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[LocalVariableDescriptor]

'towerResolver' @ [222:35] ==> private final val towerResolver: TowerResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'runWithEmptyTowerData' @ [222:49] ==> public final fun <C : Candidate> runWithEmptyTowerData(processor: ScopeTowerProcessor<NewResolutionOldInference.MyCandidate>, resultCollector: TowerResolver.ResultCollector<NewResolutionOldInference.MyCandidate>, useOrder: Boolean): Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'KnownResultProcessor' @ [222:71] ==> public constructor KnownResultProcessor<out C>(result: Collection<NewResolutionOldInference.MyCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.KnownResultProcessor[DeserializedClassConstructorDescriptor]
Inferred types:
    <out C> -> MyCandidate

'resolvedCandidates' @ [222:92] ==> val resolvedCandidates: List<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[LocalVariableDescriptor]

'SuccessfulResultCollector' @ [223:67] ==> public constructor SuccessfulResultCollector<C : Candidate>() defined in org.jetbrains.kotlin.resolve.calls.tower.TowerResolver.SuccessfulResultCollector[DeserializedClassConstructorDescriptor]
Inferred types:
    <C : Candidate> -> MyCandidate

'convertToOverloadResults' @ [225:16] ==> private final fun <D : CallableDescriptor> convertToOverloadResults(candidates: Collection<NewResolutionOldInference.MyCandidate>, tracing: TracingStrategy, basicCallContext: BasicCallResolutionContext, languageVersionSettings: LanguageVersionSettings): OverloadResolutionResultsImpl<D> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'processedCandidates' @ [225:41] ==> val processedCandidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[LocalVariableDescriptor]

'tracing' @ [225:62] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'basicCallContext' @ [225:71] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.runResolutionForGivenCandidates[ValueParameterDescriptorImpl]

'languageVersionSettings' @ [225:89] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'nameNotFound' @ [229:45] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> nameNotFound(): (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?) defined in org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsImpl[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'apply' @ [229:63] ==> @InlineOnly public inline fun <T> (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?).apply(block: (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?).() -> Unit): (OverloadResolutionResultsImpl<(D..D?)>..OverloadResolutionResultsImpl<(D..D?)>?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsImpl<(D..D?)>..org.jetbrains.kotlin.resolve.calls.results.OverloadResolutionResultsImpl<(D..D?)>?)

'this' @ [230:9] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.allCandidatesResult.<anonymous>[ReceiverParameterDescriptorImpl]

'allCandidates' @ [230:14] ==> public final var <D : (CallableDescriptor..CallableDescriptor?)> OverloadResolutionResultsImpl<(D..D?)>.allCandidates: (MutableCollection<(ResolvedCall<(D..D?)>..ResolvedCall<(D..D?)>?)>?..Collection<(ResolvedCall<(D..D?)>..ResolvedCall<(D..D?)>?)>?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'allCandidates' @ [230:30] ==> value-parameter allCandidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.allCandidatesResult[ValueParameterDescriptorImpl]

'map' @ [230:44] ==> public inline fun <T, R> Iterable<NewResolutionOldInference.MyCandidate>.map(transform: (NewResolutionOldInference.MyCandidate) -> MutableResolvedCall<D>): List<MutableResolvedCall<D>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MyCandidate
    <R> -> MutableResolvedCall<D>

'it' @ [230:50] ==> value-parameter it: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.allCandidatesResult.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'resolvedCall' @ [230:53] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'candidates' @ [239:29] ==> value-parameter candidates: Collection<NewResolutionOldInference.MyCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'map' @ [239:40] ==> public inline fun <T, R> Iterable<NewResolutionOldInference.MyCandidate>.map(transform: (NewResolutionOldInference.MyCandidate) -> MutableResolvedCall<D>): List<MutableResolvedCall<D>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> MyCandidate
    <R> -> MutableResolvedCall<D>

'component1' @ [240:18] ==> public final operator fun component1(): List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[SimpleFunctionDescriptorImpl]

'component2' @ [240:31] ==> public final operator fun component2(): MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[SimpleFunctionDescriptorImpl]

'it' @ [240:47] ==> value-parameter it: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[ValueParameterDescriptorImpl]

'if (resolvedCall is VariableAsFunctionResolvedCallImpl) {
                // todo hacks
                tracing.bindReference(resolvedCall.variableCall.trace, resolvedCall.variableCall)
                tracing.bindResolvedCall(resolvedCall.variableCall.trace, resolvedCall as ResolvedCall<*>)

                resolvedCall.variableCall.trace.addOwnDataTo(resolvedCall.functionCall.trace)

                resolvedCall.functionCall.tracingStrategy.bindReference(resolvedCall.functionCall.trace, resolvedCall.functionCall)
                //                resolvedCall.hackInvokeTracing.bindResolvedCall(resolvedCall.functionCall.trace, resolvedCall)
            } else {
                tracing.bindReference(resolvedCall.trace, resolvedCall as ResolvedCall<*>)
                tracing.bindResolvedCall(resolvedCall.trace, resolvedCall as ResolvedCall<*>)
            }' @ [241:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'resolvedCall' @ [241:17] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'tracing' @ [243:17] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'bindReference' @ [243:25] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(VariableDescriptor..VariableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'resolvedCall' @ [243:39] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'variableCall' @ [243:52] ==> public open val variableCall: MutableResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'trace' @ [243:65] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<VariableDescriptor>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'resolvedCall' @ [243:72] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'variableCall' @ [243:85] ==> public open val variableCall: MutableResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'tracing' @ [244:17] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'bindResolvedCall' @ [244:25] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindResolvedCall(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [244:42] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'variableCall' @ [244:55] ==> public open val variableCall: MutableResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'trace' @ [244:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<VariableDescriptor>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'resolvedCall' @ [244:75] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [246:17] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'variableCall' @ [246:30] ==> public open val variableCall: MutableResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'trace' @ [246:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<VariableDescriptor>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'addOwnDataTo' @ [246:49] ==> @JvmOverloads public final fun addOwnDataTo(trace: BindingTrace, filter: TraceEntryFilter? = ..., commitDiagnostics: Boolean = ...): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]

'resolvedCall' @ [246:62] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'functionCall' @ [246:75] ==> public open val functionCall: MutableResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'trace' @ [246:88] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<FunctionDescriptor>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'resolvedCall' @ [248:17] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'functionCall' @ [248:30] ==> public open val functionCall: MutableResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'tracingStrategy' @ [248:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<FunctionDescriptor>.tracingStrategy: TracingStrategy[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'bindReference' @ [248:59] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<(FunctionDescriptor..FunctionDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'resolvedCall' @ [248:73] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'functionCall' @ [248:86] ==> public open val functionCall: MutableResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'trace' @ [248:99] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<FunctionDescriptor>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> FunctionDescriptor

'resolvedCall' @ [248:106] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'functionCall' @ [248:119] ==> public open val functionCall: MutableResolvedCall<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[PropertyDescriptorImpl]

'tracing' @ [251:17] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'bindReference' @ [251:25] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [251:39] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'trace' @ [251:52] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [251:59] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'tracing' @ [252:17] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'bindResolvedCall' @ [252:25] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindResolvedCall(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [252:42] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'trace' @ [252:55] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [252:62] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [255:17] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'status' @ [255:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'possibleTransformToSuccess' @ [255:37] ==> public open fun possibleTransformToSuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'diagnostics' @ [256:31] ==> val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'when (error) {
                        is UnsupportedInnerClassCall -> resolvedCall.trace.report(Errors.UNSUPPORTED.on(resolvedCall.call.callElement, error.message))
                        is NestedClassViaInstanceReference -> tracing.nestedClassAccessViaInstanceReference(resolvedCall.trace, error.classDescriptor, resolvedCall.explicitReceiverKind)
                        is ErrorDescriptorDiagnostic -> {
                            // todo
                            //  return@map null
                        }
                    }' @ [257:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'error' @ [257:27] ==> val error: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'resolvedCall' @ [258:57] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'trace' @ [258:70] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'report' @ [258:76] ==> public open fun report(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.DelegatingBindingTrace[SimpleFunctionDescriptorImpl]

'UNSUPPORTED' @ [258:90] ==> public final val UNSUPPORTED: (DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>..DiagnosticFactory1<(PsiElement..PsiElement?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [258:102] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull argument: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'resolvedCall' @ [258:105] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'call' @ [258:118] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callElement' @ [258:123] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'error' @ [258:136] ==> val error: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'message' @ [258:142] ==> public final val message: String defined in org.jetbrains.kotlin.resolve.calls.tower.UnsupportedInnerClassCall[DeserializedPropertyDescriptor]

'tracing' @ [259:63] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'nestedClassAccessViaInstanceReference' @ [259:71] ==> public abstract fun nestedClassAccessViaInstanceReference(@NotNull trace: BindingTrace, @NotNull classDescriptor: ClassDescriptor, @NotNull explicitReceiverKind: ExplicitReceiverKind): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'resolvedCall' @ [259:109] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'trace' @ [259:122] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'error' @ [259:129] ==> val error: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'classDescriptor' @ [259:135] ==> public final val classDescriptor: ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NestedClassViaInstanceReference[DeserializedPropertyDescriptor]

'resolvedCall' @ [259:152] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'explicitReceiverKind' @ [259:165] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [268:13] ==> val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults.<anonymous>[LocalVariableDescriptor]

'resolutionResultsHandler' @ [271:16] ==> private final val resolutionResultsHandler: ResolutionResultsHandler defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'computeResultAndReportErrors' @ [271:41] ==> @NotNull public open fun <D : (CallableDescriptor..CallableDescriptor?)> computeResultAndReportErrors(@NotNull context: raw (CallResolutionContext<(CallResolutionContext<*>..CallResolutionContext<*>?)>..CallResolutionContext<out (CallResolutionContext<*>..CallResolutionContext<*>?)>), @NotNull tracing: TracingStrategy, @NotNull candidates: (MutableCollection<(MutableResolvedCall<(D..D?)>..MutableResolvedCall<(D..D?)>?)>..Collection<(MutableResolvedCall<(D..D?)>..MutableResolvedCall<(D..D?)>?)>), @NotNull languageVersionSettings: LanguageVersionSettings): OverloadResolutionResultsImpl<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionResultsHandler[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'basicCallContext' @ [271:70] ==> value-parameter basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'tracing' @ [271:88] ==> value-parameter tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'resolvedCalls' @ [271:97] ==> val resolvedCalls: List<MutableResolvedCall<D>> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[LocalVariableDescriptor]

'languageVersionSettings' @ [271:112] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.convertToOverloadResults[ValueParameterDescriptorImpl]

'context' @ [282:25] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'call' @ [282:33] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'calleeExpression' @ [282:38] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'when (kind) {
            ResolutionKind.Function -> collectErrorCandidatesForFunction(scopeTower, name, detailedReceiver)
            ResolutionKind.Variable -> collectErrorCandidatesForVariable(scopeTower, name, detailedReceiver)
            else -> emptyList()
        }' @ [284:31] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<ErrorCandidate<*>>, entry1: Collection<ErrorCandidate<*>>, entry2: Collection<ErrorCandidate<*>>): Collection<ErrorCandidate<*>>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<ErrorCandidate<*>>

'kind' @ [284:37] ==> value-parameter kind: NewResolutionOldInference.ResolutionKind<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'Function' @ [285:28] ==> public object Function : NewResolutionOldInference.ResolutionKind<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[FakeCallableDescriptorForObject]

'collectErrorCandidatesForFunction' @ [285:40] ==> public fun collectErrorCandidatesForFunction(scopeTower: ImplicitScopeTower, name: Name, explicitReceiver: DetailedReceiver?): Collection<ErrorCandidate<*>> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]

'scopeTower' @ [285:74] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'name' @ [285:86] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'detailedReceiver' @ [285:92] ==> value-parameter detailedReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'Variable' @ [286:28] ==> public object Variable : NewResolutionOldInference.ResolutionKind<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ResolutionKind[FakeCallableDescriptorForObject]

'collectErrorCandidatesForVariable' @ [286:40] ==> public fun collectErrorCandidatesForVariable(scopeTower: ImplicitScopeTower, name: Name, explicitReceiver: DetailedReceiver?): Collection<ErrorCandidate<*>> defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]

'scopeTower' @ [286:74] ==> value-parameter scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'name' @ [286:86] ==> value-parameter name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'detailedReceiver' @ [286:92] ==> value-parameter detailedReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'emptyList' @ [287:21] ==> public fun <T> emptyList(): List<ErrorCandidate<*>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorCandidate<*>

'errorCandidates' @ [290:25] ==> val errorCandidates: Collection<ErrorCandidate<*>> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'firstOrNull' @ [290:41] ==> public fun <T> Iterable<ErrorCandidate<*>>.firstOrNull(): ErrorCandidate<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ErrorCandidate<*>

'context' @ [292:9] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'trace' @ [292:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'record' @ [292:23] ==> public abstract fun <K : (Any..Any?), V : (Any..Any?)> record(slice: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?), value: (DeclarationDescriptor..DeclarationDescriptor?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [292:45] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'reference' @ [292:63] ==> val reference: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'candidate' @ [292:74] ==> val candidate: ErrorCandidate.Classifier defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'descriptor' @ [292:84] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[DeserializedPropertyDescriptor]

'context' @ [293:9] ==> value-parameter context: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[ValueParameterDescriptorImpl]

'trace' @ [293:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'report' @ [293:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'RESOLUTION_TO_CLASSIFIER' @ [293:37] ==> public final val RESOLUTION_TO_CLASSIFIER: (DiagnosticFactory3<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptor..ClassifierDescriptor?), (WrongResolutionToClassifier..WrongResolutionToClassifier?), (String..String?)>..DiagnosticFactory3<(KtReferenceExpression..KtReferenceExpression?), (ClassifierDescriptor..ClassifierDescriptor?), (WrongResolutionToClassifier..WrongResolutionToClassifier?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [293:62] ==> @NotNull public open fun on(@NotNull element: KtReferenceExpression, @NotNull a: ClassifierDescriptor, @NotNull b: WrongResolutionToClassifier, @NotNull c: String): ParametrizedDiagnostic<(KtReferenceExpression..KtReferenceExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'reference' @ [293:65] ==> val reference: KtReferenceExpression defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'candidate' @ [293:76] ==> val candidate: ErrorCandidate.Classifier defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'descriptor' @ [293:86] ==> public final val descriptor: ClassifierDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[DeserializedPropertyDescriptor]

'candidate' @ [293:98] ==> val candidate: ErrorCandidate.Classifier defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'kind' @ [293:108] ==> public final val kind: WrongResolutionToClassifier defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[DeserializedPropertyDescriptor]

'candidate' @ [293:114] ==> val candidate: ErrorCandidate.Classifier defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.reportAdditionalDiagnosticIfNoCandidates[LocalVariableDescriptor]

'errorMessage' @ [293:124] ==> public final val errorMessage: String defined in org.jetbrains.kotlin.resolve.calls.tower.ErrorCandidate.Classifier[DeserializedPropertyDescriptor]

'HashMap' @ [304:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> ReceiverValue
    <V : (Any..Any?)> -> ReceiverValueWithSmartCastInfo

'scope' @ [307:17] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl.getImplicitReceiver[ValueParameterDescriptorImpl]

'implicitReceiver' @ [307:23] ==> public abstract val implicitReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'value' @ [307:41] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'let' @ [307:48] ==> @InlineOnly public inline fun <T, R> ReceiverValue.let(block: (ReceiverValue) -> ReceiverValueWithSmartCastInfo): ReceiverValueWithSmartCastInfo defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> ReceiverValueWithSmartCastInfo

'cache' @ [308:21] ==> private final val cache: HashMap<ReceiverValue, ReceiverValueWithSmartCastInfo> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl[PropertyDescriptorImpl]

'getOrPut' @ [308:27] ==> public inline fun <K, V> MutableMap<ReceiverValue, ReceiverValueWithSmartCastInfo>.getOrPut(key: ReceiverValue, defaultValue: () -> ReceiverValueWithSmartCastInfo): ReceiverValueWithSmartCastInfo defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ReceiverValue
    <V> -> ReceiverValueWithSmartCastInfo

'it' @ [308:36] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl.getImplicitReceiver.<anonymous>[ValueParameterDescriptorImpl]

'resolutionContext' @ [308:42] ==> public final val resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl[PropertyDescriptorImpl]

'transformToReceiverWithSmartCastInfo' @ [308:60] ==> public fun ResolutionContext<*>.transformToReceiverWithSmartCastInfo(receiver: ReceiverValue): ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'it' @ [308:97] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl.getImplicitReceiver.<anonymous>[ValueParameterDescriptorImpl]

'resolutionContext' @ [311:57] ==> public final val resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl[PropertyDescriptorImpl]

'scope' @ [311:75] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'resolutionContext' @ [313:57] ==> public final val resolutionContext: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.ImplicitScopeTowerImpl[PropertyDescriptorImpl]

'isDebuggerContext' @ [313:75] ==> public final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'getResultApplicability' @ [320:81] ==> public fun getResultApplicability(diagnostics: Collection<KotlinCallDiagnostic>): ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedSimpleFunctionDescriptor]

'diagnostics' @ [320:104] ==> public final val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'resultingApplicability' @ [321:43] ==> public open val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'isSuccess' @ [321:66] ==> public val ResolutionCandidateApplicability.isSuccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedPropertyDescriptor]

'create' @ [335:56] ==> @NotNull public open fun create(@NotNull trace: BindingTrace, debugName: (String..String?)): TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.TemporaryBindingTrace[JavaMethodDescriptor]

'basicCallContext' @ [335:63] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'trace' @ [335:80] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'ResolvedCallImpl' @ [336:33] ==> public constructor ResolvedCallImpl<D : (CallableDescriptor..CallableDescriptor?)>(@NotNull call: Call, @NotNull candidateDescriptor: CallableDescriptor, @Nullable dispatchReceiver: ReceiverValue?, @Nullable extensionReceiver: ReceiverValue?, @NotNull explicitReceiverKind: ExplicitReceiverKind, @Nullable knownTypeParametersSubstitutor: TypeSubstitutor?, @NotNull trace: DelegatingBindingTrace, @NotNull tracing: TracingStrategy, @NotNull dataFlowInfoForArguments: MutableDataFlowInfoForArguments) defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallImpl[JavaClassConstructorDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'basicCallContext' @ [337:21] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'call' @ [337:38] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'towerCandidate' @ [337:44] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'descriptor' @ [337:59] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'towerCandidate' @ [338:21] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [338:36] ==> public abstract val dispatchReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'receiverValue' @ [338:54] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'extensionReceiver' @ [338:69] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'receiverValue' @ [338:88] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'explicitReceiverKind' @ [339:21] ==> value-parameter explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'candidateTrace' @ [339:49] ==> val candidateTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'tracing' @ [339:65] ==> public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'basicCallContext' @ [340:21] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'dataFlowInfoForArguments' @ [340:38] ==> @NotNull public final val dataFlowInfoForArguments: MutableDataFlowInfoForArguments defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'extensionReceiver' @ [349:17] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'towerCandidate' @ [350:42] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'descriptor' @ [350:57] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'extensionReceiverParameter' @ [350:68] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'value' @ [350:97] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [350:103] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'isDynamic' @ [350:108] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'extensionReceiver' @ [351:41] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'receiverValue' @ [351:59] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedPropertyDescriptor]

'type' @ [351:73] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'isDynamic' @ [351:78] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'parameterIsDynamic' @ [353:21] ==> val parameterIsDynamic: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'argumentIsDynamic' @ [353:43] ==> val argumentIsDynamic: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'parameterIsDynamic' @ [354:22] ==> val parameterIsDynamic: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'!' @ [354:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'towerCandidate' @ [354:45] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'descriptor' @ [354:60] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'hasDynamicExtensionAnnotation' @ [354:71] ==> public fun CallableDescriptor.hasDynamicExtensionAnnotation(): Boolean defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'MyCandidate' @ [356:28] ==> public constructor MyCandidate(diagnostics: List<KotlinCallDiagnostic>, resolvedCall: MutableResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[ClassConstructorDescriptorImpl]

'listOf' @ [356:40] ==> public fun <T> listOf(element: HiddenExtensionRelatedToDynamicTypes): List<HiddenExtensionRelatedToDynamicTypes> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HiddenExtensionRelatedToDynamicTypes

'HiddenExtensionRelatedToDynamicTypes' @ [356:47] ==> public object HiddenExtensionRelatedToDynamicTypes : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower[FakeCallableDescriptorForObject]

'candidateCall' @ [356:86] ==> val candidateCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'towerCandidate' @ [360:17] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'descriptor' @ [360:32] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'isHiddenInResolution' @ [360:43] ==> @JvmOverloads public fun DeclarationDescriptor.isHiddenInResolution(languageVersionSettings: LanguageVersionSettings, isSuperCall: Boolean = ...): Boolean defined in org.jetbrains.kotlin.resolve in file deprecationUtil.kt[SimpleFunctionDescriptorImpl]

'languageVersionSettings' @ [360:64] ==> private final val languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'basicCallContext' @ [360:89] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'isSuperCall' @ [360:106] ==> private val BasicCallResolutionContext.isSuperCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file NewResolutionOldInference.kt[PropertyDescriptorImpl]

'MyCandidate' @ [361:24] ==> public constructor MyCandidate(diagnostics: List<KotlinCallDiagnostic>, resolvedCall: MutableResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[ClassConstructorDescriptorImpl]

'listOf' @ [361:36] ==> public fun <T> listOf(element: HiddenDescriptor): List<HiddenDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> HiddenDescriptor

'HiddenDescriptor' @ [361:43] ==> public object HiddenDescriptor : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower[FakeCallableDescriptorForObject]

'candidateCall' @ [361:62] ==> val candidateCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'create' @ [364:81] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> create(@NotNull candidateCall: MutableResolvedCall<(CallableDescriptor..CallableDescriptor?)>, @NotNull context: CallResolutionContext<*>, @NotNull trace: BindingTrace, @NotNull tracing: TracingStrategy, @NotNull call: Call, @NotNull candidateResolveMode: CandidateResolveMode): (CallCandidateResolutionContext<(CallableDescriptor..CallableDescriptor?)>..CallCandidateResolutionContext<(CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'candidateCall' @ [365:21] ==> val candidateCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'basicCallContext' @ [365:36] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'candidateTrace' @ [365:54] ==> val candidateTrace: TemporaryBindingTrace defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'tracing' @ [365:70] ==> public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'basicCallContext' @ [365:79] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'call' @ [365:96] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'FULLY' @ [366:42] ==> enum entry FULLY defined in org.jetbrains.kotlin.resolve.calls.context.CandidateResolveMode[FakeCallableDescriptorForObject]

'candidateResolver' @ [368:13] ==> private final val candidateResolver: CandidateResolver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference[PropertyDescriptorImpl]

'performResolutionForCandidateCall' @ [368:31] ==> public final fun <D : CallableDescriptor> performResolutionForCandidateCall(context: CallCandidateResolutionContext<(CallableDescriptor..CallableDescriptor?)>, checkArguments: CheckArgumentTypesMode): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callCandidateResolutionContext' @ [368:65] ==> val callCandidateResolutionContext: (CallCandidateResolutionContext<(CallableDescriptor..CallableDescriptor?)>..CallCandidateResolutionContext<(CallableDescriptor..CallableDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'basicCallContext' @ [368:97] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'checkArguments' @ [368:114] ==> @NotNull public final val checkArguments: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'towerCandidate' @ [370:32] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'diagnostics' @ [370:47] ==> public abstract val diagnostics: List<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'checkInfixAndOperator' @ [371:32] ==> private final fun checkInfixAndOperator(call: Call, descriptor: CallableDescriptor): List<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[SimpleFunctionDescriptorImpl]

'basicCallContext' @ [371:54] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'call' @ [371:71] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'towerCandidate' @ [371:77] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[ValueParameterDescriptorImpl]

'descriptor' @ [371:92] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[DeserializedPropertyDescriptor]

'createPreviousResolveError' @ [372:32] ==> @Deprecated internal fun createPreviousResolveError(status: ResolutionStatus): PreviousResolutionError? defined in org.jetbrains.kotlin.resolve.calls.tower in file NewResolutionOldInference.kt[SimpleFunctionDescriptorImpl]

'candidateCall' @ [372:59] ==> val candidateCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'status' @ [372:73] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCallImpl<CallableDescriptor>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'filterNotNull' @ [372:82] ==> public fun <T : Any> Iterable<ResolutionDiagnostic?>.filterNotNull(): List<ResolutionDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolutionDiagnostic

'MyCandidate' @ [373:20] ==> public constructor MyCandidate(diagnostics: List<KotlinCallDiagnostic>, resolvedCall: MutableResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[ClassConstructorDescriptorImpl]

'diagnostics' @ [373:32] ==> val diagnostics: List<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'candidateCall' @ [373:45] ==> val candidateCall: ResolvedCallImpl<CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.createCandidate[LocalVariableDescriptor]

'descriptor' @ [377:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'isError' @ [377:65] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [377:73] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'emptyList' @ [377:93] ==> public fun <T> emptyList(): List<ResolutionDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ResolutionDiagnostic

'descriptor' @ [378:17] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'name' @ [378:28] ==> public final val FunctionDescriptor.name: Name[MyPropertyDescriptor]

'name' @ [378:36] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'name' @ [378:45] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'OperatorNameConventions' @ [378:53] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'UNARY_PLUS' @ [378:77] ==> @field:JvmField public final val UNARY_PLUS: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'name' @ [378:91] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'OperatorNameConventions' @ [378:99] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'UNARY_MINUS' @ [378:123] ==> @field:JvmField public final val UNARY_MINUS: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'listOf' @ [379:24] ==> public fun <T> listOf(element: DeprecatedUnaryPlusAsPlus): List<DeprecatedUnaryPlusAsPlus> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeprecatedUnaryPlusAsPlus

'DeprecatedUnaryPlusAsPlus' @ [379:31] ==> public object DeprecatedUnaryPlusAsPlus : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower[FakeCallableDescriptorForObject]

'if (isConventionCall(call) && !descriptor.isOperator) InvokeConventionCallNoOperatorModifier else null' @ [382:35] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InvokeConventionCallNoOperatorModifier?, elseBranch: InvokeConventionCallNoOperatorModifier?): InvokeConventionCallNoOperatorModifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InvokeConventionCallNoOperatorModifier?

'isConventionCall' @ [382:39] ==> public fun isConventionCall(call: Call): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'call' @ [382:56] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'!' @ [382:65] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [382:66] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'isOperator' @ [382:77] ==> public final val FunctionDescriptor.isOperator: Boolean[MyPropertyDescriptor]

'InvokeConventionCallNoOperatorModifier' @ [382:89] ==> public object InvokeConventionCallNoOperatorModifier : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower[FakeCallableDescriptorForObject]

'if (isInfixCall(call) && !descriptor.isInfix) InfixCallNoInfixModifier else null' @ [383:30] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: InfixCallNoInfixModifier?, elseBranch: InfixCallNoInfixModifier?): InfixCallNoInfixModifier?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> InfixCallNoInfixModifier?

'isInfixCall' @ [383:34] ==> public fun isInfixCall(call: Call): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'call' @ [383:46] ==> value-parameter call: Call defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'!' @ [383:55] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [383:56] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[ValueParameterDescriptorImpl]

'isInfix' @ [383:67] ==> public final val FunctionDescriptor.isInfix: Boolean[MyPropertyDescriptor]

'InfixCallNoInfixModifier' @ [383:76] ==> public object InfixCallNoInfixModifier : ResolutionDiagnostic defined in org.jetbrains.kotlin.resolve.calls.tower[FakeCallableDescriptorForObject]

'listOfNotNull' @ [384:20] ==> public fun <T : Any> listOfNotNull(vararg elements: ResolutionDiagnostic?): List<ResolutionDiagnostic> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ResolutionDiagnostic

'conventionError' @ [384:34] ==> val conventionError: InvokeConventionCallNoOperatorModifier? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[LocalVariableDescriptor]

'infixError' @ [384:51] ==> val infixError: InfixCallNoInfixModifier? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl.checkInfixAndOperator[LocalVariableDescriptor]

'VariableAsFunctionResolvedCallImpl' @ [397:36] ==> public constructor VariableAsFunctionResolvedCallImpl(functionCall: MutableResolvedCall<FunctionDescriptor>, variableCall: MutableResolvedCall<VariableDescriptor>) defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCallImpl[ClassConstructorDescriptorImpl]

'invoke' @ [398:21] ==> value-parameter invoke: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[ValueParameterDescriptorImpl]

'resolvedCall' @ [398:28] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'variable' @ [399:21] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[ValueParameterDescriptorImpl]

'resolvedCall' @ [399:30] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'assert' @ [401:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'variable' @ [401:20] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[ValueParameterDescriptorImpl]

'resultingApplicability' @ [401:29] ==> public open val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'isSuccess' @ [401:52] ==> public val ResolutionCandidateApplicability.isSuccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower[DeserializedPropertyDescriptor]

'variable' @ [402:50] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[ValueParameterDescriptorImpl]

'MyCandidate' @ [405:20] ==> public constructor MyCandidate(diagnostics: List<KotlinCallDiagnostic>, resolvedCall: MutableResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[ClassConstructorDescriptorImpl]

'variable' @ [405:32] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[ValueParameterDescriptorImpl]

'diagnostics' @ [405:41] ==> public final val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'invoke' @ [405:55] ==> value-parameter invoke: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[ValueParameterDescriptorImpl]

'diagnostics' @ [405:62] ==> public final val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'resolvedCallImpl' @ [405:75] ==> val resolvedCallImpl: VariableAsFunctionResolvedCallImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.transformCandidate[LocalVariableDescriptor]

'stripCallArguments' @ [409:43] ==> public open fun stripCallArguments(@NotNull call: Call): (Call..Call?) defined in org.jetbrains.kotlin.resolve.calls.CallTransformer[JavaMethodDescriptor]

'functionContext' @ [409:62] ==> public final val functionContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[PropertyDescriptorImpl]

'basicCallContext' @ [409:78] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'call' @ [409:95] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'let' @ [409:101] ==> @InlineOnly public inline fun <T, R> (Call..Call?).let(block: ((Call..Call?)) -> (Call..Call?)): (Call..Call?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)
    <R> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)

'if (stripExplicitReceiver) CallTransformer.stripReceiver(it) else it' @ [410:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: (Call..Call?), elseBranch: (Call..Call?)): (Call..Call?)[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> (org.jetbrains.kotlin.psi.Call..org.jetbrains.kotlin.psi.Call?)

'stripExplicitReceiver' @ [410:21] ==> value-parameter stripExplicitReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForVariable[ValueParameterDescriptorImpl]

'stripReceiver' @ [410:60] ==> public open fun stripReceiver(@NotNull variableCall: Call): (Call..Call?) defined in org.jetbrains.kotlin.resolve.calls.CallTransformer[JavaMethodDescriptor]

'it' @ [410:74] ==> value-parameter it: (Call..Call?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForVariable.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [410:83] ==> value-parameter it: (Call..Call?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForVariable.<anonymous>[ValueParameterDescriptorImpl]

'CandidateFactoryImpl' @ [412:20] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'functionContext' @ [412:41] ==> public final val functionContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[PropertyDescriptorImpl]

'name' @ [412:57] ==> public final val name: Name defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'functionContext' @ [412:63] ==> public final val functionContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[PropertyDescriptorImpl]

'basicCallContext' @ [412:79] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'replaceCall' @ [412:96] ==> @NotNull public open fun replaceCall(@NotNull newCall: Call): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'newCall' @ [412:108] ==> val newCall: (Call..Call?) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForVariable[LocalVariableDescriptor]

'functionContext' @ [412:118] ==> public final val functionContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[PropertyDescriptorImpl]

'tracing' @ [412:134] ==> public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'assert' @ [419:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'variable' @ [419:20] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [419:29] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'status' @ [419:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'possibleTransformToSuccess' @ [419:49] ==> public open fun possibleTransformToSuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'+' @ [420:17] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'variable' @ [420:38] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [420:47] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'status' @ [420:60] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'variable' @ [420:89] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [420:98] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'variable' @ [421:36] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [421:45] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'candidateDescriptor' @ [421:58] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'variable' @ [423:36] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [423:45] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'call' @ [423:58] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'calleeExpression' @ [423:63] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'variable' @ [424:38] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [424:47] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'resultingDescriptor' @ [424:60] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'assert' @ [425:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'variable' @ [425:20] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [425:29] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'status' @ [425:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'possibleTransformToSuccess' @ [425:49] ==> public open fun possibleTransformToSuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'calleeExpression' @ [425:81] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'variable' @ [426:50] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'variableDescriptor' @ [428:32] ==> val variableDescriptor: VariableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'type' @ [428:51] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'variableType' @ [430:17] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'variableType' @ [430:49] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'isComputing' @ [430:62] ==> public final val DeferredType.isComputing: Boolean[MyPropertyDescriptor]

'functionContext' @ [433:36] ==> public final val functionContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[PropertyDescriptorImpl]

'basicCallContext' @ [433:52] ==> public final val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'ExpressionReceiver' @ [434:36] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [434:55] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[SimpleFunctionDescriptorImpl]

'calleeExpression' @ [434:62] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'variableType' @ [435:62] ==> val variableType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'basicCallContext' @ [436:62] ==> val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'trace' @ [436:79] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [436:85] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'functionContext' @ [438:13] ==> public final val functionContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl[PropertyDescriptorImpl]

'tracing' @ [438:29] ==> public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[PropertyDescriptorImpl]

'bindReference' @ [438:37] ==> public abstract fun <D : (CallableDescriptor..CallableDescriptor?)> bindReference(@NotNull trace: BindingTrace, @NotNull resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'variable' @ [438:51] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [438:60] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'trace' @ [438:73] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'variable' @ [438:80] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [438:89] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'CallForImplicitInvoke' @ [440:48] ==> public constructor CallForImplicitInvoke(@Nullable explicitExtensionReceiver: Receiver?, @NotNull calleeExpressionAsDispatchReceiver: ExpressionReceiver, @NotNull call: Call, functionCall: Boolean) defined in org.jetbrains.kotlin.resolve.calls.CallTransformer.CallForImplicitInvoke[JavaClassConstructorDescriptor]

'basicCallContext' @ [441:21] ==> val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'call' @ [441:38] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'explicitReceiver' @ [441:43] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'takeIf' @ [441:61] ==> @InlineOnly @SinceKotlin public inline fun <T> Receiver.takeIf(predicate: (Receiver) -> Boolean): Receiver? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Receiver

'useExplicitReceiver' @ [441:70] ==> value-parameter useExplicitReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'variableReceiver' @ [442:21] ==> val variableReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'basicCallContext' @ [442:39] ==> val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'call' @ [442:56] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'TracingStrategyForInvoke' @ [443:36] ==> public constructor TracingStrategyForInvoke(@NotNull reference: KtExpression, @NotNull call: Call, @NotNull calleeType: KotlinType) defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategyForInvoke[JavaClassConstructorDescriptor]

'calleeExpression' @ [443:61] ==> val calleeExpression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'functionCall' @ [443:79] ==> val functionCall: CallTransformer.CallForImplicitInvoke defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'variableReceiver' @ [443:93] ==> val variableReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'type' @ [443:110] ==> public final val ExpressionReceiver.type: KotlinType[MyPropertyDescriptor]

'basicCallContext' @ [444:46] ==> val basicCallContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'replaceBindingTrace' @ [444:63] ==> @NotNull public open fun replaceBindingTrace(@NotNull trace: BindingTrace): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'variable' @ [444:83] ==> value-parameter variable: NewResolutionOldInference.MyCandidate defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[ValueParameterDescriptorImpl]

'resolvedCall' @ [444:92] ==> public final val resolvedCall: MutableResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.MyCandidate[PropertyDescriptorImpl]

'trace' @ [444:105] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'replaceCall' @ [445:22] ==> @NotNull public open fun replaceCall(@NotNull newCall: Call): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'functionCall' @ [445:34] ==> val functionCall: CallTransformer.CallForImplicitInvoke defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'replaceContextDependency' @ [446:22] ==> @NotNull public open fun replaceContextDependency(@NotNull newContextDependency: ContextDependency): BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaMethodDescriptor]

'DEPENDENT' @ [446:65] ==> enum entry DEPENDENT defined in org.jetbrains.kotlin.resolve.calls.context.ContextDependency[FakeCallableDescriptorForObject]

'CandidateFactoryImpl' @ [448:30] ==> public constructor CandidateFactoryImpl(name: Name, basicCallContext: BasicCallResolutionContext, tracing: TracingStrategy) defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryImpl[ClassConstructorDescriptorImpl]

'OperatorNameConventions' @ [448:51] ==> public object OperatorNameConventions defined in org.jetbrains.kotlin.util[FakeCallableDescriptorForObject]

'INVOKE' @ [448:75] ==> @field:JvmField public final val INVOKE: Name defined in org.jetbrains.kotlin.util.OperatorNameConventions[DeserializedPropertyDescriptor]

'basicCallResolutionContext' @ [448:83] ==> val basicCallResolutionContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'tracingForInvoke' @ [448:111] ==> val tracingForInvoke: TracingStrategyForInvoke defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'basicCallResolutionContext' @ [450:20] ==> val basicCallResolutionContext: BasicCallResolutionContext defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'transformToReceiverWithSmartCastInfo' @ [450:47] ==> public fun ResolutionContext<*>.transformToReceiverWithSmartCastInfo(receiver: ReceiverValue): ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]

'variableReceiver' @ [450:84] ==> val variableReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'newContext' @ [450:105] ==> val newContext: NewResolutionOldInference.CandidateFactoryImpl defined in org.jetbrains.kotlin.resolve.calls.tower.NewResolutionOldInference.CandidateFactoryProviderForInvokeImpl.factoryForInvoke[LocalVariableDescriptor]

'transformToReceiverWithSmartCastInfo' @ [458:9] ==> public fun transformToReceiverWithSmartCastInfo(containingDescriptor: DeclarationDescriptor, bindingContext: BindingContext, dataFlowInfo: DataFlowInfo, receiver: ReceiverValue): ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.tower in file NewResolutionOldInference.kt[SimpleFunctionDescriptorImpl]

'scope' @ [458:46] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [458:52] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'trace' @ [458:69] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [458:75] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'dataFlowInfo' @ [458:91] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'receiver' @ [458:105] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[ValueParameterDescriptorImpl]

'DataFlowValueFactory' @ [466:25] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [466:46] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiver' @ [466:66] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[ValueParameterDescriptorImpl]

'bindingContext' @ [466:76] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[ValueParameterDescriptorImpl]

'containingDescriptor' @ [466:92] ==> value-parameter containingDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[ValueParameterDescriptorImpl]

'ReceiverValueWithSmartCastInfo' @ [467:12] ==> public constructor ReceiverValueWithSmartCastInfo(receiverValue: ReceiverValue, possibleTypes: Set<KotlinType>, isStable: Boolean) defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[DeserializedClassConstructorDescriptor]

'receiver' @ [467:43] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [467:53] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[ValueParameterDescriptorImpl]

'getCollectedTypes' @ [467:66] ==> public abstract fun getCollectedTypes(key: DataFlowValue): Set<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [467:84] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[LocalVariableDescriptor]

'dataFlowValue' @ [467:100] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.tower.transformToReceiverWithSmartCastInfo[LocalVariableDescriptor]

'isStable' @ [467:114] ==> public final val isStable: Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'Deprecated' @ [470:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'ResolutionDiagnostic' @ [471:91] ==> public constructor ResolutionDiagnostic(candidateApplicability: ResolutionCandidateApplicability) defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionDiagnostic[DeserializedClassConstructorDescriptor]

'candidateLevel' @ [471:112] ==> value-parameter candidateLevel: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.PreviousResolutionError.<init>[ValueParameterDescriptorImpl]

'Deprecated' @ [473:1] ==> public constructor Deprecated(message: String, replaceWith: ReplaceWith = ..., level: DeprecationLevel = ...) defined in kotlin.Deprecated[DeserializedClassConstructorDescriptor]

'when (status) {
        ResolutionStatus.SUCCESS, ResolutionStatus.INCOMPLETE_TYPE_INFERENCE -> return null
        ResolutionStatus.UNSAFE_CALL_ERROR -> ResolutionCandidateApplicability.MAY_THROW_RUNTIME_ERROR
        ResolutionStatus.ARGUMENTS_MAPPING_ERROR -> ResolutionCandidateApplicability.INAPPLICABLE_ARGUMENTS_MAPPING_ERROR
        ResolutionStatus.RECEIVER_TYPE_ERROR -> ResolutionCandidateApplicability.INAPPLICABLE_WRONG_RECEIVER
        else -> ResolutionCandidateApplicability.INAPPLICABLE
    }' @ [475:17] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ResolutionCandidateApplicability, entry1: ResolutionCandidateApplicability, entry2: ResolutionCandidateApplicability, entry3: ResolutionCandidateApplicability, entry4: ResolutionCandidateApplicability): ResolutionCandidateApplicability[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ResolutionCandidateApplicability

'status' @ [475:23] ==> value-parameter status: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.tower.createPreviousResolveError[ValueParameterDescriptorImpl]

'SUCCESS' @ [476:26] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'INCOMPLETE_TYPE_INFERENCE' @ [476:52] ==> enum entry INCOMPLETE_TYPE_INFERENCE defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'UNSAFE_CALL_ERROR' @ [477:26] ==> enum entry UNSAFE_CALL_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'MAY_THROW_RUNTIME_ERROR' @ [477:80] ==> enum entry MAY_THROW_RUNTIME_ERROR defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'ARGUMENTS_MAPPING_ERROR' @ [478:26] ==> enum entry ARGUMENTS_MAPPING_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'INAPPLICABLE_ARGUMENTS_MAPPING_ERROR' @ [478:86] ==> enum entry INAPPLICABLE_ARGUMENTS_MAPPING_ERROR defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'RECEIVER_TYPE_ERROR' @ [479:26] ==> enum entry RECEIVER_TYPE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'INAPPLICABLE_WRONG_RECEIVER' @ [479:82] ==> enum entry INAPPLICABLE_WRONG_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'INAPPLICABLE' @ [480:50] ==> enum entry INAPPLICABLE defined in org.jetbrains.kotlin.resolve.calls.tower.ResolutionCandidateApplicability[FakeCallableDescriptorForObject]

'PreviousResolutionError' @ [482:12] ==> public constructor PreviousResolutionError(candidateLevel: ResolutionCandidateApplicability) defined in org.jetbrains.kotlin.resolve.calls.tower.PreviousResolutionError[ClassConstructorDescriptorImpl]

'level' @ [482:36] ==> val level: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower.createPreviousResolveError[LocalVariableDescriptor]

'call' @ [485:69] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.BasicCallResolutionContext[JavaPropertyDescriptor]

'explicitReceiver' @ [485:74] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

