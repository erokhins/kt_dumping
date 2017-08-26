'FqName' @ [27:36] ==> public constructor FqName(@NotNull p0: String) defined in org.jetbrains.kotlin.name.FqName[JavaClassConstructorDescriptor]

'annotations' @ [31:9] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.descriptors.DeclarationDescriptor[DeserializedPropertyDescriptor]

'findAnnotation' @ [31:21] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'SINCE_KOTLIN_FQ_NAME' @ [31:36] ==> private val SINCE_KOTLIN_FQ_NAME: FqName defined in org.jetbrains.kotlin.resolve in file sinceKotlinUtil.kt[PropertyDescriptorImpl]

'if (this is CallableMemberDescriptor && !kind.isReal) getSinceKotlinVersionByOverridden(this)
            else getOwnSinceKotlinVersion()' @ [42:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: ApiVersion?, elseBranch: ApiVersion?): ApiVersion?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> ApiVersion?

'this' @ [42:17] ==> <this> defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[ReceiverParameterDescriptorImpl]

'!' @ [42:53] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'kind' @ [42:54] ==> public final val CallableMemberDescriptor.kind: CallableMemberDescriptor.Kind[MyPropertyDescriptor]

'isReal' @ [42:59] ==> public final val CallableMemberDescriptor.Kind.isReal: Boolean[MyPropertyDescriptor]

'getSinceKotlinVersionByOverridden' @ [42:67] ==> private fun getSinceKotlinVersionByOverridden(descriptor: CallableMemberDescriptor): ApiVersion? defined in org.jetbrains.kotlin.resolve in file sinceKotlinUtil.kt[SimpleFunctionDescriptorImpl]

'this' @ [42:101] ==> <this> defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[ReceiverParameterDescriptorImpl]

'getOwnSinceKotlinVersion' @ [43:18] ==> private fun DeclarationDescriptor.getOwnSinceKotlinVersion(): ApiVersion? defined in org.jetbrains.kotlin.resolve in file sinceKotlinUtil.kt[SimpleFunctionDescriptorImpl]

'version' @ [49:9] ==> val version: ApiVersion? defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[LocalVariableDescriptor]

'version' @ [49:28] ==> val version: ApiVersion? defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[LocalVariableDescriptor]

'languageVersionSettings' @ [49:39] ==> value-parameter languageVersionSettings: LanguageVersionSettings defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[ValueParameterDescriptorImpl]

'apiVersion' @ [49:63] ==> public abstract val apiVersion: ApiVersion defined in org.jetbrains.kotlin.config.LanguageVersionSettings[DeserializedPropertyDescriptor]

'actionIfInaccessible' @ [51:5] ==> value-parameter actionIfInaccessible: ((ApiVersion) -> Unit)? = ... defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[ValueParameterDescriptorImpl]

'invoke' @ [51:27] ==> public abstract operator fun invoke(p1: ApiVersion): Unit defined in kotlin.Function1[FunctionInvokeDescriptor]

'version' @ [51:34] ==> val version: ApiVersion? defined in org.jetbrains.kotlin.resolve.checkSinceKotlinVersionAccessibility[LocalVariableDescriptor]

'getAllOverriddenDeclarations' @ [61:28] ==> @NotNull public open fun <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> getAllOverriddenDeclarations(@NotNull p0: CallableMemberDescriptor): (MutableSet<(CallableMemberDescriptor..CallableMemberDescriptor?)>..Set<(CallableMemberDescriptor..CallableMemberDescriptor?)>) defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]
Inferred types:
    <D : (CallableMemberDescriptor..CallableMemberDescriptor?)> -> CallableMemberDescriptor

'descriptor' @ [61:57] ==> value-parameter descriptor: CallableMemberDescriptor defined in org.jetbrains.kotlin.resolve.getSinceKotlinVersionByOverridden[ValueParameterDescriptorImpl]

'map' @ [61:69] ==> public inline fun <T, R> Iterable<(CallableMemberDescriptor..CallableMemberDescriptor?)>.map(transform: ((CallableMemberDescriptor..CallableMemberDescriptor?)) -> ApiVersion): List<ApiVersion> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.descriptors.CallableMemberDescriptor..org.jetbrains.kotlin.descriptors.CallableMemberDescriptor?)
    <R> -> ApiVersion

'it' @ [61:75] ==> value-parameter it: (CallableMemberDescriptor..CallableMemberDescriptor?) defined in org.jetbrains.kotlin.resolve.getSinceKotlinVersionByOverridden.<anonymous>[ValueParameterDescriptorImpl]

'getOwnSinceKotlinVersion' @ [61:78] ==> private fun DeclarationDescriptor.getOwnSinceKotlinVersion(): ApiVersion? defined in org.jetbrains.kotlin.resolve in file sinceKotlinUtil.kt[SimpleFunctionDescriptorImpl]

'min' @ [61:122] ==> public fun <T : Comparable<ApiVersion>> Iterable<ApiVersion>.min(): ApiVersion? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> ApiVersion

'getSinceKotlinAnnotation' @ [66:14] ==> internal fun DeclarationDescriptor.getSinceKotlinAnnotation(): AnnotationDescriptor? defined in org.jetbrains.kotlin.resolve in file sinceKotlinUtil.kt[SimpleFunctionDescriptorImpl]

'allValueArguments' @ [66:42] ==> public abstract val allValueArguments: Map<Name, ConstantValue<*>> defined in org.jetbrains.kotlin.descriptors.annotations.AnnotationDescriptor[DeserializedPropertyDescriptor]

'values' @ [66:61] ==> public abstract val values: Collection<ConstantValue<*>> defined in kotlin.collections.Map[DeserializedPropertyDescriptor]

'singleOrNull' @ [66:69] ==> public fun <T> Iterable<ConstantValue<*>>.singleOrNull(): ConstantValue<*>? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ConstantValue<*>

'value' @ [66:85] ==> public open val value: Any? defined in org.jetbrains.kotlin.resolve.constants.ConstantValue[DeserializedPropertyDescriptor]

'let' @ [66:104] ==> @InlineOnly public inline fun <T, R> String.let(block: (String) -> ApiVersion?): ApiVersion? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> String
    <R> -> ApiVersion?

'ApiVersion' @ [66:108] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'Companion' @ [66:119] ==> public companion object defined in org.jetbrains.kotlin.config.ApiVersion[FakeCallableDescriptorForObject]

'loadAnnotationValue' @ [68:22] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'this' @ [69:22] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'containingDeclaration' @ [69:55] ==> public final val ConstructorDescriptor.containingDeclaration: ClassifierDescriptorWithTypeParameters[MyPropertyDescriptor]

'loadAnnotationValue' @ [69:78] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'this' @ [70:21] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'correspondingProperty' @ [70:59] ==> public final val PropertyAccessorDescriptor.correspondingProperty: PropertyDescriptor[MyPropertyDescriptor]

'loadAnnotationValue' @ [70:82] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'?:' @ [72:31] ==> public final fun <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-ELVIS-RESOLVE>`(left: TypeAliasDescriptor?, right: TypeAliasDescriptor?): TypeAliasDescriptor?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-ELVIS-RESOLVE>`> -> TypeAliasDescriptor?

'this' @ [72:32] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'this' @ [73:32] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'typeAliasDescriptor' @ [73:74] ==> public abstract val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'this' @ [74:32] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'typeAliasDescriptor' @ [74:84] ==> public open val typeAliasDescriptor: TypeAliasDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForTypeAliasObject[DeserializedPropertyDescriptor]

'typeAliasDescriptor' @ [76:21] ==> val typeAliasDescriptor: TypeAliasDescriptor? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'loadAnnotationValue' @ [76:42] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'typeAliasDescriptor' @ [79:27] ==> val typeAliasDescriptor: TypeAliasDescriptor? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'classDescriptor' @ [79:48] ==> public abstract val classDescriptor: ClassDescriptor? defined in org.jetbrains.kotlin.descriptors.TypeAliasDescriptor[DeserializedPropertyDescriptor]

'loadAnnotationValue' @ [79:65] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'this' @ [81:34] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'underlyingConstructorDescriptor' @ [81:76] ==> public abstract val underlyingConstructorDescriptor: ClassConstructorDescriptor defined in org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor[DeserializedPropertyDescriptor]

'loadAnnotationValue' @ [81:109] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'this' @ [82:29] ==> <this> defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[ReceiverParameterDescriptorImpl]

'getReferencedObject' @ [82:81] ==> public final fun getReferencedObject(): ClassDescriptor defined in org.jetbrains.kotlin.resolve.calls.util.FakeCallableDescriptorForTypeAliasObject[DeserializedSimpleFunctionDescriptor]

'loadAnnotationValue' @ [82:104] ==> local final fun DeclarationDescriptor.loadAnnotationValue(): ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[SimpleFunctionDescriptorImpl]

'listOfNotNull' @ [84:12] ==> public fun <T : Any> listOfNotNull(vararg elements: ApiVersion?): List<ApiVersion> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ApiVersion

'ownVersion' @ [84:26] ==> val ownVersion: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'ctorClass' @ [84:38] ==> val ctorClass: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'property' @ [84:49] ==> val property: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'typeAlias' @ [84:59] ==> val typeAlias: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'underlyingClass' @ [84:70] ==> val underlyingClass: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'underlyingConstructor' @ [84:87] ==> val underlyingConstructor: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'underlyingObject' @ [84:110] ==> val underlyingObject: ApiVersion? defined in org.jetbrains.kotlin.resolve.getOwnSinceKotlinVersion[LocalVariableDescriptor]

'max' @ [84:128] ==> public fun <T : Comparable<ApiVersion>> Iterable<ApiVersion>.max(): ApiVersion? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Comparable<T>> -> ApiVersion

