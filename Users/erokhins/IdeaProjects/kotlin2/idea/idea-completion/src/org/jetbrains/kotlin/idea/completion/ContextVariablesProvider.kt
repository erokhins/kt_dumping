'getValue' @ [41:37] ==> @InlineOnly public operator inline fun <T> Lazy<T>.getValue(thisRef: Any?, property: KProperty<*>): T defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> T

'collectVariables' @ [42:9] ==> private final fun collectVariables(): Collection<VariableDescriptor> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[SimpleFunctionDescriptorImpl]

'filter' @ [42:28] ==> public inline fun <T> Iterable<VariableDescriptor>.filter(predicate: (VariableDescriptor) -> Boolean): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> VariableDescriptor

'it' @ [42:37] ==> value-parameter it: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.allFunctionTypeVariables.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [42:40] ==> public final val VariableDescriptor.type: KotlinType[MyPropertyDescriptor]

'isFunctionTypeOrSubtype' @ [42:45] ==> public val KotlinType.isFunctionTypeOrSubtype: Boolean defined in org.jetbrains.kotlin.builtins[DeserializedPropertyDescriptor]

'DescriptorKindFilter' @ [46:32] ==> public companion object defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter[FakeCallableDescriptorForObject]

'VARIABLES' @ [46:53] ==> @field:JvmField public final val VARIABLES: DescriptorKindFilter defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter.Companion[DeserializedPropertyDescriptor]

'Extensions' @ [46:93] ==> public object Extensions : DescriptorKindExclude defined in org.jetbrains.kotlin.resolve.scopes.DescriptorKindExclude[FakeCallableDescriptorForObject]

'referenceVariantsHelper' @ [47:16] ==> private final val referenceVariantsHelper: ReferenceVariantsHelper defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[PropertyDescriptorImpl]

'getReferenceVariants' @ [47:40] ==> public final fun getReferenceVariants(contextElement: PsiElement, callTypeAndReceiver: CallTypeAndReceiver<*, *>, kindFilter: DescriptorKindFilter, nameFilter: (Name) -> Boolean, filterOutJavaGettersAndSetters: Boolean = ..., filterOutShadowed: Boolean = ..., excludeNonInitializedVariable: Boolean = ..., useReceiverType: KotlinType? = ...): Collection<DeclarationDescriptor> defined in org.jetbrains.kotlin.idea.codeInsight.ReferenceVariantsHelper[DeserializedSimpleFunctionDescriptor]

'contextElement' @ [47:61] ==> private final val contextElement: PsiElement defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[PropertyDescriptorImpl]

'DEFAULT' @ [47:97] ==> public object DEFAULT : CallTypeAndReceiver<Nothing?, CallType.DEFAULT> defined in org.jetbrains.kotlin.idea.util.CallTypeAndReceiver[FakeCallableDescriptorForObject]

'descriptorFilter' @ [47:106] ==> val descriptorFilter: DescriptorKindFilter defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.collectVariables[LocalVariableDescriptor]

'map' @ [48:18] ==> public inline fun <T, R> Iterable<DeclarationDescriptor>.map(transform: (DeclarationDescriptor) -> VariableDescriptor): List<VariableDescriptor> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> DeclarationDescriptor
    <R> -> VariableDescriptor

'it' @ [48:24] ==> value-parameter it: DeclarationDescriptor defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.collectVariables.<anonymous>[ValueParameterDescriptorImpl]

'SmartList' @ [52:22] ==> public constructor SmartList<E : (Any..Any?)>() defined in com.intellij.util.SmartList[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> Pair<VariableDescriptor, TypeSubstitutor>

'allFunctionTypeVariables' @ [53:26] ==> public final val allFunctionTypeVariables: List<VariableDescriptor> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider[PropertyDescriptorImpl]

'variable' @ [54:31] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.functionTypeVariables[LocalVariableDescriptor]

'fuzzyReturnType' @ [54:40] ==> public fun CallableDescriptor.fuzzyReturnType(): FuzzyType? defined in org.jetbrains.kotlin.idea.util[DeserializedSimpleFunctionDescriptor]

'checkIsSubtypeOf' @ [54:59] ==> public final fun checkIsSubtypeOf(otherType: FuzzyType): TypeSubstitutor? defined in org.jetbrains.kotlin.idea.util.FuzzyType[DeserializedSimpleFunctionDescriptor]

'requiredType' @ [54:76] ==> value-parameter requiredType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.functionTypeVariables[ValueParameterDescriptorImpl]

'result' @ [55:13] ==> val result: SmartList<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.functionTypeVariables[LocalVariableDescriptor]

'add' @ [55:20] ==> public open fun add(element: (Pair<VariableDescriptor, TypeSubstitutor>..Pair<VariableDescriptor, TypeSubstitutor>?)): Boolean defined in com.intellij.util.SmartList[JavaMethodDescriptor]

'variable' @ [55:24] ==> val variable: VariableDescriptor defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.functionTypeVariables[LocalVariableDescriptor]

'substitutor' @ [55:36] ==> val substitutor: TypeSubstitutor defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.functionTypeVariables[LocalVariableDescriptor]

'result' @ [57:16] ==> val result: SmartList<Pair<VariableDescriptor, TypeSubstitutor>> defined in org.jetbrains.kotlin.idea.completion.RealContextVariablesProvider.functionTypeVariables[LocalVariableDescriptor]

'HashSet' @ [62:34] ==> public constructor HashSet<E : (Any..Any?)>() defined in java.util.HashSet[JavaClassConstructorDescriptor]
Inferred types:
    <E : (Any..Any?)> -> FuzzyType

'_requiredTypes' @ [65:17] ==> private final val _requiredTypes: HashSet<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.CollectRequiredTypesContextVariablesProvider[PropertyDescriptorImpl]

'_requiredTypes' @ [68:9] ==> private final val _requiredTypes: HashSet<FuzzyType> defined in org.jetbrains.kotlin.idea.completion.CollectRequiredTypesContextVariablesProvider[PropertyDescriptorImpl]

'add' @ [68:24] ==> public open fun add(element: FuzzyType): Boolean defined in java.util.HashSet[JavaMethodDescriptor]

'requiredType' @ [68:28] ==> value-parameter requiredType: FuzzyType defined in org.jetbrains.kotlin.idea.completion.CollectRequiredTypesContextVariablesProvider.functionTypeVariables[ValueParameterDescriptorImpl]

'emptyList' @ [69:16] ==> public fun <T> emptyList(): List<Pair<VariableDescriptor, TypeSubstitutor>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<VariableDescriptor, TypeSubstitutor>

