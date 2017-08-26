'SimpleType' @ [23:39] ==> public constructor SimpleType() defined in org.jetbrains.kotlin.types.SimpleType[ClassConstructorDescriptorImpl]

'delegate' @ [26:51] ==> protected abstract val delegate: SimpleType defined in org.jetbrains.kotlin.types.DelegatingSimpleType[PropertyDescriptorImpl]

'annotations' @ [26:60] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'delegate' @ [27:55] ==> protected abstract val delegate: SimpleType defined in org.jetbrains.kotlin.types.DelegatingSimpleType[PropertyDescriptorImpl]

'constructor' @ [27:64] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'delegate' @ [28:58] ==> protected abstract val delegate: SimpleType defined in org.jetbrains.kotlin.types.DelegatingSimpleType[PropertyDescriptorImpl]

'arguments' @ [28:67] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'delegate' @ [29:52] ==> protected abstract val delegate: SimpleType defined in org.jetbrains.kotlin.types.DelegatingSimpleType[PropertyDescriptorImpl]

'isMarkedNullable' @ [29:61] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'delegate' @ [30:51] ==> protected abstract val delegate: SimpleType defined in org.jetbrains.kotlin.types.DelegatingSimpleType[PropertyDescriptorImpl]

'memberScope' @ [30:60] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'DelegatingSimpleType' @ [33:90] ==> public constructor DelegatingSimpleType() defined in org.jetbrains.kotlin.types.DelegatingSimpleType[ClassConstructorDescriptorImpl]

'delegate' @ [34:42] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[PropertyDescriptorImpl]

'AbbreviatedType' @ [37:15] ==> public constructor AbbreviatedType(delegate: SimpleType, abbreviation: SimpleType) defined in org.jetbrains.kotlin.types.AbbreviatedType[ClassConstructorDescriptorImpl]

'delegate' @ [37:31] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[PropertyDescriptorImpl]

'replaceAnnotations' @ [37:40] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'newAnnotations' @ [37:59] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.AbbreviatedType.replaceAnnotations[ValueParameterDescriptorImpl]

'abbreviation' @ [37:76] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[PropertyDescriptorImpl]

'AbbreviatedType' @ [40:15] ==> public constructor AbbreviatedType(delegate: SimpleType, abbreviation: SimpleType) defined in org.jetbrains.kotlin.types.AbbreviatedType[ClassConstructorDescriptorImpl]

'delegate' @ [40:31] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[PropertyDescriptorImpl]

'makeNullableAsSpecified' @ [40:40] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'newNullability' @ [40:64] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.AbbreviatedType.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'abbreviation' @ [40:81] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[PropertyDescriptorImpl]

'makeNullableAsSpecified' @ [40:94] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'newNullability' @ [40:118] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.AbbreviatedType.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'unwrap' @ [43:57] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[SimpleFunctionDescriptorImpl]

'getAbbreviatedType' @ [44:49] ==> public fun KotlinType.getAbbreviatedType(): AbbreviatedType? defined in org.jetbrains.kotlin.types in file SpecialTypes.kt[SimpleFunctionDescriptorImpl]

'abbreviation' @ [44:71] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[PropertyDescriptorImpl]

'isError' @ [47:9] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types in file KotlinType.kt[PropertyDescriptorImpl]

'this' @ [47:25] ==> <this> defined in org.jetbrains.kotlin.types.withAbbreviation[ReceiverParameterDescriptorImpl]

'AbbreviatedType' @ [48:12] ==> public constructor AbbreviatedType(delegate: SimpleType, abbreviation: SimpleType) defined in org.jetbrains.kotlin.types.AbbreviatedType[ClassConstructorDescriptorImpl]

'this' @ [48:28] ==> <this> defined in org.jetbrains.kotlin.types.withAbbreviation[ReceiverParameterDescriptorImpl]

'abbreviatedType' @ [48:34] ==> value-parameter abbreviatedType: SimpleType defined in org.jetbrains.kotlin.types.withAbbreviation[ValueParameterDescriptorImpl]

'WrappedType' @ [51:87] ==> public constructor WrappedType() defined in org.jetbrains.kotlin.types.WrappedType[ClassConstructorDescriptorImpl]

'storageManager' @ [52:29] ==> value-parameter storageManager: StorageManager defined in org.jetbrains.kotlin.types.LazyWrappedType.<init>[ValueParameterDescriptorImpl]

'createLazyValue' @ [52:44] ==> public abstract fun <T : Any> createLazyValue(computable: () -> KotlinType): NotNullLazyValue<KotlinType> defined in org.jetbrains.kotlin.storage.StorageManager[SimpleFunctionDescriptorImpl]
Inferred types:
    <T : Any> -> KotlinType

'computation' @ [52:60] ==> value-parameter computation: () -> KotlinType defined in org.jetbrains.kotlin.types.LazyWrappedType.<init>[ValueParameterDescriptorImpl]

'invoke' @ [54:47] ==> public abstract fun invoke(): KotlinType defined in org.jetbrains.kotlin.storage.NotNullLazyValue[FunctionInvokeDescriptor]

'lazyValue' @ [56:42] ==> private final val lazyValue: NotNullLazyValue<KotlinType> defined in org.jetbrains.kotlin.types.LazyWrappedType[PropertyDescriptorImpl]

'isComputed' @ [56:52] ==> public abstract fun isComputed(): Boolean defined in org.jetbrains.kotlin.storage.NotNullLazyValue[SimpleFunctionDescriptorImpl]

