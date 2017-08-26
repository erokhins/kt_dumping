'dispatchReceiver' @ [49:33] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'resultingDescriptor' @ [50:9] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'dispatchReceiverParameter' @ [50:29] ==> public final val CallableDescriptor.dispatchReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'dispatchReceiverValue' @ [50:66] ==> val dispatchReceiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'when (dispatchReceiverValue) {
        is ImplicitReceiver -> // foo() -- implicit receiver
            dispatchReceiverDescriptor = dispatchReceiverValue.declarationDescriptor
        is ClassValueReceiver -> {
            dispatchReceiverDescriptor = dispatchReceiverValue.classQualifier.descriptor
        }
        is ExpressionReceiver -> {
            val expression = KtPsiUtil.deparenthesize(dispatchReceiverValue.expression)
            if (expression is KtThisExpression) {
                // this.foo() -- explicit receiver
                dispatchReceiverDescriptor = context.get(BindingContext.REFERENCE_TARGET, expression.instanceReference)
            }
        }
    }' @ [53:5] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Unit, entry1: Unit, entry2: Unit): Unit[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Unit

'dispatchReceiverValue' @ [53:11] ==> val dispatchReceiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'dispatchReceiverDescriptor' @ [55:13] ==> var dispatchReceiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'dispatchReceiverValue' @ [55:42] ==> val dispatchReceiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'declarationDescriptor' @ [55:64] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

'dispatchReceiverDescriptor' @ [57:13] ==> var dispatchReceiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'dispatchReceiverValue' @ [57:42] ==> val dispatchReceiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'classQualifier' @ [57:64] ==> public final val classQualifier: ClassifierQualifier defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassValueReceiver[PropertyDescriptorImpl]

'descriptor' @ [57:79] ==> public abstract val descriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.resolve.scopes.receivers.ClassifierQualifier[PropertyDescriptorImpl]

'deparenthesize' @ [60:40] ==> @Nullable public open fun deparenthesize(@Nullable expression: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'dispatchReceiverValue' @ [60:55] ==> val dispatchReceiverValue: ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'expression' @ [60:77] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[PropertyDescriptorImpl]

'expression' @ [61:17] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'dispatchReceiverDescriptor' @ [63:17] ==> var dispatchReceiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'context' @ [63:46] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[ValueParameterDescriptorImpl]

'get' @ [63:54] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(slice: (ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?), key: (KtReferenceExpression..KtReferenceExpression?)): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> KtReferenceExpression
    <V : (Any..Any?)> -> DeclarationDescriptor

'REFERENCE_TARGET' @ [63:73] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'expression' @ [63:91] ==> val expression: KtExpression? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'instanceReference' @ [63:102] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'dispatchReceiverDescriptor' @ [68:12] ==> var dispatchReceiverDescriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasThisOrNoDispatchReceiver[LocalVariableDescriptor]

'resultingDescriptor' @ [68:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.resultingDescriptor: (CallableDescriptor..CallableDescriptor?)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getOwnerForEffectiveDispatchReceiverParameter' @ [68:62] ==> public fun CallableDescriptor.getOwnerForEffectiveDispatchReceiverParameter(): DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedSimpleFunctionDescriptor]

'when (explicitReceiverKind) {
        ExplicitReceiverKind.DISPATCH_RECEIVER -> dispatchReceiver!!
        ExplicitReceiverKind.EXTENSION_RECEIVER, ExplicitReceiverKind.BOTH_RECEIVERS -> extensionReceiver!!
        else -> null
    }' @ [72:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: ReceiverValue?, entry1: ReceiverValue?, entry2: ReceiverValue?): ReceiverValue?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> ReceiverValue?

'explicitReceiverKind' @ [72:18] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'DISPATCH_RECEIVER' @ [73:30] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'dispatchReceiver' @ [73:51] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'EXTENSION_RECEIVER' @ [74:30] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'BOTH_RECEIVERS' @ [74:71] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'extensionReceiver' @ [74:89] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getImplicitReceivers' @ [80:9] ==> public fun ResolvedCall<*>.getImplicitReceivers(): Collection<ReceiverValue> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil[SimpleFunctionDescriptorImpl]

'firstOrNull' @ [80:32] ==> public fun <T> Iterable<ReceiverValue>.firstOrNull(): ReceiverValue? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue

'when (explicitReceiverKind) {
            ExplicitReceiverKind.NO_EXPLICIT_RECEIVER -> listOfNotNull(extensionReceiver, dispatchReceiver)
            ExplicitReceiverKind.DISPATCH_RECEIVER -> listOfNotNull(extensionReceiver)
            ExplicitReceiverKind.EXTENSION_RECEIVER -> listOfNotNull(dispatchReceiver)
            ExplicitReceiverKind.BOTH_RECEIVERS -> emptyList()
        }' @ [83:9] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: Collection<ReceiverValue>, entry1: Collection<ReceiverValue>, entry2: Collection<ReceiverValue>, entry3: Collection<ReceiverValue>): Collection<ReceiverValue>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> Collection<ReceiverValue>

'explicitReceiverKind' @ [83:15] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.explicitReceiverKind: ExplicitReceiverKind[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'NO_EXPLICIT_RECEIVER' @ [84:34] ==> enum entry NO_EXPLICIT_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'listOfNotNull' @ [84:58] ==> public fun <T : Any> listOfNotNull(vararg elements: ReceiverValue?): List<ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReceiverValue

'extensionReceiver' @ [84:72] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'dispatchReceiver' @ [84:91] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'DISPATCH_RECEIVER' @ [85:34] ==> enum entry DISPATCH_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'listOfNotNull' @ [85:55] ==> public fun <T : Any> listOfNotNull(element: ReceiverValue?): List<ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReceiverValue

'extensionReceiver' @ [85:69] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'EXTENSION_RECEIVER' @ [86:34] ==> enum entry EXTENSION_RECEIVER defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'listOfNotNull' @ [86:56] ==> public fun <T : Any> listOfNotNull(element: ReceiverValue?): List<ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ReceiverValue

'dispatchReceiver' @ [86:70] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'BOTH_RECEIVERS' @ [87:34] ==> enum entry BOTH_RECEIVERS defined in org.jetbrains.kotlin.resolve.calls.tasks.ExplicitReceiverKind[FakeCallableDescriptorForObject]

'emptyList' @ [87:52] ==> public fun <T> emptyList(): List<ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue

'!' @ [91:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'call' @ [91:10] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'isSafeCall' @ [91:15] ==> public fun Call.isSafeCall(): Boolean defined in org.jetbrains.kotlin.resolve.calls.callUtil in file callUtil.kt[SimpleFunctionDescriptorImpl]

'getExplicitReceiverValue' @ [92:25] ==> public fun ResolvedCall<*>.getExplicitReceiverValue(): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'let' @ [92:53] ==> @InlineOnly public inline fun <T, R> ReceiverValue.let(block: (ReceiverValue) -> DataFlowValue): DataFlowValue defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> DataFlowValue

'DataFlowValueFactory' @ [92:59] ==> public object DataFlowValueFactory defined in org.jetbrains.kotlin.resolve.calls.smartcasts in file DataFlowValueFactory.kt[FakeCallableDescriptorForObject]

'createDataFlowValue' @ [92:80] ==> @JvmStatic public final fun createDataFlowValue(receiverValue: ReceiverValue, resolutionContext: ResolutionContext<*>): DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowValueFactory[SimpleFunctionDescriptorImpl]

'it' @ [92:100] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasSafeNullableReceiver.<anonymous>[ValueParameterDescriptorImpl]

'context' @ [92:104] ==> value-parameter context: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasSafeNullableReceiver[ValueParameterDescriptorImpl]

'context' @ [94:12] ==> value-parameter context: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasSafeNullableReceiver[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [94:20] ==> @NotNull public final val dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.context.CallResolutionContext[JavaPropertyDescriptor]

'getStableNullability' @ [94:33] ==> public abstract fun getStableNullability(key: DataFlowValue): Nullability defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[SimpleFunctionDescriptorImpl]

'receiverValue' @ [94:54] ==> val receiverValue: DataFlowValue defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.hasSafeNullableReceiver[LocalVariableDescriptor]

'canBeNull' @ [94:69] ==> public open fun canBeNull(): Boolean defined in org.jetbrains.kotlin.resolve.calls.smartcasts.Nullability[JavaMethodDescriptor]

'type' @ [98:9] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.makeNullableTypeIfSafeReceiver[ValueParameterDescriptorImpl]

'let' @ [98:15] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> KotlinType): KotlinType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'makeNullableIfNeeded' @ [98:31] ==> @NotNull public open fun makeNullableIfNeeded(@NotNull p0: KotlinType, p1: Boolean): KotlinType defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'type' @ [98:52] ==> value-parameter type: KotlinType? defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.makeNullableTypeIfSafeReceiver[ValueParameterDescriptorImpl]

'hasSafeNullableReceiver' @ [98:58] ==> private fun ResolvedCall<*>.hasSafeNullableReceiver(context: CallResolutionContext<*>): Boolean defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil in file resolvedCallUtil.kt[SimpleFunctionDescriptorImpl]

'context' @ [98:82] ==> value-parameter context: CallResolutionContext<*> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.makeNullableTypeIfSafeReceiver[ValueParameterDescriptorImpl]

'dispatchReceiver' @ [100:42] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'extensionReceiver' @ [100:70] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.extensionReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getReceiverValueWithSmartCast' @ [103:11] ==> public fun getReceiverValueWithSmartCast(receiverArgument: ReceiverValue?, smartCastType: KotlinType?): ReceiverValue? defined in org.jetbrains.kotlin.resolve.calls.smartcasts[DeserializedSimpleFunctionDescriptor]

'dispatchReceiver' @ [103:41] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.dispatchReceiver: ReceiverValue?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'smartCastDispatchReceiverType' @ [103:59] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.smartCastDispatchReceiverType: KotlinType?[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> (org.jetbrains.kotlin.descriptors.CallableDescriptor..org.jetbrains.kotlin.descriptors.CallableDescriptor?)

'getResolvedCall' @ [106:24] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[SimpleFunctionDescriptorImpl]

'context' @ [106:40] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.getArgumentByParameterIndex[ValueParameterDescriptorImpl]

'emptyList' @ [106:59] ==> public fun <T> emptyList(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'resolvedCall' @ [107:30] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.getArgumentByParameterIndex[LocalVariableDescriptor]

'resultingDescriptor' @ [107:43] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'valueParameters' @ [107:63] ==> public final val CallableDescriptor.valueParameters: (MutableList<(ValueParameterDescriptor..ValueParameterDescriptor?)>..List<(ValueParameterDescriptor..ValueParameterDescriptor?)>)[MyPropertyDescriptor]

'getOrNull' @ [107:79] ==> public fun <T> List<(ValueParameterDescriptor..ValueParameterDescriptor?)>.getOrNull(index: Int): ValueParameterDescriptor? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.ValueParameterDescriptor..org.jetbrains.kotlin.descriptors.ValueParameterDescriptor?)

'index' @ [107:89] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.getArgumentByParameterIndex[ValueParameterDescriptorImpl]

'emptyList' @ [107:106] ==> public fun <T> emptyList(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

'resolvedCall' @ [108:12] ==> val resolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.getArgumentByParameterIndex[LocalVariableDescriptor]

'valueArguments' @ [108:25] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.valueArguments: (MutableMap<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>..Map<(ValueParameterDescriptor..ValueParameterDescriptor?), (ResolvedValueArgument..ResolvedValueArgument?)>)[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> CallableDescriptor

'parameterToProcess' @ [108:40] ==> val parameterToProcess: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.resolvedCallUtil.getArgumentByParameterIndex[LocalVariableDescriptor]

'arguments' @ [108:61] ==> public final val ResolvedValueArgument.arguments: (MutableList<(ValueArgument..ValueArgument?)>..List<(ValueArgument..ValueArgument?)>)[MyPropertyDescriptor]

'emptyList' @ [108:74] ==> public fun <T> emptyList(): List<ValueArgument> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ValueArgument

