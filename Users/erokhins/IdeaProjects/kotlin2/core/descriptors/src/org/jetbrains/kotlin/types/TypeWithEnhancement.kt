'DelegatingSimpleType' @ [32:5] ==> public constructor DelegatingSimpleType() defined in org.jetbrains.kotlin.types.DelegatingSimpleType[ClassConstructorDescriptorImpl]

'delegate' @ [35:48] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement[PropertyDescriptorImpl]

'origin' @ [38:15] ==> public open val origin: UnwrappedType defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement[PropertyDescriptorImpl]

'replaceAnnotations' @ [38:22] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[SimpleFunctionDescriptorImpl]

'newAnnotations' @ [38:41] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement.replaceAnnotations[ValueParameterDescriptorImpl]

'wrapEnhancement' @ [38:57] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'enhancement' @ [38:73] ==> public open val enhancement: KotlinType defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement[PropertyDescriptorImpl]

'origin' @ [41:15] ==> public open val origin: UnwrappedType defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement[PropertyDescriptorImpl]

'makeNullableAsSpecified' @ [41:22] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.UnwrappedType[SimpleFunctionDescriptorImpl]

'newNullability' @ [41:46] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'wrapEnhancement' @ [41:62] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'enhancement' @ [41:78] ==> public open val enhancement: KotlinType defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement[PropertyDescriptorImpl]

'FlexibleType' @ [47:5] ==> public constructor FlexibleType(lowerBound: SimpleType, upperBound: SimpleType) defined in org.jetbrains.kotlin.types.FlexibleType[ClassConstructorDescriptorImpl]

'origin' @ [47:18] ==> value-parameter origin: FlexibleType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement.<init>[ValueParameterDescriptorImpl]

'lowerBound' @ [47:25] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'origin' @ [47:37] ==> value-parameter origin: FlexibleType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement.<init>[ValueParameterDescriptorImpl]

'upperBound' @ [47:44] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'origin' @ [51:15] ==> public open val origin: FlexibleType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[PropertyDescriptorImpl]

'replaceAnnotations' @ [51:22] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): UnwrappedType defined in org.jetbrains.kotlin.types.FlexibleType[SimpleFunctionDescriptorImpl]

'newAnnotations' @ [51:41] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement.replaceAnnotations[ValueParameterDescriptorImpl]

'wrapEnhancement' @ [51:57] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'enhancement' @ [51:73] ==> public open val enhancement: KotlinType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[PropertyDescriptorImpl]

'origin' @ [54:15] ==> public open val origin: FlexibleType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[PropertyDescriptorImpl]

'makeNullableAsSpecified' @ [54:22] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): UnwrappedType defined in org.jetbrains.kotlin.types.FlexibleType[SimpleFunctionDescriptorImpl]

'newNullability' @ [54:46] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'wrapEnhancement' @ [54:62] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'enhancement' @ [54:78] ==> public open val enhancement: KotlinType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[PropertyDescriptorImpl]

'origin' @ [57:15] ==> public open val origin: FlexibleType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[PropertyDescriptorImpl]

'render' @ [57:22] ==> public abstract fun render(renderer: DescriptorRenderer, options: DescriptorRendererOptions): String defined in org.jetbrains.kotlin.types.FlexibleType[SimpleFunctionDescriptorImpl]

'renderer' @ [57:29] ==> value-parameter renderer: DescriptorRenderer defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement.render[ValueParameterDescriptorImpl]

'options' @ [57:39] ==> value-parameter options: DescriptorRendererOptions defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement.render[ValueParameterDescriptorImpl]

'origin' @ [59:47] ==> public open val origin: FlexibleType defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[PropertyDescriptorImpl]

'delegate' @ [59:54] ==> public abstract val delegate: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[PropertyDescriptorImpl]

'when (this) {
    is TypeWithEnhancement -> enhancement
    else -> null
}' @ [62:48] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: KotlinType?, entry1: KotlinType?): KotlinType?[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> KotlinType?

'this' @ [62:54] ==> <this> defined in org.jetbrains.kotlin.types.getEnhancement[ReceiverParameterDescriptorImpl]

'enhancement' @ [63:31] ==> public abstract val enhancement: KotlinType defined in org.jetbrains.kotlin.types.TypeWithEnhancement[PropertyDescriptorImpl]

'getEnhancement' @ [67:50] ==> public fun KotlinType.getEnhancement(): KotlinType? defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'this' @ [67:70] ==> <this> defined in org.jetbrains.kotlin.types.unwrapEnhancement[ReceiverParameterDescriptorImpl]

'wrapEnhancement' @ [69:75] ==> public fun UnwrappedType.wrapEnhancement(enhancement: KotlinType?): UnwrappedType defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'origin' @ [69:91] ==> value-parameter origin: KotlinType defined in org.jetbrains.kotlin.types.inheritEnhancement[ValueParameterDescriptorImpl]

'getEnhancement' @ [69:98] ==> public fun KotlinType.getEnhancement(): KotlinType? defined in org.jetbrains.kotlin.types in file TypeWithEnhancement.kt[SimpleFunctionDescriptorImpl]

'enhancement' @ [72:9] ==> value-parameter enhancement: KotlinType? defined in org.jetbrains.kotlin.types.wrapEnhancement[ValueParameterDescriptorImpl]

'this' @ [73:16] ==> <this> defined in org.jetbrains.kotlin.types.wrapEnhancement[ReceiverParameterDescriptorImpl]

'when (this) {
        is SimpleType -> SimpleTypeWithEnhancement(this, enhancement)
        is FlexibleType -> FlexibleTypeWithEnhancement(this, enhancement)
    }' @ [76:12] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: UnwrappedType, entry1: UnwrappedType): UnwrappedType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> UnwrappedType

'this' @ [76:18] ==> <this> defined in org.jetbrains.kotlin.types.wrapEnhancement[ReceiverParameterDescriptorImpl]

'SimpleTypeWithEnhancement' @ [77:26] ==> public constructor SimpleTypeWithEnhancement(delegate: SimpleType, enhancement: KotlinType) defined in org.jetbrains.kotlin.types.SimpleTypeWithEnhancement[ClassConstructorDescriptorImpl]

'this' @ [77:52] ==> <this> defined in org.jetbrains.kotlin.types.wrapEnhancement[ReceiverParameterDescriptorImpl]

'enhancement' @ [77:58] ==> value-parameter enhancement: KotlinType? defined in org.jetbrains.kotlin.types.wrapEnhancement[ValueParameterDescriptorImpl]

'FlexibleTypeWithEnhancement' @ [78:28] ==> public constructor FlexibleTypeWithEnhancement(origin: FlexibleType, enhancement: KotlinType) defined in org.jetbrains.kotlin.types.FlexibleTypeWithEnhancement[ClassConstructorDescriptorImpl]

'this' @ [78:56] ==> <this> defined in org.jetbrains.kotlin.types.wrapEnhancement[ReceiverParameterDescriptorImpl]

'enhancement' @ [78:62] ==> value-parameter enhancement: KotlinType? defined in org.jetbrains.kotlin.types.wrapEnhancement[ValueParameterDescriptorImpl]

