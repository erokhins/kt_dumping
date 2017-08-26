'CallableReceiver' @ [46:106] ==> private constructor CallableReceiver(receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[ClassConstructorDescriptorImpl]

'receiver' @ [46:123] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.UnboundReference.<init>[ValueParameterDescriptorImpl]

'CallableReceiver' @ [47:109] ==> private constructor CallableReceiver(receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[ClassConstructorDescriptorImpl]

'receiver' @ [47:126] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.BoundValueReference.<init>[ValueParameterDescriptorImpl]

'CallableReceiver' @ [48:69] ==> private constructor CallableReceiver(receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[ClassConstructorDescriptorImpl]

'receiver' @ [48:86] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.ScopeReceiver.<init>[ValueParameterDescriptorImpl]

'CallableReceiver' @ [49:120] ==> private constructor CallableReceiver(receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[ClassConstructorDescriptorImpl]

'receiver' @ [49:137] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.ExplicitValueReceiver.<init>[ValueParameterDescriptorImpl]

'receiver' @ [54:13] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[PropertyDescriptorImpl]

'receiverValue' @ [54:22] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'getResultApplicability' @ [73:43] ==> public fun getResultApplicability(diagnostics: Collection<KotlinCallDiagnostic>): ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.tower in file ImplicitScopeTower.kt[SimpleFunctionDescriptorImpl]

'diagnostics' @ [73:66] ==> public final val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'resultingApplicability' @ [74:39] ==> public open val resultingApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[PropertyDescriptorImpl]

'isSuccess' @ [74:62] ==> public val ResolutionCandidateApplicability.isSuccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'factory' @ [89:21] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'argument' @ [89:29] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'lhsResult' @ [89:38] ==> public abstract val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceKotlinCallArgument[PropertyDescriptorImpl]

'when (lhsResult) {
        LHSResult.Empty, LHSResult.Error, is LHSResult.Expression -> {
            val explicitReceiver = (lhsResult as? LHSResult.Expression)?.lshCallArgument?.receiver
            return factory.createCallableProcessor(explicitReceiver)
        }
        is LHSResult.Type -> {
            val static = factory.createCallableProcessor(lhsResult.qualifier)
            val unbound = factory.createCallableProcessor(lhsResult.unboundDetailedReceiver)

            // note that if we use PrioritizedCompositeScopeTowerProcessor then static will win over unbound members
            val staticOrUnbound = SamePriorityCompositeScopeTowerProcessor(static, unbound)

            val asValue = lhsResult.qualifier.classValueReceiverWithSmartCastInfo ?: return staticOrUnbound
            return PrioritizedCompositeScopeTowerProcessor(staticOrUnbound, factory.createCallableProcessor(asValue))
        }
        is LHSResult.Object -> {
            // callable reference to nested class constructor
            val static = factory.createCallableProcessor(lhsResult.qualifier)
            val boundObjectReference = factory.createCallableProcessor(lhsResult.objectValueReceiver)

            return SamePriorityCompositeScopeTowerProcessor(static, boundObjectReference)
        }
    }' @ [90:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'lhsResult' @ [90:11] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'Empty' @ [91:19] ==> public object Empty : LHSResult defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult[FakeCallableDescriptorForObject]

'Error' @ [91:36] ==> public object Error : LHSResult defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult[FakeCallableDescriptorForObject]

'lhsResult' @ [92:37] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'lshCallArgument' @ [92:74] ==> public final val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Expression[PropertyDescriptorImpl]

'receiver' @ [92:91] ==> public abstract val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.SimpleKotlinCallArgument[PropertyDescriptorImpl]

'factory' @ [93:20] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'createCallableProcessor' @ [93:28] ==> public final fun createCallableProcessor(explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'explicitReceiver' @ [93:52] ==> val explicitReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'factory' @ [96:26] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'createCallableProcessor' @ [96:34] ==> public final fun createCallableProcessor(explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'lhsResult' @ [96:58] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'qualifier' @ [96:68] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Type[PropertyDescriptorImpl]

'factory' @ [97:27] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'createCallableProcessor' @ [97:35] ==> public final fun createCallableProcessor(explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'lhsResult' @ [97:59] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'unboundDetailedReceiver' @ [97:69] ==> public final val unboundDetailedReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Type[PropertyDescriptorImpl]

'SamePriorityCompositeScopeTowerProcessor' @ [100:35] ==> public constructor SamePriorityCompositeScopeTowerProcessor<out C>(vararg processors: SimpleScopeTowerProcessor<CallableReferenceCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.SamePriorityCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> CallableReferenceCandidate

'static' @ [100:76] ==> val static: SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'unbound' @ [100:84] ==> val unbound: SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'lhsResult' @ [102:27] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'qualifier' @ [102:37] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Type[PropertyDescriptorImpl]

'classValueReceiverWithSmartCastInfo' @ [102:47] ==> public open val classValueReceiverWithSmartCastInfo: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'staticOrUnbound' @ [102:93] ==> val staticOrUnbound: SamePriorityCompositeScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'PrioritizedCompositeScopeTowerProcessor' @ [103:20] ==> public constructor PrioritizedCompositeScopeTowerProcessor<out C>(vararg processors: ScopeTowerProcessor<CallableReferenceCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.PrioritizedCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> CallableReferenceCandidate

'staticOrUnbound' @ [103:60] ==> val staticOrUnbound: SamePriorityCompositeScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'factory' @ [103:77] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'createCallableProcessor' @ [103:85] ==> public final fun createCallableProcessor(explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'asValue' @ [103:109] ==> val asValue: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'factory' @ [107:26] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'createCallableProcessor' @ [107:34] ==> public final fun createCallableProcessor(explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'lhsResult' @ [107:58] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'qualifier' @ [107:68] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Object[PropertyDescriptorImpl]

'factory' @ [108:40] ==> value-parameter factory: CallableReferencesCandidateFactory defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[ValueParameterDescriptorImpl]

'createCallableProcessor' @ [108:48] ==> public final fun createCallableProcessor(explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'lhsResult' @ [108:72] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'objectValueReceiver' @ [108:82] ==> public final val objectValueReceiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Object[PropertyDescriptorImpl]

'SamePriorityCompositeScopeTowerProcessor' @ [110:20] ==> public constructor SamePriorityCompositeScopeTowerProcessor<out C>(vararg processors: SimpleScopeTowerProcessor<CallableReferenceCandidate>) defined in org.jetbrains.kotlin.resolve.calls.tower.SamePriorityCompositeScopeTowerProcessor[ClassConstructorDescriptorImpl]
Inferred types:
    <out C> -> CallableReferenceCandidate

'static' @ [110:61] ==> val static: SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'boundObjectReference' @ [110:69] ==> val boundObjectReference: SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.components.createCallableReferenceProcessor[LocalVariableDescriptor]

'ArgumentConstraintPosition' @ [124:20] ==> public constructor ArgumentConstraintPosition(argument: KotlinCallArgument) defined in org.jetbrains.kotlin.resolve.calls.inference.model.ArgumentConstraintPosition[ClassConstructorDescriptorImpl]

'argument' @ [124:47] ==> value-parameter argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'createToFreshVariableSubstitutorAndAddInitialConstraints' @ [126:30] ==> public final fun createToFreshVariableSubstitutorAndAddInitialConstraints(candidateDescriptor: CallableDescriptor, csBuilder: ConstraintSystemOperation): FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.CreateFreshVariablesSubstitutor[FunctionImportedFromObject]

'candidateDescriptor' @ [126:87] ==> value-parameter candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'this' @ [126:108] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ReceiverParameterDescriptorImpl]

'expectedType' @ [128:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'addSubtypeConstraint' @ [129:9] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[SimpleFunctionDescriptorImpl]

'toFreshSubstitutor' @ [129:30] ==> val toFreshSubstitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'safeSubstitute' @ [129:49] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'reflectionCandidateType' @ [129:64] ==> value-parameter reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'expectedType' @ [129:90] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'position' @ [129:104] ==> val position: ArgumentConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'addReceiverConstraint' @ [132:5] ==> private fun ConstraintSystemOperation.addReceiverConstraint(toFreshSubstitutor: FreshVariableNewTypeSubstitutor, receiverArgument: CallableReceiver?, receiverParameter: ReceiverParameterDescriptor?, position: ArgumentConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.components in file CallableReferenceResolution.kt[SimpleFunctionDescriptorImpl]

'toFreshSubstitutor' @ [132:27] ==> val toFreshSubstitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'dispatchReceiver' @ [132:47] ==> value-parameter dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [132:65] ==> value-parameter candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [132:85] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'position' @ [132:112] ==> val position: ArgumentConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'addReceiverConstraint' @ [133:5] ==> private fun ConstraintSystemOperation.addReceiverConstraint(toFreshSubstitutor: FreshVariableNewTypeSubstitutor, receiverArgument: CallableReceiver?, receiverParameter: ReceiverParameterDescriptor?, position: ArgumentConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.components in file CallableReferenceResolution.kt[SimpleFunctionDescriptorImpl]

'toFreshSubstitutor' @ [133:27] ==> val toFreshSubstitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'extensionReceiver' @ [133:47] ==> value-parameter extensionReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [133:66] ==> value-parameter candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [133:86] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'position' @ [133:114] ==> val position: ArgumentConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'findInvisibleMember' @ [135:40] ==> @Nullable public open fun findInvisibleMember(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'dispatchReceiver' @ [135:60] ==> value-parameter dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'asReceiverValueForVisibilityChecks' @ [135:78] ==> private val CallableReceiver.asReceiverValueForVisibilityChecks: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.components in file CallableReferenceResolution.kt[PropertyDescriptorImpl]

'candidateDescriptor' @ [136:60] ==> value-parameter candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [136:81] ==> value-parameter ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[ValueParameterDescriptorImpl]

'toFreshSubstitutor' @ [137:12] ==> val toFreshSubstitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'invisibleMember' @ [137:34] ==> val invisibleMember: DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.resolve.calls.components.checkCallableReference[LocalVariableDescriptor]

'let' @ [137:51] ==> @InlineOnly public inline fun <T, R> DeclarationDescriptorWithVisibility.let(block: (DeclarationDescriptorWithVisibility) -> VisibilityError): VisibilityError defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptorWithVisibility
    <R> -> VisibilityError

'VisibilityError' @ [137:57] ==> public constructor VisibilityError(invisibleMember: DeclarationDescriptorWithVisibility) defined in org.jetbrains.kotlin.resolve.calls.tower.VisibilityError[ClassConstructorDescriptorImpl]

'receiverArgument' @ [147:9] ==> value-parameter receiverArgument: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'receiverParameter' @ [147:37] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'assert' @ [148:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiverArgument' @ [148:16] ==> value-parameter receiverArgument: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'receiverArgument' @ [148:96] ==> value-parameter receiverArgument: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'assert' @ [149:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'receiverParameter' @ [149:16] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'receiverParameter' @ [149:97] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'toFreshSubstitutor' @ [153:24] ==> value-parameter toFreshSubstitutor: FreshVariableNewTypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'safeSubstitute' @ [153:43] ==> public open fun safeSubstitute(type: UnwrappedType): UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.inference.components.FreshVariableNewTypeSubstitutor[SimpleFunctionDescriptorImpl]

'receiverParameter' @ [153:58] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'value' @ [153:76] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'type' @ [153:82] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'unwrap' @ [153:87] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'receiverArgument' @ [154:24] ==> value-parameter receiverArgument: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'receiver' @ [154:41] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[PropertyDescriptorImpl]

'stableType' @ [154:50] ==> internal val ReceiverValueWithSmartCastInfo.stableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'addSubtypeConstraint' @ [155:5] ==> public abstract fun addSubtypeConstraint(lowerType: UnwrappedType, upperType: UnwrappedType, position: ConstraintPosition): Unit defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[SimpleFunctionDescriptorImpl]

'receiverType' @ [155:26] ==> val receiverType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[LocalVariableDescriptor]

'expectedType' @ [155:40] ==> val expectedType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[LocalVariableDescriptor]

'position' @ [155:54] ==> value-parameter position: ArgumentConstraintPosition defined in org.jetbrains.kotlin.resolve.calls.components.addReceiverConstraint[ValueParameterDescriptorImpl]

'createCallableReferenceProcessor' @ [167:13] ==> public fun <C : Candidate> createCallableReferenceProcessor(scopeTower: ImplicitScopeTower, name: Name, context: CandidateFactory<CallableReferenceCandidate>, explicitReceiver: DetailedReceiver?): SimpleScopeTowerProcessor<CallableReferenceCandidate> defined in org.jetbrains.kotlin.resolve.calls.tower[SimpleFunctionDescriptorImpl]
Inferred types:
    <C : Candidate> -> CallableReferenceCandidate

'scopeTower' @ [167:46] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'argument' @ [167:58] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'rhsName' @ [167:67] ==> public abstract val rhsName: Name defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceKotlinCallArgument[PropertyDescriptorImpl]

'this' @ [167:76] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[LazyClassReceiverParameterDescriptor]

'explicitReceiver' @ [167:82] ==> value-parameter explicitReceiver: DetailedReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCallableProcessor[ValueParameterDescriptorImpl]

'towerCandidate' @ [175:40] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [175:55] ==> public abstract val dispatchReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'let' @ [175:73] ==> @InlineOnly public inline fun <T, R> ReceiverValueWithSmartCastInfo.let(block: (ReceiverValueWithSmartCastInfo) -> CallableReceiver): CallableReceiver defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValueWithSmartCastInfo
    <R> -> CallableReceiver

'toCallableReceiver' @ [175:79] ==> private final fun toCallableReceiver(receiver: ReceiverValueWithSmartCastInfo, isExplicit: Boolean): CallableReceiver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'it' @ [175:98] ==> value-parameter it: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate.<anonymous>[ValueParameterDescriptorImpl]

'explicitReceiverKind' @ [175:102] ==> value-parameter explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'DISPATCH_RECEIVER' @ [175:126] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'extensionReceiver' @ [176:41] ==> value-parameter extensionReceiver: ReceiverValueWithSmartCastInfo? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'let' @ [176:60] ==> @InlineOnly public inline fun <T, R> ReceiverValueWithSmartCastInfo.let(block: (ReceiverValueWithSmartCastInfo) -> CallableReceiver): CallableReceiver defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValueWithSmartCastInfo
    <R> -> CallableReceiver

'toCallableReceiver' @ [176:66] ==> private final fun toCallableReceiver(receiver: ReceiverValueWithSmartCastInfo, isExplicit: Boolean): CallableReceiver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'it' @ [176:85] ==> value-parameter it: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate.<anonymous>[ValueParameterDescriptorImpl]

'explicitReceiverKind' @ [176:89] ==> value-parameter explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'EXTENSION_RECEIVER' @ [176:113] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'towerCandidate' @ [177:35] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'descriptor' @ [177:50] ==> public abstract val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'SmartList' @ [178:27] ==> public constructor SmartList<E : (Any..Any?)>() defined in org.jetbrains.kotlin.utils.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinCallDiagnostic

'component1' @ [180:14] ==> public final operator fun component1(): UnwrappedType defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [180:39] ==> public final operator fun component2(): Int defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'buildReflectionType' @ [180:51] ==> private final fun buildReflectionType(descriptor: CallableDescriptor, dispatchReceiver: CallableReceiver?, extensionReceiver: CallableReceiver?, expectedType: UnwrappedType?): Pair<UnwrappedType, Int> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'candidateDescriptor' @ [181:17] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'dispatchCallableReceiver' @ [182:17] ==> val dispatchCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'extensionCallableReceiver' @ [183:17] ==> val extensionCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'expectedType' @ [184:17] ==> public final val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'defaults' @ [186:13] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'diagnostics' @ [187:13] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'add' @ [187:25] ==> public open fun add(element: (KotlinCallDiagnostic..KotlinCallDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'CallableReferencesDefaultArgumentUsed' @ [187:29] ==> public constructor CallableReferencesDefaultArgumentUsed(argument: CallableReferenceKotlinCallArgument, candidate: CallableDescriptor, defaultsCount: Int) defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferencesDefaultArgumentUsed[ClassConstructorDescriptorImpl]

'argument' @ [187:67] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'candidateDescriptor' @ [187:77] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'defaults' @ [187:98] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'candidateDescriptor' @ [190:13] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'CallableReferenceCandidate' @ [191:20] ==> public constructor CallableReferenceCandidate(candidate: CallableDescriptor, dispatchReceiver: CallableReceiver?, extensionReceiver: CallableReceiver?, explicitReceiverKind: ExplicitReceiverKind, reflectionCandidateType: UnwrappedType, numDefaults: Int, diagnostics: List<KotlinCallDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[ClassConstructorDescriptorImpl]

'candidateDescriptor' @ [191:47] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'dispatchCallableReceiver' @ [191:68] ==> val dispatchCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'extensionCallableReceiver' @ [191:94] ==> val extensionCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'explicitReceiverKind' @ [192:47] ==> value-parameter explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'reflectionCandidateType' @ [192:69] ==> val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'defaults' @ [192:94] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'listOf' @ [193:47] ==> public fun <T> listOf(element: NotCallableMemberReference): List<NotCallableMemberReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> NotCallableMemberReference

'NotCallableMemberReference' @ [193:54] ==> public constructor NotCallableMemberReference(argument: CallableReferenceKotlinCallArgument, candidate: CallableDescriptor) defined in org.jetbrains.kotlin.resolve.calls.model.NotCallableMemberReference[ClassConstructorDescriptorImpl]

'argument' @ [193:81] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'candidateDescriptor' @ [193:91] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'diagnostics' @ [196:9] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'addAll' @ [196:21] ==> public open fun addAll(elements: Collection<(KotlinCallDiagnostic..KotlinCallDiagnostic?)>): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'towerCandidate' @ [196:28] ==> value-parameter towerCandidate: CandidateWithBoundDispatchReceiver defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'diagnostics' @ [196:43] ==> public abstract val diagnostics: List<ResolutionDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.tower.CandidateWithBoundDispatchReceiver[PropertyDescriptorImpl]

'invoke' @ [199:9] ==> public abstract operator fun invoke(p1: (ConstraintSystemOperation) -> Unit): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [200:17] ==> value-parameter it: ConstraintSystemOperation defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate.<anonymous>[ValueParameterDescriptorImpl]

'hasContradiction' @ [200:20] ==> public abstract val hasContradiction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[PropertyDescriptorImpl]

'component1' @ [202:18] ==> public final operator fun component1(): FreshVariableNewTypeSubstitutor defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [202:21] ==> public final operator fun component2(): KotlinCallDiagnostic? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [202:40] ==> value-parameter it: ConstraintSystemOperation defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate.<anonymous>[ValueParameterDescriptorImpl]

'checkCallableReference' @ [202:43] ==> public fun ConstraintSystemOperation.checkCallableReference(argument: CallableReferenceKotlinCallArgument, dispatchReceiver: CallableReceiver?, extensionReceiver: CallableReceiver?, candidateDescriptor: CallableDescriptor, reflectionCandidateType: UnwrappedType, expectedType: UnwrappedType?, ownerDescriptor: DeclarationDescriptor): Pair<FreshVariableNewTypeSubstitutor, KotlinCallDiagnostic?> defined in org.jetbrains.kotlin.resolve.calls.components in file CallableReferenceResolution.kt[SimpleFunctionDescriptorImpl]

'argument' @ [203:21] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'dispatchCallableReceiver' @ [203:31] ==> val dispatchCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'extensionCallableReceiver' @ [203:57] ==> val extensionCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'candidateDescriptor' @ [203:84] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'reflectionCandidateType' @ [204:21] ==> val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'expectedType' @ [204:46] ==> public final val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'scopeTower' @ [204:60] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'lexicalScope' @ [204:71] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'ownerDescriptor' @ [204:84] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'diagnostics' @ [206:13] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'addIfNotNull' @ [206:25] ==> public fun <T : Any> MutableCollection<(KotlinCallDiagnostic..KotlinCallDiagnostic?)>.addIfNotNull(t: KotlinCallDiagnostic?): Unit defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> (org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic..org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic?)

'visibilityError' @ [206:38] ==> val visibilityError: KotlinCallDiagnostic? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate.<anonymous>[LocalVariableDescriptor]

'it' @ [208:17] ==> value-parameter it: ConstraintSystemOperation defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate.<anonymous>[ValueParameterDescriptorImpl]

'hasContradiction' @ [208:20] ==> public abstract val hasContradiction: Boolean defined in org.jetbrains.kotlin.resolve.calls.inference.ConstraintSystemOperation[PropertyDescriptorImpl]

'diagnostics' @ [208:38] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'add' @ [208:50] ==> public open fun add(element: (KotlinCallDiagnostic..KotlinCallDiagnostic?)): Boolean defined in org.jetbrains.kotlin.utils.SmartList[JavaMethodDescriptor]

'CallableReferenceNotCompatible' @ [208:54] ==> public constructor CallableReferenceNotCompatible(argument: CallableReferenceKotlinCallArgument, candidate: CallableMemberDescriptor, expectedType: UnwrappedType?, callableReverenceType: UnwrappedType) defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceNotCompatible[ClassConstructorDescriptorImpl]

'argument' @ [208:85] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'candidateDescriptor' @ [208:95] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'expectedType' @ [208:116] ==> public final val expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'reflectionCandidateType' @ [208:130] ==> val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'CallableReferenceCandidate' @ [211:16] ==> public constructor CallableReferenceCandidate(candidate: CallableDescriptor, dispatchReceiver: CallableReceiver?, extensionReceiver: CallableReceiver?, explicitReceiverKind: ExplicitReceiverKind, reflectionCandidateType: UnwrappedType, numDefaults: Int, diagnostics: List<KotlinCallDiagnostic>) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferenceCandidate[ClassConstructorDescriptorImpl]

'candidateDescriptor' @ [211:43] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'dispatchCallableReceiver' @ [211:64] ==> val dispatchCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'extensionCallableReceiver' @ [211:90] ==> val extensionCallableReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'explicitReceiverKind' @ [212:43] ==> value-parameter explicitReceiverKind: ExplicitReceiverKind defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[ValueParameterDescriptorImpl]

'reflectionCandidateType' @ [212:65] ==> val reflectionCandidateType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'defaults' @ [212:90] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'diagnostics' @ [212:100] ==> val diagnostics: SmartList<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.createCandidate[LocalVariableDescriptor]

'getFunctionTypeFromCallableReferenceExpectedType' @ [220:28] ==> public fun getFunctionTypeFromCallableReferenceExpectedType(expectedType: UnwrappedType?): UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components in file CallableReferenceResolution.kt[SimpleFunctionDescriptorImpl]

'expectedType' @ [220:77] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[ValueParameterDescriptorImpl]

'functionType' @ [222:37] ==> val functionType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'arguments' @ [222:50] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.UnwrappedType[DeserializedPropertyDescriptor]

'size' @ [222:60] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'unboundReceiverCount' @ [222:67] ==> value-parameter unboundReceiverCount: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[ValueParameterDescriptorImpl]

'expectedArgumentCount' @ [223:13] ==> val expectedArgumentCount: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'..' @ [225:30] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'expectedArgumentCount' @ [225:34] ==> val expectedArgumentCount: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'map' @ [225:62] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> FakeKotlinCallArgumentForCallableReference): List<FakeKotlinCallArgumentForCallableReference> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> FakeKotlinCallArgumentForCallableReference

'FakeKotlinCallArgumentForCallableReference' @ [225:68] ==> public constructor FakeKotlinCallArgumentForCallableReference(index: Int) defined in org.jetbrains.kotlin.resolve.calls.model.FakeKotlinCallArgumentForCallableReference[ClassConstructorDescriptorImpl]

'it' @ [225:111] ==> value-parameter it: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType.<anonymous>[ValueParameterDescriptorImpl]

'callComponents' @ [226:31] ==> public final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'argumentsToParametersMapper' @ [226:46] ==> public final val argumentsToParametersMapper: ArgumentsToParametersMapper defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallComponents[PropertyDescriptorImpl]

'mapArguments' @ [226:74] ==> public final fun mapArguments(argumentsInParenthesis: List<KotlinCallArgument>, externalArgument: KotlinCallArgument?, descriptor: CallableDescriptor): ArgumentsToParametersMapper.ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper[SimpleFunctionDescriptorImpl]

'fakeArguments' @ [226:87] ==> val fakeArguments: List<FakeKotlinCallArgumentForCallableReference> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'descriptor' @ [226:140] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[ValueParameterDescriptorImpl]

'argumentMapping' @ [227:13] ==> val argumentMapping: ArgumentsToParametersMapper.ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'diagnostics' @ [227:29] ==> public final val diagnostics: List<KotlinCallDiagnostic> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.ArgumentMapping[PropertyDescriptorImpl]

'any' @ [227:41] ==> public inline fun <T> Iterable<KotlinCallDiagnostic>.any(predicate: (KotlinCallDiagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinCallDiagnostic

'!' @ [227:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'it' @ [227:48] ==> value-parameter it: KotlinCallDiagnostic defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType.<anonymous>[ValueParameterDescriptorImpl]

'candidateApplicability' @ [227:51] ==> public final val candidateApplicability: ResolutionCandidateApplicability defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallDiagnostic[PropertyDescriptorImpl]

'isSuccess' @ [227:74] ==> public val ResolutionCandidateApplicability.isSuccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.tower in file TowerUtils.kt[PropertyDescriptorImpl]

'arrayOfNulls' @ [234:31] ==> public fun <reified @PureReifiable T> arrayOfNulls(size: Int): Array<KotlinType?> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <reified @PureReifiable T> -> KotlinType?

'fakeArguments' @ [234:57] ==> val fakeArguments: List<FakeKotlinCallArgumentForCallableReference> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'size' @ [234:71] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'component1' @ [235:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component1(): ValueParameterDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'component2' @ [235:31] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<ValueParameterDescriptor, ResolvedCallArgument>.component2(): ResolvedCallArgument defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> ValueParameterDescriptor
    <V> -> ResolvedCallArgument

'argumentMapping' @ [235:52] ==> val argumentMapping: ArgumentsToParametersMapper.ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'parameterToCallArgumentMap' @ [235:68] ==> public final val parameterToCallArgumentMap: Map<ValueParameterDescriptor, ResolvedCallArgument> defined in org.jetbrains.kotlin.resolve.calls.components.ArgumentsToParametersMapper.ArgumentMapping[PropertyDescriptorImpl]

'resolvedArgument' @ [236:34] ==> val resolvedArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'arguments' @ [236:51] ==> public abstract val arguments: List<KotlinCallArgument> defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[PropertyDescriptorImpl]

'fakeArgument' @ [237:30] ==> val fakeArgument: KotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'index' @ [237:90] ==> public final val index: Int defined in org.jetbrains.kotlin.resolve.calls.model.FakeKotlinCallArgumentForCallableReference[PropertyDescriptorImpl]

'descriptor' @ [238:44] ==> value-parameter descriptor: FunctionDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[ValueParameterDescriptorImpl]

'valueParameters' @ [238:55] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [238:71] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'valueParameter' @ [238:81] ==> val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'index' @ [238:96] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'mappedArguments' @ [240:17] ==> val mappedArguments: Array<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'index' @ [240:33] ==> val index: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'substitutedParameter' @ [240:42] ==> val substitutedParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'varargElementType' @ [240:63] ==> public abstract val varargElementType: KotlinType? defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'substitutedParameter' @ [240:84] ==> val substitutedParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'type' @ [240:105] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'resolvedArgument' @ [242:17] ==> val resolvedArgument: ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'DefaultArgument' @ [242:58] ==> public object DefaultArgument : ResolvedCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCallArgument[FakeCallableDescriptorForObject]

'defaults' @ [242:75] ==> var defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'mappedArguments' @ [244:13] ==> val mappedArguments: Array<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'any' @ [244:29] ==> public inline fun <T> Array<out KotlinType?>.any(predicate: (KotlinType?) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType?

'it' @ [244:35] ==> value-parameter it: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType.<anonymous>[ValueParameterDescriptorImpl]

'functionType' @ [247:34] ==> val functionType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'getReturnTypeFromFunctionType' @ [247:47] ==> public fun KotlinType.getReturnTypeFromFunctionType(): KotlinType defined in org.jetbrains.kotlin.builtins[DeserializedSimpleFunctionDescriptor]

'lowerIfFlexible' @ [247:79] ==> public fun KotlinType.lowerIfFlexible(): SimpleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'if (returnExpectedType.isUnit()) CoercionStrategy.COERCION_TO_UNIT else CoercionStrategy.NO_COERCION' @ [249:24] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CoercionStrategy, elseBranch: CoercionStrategy): CoercionStrategy[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CoercionStrategy

'returnExpectedType' @ [249:28] ==> val returnExpectedType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'isUnit' @ [249:47] ==> public fun KotlinType.isUnit(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'COERCION_TO_UNIT' @ [249:74] ==> enum entry COERCION_TO_UNIT defined in org.jetbrains.kotlin.types.expressions.CoercionStrategy[FakeCallableDescriptorForObject]

'NO_COERCION' @ [249:113] ==> enum entry NO_COERCION defined in org.jetbrains.kotlin.types.expressions.CoercionStrategy[FakeCallableDescriptorForObject]

'Suppress' @ [251:9] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'Triple' @ [252:16] ==> public constructor Triple<out A, out B, out C>(first: Array<KotlinType>, second: CoercionStrategy, third: Int) defined in kotlin.Triple[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> Array<KotlinType>
    <out B> -> CoercionStrategy
    <out C> -> Int

'mappedArguments' @ [252:23] ==> val mappedArguments: Array<KotlinType?> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'coercion' @ [252:61] ==> val coercion: CoercionStrategy defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'defaults' @ [252:71] ==> var defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.getArgumentAndReturnTypeUseMappingByExpectedType[LocalVariableDescriptor]

'ArrayList' @ [261:37] ==> public final fun <E> <init>(p0: Int): ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in kotlin.collections.ArrayList[TypeAliasConstructorDescriptorImpl]
Inferred types:
    <E> -> KotlinType

'descriptor' @ [261:59] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'valueParameters' @ [261:70] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'size' @ [261:86] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'dispatchReceiver' @ [263:13] ==> value-parameter dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'argumentsAndReceivers' @ [264:13] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'add' @ [264:35] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'dispatchReceiver' @ [264:39] ==> value-parameter dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'receiver' @ [264:56] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[PropertyDescriptorImpl]

'stableType' @ [264:65] ==> internal val ReceiverValueWithSmartCastInfo.stableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'extensionReceiver' @ [266:13] ==> value-parameter extensionReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'argumentsAndReceivers' @ [267:13] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'add' @ [267:35] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'extensionReceiver' @ [267:39] ==> value-parameter extensionReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'receiver' @ [267:57] ==> public final val receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver[PropertyDescriptorImpl]

'stableType' @ [267:66] ==> internal val ReceiverValueWithSmartCastInfo.stableType: UnwrappedType defined in org.jetbrains.kotlin.resolve.calls.components in file ArgumentsUtils.kt[PropertyDescriptorImpl]

'descriptor' @ [270:36] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'returnType' @ [270:47] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'createErrorType' @ [271:50] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [271:102] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'when (descriptor) {
            is PropertyDescriptor -> {
                val mutable = descriptor.isVar && run {
                    val setter = descriptor.setter
                    setter == null || Visibilities.isVisible(dispatchReceiver?.asReceiverValueForVisibilityChecks, setter,
                                                             scopeTower.lexicalScope.ownerDescriptor)
                }

                return callComponents.reflectionTypes.getKPropertyType(Annotations.EMPTY, argumentsAndReceivers, descriptorReturnType, mutable) to 0
            }
            is FunctionDescriptor -> {
                val returnType: KotlinType
                val defaults: Int
                val argumentsAndExpectedTypeCoercion = getArgumentAndReturnTypeUseMappingByExpectedType(descriptor, expectedType,
                                                                                                        unboundReceiverCount = argumentsAndReceivers.size)

                if (argumentsAndExpectedTypeCoercion == null) {
                    descriptor.valueParameters.mapTo(argumentsAndReceivers) { it.type }
                    returnType = descriptorReturnType
                    defaults = 0
                }
                else {
                    val (arguments, coercion) = argumentsAndExpectedTypeCoercion
                    defaults = argumentsAndExpectedTypeCoercion.third
                    argumentsAndReceivers.addAll(arguments)

                    returnType = if (coercion == CoercionStrategy.COERCION_TO_UNIT) descriptor.builtIns.unitType else descriptorReturnType
                }

                return callComponents.reflectionTypes.getKFunctionType(Annotations.EMPTY, null, argumentsAndReceivers, null,
                                                                       returnType, descriptor.builtIns) to defaults
            }
            else -> error("Unsupported descriptor type: $descriptor")
        }' @ [273:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Nothing, entry1: Nothing, entry2: Nothing): Nothing[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Nothing

'descriptor' @ [273:15] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'descriptor' @ [275:31] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'isVar' @ [275:42] ==> public final val PropertyDescriptor.isVar: Boolean[MyPropertyDescriptor]

'run' @ [275:51] ==> @InlineOnly public inline fun <T, R> CallableReferencesCandidateFactory.run(block: CallableReferencesCandidateFactory.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallableReferencesCandidateFactory
    <R> -> Boolean

'descriptor' @ [276:34] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'setter' @ [276:45] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'setter' @ [277:21] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType.<anonymous>[LocalVariableDescriptor]

'isVisible' @ [277:52] ==> public open fun isVisible(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'dispatchReceiver' @ [277:62] ==> value-parameter dispatchReceiver: CallableReceiver? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'asReceiverValueForVisibilityChecks' @ [277:80] ==> private val CallableReceiver.asReceiverValueForVisibilityChecks: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.components in file CallableReferenceResolution.kt[PropertyDescriptorImpl]

'setter' @ [277:116] ==> val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType.<anonymous>[LocalVariableDescriptor]

'scopeTower' @ [278:62] ==> public final val scopeTower: ImplicitScopeTower defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'lexicalScope' @ [278:73] ==> public abstract val lexicalScope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.tower.ImplicitScopeTower[PropertyDescriptorImpl]

'ownerDescriptor' @ [278:86] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[PropertyDescriptorImpl]

'callComponents' @ [281:24] ==> public final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'reflectionTypes' @ [281:39] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallComponents[PropertyDescriptorImpl]

'getKPropertyType' @ [281:55] ==> public final fun getKPropertyType(annotations: Annotations, receiverTypes: List<KotlinType>, returnType: KotlinType, mutable: Boolean): SimpleType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [281:84] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'argumentsAndReceivers' @ [281:91] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'descriptorReturnType' @ [281:114] ==> val descriptorReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'mutable' @ [281:136] ==> val mutable: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'getArgumentAndReturnTypeUseMappingByExpectedType' @ [286:56] ==> private final fun getArgumentAndReturnTypeUseMappingByExpectedType(descriptor: FunctionDescriptor, expectedType: UnwrappedType?, unboundReceiverCount: Int): Triple<Array<KotlinType>, CoercionStrategy, Int>? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[SimpleFunctionDescriptorImpl]

'descriptor' @ [286:105] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'expectedType' @ [286:117] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'argumentsAndReceivers' @ [287:128] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'size' @ [287:150] ==> public open val size: Int defined in java.util.ArrayList[JavaPropertyDescriptor]

'if (argumentsAndExpectedTypeCoercion == null) {
                    descriptor.valueParameters.mapTo(argumentsAndReceivers) { it.type }
                    returnType = descriptorReturnType
                    defaults = 0
                }
                else {
                    val (arguments, coercion) = argumentsAndExpectedTypeCoercion
                    defaults = argumentsAndExpectedTypeCoercion.third
                    argumentsAndReceivers.addAll(arguments)

                    returnType = if (coercion == CoercionStrategy.COERCION_TO_UNIT) descriptor.builtIns.unitType else descriptorReturnType
                }' @ [289:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentsAndExpectedTypeCoercion' @ [289:21] ==> val argumentsAndExpectedTypeCoercion: Triple<Array<KotlinType>, CoercionStrategy, Int>? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'descriptor' @ [290:21] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'valueParameters' @ [290:32] ==> public final val FunctionDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'mapTo' @ [290:48] ==> public inline fun <T, R, C : MutableCollection<in KotlinType>> Iterable<(ValueParameterDescriptor..ValueParameterDescriptor?)>.mapTo(destination: ArrayList<KotlinType> /* = ArrayList<KotlinType> */, transform: ((ValueParameterDescriptor..ValueParameterDescriptor?)) -> KotlinType): ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <R> -> KotlinType
    <C : MutableCollection<in R>> -> ArrayList<KotlinType>

'argumentsAndReceivers' @ [290:54] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'it' @ [290:79] ==> value-parameter it: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [290:82] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'returnType' @ [291:21] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'descriptorReturnType' @ [291:34] ==> val descriptorReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'defaults' @ [292:21] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'component1' @ [295:26] ==> public final operator fun component1(): Array<KotlinType> defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'component2' @ [295:37] ==> public final operator fun component2(): CoercionStrategy defined in kotlin.Triple[DeserializedSimpleFunctionDescriptor]

'argumentsAndExpectedTypeCoercion' @ [295:49] ==> val argumentsAndExpectedTypeCoercion: Triple<Array<KotlinType>, CoercionStrategy, Int>? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'defaults' @ [296:21] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'argumentsAndExpectedTypeCoercion' @ [296:32] ==> val argumentsAndExpectedTypeCoercion: Triple<Array<KotlinType>, CoercionStrategy, Int>? defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'third' @ [296:65] ==> public final val third: Int defined in kotlin.Triple[DeserializedPropertyDescriptor]

'argumentsAndReceivers' @ [297:21] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'addAll' @ [297:43] ==> public fun <T> MutableCollection<in KotlinType>.addAll(elements: Array<out KotlinType>): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'arguments' @ [297:50] ==> val arguments: Array<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'returnType' @ [299:21] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'if (coercion == CoercionStrategy.COERCION_TO_UNIT) descriptor.builtIns.unitType else descriptorReturnType' @ [299:34] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'coercion' @ [299:38] ==> val coercion: CoercionStrategy defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'COERCION_TO_UNIT' @ [299:67] ==> enum entry COERCION_TO_UNIT defined in org.jetbrains.kotlin.types.expressions.CoercionStrategy[FakeCallableDescriptorForObject]

'descriptor' @ [299:85] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'builtIns' @ [299:96] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'unitType' @ [299:105] ==> public final val KotlinBuiltIns.unitType: SimpleType[MyPropertyDescriptor]

'descriptorReturnType' @ [299:119] ==> val descriptorReturnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'callComponents' @ [302:24] ==> public final val callComponents: KotlinCallComponents defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'reflectionTypes' @ [302:39] ==> public final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.resolve.calls.model.KotlinCallComponents[PropertyDescriptorImpl]

'getKFunctionType' @ [302:55] ==> public final fun getKFunctionType(annotations: Annotations, receiverType: KotlinType?, parameterTypes: List<KotlinType>, parameterNames: List<Name>?, returnType: KotlinType, builtIns: KotlinBuiltIns): SimpleType defined in org.jetbrains.kotlin.builtins.ReflectionTypes[DeserializedSimpleFunctionDescriptor]

'EMPTY' @ [302:84] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[DeserializedPropertyDescriptor]

'argumentsAndReceivers' @ [302:97] ==> val argumentsAndReceivers: ArrayList<KotlinType> /* = ArrayList<KotlinType> */ defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'returnType' @ [303:72] ==> val returnType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'descriptor' @ [303:84] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'builtIns' @ [303:95] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'defaults' @ [303:108] ==> val defaults: Int defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[LocalVariableDescriptor]

'error' @ [305:21] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [305:58] ==> value-parameter descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.buildReflectionType[ValueParameterDescriptorImpl]

'!' @ [310:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isExplicit' @ [310:14] ==> value-parameter isExplicit: Boolean defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'ScopeReceiver' @ [310:50] ==> public constructor ScopeReceiver(receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.ScopeReceiver[ClassConstructorDescriptorImpl]

'receiver' @ [310:64] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'argument' @ [312:25] ==> public final val argument: CallableReferenceKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory[PropertyDescriptorImpl]

'lhsResult' @ [312:34] ==> public abstract val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.model.CallableReferenceKotlinCallArgument[PropertyDescriptorImpl]

'when (lhsResult) {
            is LHSResult.Expression -> CallableReceiver.ExplicitValueReceiver(lhsResult.lshCallArgument, receiver)
            is LHSResult.Type -> {
                if (lhsResult.qualifier.classValueReceiver?.type == receiver.receiverValue.type) {
                    CallableReceiver.BoundValueReference(lhsResult.qualifier, receiver)
                }
                else {
                    CallableReceiver.UnboundReference(lhsResult.qualifier, receiver)
                }
            }
            is LHSResult.Object -> CallableReceiver.BoundValueReference(lhsResult.qualifier, receiver)
            else -> throw IllegalStateException("Unsupported kind of lhsResult: $lhsResult")
        }' @ [313:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: CallableReceiver, entry1: CallableReceiver, entry2: CallableReceiver, entry3: CallableReceiver): CallableReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> CallableReceiver

'lhsResult' @ [313:22] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'ExplicitValueReceiver' @ [314:57] ==> public constructor ExplicitValueReceiver(lhsArgument: SimpleKotlinCallArgument, receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.ExplicitValueReceiver[ClassConstructorDescriptorImpl]

'lhsResult' @ [314:79] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'lshCallArgument' @ [314:89] ==> public final val lshCallArgument: SimpleKotlinCallArgument defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Expression[PropertyDescriptorImpl]

'receiver' @ [314:106] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'if (lhsResult.qualifier.classValueReceiver?.type == receiver.receiverValue.type) {
                    CallableReceiver.BoundValueReference(lhsResult.qualifier, receiver)
                }
                else {
                    CallableReceiver.UnboundReference(lhsResult.qualifier, receiver)
                }' @ [316:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: CallableReceiver, elseBranch: CallableReceiver): CallableReceiver[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> CallableReceiver

'lhsResult' @ [316:21] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'qualifier' @ [316:31] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Type[PropertyDescriptorImpl]

'classValueReceiver' @ [316:41] ==> public abstract val classValueReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.scopes.receivers.QualifierReceiver[PropertyDescriptorImpl]

'type' @ [316:61] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'receiver' @ [316:69] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'receiverValue' @ [316:78] ==> public final val receiverValue: ReceiverValue defined in org.jetbrains.kotlin.resolve.scopes.receivers.ReceiverValueWithSmartCastInfo[PropertyDescriptorImpl]

'type' @ [316:92] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'BoundValueReference' @ [317:38] ==> public constructor BoundValueReference(qualifier: QualifierReceiver, receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.BoundValueReference[ClassConstructorDescriptorImpl]

'lhsResult' @ [317:58] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'qualifier' @ [317:68] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Type[PropertyDescriptorImpl]

'receiver' @ [317:79] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'UnboundReference' @ [320:38] ==> public constructor UnboundReference(qualifier: QualifierReceiver, receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.UnboundReference[ClassConstructorDescriptorImpl]

'lhsResult' @ [320:55] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'qualifier' @ [320:65] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Type[PropertyDescriptorImpl]

'receiver' @ [320:76] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'BoundValueReference' @ [323:53] ==> public constructor BoundValueReference(qualifier: QualifierReceiver, receiver: ReceiverValueWithSmartCastInfo) defined in org.jetbrains.kotlin.resolve.calls.components.CallableReceiver.BoundValueReference[ClassConstructorDescriptorImpl]

'lhsResult' @ [323:73] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'qualifier' @ [323:83] ==> public final val qualifier: QualifierReceiver defined in org.jetbrains.kotlin.resolve.calls.model.LHSResult.Object[PropertyDescriptorImpl]

'receiver' @ [323:94] ==> value-parameter receiver: ReceiverValueWithSmartCastInfo defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[ValueParameterDescriptorImpl]

'IllegalStateException' @ [324:27] ==> public final fun <init>(p0: (String..String?)): IllegalStateException /* = IllegalStateException */ defined in kotlin.IllegalStateException[TypeAliasConstructorDescriptorImpl]

'lhsResult' @ [324:82] ==> val lhsResult: LHSResult defined in org.jetbrains.kotlin.resolve.calls.components.CallableReferencesCandidateFactory.toCallableReceiver[LocalVariableDescriptor]

'expectedType' @ [330:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.getFunctionTypeFromCallableReferenceExpectedType[ValueParameterDescriptorImpl]

'if (expectedType.isFunctionType) {
        expectedType
    }
    else if (ReflectionTypes.isNumberedKFunction(expectedType)) {
        expectedType.immediateSupertypes().first { it.isFunctionType }.unwrap()
    }
    else {
        null
    }' @ [332:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'expectedType' @ [332:16] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.getFunctionTypeFromCallableReferenceExpectedType[ValueParameterDescriptorImpl]

'isFunctionType' @ [332:29] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'expectedType' @ [333:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.getFunctionTypeFromCallableReferenceExpectedType[ValueParameterDescriptorImpl]

'if (ReflectionTypes.isNumberedKFunction(expectedType)) {
        expectedType.immediateSupertypes().first { it.isFunctionType }.unwrap()
    }
    else {
        null
    }' @ [335:10] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: UnwrappedType?, elseBranch: UnwrappedType?): UnwrappedType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> UnwrappedType?

'ReflectionTypes' @ [335:14] ==> public companion object defined in org.jetbrains.kotlin.builtins.ReflectionTypes[FakeCallableDescriptorForObject]

'isNumberedKFunction' @ [335:30] ==> public final fun isNumberedKFunction(type: KotlinType): Boolean defined in org.jetbrains.kotlin.builtins.ReflectionTypes.Companion[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [335:50] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.getFunctionTypeFromCallableReferenceExpectedType[ValueParameterDescriptorImpl]

'expectedType' @ [336:9] ==> value-parameter expectedType: UnwrappedType? defined in org.jetbrains.kotlin.resolve.calls.components.getFunctionTypeFromCallableReferenceExpectedType[ValueParameterDescriptorImpl]

'immediateSupertypes' @ [336:22] ==> public fun KotlinType.immediateSupertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'first' @ [336:44] ==> public inline fun <T> Iterable<KotlinType>.first(predicate: (KotlinType) -> Boolean): KotlinType defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [336:52] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.calls.components.getFunctionTypeFromCallableReferenceExpectedType.<anonymous>[ValueParameterDescriptorImpl]

'isFunctionType' @ [336:55] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'unwrap' @ [336:72] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

