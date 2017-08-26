'constructor' @ [30:13] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [30:25] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'takeIf' @ [30:48] ==> @InlineOnly @SinceKotlin public inline fun <T> ClassifierDescriptor.takeIf(predicate: (ClassifierDescriptor) -> Boolean): ClassifierDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> ClassifierDescriptor

'KotlinBuiltIns' @ [30:55] ==> protected/*protected and package*/ constructor KotlinBuiltIns(@NotNull p0: StorageManager) defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaClassConstructorDescriptor]

'isBuiltIn' @ [30:71] ==> public open fun isBuiltIn(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.builtins.KotlinBuiltIns[JavaMethodDescriptor]

'name' @ [30:83] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'requireNotNull' @ [33:23] ==> @InlineOnly public inline fun <T : Any> requireNotNull(value: ClassifierDescriptor?): ClassifierDescriptor defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T : Any> -> ClassifierDescriptor

'constructor' @ [33:38] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [33:50] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'declaration' @ [34:9] ==> val declaration: ClassifierDescriptor defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'join' @ [35:27] ==> @NotNull @Contract public final fun <T : (Any..Any?)> join(@NotNull p0: (MutableCollection<out (KotlinType..KotlinType?)>..Collection<(KotlinType..KotlinType?)>), @NotNull p1: ((KotlinType..KotlinType?)) -> (String..String?), @NotNull @NonNls p2: String): String defined in com.intellij.openapi.util.text.StringUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'declaration' @ [35:32] ==> val declaration: ClassifierDescriptor defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'upperBounds' @ [35:44] ==> public final val TypeParameterDescriptor.upperBounds: (MutableList<(KotlinType..KotlinType?)>..List<(KotlinType..KotlinType?)>)[MyPropertyDescriptor]

'type' @ [35:67] ==> value-parameter type: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName.<anonymous>[ValueParameterDescriptorImpl]

'getJetTypeFqName' @ [35:72] ==> public fun KotlinType.getJetTypeFqName(printTypeArguments: Boolean): String defined in org.jetbrains.kotlin.js.descriptorUtils in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'printTypeArguments' @ [35:89] ==> value-parameter printTypeArguments: Boolean defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[ValueParameterDescriptorImpl]

'arguments' @ [38:25] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'if (printTypeArguments && !typeArguments.isEmpty()) {
        val joinedTypeArguments = StringUtil.join(typeArguments, { projection -> projection.type.getJetTypeFqName(false) }, ", ")

        "<$joinedTypeArguments>"
    }
    else {
        ""
    }' @ [39:33] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: String, elseBranch: String): String[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> String

'printTypeArguments' @ [39:37] ==> value-parameter printTypeArguments: Boolean defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[ValueParameterDescriptorImpl]

'!' @ [39:59] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'typeArguments' @ [39:60] ==> val typeArguments: List<TypeProjection> defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'isEmpty' @ [39:74] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'join' @ [40:46] ==> @NotNull @Contract public final fun <T : (Any..Any?)> join(@NotNull p0: (MutableCollection<out (TypeProjection..TypeProjection?)>..Collection<(TypeProjection..TypeProjection?)>), @NotNull p1: ((TypeProjection..TypeProjection?)) -> (String..String?), @NotNull @NonNls p2: String): String defined in com.intellij.openapi.util.text.StringUtil[SamAdapterFunctionDescriptor]
Inferred types:
    <T : (Any..Any?)> -> (org.jetbrains.kotlin.types.TypeProjection..org.jetbrains.kotlin.types.TypeProjection?)

'typeArguments' @ [40:51] ==> val typeArguments: List<TypeProjection> defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'projection' @ [40:82] ==> value-parameter projection: (TypeProjection..TypeProjection?) defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [40:93] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'getJetTypeFqName' @ [40:98] ==> public fun KotlinType.getJetTypeFqName(printTypeArguments: Boolean): String defined in org.jetbrains.kotlin.js.descriptorUtils in file descriptorUtils.kt[SimpleFunctionDescriptorImpl]

'joinedTypeArguments' @ [42:12] ==> val joinedTypeArguments: String defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'+' @ [48:12] ==> public final operator fun plus(other: Any?): String defined in kotlin.String[DeserializedSimpleFunctionDescriptor]

'getFqName' @ [48:28] ==> @NotNull public open fun getFqName(@NotNull p0: DeclarationDescriptor): FqNameUnsafe defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'declaration' @ [48:38] ==> val declaration: ClassifierDescriptor defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'asString' @ [48:51] ==> @NotNull public open fun asString(): String defined in org.jetbrains.kotlin.name.FqNameUnsafe[JavaMethodDescriptor]

'typeArgumentsAsString' @ [48:64] ==> val typeArgumentsAsString: String defined in org.jetbrains.kotlin.js.descriptorUtils.getJetTypeFqName[LocalVariableDescriptor]

'unsubstitutedPrimaryConstructor' @ [51:56] ==> public final val ClassDescriptor.unsubstitutedPrimaryConstructor: ClassConstructorDescriptor?[MyPropertyDescriptor]

'this' @ [54:13] ==> <this> defined in org.jetbrains.kotlin.js.descriptorUtils.isCoroutineLambda[ReceiverParameterDescriptorImpl]

'isSuspend' @ [54:52] ==> public final var AnonymousFunctionDescriptor.isSuspend: Boolean[MyPropertyDescriptor]

