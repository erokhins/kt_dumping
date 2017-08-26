'isNullableType' @ [43:19] ==> public open fun isNullableType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [43:34] ==> <this> defined in org.jetbrains.kotlin.psi2ir.containsNull[ReceiverParameterDescriptorImpl]

'if (this is KtExpression) KtPsiUtil.safeDeparenthesize(this) else this' @ [46:9] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: KtElement, elseBranch: KtElement): KtElement[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> KtElement

'this' @ [46:13] ==> <this> defined in org.jetbrains.kotlin.psi2ir.deparenthesize[ReceiverParameterDescriptorImpl]

'safeDeparenthesize' @ [46:45] ==> @NotNull public open fun safeDeparenthesize(@NotNull p0: KtExpression): KtExpression defined in org.jetbrains.kotlin.psi.KtPsiUtil[JavaMethodDescriptor]

'this' @ [46:64] ==> <this> defined in org.jetbrains.kotlin.psi2ir.deparenthesize[ReceiverParameterDescriptorImpl]

'this' @ [46:75] ==> <this> defined in org.jetbrains.kotlin.psi2ir.deparenthesize[ReceiverParameterDescriptorImpl]

'-' @ [49:35] ==> public final operator fun unaryMinus(): Int defined in kotlin.Int[DeserializedSimpleFunctionDescriptor]

'call' @ [50:27] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out (CallableDescriptor..CallableDescriptor?)>.call: Call[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(*)

'valueArguments' @ [50:32] ==> public final val Call.valueArguments: List<(ValueArgument..ValueArgument?)>[MyPropertyDescriptor]

'getArgumentMapping' @ [51:31] ==> @NotNull public abstract fun getArgumentMapping(@NotNull p0: ValueArgument): ArgumentMapping defined in org.jetbrains.kotlin.resolve.calls.model.ResolvedCall[JavaMethodDescriptor]

'valueArgument' @ [51:50] ==> val valueArgument: (ValueArgument..ValueArgument?) defined in org.jetbrains.kotlin.psi2ir.isValueArgumentReorderingRequired[LocalVariableDescriptor]

'Exception' @ [52:37] ==> public constructor Exception(p0: (String..String?)) defined in java.lang.Exception[JavaClassConstructorDescriptor]

'argumentMapping' @ [53:29] ==> val argumentMapping: ArgumentMatch defined in org.jetbrains.kotlin.psi2ir.isValueArgumentReorderingRequired[LocalVariableDescriptor]

'valueParameter' @ [53:45] ==> public abstract val valueParameter: ValueParameterDescriptor defined in org.jetbrains.kotlin.resolve.calls.model.ArgumentMatch[DeserializedPropertyDescriptor]

'index' @ [53:60] ==> public abstract val index: Int defined in org.jetbrains.kotlin.descriptors.ValueParameterDescriptor[DeserializedPropertyDescriptor]

'argumentIndex' @ [54:13] ==> val argumentIndex: Int defined in org.jetbrains.kotlin.psi2ir.isValueArgumentReorderingRequired[LocalVariableDescriptor]

'lastValueParameterIndex' @ [54:29] ==> var lastValueParameterIndex: Int defined in org.jetbrains.kotlin.psi2ir.isValueArgumentReorderingRequired[LocalVariableDescriptor]

'lastValueParameterIndex' @ [57:9] ==> var lastValueParameterIndex: Int defined in org.jetbrains.kotlin.psi2ir.isValueArgumentReorderingRequired[LocalVariableDescriptor]

'argumentIndex' @ [57:35] ==> val argumentIndex: Int defined in org.jetbrains.kotlin.psi2ir.isValueArgumentReorderingRequired[LocalVariableDescriptor]

'getDelegationCall' @ [63:34] ==> public final fun getDelegationCall(): KtConstructorDelegationCall defined in org.jetbrains.kotlin.psi.KtSecondaryConstructor[DeserializedSimpleFunctionDescriptor]

'getResolvedCall' @ [63:54] ==> public fun KtElement?.getResolvedCall(context: BindingContext): ResolvedCall<out CallableDescriptor>? defined in org.jetbrains.kotlin.resolve.calls.callUtil[DeserializedSimpleFunctionDescriptor]

'bindingContext' @ [63:70] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[ValueParameterDescriptorImpl]

'bindingContext' @ [64:33] ==> value-parameter bindingContext: BindingContext defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[ValueParameterDescriptorImpl]

'get' @ [64:48] ==> @Nullable public abstract operator fun <K : (Any..Any?), V : (Any..Any?)> get(p0: (ReadOnlySlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?), p1: (PsiElement..PsiElement?)): ConstructorDescriptor? defined in org.jetbrains.kotlin.resolve.BindingContext[JavaMethodDescriptor]
Inferred types:
    <K : (Any..Any?)> -> (com.intellij.psi.PsiElement..com.intellij.psi.PsiElement?)
    <V : (Any..Any?)> -> (org.jetbrains.kotlin.descriptors.ConstructorDescriptor..org.jetbrains.kotlin.descriptors.ConstructorDescriptor?)

'CONSTRUCTOR' @ [64:67] ==> public final val CONSTRUCTOR: (WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>..WritableSlice<(PsiElement..PsiElement?), (ConstructorDescriptor..ConstructorDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [64:80] ==> <this> defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[ReceiverParameterDescriptorImpl]

'constructorDescriptor' @ [65:32] ==> val constructorDescriptor: ConstructorDescriptor defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[LocalVariableDescriptor]

'containingDeclaration' @ [65:54] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'delegatingResolvedCall' @ [66:33] ==> val delegatingResolvedCall: ResolvedCall<out CallableDescriptor> defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[LocalVariableDescriptor]

'resultingDescriptor' @ [66:56] ==> public final val <D : (CallableDescriptor..CallableDescriptor?)> ResolvedCall<out CallableDescriptor>.resultingDescriptor: CallableDescriptor[MyPropertyDescriptor]
Inferred types:
    <D : (CallableDescriptor..CallableDescriptor?)> -> Captured(out CallableDescriptor)

'containingDeclaration' @ [66:76] ==> public final val CallableDescriptor.containingDeclaration: DeclarationDescriptor[MyPropertyDescriptor]

'targetClassDescriptor' @ [67:12] ==> val targetClassDescriptor: DeclarationDescriptor defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[LocalVariableDescriptor]

'ownerClassDescriptor' @ [67:37] ==> val ownerClassDescriptor: ClassifierDescriptorWithTypeParameters defined in org.jetbrains.kotlin.psi2ir.isConstructorDelegatingToSuper[LocalVariableDescriptor]

'unsubstitutedMemberScope' @ [71:9] ==> public final val ClassDescriptor.unsubstitutedMemberScope: MemberScope[MyPropertyDescriptor]

'findFirstFunction' @ [71:34] ==> public inline fun MemberScope.findFirstFunction(name: String, predicate: (CallableMemberDescriptor) -> Boolean): SimpleFunctionDescriptor defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [71:52] ==> value-parameter name: String defined in org.jetbrains.kotlin.psi2ir.findFirstFunction[ValueParameterDescriptorImpl]

'predicate' @ [71:58] ==> value-parameter predicate: (CallableMemberDescriptor) -> Boolean defined in org.jetbrains.kotlin.psi2ir.findFirstFunction[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [74:9] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'identifier' @ [74:38] ==> @NotNull public open fun identifier(@NotNull p0: String): Name defined in org.jetbrains.kotlin.name.Name[JavaMethodDescriptor]

'name' @ [74:49] ==> value-parameter name: String defined in org.jetbrains.kotlin.psi2ir.findFirstFunction[ValueParameterDescriptorImpl]

'FROM_BACKEND' @ [74:73] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'first' @ [74:87] ==> public inline fun <T> Iterable<SimpleFunctionDescriptor>.first(predicate: (SimpleFunctionDescriptor) -> Boolean): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'predicate' @ [74:93] ==> value-parameter predicate: (CallableMemberDescriptor) -> Boolean defined in org.jetbrains.kotlin.psi2ir.findFirstFunction[ValueParameterDescriptorImpl]

'getContributedFunctions' @ [77:9] ==> public abstract fun getContributedFunctions(name: Name, location: LookupLocation): Collection<SimpleFunctionDescriptor> defined in org.jetbrains.kotlin.resolve.scopes.MemberScope[DeserializedSimpleFunctionDescriptor]

'name' @ [77:33] ==> value-parameter name: Name defined in org.jetbrains.kotlin.psi2ir.findSingleFunction[ValueParameterDescriptorImpl]

'FROM_BACKEND' @ [77:56] ==> enum entry FROM_BACKEND defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'single' @ [77:70] ==> public fun <T> Iterable<SimpleFunctionDescriptor>.single(): SimpleFunctionDescriptor defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleFunctionDescriptor

'builtInsPackageScope' @ [80:9] ==> public final val KotlinBuiltIns.builtInsPackageScope: MemberScope[MyPropertyDescriptor]

'findSingleFunction' @ [80:30] ==> public fun MemberScope.findSingleFunction(name: Name): FunctionDescriptor defined in org.jetbrains.kotlin.psi2ir in file KotlinUtils.kt[SimpleFunctionDescriptorImpl]

'name' @ [80:49] ==> value-parameter name: Name defined in org.jetbrains.kotlin.psi2ir.findSingleFunction[ValueParameterDescriptorImpl]

'this' @ [82:48] ==> <this> defined in org.jetbrains.kotlin.psi2ir.startOffsetOrUndefined[ReceiverParameterDescriptorImpl]

'startOffset' @ [82:54] ==> public val PsiElement.startOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [82:69] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

'this' @ [83:46] ==> <this> defined in org.jetbrains.kotlin.psi2ir.endOffsetOrUndefined[ReceiverParameterDescriptorImpl]

'endOffset' @ [83:52] ==> public val PsiElement.endOffset: Int defined in org.jetbrains.kotlin.psi.psiUtil[DeserializedPropertyDescriptor]

'UNDEFINED_OFFSET' @ [83:65] ==> public const val UNDEFINED_OFFSET: Int defined in org.jetbrains.kotlin.ir[DeserializedPropertyDescriptor]

