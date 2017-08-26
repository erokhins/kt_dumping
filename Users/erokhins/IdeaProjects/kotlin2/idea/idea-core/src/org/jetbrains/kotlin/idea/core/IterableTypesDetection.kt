'identifier' @ [44:41] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'Detector' @ [48:16] ==> public constructor Detector(scope: LexicalScope) defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[ClassConstructorDescriptorImpl]

'scope' @ [48:25] ==> value-parameter scope: LexicalScope defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.createDetector[ValueParameterDescriptorImpl]

'HashMap' @ [51:29] ==> public constructor HashMap<K : (Any..Any?), V : (Any..Any?)>() defined in java.util.HashMap[JavaClassConstructorDescriptor]
Inferred types:
    <K : (Any..Any?)> -> FuzzyType
    <V : (Any..Any?)> -> FuzzyType?

'scope' @ [53:74] ==> private final val scope: LexicalScope defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[PropertyDescriptorImpl]

'collectFunctions' @ [54:18] ==> public fun HierarchicalScope.collectFunctions(name: Name, location: LookupLocation): Collection<FunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'iteratorName' @ [54:35] ==> private final val iteratorName: Name defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Companion[PropertyDescriptorImpl]

'FROM_IDE' @ [54:66] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'filter' @ [55:18] ==> public inline fun <T> Iterable<FunctionDescriptor>.filter(predicate: (FunctionDescriptor) -> Boolean): List<FunctionDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor

'it' @ [55:27] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.typesWithExtensionIterator.<anonymous>[ValueParameterDescriptorImpl]

'isValidOperator' @ [55:30] ==> public fun FunctionDescriptor.isValidOperator(): Boolean defined in org.jetbrains.kotlin.util[DeserializedSimpleFunctionDescriptor]

'mapNotNull' @ [56:18] ==> public inline fun <T, R : Any> Iterable<FunctionDescriptor>.mapNotNull(transform: (FunctionDescriptor) -> KotlinType?): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> FunctionDescriptor
    <R : Any> -> KotlinType

'it' @ [56:31] ==> value-parameter it: FunctionDescriptor defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.typesWithExtensionIterator.<anonymous>[ValueParameterDescriptorImpl]

'extensionReceiverParameter' @ [56:34] ==> public final val FunctionDescriptor.extensionReceiverParameter: ReceiverParameterDescriptor?[MyPropertyDescriptor]

'type' @ [56:62] ==> public final val ReceiverParameterDescriptor.type: KotlinType[MyPropertyDescriptor]

'elementType' @ [59:31] ==> private final fun elementType(type: FuzzyType): FuzzyType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[SimpleFunctionDescriptorImpl]

'type' @ [59:43] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.isIterable[ValueParameterDescriptorImpl]

'loopVarType' @ [60:20] ==> value-parameter loopVarType: KotlinType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.isIterable[ValueParameterDescriptorImpl]

'elementType' @ [60:43] ==> val elementType: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.isIterable[LocalVariableDescriptor]

'checkIsSubtypeOf' @ [60:55] ==> public final fun checkIsSubtypeOf(otherType: KotlinType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedSimpleFunctionDescriptor]

'loopVarType' @ [60:72] ==> value-parameter loopVarType: KotlinType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.isIterable[ValueParameterDescriptorImpl]

'isIterable' @ [64:19] ==> public open fun isIterable(type: FuzzyType, loopVarType: KotlinType?): Boolean defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[SimpleFunctionDescriptorImpl]

'type' @ [64:30] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.isIterable[ValueParameterDescriptorImpl]

'toFuzzyType' @ [64:35] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [64:47] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'loopVarType' @ [64:61] ==> value-parameter loopVarType: KotlinType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.isIterable[ValueParameterDescriptorImpl]

'cache' @ [67:20] ==> private final val cache: HashMap<FuzzyType, FuzzyType?> defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[PropertyDescriptorImpl]

'getOrPutNullable' @ [67:26] ==> public inline fun <K, V> MutableMap<FuzzyType, FuzzyType?>.getOrPutNullable(key: FuzzyType, defaultValue: () -> FuzzyType?): FuzzyType? defined in org.jetbrains.kotlin.utils[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <K> -> FuzzyType
    <V> -> FuzzyType?

'type' @ [67:43] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementType[ValueParameterDescriptorImpl]

'elementTypeNoCache' @ [67:51] ==> private final fun elementTypeNoCache(type: FuzzyType): FuzzyType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[SimpleFunctionDescriptorImpl]

'type' @ [67:70] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementType[ValueParameterDescriptorImpl]

'elementType' @ [71:19] ==> private final fun elementType(type: FuzzyType): FuzzyType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[SimpleFunctionDescriptorImpl]

'type' @ [71:31] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementType[ValueParameterDescriptorImpl]

'toFuzzyType' @ [71:36] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'emptyList' @ [71:48] ==> public fun <T> emptyList(): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeParameterDescriptor

'!' @ [75:17] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'canBeIterable' @ [75:18] ==> private final fun canBeIterable(type: FuzzyType): Boolean defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[SimpleFunctionDescriptorImpl]

'type' @ [75:32] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[ValueParameterDescriptorImpl]

'KtPsiFactory' @ [77:30] ==> @JvmOverloads public constructor KtPsiFactory(project: Project, markGenerated: Boolean = ...) defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedClassConstructorDescriptor]

'project' @ [77:43] ==> private final val project: Project defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection[PropertyDescriptorImpl]

'createExpression' @ [77:52] ==> public final fun createExpression(text: String): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiFactory[DeserializedSimpleFunctionDescriptor]

'newContext' @ [78:51] ==> @NotNull public open fun newContext(@NotNull p0: BindingTrace, @NotNull p1: LexicalScope, @NotNull p2: DataFlowInfo, @NotNull p3: KotlinType): ExpressionTypingContext defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaMethodDescriptor]

'BindingTraceContext' @ [78:62] ==> public constructor BindingTraceContext() defined in org.jetbrains.kotlin.resolve.BindingTraceContext[JavaClassConstructorDescriptor]

'scope' @ [78:85] ==> private final val scope: LexicalScope defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[PropertyDescriptorImpl]

'DataFlowInfo' @ [78:92] ==> public companion object defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo[FakeCallableDescriptorForObject]

'EMPTY' @ [78:105] ==> public final val EMPTY: DataFlowInfo defined in org.jetbrains.kotlin.resolve.calls.smartcasts.DataFlowInfo.Companion[DeserializedPropertyDescriptor]

'NO_EXPECTED_TYPE' @ [78:122] ==> @NotNull public final val NO_EXPECTED_TYPE: SimpleType defined in org.jetbrains.kotlin.types.TypeUtils[JavaPropertyDescriptor]

'ExpressionReceiver' @ [79:38] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver[FakeCallableDescriptorForObject]

'create' @ [79:57] ==> public final fun create(expression: KtExpression, type: KotlinType, bindingContext: BindingContext): ExpressionReceiver defined in org.jetbrains.kotlin.resolve.scopes.receivers.ExpressionReceiver.Companion[DeserializedSimpleFunctionDescriptor]

'expression' @ [79:64] ==> val expression: KtExpression defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[LocalVariableDescriptor]

'type' @ [79:76] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[ValueParameterDescriptorImpl]

'type' @ [79:81] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'context' @ [79:87] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[LocalVariableDescriptor]

'trace' @ [79:95] ==> @NotNull public final val trace: BindingTrace defined in org.jetbrains.kotlin.types.expressions.ExpressionTypingContext[JavaPropertyDescriptor]

'bindingContext' @ [79:101] ==> public final val BindingTrace.bindingContext: BindingContext[MyPropertyDescriptor]

'forLoopConventionsChecker' @ [80:31] ==> private final val forLoopConventionsChecker: ForLoopConventionsChecker defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection[PropertyDescriptorImpl]

'checkIterableConvention' @ [80:57] ==> @Nullable public open fun checkIterableConvention(@NotNull p0: ExpressionReceiver, @NotNull p1: ExpressionTypingContext): KotlinType? defined in org.jetbrains.kotlin.types.expressions.ForLoopConventionsChecker[JavaMethodDescriptor]

'expressionReceiver' @ [80:81] ==> val expressionReceiver: ExpressionReceiver defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[LocalVariableDescriptor]

'context' @ [80:101] ==> val context: ExpressionTypingContext defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[LocalVariableDescriptor]

'elementType' @ [81:20] ==> val elementType: KotlinType? defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[LocalVariableDescriptor]

'let' @ [81:33] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> FuzzyType): FuzzyType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> FuzzyType

'it' @ [81:39] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache.<anonymous>[ValueParameterDescriptorImpl]

'toFuzzyType' @ [81:42] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'type' @ [81:54] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.elementTypeNoCache[ValueParameterDescriptorImpl]

'freeParameters' @ [81:59] ==> public final val freeParameters: Set<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'type' @ [85:20] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.canBeIterable[ValueParameterDescriptorImpl]

'type' @ [85:25] ==> public final val type: KotlinType defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedPropertyDescriptor]

'memberScope' @ [85:30] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'getContributedFunctions' @ [85:42] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'iteratorName' @ [85:66] ==> private final val iteratorName: Name defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Companion[PropertyDescriptorImpl]

'FROM_IDE' @ [85:97] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'isNotEmpty' @ [85:107] ==> @InlineOnly public inline fun <T> Collection<SimpleFunctionDescriptor>.isNotEmpty(): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'typesWithExtensionIterator' @ [86:20] ==> private final val typesWithExtensionIterator: Collection<KotlinType> defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector[PropertyDescriptorImpl]

'any' @ [86:47] ==> public inline fun <T> Iterable<KotlinType>.any(predicate: (KotlinType) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [87:41] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.canBeIterable.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [87:44] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'mapNotNull' @ [87:54] ==> public inline fun <T, R : Any> Iterable<TypeProjection>.mapNotNull(transform: (TypeProjection) -> TypeParameterDescriptor?): List<TypeParameterDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R : Any> -> TypeParameterDescriptor

'it' @ [87:67] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.canBeIterable.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [87:70] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'constructor' @ [87:75] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [87:87] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'type' @ [88:24] ==> value-parameter type: FuzzyType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.canBeIterable[ValueParameterDescriptorImpl]

'checkIsSubtypeOf' @ [88:29] ==> public final fun checkIsSubtypeOf(otherType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedSimpleFunctionDescriptor]

'it' @ [88:46] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.canBeIterable.<anonymous>[ValueParameterDescriptorImpl]

'toFuzzyType' @ [88:49] ==> public fun KotlinType.toFuzzyType(freeParameters: Collection<TypeParameterDescriptor>): FuzzyType defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'freeParams' @ [88:61] ==> val freeParams: List<TypeParameterDescriptor> defined in org.jetbrains.kotlin.idea.core.IterableTypesDetection.Detector.canBeIterable.<anonymous>[LocalVariableDescriptor]

