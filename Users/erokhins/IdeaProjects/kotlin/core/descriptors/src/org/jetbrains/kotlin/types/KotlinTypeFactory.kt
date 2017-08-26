'constructor' @ [28:26] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [28:38] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'when (descriptor) {
            is TypeParameterDescriptor -> descriptor.getDefaultType().memberScope
            is ClassDescriptor ->  descriptor.getMemberScope(TypeConstructorSubstitution.create(constructor, arguments))
            is TypeAliasDescriptor -> ErrorUtils.createErrorScope("Scope for abbreviation: ${descriptor.name}", true)
            else -> throw IllegalStateException("Unsupported classifier: $descriptor for constructor: $constructor")
        }' @ [29:16] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: MemberScope, entry1: MemberScope, entry2: MemberScope, entry3: MemberScope): MemberScope[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> MemberScope

'descriptor' @ [29:22] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[LocalVariableDescriptor]

'descriptor' @ [30:43] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[LocalVariableDescriptor]

'getDefaultType' @ [30:54] ==> @NotNull public abstract fun getDefaultType(): SimpleType defined in org.jetbrains.kotlin.descriptors.ClassifierDescriptor[JavaMethodDescriptor]

'memberScope' @ [30:71] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'descriptor' @ [31:36] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[LocalVariableDescriptor]

'getMemberScope' @ [31:47] ==> @NotNull public abstract fun getMemberScope(@NotNull typeSubstitution: TypeSubstitution): MemberScope defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[JavaMethodDescriptor]

'TypeConstructorSubstitution' @ [31:62] ==> public companion object defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution[FakeCallableDescriptorForObject]

'create' @ [31:90] ==> @JvmStatic public final fun create(typeConstructor: TypeConstructor, arguments: List<TypeProjection>): TypeSubstitution defined in org.jetbrains.kotlin.types.TypeConstructorSubstitution.Companion[SimpleFunctionDescriptorImpl]

'constructor' @ [31:97] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[ValueParameterDescriptorImpl]

'arguments' @ [31:110] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[ValueParameterDescriptorImpl]

'createErrorScope' @ [32:50] ==> @NotNull public open fun createErrorScope(@NotNull debugMessage: String, throwExceptions: Boolean): MemberScope defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'descriptor' @ [32:94] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[LocalVariableDescriptor]

'name' @ [32:105] ==> public final val TypeAliasDescriptor.name: Name[MyPropertyDescriptor]

'IllegalStateException' @ [33:27] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'descriptor' @ [33:75] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[LocalVariableDescriptor]

'constructor' @ [33:104] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.computeMemberScope[ValueParameterDescriptorImpl]

'JvmStatic' @ [37:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'annotations' @ [44:13] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'isEmpty' @ [44:25] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'arguments' @ [44:38] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'isEmpty' @ [44:48] ==> public abstract fun isEmpty(): Boolean defined in kotlin.collections.List[DeserializedSimpleFunctionDescriptor]

'!' @ [44:61] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'nullable' @ [44:62] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'constructor' @ [44:74] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [44:86] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'constructor' @ [45:20] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'declarationDescriptor' @ [45:32] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'defaultType' @ [45:56] ==> public final val ClassifierDescriptor.defaultType: SimpleType[MyPropertyDescriptor]

'simpleType' @ [48:16] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'annotations' @ [48:27] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'constructor' @ [48:40] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'arguments' @ [48:53] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'nullable' @ [48:64] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'computeMemberScope' @ [48:74] ==> private final fun computeMemberScope(constructor: TypeConstructor, arguments: List<TypeProjection>): MemberScope defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'constructor' @ [48:93] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'arguments' @ [48:106] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'JvmStatic' @ [51:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'SimpleTypeImpl' @ [59:13] ==> public constructor SimpleTypeImpl(constructor: TypeConstructor, arguments: List<TypeProjection>, isMarkedNullable: Boolean, memberScope: MemberScope) defined in org.jetbrains.kotlin.types.SimpleTypeImpl[ClassConstructorDescriptorImpl]

'constructor' @ [59:28] ==> value-parameter constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'arguments' @ [59:41] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'nullable' @ [59:52] ==> value-parameter nullable: Boolean defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'memberScope' @ [59:62] ==> value-parameter memberScope: MemberScope defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'let' @ [60:22] ==> @InlineOnly public inline fun <T, R> SimpleTypeImpl.let(block: (SimpleTypeImpl) -> SimpleType): SimpleType defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> SimpleTypeImpl
    <R> -> SimpleType

'if (annotations.isEmpty())
                            it
                        else
                            AnnotatedSimpleType(it, annotations)' @ [61:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'annotations' @ [61:29] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'isEmpty' @ [61:41] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'it' @ [62:29] ==> value-parameter it: SimpleTypeImpl defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType.<anonymous>[ValueParameterDescriptorImpl]

'AnnotatedSimpleType' @ [64:29] ==> public constructor AnnotatedSimpleType(delegate: SimpleType, annotations: Annotations) defined in org.jetbrains.kotlin.types.AnnotatedSimpleType[ClassConstructorDescriptorImpl]

'it' @ [64:49] ==> value-parameter it: SimpleTypeImpl defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType.<anonymous>[ValueParameterDescriptorImpl]

'annotations' @ [64:53] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'JvmStatic' @ [67:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'simpleType' @ [72:21] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'annotations' @ [72:32] ==> value-parameter annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleNotNullType[ValueParameterDescriptorImpl]

'descriptor' @ [72:45] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleNotNullType[ValueParameterDescriptorImpl]

'typeConstructor' @ [72:56] ==> public final val ClassDescriptor.typeConstructor: TypeConstructor[MyPropertyDescriptor]

'arguments' @ [72:73] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleNotNullType[ValueParameterDescriptorImpl]

'descriptor' @ [72:91] ==> value-parameter descriptor: ClassDescriptor defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleNotNullType[ValueParameterDescriptorImpl]

'getMemberScope' @ [72:102] ==> @NotNull public abstract fun getMemberScope(@NotNull typeArguments: (MutableList<out (TypeProjection..TypeProjection?)>..List<(TypeProjection..TypeProjection?)>)): MemberScope defined in org.jetbrains.kotlin.descriptors.ClassDescriptor[JavaMethodDescriptor]

'arguments' @ [72:117] ==> value-parameter arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleNotNullType[ValueParameterDescriptorImpl]

'JvmStatic' @ [74:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'baseType' @ [77:40] ==> value-parameter baseType: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'annotations' @ [77:49] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'baseType' @ [78:44] ==> value-parameter baseType: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'constructor' @ [78:53] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'baseType' @ [79:47] ==> value-parameter baseType: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'arguments' @ [79:56] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'baseType' @ [80:33] ==> value-parameter baseType: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [80:42] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'baseType' @ [81:40] ==> value-parameter baseType: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'memberScope' @ [81:49] ==> public abstract val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleType[PropertyDescriptorImpl]

'simpleType' @ [82:21] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[SimpleFunctionDescriptorImpl]

'annotations' @ [82:32] ==> value-parameter annotations: Annotations = ... defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'constructor' @ [82:45] ==> value-parameter constructor: TypeConstructor = ... defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'arguments' @ [82:58] ==> value-parameter arguments: List<TypeProjection> = ... defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'nullable' @ [82:69] ==> value-parameter nullable: Boolean = ... defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'memberScope' @ [82:79] ==> value-parameter memberScope: MemberScope = ... defined in org.jetbrains.kotlin.types.KotlinTypeFactory.simpleType[ValueParameterDescriptorImpl]

'JvmStatic' @ [84:5] ==> public constructor JvmStatic() defined in kotlin.jvm.JvmStatic[DeserializedClassConstructorDescriptor]

'lowerBound' @ [86:13] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.flexibleType[ValueParameterDescriptorImpl]

'upperBound' @ [86:27] ==> value-parameter upperBound: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.flexibleType[ValueParameterDescriptorImpl]

'lowerBound' @ [86:46] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.flexibleType[ValueParameterDescriptorImpl]

'FlexibleTypeImpl' @ [87:16] ==> public constructor FlexibleTypeImpl(lowerBound: SimpleType, upperBound: SimpleType) defined in org.jetbrains.kotlin.types.FlexibleTypeImpl[ClassConstructorDescriptorImpl]

'lowerBound' @ [87:33] ==> value-parameter lowerBound: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.flexibleType[ValueParameterDescriptorImpl]

'upperBound' @ [87:45] ==> value-parameter upperBound: SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory.flexibleType[ValueParameterDescriptorImpl]

'SimpleType' @ [96:5] ==> public constructor SimpleType() defined in org.jetbrains.kotlin.types.SimpleType[ClassConstructorDescriptorImpl]

'Annotations' @ [97:51] ==> public companion object defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[FakeCallableDescriptorForObject]

'EMPTY' @ [97:63] ==> public final val EMPTY: Annotations defined in org.jetbrains.kotlin.descriptors.annotations.Annotations.Companion[PropertyDescriptorImpl]

'if (newAnnotations.isEmpty())
                this
            else
                AnnotatedSimpleType(this, newAnnotations)' @ [100:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'newAnnotations' @ [100:17] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.SimpleTypeImpl.replaceAnnotations[ValueParameterDescriptorImpl]

'isEmpty' @ [100:32] ==> public abstract fun isEmpty(): Boolean defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[SimpleFunctionDescriptorImpl]

'this' @ [101:17] ==> <this> defined in org.jetbrains.kotlin.types.SimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'AnnotatedSimpleType' @ [103:17] ==> public constructor AnnotatedSimpleType(delegate: SimpleType, annotations: Annotations) defined in org.jetbrains.kotlin.types.AnnotatedSimpleType[ClassConstructorDescriptorImpl]

'this' @ [103:37] ==> <this> defined in org.jetbrains.kotlin.types.SimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'newAnnotations' @ [103:43] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.SimpleTypeImpl.replaceAnnotations[ValueParameterDescriptorImpl]

'if (newNullability == isMarkedNullable)
                this
            else if (newNullability)
                NullableSimpleType(this)
            else
                NotNullSimpleType(this)' @ [106:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'newNullability' @ [106:17] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.SimpleTypeImpl.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [106:35] ==> public open val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleTypeImpl[PropertyDescriptorImpl]

'this' @ [107:17] ==> <this> defined in org.jetbrains.kotlin.types.SimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'if (newNullability)
                NullableSimpleType(this)
            else
                NotNullSimpleType(this)' @ [108:18] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DelegatingSimpleTypeImpl, elseBranch: DelegatingSimpleTypeImpl): DelegatingSimpleTypeImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DelegatingSimpleTypeImpl

'newNullability' @ [108:22] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.SimpleTypeImpl.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'NullableSimpleType' @ [109:17] ==> public constructor NullableSimpleType(delegate: SimpleType) defined in org.jetbrains.kotlin.types.NullableSimpleType[ClassConstructorDescriptorImpl]

'this' @ [109:36] ==> <this> defined in org.jetbrains.kotlin.types.SimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'NotNullSimpleType' @ [111:17] ==> public constructor NotNullSimpleType(delegate: SimpleType) defined in org.jetbrains.kotlin.types.NotNullSimpleType[ClassConstructorDescriptorImpl]

'this' @ [111:35] ==> <this> defined in org.jetbrains.kotlin.types.SimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'memberScope' @ [114:13] ==> public open val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleTypeImpl[PropertyDescriptorImpl]

'IllegalStateException' @ [115:19] ==> public constructor IllegalStateException(p0: (String..String?)) defined in java.lang.IllegalStateException[JavaClassConstructorDescriptor]

'memberScope' @ [115:96] ==> public open val memberScope: MemberScope defined in org.jetbrains.kotlin.types.SimpleTypeImpl[PropertyDescriptorImpl]

'constructor' @ [115:110] ==> public open val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleTypeImpl[PropertyDescriptorImpl]

'DelegatingSimpleType' @ [120:78] ==> public constructor DelegatingSimpleType() defined in org.jetbrains.kotlin.types.DelegatingSimpleType[ClassConstructorDescriptorImpl]

'if (newAnnotations !== annotations)
                AnnotatedSimpleType(this, newAnnotations)
            else
                this' @ [122:13] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: DelegatingSimpleTypeImpl, elseBranch: DelegatingSimpleTypeImpl): DelegatingSimpleTypeImpl[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> DelegatingSimpleTypeImpl

'newAnnotations' @ [122:17] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl.replaceAnnotations[ValueParameterDescriptorImpl]

'annotations' @ [122:36] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[PropertyDescriptorImpl]

'AnnotatedSimpleType' @ [123:17] ==> public constructor AnnotatedSimpleType(delegate: SimpleType, annotations: Annotations) defined in org.jetbrains.kotlin.types.AnnotatedSimpleType[ClassConstructorDescriptorImpl]

'this' @ [123:37] ==> <this> defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'newAnnotations' @ [123:43] ==> value-parameter newAnnotations: Annotations defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl.replaceAnnotations[ValueParameterDescriptorImpl]

'this' @ [125:17] ==> <this> defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'newNullability' @ [128:13] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'isMarkedNullable' @ [128:31] ==> public open val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[PropertyDescriptorImpl]

'this' @ [128:56] ==> <this> defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[LazyClassReceiverParameterDescriptor]

'delegate' @ [129:16] ==> protected open val delegate: SimpleType defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[PropertyDescriptorImpl]

'makeNullableAsSpecified' @ [129:25] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'newNullability' @ [129:49] ==> value-parameter newNullability: Boolean defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl.makeNullableAsSpecified[ValueParameterDescriptorImpl]

'replaceAnnotations' @ [129:65] ==> public abstract fun replaceAnnotations(newAnnotations: Annotations): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[SimpleFunctionDescriptorImpl]

'annotations' @ [129:84] ==> public open val annotations: Annotations defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[PropertyDescriptorImpl]

'DelegatingSimpleTypeImpl' @ [136:5] ==> public constructor DelegatingSimpleTypeImpl(delegate: SimpleType) defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[ClassConstructorDescriptorImpl]

'delegate' @ [136:30] ==> value-parameter delegate: SimpleType defined in org.jetbrains.kotlin.types.AnnotatedSimpleType.<init>[ValueParameterDescriptorImpl]

'DelegatingSimpleTypeImpl' @ [138:58] ==> public constructor DelegatingSimpleTypeImpl(delegate: SimpleType) defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[ClassConstructorDescriptorImpl]

'delegate' @ [138:83] ==> value-parameter delegate: SimpleType defined in org.jetbrains.kotlin.types.NullableSimpleType.<init>[ValueParameterDescriptorImpl]

'DelegatingSimpleTypeImpl' @ [143:57] ==> public constructor DelegatingSimpleTypeImpl(delegate: SimpleType) defined in org.jetbrains.kotlin.types.DelegatingSimpleTypeImpl[ClassConstructorDescriptorImpl]

'delegate' @ [143:82] ==> value-parameter delegate: SimpleType defined in org.jetbrains.kotlin.types.NotNullSimpleType.<init>[ValueParameterDescriptorImpl]

