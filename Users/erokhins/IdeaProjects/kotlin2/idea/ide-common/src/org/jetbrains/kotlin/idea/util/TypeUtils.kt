'JvmName' @ [17:1] ==> public constructor JvmName(name: String) defined in kotlin.jvm.JvmName[DeserializedClassConstructorDescriptor]

'isDynamic' @ [41:9] ==> public fun KotlinType.isDynamic(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'this' @ [41:29] ==> <this> defined in org.jetbrains.kotlin.idea.util.approximateFlexibleTypes[ReceiverParameterDescriptorImpl]

'approximateNonDynamicFlexibleTypes' @ [42:12] ==> private fun KotlinType.approximateNonDynamicFlexibleTypes(preferNotNull: Boolean = ..., preferStarForRaw: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'preferNotNull' @ [42:47] ==> value-parameter preferNotNull: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateFlexibleTypes[ValueParameterDescriptorImpl]

'preferStarForRaw' @ [42:62] ==> value-parameter preferStarForRaw: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateFlexibleTypes[ValueParameterDescriptorImpl]

'isFlexible' @ [49:9] ==> public fun KotlinType.isFlexible(): Boolean defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'asFlexibleType' @ [50:24] ==> public fun KotlinType.asFlexibleType(): FlexibleType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'flexible' @ [51:26] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'lowerBound' @ [51:35] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'constructor' @ [51:46] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [51:58] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'lowerClass' @ [52:28] ==> val lowerClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'JavaToKotlinClassMap' @ [52:50] ==> public object JavaToKotlinClassMap : PlatformToKotlinClassMap defined in org.jetbrains.kotlin.platform[FakeCallableDescriptorForObject]

'isMutable' @ [52:71] ==> public final fun isMutable(mutable: ClassDescriptor): Boolean defined in org.jetbrains.kotlin.platform.JavaToKotlinClassMap[DeserializedSimpleFunctionDescriptor]

'lowerClass' @ [52:81] ==> val lowerClass: ClassDescriptor? defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'if (isCollection)
                    (if (isAnnotatedReadOnly()) flexible.upperBound else flexible.lowerBound).makeNullableAsSpecified(!preferNotNull)
                else
                    if (this is RawType && preferStarForRaw) flexible.upperBound.makeNullableAsSpecified(!preferNotNull)
                else
                    if (preferNotNull) flexible.lowerBound else flexible.upperBound' @ [58:17] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'isCollection' @ [58:21] ==> val isCollection: Boolean defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'if (isAnnotatedReadOnly()) flexible.upperBound else flexible.lowerBound' @ [59:22] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'isAnnotatedReadOnly' @ [59:26] ==> public fun KotlinType.isAnnotatedReadOnly(): Boolean defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'flexible' @ [59:49] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'upperBound' @ [59:58] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'flexible' @ [59:74] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'lowerBound' @ [59:83] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'makeNullableAsSpecified' @ [59:95] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'!' @ [59:119] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'preferNotNull' @ [59:120] ==> value-parameter preferNotNull: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[ValueParameterDescriptorImpl]

'if (this is RawType && preferStarForRaw) flexible.upperBound.makeNullableAsSpecified(!preferNotNull)
                else
                    if (preferNotNull) flexible.lowerBound else flexible.upperBound' @ [61:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'this' @ [61:25] ==> <this> defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[ReceiverParameterDescriptorImpl]

'preferStarForRaw' @ [61:44] ==> value-parameter preferStarForRaw: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[ValueParameterDescriptorImpl]

'flexible' @ [61:62] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'upperBound' @ [61:71] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'makeNullableAsSpecified' @ [61:82] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'!' @ [61:106] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'preferNotNull' @ [61:107] ==> value-parameter preferNotNull: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[ValueParameterDescriptorImpl]

'if (preferNotNull) flexible.lowerBound else flexible.upperBound' @ [63:21] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'preferNotNull' @ [63:25] ==> value-parameter preferNotNull: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[ValueParameterDescriptorImpl]

'flexible' @ [63:40] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'lowerBound' @ [63:49] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'flexible' @ [63:65] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'upperBound' @ [63:74] ==> public final val upperBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'approximation' @ [65:9] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'approximation' @ [65:25] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'approximateNonDynamicFlexibleTypes' @ [65:39] ==> private fun KotlinType.approximateNonDynamicFlexibleTypes(preferNotNull: Boolean = ..., preferStarForRaw: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'approximation' @ [67:9] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'if (nullability() == TypeNullability.NOT_NULL) approximation.makeNullableAsSpecified(false) else approximation' @ [67:25] ==> public final fun <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-IF-RESOLVE>`(thenBranch: SimpleType, elseBranch: SimpleType): SimpleType[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-IF-RESOLVE>`> -> SimpleType

'nullability' @ [67:29] ==> public fun KotlinType.nullability(): TypeNullability defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'NOT_NULL' @ [67:62] ==> enum entry NOT_NULL defined in org.jetbrains.kotlin.types.typeUtil.TypeNullability[FakeCallableDescriptorForObject]

'approximation' @ [67:72] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [67:86] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'approximation' @ [67:122] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'approximation' @ [69:13] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'isMarkedNullable' @ [69:27] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'!' @ [69:47] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'flexible' @ [69:48] ==> val flexible: FlexibleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'lowerBound' @ [69:57] ==> public final val lowerBound: SimpleType defined in org.jetbrains.kotlin.types.FlexibleType[DeserializedPropertyDescriptor]

'isMarkedNullable' @ [69:68] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.SimpleType[DeserializedPropertyDescriptor]

'isTypeParameter' @ [69:98] ==> public open fun isTypeParameter(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'approximation' @ [69:114] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'hasNullableSuperType' @ [69:142] ==> public open fun hasNullableSuperType(@NotNull p0: KotlinType): Boolean defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'approximation' @ [69:163] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'approximation' @ [70:13] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'approximation' @ [70:29] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'makeNullableAsSpecified' @ [70:43] ==> public abstract fun makeNullableAsSpecified(newNullability: Boolean): SimpleType defined in org.jetbrains.kotlin.types.SimpleType[DeserializedSimpleFunctionDescriptor]

'approximation' @ [73:16] ==> var approximation: SimpleType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[LocalVariableDescriptor]

'unwrap' @ [76:6] ==> public abstract fun unwrap(): UnwrappedType defined in org.jetbrains.kotlin.types.KotlinType[DeserializedSimpleFunctionDescriptor]

'let' @ [76:37] ==> @InlineOnly public inline fun <T, R> AbbreviatedType.let(block: (AbbreviatedType) -> Nothing): Nothing defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> AbbreviatedType
    <R> -> Nothing

'AbbreviatedType' @ [77:16] ==> public constructor AbbreviatedType(delegate: SimpleType, abbreviation: SimpleType) defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedClassConstructorDescriptor]

'it' @ [77:32] ==> value-parameter it: AbbreviatedType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes.<anonymous>[ValueParameterDescriptorImpl]

'expandedType' @ [77:35] ==> public final val expandedType: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'it' @ [77:49] ==> value-parameter it: AbbreviatedType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes.<anonymous>[ValueParameterDescriptorImpl]

'abbreviation' @ [77:52] ==> public final val abbreviation: SimpleType defined in org.jetbrains.kotlin.types.AbbreviatedType[DeserializedPropertyDescriptor]

'approximateNonDynamicFlexibleTypes' @ [77:65] ==> private fun KotlinType.approximateNonDynamicFlexibleTypes(preferNotNull: Boolean = ..., preferStarForRaw: Boolean = ...): SimpleType defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'preferNotNull' @ [77:100] ==> value-parameter preferNotNull: Boolean = ... defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes[ValueParameterDescriptorImpl]

'KotlinTypeFactory' @ [79:12] ==> public object KotlinTypeFactory defined in org.jetbrains.kotlin.types[FakeCallableDescriptorForObject]

'simpleType' @ [79:30] ==> @JvmStatic public final fun simpleType(annotations: Annotations, constructor: TypeConstructor, arguments: List<TypeProjection>, nullable: Boolean, memberScope: MemberScope): SimpleType defined in org.jetbrains.kotlin.types.KotlinTypeFactory[DeserializedSimpleFunctionDescriptor]

'annotations' @ [79:41] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'constructor' @ [80:41] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'arguments' @ [81:41] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'map' @ [81:51] ==> public inline fun <T, R> Iterable<TypeProjection>.map(transform: (TypeProjection) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <R> -> TypeProjection

'it' @ [81:57] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes.<anonymous>[ValueParameterDescriptorImpl]

'substitute' @ [81:60] ==> public fun TypeProjection.substitute(doSubstitute: (KotlinType) -> KotlinType): TypeProjection defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'type' @ [81:81] ==> value-parameter type: KotlinType defined in org.jetbrains.kotlin.idea.util.approximateNonDynamicFlexibleTypes.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'approximateFlexibleTypes' @ [81:86] ==> public fun KotlinType.approximateFlexibleTypes(preferNotNull: Boolean = ..., preferStarForRaw: Boolean = ...): KotlinType defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'isMarkedNullable' @ [82:41] ==> public abstract val isMarkedNullable: Boolean defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'createErrorScope' @ [83:52] ==> @NotNull public open fun createErrorScope(@NotNull p0: String, p1: Boolean): MemberScope defined in org.jetbrains.kotlin.types.ErrorUtils[JavaMethodDescriptor]

'hasAnnotationMaybeExternal' @ [87:49] ==> private fun KotlinType.hasAnnotationMaybeExternal(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]

'JETBRAINS_READONLY_ANNOTATION' @ [87:76] ==> public final val JETBRAINS_READONLY_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'hasAnnotationMaybeExternal' @ [88:48] ==> private fun KotlinType.hasAnnotationMaybeExternal(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]

'JETBRAINS_NOT_NULL_ANNOTATION' @ [88:75] ==> public final val JETBRAINS_NOT_NULL_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'hasAnnotationMaybeExternal' @ [89:49] ==> private fun KotlinType.hasAnnotationMaybeExternal(fqName: FqName): Boolean defined in org.jetbrains.kotlin.idea.util[SimpleFunctionDescriptorImpl]

'JETBRAINS_NULLABLE_ANNOTATION' @ [89:76] ==> public final val JETBRAINS_NULLABLE_ANNOTATION: (FqName..FqName?) defined in org.jetbrains.kotlin.load.java.JvmAnnotationNames[JavaPropertyDescriptor]

'with' @ [91:69] ==> @InlineOnly public inline fun <T, R> with(receiver: Annotations, block: Annotations.() -> AnnotationDescriptor?): AnnotationDescriptor? defined in kotlin[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Annotations
    <R> -> AnnotationDescriptor?

'annotations' @ [91:75] ==> public abstract val annotations: Annotations defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'findAnnotation' @ [92:5] ==> public open fun findAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'fqName' @ [92:20] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.util.hasAnnotationMaybeExternal[ValueParameterDescriptorImpl]

'findExternalAnnotation' @ [92:31] ==> public open fun findExternalAnnotation(fqName: FqName): AnnotationDescriptor? defined in org.jetbrains.kotlin.descriptors.annotations.Annotations[DeserializedSimpleFunctionDescriptor]

'fqName' @ [92:54] ==> value-parameter fqName: FqName defined in org.jetbrains.kotlin.idea.util.hasAnnotationMaybeExternal[ValueParameterDescriptorImpl]

'constructor' @ [96:9] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'!' @ [97:13] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'allowIntersections' @ [97:14] ==> value-parameter allowIntersections: Boolean = ... defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'constructor' @ [98:16] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'supertypes' @ [98:28] ==> public final val TypeConstructor.supertypes: Collection<(KotlinType..KotlinType?)>[MyPropertyDescriptor]

'all' @ [98:39] ==> public inline fun <T> Iterable<(KotlinType..KotlinType?)>.all(predicate: ((KotlinType..KotlinType?)) -> Boolean): Boolean defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [98:45] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.isResolvableInScope.<anonymous>[ValueParameterDescriptorImpl]

'isResolvableInScope' @ [98:48] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [98:68] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [98:75] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'allowIntersections' @ [98:96] ==> value-parameter allowIntersections: Boolean = ... defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'canBeReferencedViaImport' @ [101:9] ==> public fun KotlinType.canBeReferencedViaImport(): Boolean defined in org.jetbrains.kotlin.idea.imports in file ImportsUtils.kt[SimpleFunctionDescriptorImpl]

'constructor' @ [103:22] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [103:34] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'descriptor' @ [104:9] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[LocalVariableDescriptor]

'descriptor' @ [104:31] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[LocalVariableDescriptor]

'name' @ [104:42] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'isSpecial' @ [104:47] ==> public final val Name.isSpecial: Boolean[MyPropertyDescriptor]

'!' @ [105:9] ==> public final operator fun not(): Boolean defined in kotlin.Boolean[DeserializedSimpleFunctionDescriptor]

'checkTypeParameters' @ [105:10] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'descriptor' @ [105:33] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[LocalVariableDescriptor]

'scope' @ [107:12] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'scope' @ [107:29] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[ValueParameterDescriptorImpl]

'findClassifier' @ [107:35] ==> public fun HierarchicalScope.findClassifier(name: Name, location: LookupLocation): ClassifierDescriptor? defined in org.jetbrains.kotlin.resolve.scopes.utils[DeserializedSimpleFunctionDescriptor]

'descriptor' @ [107:50] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[LocalVariableDescriptor]

'name' @ [107:61] ==> public final val ClassifierDescriptor.name: Name[MyPropertyDescriptor]

'FROM_IDE' @ [107:84] ==> enum entry FROM_IDE defined in org.jetbrains.kotlin.incremental.components.NoLookupLocation[FakeCallableDescriptorForObject]

'descriptor' @ [107:97] ==> val descriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.isResolvableInScope[LocalVariableDescriptor]

'isError' @ [111:9] ==> public val KotlinType.isError: Boolean defined in org.jetbrains.kotlin.types[DeserializedPropertyDescriptor]

'isResolvableInScope' @ [111:20] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [111:40] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.approximateWithResolvableType[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [111:47] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.approximateWithResolvableType[ValueParameterDescriptorImpl]

'this' @ [111:76] ==> <this> defined in org.jetbrains.kotlin.idea.util.approximateWithResolvableType[ReceiverParameterDescriptorImpl]

'supertypes' @ [112:12] ==> public fun KotlinType.supertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [112:25] ==> public inline fun <T> Iterable<KotlinType>.firstOrNull(predicate: (KotlinType) -> Boolean): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'it' @ [112:39] ==> value-parameter it: KotlinType defined in org.jetbrains.kotlin.idea.util.approximateWithResolvableType.<anonymous>[ValueParameterDescriptorImpl]

'isResolvableInScope' @ [112:42] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [112:62] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.approximateWithResolvableType[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [112:69] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.approximateWithResolvableType[ValueParameterDescriptorImpl]

'builtIns' @ [113:15] ==> public val KotlinType.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.types.typeUtil[DeserializedPropertyDescriptor]

'anyType' @ [113:24] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'constructor' @ [117:27] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [117:39] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'classDescriptor' @ [118:9] ==> val classDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.anonymousObjectSuperTypeOrNull[LocalVariableDescriptor]

'isAnonymousObject' @ [118:52] ==> public open fun isAnonymousObject(@NotNull p0: DeclarationDescriptor): Boolean defined in org.jetbrains.kotlin.resolve.DescriptorUtils[JavaMethodDescriptor]

'classDescriptor' @ [118:70] ==> val classDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.anonymousObjectSuperTypeOrNull[LocalVariableDescriptor]

'immediateSupertypes' @ [119:16] ==> public fun KotlinType.immediateSupertypes(): Collection<KotlinType> defined in org.jetbrains.kotlin.types.typeUtil[DeserializedSimpleFunctionDescriptor]

'firstOrNull' @ [119:38] ==> public fun <T> Iterable<KotlinType>.firstOrNull(): KotlinType? defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'classDescriptor' @ [119:55] ==> val classDescriptor: ClassifierDescriptor? defined in org.jetbrains.kotlin.idea.util.anonymousObjectSuperTypeOrNull[LocalVariableDescriptor]

'builtIns' @ [119:71] ==> public val DeclarationDescriptor.builtIns: KotlinBuiltIns defined in org.jetbrains.kotlin.resolve.descriptorUtil[DeserializedPropertyDescriptor]

'anyType' @ [119:80] ==> public final val KotlinBuiltIns.anyType: SimpleType[MyPropertyDescriptor]

'listOf' @ [129:13] ==> public fun <T> listOf(element: KotlinType): List<KotlinType> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> KotlinType

'this' @ [129:20] ==> <this> defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ReceiverParameterDescriptorImpl]

'getAllSupertypes' @ [129:38] ==> @NotNull public open fun getAllSupertypes(@NotNull p0: KotlinType): (MutableSet<(KotlinType..KotlinType?)>..Set<(KotlinType..KotlinType?)>) defined in org.jetbrains.kotlin.types.TypeUtils[JavaMethodDescriptor]

'this' @ [129:55] ==> <this> defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ReceiverParameterDescriptorImpl]

'asSequence' @ [130:14] ==> public fun <T> Iterable<(KotlinType..KotlinType?)>.asSequence(): Sequence<(KotlinType..KotlinType?)> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'filter' @ [131:14] ==> public fun <T> Sequence<(KotlinType..KotlinType?)>.filter(predicate: ((KotlinType..KotlinType?)) -> Boolean): Sequence<(KotlinType..KotlinType?)> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)

'it' @ [131:23] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'isResolvableInScope' @ [131:26] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [131:46] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [131:53] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'allowIntersections' @ [131:74] ==> value-parameter allowIntersections: Boolean = ... defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'mapNotNull' @ [132:14] ==> public fun <T, R : Any> Sequence<(KotlinType..KotlinType?)>.mapNotNull(transform: ((KotlinType..KotlinType?)) -> KotlinType?): Sequence<KotlinType> defined in kotlin.sequences[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> (org.jetbrains.kotlin.types.KotlinType..org.jetbrains.kotlin.types.KotlinType?)
    <R : Any> -> KotlinType

'it' @ [133:38] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [133:41] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'filterTo' @ [133:51] ==> public inline fun <T, C : MutableCollection<in TypeProjection>> Iterable<TypeProjection>.filterTo(destination: SmartSet<TypeProjection>, predicate: (TypeProjection) -> Boolean): SmartSet<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection
    <C : MutableCollection<in T>> -> SmartSet<TypeProjection>

'SmartSet' @ [133:60] ==> public companion object defined in org.jetbrains.kotlin.utils.SmartSet[FakeCallableDescriptorForObject]

'create' @ [133:69] ==> @JvmStatic public final fun <T> create(): SmartSet<TypeProjection> defined in org.jetbrains.kotlin.utils.SmartSet.Companion[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> TypeProjection

'it' @ [133:81] ==> value-parameter it: TypeProjection defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'type' @ [133:84] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'isResolvableInScope' @ [133:89] ==> public fun KotlinType.isResolvableInScope(scope: LexicalScope?, checkTypeParameters: Boolean, allowIntersections: Boolean = ...): Boolean defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [133:109] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [133:116] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'resolvableArgs' @ [134:21] ==> val resolvableArgs: SmartSet<TypeProjection> defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[LocalVariableDescriptor]

'containsAll' @ [134:36] ==> public open fun containsAll(elements: Collection<(TypeProjection..TypeProjection?)>): Boolean defined in org.jetbrains.kotlin.utils.SmartSet[JavaMethodDescriptor]

'it' @ [134:48] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [134:51] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'it' @ [134:78] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'it' @ [136:37] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'arguments' @ [136:40] ==> public abstract val arguments: List<TypeProjection> defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'it' @ [136:54] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'constructor' @ [136:57] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'parameters' @ [136:69] ==> public final val TypeConstructor.parameters: List<(TypeParameterDescriptor..TypeParameterDescriptor?)>[MyPropertyDescriptor]

'map' @ [136:81] ==> public inline fun <T, R> Iterable<Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>>.map(transform: (Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)>) -> TypeProjection): List<TypeProjection> defined in kotlin.collections[DeserializedSimpleFunctionDescriptor]
Inferred types:
    <T> -> Pair<TypeProjection, (org.jetbrains.kotlin.descriptors.TypeParameterDescriptor..org.jetbrains.kotlin.descriptors.TypeParameterDescriptor?)>
    <R> -> TypeProjection

'component1' @ [137:26] ==> public final operator fun component1(): TypeProjection defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'component2' @ [137:31] ==> public final operator fun component2(): (TypeParameterDescriptor..TypeParameterDescriptor?) defined in kotlin.Pair[DeserializedSimpleFunctionDescriptor]

'it' @ [137:40] ==> value-parameter it: Pair<TypeProjection, (TypeParameterDescriptor..TypeParameterDescriptor?)> defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[ValueParameterDescriptorImpl]

'when {
                        arg in resolvableArgs -> arg

                        arg.projectionKind == Variance.OUT_VARIANCE ||
                        param.variance == Variance.OUT_VARIANCE -> TypeProjectionImpl(
                                arg.projectionKind,
                                arg.type.approximateWithResolvableType(scope, checkTypeParameters)
                        )

                        else -> return@mapArgs null
                    }' @ [138:21] ==> public final fun <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> `<SPECIAL-FUNCTION-FOR-WHEN-RESOLVE>`(entry0: TypeProjection, entry1: TypeProjection, entry2: TypeProjection): TypeProjection[SimpleFunctionDescriptorImpl]
Inferred types:
    <`<TYPE-PARAMETER-FOR-WHEN-RESOLVE>`> -> TypeProjection

'arg' @ [139:25] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'resolvableArgs' @ [139:32] ==> val resolvableArgs: SmartSet<TypeProjection> defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[LocalVariableDescriptor]

'arg' @ [139:50] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'arg' @ [141:25] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'projectionKind' @ [141:29] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'OUT_VARIANCE' @ [141:56] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'param' @ [142:25] ==> val param: (TypeParameterDescriptor..TypeParameterDescriptor?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'variance' @ [142:31] ==> public final val TypeParameterDescriptor.variance: Variance[MyPropertyDescriptor]

'OUT_VARIANCE' @ [142:52] ==> enum entry OUT_VARIANCE defined in org.jetbrains.kotlin.types.Variance[FakeCallableDescriptorForObject]

'TypeProjectionImpl' @ [142:68] ==> public constructor TypeProjectionImpl(@NotNull p0: Variance, @NotNull p1: KotlinType) defined in org.jetbrains.kotlin.types.TypeProjectionImpl[JavaClassConstructorDescriptor]

'arg' @ [143:33] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'projectionKind' @ [143:37] ==> public final val TypeProjection.projectionKind: Variance[MyPropertyDescriptor]

'arg' @ [144:33] ==> val arg: TypeProjection defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>.<anonymous>[LocalVariableDescriptor]

'type' @ [144:37] ==> public final val TypeProjection.type: KotlinType[MyPropertyDescriptor]

'approximateWithResolvableType' @ [144:42] ==> public fun KotlinType.approximateWithResolvableType(scope: LexicalScope?, checkTypeParameters: Boolean): KotlinType defined in org.jetbrains.kotlin.idea.util in file TypeUtils.kt[SimpleFunctionDescriptorImpl]

'scope' @ [144:72] ==> value-parameter scope: LexicalScope? defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'checkTypeParameters' @ [144:79] ==> value-parameter checkTypeParameters: Boolean defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations[ValueParameterDescriptorImpl]

'it' @ [151:17] ==> value-parameter it: (KotlinType..KotlinType?) defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[ValueParameterDescriptorImpl]

'replace' @ [151:20] ==> @JvmOverloads public fun KotlinType.replace(newArguments: List<TypeProjection> = ..., newAnnotations: Annotations = ...): KotlinType defined in org.jetbrains.kotlin.types[DeserializedSimpleFunctionDescriptor]

'newArguments' @ [151:28] ==> val newArguments: List<TypeProjection> defined in org.jetbrains.kotlin.idea.util.getResolvableApproximations.<anonymous>[LocalVariableDescriptor]

'constructor' @ [156:21] ==> public abstract val constructor: TypeConstructor defined in org.jetbrains.kotlin.types.KotlinType[DeserializedPropertyDescriptor]

'declarationDescriptor' @ [156:33] ==> public final val TypeConstructor.declarationDescriptor: ClassifierDescriptor?[MyPropertyDescriptor]

'modality' @ [156:77] ==> public final val ClassDescriptor.modality: Modality[MyPropertyDescriptor]

'modality' @ [157:12] ==> val modality: Modality? defined in org.jetbrains.kotlin.idea.util.isAbstract[LocalVariableDescriptor]

'Modality' @ [157:24] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'ABSTRACT' @ [157:33] ==> enum entry ABSTRACT defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'modality' @ [157:45] ==> val modality: Modality? defined in org.jetbrains.kotlin.idea.util.isAbstract[LocalVariableDescriptor]

'Modality' @ [157:57] ==> public companion object defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

'SEALED' @ [157:66] ==> enum entry SEALED defined in org.jetbrains.kotlin.descriptors.Modality[FakeCallableDescriptorForObject]

