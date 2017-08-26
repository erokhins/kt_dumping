'with' @ [70:15] ==> @InlineOnly public inline fun <T, R> with(receiver: CallCandidateResolutionContext<D>, block: CallCandidateResolutionContext<D>.() -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> CallCandidateResolutionContext<D>
    <R> -> Unit

'context' @ [70:20] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.performResolutionForCandidateCall[ValueParameterDescriptorImpl]

'ProgressIndicatorAndCompilationCanceledStatus' @ [71:9] ==> public object ProgressIndicatorAndCompilationCanceledStatus defined in org.jetbrains.kotlin.progress[FakeCallableDescriptorForObject]

'checkCanceled' @ [71:55] ==> @JvmStatic public final fun checkCanceled(): Unit defined in org.jetbrains.kotlin.progress.ProgressIndicatorAndCompilationCanceledStatus[DeserializedSimpleFunctionDescriptor]

'isError' @ [73:24] ==> public open fun isError(@Nullable p0: DeclarationDescriptor?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'candidateDescriptor' @ [73:32] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'candidateCall' @ [74:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [74:27] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'SUCCESS' @ [74:37] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'!' @ [78:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkOuterClassMemberIsAccessible' @ [78:14] ==> private final fun checkOuterClassMemberIsAccessible(context: CallCandidateResolutionContext<*>): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'this' @ [78:48] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.performResolutionForCandidateCall.<anonymous>[ReceiverParameterDescriptorImpl]

'candidateCall' @ [79:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [79:27] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'OTHER_ERROR' @ [79:37] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'!' @ [83:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [83:14] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.performResolutionForCandidateCall[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [83:22] ==> public final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'checkVisibilityWithoutReceiver' @ [84:13] ==> private final fun CallCandidateResolutionContext<*>.checkVisibilityWithoutReceiver(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'when (checkArguments) {
            CheckArgumentTypesMode.CHECK_VALUE_ARGUMENTS ->
                mapArguments()
            CheckArgumentTypesMode.CHECK_CALLABLE_TYPE ->
                checkExpectedCallableType()
        }' @ [87:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'checkArguments' @ [87:15] ==> value-parameter checkArguments: CheckArgumentTypesMode defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.performResolutionForCandidateCall[ValueParameterDescriptorImpl]

'CHECK_VALUE_ARGUMENTS' @ [88:36] ==> enum entry CHECK_VALUE_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'mapArguments' @ [89:17] ==> private final fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.mapArguments(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'CHECK_CALLABLE_TYPE' @ [90:36] ==> enum entry CHECK_CALLABLE_TYPE defined in org.jetbrains.kotlin.resolve.calls.context.CheckArgumentTypesMode[FakeCallableDescriptorForObject]

'checkExpectedCallableType' @ [91:17] ==> private final fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.checkExpectedCallableType(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'checkReceiverTypeError' @ [94:9] ==> private final fun CallCandidateResolutionContext<*>.checkReceiverTypeError(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'checkExtensionReceiver' @ [95:9] ==> private final fun CallCandidateResolutionContext<*>.checkExtensionReceiver(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'checkDispatchReceiver' @ [96:9] ==> private final fun CallCandidateResolutionContext<*>.checkDispatchReceiver(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'processTypeArguments' @ [98:9] ==> private final fun CallCandidateResolutionContext<*>.processTypeArguments(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'checkValueArguments' @ [99:9] ==> private final fun CallCandidateResolutionContext<*>.checkValueArguments(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'checkAbstractAndSuper' @ [101:9] ==> private final fun CallCandidateResolutionContext<*>.checkAbstractAndSuper(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'checkConstructedExpandedType' @ [102:9] ==> private final fun CallCandidateResolutionContext<*>.checkConstructedExpandedType(): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'checkAndReport' @ [105:75] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.checkAndReport(checker: Nothing.() -> ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'if (call.typeArguments.isEmpty()
            && !candidateDescriptor.typeParameters.isEmpty()
            && candidateCall.knownTypeParametersSubstitutor == null
        ) {
            genericCandidateResolver.inferTypeArguments(this)
        }
        else {
            checkAllValueArguments(this, SHAPE_FUNCTION_ARGUMENTS).status
        }' @ [106:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus, elseBranch: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus

'call' @ [106:13] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'typeArguments' @ [106:18] ==> public final val Call.typeArguments: List<(KtTypeProjection..KtTypeProjection?)>[MyPropertyDescriptor]

'isEmpty' @ [106:32] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [107:16] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'candidateDescriptor' @ [107:17] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'typeParameters' @ [107:37] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [107:52] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'candidateCall' @ [108:16] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'knownTypeParametersSubstitutor' @ [108:30] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.knownTypeParametersSubstitutor: TypeSubstitutor?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'genericCandidateResolver' @ [110:13] ==> private final val genericCandidateResolver: GenericCandidateResolver defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'inferTypeArguments' @ [110:38] ==> public final fun <D : CallableDescriptor> inferTypeArguments(context: CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.GenericCandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'this' @ [110:57] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArguments.<anonymous>[ReceiverParameterDescriptorImpl]

'checkAllValueArguments' @ [113:13] ==> public final fun <D : CallableDescriptor> checkAllValueArguments(context: CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>, resolveFunctionArgumentBodies: ResolveArgumentsMode): CandidateResolver.ValueArgumentsCheckingResult defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'this' @ [113:36] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArguments.<anonymous>[ReceiverParameterDescriptorImpl]

'SHAPE_FUNCTION_ARGUMENTS' @ [113:42] ==> enum entry SHAPE_FUNCTION_ARGUMENTS defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil.ResolveArgumentsMode[FakeCallableDescriptorForObject]

'status' @ [113:68] ==> public final val status: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.ValueArgumentsCheckingResult[PropertyDescriptorImpl]

'check' @ [117:76] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.check(checker: Nothing.() -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'call' @ [118:31] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'typeArguments' @ [118:36] ==> public final val Call.typeArguments: List<(KtTypeProjection..KtTypeProjection?)>[MyPropertyDescriptor]

'if (candidateCall.knownTypeParametersSubstitutor != null) {
            candidateCall.setResultingSubstitutor(candidateCall.knownTypeParametersSubstitutor!!)
        }
        else if (ktTypeArguments.isNotEmpty()) {
            // Explicit type arguments passed

            val typeArguments = ArrayList<KotlinType>()
            for (projection in ktTypeArguments) {
                val type = projection.typeReference?.let { trace.bindingContext.get(BindingContext.TYPE, it) }
                        ?: ErrorUtils.createErrorType("Star projection in a call")
                typeArguments.add(type)
            }

            val expectedTypeArgumentCount = candidateDescriptor.typeParameters.size
            for (index in ktTypeArguments.size..expectedTypeArgumentCount - 1) {
                typeArguments.add(ErrorUtils.createErrorType(
                        "Explicit type argument expected for " + candidateDescriptor.typeParameters[index].name
                ))
            }
            val substitution = FunctionDescriptorUtil.createSubstitution(candidateDescriptor as FunctionDescriptor, typeArguments)
            val substitutor = TypeSubstitutor.create(SubstitutionFilteringInternalResolveAnnotations(substitution))

            if (expectedTypeArgumentCount != ktTypeArguments.size) {
                candidateCall.addStatus(WRONG_NUMBER_OF_TYPE_ARGUMENTS_ERROR)
                tracing.wrongNumberOfTypeArguments(trace, expectedTypeArgumentCount, candidateDescriptor)
            }
            else {
                checkGenericBoundsInAFunctionCall(ktTypeArguments, typeArguments, candidateDescriptor, substitutor, trace)
            }

            candidateCall.setResultingSubstitutor(substitutor)
        }' @ [119:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'candidateCall' @ [119:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'knownTypeParametersSubstitutor' @ [119:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.knownTypeParametersSubstitutor: TypeSubstitutor?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateCall' @ [120:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'setResultingSubstitutor' @ [120:27] ==> public abstract fun setResultingSubstitutor(@NotNull substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'candidateCall' @ [120:51] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'knownTypeParametersSubstitutor' @ [120:65] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.knownTypeParametersSubstitutor: TypeSubstitutor?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'ktTypeArguments' @ [122:18] ==> val ktTypeArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'isNotEmpty' @ [122:34] ==> @InlineOnly public inline fun <T> Collection<(KtTypeProjection..KtTypeProjection?)>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.psi.KtTypeProjection..org.jetbrains.kotlin.psi.KtTypeProjection?)

'ArrayList' @ [125:33] ==> public constructor ArrayList<E : (Any..Any?)>() defined in java.util.ArrayList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'ktTypeArguments' @ [126:32] ==> val ktTypeArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'projection' @ [127:28] ==> val projection: (KtTypeProjection..KtTypeProjection?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'typeReference' @ [127:39] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'let' @ [127:54] ==> @InlineOnly public inline fun <T, R> KtTypeReference.let(block: (KtTypeReference) -> KotlinType?): KotlinType? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtTypeReference
    <R> -> KotlinType?

'trace' @ [127:60] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [127:66] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [127:81] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..ReadOnlySlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?), key: (KtTypeReference..KtTypeReference?)): KotlinType? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtTypeReference
    <V : (Any..Any?)> -> KotlinType

'TYPE' @ [127:100] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [127:106] ==> value-parameter it: KtTypeReference defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'createErrorType' @ [128:39] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'typeArguments' @ [129:17] ==> val typeArguments: ArrayList<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'add' @ [129:31] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'type' @ [129:35] ==> val type: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [132:45] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'typeParameters' @ [132:65] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [132:80] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ktTypeArguments' @ [133:27] ==> val ktTypeArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'size' @ [133:43] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'expectedTypeArgumentCount' @ [133:49] ==> val expectedTypeArgumentCount: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'typeArguments' @ [134:17] ==> val typeArguments: ArrayList<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'add' @ [134:31] ==> public open fun add(element: KotlinType): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'createErrorType' @ [134:46] ==> @NotNull public open fun createErrorType(@NotNull p0: String): SimpleType defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'+' @ [135:25] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'candidateDescriptor' @ [135:66] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'typeParameters' @ [135:86] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'index' @ [135:101] ==> val index: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'name' @ [135:108] ==> public final val TypeParameterDescriptor.name: Name[MyPropertyDescriptor]

'createSubstitution' @ [138:55] ==> public open fun createSubstitution(@NotNull functionDescriptor: FunctionDescriptor, @NotNull typeArguments: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)): (TypeSubstitution..TypeSubstitution?) defined in org.jetbrains.kotlin.resolve.FunctionDescriptorUtil[JavaMethodDescriptor]

'candidateDescriptor' @ [138:74] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'typeArguments' @ [138:117] ==> val typeArguments: ArrayList<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'create' @ [139:47] ==> @NotNull public open fun create(@NotNull p0: TypeSubstitution): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'SubstitutionFilteringInternalResolveAnnotations' @ [139:54] ==> public constructor SubstitutionFilteringInternalResolveAnnotations(substitution: TypeSubstitution) defined in org.jetbrains.kotlin.resolve.calls.inference.SubstitutionFilteringInternalResolveAnnotations[ClassConstructorDescriptorImpl]

'substitution' @ [139:102] ==> val substitution: (TypeSubstitution..TypeSubstitution?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'if (expectedTypeArgumentCount != ktTypeArguments.size) {
                candidateCall.addStatus(WRONG_NUMBER_OF_TYPE_ARGUMENTS_ERROR)
                tracing.wrongNumberOfTypeArguments(trace, expectedTypeArgumentCount, candidateDescriptor)
            }
            else {
                checkGenericBoundsInAFunctionCall(ktTypeArguments, typeArguments, candidateDescriptor, substitutor, trace)
            }' @ [141:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expectedTypeArgumentCount' @ [141:17] ==> val expectedTypeArgumentCount: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'ktTypeArguments' @ [141:46] ==> val ktTypeArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'size' @ [141:62] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'candidateCall' @ [142:17] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [142:31] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'WRONG_NUMBER_OF_TYPE_ARGUMENTS_ERROR' @ [142:41] ==> enum entry WRONG_NUMBER_OF_TYPE_ARGUMENTS_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'tracing' @ [143:17] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'wrongNumberOfTypeArguments' @ [143:25] ==> public abstract fun wrongNumberOfTypeArguments(@NotNull trace: BindingTrace, expectedTypeArgumentCount: Int, @NotNull descriptor: CallableDescriptor): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [143:52] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'expectedTypeArgumentCount' @ [143:59] ==> val expectedTypeArgumentCount: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [143:86] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'checkGenericBoundsInAFunctionCall' @ [146:17] ==> private final fun CallCandidateResolutionContext<*>.checkGenericBoundsInAFunctionCall(ktTypeArguments: List<KtTypeProjection>, typeArguments: List<KotlinType>, functionDescriptor: CallableDescriptor, substitutor: TypeSubstitutor, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'ktTypeArguments' @ [146:51] ==> val ktTypeArguments: List<(KtTypeProjection..KtTypeProjection?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'typeArguments' @ [146:68] ==> val typeArguments: ArrayList<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [146:83] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'substitutor' @ [146:104] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'trace' @ [146:117] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateCall' @ [149:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'setResultingSubstitutor' @ [149:27] ==> public abstract fun setResultingSubstitutor(@NotNull substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'substitutor' @ [149:51] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.processTypeArguments.<anonymous>[LocalVariableDescriptor]

'check' @ [154:15] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.check(checker: CallCandidateResolutionContext<D>.() -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'mapValueArgumentsToParameters' @ [155:78] ==> public open fun <D : (CallableDescriptor..CallableDescriptor?)> mapValueArgumentsToParameters(@NotNull call: Call, @NotNull tracing: TracingStrategy, @NotNull candidateCall: MutableResolvedCall<(D..D?)>): (ValueArgumentsToParametersMapper.Status..ValueArgumentsToParametersMapper.Status?) defined in org.jetbrains.kotlin.resolve.calls.ValueArgumentsToParametersMapper[JavaMethodDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'call' @ [156:25] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'tracing' @ [156:31] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateCall' @ [156:40] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'!' @ [157:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argumentMappingStatus' @ [157:22] ==> val argumentMappingStatus: (ValueArgumentsToParametersMapper.Status..ValueArgumentsToParametersMapper.Status?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.mapArguments.<anonymous>[LocalVariableDescriptor]

'isSuccess' @ [157:44] ==> public final val ValueArgumentsToParametersMapper.Status.isSuccess: Boolean[MyPropertyDescriptor]

'candidateCall' @ [158:21] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [158:35] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'ARGUMENTS_MAPPING_ERROR' @ [158:45] ==> enum entry ARGUMENTS_MAPPING_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'check' @ [163:15] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.check(checker: CallCandidateResolutionContext<D>.() -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'!' @ [164:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [164:22] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [164:37] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'DoubleColonExpressionResolver' @ [165:50] ==> public companion object defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver[FakeCallableDescriptorForObject]

'createKCallableTypeForReference' @ [165:80] ==> public final fun createKCallableTypeForReference(descriptor: CallableDescriptor, lhs: DoubleColonLHS?, reflectionTypes: ReflectionTypes, scopeOwnerDescriptor: DeclarationDescriptor): KotlinType? defined in org.jetbrains.kotlin.types.expressions.DoubleColonExpressionResolver.Companion[SimpleFunctionDescriptorImpl]

'candidateCall' @ [166:29] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateDescriptor' @ [166:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.candidateDescriptor: (D..D?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'call' @ [167:30] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'callElement' @ [167:35] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'parent' @ [167:47] ==> public final val KtElement.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'receiverExpression' @ [167:90] ==> public final val receiverExpression: KtExpression? defined in org.jetbrains.kotlin.psi.KtCallableReferenceExpression[PropertyDescriptorImpl]

'let' @ [167:110] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> DoubleColonLHS?): DoubleColonLHS? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> DoubleColonLHS?

'trace' @ [168:33] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [168:39] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'get' @ [168:54] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..ReadOnlySlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?), key: (KtExpression..KtExpression?)): DoubleColonLHS? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression
    <V : (Any..Any?)> -> DoubleColonLHS

'DOUBLE_COLON_LHS' @ [168:73] ==> public final val DOUBLE_COLON_LHS: (WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>..WritableSlice<(KtExpression..KtExpression?), (DoubleColonLHS..DoubleColonLHS?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [168:91] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExpectedCallableType.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'reflectionTypes' @ [170:29] ==> private final val reflectionTypes: ReflectionTypes defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'scope' @ [170:46] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [170:52] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'candidateKCallableType' @ [172:25] ==> val candidateKCallableType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExpectedCallableType.<anonymous>[LocalVariableDescriptor]

'!' @ [173:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeSubtype' @ [173:26] ==> private final fun canBeSubtype(subType: KotlinType, superType: KotlinType, candidateTypeParameters: List<TypeParameterDescriptor>): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'candidateKCallableType' @ [173:39] ==> val candidateKCallableType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExpectedCallableType.<anonymous>[LocalVariableDescriptor]

'expectedType' @ [173:63] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateCall' @ [173:77] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateDescriptor' @ [173:91] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.candidateDescriptor: (D..D?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'typeParameters' @ [173:111] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'candidateCall' @ [174:25] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [174:39] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'OTHER_ERROR' @ [174:49] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'makeConstantSubstitutor' @ [185:34] ==> public fun makeConstantSubstitutor(typeParameterDescriptors: Collection<TypeParameterDescriptor>, type: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls[SimpleFunctionDescriptorImpl]

'candidateTypeParameters' @ [185:58] ==> value-parameter candidateTypeParameters: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.canBeSubtype[ValueParameterDescriptorImpl]

'DONT_CARE' @ [185:93] ==> public final val DONT_CARE: (SimpleType..SimpleType?) defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'substituteDontCare' @ [186:34] ==> val substituteDontCare: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.canBeSubtype[LocalVariableDescriptor]

'substitute' @ [186:53] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'subType' @ [186:64] ==> value-parameter subType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.canBeSubtype[ValueParameterDescriptorImpl]

'INVARIANT' @ [186:82] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'ErrorTypesAreEqualToAnything' @ [187:16] ==> public object ErrorTypesAreEqualToAnything : KotlinTypeChecker defined in org.jetbrains.kotlin.types.checker[FakeCallableDescriptorForObject]

'isSubtypeOf' @ [187:45] ==> public open fun isSubtypeOf(subtype: KotlinType, supertype: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.ErrorTypesAreEqualToAnything[DeserializedSimpleFunctionDescriptor]

'subTypeSubstituted' @ [187:57] ==> val subTypeSubstituted: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.canBeSubtype[LocalVariableDescriptor]

'superType' @ [187:77] ==> value-parameter superType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.canBeSubtype[ValueParameterDescriptorImpl]

'checkAndReport' @ [190:86] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.checkAndReport(checker: Nothing.() -> ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'checkVisibilityWithDispatchReceiver' @ [191:9] ==> private final fun CallCandidateResolutionContext<*>.checkVisibilityWithDispatchReceiver(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'ALWAYS_SUITABLE_RECEIVER' @ [191:58] ==> public final val ALWAYS_SUITABLE_RECEIVER: (ReceiverValue..ReceiverValue?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'findInvisibleMember' @ [198:44] ==> @Nullable public open fun findInvisibleMember(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'getReceiverValueWithSmartCast' @ [199:17] ==> public fun getReceiverValueWithSmartCast(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts[DeserializedSimpleFunctionDescriptor]

'receiverArgument' @ [199:47] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkVisibilityWithDispatchReceiver[ValueParameterDescriptorImpl]

'smartCastType' @ [199:65] ==> value-parameter smartCastType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkVisibilityWithDispatchReceiver[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [199:81] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'scope' @ [199:102] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [199:108] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'if (invisibleMember != null) {
            tracing.invisibleMember(trace, invisibleMember)
            INVISIBLE_MEMBER_ERROR
        } else {
            SUCCESS
        }' @ [200:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus, elseBranch: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus

'invisibleMember' @ [200:20] ==> val invisibleMember: DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkVisibilityWithDispatchReceiver[LocalVariableDescriptor]

'tracing' @ [201:13] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'invisibleMember' @ [201:21] ==> public abstract fun invisibleMember(@NotNull trace: BindingTrace, @NotNull descriptor: DeclarationDescriptorWithVisibility): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [201:37] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'invisibleMember' @ [201:44] ==> val invisibleMember: DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkVisibilityWithDispatchReceiver[LocalVariableDescriptor]

'INVISIBLE_MEMBER_ERROR' @ [202:13] ==> enum entry INVISIBLE_MEMBER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'SUCCESS' @ [204:13] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'!' @ [212:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isDispatchReceiver' @ [212:10] ==> value-parameter isDispatchReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.isCandidateVisibleOrExtensionReceiver[ValueParameterDescriptorImpl]

'isCandidateVisible' @ [212:32] ==> private final fun CallCandidateResolutionContext<*>.isCandidateVisible(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [212:51] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.isCandidateVisibleOrExtensionReceiver[ValueParameterDescriptorImpl]

'smartCastType' @ [212:69] ==> value-parameter smartCastType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.isCandidateVisibleOrExtensionReceiver[ValueParameterDescriptorImpl]

'==' @ [217:9] ==> public open fun equals(other: Any?): Boolean defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptorWithVisibility[DeserializedSimpleFunctionDescriptor]

'findInvisibleMember' @ [217:22] ==> @Nullable public open fun findInvisibleMember(@Nullable p0: ReceiverValue?, @NotNull p1: DeclarationDescriptorWithVisibility, @NotNull p2: DeclarationDescriptor): DeclarationDescriptorWithVisibility? defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaMethodDescriptor]

'getReceiverValueWithSmartCast' @ [218:13] ==> public fun getReceiverValueWithSmartCast(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts[DeserializedSimpleFunctionDescriptor]

'receiverArgument' @ [218:43] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.isCandidateVisible[ValueParameterDescriptorImpl]

'smartCastType' @ [218:61] ==> value-parameter smartCastType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.isCandidateVisible[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [219:13] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'scope' @ [219:34] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'ownerDescriptor' @ [219:40] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'checkAndReport' @ [222:78] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.checkAndReport(checker: Nothing.() -> ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateCall' @ [223:33] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateDescriptor' @ [223:47] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'extensionReceiverParameter' @ [223:67] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'candidateCall' @ [224:32] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'extensionReceiver' @ [224:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'if (receiverParameter != null && receiverArgument == null) {
            tracing.missingReceiver(candidateCall.trace, receiverParameter)
            OTHER_ERROR
        }
        else if (receiverParameter == null && receiverArgument != null) {
            tracing.noReceiverAllowed(candidateCall.trace)
            if (call.calleeExpression is KtSimpleNameExpression) {
                RECEIVER_PRESENCE_ERROR
            }
            else {
                OTHER_ERROR
            }
        }
        else {
            SUCCESS
        }' @ [225:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus, elseBranch: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus

'receiverParameter' @ [225:13] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExtensionReceiver.<anonymous>[LocalVariableDescriptor]

'receiverArgument' @ [225:42] ==> val receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExtensionReceiver.<anonymous>[LocalVariableDescriptor]

'tracing' @ [226:13] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'missingReceiver' @ [226:21] ==> public abstract fun missingReceiver(@NotNull trace: BindingTrace, @NotNull expectedReceiver: ReceiverParameterDescriptor): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'candidateCall' @ [226:37] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'trace' @ [226:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'receiverParameter' @ [226:58] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExtensionReceiver.<anonymous>[LocalVariableDescriptor]

'OTHER_ERROR' @ [227:13] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'if (receiverParameter == null && receiverArgument != null) {
            tracing.noReceiverAllowed(candidateCall.trace)
            if (call.calleeExpression is KtSimpleNameExpression) {
                RECEIVER_PRESENCE_ERROR
            }
            else {
                OTHER_ERROR
            }
        }
        else {
            SUCCESS
        }' @ [229:14] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus, elseBranch: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus

'receiverParameter' @ [229:18] ==> val receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExtensionReceiver.<anonymous>[LocalVariableDescriptor]

'receiverArgument' @ [229:47] ==> val receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkExtensionReceiver.<anonymous>[LocalVariableDescriptor]

'tracing' @ [230:13] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'noReceiverAllowed' @ [230:21] ==> public abstract fun noReceiverAllowed(@NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'candidateCall' @ [230:39] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'trace' @ [230:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.trace: DelegatingBindingTrace[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'if (call.calleeExpression is KtSimpleNameExpression) {
                RECEIVER_PRESENCE_ERROR
            }
            else {
                OTHER_ERROR
            }' @ [231:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus, elseBranch: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus

'call' @ [231:17] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'calleeExpression' @ [231:22] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'RECEIVER_PRESENCE_ERROR' @ [232:17] ==> enum entry RECEIVER_PRESENCE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'OTHER_ERROR' @ [235:17] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'SUCCESS' @ [239:13] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'checkAndReport' @ [243:77] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.checkAndReport(checker: Nothing.() -> ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateDescriptor' @ [244:35] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'candidateCall' @ [245:32] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'dispatchReceiver' @ [245:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'dispatchReceiver' @ [246:13] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'if (candidateDescriptor is ClassConstructorDescriptor
                && DescriptorUtils.isStaticNestedClass(candidateDescriptor.containingDeclaration)
            ) {
                nestedClass = candidateDescriptor.containingDeclaration
            }
            else if (candidateDescriptor is FakeCallableDescriptorForObject) {
                nestedClass = candidateDescriptor.getReferencedObject()
            }' @ [248:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'candidateDescriptor' @ [248:17] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'isStaticNestedClass' @ [249:36] ==> public open fun isStaticNestedClass(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'candidateDescriptor' @ [249:56] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [249:76] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'nestedClass' @ [251:17] ==> var nestedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [251:31] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'containingDeclaration' @ [251:51] ==> public final val ClassConstructorDescriptor.containingDeclaration: ClassDescriptor[MyPropertyDescriptor]

'candidateDescriptor' @ [253:22] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'nestedClass' @ [254:17] ==> var nestedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'candidateDescriptor' @ [254:31] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'getReferencedObject' @ [254:51] ==> public final fun getReferencedObject(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForObject[DeserializedSimpleFunctionDescriptor]

'nestedClass' @ [256:17] ==> var nestedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'tracing' @ [257:17] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'nestedClassAccessViaInstanceReference' @ [257:25] ==> public abstract fun nestedClassAccessViaInstanceReference(@NotNull trace: BindingTrace, @NotNull classDescriptor: ClassDescriptor, @NotNull explicitReceiverKind: ExplicitReceiverKind): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [257:63] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'nestedClass' @ [257:70] ==> var nestedClass: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'candidateCall' @ [257:83] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'explicitReceiverKind' @ [257:97] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'OTHER_ERROR' @ [258:39] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'assert' @ [262:9] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'==' @ [262:16] ==> public open fun equals(other: Any?): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [262:17] ==> val dispatchReceiver: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'candidateCall' @ [262:47] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'resultingDescriptor' @ [262:61] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'dispatchReceiverParameter' @ [262:81] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'candidateDescriptor' @ [263:60] ==> val candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkDispatchReceiver.<anonymous>[LocalVariableDescriptor]

'SUCCESS' @ [266:9] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'?:' @ [271:40] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Boolean?, right: Boolean): Boolean[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Boolean

'containingFile' @ [271:41] ==> public final val KtElement.containingFile: (PsiFile..PsiFile?)[MyPropertyDescriptor]

'isScript' @ [271:69] ==> public final val KtFile.isScript: Boolean[MyPropertyDescriptor]

'!' @ [275:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [275:14] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'call' @ [275:22] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'callElement' @ [275:27] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'insideScript' @ [275:39] ==> local final fun KtElement.insideScript(): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[SimpleFunctionDescriptorImpl]

'context' @ [278:13] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'call' @ [278:21] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'explicitReceiver' @ [278:26] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'context' @ [278:54] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'call' @ [278:62] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'dispatchReceiver' @ [278:67] ==> public final val Call.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]

'getDeclaringClass' @ [280:29] ==> private final fun getDeclaringClass(candidate: CallableDescriptor): ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'context' @ [280:47] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'candidateCall' @ [280:55] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateDescriptor' @ [280:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateThis' @ [281:13] ==> val candidateThis: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[LocalVariableDescriptor]

'candidateThis' @ [281:38] ==> val candidateThis: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[LocalVariableDescriptor]

'kind' @ [281:52] ==> public final val ClassDescriptor.kind: ClassKind[MyPropertyDescriptor]

'isSingleton' @ [281:57] ==> public final val ClassKind.isSingleton: Boolean[MyPropertyDescriptor]

'checkHasOuterClassInstance' @ [283:35] ==> public open fun checkHasOuterClassInstance(@NotNull scope: LexicalScope, @NotNull trace: BindingTrace, @NotNull reportErrorsOn: PsiElement, @NotNull target: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'context' @ [283:62] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'scope' @ [283:70] ==> @NotNull public final val scope: LexicalScope defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'context' @ [283:77] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'trace' @ [283:85] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'context' @ [283:92] ==> value-parameter context: CallCandidateResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[ValueParameterDescriptorImpl]

'call' @ [283:100] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'callElement' @ [283:105] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'candidateThis' @ [283:118] ==> val candidateThis: ClassDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkOuterClassMemberIsAccessible[LocalVariableDescriptor]

'check' @ [286:77] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.check(checker: Nothing.() -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateDescriptor' @ [287:26] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'candidateCall' @ [288:26] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'call' @ [288:40] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'calleeExpression' @ [288:45] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'expression' @ [290:13] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [292:17] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [293:32] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'constructedClass' @ [293:43] ==> public final val ConstructorDescriptor.constructedClass: ClassDescriptor[MyPropertyDescriptor]

'modality' @ [293:60] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'modality' @ [294:21] ==> val modality: Modality defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'Modality' @ [294:33] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [294:42] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'tracing' @ [295:21] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'instantiationOfAbstractClass' @ [295:29] ==> public abstract fun instantiationOfAbstractClass(@NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [295:58] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'getReceiverSuper' @ [300:37] ==> private final fun getReceiverSuper(receiver: Receiver?): KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'candidateCall' @ [300:54] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'dispatchReceiver' @ [300:68] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'superDispatchReceiver' @ [301:13] ==> val superDispatchReceiver: KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [302:17] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [302:51] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'modality' @ [302:62] ==> public final val MemberDescriptor.modality: Modality[MyPropertyDescriptor]

'Modality' @ [302:74] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [302:83] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'tracing' @ [303:17] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'abstractSuperCall' @ [303:25] ==> public abstract fun abstractSuperCall(@NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [303:43] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateCall' @ [304:17] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [304:31] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'OTHER_ERROR' @ [304:41] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'getReceiverSuper' @ [310:38] ==> private final fun getReceiverSuper(receiver: Receiver?): KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'candidateCall' @ [310:55] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'extensionReceiver' @ [310:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'superExtensionReceiver' @ [311:13] ==> val superExtensionReceiver: KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'trace' @ [312:13] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'report' @ [312:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SUPER_CANT_BE_EXTENSION_RECEIVER' @ [312:26] ==> public final val SUPER_CANT_BE_EXTENSION_RECEIVER: (DiagnosticFactory1<(KtSuperExpression..KtSuperExpression?), (String..String?)>..DiagnosticFactory1<(KtSuperExpression..KtSuperExpression?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [312:59] ==> @NotNull public open fun on(@NotNull element: KtSuperExpression, @NotNull argument: String): ParametrizedDiagnostic<(KtSuperExpression..KtSuperExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'superExtensionReceiver' @ [312:62] ==> val superExtensionReceiver: KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'superExtensionReceiver' @ [312:86] ==> val superExtensionReceiver: KtSuperExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAbstractAndSuper.<anonymous>[LocalVariableDescriptor]

'text' @ [312:109] ==> public final val KtSuperExpression.text: (String..String?)[MyPropertyDescriptor]

'candidateCall' @ [313:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [313:27] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'OTHER_ERROR' @ [313:37] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'check' @ [317:84] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.check(checker: Nothing.() -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateDescriptor' @ [318:26] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'descriptor' @ [320:13] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkConstructedExpandedType.<anonymous>[LocalVariableDescriptor]

'descriptor' @ [321:17] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkConstructedExpandedType.<anonymous>[LocalVariableDescriptor]

'returnType' @ [321:28] ==> public final val TypeAliasConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'containsTypeProjectionsInTopLevelArguments' @ [321:39] ==> public fun KotlinType.containsTypeProjectionsInTopLevelArguments(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'trace' @ [322:17] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'report' @ [322:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'EXPANDED_TYPE_CANNOT_BE_CONSTRUCTED' @ [322:30] ==> public final val EXPANDED_TYPE_CANNOT_BE_CONSTRUCTED: (DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [322:66] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'call' @ [322:69] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'callElement' @ [322:74] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'descriptor' @ [322:87] ==> val descriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkConstructedExpandedType.<anonymous>[LocalVariableDescriptor]

'returnType' @ [322:98] ==> public final val TypeAliasConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'candidateCall' @ [323:17] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [323:31] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'OTHER_ERROR' @ [323:41] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'receiver' @ [329:13] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getReceiverSuper[ValueParameterDescriptorImpl]

'receiver' @ [330:30] ==> value-parameter receiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getReceiverSuper[ValueParameterDescriptorImpl]

'expression' @ [330:39] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'expression' @ [331:17] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getReceiverSuper[LocalVariableDescriptor]

'expression' @ [332:24] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getReceiverSuper[LocalVariableDescriptor]

'candidate' @ [339:28] ==> value-parameter candidate: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getDeclaringClass[ValueParameterDescriptorImpl]

'dispatchReceiverParameter' @ [339:38] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'expectedThis' @ [340:26] ==> val expectedThis: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getDeclaringClass[LocalVariableDescriptor]

'containingDeclaration' @ [340:39] ==> public final val ReceiverParameterDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'if (descriptor is ClassDescriptor) descriptor else null' @ [341:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ClassDescriptor?, elseBranch: ClassDescriptor?): ClassDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ClassDescriptor?

'descriptor' @ [341:20] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getDeclaringClass[LocalVariableDescriptor]

'descriptor' @ [341:51] ==> val descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.getDeclaringClass[LocalVariableDescriptor]

'checkValueArgumentTypes' @ [347:30] ==> private final fun <D : CallableDescriptor, C : CallResolutionContext<(CallCandidateResolutionContext<(D..D?)>..CallCandidateResolutionContext<(D..D?)>?)>> checkValueArgumentTypes(context: CallResolutionContext<(CallCandidateResolutionContext<(D..D?)>..CallCandidateResolutionContext<(D..D?)>?)>, candidateCall: MutableResolvedCall<(D..D?)>, resolveFunctionArgumentBodies: ResolveArgumentsMode): CandidateResolver.ValueArgumentsCheckingResult defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (D..D?)
    <C : CallResolutionContext<C>> -> (org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext<(D..D?)>..org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext<(D..D?)>?)

'context' @ [347:54] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[ValueParameterDescriptorImpl]

'context' @ [347:63] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[ValueParameterDescriptorImpl]

'candidateCall' @ [347:71] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'resolveFunctionArgumentBodies' @ [347:86] ==> value-parameter resolveFunctionArgumentBodies: ResolveArgumentsMode defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[ValueParameterDescriptorImpl]

'checkingResult' @ [348:28] ==> val checkingResult: CandidateResolver.ValueArgumentsCheckingResult defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[LocalVariableDescriptor]

'status' @ [348:43] ==> public final val status: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.ValueArgumentsCheckingResult[PropertyDescriptorImpl]

'resultStatus' @ [349:9] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[LocalVariableDescriptor]

'resultStatus' @ [349:24] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[LocalVariableDescriptor]

'combine' @ [349:37] ==> @NotNull public open fun combine(other: (ResolutionStatus..ResolutionStatus?)): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'checkReceivers' @ [349:45] ==> private final fun <D : CallableDescriptor> checkReceivers(context: CallCandidateResolutionContext<D>): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'context' @ [349:60] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[ValueParameterDescriptorImpl]

'ValueArgumentsCheckingResult' @ [351:16] ==> public constructor ValueArgumentsCheckingResult(status: ResolutionStatus, argumentTypes: List<KotlinType>) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.ValueArgumentsCheckingResult[ClassConstructorDescriptorImpl]

'resultStatus' @ [351:45] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[LocalVariableDescriptor]

'checkingResult' @ [351:59] ==> val checkingResult: CandidateResolver.ValueArgumentsCheckingResult defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkAllValueArguments[LocalVariableDescriptor]

'argumentTypes' @ [351:74] ==> public final val argumentTypes: List<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.ValueArgumentsCheckingResult[PropertyDescriptorImpl]

'SUCCESS' @ [359:28] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'newArrayList' @ [360:35] ==> @GwtCompatible public open fun <E : (Any..Any?)> newArrayList(): (ArrayList<(KotlinType..KotlinType?)>..ArrayList<(KotlinType..KotlinType?)>?) defined in com.google.common.collect.Lists[JavaMethodDescriptor]
Inferred types:
    <E : (Any..Any?)> -> KotlinType

'candidateCall' @ [361:32] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'dataFlowInfoForArguments' @ [361:46] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.dataFlowInfoForArguments: MutableDataFlowInfoForArguments[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'component1' @ [362:15] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component1(): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'component2' @ [362:36] ==> @InlineOnly public operator inline fun <K, V> Map.Entry<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>.component2(): (ResolvedValueArgument..ResolvedValueArgument?) defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)
    <V> -> (org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument..org.jetbrains.kotlin.resolve.calls.model.ResolvedValueArgument?)

'candidateCall' @ [362:57] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'valueArguments' @ [362:71] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'resolvedArgument' @ [363:30] ==> val resolvedArgument: (ResolvedValueArgument..ResolvedValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'arguments' @ [363:47] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'argument' @ [364:34] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'getArgumentExpression' @ [364:43] ==> @IfNotParsed public abstract fun getArgumentExpression(): KtExpression? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'getEffectiveExpectedType' @ [366:36] ==> public fun getEffectiveExpectedType(parameterDescriptor: ValueParameterDescriptor, argument: ValueArgument): KotlinType defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'parameterDescriptor' @ [366:61] ==> val parameterDescriptor: (ValueParameterDescriptor..ValueParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'argument' @ [366:82] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'context' @ [368:34] ==> value-parameter context: CallResolutionContext<C> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'replaceDataFlowInfo' @ [368:42] ==> @NotNull public open fun replaceDataFlowInfo(@NotNull newDataFlowInfo: DataFlowInfo): C defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaMethodDescriptor]

'infoForArguments' @ [368:62] ==> val infoForArguments: MutableDataFlowInfoForArguments defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'getInfo' @ [368:79] ==> @NotNull public abstract fun getInfo(@NotNull valueArgument: ValueArgument): DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.model.MutableDataFlowInfoForArguments[JavaMethodDescriptor]

'argument' @ [368:87] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'replaceExpectedType' @ [368:98] ==> @NotNull public open fun replaceExpectedType(@Nullable newExpectedType: KotlinType?): C defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaMethodDescriptor]

'expectedType' @ [368:118] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'argumentTypeResolver' @ [369:39] ==> private final val argumentTypeResolver: ArgumentTypeResolver defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'getArgumentTypeInfo' @ [369:60] ==> @NotNull public open fun getArgumentTypeInfo(@Nullable expression: KtExpression?, @NotNull context: CallResolutionContext<*>, @NotNull resolveArgumentsMode: ResolveArgumentsMode): KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'expression' @ [369:80] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'newContext' @ [369:92] ==> val newContext: C defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'resolveFunctionArgumentBodies' @ [369:104] ==> value-parameter resolveFunctionArgumentBodies: ResolveArgumentsMode defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'typeInfoForCall' @ [370:28] ==> val typeInfoForCall: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'type' @ [370:44] ==> public final val type: KotlinType? defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'infoForArguments' @ [371:17] ==> val infoForArguments: MutableDataFlowInfoForArguments defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'updateInfo' @ [371:34] ==> public abstract fun updateInfo(@NotNull valueArgument: ValueArgument, @NotNull dataFlowInfo: DataFlowInfo): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableDataFlowInfoForArguments[JavaMethodDescriptor]

'argument' @ [371:45] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'typeInfoForCall' @ [371:55] ==> val typeInfoForCall: KotlinTypeInfo defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'dataFlowInfo' @ [371:71] ==> public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.types.expressions.KotlinTypeInfo[PropertyDescriptorImpl]

'SUCCESS' @ [373:55] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[FakeCallableDescriptorForObject]

'type' @ [374:50] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'if (type == null || (type.isError && !type.isFunctionPlaceholder)) {
                    matchStatus = ArgumentMatchStatus.ARGUMENT_HAS_NO_TYPE
                }
                else if (!noExpectedType(expectedType)) {
                    if (!ArgumentTypeResolver.isSubtypeOfForArgumentType(type, expectedType)) {
                        val smartCast = smartCastValueArgumentTypeIfPossible(expression, newContext.expectedType, type, newContext)
                        if (smartCast == null) {
                            resultStatus = tryNotNullableArgument(type, expectedType) ?: OTHER_ERROR
                            matchStatus = ArgumentMatchStatus.TYPE_MISMATCH
                        }
                        else {
                            resultingType = smartCast
                        }
                    }
                    else if (ErrorUtils.containsUninferredParameter(expectedType)) {
                        matchStatus = ArgumentMatchStatus.MATCH_MODULO_UNINFERRED_TYPES
                    }

                    val spreadElement = argument.getSpreadElement()
                    if (spreadElement != null && !type.isFlexible() && type.isMarkedNullable) {
                        val dataFlowValue = DataFlowValueFactory.createDataFlowValue(expression, type, context)
                        val smartCastResult = SmartCastManager.checkAndRecordPossibleCast(dataFlowValue, expectedType, expression, context,
                                                                                          call = null, recordExpressionType = false)
                        if (smartCastResult == null || !smartCastResult.isCorrect) {
                            context.trace.report(Errors.SPREAD_OF_NULLABLE.on(spreadElement))
                        }
                    }
                }' @ [375:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'type' @ [375:21] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'type' @ [375:38] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'isError' @ [375:43] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'!' @ [375:54] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [375:55] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'isFunctionPlaceholder' @ [375:60] ==> public val KotlinType?.isFunctionPlaceholder: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'matchStatus' @ [376:21] ==> var matchStatus: ArgumentMatchStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'ARGUMENT_HAS_NO_TYPE' @ [376:55] ==> enum entry ARGUMENT_HAS_NO_TYPE defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[FakeCallableDescriptorForObject]

'!' @ [378:26] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'noExpectedType' @ [378:27] ==> public open fun noExpectedType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [378:42] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'if (!ArgumentTypeResolver.isSubtypeOfForArgumentType(type, expectedType)) {
                        val smartCast = smartCastValueArgumentTypeIfPossible(expression, newContext.expectedType, type, newContext)
                        if (smartCast == null) {
                            resultStatus = tryNotNullableArgument(type, expectedType) ?: OTHER_ERROR
                            matchStatus = ArgumentMatchStatus.TYPE_MISMATCH
                        }
                        else {
                            resultingType = smartCast
                        }
                    }
                    else if (ErrorUtils.containsUninferredParameter(expectedType)) {
                        matchStatus = ArgumentMatchStatus.MATCH_MODULO_UNINFERRED_TYPES
                    }' @ [379:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'!' @ [379:25] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubtypeOfForArgumentType' @ [379:47] ==> public open fun isSubtypeOfForArgumentType(@NotNull actualType: KotlinType, @NotNull expectedType: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'type' @ [379:74] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'expectedType' @ [379:80] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'smartCastValueArgumentTypeIfPossible' @ [380:41] ==> private final fun smartCastValueArgumentTypeIfPossible(expression: KtExpression, expectedType: KotlinType, actualType: KotlinType, context: ResolutionContext<*>): KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'expression' @ [380:78] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'newContext' @ [380:90] ==> val newContext: C defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'expectedType' @ [380:101] ==> @NotNull public final val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'type' @ [380:115] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'newContext' @ [380:121] ==> val newContext: C defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'if (smartCast == null) {
                            resultStatus = tryNotNullableArgument(type, expectedType) ?: OTHER_ERROR
                            matchStatus = ArgumentMatchStatus.TYPE_MISMATCH
                        }
                        else {
                            resultingType = smartCast
                        }' @ [381:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'smartCast' @ [381:29] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'resultStatus' @ [382:29] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'tryNotNullableArgument' @ [382:44] ==> private final fun tryNotNullableArgument(argumentType: KotlinType, parameterType: KotlinType): ResolutionStatus? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'type' @ [382:67] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'expectedType' @ [382:73] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'OTHER_ERROR' @ [382:90] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'matchStatus' @ [383:29] ==> var matchStatus: ArgumentMatchStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'TYPE_MISMATCH' @ [383:63] ==> enum entry TYPE_MISMATCH defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[FakeCallableDescriptorForObject]

'resultingType' @ [386:29] ==> var resultingType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'smartCast' @ [386:45] ==> val smartCast: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'containsUninferredParameter' @ [389:41] ==> public open fun containsUninferredParameter(@Nullable p0: KotlinType?): Boolean defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'expectedType' @ [389:69] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'matchStatus' @ [390:25] ==> var matchStatus: ArgumentMatchStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'MATCH_MODULO_UNINFERRED_TYPES' @ [390:59] ==> enum entry MATCH_MODULO_UNINFERRED_TYPES defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatchStatus[FakeCallableDescriptorForObject]

'argument' @ [393:41] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'getSpreadElement' @ [393:50] ==> public abstract fun getSpreadElement(): LeafPsiElement? defined in org.jetbrains.kotlin.psi.ValueArgument[SimpleFunctionDescriptorImpl]

'spreadElement' @ [394:25] ==> val spreadElement: LeafPsiElement? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'!' @ [394:50] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'type' @ [394:51] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'isFlexible' @ [394:56] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [394:72] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'isMarkedNullable' @ [394:77] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'DataFlowValueFactory' @ [395:45] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [395:66] ==> @JvmStatic public final fun createDataFlowValue(expression: KtExpression, type: KotlinType, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'expression' @ [395:86] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'type' @ [395:98] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'context' @ [395:104] ==> value-parameter context: CallResolutionContext<C> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'SmartCastManager' @ [396:47] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[FakeCallableDescriptorForObject]

'checkAndRecordPossibleCast' @ [396:64] ==> public final fun checkAndRecordPossibleCast(dataFlowValue: DataFlowValue, expectedType: KotlinType, expression: KtExpression?, c: ResolutionContext<*>, call: Call?, recordExpressionType: Boolean): SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager.Companion[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [396:91] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'expectedType' @ [396:106] ==> val expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'expression' @ [396:120] ==> val expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'context' @ [396:132] ==> value-parameter context: CallResolutionContext<C> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'smartCastResult' @ [398:29] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'!' @ [398:56] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'smartCastResult' @ [398:57] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'isCorrect' @ [398:73] ==> public final val isCorrect: Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'context' @ [399:29] ==> value-parameter context: CallResolutionContext<C> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'trace' @ [399:37] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'report' @ [399:43] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SPREAD_OF_NULLABLE' @ [399:57] ==> public final val SPREAD_OF_NULLABLE: (DiagnosticFactory0<(LeafPsiElement..LeafPsiElement?)>..DiagnosticFactory0<(LeafPsiElement..LeafPsiElement?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [399:76] ==> @NotNull public open fun on(@NotNull element: LeafPsiElement): SimpleDiagnostic<(LeafPsiElement..LeafPsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory0[JavaMethodDescriptor]

'spreadElement' @ [399:79] ==> val spreadElement: LeafPsiElement? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'argumentTypes' @ [403:17] ==> val argumentTypes: (ArrayList<(KotlinType..KotlinType?)>..ArrayList<(KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'add' @ [403:31] ==> public open fun add(element: (KotlinType..KotlinType?)): Boolean defined in java.util.ArrayList[JavaMethodDescriptor]

'resultingType' @ [403:35] ==> var resultingType: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'candidateCall' @ [404:17] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[ValueParameterDescriptorImpl]

'recordArgumentMatchStatus' @ [404:31] ==> public abstract fun recordArgumentMatchStatus(@NotNull valueArgument: ValueArgument, @NotNull matchStatus: ArgumentMatchStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'argument' @ [404:57] ==> val argument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'matchStatus' @ [404:67] ==> var matchStatus: ArgumentMatchStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'ValueArgumentsCheckingResult' @ [407:16] ==> public constructor ValueArgumentsCheckingResult(status: ResolutionStatus, argumentTypes: List<KotlinType>) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.ValueArgumentsCheckingResult[ClassConstructorDescriptorImpl]

'resultStatus' @ [407:45] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'argumentTypes' @ [407:59] ==> val argumentTypes: (ArrayList<(KotlinType..KotlinType?)>..ArrayList<(KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkValueArgumentTypes[LocalVariableDescriptor]

'ExpressionReceiver' @ [416:30] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [416:49] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[SimpleFunctionDescriptorImpl]

'safeDeparenthesize' @ [416:66] ==> @NotNull public open fun safeDeparenthesize(@NotNull expression: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'expression' @ [416:85] ==> value-parameter expression: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[ValueParameterDescriptorImpl]

'actualType' @ [416:98] ==> value-parameter actualType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[ValueParameterDescriptorImpl]

'context' @ [416:110] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[ValueParameterDescriptorImpl]

'trace' @ [416:118] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [416:124] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'smartCastManager' @ [417:24] ==> private final val smartCastManager: SmartCastManager defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'getSmartCastVariantsExcludingReceiver' @ [417:41] ==> public final fun getSmartCastVariantsExcludingReceiver(context: ResolutionContext<*>, receiverToCast: ReceiverValue): Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[SimpleFunctionDescriptorImpl]

'context' @ [417:79] ==> value-parameter context: ResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[ValueParameterDescriptorImpl]

'receiverToCast' @ [417:88] ==> val receiverToCast: ExpressionReceiver defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[LocalVariableDescriptor]

'variants' @ [418:16] ==> val variants: Collection<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[LocalVariableDescriptor]

'firstOrNull' @ [418:25] ==> public inline fun <T> Iterable<KotlinType>.firstOrNull(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'DEFAULT' @ [419:31] ==> public final val DEFAULT: (KotlinTypeChecker..KotlinTypeChecker?) defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaPropertyDescriptor]

'isSubtypeOf' @ [419:39] ==> public abstract fun isSubtypeOf(@NotNull p0: KotlinType, @NotNull p1: KotlinType): Boolean defined in org.jetbrains.kotlin.types.checker.KotlinTypeChecker[JavaMethodDescriptor]

'possibleType' @ [419:51] ==> value-parameter possibleType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible.<anonymous>[ValueParameterDescriptorImpl]

'expectedType' @ [419:65] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.smartCastValueArgumentTypeIfPossible[ValueParameterDescriptorImpl]

'!' @ [424:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'argumentType' @ [424:14] ==> value-parameter argumentType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.tryNotNullableArgument[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [424:27] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameterType' @ [424:47] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.tryNotNullableArgument[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [424:61] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'argumentType' @ [426:39] ==> value-parameter argumentType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.tryNotNullableArgument[ValueParameterDescriptorImpl]

'makeNotNullable' @ [426:52] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'isSubtypeOfForArgumentType' @ [427:49] ==> public open fun isSubtypeOfForArgumentType(@NotNull actualType: KotlinType, @NotNull expectedType: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'notNullableArgumentType' @ [427:76] ==> val notNullableArgumentType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.tryNotNullableArgument[LocalVariableDescriptor]

'parameterType' @ [427:101] ==> value-parameter parameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.tryNotNullableArgument[ValueParameterDescriptorImpl]

'if (isApplicable) NULLABLE_ARGUMENT_TYPE_MISMATCH else null' @ [428:16] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus?, elseBranch: ResolutionStatus?): ResolutionStatus?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus?

'isApplicable' @ [428:20] ==> val isApplicable: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.tryNotNullableArgument[LocalVariableDescriptor]

'NULLABLE_ARGUMENT_TYPE_MISMATCH' @ [428:34] ==> enum entry NULLABLE_ARGUMENT_TYPE_MISMATCH defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'check' @ [431:84] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.check(checker: Nothing.() -> Unit): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'candidateDescriptor' @ [432:33] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'extensionReceiverParameter' @ [432:53] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'candidateDescriptor' @ [433:32] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'dispatchReceiverParameter' @ [433:52] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'!' @ [437:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isInvokeCallOnExpressionWithBothReceivers' @ [437:14] ==> public fun isInvokeCallOnExpressionWithBothReceivers(call: Call): Boolean defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'call' @ [437:56] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'checkReceiverTypeError' @ [438:13] ==> private final fun CallCandidateResolutionContext<*>.checkReceiverTypeError(receiverParameterDescriptor: ReceiverParameterDescriptor?, receiverArgument: ReceiverValue?): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'extensionReceiver' @ [438:36] ==> val extensionReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError.<anonymous>[LocalVariableDescriptor]

'candidateCall' @ [438:55] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'extensionReceiver' @ [438:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'checkReceiverTypeError' @ [440:9] ==> private final fun CallCandidateResolutionContext<*>.checkReceiverTypeError(receiverParameterDescriptor: ReceiverParameterDescriptor?, receiverArgument: ReceiverValue?): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'dispatchReceiver' @ [440:32] ==> val dispatchReceiver: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError.<anonymous>[LocalVariableDescriptor]

'candidateCall' @ [440:50] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'dispatchReceiver' @ [440:64] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'checkAndReport' @ [446:9] ==> private final inline fun <D : CallableDescriptor> CallCandidateResolutionContext<out (CallableDescriptor..CallableDescriptor?)>.checkAndReport(checker: Nothing.() -> ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'receiverParameterDescriptor' @ [447:13] ==> value-parameter receiverParameterDescriptor: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError[ValueParameterDescriptorImpl]

'receiverArgument' @ [447:52] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError[ValueParameterDescriptorImpl]

'SUCCESS' @ [447:100] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'getErasedReceiverType' @ [449:34] ==> public fun getErasedReceiverType(receiverParameterDescriptor: ReceiverParameterDescriptor, descriptor: CallableDescriptor): KotlinType defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'receiverParameterDescriptor' @ [449:56] ==> value-parameter receiverParameterDescriptor: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [449:85] ==> private final val CallCandidateResolutionContext<*>.candidateDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'if (!smartCastManager.isSubTypeBySmartCastIgnoringNullability(receiverArgument, erasedReceiverType, this)) {
            RECEIVER_TYPE_ERROR
        } else {
            SUCCESS
        }' @ [451:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ResolutionStatus, elseBranch: ResolutionStatus): ResolutionStatus[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ResolutionStatus

'!' @ [451:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'smartCastManager' @ [451:14] ==> private final val smartCastManager: SmartCastManager defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'isSubTypeBySmartCastIgnoringNullability' @ [451:31] ==> public final fun isSubTypeBySmartCastIgnoringNullability(receiverArgument: ReceiverValue, receiverParameterType: KotlinType, context: ResolutionContext<*>): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [451:71] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError[ValueParameterDescriptorImpl]

'erasedReceiverType' @ [451:89] ==> val erasedReceiverType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError.<anonymous>[LocalVariableDescriptor]

'this' @ [451:109] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiverTypeError.<anonymous>[ReceiverParameterDescriptorImpl]

'RECEIVER_TYPE_ERROR' @ [452:13] ==> enum entry RECEIVER_TYPE_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'SUCCESS' @ [454:13] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'SUCCESS' @ [459:28] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'context' @ [460:29] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'candidateCall' @ [460:37] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'resultStatus' @ [467:9] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'resultStatus' @ [467:24] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'combine' @ [467:37] ==> @NotNull public open fun combine(other: (ResolutionStatus..ResolutionStatus?)): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'context' @ [467:45] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'checkReceiver' @ [467:53] ==> private final fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.checkReceiver(candidateCall: MutableResolvedCall<D>, receiverParameter: ReceiverParameterDescriptor?, receiverArgument: ReceiverValue?, isExplicitReceiver: Boolean, implicitInvokeCheck: Boolean, isDispatchReceiver: Boolean): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidateCall' @ [468:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'candidateCall' @ [469:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'resultingDescriptor' @ [469:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.resultingDescriptor: (D..D?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'extensionReceiverParameter' @ [469:51] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'candidateCall' @ [470:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'extensionReceiver' @ [470:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'candidateCall' @ [471:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'explicitReceiverKind' @ [471:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'isExtensionReceiver' @ [471:52] ==> public final val ExplicitReceiverKind.isExtensionReceiver: Boolean[MyPropertyDescriptor]

'resultStatus' @ [475:9] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'resultStatus' @ [475:24] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'combine' @ [475:37] ==> @NotNull public open fun combine(other: (ResolutionStatus..ResolutionStatus?)): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'context' @ [475:45] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'checkReceiver' @ [475:53] ==> private final fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.checkReceiver(candidateCall: MutableResolvedCall<D>, receiverParameter: ReceiverParameterDescriptor?, receiverArgument: ReceiverValue?, isExplicitReceiver: Boolean, implicitInvokeCheck: Boolean, isDispatchReceiver: Boolean): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidateCall' @ [476:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'candidateCall' @ [477:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'resultingDescriptor' @ [477:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.resultingDescriptor: (D..D?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'dispatchReceiverParameter' @ [477:51] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'candidateCall' @ [477:78] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'dispatchReceiver' @ [477:92] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'candidateCall' @ [478:17] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'explicitReceiverKind' @ [478:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'isDispatchReceiver' @ [478:52] ==> public final val ExplicitReceiverKind.isDispatchReceiver: Boolean[MyPropertyDescriptor]

'context' @ [480:39] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'call' @ [480:47] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'!' @ [484:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'context' @ [484:14] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'isDebuggerContext' @ [484:22] ==> public final val isDebuggerContext: Boolean defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateCall' @ [485:20] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'dispatchReceiver' @ [485:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'context' @ [487:20] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'isCandidateVisible' @ [487:28] ==> private final fun CallCandidateResolutionContext<*>.isCandidateVisible(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'ALWAYS_SUITABLE_RECEIVER' @ [487:79] ==> public final val ALWAYS_SUITABLE_RECEIVER: (ReceiverValue..ReceiverValue?) defined in org.jetbrains.kotlin.descriptors.Visibilities[JavaPropertyDescriptor]

'resultStatus' @ [488:13] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'resultStatus' @ [488:28] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'combine' @ [488:41] ==> @NotNull public open fun combine(other: (ResolutionStatus..ResolutionStatus?)): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'context' @ [489:21] ==> value-parameter context: CallCandidateResolutionContext<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[ValueParameterDescriptorImpl]

'checkVisibilityWithDispatchReceiver' @ [489:29] ==> private final fun CallCandidateResolutionContext<*>.checkVisibilityWithDispatchReceiver(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'candidateCall' @ [490:29] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'dispatchReceiver' @ [490:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'candidateCall' @ [490:61] ==> val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'smartCastDispatchReceiverType' @ [490:75] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.smartCastDispatchReceiverType: KotlinType?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'resultStatus' @ [493:16] ==> var resultStatus: ResolutionStatus defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceivers[LocalVariableDescriptor]

'receiverParameter' @ [504:13] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'receiverArgument' @ [504:42] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'SUCCESS' @ [504:75] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'candidateCall' @ [505:35] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'candidateDescriptor' @ [505:49] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.candidateDescriptor: D[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'dependsOnTypeParameters' @ [506:23] ==> public open fun dependsOnTypeParameters(@NotNull p0: KotlinType, @NotNull p1: (MutableCollection<(TypeParameterDescriptor..TypeParameterDescriptor?)>..Collection<(TypeParameterDescriptor..TypeParameterDescriptor?)>)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiverParameter' @ [506:47] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [506:65] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'candidateDescriptor' @ [506:71] ==> val candidateDescriptor: D defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'typeParameters' @ [506:91] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'SUCCESS' @ [506:115] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'smartCastManager' @ [508:55] ==> private final val smartCastManager: SmartCastManager defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'isSubTypeBySmartCastIgnoringNullability' @ [508:72] ==> public final fun isSubTypeBySmartCastIgnoringNullability(receiverArgument: ReceiverValue, receiverParameterType: KotlinType, context: ResolutionContext<*>): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [509:17] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'receiverParameter' @ [509:35] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [509:53] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'this' @ [509:59] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ReceiverParameterDescriptorImpl]

'!' @ [511:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubtypeBySmartCastIgnoringNullability' @ [511:14] ==> val isSubtypeBySmartCastIgnoringNullability: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'tracing' @ [512:13] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'wrongReceiverType' @ [512:21] ==> public abstract fun wrongReceiverType(@NotNull trace: BindingTrace, @NotNull receiverParameter: ReceiverParameterDescriptor, @NotNull receiverArgument: ReceiverValue, @NotNull c: ResolutionContext<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [513:21] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'receiverParameter' @ [513:28] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'receiverArgument' @ [513:47] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'this' @ [514:21] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ReceiverParameterDescriptorImpl]

'replaceCallPosition' @ [514:26] ==> @NotNull public open fun replaceCallPosition(@NotNull callPosition: CallPosition): CallCandidateResolutionContext<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaMethodDescriptor]

'ExtensionReceiverPosition' @ [514:59] ==> public constructor ExtensionReceiverPosition(resolvedCall: ResolvedCall<*>) defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ExtensionReceiverPosition[ClassConstructorDescriptorImpl]

'candidateCall' @ [514:85] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'OTHER_ERROR' @ [515:20] ==> enum entry OTHER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'candidateCall' @ [520:20] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [520:34] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'isExplicitReceiver' @ [521:26] ==> value-parameter isExplicitReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'!' @ [521:48] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'implicitInvokeCheck' @ [521:49] ==> value-parameter implicitInvokeCheck: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [521:72] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'isExplicitSafeCall' @ [521:77] ==> public fun Call.isExplicitSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'if (safeAccess) TypeUtils.makeNullable(receiverParameter.type) else receiverParameter.type' @ [522:45] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KotlinType, elseBranch: KotlinType): KotlinType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KotlinType

'safeAccess' @ [522:49] ==> val safeAccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'makeNullable' @ [522:71] ==> @NotNull public open fun makeNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiverParameter' @ [522:84] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [522:102] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'receiverParameter' @ [522:113] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [522:131] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'!' @ [523:39] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isSubtypeOfForArgumentType' @ [523:61] ==> public open fun isSubtypeOfForArgumentType(@NotNull actualType: KotlinType, @NotNull expectedType: KotlinType): Boolean defined in org.jetbrains.kotlin.resolve.calls.ArgumentTypeResolver[JavaMethodDescriptor]

'receiverArgument' @ [523:88] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [523:105] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'expectedReceiverParameterType' @ [523:111] ==> val expectedReceiverParameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'notNullReceiverExpected' @ [525:17] ==> val notNullReceiverExpected: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'!' @ [525:44] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isCandidateVisibleOrExtensionReceiver' @ [525:45] ==> private final fun CallCandidateResolutionContext<*>.isCandidateVisibleOrExtensionReceiver(receiverArgument: ReceiverValue?, smartCastType: KotlinType?, isDispatchReceiver: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [525:83] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'isDispatchReceiver' @ [525:107] ==> value-parameter isDispatchReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'receiverArgument' @ [529:36] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'type' @ [529:53] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'implicitInvokeCheck' @ [530:13] ==> value-parameter implicitInvokeCheck: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [530:36] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'call' @ [530:69] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'isSafeCall' @ [530:74] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'call' @ [531:37] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'outerCall' @ [531:42] ==> public final val CallTransformer.CallForImplicitInvoke.outerCall: Call[MyPropertyDescriptor]

'explicitReceiver' @ [531:52] ==> public final val Call.explicitReceiver: Receiver?[MyPropertyDescriptor]

'outerCallReceiver' @ [532:17] ==> val outerCallReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'call' @ [532:38] ==> val call: Call defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'explicitReceiver' @ [532:43] ==> public final val CallTransformer.CallForImplicitInvoke.explicitReceiver: Receiver?[MyPropertyDescriptor]

'outerCallReceiver' @ [532:63] ==> val outerCallReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'DataFlowValueFactory' @ [533:50] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [533:71] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'outerCallReceiver' @ [533:91] ==> val outerCallReceiver: Receiver? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'this' @ [533:110] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ReceiverParameterDescriptorImpl]

'dataFlowInfo' @ [534:48] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'getStableNullability' @ [534:61] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'outerReceiverDataFlowValue' @ [534:82] ==> val outerReceiverDataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'outerReceiverNullability' @ [535:21] ==> val outerReceiverNullability: Nullability defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'canBeNull' @ [535:46] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'!' @ [535:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [535:72] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedReceiverParameterType' @ [535:87] ==> val expectedReceiverParameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'nullableImplicitInvokeReceiver' @ [536:21] ==> var nullableImplicitInvokeReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'receiverArgumentType' @ [537:21] ==> var receiverArgumentType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'makeNullable' @ [537:54] ==> @NotNull public open fun makeNullable(@NotNull p0: KotlinType): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'receiverArgumentType' @ [537:67] ==> var receiverArgumentType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'DataFlowValueFactory' @ [542:29] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [542:50] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [542:70] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'this' @ [542:88] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ReceiverParameterDescriptorImpl]

'dataFlowInfo' @ [543:27] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'getStableNullability' @ [543:40] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [543:61] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'receiverArgument' @ [544:27] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'expression' @ [544:69] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'if (nullability.canBeNull() && !nullability.canBeNonNull()) {
            if (!TypeUtils.isNullableType(expectedReceiverParameterType)) {
                reportUnsafeCall = true
            }
            if (dataFlowValue.immanentNullability.canBeNonNull()) {
                expression?.let { trace.record(BindingContext.SMARTCAST_NULL, it) }
            }
        }
        else if (!nullableImplicitInvokeReceiver && smartCastNeeded) {
            // Look if smart cast has some useful nullability info

            val smartCastResult = SmartCastManager.checkAndRecordPossibleCast(
                    dataFlowValue, expectedReceiverParameterType,
                    { possibleSmartCast -> isCandidateVisibleOrExtensionReceiver(receiverArgument, possibleSmartCast, isDispatchReceiver) },
                    expression, this, candidateCall.call, recordExpressionType = true
            )

            if (smartCastResult == null) {
                if (notNullReceiverExpected) {
                    reportUnsafeCall = true
                }
            }
            else {
                if (isDispatchReceiver) {
                    candidateCall.setSmartCastDispatchReceiverType(smartCastResult.resultType)
                }
                else {
                    candidateCall.updateExtensionReceiverWithSmartCastIfNeeded(smartCastResult.resultType)
                }
                if (!smartCastResult.isCorrect) {
                    // Error about unstable smart cast reported within checkAndRecordPossibleCast
                    return UNSTABLE_SMARTCAST_FOR_RECEIVER_ERROR
                }
            }
        }' @ [545:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'nullability' @ [545:13] ==> val nullability: Nullability defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'canBeNull' @ [545:25] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'!' @ [545:40] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullability' @ [545:41] ==> val nullability: Nullability defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'canBeNonNull' @ [545:53] ==> public open fun canBeNonNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'!' @ [546:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'isNullableType' @ [546:28] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedReceiverParameterType' @ [546:43] ==> val expectedReceiverParameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'reportUnsafeCall' @ [547:17] ==> var reportUnsafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'dataFlowValue' @ [549:17] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'immanentNullability' @ [549:31] ==> public final val immanentNullability: Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValue[PropertyDescriptorImpl]

'canBeNonNull' @ [549:51] ==> public open fun canBeNonNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'expression' @ [550:17] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'let' @ [550:29] ==> @InlineOnly public inline fun <T, R> KtExpression.let(block: (KtExpression) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KtExpression
    <R> -> Unit

'trace' @ [550:35] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'record' @ [550:41] ==> public abstract fun <K : (Any..Any?)> record(slice: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?), key: (KtExpression..KtExpression?)): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtExpression

'SMARTCAST_NULL' @ [550:63] ==> public final val SMARTCAST_NULL: (WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>..WritableSlice<(KtExpression..KtExpression?), (Boolean..Boolean?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'it' @ [550:79] ==> value-parameter it: KtExpression defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver.<anonymous>[ValueParameterDescriptorImpl]

'!' @ [553:18] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullableImplicitInvokeReceiver' @ [553:19] ==> var nullableImplicitInvokeReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'smartCastNeeded' @ [553:53] ==> val smartCastNeeded: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'SmartCastManager' @ [556:35] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[FakeCallableDescriptorForObject]

'checkAndRecordPossibleCast' @ [556:52] ==> public final fun checkAndRecordPossibleCast(dataFlowValue: DataFlowValue, expectedType: KotlinType, additionalPredicate: ((KotlinType) -> Boolean)?, expression: KtExpression?, c: ResolutionContext<*>, call: Call?, recordExpressionType: Boolean): SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager.Companion[SimpleFunctionDescriptorImpl]

'dataFlowValue' @ [557:21] ==> val dataFlowValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'expectedReceiverParameterType' @ [557:36] ==> val expectedReceiverParameterType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'isCandidateVisibleOrExtensionReceiver' @ [558:44] ==> private final fun CallCandidateResolutionContext<*>.isCandidateVisibleOrExtensionReceiver(receiverArgument: ReceiverValue?, smartCastType: KotlinType?, isDispatchReceiver: Boolean): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'receiverArgument' @ [558:82] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'possibleSmartCast' @ [558:100] ==> value-parameter possibleSmartCast: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver.<anonymous>[ValueParameterDescriptorImpl]

'isDispatchReceiver' @ [558:119] ==> value-parameter isDispatchReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'expression' @ [559:21] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'this' @ [559:33] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ReceiverParameterDescriptorImpl]

'candidateCall' @ [559:39] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'call' @ [559:53] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<D>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> D

'if (smartCastResult == null) {
                if (notNullReceiverExpected) {
                    reportUnsafeCall = true
                }
            }
            else {
                if (isDispatchReceiver) {
                    candidateCall.setSmartCastDispatchReceiverType(smartCastResult.resultType)
                }
                else {
                    candidateCall.updateExtensionReceiverWithSmartCastIfNeeded(smartCastResult.resultType)
                }
                if (!smartCastResult.isCorrect) {
                    // Error about unstable smart cast reported within checkAndRecordPossibleCast
                    return UNSTABLE_SMARTCAST_FOR_RECEIVER_ERROR
                }
            }' @ [562:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'smartCastResult' @ [562:17] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'notNullReceiverExpected' @ [563:21] ==> val notNullReceiverExpected: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'reportUnsafeCall' @ [564:21] ==> var reportUnsafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'if (isDispatchReceiver) {
                    candidateCall.setSmartCastDispatchReceiverType(smartCastResult.resultType)
                }
                else {
                    candidateCall.updateExtensionReceiverWithSmartCastIfNeeded(smartCastResult.resultType)
                }' @ [568:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'isDispatchReceiver' @ [568:21] ==> value-parameter isDispatchReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'candidateCall' @ [569:21] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'setSmartCastDispatchReceiverType' @ [569:35] ==> public abstract fun setSmartCastDispatchReceiverType(@NotNull smartCastDispatchReceiverType: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'smartCastResult' @ [569:68] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'resultType' @ [569:84] ==> public final val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'candidateCall' @ [572:21] ==> value-parameter candidateCall: MutableResolvedCall<D> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'updateExtensionReceiverWithSmartCastIfNeeded' @ [572:35] ==> public abstract fun updateExtensionReceiverWithSmartCastIfNeeded(@NotNull smartCastExtensionReceiverType: KotlinType): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'smartCastResult' @ [572:80] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'resultType' @ [572:96] ==> public final val resultType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'!' @ [574:21] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'smartCastResult' @ [574:22] ==> val smartCastResult: SmartCastResult? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'isCorrect' @ [574:38] ==> public final val isCorrect: Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastResult[PropertyDescriptorImpl]

'UNSTABLE_SMARTCAST_FOR_RECEIVER_ERROR' @ [576:28] ==> enum entry UNSTABLE_SMARTCAST_FOR_RECEIVER_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'reportUnsafeCall' @ [581:13] ==> var reportUnsafeCall: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'nullableImplicitInvokeReceiver' @ [581:33] ==> var nullableImplicitInvokeReceiver: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'tracing' @ [582:13] ==> @NotNull public final val tracing: TracingStrategy defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'unsafeCall' @ [582:21] ==> public abstract fun unsafeCall(@NotNull trace: BindingTrace, @NotNull type: KotlinType, isCallForImplicitInvoke: Boolean): Unit defined in org.jetbrains.kotlin.resolve.calls.tasks.TracingStrategy[JavaMethodDescriptor]

'trace' @ [582:32] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'receiverArgumentType' @ [582:39] ==> var receiverArgumentType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'implicitInvokeCheck' @ [582:61] ==> value-parameter implicitInvokeCheck: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'UNSAFE_CALL_ERROR' @ [583:20] ==> enum entry UNSAFE_CALL_ERROR defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'additionalTypeCheckers' @ [586:9] ==> private final val additionalTypeCheckers: Iterable<AdditionalTypeChecker> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[PropertyDescriptorImpl]

'forEach' @ [586:32] ==> @HidesMembers public inline fun <T> Iterable<AdditionalTypeChecker>.forEach(action: (AdditionalTypeChecker) -> Unit): Unit defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AdditionalTypeChecker

'it' @ [586:42] ==> value-parameter it: AdditionalTypeChecker defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver.<anonymous>[ValueParameterDescriptorImpl]

'checkReceiver' @ [586:45] ==> public open fun checkReceiver(receiverParameter: ReceiverParameterDescriptor, receiverArgument: ReceiverValue, safeAccess: Boolean, c: CallResolutionContext<*>): Unit defined in org.jetbrains.kotlin.resolve.calls.checkers.AdditionalTypeChecker[SimpleFunctionDescriptorImpl]

'receiverParameter' @ [586:59] ==> value-parameter receiverParameter: ReceiverParameterDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'receiverArgument' @ [586:78] ==> value-parameter receiverArgument: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ValueParameterDescriptorImpl]

'safeAccess' @ [586:96] ==> val safeAccess: Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[LocalVariableDescriptor]

'this' @ [586:108] ==> <this> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkReceiver[ReceiverParameterDescriptorImpl]

'SUCCESS' @ [588:16] ==> enum entry SUCCESS defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[FakeCallableDescriptorForObject]

'functionDescriptor' @ [600:13] ==> value-parameter functionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'checkGenericBoundsInTypeAliasConstructorCall' @ [601:13] ==> private final fun CallCandidateResolutionContext<*>.checkGenericBoundsInTypeAliasConstructorCall(ktTypeArguments: List<KtTypeProjection>, typeAliasConstructorDescriptor: TypeAliasConstructorDescriptor, typeAliasParametersSubstitutor: TypeSubstitutor, trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'ktTypeArguments' @ [601:58] ==> value-parameter ktTypeArguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'functionDescriptor' @ [601:75] ==> value-parameter functionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'substitutor' @ [601:95] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'trace' @ [601:108] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'functionDescriptor' @ [605:30] ==> value-parameter functionDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'typeParameters' @ [605:49] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'..' @ [606:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [606:22] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'min' @ [606:27] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'typeParameters' @ [606:31] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'size' @ [606:46] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'ktTypeArguments' @ [606:52] ==> value-parameter ktTypeArguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'size' @ [606:68] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'typeParameters' @ [607:43] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'i' @ [607:58] ==> val i: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'typeArguments' @ [608:32] ==> value-parameter typeArguments: List<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'i' @ [608:46] ==> val i: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'ktTypeArguments' @ [609:33] ==> value-parameter ktTypeArguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'i' @ [609:49] ==> val i: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'typeReference' @ [609:52] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'typeReference' @ [610:17] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'checkBounds' @ [611:36] ==> public open fun checkBounds(@NotNull jetTypeArgument: KtTypeReference, @NotNull typeArgument: KotlinType, @NotNull typeParameterDescriptor: TypeParameterDescriptor, @NotNull substitutor: TypeSubstitutor, @NotNull trace: BindingTrace): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'typeReference' @ [611:48] ==> val typeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'typeArgument' @ [611:63] ==> val typeArgument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'typeParameterDescriptor' @ [611:77] ==> val typeParameterDescriptor: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[LocalVariableDescriptor]

'substitutor' @ [611:102] ==> value-parameter substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'trace' @ [611:115] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInAFunctionCall[ValueParameterDescriptorImpl]

'assert' @ [623:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'!' @ [623:20] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeAlias' @ [623:21] ==> value-parameter typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.<init>[ValueParameterDescriptorImpl]

'expandedType' @ [623:31] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'isError' @ [623:44] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'typeAlias' @ [623:79] ==> value-parameter typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.<init>[ValueParameterDescriptorImpl]

'typeAlias' @ [626:40] ==> value-parameter typeAlias: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.<init>[ValueParameterDescriptorImpl]

'declaredTypeParameters' @ [626:50] ==> public final val TypeAliasDescriptor.declaredTypeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'zip' @ [626:73] ==> public infix fun <T, R> Iterable<(TypeParameterDescriptor..TypeParameterDescriptor?)>.zip(other: Iterable<KtTypeProjection>): List<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), KtTypeProjection>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <R> -> KtTypeProjection

'ktTypeArguments' @ [626:77] ==> value-parameter ktTypeArguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.<init>[ValueParameterDescriptorImpl]

'toMap' @ [626:94] ==> public fun <K, V> Iterable<Pair<(TypeParameterDescriptor..TypeParameterDescriptor?), KtTypeProjection>>.toMap(): Map<(TypeParameterDescriptor..TypeParameterDescriptor?), KtTypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)
    <V> -> KtTypeProjection

'unsubstitutedArgument' @ [645:54] ==> value-parameter unsubstitutedArgument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'constructor' @ [645:76] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [645:88] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'argumentsMapping' @ [646:35] ==> private final val argumentsMapping: Map<(TypeParameterDescriptor..TypeParameterDescriptor?), KtTypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy[PropertyDescriptorImpl]

'descriptorForUnsubstitutedArgument' @ [646:52] ==> val descriptorForUnsubstitutedArgument: ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'argumentElement' @ [647:48] ==> val argumentElement: KtTypeProjection? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'typeReference' @ [647:65] ==> public final val KtTypeProjection.typeReference: KtTypeReference?[MyPropertyDescriptor]

'if (argumentTypeReferenceElement != null) {
                trace.report(UPPER_BOUND_VIOLATED.on(argumentTypeReferenceElement, bound, argument))
            }
            else {
                trace.report(UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION.on(callElement, bound, argument, typeParameter))
            }' @ [648:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'argumentTypeReferenceElement' @ [648:17] ==> val argumentTypeReferenceElement: KtTypeReference? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'trace' @ [649:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [649:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UPPER_BOUND_VIOLATED' @ [649:30] ==> public final val UPPER_BOUND_VIOLATED: (DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [649:51] ==> @NotNull public open fun on(@NotNull element: KtTypeReference, @NotNull a: KotlinType, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtTypeReference..KtTypeReference?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'argumentTypeReferenceElement' @ [649:54] ==> val argumentTypeReferenceElement: KtTypeReference? defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[LocalVariableDescriptor]

'bound' @ [649:84] ==> value-parameter bound: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'argument' @ [649:91] ==> value-parameter argument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'trace' @ [652:17] ==> private final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy[PropertyDescriptorImpl]

'report' @ [652:23] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION' @ [652:30] ==> public final val UPPER_BOUND_VIOLATED_IN_TYPEALIAS_EXPANSION: (DiagnosticFactory3<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?), (ClassifierDescriptor..ClassifierDescriptor?)>..DiagnosticFactory3<(KtElement..KtElement?), (KotlinType..KotlinType?), (KotlinType..KotlinType?), (ClassifierDescriptor..ClassifierDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [652:74] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: KotlinType, @NotNull b: KotlinType, @NotNull c: ClassifierDescriptor): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory3[JavaMethodDescriptor]

'callElement' @ [652:77] ==> private final val callElement: KtElement defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy[PropertyDescriptorImpl]

'bound' @ [652:90] ==> value-parameter bound: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'argument' @ [652:97] ==> value-parameter argument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'typeParameter' @ [652:107] ==> value-parameter typeParameter: TypeParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy.boundsViolationInSubstitution[ValueParameterDescriptorImpl]

'typeAliasParametersSubstitutor' @ [663:31] ==> value-parameter typeAliasParametersSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[ValueParameterDescriptorImpl]

'substitute' @ [663:62] ==> @Nullable public open fun substitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType? defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'typeAliasConstructorDescriptor' @ [663:73] ==> value-parameter typeAliasConstructorDescriptor: TypeAliasConstructorDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[ValueParameterDescriptorImpl]

'returnType' @ [663:104] ==> public final val TypeAliasConstructorDescriptor.returnType: KotlinType[MyPropertyDescriptor]

'INVARIANT' @ [663:125] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'create' @ [664:49] ==> @NotNull public open fun create(@NotNull p0: KotlinType): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'substitutedType' @ [664:56] ==> val substitutedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'typeAliasConstructorDescriptor' @ [666:35] ==> value-parameter typeAliasConstructorDescriptor: TypeAliasConstructorDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[ValueParameterDescriptorImpl]

'containingDeclaration' @ [666:66] ==> public final val TypeAliasConstructorDescriptor.containingDeclaration: TypeAliasDescriptor[MyPropertyDescriptor]

'typeAliasDescriptor' @ [668:33] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'expandedType' @ [668:53] ==> public abstract val expandedType: SimpleType defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'unsubstitutedType' @ [669:13] ==> val unsubstitutedType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'isError' @ [669:31] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'TypeAliasSingleStepExpansionReportStrategy' @ [671:30] ==> public constructor TypeAliasSingleStepExpansionReportStrategy(callElement: KtElement, typeAlias: TypeAliasDescriptor, ktTypeArguments: List<KtTypeProjection>, trace: BindingTrace) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.TypeAliasSingleStepExpansionReportStrategy[ClassConstructorDescriptorImpl]

'call' @ [671:73] ==> @NotNull public final val call: Call defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'callElement' @ [671:78] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'typeAliasDescriptor' @ [671:91] ==> val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'ktTypeArguments' @ [671:112] ==> value-parameter ktTypeArguments: List<KtTypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[ValueParameterDescriptorImpl]

'trace' @ [671:129] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[ValueParameterDescriptorImpl]

'checkTypeInTypeAliasSubstitutionRec' @ [677:9] ==> private final fun checkTypeInTypeAliasSubstitutionRec(reportStrategy: TypeAliasExpansionReportStrategy, unsubstitutedType: KotlinType, typeAliasParametersSubstitutor: TypeSubstitutor, boundsSubstitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'reportStrategy' @ [677:45] ==> val reportStrategy: CandidateResolver.TypeAliasSingleStepExpansionReportStrategy defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'unsubstitutedType' @ [677:61] ==> val unsubstitutedType: SimpleType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'typeAliasParametersSubstitutor' @ [677:80] ==> value-parameter typeAliasParametersSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[ValueParameterDescriptorImpl]

'boundsSubstitutor' @ [677:112] ==> val boundsSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkGenericBoundsInTypeAliasConstructorCall[LocalVariableDescriptor]

'unsubstitutedType' @ [688:30] ==> value-parameter unsubstitutedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'constructor' @ [688:48] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [688:60] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'typeAliasParametersSubstitutor' @ [691:40] ==> value-parameter typeAliasParametersSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'safeSubstitute' @ [691:71] ==> @NotNull public open fun safeSubstitute(@NotNull p0: KotlinType, @NotNull p1: Variance): KotlinType defined in org.jetbrains.kotlin.types.TypeSubstitutor[JavaMethodDescriptor]

'unsubstitutedType' @ [691:86] ==> value-parameter unsubstitutedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'INVARIANT' @ [691:114] ==> enum entry INVARIANT defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'arguments' @ [691:125] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'..' @ [693:19] ==> public final operator fun rangeTo(other: Int): IntRange defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'-' @ [693:23] ==> public final operator fun minus(other: Int): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'min' @ [693:28] ==> public open fun min(p0: Int, p1: Int): Int defined in java.lang.Math[JavaMethodDescriptor]

'typeParameters' @ [693:32] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'size' @ [693:47] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'substitutedTypeArguments' @ [693:53] ==> val substitutedTypeArguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'size' @ [693:78] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'substitutedTypeArguments' @ [694:45] ==> val substitutedTypeArguments: List<TypeProjection> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'i' @ [694:70] ==> val i: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'substitutedTypeProjection' @ [695:17] ==> val substitutedTypeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'isStarProjection' @ [695:43] ==> public final val TypeProjection.isStarProjection: Boolean[MyPropertyDescriptor]

'typeParameters' @ [697:33] ==> val typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'i' @ [697:48] ==> val i: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'substitutedTypeProjection' @ [698:43] ==> val substitutedTypeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'type' @ [698:69] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'unsubstitutedType' @ [699:45] ==> value-parameter unsubstitutedType: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'arguments' @ [699:63] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'i' @ [699:73] ==> val i: Int defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'type' @ [699:76] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'checkBoundsInTypeAlias' @ [700:32] ==> public open fun checkBoundsInTypeAlias(@NotNull reportStrategy: TypeAliasExpansionReportStrategy, @NotNull unsubstitutedArgument: KotlinType, @NotNull typeArgument: KotlinType, @NotNull typeParameterDescriptor: TypeParameterDescriptor, @NotNull substitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.DescriptorResolver[JavaMethodDescriptor]

'reportStrategy' @ [700:55] ==> value-parameter reportStrategy: TypeAliasExpansionReportStrategy defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'unsubstitutedTypeArgument' @ [700:71] ==> val unsubstitutedTypeArgument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'substitutedTypeArgument' @ [700:98] ==> val substitutedTypeArgument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'typeParameter' @ [700:123] ==> val typeParameter: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'boundsSubstitutor' @ [700:138] ==> value-parameter boundsSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'checkTypeInTypeAliasSubstitutionRec' @ [702:13] ==> private final fun checkTypeInTypeAliasSubstitutionRec(reportStrategy: TypeAliasExpansionReportStrategy, unsubstitutedType: KotlinType, typeAliasParametersSubstitutor: TypeSubstitutor, boundsSubstitutor: TypeSubstitutor): Unit defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]

'reportStrategy' @ [702:49] ==> value-parameter reportStrategy: TypeAliasExpansionReportStrategy defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'unsubstitutedTypeArgument' @ [702:65] ==> val unsubstitutedTypeArgument: KotlinType defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[LocalVariableDescriptor]

'typeAliasParametersSubstitutor' @ [702:92] ==> value-parameter typeAliasParametersSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'boundsSubstitutor' @ [702:124] ==> value-parameter boundsSubstitutor: TypeSubstitutor defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver.checkTypeInTypeAliasSubstitutionRec[ValueParameterDescriptorImpl]

'candidateResolveMode' @ [707:13] ==> @NotNull public final val candidateResolveMode: CandidateResolveMode defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'FULLY' @ [707:58] ==> enum entry FULLY defined in org.jetbrains.kotlin.resolve.calls.context.CandidateResolveMode[FakeCallableDescriptorForObject]

'candidateCall' @ [707:67] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'status' @ [707:81] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<(D..D?)>.status: ResolutionStatus[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (D..D?)

'possibleTransformToSuccess' @ [707:88] ==> public open fun possibleTransformToSuccess(): Boolean defined in org.jetbrains.kotlin.resolve.calls.results.ResolutionStatus[JavaMethodDescriptor]

'shouldContinue' @ [712:13] ==> private final fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.shouldContinue(): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'invoke' @ [712:31] ==> public abstract operator fun CallCandidateResolutionContext<D>.invoke(): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'shouldContinue' @ [718:13] ==> private final fun <D : CallableDescriptor> CallCandidateResolutionContext<D>.shouldContinue(): Boolean defined in org.jetbrains.kotlin.resolve.calls.CandidateResolver[SimpleFunctionDescriptorImpl]
Inferred types:
    <D : CallableDescriptor> -> D

'candidateCall' @ [719:13] ==> @NotNull public final val candidateCall: MutableResolvedCall<(D..D?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'addStatus' @ [719:27] ==> public abstract fun addStatus(@NotNull status: ResolutionStatus): Unit defined in org.jetbrains.kotlin.resolve.calls.model.MutableResolvedCall[JavaMethodDescriptor]

'invoke' @ [719:37] ==> public abstract operator fun CallCandidateResolutionContext<D>.invoke(): ResolutionStatus defined in kotlin.Function1[FunctionInvokeDescriptor]

'candidateCall' @ [724:17] ==> @NotNull public final val candidateCall: MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.resolve.calls.context.CallCandidateResolutionContext[JavaPropertyDescriptor]

'candidateDescriptor' @ [724:31] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> MutableResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.candidateDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

