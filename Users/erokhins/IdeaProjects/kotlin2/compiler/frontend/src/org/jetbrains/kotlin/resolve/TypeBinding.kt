'trace' @ [38:16] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[ValueParameterDescriptorImpl]

'TYPE' @ [38:37] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [38:43] ==> <this> defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[ReceiverParameterDescriptorImpl]

'typeElement' @ [39:22] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'if (type == null || psiElement == null)
        null
    else
        createTypeBindingFromPsi(trace, psiElement, type)' @ [40:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeBinding<KtTypeElement>?, elseBranch: TypeBinding<KtTypeElement>?): TypeBinding<KtTypeElement>?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeBinding<KtTypeElement>?

'type' @ [40:16] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[LocalVariableDescriptor]

'psiElement' @ [40:32] ==> val psiElement: KtTypeElement? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[LocalVariableDescriptor]

'createTypeBindingFromPsi' @ [43:9] ==> private fun createTypeBindingFromPsi(trace: BindingContext, psiElement: KtTypeElement, type: KotlinType): TypeBinding<KtTypeElement> defined in org.jetbrains.kotlin.resolve.typeBinding[SimpleFunctionDescriptorImpl]

'trace' @ [43:34] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[ValueParameterDescriptorImpl]

'psiElement' @ [43:41] ==> val psiElement: KtTypeElement? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[LocalVariableDescriptor]

'type' @ [43:53] ==> val type: KotlinType? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBinding[LocalVariableDescriptor]

'type' @ [47:27] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[ValueParameterDescriptorImpl]

'getAbbreviatedType' @ [47:32] ==> public fun KotlinType.getAbbreviatedType(): AbbreviatedType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'if (abbreviatedType != null)
        AbbreviatedTypeBinding(type, psiElement)
    else
        ExplicitTypeBinding(trace, psiElement, type)' @ [48:12] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeBinding<KtTypeElement>, elseBranch: TypeBinding<KtTypeElement>): TypeBinding<KtTypeElement>[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeBinding<KtTypeElement>

'abbreviatedType' @ [48:16] ==> val abbreviatedType: AbbreviatedType? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[LocalVariableDescriptor]

'AbbreviatedTypeBinding' @ [49:9] ==> public constructor AbbreviatedTypeBinding(type: KotlinType, psiElement: KtTypeElement) defined in org.jetbrains.kotlin.resolve.typeBinding.AbbreviatedTypeBinding[ClassConstructorDescriptorImpl]

'type' @ [49:32] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[ValueParameterDescriptorImpl]

'psiElement' @ [49:38] ==> value-parameter psiElement: KtTypeElement defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[ValueParameterDescriptorImpl]

'ExplicitTypeBinding' @ [51:9] ==> public constructor ExplicitTypeBinding(trace: BindingContext, psiElement: KtTypeElement, type: KotlinType) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[ClassConstructorDescriptorImpl]

'trace' @ [51:29] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[ValueParameterDescriptorImpl]

'psiElement' @ [51:36] ==> value-parameter psiElement: KtTypeElement defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[ValueParameterDescriptorImpl]

'type' @ [51:48] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingFromPsi[ValueParameterDescriptorImpl]

'typeReference' @ [55:28] ==> public final var KtCallableDeclaration.typeReference: KtTypeReference?[MyPropertyDescriptor]

'jetTypeReference' @ [56:9] ==> val jetTypeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[LocalVariableDescriptor]

'jetTypeReference' @ [56:42] ==> val jetTypeReference: KtTypeReference? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[LocalVariableDescriptor]

'createTypeBinding' @ [56:59] ==> public fun KtTypeReference.createTypeBinding(trace: BindingContext): TypeBinding<KtTypeElement>? defined in org.jetbrains.kotlin.resolve.typeBinding[SimpleFunctionDescriptorImpl]

'trace' @ [56:77] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[ValueParameterDescriptorImpl]

'trace' @ [58:22] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[ValueParameterDescriptorImpl]

'DECLARATION_TO_DESCRIPTOR' @ [58:43] ==> @SuppressWarnings public final val DECLARATION_TO_DESCRIPTOR: (ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>..ReadOnlySlice<(PsiElement..PsiElement?), (DeclarationDescriptor..DeclarationDescriptor?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'this' @ [58:70] ==> <this> defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[ReceiverParameterDescriptorImpl]

'descriptor' @ [59:9] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[LocalVariableDescriptor]

'descriptor' @ [61:12] ==> val descriptor: DeclarationDescriptor? defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[LocalVariableDescriptor]

'returnType' @ [61:23] ==> public final val CallableDescriptor.returnType: KotlinType?[MyPropertyDescriptor]

'let' @ [61:35] ==> @InlineOnly public inline fun <T, R> KotlinType.let(block: (KotlinType) -> NoTypeElementBinding<KtCallableDeclaration>): NoTypeElementBinding<KtCallableDeclaration> defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType
    <R> -> NoTypeElementBinding<KtCallableDeclaration>

'NoTypeElementBinding' @ [61:41] ==> public constructor NoTypeElementBinding<out P : PsiElement>(trace: BindingContext, psiElement: KtCallableDeclaration, type: KotlinType) defined in org.jetbrains.kotlin.resolve.typeBinding.NoTypeElementBinding[ClassConstructorDescriptorImpl]
Inferred types:
    <out P : PsiElement> -> KtCallableDeclaration

'trace' @ [61:62] ==> value-parameter trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[ValueParameterDescriptorImpl]

'this' @ [61:69] ==> <this> defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType[ReceiverParameterDescriptorImpl]

'it' @ [61:75] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeBindingForReturnType.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [79:36] ==> public open val psiElement: KtTypeElement defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'typeArgumentsAsTypes' @ [79:47] ==> public final val KtTypeElement.typeArgumentsAsTypes: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>)[MyPropertyDescriptor]

'assert' @ [80:13] ==> @InlineOnly public inline fun assert(value: Boolean, lazyMessage: () -> Any): Unit defined in kotlin[DeserializedSimpleFunctionDescriptor]

'type' @ [80:20] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'getAbbreviatedType' @ [80:25] ==> public fun KotlinType.getAbbreviatedType(): AbbreviatedType? defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'type' @ [80:90] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'run' @ [81:34] ==> @InlineOnly public inline fun <T, R> ExplicitTypeBinding.run(block: ExplicitTypeBinding.() -> Boolean): Boolean defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ExplicitTypeBinding
    <R> -> Boolean

'psiTypeArguments' @ [82:35] ==> val psiTypeArguments: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>[LocalVariableDescriptor]

'size' @ [82:52] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'type' @ [82:60] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'arguments' @ [82:65] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'size' @ [82:75] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'psiTypeArguments' @ [83:38] ==> val psiTypeArguments: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>[LocalVariableDescriptor]

'size' @ [83:55] ==> public abstract val size: Int defined in kotlin.collections.MutableList[DeserializedPropertyDescriptor]

'type' @ [83:63] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'constructor' @ [83:68] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [83:80] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [83:91] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'type' @ [84:17] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'isError' @ [84:22] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'!' @ [84:33] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'sizeIsEqual' @ [84:34] ==> val sizeIsEqual: Boolean defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'psiTypeArguments' @ [87:20] ==> val psiTypeArguments: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>[LocalVariableDescriptor]

'indices' @ [87:37] ==> public val Collection<*>.indices: IntRange defined in kotlin.collections[DeserializedPropertyDescriptor]

'map' @ [87:45] ==> public inline fun <T, R> Iterable<Int>.map(transform: (Int) -> TypeArgumentBindingImpl<KtTypeElement>?): List<TypeArgumentBindingImpl<KtTypeElement>?> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Int
    <R> -> TypeArgumentBindingImpl<KtTypeElement>?

'psiTypeArguments' @ [89:40] ==> val psiTypeArguments: (MutableList<(KtTypeReference..KtTypeReference?)>..List<(KtTypeReference..KtTypeReference?)>) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>[LocalVariableDescriptor]

'index' @ [89:57] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'jetTypeReference' @ [90:38] ==> val jetTypeReference: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'typeElement' @ [90:56] ==> public final val typeElement: KtTypeElement? defined in org.jetbrains.kotlin.psi.KtTypeReference[PropertyDescriptorImpl]

'isErrorBinding' @ [92:21] ==> val isErrorBinding: Boolean defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>[LocalVariableDescriptor]

'trace' @ [93:39] ==> private final val trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'TYPE' @ [93:60] ==> public final val TYPE: (WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>..WritableSlice<(KtTypeReference..KtTypeReference?), (KotlinType..KotlinType?)>?) defined in org.jetbrains.kotlin.resolve.BindingContext[JavaPropertyDescriptor]

'jetTypeReference' @ [93:66] ==> val jetTypeReference: (KtTypeReference..KtTypeReference?) defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'TypeArgumentBindingImpl' @ [95:32] ==> public constructor TypeArgumentBindingImpl<out P : PsiElement>(projection: TypeProjection, typeParameter: TypeParameterDescriptor?, holder: TypeBinding<KtTypeElement>) defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBindingImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out P : PsiElement> -> KtTypeElement

'TypeProjectionImpl' @ [96:29] ==> public constructor TypeProjectionImpl(@NotNull p0: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'nextJetType' @ [96:48] ==> val nextJetType: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'createTypeBindingFromPsi' @ [98:29] ==> private fun createTypeBindingFromPsi(trace: BindingContext, psiElement: KtTypeElement, type: KotlinType): TypeBinding<KtTypeElement> defined in org.jetbrains.kotlin.resolve.typeBinding[SimpleFunctionDescriptorImpl]

'trace' @ [98:54] ==> private final val trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'jetTypeElement' @ [98:61] ==> val jetTypeElement: KtTypeElement defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'nextJetType' @ [98:77] ==> val nextJetType: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'type' @ [102:38] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'arguments' @ [102:43] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'index' @ [102:53] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'TypeArgumentBindingImpl' @ [103:28] ==> public constructor TypeArgumentBindingImpl<out P : PsiElement>(projection: TypeProjection, typeParameter: TypeParameterDescriptor?, holder: TypeBinding<KtTypeElement>) defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBindingImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out P : PsiElement> -> KtTypeElement

'typeProjection' @ [104:25] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'type' @ [105:25] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'constructor' @ [105:30] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [105:42] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'index' @ [105:53] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'createTypeBindingFromPsi' @ [106:25] ==> private fun createTypeBindingFromPsi(trace: BindingContext, psiElement: KtTypeElement, type: KotlinType): TypeBinding<KtTypeElement> defined in org.jetbrains.kotlin.resolve.typeBinding[SimpleFunctionDescriptorImpl]

'trace' @ [106:50] ==> private final val trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding[PropertyDescriptorImpl]

'jetTypeElement' @ [106:57] ==> val jetTypeElement: KtTypeElement defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'typeProjection' @ [106:73] ==> val typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.ExplicitTypeBinding.<get-arguments>.<anonymous>[LocalVariableDescriptor]

'type' @ [106:88] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'createTypeArgumentBindingsWithSinglePsiElement' @ [119:17] ==> internal fun <P : PsiElement> createTypeArgumentBindingsWithSinglePsiElement(type: KotlinType, createBinding: (KotlinType) -> TypeBinding<KtTypeElement>): List<TypeArgumentBinding<KtTypeElement>> defined in org.jetbrains.kotlin.resolve.typeBinding[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> KtTypeElement

'type' @ [119:64] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.AbbreviatedTypeBinding[PropertyDescriptorImpl]

'AbbreviatedTypeBinding' @ [121:13] ==> public constructor AbbreviatedTypeBinding(type: KotlinType, psiElement: KtTypeElement) defined in org.jetbrains.kotlin.resolve.typeBinding.AbbreviatedTypeBinding[ClassConstructorDescriptorImpl]

'argumentType' @ [121:36] ==> value-parameter argumentType: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.AbbreviatedTypeBinding.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'psiElement' @ [121:50] ==> public open val psiElement: KtTypeElement defined in org.jetbrains.kotlin.resolve.typeBinding.AbbreviatedTypeBinding[PropertyDescriptorImpl]

'createTypeArgumentBindingsWithSinglePsiElement' @ [133:17] ==> internal fun <P : PsiElement> createTypeArgumentBindingsWithSinglePsiElement(type: KotlinType, createBinding: (KotlinType) -> TypeBinding<P>): List<TypeArgumentBinding<P>> defined in org.jetbrains.kotlin.resolve.typeBinding[SimpleFunctionDescriptorImpl]
Inferred types:
    <P : PsiElement> -> P

'type' @ [133:64] ==> public open val type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.NoTypeElementBinding[PropertyDescriptorImpl]

'NoTypeElementBinding' @ [135:13] ==> public constructor NoTypeElementBinding<out P : PsiElement>(trace: BindingContext, psiElement: P, type: KotlinType) defined in org.jetbrains.kotlin.resolve.typeBinding.NoTypeElementBinding[ClassConstructorDescriptorImpl]
Inferred types:
    <out P : PsiElement> -> P

'trace' @ [135:34] ==> private final val trace: BindingContext defined in org.jetbrains.kotlin.resolve.typeBinding.NoTypeElementBinding[PropertyDescriptorImpl]

'psiElement' @ [135:41] ==> public open val psiElement: P defined in org.jetbrains.kotlin.resolve.typeBinding.NoTypeElementBinding[PropertyDescriptorImpl]

'argumentType' @ [135:53] ==> value-parameter argumentType: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.NoTypeElementBinding.<get-arguments>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [143:26] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement[ValueParameterDescriptorImpl]

'isError' @ [143:31] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'type' @ [143:42] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement[ValueParameterDescriptorImpl]

'constructor' @ [143:47] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [143:59] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'size' @ [143:70] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'type' @ [143:78] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement[ValueParameterDescriptorImpl]

'arguments' @ [143:83] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'size' @ [143:93] ==> public abstract val size: Int defined in kotlin.collections.List[DeserializedPropertyDescriptor]

'type' @ [144:12] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement[ValueParameterDescriptorImpl]

'arguments' @ [144:17] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'mapIndexed' @ [144:27] ==> public inline fun <T, R> Iterable<TypeProjection>.mapIndexed(transform: (index: Int, TypeProjection) -> TypeArgumentBindingImpl<P>): List<TypeArgumentBindingImpl<P>> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeArgumentBindingImpl<P>

'TypeArgumentBindingImpl' @ [145:9] ==> public constructor TypeArgumentBindingImpl<out P : PsiElement>(projection: TypeProjection, typeParameter: TypeParameterDescriptor?, holder: TypeBinding<P>) defined in org.jetbrains.kotlin.resolve.typeBinding.TypeArgumentBindingImpl[ClassConstructorDescriptorImpl]
Inferred types:
    <out P : PsiElement> -> P

'typeProjection' @ [146:17] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement.<anonymous>[ValueParameterDescriptorImpl]

'if (isErrorBinding) null else type.constructor.parameters[index]' @ [147:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: TypeParameterDescriptor?, elseBranch: TypeParameterDescriptor?): TypeParameterDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> TypeParameterDescriptor?

'isErrorBinding' @ [147:21] ==> val isErrorBinding: Boolean defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement[LocalVariableDescriptor]

'type' @ [147:47] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement[ValueParameterDescriptorImpl]

'constructor' @ [147:52] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [147:64] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'index' @ [147:75] ==> value-parameter index: Int defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement.<anonymous>[ValueParameterDescriptorImpl]

'invoke' @ [148:17] ==> public abstract operator fun invoke(p1: KotlinType): TypeBinding<P> defined in kotlin.Function1[FunctionInvokeDescriptor]

'typeProjection' @ [148:31] ==> value-parameter typeProjection: TypeProjection defined in org.jetbrains.kotlin.resolve.typeBinding.createTypeArgumentBindingsWithSinglePsiElement.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [148:46] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

