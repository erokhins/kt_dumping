'!' @ [51:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contains' @ [51:20] ==> public open fun contains(@Nullable p0: KotlinType?, @NotNull p1: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'expectedType' @ [51:29] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ValueParameterDescriptorImpl]

'it' @ [51:45] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'isAnyOrNullableAny' @ [51:48] ==> public fun KotlinType.isAnyOrNullableAny(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [51:72] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'isNothing' @ [51:75] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'it' @ [51:90] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'isNullableNothing' @ [51:93] ==> public fun KotlinType.isNullableNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'this' @ [53:24] ==> <this> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ReceiverParameterDescriptorImpl]

'callPosition' @ [53:29] ==> @NotNull public final val callPosition: CallPosition defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'component1' @ [54:10] ==> public final operator fun component1(): ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [54:24] ==> public final operator fun component2(): (CallableDescriptor) -> KotlinType? defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'when (callPosition) {
        is CallPosition.ValueArgumentPosition -> Pair(
                callPosition.resolvedCall, {
                    f: CallableDescriptor ->
                    getEffectiveExpectedType(f.valueParameters[callPosition.valueParameter.index], callPosition.valueArgument) as KotlinType?
                })
        is CallPosition.ExtensionReceiverPosition -> Pair(
                callPosition.resolvedCall, {
                    f: CallableDescriptor ->
                    f.extensionReceiverParameter?.type
                })
        is CallPosition.PropertyAssignment -> Pair(
                callPosition.leftPart.getResolvedCall(trace.bindingContext) ?: return false, {
                    f: CallableDescriptor ->
                    (f as? PropertyDescriptor)?.setter?.valueParameters?.get(0)?.type
                })
        is CallPosition.Unknown -> return false
    }' @ [54:109] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Pair<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, (CallableDescriptor) -> KotlinType?>, entry1: Pair<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, (CallableDescriptor) -> KotlinType?>, entry2: Pair<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, (CallableDescriptor) -> KotlinType?>, entry3: Pair<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, (CallableDescriptor) -> KotlinType?>): Pair<ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, (CallableDescriptor) -> KotlinType?>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Pair<ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>, Function1<CallableDescriptor, KotlinType?>>

'callPosition' @ [54:115] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'Pair' @ [55:50] ==> public constructor Pair<out A, out B>(first: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, second: (CallableDescriptor) -> KotlinType?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>
    <out B> -> Function1<CallableDescriptor, KotlinType?>

'callPosition' @ [56:17] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'resolvedCall' @ [56:30] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ValueArgumentPosition[PropertyDescriptorImpl]

'getEffectiveExpectedType' @ [58:21] ==> public fun getEffectiveExpectedType(parameterDescriptor: ValueParameterDescriptor, argument: ValueArgument): KotlinType defined in org.jetbrains.kotlin.resolve.calls.callResolverUtil in file CallResolverUtil.kt[SimpleFunctionDescriptorImpl]

'f' @ [58:46] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'valueParameters' @ [58:48] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'callPosition' @ [58:64] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'valueParameter' @ [58:77] ==> public final val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ValueArgumentPosition[PropertyDescriptorImpl]

'index' @ [58:92] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'callPosition' @ [58:100] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'valueArgument' @ [58:113] ==> public final val valueArgument: ValueArgument defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ValueArgumentPosition[PropertyDescriptorImpl]

'Pair' @ [60:54] ==> public constructor Pair<out A, out B>(first: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>, second: (CallableDescriptor) -> KotlinType?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ResolvedCall<out (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)>
    <out B> -> Function1<CallableDescriptor, KotlinType?>

'callPosition' @ [61:17] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'resolvedCall' @ [61:30] ==> public final val resolvedCall: ResolvedCall<*> defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.ExtensionReceiverPosition[PropertyDescriptorImpl]

'f' @ [63:21] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [63:23] ==> public final val CallableDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [63:51] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'Pair' @ [65:47] ==> public constructor Pair<out A, out B>(first: ResolvedCall<out CallableDescriptor>, second: (CallableDescriptor) -> KotlinType?) defined in kotlin.Pair[DeserializedClassConstructorDescriptor]
Inferred types:
    <out A> -> ResolvedCall<out CallableDescriptor>
    <out B> -> Function1<CallableDescriptor, KotlinType?>

'callPosition' @ [66:17] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'leftPart' @ [66:30] ==> public final val leftPart: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.PropertyAssignment[PropertyDescriptorImpl]

'getResolvedCall' @ [66:39] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'trace' @ [66:55] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'bindingContext' @ [66:61] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'f' @ [68:22] ==> value-parameter f: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'setter' @ [68:49] ==> public abstract val setter: PropertySetterDescriptor? defined in org.jetbrains.kotlin.descriptors.PropertyDescriptor[JavaPropertyDescriptor]

'valueParameters' @ [68:57] ==> public final val PropertySetterDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'get' @ [68:74] ==> public abstract fun get(index: Int): (ValueParameterDescriptor..ValueParameterDescriptor?) defined in kotlin.collections.MutableList[DeserializedSimpleFunctionDescriptor]

'type' @ [68:82] ==> public final val ValueParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'resolvedCall' @ [73:24] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'smartCastDispatchReceiverType' @ [73:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.smartCastDispatchReceiverType: KotlinType?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [74:28] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'dispatchReceiver' @ [74:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'type' @ [74:75] ==> public final val ReceiverValue.type: KotlinType[MyPropertyDescriptor]

'resolvedCall' @ [76:30] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'resultingDescriptor' @ [76:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'original' @ [76:63] ==> public final val CallableDescriptor.original: CallableDescriptor[MyPropertyDescriptor]

'TypeConstructorSubstitution' @ [79:13] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'create' @ [80:22] ==> @JvmStatic public final fun create(kotlinType: KotlinType): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[DeserializedSimpleFunctionDescriptor]

'receiverType' @ [80:29] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'wrapWithCapturingSubstitution' @ [81:22] ==> public fun TypeSubstitution.wrapWithCapturingSubstitution(needApproximation: Boolean = ...): TypeSubstitution defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'buildSubstitutor' @ [82:22] ==> public final fun buildSubstitutor(): TypeSubstitutor defined in org.jetbrains.kotlin.types.TypeSubstitution[DeserializedSimpleFunctionDescriptor]

'let' @ [82:41] ==> @InlineOnly public inline fun <T, R> TypeSubstitutor.let(block: (TypeSubstitutor) -> (CallableDescriptor..CallableDescriptor?)): (CallableDescriptor..CallableDescriptor?) defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeSubstitutor
    <R> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'callableDescriptor' @ [82:47] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'substitute' @ [82:66] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'it' @ [82:77] ==> value-parameter it: TypeSubstitutor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [84:39] ==> public abstract operator fun invoke(p1: CallableDescriptor): KotlinType? defined in kotlin.Function1[FunctionInvokeDescriptor]

'substitutedDescriptor' @ [84:84] ==> val substitutedDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'!' @ [85:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'contains' @ [85:20] ==> public open fun contains(@Nullable p0: KotlinType?, @NotNull p1: ((UnwrappedType..UnwrappedType?)) -> (Boolean..Boolean?)): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'nonApproximatedExpectedType' @ [85:29] ==> val nonApproximatedExpectedType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'it' @ [85:60] ==> value-parameter it: (UnwrappedType..UnwrappedType?) defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection.<anonymous>[ValueParameterDescriptorImpl]

'isCaptured' @ [85:63] ==> public fun KotlinType.isCaptured(): Boolean defined in org.jetbrains.kotlin.resolve.calls.inference[DeserializedSimpleFunctionDescriptor]

'if (expectedType.isNothing()) {
        if (callPosition is CallPosition.PropertyAssignment) {
            trace.report(Errors.SETTER_PROJECTED_OUT.on(callPosition.leftPart ?: return false, resolvedCall.resultingDescriptor))
        }
        else {
            val call = resolvedCall.call
            val reportOn =
                    if (resolvedCall is VariableAsFunctionResolvedCall)
                        resolvedCall.variableCall.call.calleeExpression
                    else
                        call.calleeExpression

            trace.reportDiagnosticOnce(Errors.MEMBER_PROJECTED_OUT.on(reportOn ?: call.callElement, callableDescriptor, receiverType))
        }
    }
    else {
        // expressionType can be null when reporting CONSTANT_EXPECTED_TYPE_MISMATCH (see addAll.kt test)
        expressionType ?: return false
        trace.report(
                Errors.TYPE_MISMATCH_DUE_TO_TYPE_PROJECTIONS.on(
                        expression, TypeMismatchDueToTypeProjectionsData(
                        expectedType, expressionType, receiverType, callableDescriptor)))

    }' @ [87:5] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'expectedType' @ [87:9] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ValueParameterDescriptorImpl]

'isNothing' @ [87:22] ==> public fun KotlinType.isNothing(): Boolean defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'if (callPosition is CallPosition.PropertyAssignment) {
            trace.report(Errors.SETTER_PROJECTED_OUT.on(callPosition.leftPart ?: return false, resolvedCall.resultingDescriptor))
        }
        else {
            val call = resolvedCall.call
            val reportOn =
                    if (resolvedCall is VariableAsFunctionResolvedCall)
                        resolvedCall.variableCall.call.calleeExpression
                    else
                        call.calleeExpression

            trace.reportDiagnosticOnce(Errors.MEMBER_PROJECTED_OUT.on(reportOn ?: call.callElement, callableDescriptor, receiverType))
        }' @ [88:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Unit, elseBranch: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Unit

'callPosition' @ [88:13] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'trace' @ [89:13] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [89:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'SETTER_PROJECTED_OUT' @ [89:33] ==> public final val SETTER_PROJECTED_OUT: (DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..DiagnosticFactory1<(KtExpression..KtExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [89:54] ==> @NotNull public open fun on(@NotNull element: KtExpression, @NotNull argument: DeclarationDescriptor): ParametrizedDiagnostic<(KtExpression..KtExpression?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'callPosition' @ [89:57] ==> val callPosition: CallPosition defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'leftPart' @ [89:70] ==> public final val leftPart: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.context.CallPosition.PropertyAssignment[PropertyDescriptorImpl]

'resolvedCall' @ [89:96] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'resultingDescriptor' @ [89:109] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resolvedCall' @ [92:24] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'call' @ [92:37] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'if (resolvedCall is VariableAsFunctionResolvedCall)
                        resolvedCall.variableCall.call.calleeExpression
                    else
                        call.calleeExpression' @ [94:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtExpression?, elseBranch: KtExpression?): KtExpression?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtExpression?

'resolvedCall' @ [94:25] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'resolvedCall' @ [95:25] ==> val resolvedCall: ResolvedCall<out (CallableDescriptor..CallableDescriptor?)> defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'variableCall' @ [95:38] ==> public abstract val variableCall: ResolvedCall<VariableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.model.VariableAsFunctionResolvedCall[PropertyDescriptorImpl]

'call' @ [95:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<VariableDescriptor>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> VariableDescriptor

'calleeExpression' @ [95:56] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'call' @ [97:25] ==> val call: Call defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'calleeExpression' @ [97:30] ==> public final val Call.calleeExpression: KtExpression?[MyPropertyDescriptor]

'trace' @ [99:13] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'reportDiagnosticOnce' @ [99:19] ==> public fun BindingTrace.reportDiagnosticOnce(diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'MEMBER_PROJECTED_OUT' @ [99:47] ==> public final val MEMBER_PROJECTED_OUT: (DiagnosticFactory2<(KtElement..KtElement?), (CallableDescriptor..CallableDescriptor?), (KotlinType..KotlinType?)>..DiagnosticFactory2<(KtElement..KtElement?), (CallableDescriptor..CallableDescriptor?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [99:68] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull a: CallableDescriptor, @NotNull b: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'reportOn' @ [99:71] ==> val reportOn: KtExpression? defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'call' @ [99:83] ==> val call: Call defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'callElement' @ [99:88] ==> public final val Call.callElement: KtElement[MyPropertyDescriptor]

'callableDescriptor' @ [99:101] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'receiverType' @ [99:121] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'expressionType' @ [104:9] ==> value-parameter expressionType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ValueParameterDescriptorImpl]

'trace' @ [105:9] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [105:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_MISMATCH_DUE_TO_TYPE_PROJECTIONS' @ [106:24] ==> public final val TYPE_MISMATCH_DUE_TO_TYPE_PROJECTIONS: (DiagnosticFactory1<(KtElement..KtElement?), (TypeMismatchDueToTypeProjectionsData..TypeMismatchDueToTypeProjectionsData?)>..DiagnosticFactory1<(KtElement..KtElement?), (TypeMismatchDueToTypeProjectionsData..TypeMismatchDueToTypeProjectionsData?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [106:62] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: TypeMismatchDueToTypeProjectionsData): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [107:25] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ValueParameterDescriptorImpl]

'TypeMismatchDueToTypeProjectionsData' @ [107:37] ==> public constructor TypeMismatchDueToTypeProjectionsData(expectedType: KotlinType, expressionType: KotlinType, receiverType: KotlinType, callableDescriptor: CallableDescriptor) defined in org.jetbrains.kotlin.diagnostics.TypeMismatchDueToTypeProjectionsData[ClassConstructorDescriptorImpl]

'expectedType' @ [108:25] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ValueParameterDescriptorImpl]

'expressionType' @ [108:39] ==> value-parameter expressionType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[ValueParameterDescriptorImpl]

'receiverType' @ [108:55] ==> val receiverType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'callableDescriptor' @ [108:69] ==> val callableDescriptor: CallableDescriptor defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToTypeProjection[LocalVariableDescriptor]

'bindingContext' @ [116:9] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'diagnostics' @ [116:24] ==> public final val BindingContext.diagnostics: Diagnostics[MyPropertyDescriptor]

'forElement' @ [116:36] ==> public abstract fun forElement(psiElement: PsiElement): Collection<Diagnostic> defined in org.jetbrains.kotlin.resolve.diagnostics.Diagnostics[SimpleFunctionDescriptorImpl]

'diagnostic' @ [116:47] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.diagnostics.reportDiagnosticOnce[ValueParameterDescriptorImpl]

'psiElement' @ [116:58] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'any' @ [116:70] ==> public inline fun <T> Iterable<Diagnostic>.any(predicate: (Diagnostic) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Diagnostic

'it' @ [116:76] ==> value-parameter it: Diagnostic defined in org.jetbrains.kotlin.diagnostics.reportDiagnosticOnce.<anonymous>[ValueParameterDescriptorImpl]

'factory' @ [116:79] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'diagnostic' @ [116:90] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.diagnostics.reportDiagnosticOnce[ValueParameterDescriptorImpl]

'factory' @ [116:101] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'report' @ [118:5] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'diagnostic' @ [118:12] ==> value-parameter diagnostic: Diagnostic defined in org.jetbrains.kotlin.diagnostics.reportDiagnosticOnce[ValueParameterDescriptorImpl]

'expressionType' @ [133:9] ==> value-parameter expressionType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToScalaLikeNamedFunctionSyntax[ValueParameterDescriptorImpl]

'expressionType' @ [135:9] ==> value-parameter expressionType: KotlinType? defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToScalaLikeNamedFunctionSyntax[ValueParameterDescriptorImpl]

'isFunctionType' @ [135:24] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'!' @ [135:42] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'expectedType' @ [135:43] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToScalaLikeNamedFunctionSyntax[ValueParameterDescriptorImpl]

'isFunctionType' @ [135:56] ==> public val KotlinType.isFunctionType: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'isScalaLikeEqualsBlock' @ [135:74] ==> private fun isScalaLikeEqualsBlock(expression: KtElement): Boolean defined in org.jetbrains.kotlin.diagnostics in file diagnosticUtils.kt[SimpleFunctionDescriptorImpl]

'expression' @ [135:97] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToScalaLikeNamedFunctionSyntax[ValueParameterDescriptorImpl]

'trace' @ [136:9] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.resolve.calls.context.ResolutionContext[JavaPropertyDescriptor]

'report' @ [136:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'TYPE_MISMATCH_DUE_TO_EQUALS_LAMBDA_IN_FUN' @ [136:29] ==> public final val TYPE_MISMATCH_DUE_TO_EQUALS_LAMBDA_IN_FUN: (DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>..DiagnosticFactory1<(KtElement..KtElement?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [136:71] ==> @NotNull public open fun on(@NotNull element: KtElement, @NotNull argument: KotlinType): ParametrizedDiagnostic<(KtElement..KtElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory1[JavaMethodDescriptor]

'expression' @ [136:74] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToScalaLikeNamedFunctionSyntax[ValueParameterDescriptorImpl]

'expectedType' @ [136:86] ==> value-parameter expectedType: KotlinType defined in org.jetbrains.kotlin.diagnostics.reportTypeMismatchDueToScalaLikeNamedFunctionSyntax[ValueParameterDescriptorImpl]

'expression' @ [144:9] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.diagnostics.isScalaLikeEqualsBlock[ValueParameterDescriptorImpl]

'expression' @ [145:9] ==> value-parameter expression: KtElement defined in org.jetbrains.kotlin.diagnostics.isScalaLikeEqualsBlock[ValueParameterDescriptorImpl]

'parent' @ [145:20] ==> public final val KtLambdaExpression.parent: (PsiElement..PsiElement?)[MyPropertyDescriptor]

'let' @ [145:27] ==> @InlineOnly public inline fun <T, R> (PsiElement..PsiElement?).let(block: ((PsiElement..PsiElement?)) -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <R> -> Boolean

'it' @ [145:33] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.isScalaLikeEqualsBlock.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [145:58] ==> value-parameter it: (PsiElement..PsiElement?) defined in org.jetbrains.kotlin.diagnostics.isScalaLikeEqualsBlock.<anonymous>[ValueParameterDescriptorImpl]

'equalsToken' @ [145:61] ==> public final val KtNamedFunction.equalsToken: PsiElement?[MyPropertyDescriptor]

'DescriptorToSourceUtils' @ [148:5] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [148:29] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [148:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.reportOnDeclaration[ValueParameterDescriptorImpl]

'let' @ [148:66] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'trace' @ [149:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.diagnostics.reportOnDeclaration[ValueParameterDescriptorImpl]

'report' @ [149:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'invoke' @ [149:22] ==> public abstract operator fun invoke(p1: PsiElement): Diagnostic defined in kotlin.Function1[FunctionInvokeDescriptor]

'psiElement' @ [149:27] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.reportOnDeclaration.<anonymous>[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [153:5] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [153:29] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [153:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationOrFail[ValueParameterDescriptorImpl]

'let' @ [153:66] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'trace' @ [154:9] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationOrFail[ValueParameterDescriptorImpl]

'report' @ [154:15] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'invoke' @ [154:22] ==> public abstract operator fun invoke(p1: PsiElement): Diagnostic defined in kotlin.Function1[FunctionInvokeDescriptor]

'psiElement' @ [154:27] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationOrFail.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [155:16] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [155:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationOrFail[ValueParameterDescriptorImpl]

'DescriptorToSourceUtils' @ [159:5] ==> public object DescriptorToSourceUtils defined in org.jetbrains.kotlin.resolve in file DescriptorToSourceUtils.kt[FakeCallableDescriptorForObject]

'descriptorToDeclaration' @ [159:29] ==> @JvmStatic public final fun descriptorToDeclaration(descriptor: DeclarationDescriptor): PsiElement? defined in org.jetbrains.kotlin.resolve.DescriptorToSourceUtils[SimpleFunctionDescriptorImpl]

'descriptor' @ [159:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs[ValueParameterDescriptorImpl]

'let' @ [159:66] ==> @InlineOnly public inline fun <T, R> PsiElement.let(block: (PsiElement) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> PsiElement
    <R> -> Unit

'?:' @ [160:9] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: Unit?, right: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> Unit

'psiElement' @ [160:10] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs.<anonymous>[ValueParameterDescriptorImpl]

'let' @ [160:29] ==> @InlineOnly public inline fun <T, R> T.let(block: (T) -> Unit): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T
    <R> -> Unit

'trace' @ [161:13] ==> value-parameter trace: BindingTrace defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs[ValueParameterDescriptorImpl]

'report' @ [161:19] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.resolve.BindingTrace[JavaMethodDescriptor]

'invoke' @ [161:26] ==> public abstract operator fun invoke(p1: T): Diagnostic defined in kotlin.Function1[FunctionInvokeDescriptor]

'it' @ [161:31] ==> value-parameter it: T defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [162:20] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [162:53] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs[ValueParameterDescriptorImpl]

'simpleName' @ [162:93] ==> public abstract val simpleName: String? defined in kotlin.reflect.KClass[DeserializedPropertyDescriptor]

'psiElement' @ [162:127] ==> value-parameter psiElement: PsiElement defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs.<anonymous>[ValueParameterDescriptorImpl]

'AssertionError' @ [163:16] ==> public final fun <init>(p0: (Any..Any?)): AssertionError /* = AssertionError */ defined in kotlin.AssertionError[TypeAliasConstructorDescriptorImpl]

'descriptor' @ [163:52] ==> value-parameter descriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.diagnostics.reportOnDeclarationAs[ValueParameterDescriptorImpl]

'Suppress' @ [167:5] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'ext' @ [168:20] ==> value-parameter ext: DefaultErrorMessages.Extension defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'map' @ [168:24] ==> public final val DefaultErrorMessages.Extension.map: DiagnosticFactoryToRendererMap[MyPropertyDescriptor]

'diagnostic' @ [168:28] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'factory' @ [168:39] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'error' @ [169:23] ==> @InlineOnly public inline fun error(message: Any): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]

'diagnostic' @ [169:66] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'factory' @ [169:77] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [169:85] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'renderer' @ [171:16] ==> val renderer: DiagnosticRenderer<D> defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[LocalVariableDescriptor]

'render' @ [171:25] ==> @NotNull public abstract fun render(@NotNull diagnostic: D): String defined in org.jetbrains.kotlin.diagnostics.rendering.DiagnosticRenderer[JavaMethodDescriptor]

'diagnostic' @ [171:32] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'when (diagnostic.severity) {
        Severity.ERROR -> report(Errors.PLUGIN_ERROR.on(diagnostic.psiElement, diagnostic.factory.name, text))
        Severity.WARNING -> report(Errors.PLUGIN_WARNING.on(diagnostic.psiElement, diagnostic.factory.name, text))
        Severity.INFO -> report(Errors.PLUGIN_INFO.on(diagnostic.psiElement, diagnostic.factory.name, text))
    }' @ [173:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'diagnostic' @ [173:11] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'severity' @ [173:22] ==> public final val Diagnostic.severity: Severity[MyPropertyDescriptor]

'ERROR' @ [174:18] ==> enum entry ERROR defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'report' @ [174:27] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'PLUGIN_ERROR' @ [174:41] ==> public final val PLUGIN_ERROR: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [174:54] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: String, @NotNull b: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [174:57] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'psiElement' @ [174:68] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagnostic' @ [174:80] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'factory' @ [174:91] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [174:99] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'text' @ [174:105] ==> val text: String defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[LocalVariableDescriptor]

'WARNING' @ [175:18] ==> enum entry WARNING defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'report' @ [175:29] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'PLUGIN_WARNING' @ [175:43] ==> public final val PLUGIN_WARNING: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [175:58] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: String, @NotNull b: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [175:61] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'psiElement' @ [175:72] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagnostic' @ [175:84] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'factory' @ [175:95] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [175:103] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'text' @ [175:109] ==> val text: String defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[LocalVariableDescriptor]

'INFO' @ [176:18] ==> enum entry INFO defined in org.jetbrains.kotlin.diagnostics.Severity[FakeCallableDescriptorForObject]

'report' @ [176:26] ==> public abstract fun report(@NotNull diagnostic: Diagnostic): Unit defined in org.jetbrains.kotlin.diagnostics.DiagnosticSink[JavaMethodDescriptor]

'PLUGIN_INFO' @ [176:40] ==> public final val PLUGIN_INFO: (DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>..DiagnosticFactory2<(PsiElement..PsiElement?), (String..String?), (String..String?)>?) defined in org.jetbrains.kotlin.diagnostics.Errors[JavaPropertyDescriptor]

'on' @ [176:52] ==> @NotNull public open fun on(@NotNull element: PsiElement, @NotNull a: String, @NotNull b: String): ParametrizedDiagnostic<(PsiElement..PsiElement?)> defined in org.jetbrains.kotlin.diagnostics.DiagnosticFactory2[JavaMethodDescriptor]

'diagnostic' @ [176:55] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'psiElement' @ [176:66] ==> public final val Diagnostic.psiElement: PsiElement[MyPropertyDescriptor]

'diagnostic' @ [176:78] ==> value-parameter diagnostic: D defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[ValueParameterDescriptorImpl]

'factory' @ [176:89] ==> public final val Diagnostic.factory: DiagnosticFactory<*>[MyPropertyDescriptor]

'name' @ [176:97] ==> public final var <D : (Diagnostic..Diagnostic?)> DiagnosticFactory<out (Diagnostic..Diagnostic?)>.name: String[MyPropertyDescriptor]
Inferred types:
    <D : (Diagnostic..Diagnostic?)> -> (org.jetbrains.kotlin.diagnostics.Diagnostic..org.jetbrains.kotlin.diagnostics.Diagnostic?)

'text' @ [176:103] ==> val text: String defined in org.jetbrains.kotlin.diagnostics.reportFromPlugin[LocalVariableDescriptor]

