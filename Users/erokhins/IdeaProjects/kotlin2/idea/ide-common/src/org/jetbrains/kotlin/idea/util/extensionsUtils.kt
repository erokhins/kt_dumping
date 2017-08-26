'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'receivers' @ [44:20] ==> value-parameter receivers: Collection<ReceiverValue> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'asSequence' @ [44:30] ==> public fun <T> Iterable<ReceiverValue>.asSequence(): Sequence<ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue

'flatMap' @ [44:43] ==> public fun <T, R> Sequence<ReceiverValue>.flatMap(transform: (ReceiverValue) -> Sequence<TCallable>): Sequence<TCallable> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverValue
    <R> -> TCallable

'substituteExtensionIfCallable' @ [44:53] ==> public fun <TCallable : CallableDescriptor> TCallable.substituteExtensionIfCallable(receiver: ReceiverValue, callType: CallType<*>, bindingContext: BindingContext, dataFlowInfo: DataFlowInfo, containingDeclarationOrModule: DeclarationDescriptor): Collection<TCallable> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> TCallable

'it' @ [44:83] ==> value-parameter it: ReceiverValue defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'callType' @ [44:87] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'context' @ [44:97] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [44:106] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [44:120] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'asSequence' @ [44:151] ==> public fun <T> Iterable<TCallable>.asSequence(): Sequence<TCallable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'if (typeParameters.isEmpty()) { // optimization for non-generic callables
        sequence.firstOrNull()?.let { listOf(it) } ?: listOf()
    }
    else {
        sequence.toList()
    }' @ [45:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<TCallable>, elseBranch: Collection<TCallable>): Collection<TCallable>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<TCallable>

'typeParameters' @ [45:16] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [45:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'sequence' @ [46:9] ==> val sequence: Sequence<TCallable> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'firstOrNull' @ [46:18] ==> public fun <T> Sequence<TCallable>.firstOrNull(): TCallable? defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'let' @ [46:33] ==> @InlineOnly public inline fun <T, R> TCallable.let(block: (TCallable) -> List<TCallable>): List<TCallable> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable
    <R> -> List<TCallable>

'listOf' @ [46:39] ==> public fun <T> listOf(element: TCallable): List<TCallable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'it' @ [46:46] ==> value-parameter it: TCallable defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'listOf' @ [46:55] ==> @InlineOnly public inline fun <T> listOf(): List<TCallable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'sequence' @ [49:9] ==> val sequence: Sequence<TCallable> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'toList' @ [49:18] ==> public fun <T> Sequence<TCallable>.toList(): List<TCallable> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'scope' @ [58:26] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallableWithImplicitReceiver[ValueParameterDescriptorImpl]

'getImplicitReceiversWithInstance' @ [58:32] ==> public fun LexicalScope.getImplicitReceiversWithInstance(): Collection<ReceiverParameterDescriptor> defined in org.jetbrains.kotlin.idea.util in file implicitReceiversUtils.kt[SimpleFunctionDescriptorImpl]

'map' @ [58:67] ==> public inline fun <T, R> Iterable<ReceiverParameterDescriptor>.map(transform: (ReceiverParameterDescriptor) -> ReceiverValue): List<ReceiverValue> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ReceiverParameterDescriptor
    <R> -> ReceiverValue

'it' @ [58:73] ==> value-parameter it: ReceiverParameterDescriptor defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallableWithImplicitReceiver.<anonymous>[ValueParameterDescriptorImpl]

'value' @ [58:76] ==> public final val ReceiverParameterDescriptor.value: ReceiverValue[MyPropertyDescriptor]

'substituteExtensionIfCallable' @ [59:12] ==> public fun <TCallable : CallableDescriptor> TCallable.substituteExtensionIfCallable(receivers: Collection<ReceiverValue>, context: BindingContext, dataFlowInfo: DataFlowInfo, callType: CallType<*>, containingDeclarationOrModule: DeclarationDescriptor): Collection<TCallable> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> TCallable

'receiverValues' @ [59:42] ==> val receiverValues: List<ReceiverValue> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallableWithImplicitReceiver[LocalVariableDescriptor]

'context' @ [59:58] ==> value-parameter context: BindingContext defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallableWithImplicitReceiver[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [59:67] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallableWithImplicitReceiver[ValueParameterDescriptorImpl]

'DEFAULT' @ [59:90] ==> public object DEFAULT : CallType<Nothing?> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'scope' @ [59:99] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallableWithImplicitReceiver[ValueParameterDescriptorImpl]

'ownerDescriptor' @ [59:105] ==> public abstract val ownerDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.LexicalScope[DeserializedPropertyDescriptor]

'SmartCastManager' @ [69:17] ==> public constructor SmartCastManager() defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[DeserializedClassConstructorDescriptor]

'getSmartCastVariants' @ [69:36] ==> public final fun getSmartCastVariants(receiverToCast: ReceiverValue, bindingContext: BindingContext, containingDeclarationOrModule: DeclarationDescriptor, dataFlowInfo: DataFlowInfo): List<KotlinType> defined in org.jetbrains.kotlin.resolve.calls.smartcasts.SmartCastManager[DeserializedSimpleFunctionDescriptor]

'receiver' @ [69:57] ==> value-parameter receiver: ReceiverValue defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'bindingContext' @ [69:67] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'containingDeclarationOrModule' @ [69:83] ==> value-parameter containingDeclarationOrModule: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'dataFlowInfo' @ [69:114] ==> value-parameter dataFlowInfo: DataFlowInfo defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'substituteExtensionIfCallable' @ [70:12] ==> public fun <TCallable : CallableDescriptor> TCallable.substituteExtensionIfCallable(receiverTypes: Collection<KotlinType>, callType: CallType<*>): Collection<TCallable> defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]
Inferred types:
    <TCallable : CallableDescriptor> -> TCallable

'types' @ [70:42] ==> val types: List<KotlinType> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'callType' @ [70:49] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'!' @ [77:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'callType' @ [77:10] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'descriptorKindFilter' @ [77:19] ==> public final val descriptorKindFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.util.CallType[PropertyDescriptorImpl]

'accepts' @ [77:40] ==> public final fun accepts(descriptor: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[DeserializedSimpleFunctionDescriptor]

'this' @ [77:48] ==> <this> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ReceiverParameterDescriptorImpl]

'listOf' @ [77:62] ==> @InlineOnly public inline fun <T> listOf(): List<TCallable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'receiverTypes' @ [79:17] ==> value-parameter receiverTypes: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'asSequence' @ [79:31] ==> public fun <T> Iterable<KotlinType>.asSequence(): Sequence<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'callType' @ [80:9] ==> value-parameter callType: CallType<*> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ValueParameterDescriptorImpl]

'SAFE' @ [80:30] ==> public object SAFE : CallType<KtExpression> defined in org.jetbrains.kotlin.idea.util.CallType[FakeCallableDescriptorForObject]

'types' @ [81:9] ==> var types: Sequence<KotlinType> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'types' @ [81:17] ==> var types: Sequence<KotlinType> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'map' @ [81:23] ==> public fun <T, R> Sequence<KotlinType>.map(transform: (KotlinType) -> KotlinType): Sequence<KotlinType> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> KotlinType

'it' @ [81:29] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'makeNotNullable' @ [81:32] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'fuzzyExtensionReceiverType' @ [84:33] ==> public fun CallableDescriptor.fuzzyExtensionReceiverType(): FuzzyType? defined in org.jetbrains.kotlin.idea.util in file FuzzyType.kt[SimpleFunctionDescriptorImpl]

'types' @ [85:24] ==> var types: Sequence<KotlinType> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'mapNotNull' @ [86:14] ==> public fun <T, R : Any> Sequence<KotlinType>.mapNotNull(transform: (KotlinType) -> TypeSubstitutor?): Sequence<TypeSubstitutor> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R : Any> -> TypeSubstitutor

'extensionReceiverType' @ [87:35] ==> val extensionReceiverType: FuzzyType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'checkIsSuperTypeOf' @ [87:57] ==> public final fun checkIsSuperTypeOf(otherType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[SimpleFunctionDescriptorImpl]

'it' @ [87:76] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'substitutor' @ [89:21] ==> var substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[LocalVariableDescriptor]

'it' @ [89:44] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'nullability' @ [89:47] ==> public fun KotlinType.nullability(): TypeNullability defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'NULLABLE' @ [89:80] ==> enum entry NULLABLE defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'extensionReceiverType' @ [89:92] ==> val extensionReceiverType: FuzzyType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'nullability' @ [89:114] ==> public fun FuzzyType.nullability(): TypeNullability defined in org.jetbrains.kotlin.idea.util in file FuzzyType.kt[SimpleFunctionDescriptorImpl]

'NOT_NULL' @ [89:147] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'substitutor' @ [90:21] ==> var substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[LocalVariableDescriptor]

'extensionReceiverType' @ [90:35] ==> val extensionReceiverType: FuzzyType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'checkIsSuperTypeOf' @ [90:57] ==> public final fun checkIsSuperTypeOf(otherType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[SimpleFunctionDescriptorImpl]

'it' @ [90:76] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'makeNotNullable' @ [90:79] ==> public fun KotlinType.makeNotNullable(): KotlinType defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'substitutor' @ [92:17] ==> var substitutor: TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[LocalVariableDescriptor]

'if (typeParameters.isEmpty()) { // optimization for non-generic callables
        if (substitutors.any()) listOf(this) else listOf()
    }
    else {
        substitutors
                .mapNotNull { @Suppress("UNCHECKED_CAST") (substitute(it) as TCallable?) }
                .toList()
    }' @ [94:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: Collection<TCallable>, elseBranch: Collection<TCallable>): Collection<TCallable>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> Collection<TCallable>

'typeParameters' @ [94:16] ==> public final val CallableDescriptor.typeParameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'isEmpty' @ [94:31] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'if (substitutors.any()) listOf(this) else listOf()' @ [95:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: List<TCallable>, elseBranch: List<TCallable>): List<TCallable>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> List<TCallable>

'substitutors' @ [95:13] ==> val substitutors: Sequence<TypeSubstitutor> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'any' @ [95:26] ==> public fun <T> Sequence<TypeSubstitutor>.any(): Boolean defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeSubstitutor

'listOf' @ [95:33] ==> public fun <T> listOf(element: TCallable): List<TCallable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'this' @ [95:40] ==> <this> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[ReceiverParameterDescriptorImpl]

'listOf' @ [95:51] ==> @InlineOnly public inline fun <T> listOf(): List<TCallable> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'substitutors' @ [98:9] ==> val substitutors: Sequence<TypeSubstitutor> defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable[LocalVariableDescriptor]

'mapNotNull' @ [99:18] ==> public fun <T, R : Any> Sequence<TypeSubstitutor>.mapNotNull(transform: (TypeSubstitutor) -> TCallable?): Sequence<TCallable> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeSubstitutor
    <R : Any> -> TCallable

'Suppress' @ [99:31] ==> public constructor Suppress(vararg names: String) defined in kotlin.Suppress[DeserializedClassConstructorDescriptor]

'substitute' @ [99:60] ==> public abstract fun substitute(substitutor: TypeSubstitutor): (CallableDescriptor..CallableDescriptor?) defined in org.jetbrains.kotlin.descriptors.CallableDescriptor[DeserializedSimpleFunctionDescriptor]

'it' @ [99:71] ==> value-parameter it: TypeSubstitutor defined in org.jetbrains.kotlin.idea.util.substituteExtensionIfCallable.<anonymous>[ValueParameterDescriptorImpl]

'toList' @ [100:18] ==> public fun <T> Sequence<TCallable>.toList(): List<TCallable> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TCallable

'when (this) {
        is ExpressionReceiver -> {
            val thisRef = (KtPsiUtil.deparenthesize(this.expression) as? KtThisExpression)?.instanceReference ?: return null
            bindingContext[BindingContext.REFERENCE_TARGET, thisRef]
        }

        is ImplicitReceiver -> this.declarationDescriptor

        else -> null
    }' @ [105:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: DeclarationDescriptor?, entry1: DeclarationDescriptor?, entry2: DeclarationDescriptor?): DeclarationDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> DeclarationDescriptor?

'this' @ [105:18] ==> <this> defined in org.jetbrains.kotlin.idea.util.getThisReceiverOwner[ReceiverParameterDescriptorImpl]

'?:' @ [107:27] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: KtReferenceExpression?, right: KtReferenceExpression): KtReferenceExpression[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> KtReferenceExpression

'deparenthesize' @ [107:38] ==> @Nullable public open fun deparenthesize(@Nullable p0: KtExpression?): KtExpression? defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [107:53] ==> <this> defined in org.jetbrains.kotlin.idea.util.getThisReceiverOwner[ReceiverParameterDescriptorImpl]

'expression' @ [107:58] ==> public abstract val expression: KtExpression defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[DeserializedPropertyDescriptor]

'instanceReference' @ [107:93] ==> public final val KtThisExpression.instanceReference: KtReferenceExpression[MyPropertyDescriptor]

'bindingContext' @ [108:13] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.idea.util.getThisReceiverOwner[ValueParameterDescriptorImpl]

'REFERENCE_TARGET' @ [108:43] ==> public final val REFERENCE_TARGET: (WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>..WritableSlice<(KtReferenceExpression..KtReferenceExpression?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'thisRef' @ [108:61] ==> val thisRef: KtReferenceExpression defined in org.jetbrains.kotlin.idea.util.getThisReceiverOwner[LocalVariableDescriptor]

'this' @ [111:32] ==> <this> defined in org.jetbrains.kotlin.idea.util.getThisReceiverOwner[ReceiverParameterDescriptorImpl]

'declarationDescriptor' @ [111:37] ==> public abstract val declarationDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitReceiver[DeserializedPropertyDescriptor]

